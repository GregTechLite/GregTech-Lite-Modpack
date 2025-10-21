# 格雷科技精简版整合包配置修改

[**中文**](/docs/i18n/zh_cn/gtlite-modpack-configs.md) | [**英文**](/docs/gtlite-modpack-configs.md)

## 一般配置

| 模组名                        | 路径                                     | 描述                                              |
|----------------------------|----------------------------------------|-------------------------------------------------|
| Better Questing Unofficial | `config/betterquesting.cfg`            | 提供默认的主题，格式与缩放尺寸设置。                              |
| Chisel                     | `config/chisel.cfg`                    | 禁用大理石，石灰岩，玄武岩与其的世界生成（因为其他模组添加了它们）。              |
| Custom Loading Screen      | `config/customloadingscreen.cfg`       | 提高加载界面的最大FPS并为其添加模板。                            |
| Fluid Drawers              | `config/fluiddrawers.cfg`              | 将流体抽屉的基础储存量从 32,000L 提高至 64,000L。               |
| Censored ASM               | `config/loliasm.cfg`                   | 关闭与 Stellar Core 模组冲突的优化选项。                     |
| Morfonica in Minecraft     | `config/morfonica.cfg`                 | 关闭所有方块的默认配方。                                    |
| Pick Up Notifier           | `config/pickupnotifier.cfg`            | 略微增加显示的字体尺寸大小以适配 Smooth Fonts 模组。               |
| Project Red                | `config/ProjectRed.cfg`                | 关闭所有矿石的世界生成。                                    |
| Simple Trophies            | `config/simple_trophies.cfg`           | 增加自定义的游戏目标奖杯。                                   |
| Stellar Core               | `config/stellar_core.cfg`              | 增加自定义的游戏窗口标题；关于与 EnderIO Continuous 模组不兼容的优化选项。 |
| The One Probe              | `config/theoneprobe.cfg`               | 增加自定义的检测器格式并令内部存储与流体显示始终可见。                     |
| TOP Addons                 | `config/topaddons.cfg`                 | 一些格式与选项修改。                                      |
|                            | `config/topaddons_client.cfg`          | 一些仅客户端的格式与选项修改。                                 |
| Universal Tweaks           | `config/Universal Tweaks - Tweaks.cfg` | 关闭 Minecraft 原版的配方书以与 GroovyScript 模组新增的配方兼容。   |

## 模组特限配置

| 模组名                        | 路径                                                   | 描述                                                             |
|----------------------------|------------------------------------------------------|----------------------------------------------------------------|
| Applied Energistics 2      | `config/AppliedEnergistics2/AppliedEnergistics2.cfg` | 关闭频道与所有机器（并使用 GroovyScript 模组添加了对应的 GT 机器配方，面粉，末影珍珠粉与一些不必要的材料。 |
| Better Questing Unofficial | `config/betterquesting/*`                            | 所有任务线与任务书文本。                                                   |
| Bogo Sorter                | `config/bogosorter/orePrefix.json`                   | 对 Bogo Sorter 模组的额外矿物前缀排序支持。                                   |
| Custom Loading Screen      | `config/customloadingscreen/example.json`            | 加载界面的默认模板（由 Resource Loader 模组提供材质加载支持）。                       |
| EnderIO Continuous         | `config/enderio/enderio.cfg`                         | 关闭基岩粉世界合成与所有 XML 配方加载（以 GroovyScript 模组添加配方替代）。                |
| GregTech CEu               | `config/gregtech/worldgen/*`                         | 支持由 GregTech Lite Core 模组提供的矿脉与虚拟流体。                           |
|                            | `config/gregtech/gregtech.cfg`                       | 增加纳米剑的基础攻击力；关闭一部分硬核配方与机器爆炸设定；开启高阶段内容与太阳能；调高矿脉生成的基础数量。          |
| Scaling GUIs               | `config/ScalingGUIs/ScalingGUIs.cfg`                 | 提供默认的GUI尺寸支持。                                                  |
| Smooth Fonts               | `config/smoothfont/smoothfont.cfg`                   | 提供自定义字体支持（从外部文件夹加载）。                                           |
