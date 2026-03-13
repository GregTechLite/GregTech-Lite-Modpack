{
  description = "Development environment for GregTech Lite Modpack";

  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable";
    nix-minecraft.url = "github:Infinidoge/nix-minecraft";
  };

  outputs = inputs@{ nixpkgs, ... }:
    with nixpkgs.lib; let
      nixMinecraft = inputs.nix-minecraft;
      systems = [
        "x86_64-linux"
        "aarch64-linux"
      ];
      forAllSystems = f:
        genAttrs systems (system:
          f (import nixpkgs {
            inherit system;
          }));
    in
    {
      packages = forAllSystems (pkgs: {
        minecraft_server_1_12_2 = nixMinecraft.legacyPackages.${pkgs.system}.vanillaServers."vanilla-1_12_2";
      });

      devShells = forAllSystems (pkgs: {
        default = pkgs.mkShell {
          packages = with pkgs; [
            jdk8_headless
            yq
            packwiz
            zip
          ];

          shellHook = ''
            echo "Dev shell ready: packwiz, tomlq, java, zip"
          '';
        };
      });
    };
}
