import static gregtech.api.GTValues.*

import static util.GroovyUtil.*

log.info("Starting to load MoreFurnaces Recipes...")

/* -------------------------------------------------------------------------- */
def assembler = recipemap('assembler')
/* -------------------------------------------------------------------------- */

// Iron Furnace
crafting.removeByOutput(item('morefurnaces:furnaceblock'))
crafting.shapedBuilder()
    .row('hPd')
    .row('PFP')
    .row('SPS')
    .key('h', ore('toolHammer'))
    .key('d', ore('toolScrewdriver'))
    .key('F', item('minecraft:furnace'))
    .key('P', ore('plateDoubleIron'))
    .key('S', ore('screwIron'))
    .output(item('morefurnaces:furnaceblock')) // Iron Furnace
    .register()

assembler.recipeBuilder()
    .circuitMeta(4)
    .inputs(item('minecraft:furnace'))
    .inputs(ore('plateDoubleIron') * 2)
    .outputs(item('morefurnaces:furnaceblock')) // Iron Furnace
    .EUt(VA[ULV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Gold Furnace
crafting.removeByOutput(item('morefurnaces:furnaceblock', 1))
crafting.shapedBuilder()
    .row('hPd')
    .row('PFP')
    .row('SPS')
    .key('h', ore('toolHammer'))
    .key('d', ore('toolScrewdriver'))
    .key('F', item('minecraft:furnace'))
    .key('P', ore('plateDoubleGold'))
    .key('S', ore('screwGold'))
    .output(item('morefurnaces:furnaceblock', 1)) // Gold Furnace
    .register()

assembler.recipeBuilder()
    .circuitMeta(4)
    .inputs(item('minecraft:furnace'))
    .inputs(ore('plateDoubleGold') * 2)
    .outputs(item('morefurnaces:furnaceblock', 1)) // Gold Furnace
    .EUt(VA[ULV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Diamond Furnace
crafting.removeByOutput(item('morefurnaces:furnaceblock', 2))
crafting.shapedBuilder()
    .row('hPd')
    .row('PFP')
    .row('SPS')
    .key('h', ore('toolHammer'))
    .key('d', ore('toolScrewdriver'))
    .key('F', item('minecraft:furnace'))
    .key('P', ore('plateDiamond'))
    .key('S', ore('screwDiamond'))
    .output(item('morefurnaces:furnaceblock', 2)) // Diamond Furnace
    .register()

assembler.recipeBuilder()
    .circuitMeta(4)
    .inputs(item('minecraft:furnace'))
    .inputs(ore('plateDiamond') * 4)
    .outputs(item('morefurnaces:furnaceblock', 2)) // Diamond Furnace
    .EUt(VA[ULV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Obsidian Furnace
crafting.removeByOutput(item('morefurnaces:furnaceblock', 3))
crafting.shapedBuilder()
    .row('hPd')
    .row('PFP')
    .row('SPS')
    .key('h', ore('toolHammer'))
    .key('d', ore('toolScrewdriver'))
    .key('F', item('morefurnaces:furnaceblock', 2)) // Diamond Furnace
    .key('P', ore('plateObsidian'))
    .key('S', ore('screwObsidian'))
    .output(item('morefurnaces:furnaceblock', 3)) // Obsidian Furnace
    .register()

assembler.recipeBuilder()
    .circuitMeta(4)
    .inputs(item('morefurnaces:furnaceblock', 2)) // Diamond Furnace
    .inputs(ore('plateObsidian') * 4)
    .outputs(item('morefurnaces:furnaceblock', 3)) // Obsidian Furnace
    .EUt(VA[ULV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Netherrack Furnace
crafting.removeByOutput(item('morefurnaces:furnaceblock', 4))
crafting.shapedBuilder()
    .row('hPd')
    .row('PFP')
    .row('SPS')
    .key('h', ore('toolHammer'))
    .key('d', ore('toolScrewdriver'))
    .key('F', item('minecraft:furnace'))
    .key('P', ore('plateNetherrack'))
    .key('S', ore('screwStone'))
    .output(item('morefurnaces:furnaceblock', 4)) // Netherrack Furnace
    .register()

assembler.recipeBuilder()
    .circuitMeta(4)
    .inputs(item('minecraft:furnace'))
    .inputs(ore('plateNetherrack') * 4)
    .outputs(item('morefurnaces:furnaceblock', 4)) // Netherrack Furnace
    .EUt(VA[ULV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Copper Furnace
crafting.removeByOutput(item('morefurnaces:furnaceblock', 5))
crafting.shapedBuilder()
    .row('hPd')
    .row('PFP')
    .row('SPS')
    .key('h', ore('toolHammer'))
    .key('d', ore('toolScrewdriver'))
    .key('F', item('minecraft:furnace'))
    .key('P', ore('plateDoubleCopper'))
    .key('S', ore('screwCopper'))
    .output(item('morefurnaces:furnaceblock', 5)) // Copper Furnace
    .register()

assembler.recipeBuilder()
    .circuitMeta(4)
    .inputs(item('minecraft:furnace'))
    .inputs(ore('plateDoubleCopper') * 2)
    .outputs(item('morefurnaces:furnaceblock', 5)) // Copper Furnace
    .EUt(VA[ULV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Silver Furnace
crafting.removeByOutput(item('morefurnaces:furnaceblock', 6))
crafting.shapedBuilder()
    .row('hPd')
    .row('PFP')
    .row('SPS')
    .key('h', ore('toolHammer'))
    .key('d', ore('toolScrewdriver'))
    .key('F', item('minecraft:furnace'))
    .key('P', ore('plateDoubleSilver'))
    .key('S', ore('screwSilver'))
    .output(item('morefurnaces:furnaceblock', 6)) // Silver Furnace
    .register()

assembler.recipeBuilder()
    .circuitMeta(4)
    .inputs(item('minecraft:furnace'))
    .inputs(ore('plateDoubleSilver') * 2)
    .outputs(item('morefurnaces:furnaceblock', 6)) // Silver Furnace
    .EUt(VA[ULV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Furnace Upgrade: Vanilla -> Iron
crafting.removeByOutput(item('morefurnaces:upgrade'))
crafting.shapedBuilder()
    .row('hPd')
    .row('PFP')
    .row('SPS')
    .key('h', ore('toolHammer'))
    .key('d', ore('toolScrewdriver'))
    .key('F', item('minecraft:stone'))
    .key('P', ore('plateDoubleIron'))
    .key('S', ore('screwIron'))
    .output(item('morefurnaces:upgrade')) // Furnace Upgrade: Vanilla -> Iron
    .register()

assembler.recipeBuilder()
    .circuitMeta(5)
    .inputs(item('minecraft:stone'))
    .inputs(ore('plateDoubleIron') * 2)
    .outputs(item('morefurnaces:upgrade')) // Furnace Upgrade: Vanilla -> Iron
    .EUt(VA[ULV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Furnace Upgrade: Vanilla -> Netherrack
crafting.removeByOutput(item('morefurnaces:upgrade', 1))
crafting.shapedBuilder()
    .row('hPd')
    .row('PFP')
    .row('SPS')
    .key('h', ore('toolHammer'))
    .key('d', ore('toolScrewdriver'))
    .key('F', item('minecraft:stone'))
    .key('P', ore('plateNetherrack'))
    .key('S', ore('screwStone'))
    .output(item('morefurnaces:upgrade', 1)) // Furnace Upgrade: Vanilla -> Netherack
    .register()

assembler.recipeBuilder()
    .circuitMeta(5)
    .inputs(item('minecraft:stone'))
    .inputs(ore('plateNetherrack') * 4)
    .outputs(item('morefurnaces:upgrade', 1)) // Furnace Upgrade: Vanilla -> Netherrack
    .EUt(VA[ULV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister() 

// Furnace Upgrade: Iron -> Gold
crafting.removeByOutput(item('morefurnaces:upgrade', 2))
crafting.shapedBuilder()
    .row('hPd')
    .row('PFP')
    .row('SPS')
    .key('h', ore('toolHammer'))
    .key('d', ore('toolScrewdriver'))
    .key('F', ore('plateIron'))
    .key('P', ore('plateDoubleGold'))
    .key('S', ore('screwGold'))
    .output(item('morefurnaces:upgrade', 2)) // Furnace Upgrade: Iron -> Gold
    .register()

assembler.recipeBuilder()
    .circuitMeta(5)
    .inputs(ore('plateIron'))
    .inputs(ore('plateDoubleGold') * 2)
    .outputs(item('morefurnaces:upgrade', 2)) // Furnace Upgrade: Iron -> Gold
    .EUt(VA[ULV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()
    
// Furnace Upgrade: Iron -> Obsidian
crafting.removeByOutput(item('morefurnaces:upgrade', 3))
crafting.shapedBuilder()
    .row('hPd')
    .row('PFP')
    .row('SPS')
    .key('h', ore('toolHammer'))
    .key('d', ore('toolScrewdriver'))
    .key('F', ore('plateDiamond'))
    .key('P', ore('plateObsidian'))
    .key('S', ore('screwObsidian'))
    .output(item('morefurnaces:upgrade', 3)) // Furnace Upgrade: Iron -> Obsidian
    .register()

assembler.recipeBuilder()
    .circuitMeta(5)
    .inputs(ore('plateDiamond'))
    .inputs(ore('plateObsidian') * 4)
    .outputs(item('morefurnaces:upgrade', 3)) // Furnace Upgrade: Iron -> Obsidian
    .EUt(VA[ULV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Furnace Upgrade: Gold -> Diamond
crafting.removeByOutput(item('morefurnaces:upgrade', 4))
crafting.shapedBuilder()
    .row('hPd')
    .row('PFP')
    .row('SPS')
    .key('h', ore('toolHammer'))
    .key('d', ore('toolScrewdriver'))
    .key('F', ore('plateGold'))
    .key('P', ore('plateDiamond'))
    .key('S', ore('screwDiamond'))
    .output(item('morefurnaces:upgrade', 4)) // Furnace Upgrade: Gold -> Diamond
    .register()

assembler.recipeBuilder()
    .circuitMeta(5)
    .inputs(ore('plateGold'))
    .inputs(ore('plateDiamond') * 4)
    .outputs(item('morefurnaces:upgrade', 4)) // Furnace Upgrade: Gold -> Diamond
    .EUt(VA[ULV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Furnace Upgrade: Copper -> Silver
crafting.removeByOutput(item('morefurnaces:upgrade', 5))
crafting.shapedBuilder()
    .row('hPd')
    .row('PFP')
    .row('SPS')
    .key('h', ore('toolHammer'))
    .key('d', ore('toolScrewdriver'))
    .key('F', ore('plateCopper'))
    .key('P', ore('plateDoubleSilver'))
    .key('S', ore('screwSilver'))
    .output(item('morefurnaces:upgrade', 5)) // Furnace Upgrade: Copper -> Silver
    .register()

assembler.recipeBuilder()
    .circuitMeta(5)
    .inputs(ore('plateCopper'))
    .inputs(ore('plateDoubleSilver') * 2)
    .outputs(item('morefurnaces:upgrade', 5)) // Furnace Upgrade: Copper -> Silver
    .EUt(VA[ULV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Furnace Upgrade: Iron -> Silver
crafting.removeByOutput(item('morefurnaces:upgrade', 6))
crafting.shapedBuilder()
    .row('hPd')
    .row('PFP')
    .row('SPS')
    .key('h', ore('toolHammer'))
    .key('d', ore('toolScrewdriver'))
    .key('F', ore('plateIron'))
    .key('P', ore('plateDoubleSilver'))
    .key('S', ore('screwSilver'))
    .output(item('morefurnaces:upgrade', 6)) // Furnace Upgrade: Iron -> Silver
    .register()

assembler.recipeBuilder()
    .circuitMeta(5)
    .inputs(ore('plateIron'))
    .inputs(ore('plateDoubleSilver') * 2)
    .outputs(item('morefurnaces:upgrade', 6)) // Furnace Upgrade: Iron -> Silver
    .EUt(VA[ULV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Furnace Upgrade: Vanilla -> Copper
crafting.removeByOutput(item('morefurnaces:upgrade', 7))
crafting.shapedBuilder()
    .row('hPd')
    .row('PFP')
    .row('SPS')
    .key('h', ore('toolHammer'))
    .key('d', ore('toolScrewdriver'))
    .key('F', item('minecraft:stone'))
    .key('P', ore('plateDoubleCopper'))
    .key('S', ore('screwCopper'))
    .output(item('morefurnaces:upgrade', 7)) // Furnace Upgrade: Vanilla -> Copper
    .register()

assembler.recipeBuilder()
    .circuitMeta(5)
    .inputs(item('minecraft:stone'))
    .inputs(ore('plateDoubleCopper') * 2)
    .outputs(item('morefurnaces:upgrade', 7)) // Furnace Upgrade: Vanilla -> Copper
    .EUt(VA[ULV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()