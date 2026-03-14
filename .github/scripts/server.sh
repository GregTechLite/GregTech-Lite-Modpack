#!/usr/bin/env bash

set -euo pipefail

artifact_base="${1:?missing artifact base}"
pack_url="${2:?missing pack url}"
template_dir=".github/templates"

forge_id="${MINECRAFT_VERSION}-${FORGE_VERSION}"
forge_installer_url="https://maven.minecraftforge.net/net/minecraftforge/forge/${forge_id}/forge-${forge_id}-installer.jar"
bootstrap_url="https://github.com/packwiz/packwiz-installer-bootstrap/releases/latest/download/packwiz-installer-bootstrap.jar"
vanilla_package=".#minecraft_server_${MINECRAFT_VERSION//./_}"

server_dir="dist/${artifact_base}-server"
server_zip="dist/${artifact_base}-server.zip"

rm -rf "$server_dir" "$server_zip"
mkdir -p "$server_dir"

vanilla_out="$(nix build --print-out-paths --no-link "$vanilla_package")"
vanilla_jar="${vanilla_out}/lib/minecraft/server.jar"

if [ ! -f "$vanilla_jar" ]; then
    vanilla_jar="$(find "$vanilla_out" -type f -name '*.jar' | head -n 1)"
fi

if [ -z "${vanilla_jar:-}" ] || [ ! -f "$vanilla_jar" ]; then
    echo >&2 "Could not find vanilla server jar in ${vanilla_out}"
    exit 1
fi

cp "$vanilla_jar" "$server_dir/minecraft_server.${MINECRAFT_VERSION}.jar"
curl -fsSL "$forge_installer_url" -o "$server_dir/forge-${forge_id}-installer.jar"
curl -fsSL "$bootstrap_url" -o "$server_dir/packwiz-installer-bootstrap.jar"

pushd "$server_dir" > /dev/null
java -jar "forge-${forge_id}-installer.jar" --installServer
popd > /dev/null

rm -f "$server_dir/forge-${forge_id}-installer.jar" "$server_dir/forge-${forge_id}-installer.jar.log"
forge_jar="$(find "$server_dir" -maxdepth 1 -type f -name "forge-${forge_id}*.jar" ! -name '*installer*' | sort | head -n 1)"

if [ -z "$forge_jar" ]; then
    echo >&2 "Forge server jar not found in ${server_dir}"
    exit 1
fi

forge_jar="${forge_jar##*/}"

sed \
    -e "s|@PACK_URL@|${pack_url}|g" \
    -e "s|@FORGE_JAR@|${forge_jar}|g" \
    "$template_dir/start.sh.in" > "$server_dir/start.sh"

sed \
    -e "s|@PACK_URL@|${pack_url}|g" \
    -e "s|@FORGE_JAR@|${forge_jar}|g" \
    "$template_dir/start.bat.in" > "$server_dir/start.bat"

cp "$template_dir/eula.txt" "$server_dir/eula.txt"

sed \
    -e "s|@ARTIFACT_BASE@|${artifact_base}|g" \
    -e "s|@PACK_URL@|${pack_url}|g" \
    "$template_dir/README.txt.in" > "$server_dir/README.txt"

chmod +x "$server_dir/start.sh"

(
    cd dist
    zip -qr "$(basename "$server_zip")" "$(basename "$server_dir")"
)

echo "server_zip=$server_zip" >> "$GITHUB_OUTPUT"
