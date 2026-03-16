#!/usr/bin/env bash
set -euo pipefail

# Resolve the previous nightly tag position for incremental changelog.
# Falls back to the latest stable (v*) tag if nightly tag does not exist.
prev_sha=""
compare_base=""

if git rev-parse nightly >/dev/null 2>&1; then
    prev_sha=$(git rev-parse nightly)
fi

if [ -n "$prev_sha" ] && [ "$prev_sha" != "$GITHUB_SHA" ]; then
    compare_base="$prev_sha"
else
    last_tag=$(git describe --tags --abbrev=0 --match='v*' 2>/dev/null || true)
    if [ -n "$last_tag" ]; then
        compare_base="$last_tag"
    fi
fi

if [ -n "$compare_base" ]; then
    changelog=$(git log --pretty=format:"- %s (%h)" "${compare_base}..HEAD")
    compare_url="https://github.com/${GITHUB_REPOSITORY}/compare/${compare_base}...${GITHUB_SHA}"
else
    changelog="- Initial nightly build"
    compare_url=""
fi

{
    echo "body<<BODY_EOF"
    echo "## Nightly \`${SHORT_SHA}\`"
    echo ""
    echo "**Date:** $(date -u '+%Y-%m-%d %H:%M UTC')"
    echo "**Commit:** ${GITHUB_SHA}"
    [ -n "$compare_url" ] && echo "**Changes:** [compare](${compare_url})"
    echo ""
    echo "### What's Changed"
    echo "$changelog"
    echo "BODY_EOF"
} >> "$GITHUB_OUTPUT"
