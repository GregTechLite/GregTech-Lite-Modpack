## How to calculate Post Overclocking Buffs

The general formula of the duration buff is:

$$t=\frac{d}{1 - b + bc} $$

where:
- $d$ is the original duration of each recipe request;
- $c$ is the tiered variable (such as casing tier or coil tier);
- $b$ is the increment for each tier;

For example, when $b=0.5$ (means each tier increase $50\%$ speed):

$$t=\frac{d}{1-\frac{1}{2}+\frac{1}{2}c}=\frac{d}{\frac{1}{2} + \frac{1}{2}c}=\frac{d}{\frac{1}{2}(1+c)}=\frac{2d}{1+c}$$

This is the logic of Pyrolyse Oven, here is the source code:

```java
ocResult.setDuration(Math.max(1, (int) (ocResult.duration() * 2.0 / (coilTier + 1))));
```

in this situation, we have:
- $d$ is `ocResult.duration()`;
- $t$ is the new duration which each recipe request, i.e. `ocResult.setDuration()` do;
- $b$ is $50\%$ per each coil tier increase , i.e. `0.5`;
- $c$ is the `coilTier`, means the wire coil block tier of the multiblock;