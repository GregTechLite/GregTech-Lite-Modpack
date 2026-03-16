# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

GregTech Lite (GTLite) is a Minecraft 1.12.2 Forge modpack centered around GregTech CE Unofficial (GTCEu). It uses **PackWiz** for mod management and distribution, **GroovyScript** for recipe customization, and **BetterQuesting** for progression.

- Pack metadata: `pack.toml` (name, version, Minecraft/Forge versions)
- File manifest: `index.toml` (SHA256 hashes of all packed files)
- Mod definitions: `mods/*.pw.toml` (PackWiz metadata referencing CurseForge)
- Two local JARs in `mods/`: `gregtech-*.jar` (GTCEu) and `gtlitecore-*.jar` (custom core mod)

## Development Environment

Requires Nix. Enter the dev shell with:
```bash
nix develop
```
This provides: JDK 8, tomlq (yq), packwiz, zip.

## Common Commands

```bash
# Export CurseForge client package
packwiz curseforge export -o dist/output.zip

# Add a mod from CurseForge
packwiz curseforge install <mod-slug>

# Update a mod
packwiz update <mod-name>

# Refresh index.toml after file changes
packwiz refresh
```

## Architecture

### GroovyScript Recipes (`groovy/`)

Recipe loading is configured in `groovy/runConfig.json` with two phases:
- **preInit**: `event/` (MaterialEventHandler, TooltipEventHandler), `util/` (GroovyUtil)
- **postInit**: `loader/` — OreDictionaryLoader, `loader/hooks/`, `loader/recipe/`

Each file in `loader/recipe/` handles recipe modifications for a specific mod (e.g., `AppliedEnergistics2.groovy`, `EnderIO.groovy`, `GregTech.groovy`). All recipes are redesigned to follow GregTech's philosophy.

### Quest System (`config/betterquesting/DefaultQuests/`)

- `QuestLines/*.json` — Quest line definitions (20 lines covering LV through MAX voltage tiers)
- `Quests/<questline-id>/<quest-id>.json` — Individual quest data

Quest JSON uses a NBT-like format with type suffixes (`:3` = int, `:8` = string, `:9` = tag list, `:10` = compound tag).

### Config (`config/`)

Mod configuration files. Key ones:
- `gregtech/gregtech.cfg` — GregTech balance and features
- `AppliedEnergistics2/AppliedEnergistics2.cfg` — AE2 settings
- `betterquesting.cfg` — Quest UI and behavior

### Resources (`resources/`)

Resource pack overrides: custom textures, lang files, and JEI integration.

## CI/CD

Two GitHub Actions workflows (both use Nix dev shell):
- **release.yml**: Triggered by `v*` tags. Validates tag matches `pack.toml` version, builds client + server packages, deploys manifest to `gregtechlite.github.io`, publishes GitHub Release.
- **nightly.yml**: Triggered on push to `main`. Builds prerelease artifacts, updates `nightly` tag.

Build scripts in `.github/scripts/`:
- `meta.sh` — Extracts metadata from `pack.toml` into env vars
- `manifest.sh` — Prepares manifest directory for deployment
- `client.sh` — Runs `packwiz curseforge export`
- `server.sh` — Creates server package with Forge installer + packwiz bootstrap
- `changelog.sh` — Generates incremental nightly changelog from git history

## File Exclusions

`.packwizignore` excludes development-only files (docs/, .github/, flake.nix, logo.png, etc.) from pack exports. Only game-relevant files ship to players.

## Licensing

- Modpack code: GNU AGPL 3.0
- Assets: CC BY-NC-SA 3.0
- Questbook content: CC BY-NC-ND 3.0
