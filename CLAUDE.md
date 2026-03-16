# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

GregTech Lite (GTLite) is a Minecraft 1.12.2 Forge modpack centered around GregTech CE Unofficial (GTCEu). It uses **PackWiz** for mod management and distribution, **GroovyScript** for recipe customization, and **BetterQuesting** for progression.

- Pack metadata: `pack.toml` (name, version, Minecraft/Forge versions)
- File manifest: `index.toml` (SHA256 hashes of all packed files)
- Mod definitions: `mods/*.pw.toml` (PackWiz metadata referencing CurseForge)
- Three local JARs in `mods/`: `gregtech-*.jar` (GTCEu), `gtlitecore-*.jar` (custom core mod), `morphismlib-*.jar` (dependency library)

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

**Recipe syntax patterns:**
- Machine recipes: `recipemap('assembler').recipeBuilder().inputs(...).outputs(...).duration(...).EUt(VA[LV]).buildAndRegister()`
- Crafting: `crafting.addShapeless(...)`, `crafting.shapedBuilder(...).key(...).build()`
- Item references: `metaitem('circuit.good')`, `ore('plateSteel')`, `item('minecraft:stone')`, `fluid('water')`
- Energy tiers: `VA[ULV]` through `VA[MAX]`, duration constants like `SECOND`

### Quest System (`config/betterquesting/DefaultQuests/`)

- `QuestLines/*.json` — Quest line definitions (20 lines covering LV through MAX voltage tiers)
- `Quests/<questline-id>/<quest-id>.json` — Individual quest data

Quest JSON uses a NBT-like format with type suffixes: `:2` = short, `:3` = int, `:7` = byte array, `:8` = string, `:9` = tag list, `:10` = compound tag, `:11` = int array.

### Config (`config/`)

Mod configuration files. Key ones:
- `gregtech/gregtech.cfg` — GregTech balance and features
- `AppliedEnergistics2/AppliedEnergistics2.cfg` — AE2 settings
- `betterquesting.cfg` — Quest UI and behavior

### Resources (`resources/`)

Resource pack overrides: custom textures, lang files, and JEI integration. Organized by mod namespace (e.g., `gregtech/`, `appliedenergistics2/`, `minecraft/`).

## CI/CD

Three GitHub Actions workflows (all use Nix dev shell):

- **pr.yml** ("PR Build"): Triggered on PRs to `main`. Ignores docs-only changes. Uses PR number and short SHA in artifact names (e.g., `gregtech-lite-pr42-a1b2c3d-curseforge.zip`). Concurrency groups by PR number to cancel stale builds. 3-day artifact retention.
- **nightly.yml**: Triggered on push to `main` (+ `workflow_dispatch`). Builds artifacts, deploys manifest to `GregTechLite/gregtechlite.github.io` under `nightly/`, generates changelog from git history, force-updates `nightly` tag, publishes prerelease. 7-day artifact retention.
- **release.yml**: Triggered by `v*` tags. Validates tag matches `pack.toml` version, builds artifacts, deploys manifest to `releases/{VERSION}/`, publishes GitHub Release.

### Build Scripts (`.github/scripts/`)

- `meta.sh` — Extracts metadata from `pack.toml` via `tomlq` and exports to `$GITHUB_ENV`: `NAME`, `SLUG`, `VERSION`, `MINECRAFT_VERSION`, `FORGE_VERSION`, `SHORT_SHA`
- `client.sh` — Runs `packwiz curseforge export` into `dist/`
- `server.sh` — Downloads Forge installer + packwiz-installer-bootstrap, runs Forge install, generates start scripts from `.github/templates/` (`start.sh.in`, `start.bat.in`, `eula.txt`, `README.txt.in`), creates server ZIP
- `manifest.sh` — Copies `pack.toml`, `index.toml`, and all indexed files to `dist/manifest/` for deployment
- `changelog.sh` — Generates incremental nightly changelog by diffing from previous `nightly` tag or latest `v*` tag

## File Exclusions

`.packwizignore` excludes development-only files (docs/, .github/, flake.nix, CLAUDE.md, logo.png, IDE metadata, etc.) from pack exports. Only game-relevant files ship to players.

## Licensing

- Modpack code: GNU AGPL 3.0
- Assets: CC BY-NC-SA 3.0
- Questbook content: CC BY-NC-ND 3.0
