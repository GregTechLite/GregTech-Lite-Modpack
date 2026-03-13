# 方块特征

[**中文**](/docs/i18n/zh_cn/gtlite-block-attribute-api.md) | [**英文**](/docs/gtlite-block-attribute-api.md)

```mermaid
graph TD
  A[BlockVariant] --> B[BlockAttributeRegistry] <--> C[DefaultBlockAttributeRegistry]
  
  A1[GTCEu方块统计接口] --> B1[BlockAttributeRegistryWrapper]

  B[BlockAttributeRegistry] --> B1[BlockAttributeRegistryWrapper]
```