#!/usr/bin/env bash

set -euo pipefail

build_kind="${BUILD_KIND:?missing BUILD_KIND}"
pages_base_url="${PAGES_BASE_URL:?missing PAGES_BASE_URL}"
script_dir="$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd)"
repo_root="$(cd -- "$script_dir/../.." && pwd)"

cd "$repo_root"

pack_name="$(tomlq -r '.name' < pack.toml)"
version="$(tomlq -r '.version' < pack.toml)"
slug="$(printf '%s' "$pack_name" | tr '[:upper:]' '[:lower:]' | sed -E 's/[^a-z0-9]+/-/g; s/^-+|-+$//g')"

case "$build_kind" in
    nightly)
        asset_prefix="${slug}-nightly"
        pages_path="nightly"
        ;;
    release)
        asset_prefix="${slug}-${version}"
        pages_path="releases/${version}"
        ;;
    *)
        echo >&2 "Unsupported BUILD_KIND: $build_kind"
        exit 1
        ;;
esac

mkdir -p dist

curseforge_zip="dist/${asset_prefix}-curseforge.zip"

packwiz curseforge export -o "$curseforge_zip"
bash "$script_dir/package-server.sh" "$asset_prefix" "${pages_base_url%/}/${pages_path}/pack.toml"

echo "pack_name=$pack_name" >> "$GITHUB_OUTPUT"
echo "version=$version" >> "$GITHUB_OUTPUT"
echo "slug=$slug" >> "$GITHUB_OUTPUT"
echo "asset_prefix=$asset_prefix" >> "$GITHUB_OUTPUT"
echo "pages_path=$pages_path" >> "$GITHUB_OUTPUT"
echo "curseforge_zip=$curseforge_zip" >> "$GITHUB_OUTPUT"
