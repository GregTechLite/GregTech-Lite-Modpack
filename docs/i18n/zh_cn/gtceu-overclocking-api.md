# 如何计算超频后增幅？

[**中文**](/docs/i18n/zh_cn/gtceu-overclocking-api.md) | [**英文**](/docs/gtceu-overclocking-api.md)

## 耗时减免增幅

耗时增幅的一般公式为：

$$D'=\frac{D}{1+k(T-1)}$$

其中：
- $D$ 是配方所需的原耗时；
- $T$ 是改变耗时的参数（例如外壳等级与线圈等级）；
- $k$ 是随参数变动的增幅指数。

例如，当 $k=0.5$ 时（意味着每个等级提高50%速度）：

$$D'=\frac{D}{1+\frac{1}{2}(T-1)}=\frac{2D}{T+1}$$

这是热解炉的耗时减免增幅逻辑，对应的源代码如下：

```java
ocResult.setDuration(Math.max(1, (int) (ocResult.duration() * 2.0 / (coilTier + 1))));
```

在此情况下，我们可以看到：
- $D$ 是 `ocResult.duration()`；
- $D'$ 是新的耗时，对应 `ocResult.setDuration()` 操作；
- $k$ 说明了线圈等级每高一级就快 50%，即耗时变为 0.5；
- $T$ 是 `coilTier`，即多方块的线圈等级。

## 能量消耗减免增幅

以下是石油裂化机的相关逻辑：
```java
ocResult.setEut(Math.max(1, (long) (ocResult.eut() * (1.0 - coilTier * 0.1))));
```

可以看到，我们只需要改变其中的因子即可。
