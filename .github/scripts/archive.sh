#!/usr/bin/env bash

set -euo pipefail

archive_dir="dist/archive"

mkdir -p "$archive_dir"
cp pack.toml index.toml "$archive_dir/"

while IFS= read -r archive_file; do
    [ -n "$archive_file" ] || continue
    mkdir -p "${archive_dir}/$(dirname "$archive_file")"
    cp "$archive_file" "${archive_dir}/$archive_file"
done < <(tomlq -r '.files[].file' < index.toml)
