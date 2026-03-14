#!/usr/bin/env bash

set -euo pipefail

artifact_base="${1:?missing artifact base}"

mkdir -p dist

curseforge_zip="dist/${artifact_base}-curseforge.zip"

packwiz curseforge export -o "$curseforge_zip"

echo "curseforge_zip=$curseforge_zip" >> "$GITHUB_OUTPUT"
