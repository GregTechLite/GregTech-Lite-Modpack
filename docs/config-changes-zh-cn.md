# 整合包所包括的配置

## 模组文件夹下的配置文件修改
| 配置路径                                                 | 描述                                                                                           |
|------------------------------------------------------|----------------------------------------------------------------------------------------------|
| `config/AppliedEnergistics2/AppliedEnergistics2.cfg` | 关闭频道设定，关闭本体机器（以GrS添加的对应材料的GT机器配方为替代），关闭面粉，末影珍珠粉等不必要的材料。计划对GTCEu与litecore新增的模具/模头添加非阻挡物品配置支持。 |
| `config/betterquesting/*`                            | 用于存储任务书的任务线，页面与诸多相关的数据，计划之后对任务书页面与任务线标题支持本地化。                                                |
| `config/bogosorter/orePrefix.json`                   | 排序的矿物辞典支持，计划之后添加litecore新增的orePrefix的支持。                                                     |
| `config/customloadingscreen/example.json`            | 加载界面的基本模板，材质由ResourceLoader模组配合resources中的材质文件载入。                                            |
| `config/enderio/enderio.cfg`                         | 禁止所有的基岩粉世界合成方式，禁止所有XML配方被加载（所有配方均由GrS重写）。                                                    |
| `config/gregtech/worldgen/*`                         | 提供对litecore适配的矿脉与虚拟流体支持。                                                                     |
| `config/gregtech/gregtech.cfg`                       | 禁用部分困难合成表，禁用机器爆炸，禁用；上调纳米剑伤害；开启UHV+内容，IV-UV太阳能板；增加矿脉生成率和区块基础矿脉生成数量。                           |
| `config/ScalingGUIs/ScalingGUIs.cfg`                 | 提供默认的界面与GUI尺寸设置，默认值为3，3，3。                                                                   |
| `config/smoothfont/smoothfont.cfg`                   | 提供字体形式设置与整合包默认子同日设置，从fontfiles文件夹中载入字体文件。                                                    |

## 整体配置文件夹下的配置文件修改
| 配置路径                                   | 描述                                           |
|----------------------------------------|----------------------------------------------|
| `config/betterquesting.cfg`            | 设置任务书的默认格式，缩放与主题。                            |
| `config/chisel.cfg`                    | 禁用凿子生成的大理石，石灰岩与玄武岩，因为litecore和gtceu提供了相同的方块。 |
| `config/customloadingscreen.cfg`       | 调高加载页面的帧率，载入默认模板。                            |
| `config/fluiddrawers.cfg`              | 上调储液抽屉的基础储量至64000。                           |
| `config/loliasm.cfg`                   | 关闭与Stellar Core模组冲突的优化选项。                    |
| `config/morfonica.cfg`                 | 关闭了默认合成表。                                    |
| `config/pickupnotifier.cfg`            | 略微增大显示的信息的字体以适配Smooth Fonts模组。               |
| `config/ProjectRed.cfg`                | 关闭了所有矿石的世界生成。                                |
| `config/simple_trophies.cfg`           | 包括所有整合包自定义奖杯的数据。                             |
| `config/stellar_core.cfg`              | 自定义整合包游戏窗口的标题，关闭了与EnderIO Continuous冲突的优化选项。 |
| `config/theoneprobe.cfg`               | 稍微调整了检测器的形式，使其默认显示容器内容物与流体。                  |
| `config/topaddons.cfg`                 | 同上。                                          |
| `config/topaddons_client.cfg`          | 同上。                                          |
| `config/Universal Tweaks - Tweaks.cfg` | 关闭了原版的合成书以避免与GrS添加的配方的兼容性问题。                 |