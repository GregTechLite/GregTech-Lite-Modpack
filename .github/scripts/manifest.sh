#!/usr/bin/env bash

set -euo pipefail

pages_path="${1:?missing pages path}"
pages_dir="dist/pages"
target_dir="${pages_dir}/${pages_path}"

mkdir -p "$target_dir"
cp pack.toml index.toml "$target_dir/"

while IFS= read -r tracked_file; do
    [ -n "$tracked_file" ] || continue
    mkdir -p "${target_dir}/$(dirname "$tracked_file")"
    cp "$tracked_file" "${target_dir}/$tracked_file"
done < <(tomlq -r '.files[].file' < index.toml)

echo "pages_dir=$pages_dir" >> "$GITHUB_OUTPUT"
