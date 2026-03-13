#!/usr/bin/env bash

set -euo pipefail

version="$(tomlq -r '.version' < pack.toml)"
slug="$(tomlq -r '.name' < pack.toml | tr '[:upper:]' '[:lower:]' | sed -E 's/[^a-z0-9]+/-/g; s/^-+|-+$//g')"
minecraft_version="$(tomlq -r '.versions.minecraft' < pack.toml)"
forge_version="$(tomlq -r '.versions.forge' < pack.toml)"

echo "VERSION=$version" >> "$GITHUB_ENV"
echo "SLUG=$slug" >> "$GITHUB_ENV"
echo "MINECRAFT_VERSION=$minecraft_version" >> "$GITHUB_ENV"
echo "FORGE_VERSION=$forge_version" >> "$GITHUB_ENV"
