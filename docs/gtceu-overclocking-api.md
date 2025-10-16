## How to calculate Post Overclocking Buffs

### For Duration Buff

The general formula of the duration buff is:

$$D'=\frac{D}{1+k(T-1)}$$

where:
- $D$ is the original duration of each recipe request;
- $T$ is the tiered variable (such as casing tier or coil tier);
- $k$ is the increment for each tier;

For example, when $k=0.5$ (means each tier increase 50% speed):

$$D'=\frac{D}{1+\frac{1}{2}(T-1)}=\frac{2D}{T+1}$$

This is the logic of Pyrolyse Oven, here is the source code:

```java
ocResult.setDuration(Math.max(1, (int) (ocResult.duration() * 2.0 / (coilTier + 1))));
```

in this situation, we have:
- $D$ is `ocResult.duration()`;
- $D'$ is the new duration which each recipe request, i.e. `ocResult.setDuration()` do;
- $k$ is 50% per each coil tier increase , i.e. 0.5;
- $T$ is the `coilTier`, means the wire coil block tier of the multiblock;

### For Energy Request Buff

This is the logic of Cracking Unit:
```java
ocResult.setEut(Math.max(1, (long) (ocResult.eut() * (1.0 - coilTier * 0.1))));
```


We just need to change the factor of it.
