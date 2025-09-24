# 方块适配器系统

**作者：魔法扫帚**

## 什么是方块适配器？

所谓**方块适配器**（Block Adapter）指的是一套基于**GTCEu**的元方块（MetaBlock）系统的包装与代理，这套系统简化了调用一个元方块的成本，例如：

```kotlin
// 原本的GTCEu元方块写法：
MetaBlocks.METAL_CASING.getItemVariant(BlockMetalCasing.CasingType.STEEL_SOLID)
// 方块适配器写法：
GTMetalCasing.STEEL.stack

// 原本的GTCEu元方块写法：
MetaBlocks.METAL_CASING.getState(BlockMetalCasing.CasingType.STEEL_SOLID)
// 方块适配器写法：
GTMetalCasing.STEEL.state
```

方块适配器囊括了模组本身的部分与对**GTCEu**的方块的兼容部分。

## 如何使用方块适配器？

方块适配器基于一个工厂`VariantBlockFactory`与`GTLiteBlocks`中相应的包装方法，由`VariantBlockType`决定生成模式。目前内置的模式有：
```kotlin
METAL_BLOCK // 一般的金属外壳 / 方块
METAL_CUTOUT_BLOCK // 使用cutout渲染模式的非完整金属外壳 / 方块
METAL_ACTIVE_BLOCK // 对应GTCEu的VariantActiveBlock的可定义active状态的方块
WIRE_COIL_BLOCK // GTCEu格式的线圈方块
TRANSPARENT_BLOCK // 透明方块
CRUCIBLE_BLOCK // GT6格式的坩埚方块
```

在`GTLiteBlocks`中，使用`simpleBlock`方法可以创建一个金属外壳 / 方块：
```kotlin
private inline fun <reified T, R> simpleBlock(
    name: String, 
    type: BlockVariantType): R where T : Enum<T>,
                                     T : IStringSerializable,
                                     R : VariantBlock<T>
{
    val block = VariantBlockFactory.make<T>(type)
    block.setRegistryName(name)
        .setCreativeTab(GTLiteCreativeTabs.TAB_MAIN)
        .setTranslationKey("$MOD_ID.$name")
        .setHardness(5.0f)
        .setResistance(10.0f)
    return Unchecks.cast(block)
}
```