#!/usr/bin/env bash

set -euo pipefail

asset_prefix="${1:?missing asset prefix}"
pack_url="${2:?missing pack url}"
script_dir="$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd)"
repo_root="$(cd -- "$script_dir/../.." && pwd)"
template_dir="${repo_root}/.github/templates"

cd "$repo_root"

minecraft_version="$(tomlq -r '.versions.minecraft' < pack.toml)"
forge_version="$(tomlq -r '.versions.forge' < pack.toml)"
forge_id="${minecraft_version}-${forge_version}"
forge_installer_url="https://maven.minecraftforge.net/net/minecraftforge/forge/${forge_id}/forge-${forge_id}-installer.jar"
bootstrap_url="https://github.com/packwiz/packwiz-installer-bootstrap/releases/latest/download/packwiz-installer-bootstrap.jar"
vanilla_package=".#minecraft_server_${minecraft_version//./_}"

if ! command -v java > /dev/null 2>&1; then
    echo >&2 "Missing required command: java"
    exit 127
fi

if ! command -v zip > /dev/null 2>&1; then
    echo >&2 "Missing required command: zip"
    exit 127
fi

server_dir="dist/${asset_prefix}-server"
server_zip="dist/${asset_prefix}-server.zip"

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

cp "$vanilla_jar" "$server_dir/minecraft_server.${minecraft_version}.jar"
curl -fsSL "$forge_installer_url" -o "$server_dir/forge-${forge_id}-installer.jar"
curl -fsSL "$bootstrap_url" -o "$server_dir/packwiz-installer-bootstrap.jar"

pushd "$server_dir" > /dev/null
java -jar "forge-${forge_id}-installer.jar" --installServer
popd > /dev/null

rm -f "$server_dir/forge-${forge_id}-installer.jar" "$server_dir/forge-${forge_id}-installer.jar.log"

sed \
    -e "s|@PACK_URL@|${pack_url}|g" \
    -e "s|@FORGE_ID@|${forge_id}|g" \
    "$template_dir/start.sh.in" > "$server_dir/start.sh"

sed \
    -e "s|@PACK_URL@|${pack_url}|g" \
    -e "s|@FORGE_ID@|${forge_id}|g" \
    "$template_dir/start.bat.in" > "$server_dir/start.bat"

cp "$template_dir/eula.txt" "$server_dir/eula.txt"

sed \
    -e "s|@ASSET_PREFIX@|${asset_prefix}|g" \
    -e "s|@PACK_URL@|${pack_url}|g" \
    "$template_dir/README.txt.in" > "$server_dir/README.txt"

chmod +x "$server_dir/start.sh"

(
    cd dist
    zip -qr "$(basename "$server_zip")" "$(basename "$server_dir")"
)

echo "server_zip=$server_zip" >> "$GITHUB_OUTPUT"
