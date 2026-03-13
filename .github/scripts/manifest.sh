#!/usr/bin/env bash

set -euo pipefail

manifest_dir="dist/manifest"

mkdir -p "$manifest_dir"
cp pack.toml index.toml "$manifest_dir/"

while IFS= read -r manifest_file; do
    [ -n "$manifest_file" ] || continue
    mkdir -p "${manifest_dir}/$(dirname "$manifest_file")"
    cp "$manifest_file" "${manifest_dir}/$manifest_file"
done < <(tomlq -r '.files[].file' < index.toml)
