#!/usr/bin/env bash

set -euo pipefail

name="$(tomlq -r '.name' < pack.toml)"
slug="$(printf '%s' "$name" | tr '[:upper:]' '[:lower:]' | sed -E 's/[^a-z0-9]+/-/g; s/^-+|-+$//g')"
version="$(tomlq -r '.version' < pack.toml)"
minecraft_version="$(tomlq -r '.versions.minecraft' < pack.toml)"
forge_version="$(tomlq -r '.versions.forge' < pack.toml)"
short_sha="${GITHUB_SHA::7}"

{
    echo "NAME=$name"
    echo "SLUG=$slug"
    echo "VERSION=$version"
    echo "MINECRAFT_VERSION=$minecraft_version"
    echo "FORGE_VERSION=$forge_version"
    echo "SHORT_SHA"="$short_sha"
} >> "$GITHUB_ENV"

