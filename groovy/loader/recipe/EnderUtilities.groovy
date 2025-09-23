import static gregtech.api.GTValues.*

import static util.GroovyUtil.*

log.info("Starting to load EnderUtilities Recipes...")

/* -------------------------------------------------------------------------- */
def ender_alloy = item('enderutilities:enderpart')
def enhanced_ender_alloy = item('enderutilities:enderpart', 1)
def advanced_ender_alloy = item('enderutilities:enderpart', 2)

def inactive_ender_core = item('enderutilities:enderpart', 10)
def inactive_enhanced_ender_core = item('enderutilities:enderpart', 11)
def inactive_advanced_ender_core = item('enderutilities:enderpart', 12)

def active_ender_core = item('enderutilities:enderpart', 15)
def active_enhanced_ender_core = item('enderutilities:enderpart', 16)
def active_advanced_ender_core = item('enderutilities:enderpart', 17)

def ender_infused_stick = item('enderutilities:enderpart', 20)
def ender_rope = item('enderutilities:enderpart', 21)
/* -------------------------------------------------------------------------- */
def alloy_smelter = recipemap('alloy_smelter')
def assembler = recipemap('assembler')
def extruder = recipemap('extruder')
def lathe = recipemap('lathe')
def wiremill = recipemap('wiremill')
def vacuum_chamber = recipemap('vacuum_chamber')
/* -------------------------------------------------------------------------- */

// Ender Alloy (Basic)
crafting.removeByOutput(ender_alloy)
alloy_smelter.recipeBuilder()
    .inputs(ore('ingotIron'))
    .inputs(ore('gemEnderPearl'))
    .outputs(ender_alloy * 2)
    .EUt(VA[LV])
    .duration(4 * SECOND)
    .buildAndRegister()

alloy_smelter.recipeBuilder()
    .inputs(ore('ingotIron'))
    .inputs(ore('dustEnderPearl'))
    .outputs(ender_alloy * 2)
    .EUt(VA[LV])
    .duration(4 * SECOND)
    .buildAndRegister()

alloy_smelter.recipeBuilder()
    .inputs(ore('dustIron'))
    .inputs(ore('gemEnderPearl'))
    .outputs(ender_alloy * 2)
    .EUt(VA[LV])
    .duration(4 * SECOND)
    .buildAndRegister()

alloy_smelter.recipeBuilder()
    .inputs(ore('dustIron'))
    .inputs(ore('dustEnderPearl'))
    .outputs(ender_alloy * 2)
    .EUt(VA[LV])
    .duration(4 * SECOND)
    .buildAndRegister()

// Ender Alloy (Enhanced)
crafting.removeByOutput(enhanced_ender_alloy)
alloy_smelter.recipeBuilder()
    .inputs(ore('ingotSteel'))
    .inputs(ore('gemEnderPearl'))
    .outputs(enhanced_ender_alloy * 2)
    .EUt(VA[LV])
    .duration(4 * SECOND)
    .buildAndRegister()

alloy_smelter.recipeBuilder()
    .inputs(ore('ingotSteel'))
    .inputs(ore('dustEnderPearl'))
    .outputs(enhanced_ender_alloy * 2)
    .EUt(VA[LV])
    .duration(4 * SECOND)
    .buildAndRegister()

alloy_smelter.recipeBuilder()
    .inputs(ore('dustSteel'))
    .inputs(ore('gemEnderPearl'))
    .outputs(enhanced_ender_alloy * 2)
    .EUt(VA[LV])
    .duration(4 * SECOND)
    .buildAndRegister()

alloy_smelter.recipeBuilder()
    .inputs(ore('dustSteel'))
    .inputs(ore('dustEnderPearl'))
    .outputs(enhanced_ender_alloy * 2)
    .EUt(VA[LV])
    .duration(4 * SECOND)
    .buildAndRegister()

// Ender Alloy (Advanced)
crafting.removeByOutput(advanced_ender_alloy)
alloy_smelter.recipeBuilder()
    .inputs(ore('ingotAluminium'))
    .inputs(ore('gemEnderPearl'))
    .outputs(advanced_ender_alloy * 2)
    .EUt(VA[LV])
    .duration(4 * SECOND)
    .buildAndRegister()

alloy_smelter.recipeBuilder()
    .inputs(ore('ingotAluminium'))
    .inputs(ore('dustEnderPearl'))
    .outputs(advanced_ender_alloy * 2)
    .EUt(VA[LV])
    .duration(4 * SECOND)
    .buildAndRegister()

alloy_smelter.recipeBuilder()
    .inputs(ore('dustAluminium'))
    .inputs(ore('gemEnderPearl'))
    .outputs(advanced_ender_alloy * 2)
    .EUt(VA[LV])
    .duration(4 * SECOND)
    .buildAndRegister()

alloy_smelter.recipeBuilder()
    .inputs(ore('dustAluminium'))
    .inputs(ore('dustEnderPearl'))
    .outputs(advanced_ender_alloy * 2)
    .EUt(VA[LV])
    .duration(4 * SECOND)
    .buildAndRegister()

// Ender Infused Stick
crafting.removeByOutput(ender_infused_stick)
crafting.shapedBuilder()
    .name(resource('gtlite:ender_infused_stick_basic'))
    .shape('f  ',
           ' I ',
           '   ')
    .key('f', ore('toolFile'))
    .key('I', ender_alloy)
    .output(ender_infused_stick)
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:ender_infused_stick_enhanced'))
    .shape('f  ',
           ' I ',
           '   ')
    .key('f', ore('toolFile'))
    .key('I', enhanced_ender_alloy)
    .output(ender_infused_stick * 2)
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:ender_infused_stick_advanced'))
    .shape('f  ',
           ' I ',
           '   ')
    .key('f', ore('toolFile'))
    .key('I', advanced_ender_alloy)
    .output(ender_infused_stick * 4)
    .register()

lathe.recipeBuilder()
    .inputs(ender_alloy)
    .outputs(ender_infused_stick * 2)
    .EUt(VH[LV].toLong())
    .duration(6 * SECOND + 5 * TICK)
    .buildAndRegister()

extruder.recipeBuilder()
    .notConsumable(metaitem('shape.extruder.rod'))
    .inputs(ender_alloy)
    .outputs(ender_infused_stick * 2)
    .EUt(VA[MV])
    .duration(12 * SECOND)
    .buildAndRegister()

lathe.recipeBuilder()
    .inputs(enhanced_ender_alloy)
    .outputs(ender_infused_stick * 4)
    .EUt(VH[LV])
    .duration(6 * SECOND + 5 * TICK)
    .buildAndRegister()

extruder.recipeBuilder()
    .notConsumable(metaitem('shape.extruder.rod'))
    .inputs(enhanced_ender_alloy)
    .outputs(ender_infused_stick * 4)
    .EUt(VA[MV])
    .duration(12 * SECOND)
    .buildAndRegister()

lathe.recipeBuilder()
    .inputs(advanced_ender_alloy)
    .outputs(ender_infused_stick * 8)
    .EUt(VH[LV].toLong())
    .duration(6 * SECOND + 5 * TICK)
    .buildAndRegister()

// Ender rope
crafting.removeByOutput(ender_rope)
wiremill.recipeBuilder()
    .circuitMeta(3)
    .inputs(ender_alloy)
    .outputs(ender_rope * 8)
    .EUt(VA[ULV])
    .duration(12 * SECOND)
    .buildAndRegister()

extruder.recipeBuilder()
    .notConsumable(metaitem('shape.extruder.wire'))
    .inputs(ender_alloy)
    .outputs(ender_rope * 8)
    .EUt(VA[LV].toLong())
    .duration(3 * SECOND + 4 * TICK)
    .buildAndRegister()

wiremill.recipeBuilder()
    .circuitMeta(3)
    .inputs(enhanced_ender_alloy)
    .outputs(ender_rope * 16)
    .EUt(VA[ULV])
    .duration(12 * SECOND)
    .buildAndRegister()

extruder.recipeBuilder()
    .notConsumable(metaitem('shape.extruder.wire'))
    .inputs(enhanced_ender_alloy)
    .outputs(ender_rope * 16)
    .EUt(VA[LV])
    .duration(3 * SECOND + 4 * TICK)
    .buildAndRegister()

wiremill.recipeBuilder()
    .circuitMeta(3)
    .inputs(advanced_ender_alloy)
    .outputs(ender_rope * 32)
    .EUt(VA[ULV])
    .duration(12 * SECOND)
    .buildAndRegister()

extruder.recipeBuilder()
    .notConsumable(metaitem('shape.extruder.wire'))
    .inputs(advanced_ender_alloy)
    .outputs(ender_rope * 32)
    .EUt(VA[LV])
    .duration(3 * SECOND + 4 * TICK)
    .buildAndRegister()

// Memory Card (Misc)
crafting.removeByOutput(item('enderutilities:enderpart', 50))
crafting.shapedBuilder()
    .name(resource('gtlite:memory_card_1a'))
    .shape('   ',
           'PGP',
           'WXW')
    .key('P', item('minecraft:paper'))
    .key('G', item('minecraft:glass_pane'))
    .key('W', ore('wireFineWroughtIron'))
    .key('X', ore('circuitUlv'))
    .output(item('enderutilities:enderpart', 50) * 4) // Memory Card (Misc)
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:memory_card_1b'))
    .shape('   ',
           'PGP',
           'WXW')
    .key('P', item('minecraft:paper'))
    .key('G', ore('plateGlass'))
    .key('W', ore('wireFineWroughtIron'))
    .key('X', ore('circuitUlv'))
    .output(item('enderutilities:enderpart', 50) * 4) // Memory Card (Misc)
    .register()

assembler.recipeBuilder()
    .circuitMeta(14)
    .inputs(item('minecraft:glass_pane'))
    .inputs(item('minecraft:paper') * 2)
    .inputs(ore('circuitUlv'))
    .inputs(ore('wireFineWroughtIron') * 2)
    .outputs(item('enderutilities:enderpart', 50) * 8) // Memory Card (Misc)
    .EUt(VH[LV].toLong())
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

assembler.recipeBuilder()
    .circuitMeta(14)
    .inputs(ore('plateGlass'))
    .inputs(item('minecraft:paper') * 2)
    .inputs(ore('circuitUlv'))
    .inputs(ore('wireFineWroughtIron') * 2)
    .outputs(item('enderutilities:enderpart', 50) * 8) // Memory Card (Misc)
    .EUt(VH[LV].toLong())
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Memory Card (6b)
crafting.removeByOutput(item('enderutilities:enderpart', 51))
crafting.shapedBuilder()
    .name(resource('gtlite:memory_card_2a'))
    .shape('QXQ',
           'PGP',
           'WSW')
    .key('W', ore('wireFineSteel'))
    .key('S', ore('screwSteel'))
    .key('P', item('minecraft:paper'))
    .key('G', item('minecraft:glass_pane'))
    .key('X', ore('circuitLv'))
    .key('Q', ore('plateRedstone'))
    .output(item('enderutilities:enderpart', 51) * 4) // Memory Card (6b)
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:memory_card_2b'))
    .shape('QXQ',
           'PGP',
           'WSW')
    .key('W', ore('wireFineSteel'))
    .key('S', ore('screwSteel'))
    .key('P', item('minecraft:paper'))
    .key('G', ore('plateGlass'))
    .key('X', ore('circuitLv'))
    .key('Q', ore('plateRedstone'))
    .output(item('enderutilities:enderpart', 51) * 4) // Memory Card (6b)
    .register()

assembler.recipeBuilder()
    .circuitMeta(14)
    .inputs(item('minecraft:glass_pane'))
    .inputs(item('minecraft:paper') * 2)
    .inputs(ore('circuitLv'))
    .inputs(ore('wireFineSteel') * 2)
    .inputs(ore('screwSteel'))
    .fluidInputs(fluid('redstone') * (L * 2))
    .outputs(item('enderutilities:enderpart', 51) * 8) // Memory Card (6b)
    .EUt(VH[LV].toLong())
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

assembler.recipeBuilder()
    .circuitMeta(14)
    .inputs(ore('plateGlass'))
    .inputs(item('minecraft:paper') * 2)
    .inputs(ore('circuitLv'))
    .inputs(ore('wireFineSteel') * 2)
    .inputs(ore('screwSteel'))
    .fluidInputs(fluid('redstone') * (L * 2))
    .outputs(item('enderutilities:enderpart', 51) * 8) // Memory Card (6b)
    .EUt(VH[LV].toLong())
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

crafting.addShapeless(item('enderutilities:enderpart', 51) * 4,
    [item('enderutilities:enderpart', 52)])

// Memory Card (8b)
crafting.removeByOutput(item('enderutilities:enderpart', 52))
crafting.addShapeless(item('enderutilities:enderpart', 52),
    [item('enderutilities:enderpart', 51), item('enderutilities:enderpart', 51),
     item('enderutilities:enderpart', 51), item('enderutilities:enderpart', 51)])

crafting.addShapeless(item('enderutilities:enderpart', 52) * 4,
    [item('enderutilities:enderpart', 53)])

// Memory Card (10b)
crafting.removeByOutput(item('enderutilities:enderpart', 53))
crafting.addShapeless(item('enderutilities:enderpart', 53),
    [item('enderutilities:enderpart', 52), item('enderutilities:enderpart', 52),
     item('enderutilities:enderpart', 52), item('enderutilities:enderpart', 52)])

crafting.addShapeless(item('enderutilities:enderpart', 53) * 4,
    [item('enderutilities:enderpart', 54)])

// Memory Card (12b)
crafting.removeByOutput(item('enderutilities:enderpart', 54))
crafting.addShapeless(item('enderutilities:enderpart', 54),
    [item('enderutilities:enderpart', 54), item('enderutilities:enderpart', 54),
     item('enderutilities:enderpart', 54), item('enderutilities:enderpart', 54)])

// Handy Chest (Small)
crafting.removeByOutput(item('enderutilities:storage_0', 3))
crafting.shapedBuilder()
    .name(resource('gtlite:small_handy_chest'))
    .shape('PSP',
           'ACA',
           'PXP')
    .key('C', metaitem('crate.wood'))
    .key('P', ore('plateWroughtIron'))
    .key('A', ore('stickWroughtIron'))
    .key('S', ore('springWroughtIron'))
    .key('X', ore('circuitUlv'))
    .output(item('enderutilities:storage_0', 3)) // Handy Chest (Small)
    .register()

assembler.recipeBuilder()
    .circuitMeta(13)
    .inputs(metaitem('crate.wood'))
    .inputs(ore('plateWroughtIron') * 4)
    .inputs(ore('stickWroughtIron') * 2)
    .inputs(ore('springWroughtIron'))
    .inputs(ore('circuitUlv'))
    .outputs(item('enderutilities:storage_0', 3)) // Handy Chest (Small)
    .EUt(VH[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Handy Chest (Normal)
crafting.removeByOutput(item('enderutilities:storage_0', 4))
crafting.shapedBuilder()
    .name(resource('gtlite:normal_handy_chest'))
    .shape('PSP',
           'ACA',
           'PXP')
    .key('C', metaitem('crate.steel'))
    .key('P', ore('plateSteel'))
    .key('A', ore('stickSteel'))
    .key('S', ore('springSteel'))
    .key('X', ore('circuitLv'))
    .output(item('enderutilities:storage_0', 4)) // Handy Chest (Normal)
    .register()

assembler.recipeBuilder()
    .circuitMeta(13)
    .inputs(metaitem('crate.steel'))
    .inputs(ore('plateSteel') * 4)
    .inputs(ore('stickSteel') * 2)
    .inputs(ore('springSteel'))
    .inputs(ore('circuitLv'))
    .outputs(item('enderutilities:storage_0', 4)) // Handy Chest (Normal)
    .EUt(VH[LV].toLong())
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Handy Chest (Large)
crafting.removeByOutput(item('enderutilities:storage_0', 5))
crafting.shapedBuilder()
    .name(resource('gtlite:large_handy_chest'))
    .shape('PSP',
           'ACA',
           'PXP')
    .key('C', metaitem('crate.aluminium'))
    .key('P', ore('plateAluminium'))
    .key('A', ore('stickAluminium'))
    .key('S', ore('springAluminium'))
    .key('X', ore('circuitMv'))
    .output(item('enderutilities:storage_0', 5)) // Handy Chest (Large)
    .register()

assembler.recipeBuilder()
    .circuitMeta(13)
    .inputs(metaitem('crate.aluminium'))
    .inputs(ore('plateAluminium') * 4)
    .inputs(ore('stickAluminium') * 2)
    .inputs(ore('springAluminium'))
    .inputs(ore('circuitMv'))
    .outputs(item('enderutilities:storage_0', 5)) // Handy Chest (Large)
    .EUt(VH[LV].toLong())
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Handy Chest (Huge)
crafting.removeByOutput(item('enderutilities:storage_0', 6))
crafting.shapedBuilder()
    .name(resource('gtlite:huge_handy_chest'))
    .shape('PSP',
           'ACA',
           'PXP')
    .key('C', metaitem('crate.stainless_steel'))
    .key('P', ore('plateStainlessSteel'))
    .key('A', ore('stickStainlessSteel'))
    .key('S', ore('springStainlessSteel'))
    .key('X', ore('circuitHv'))
    .output(item('enderutilities:storage_0', 6)) // Handy Chest (Huge)
    .register()

assembler.recipeBuilder()
    .circuitMeta(13)
    .inputs(metaitem('crate.stainless_steel'))
    .inputs(ore('plateStainlessSteel') * 4)
    .inputs(ore('stickStainlessSteel') * 2)
    .inputs(ore('springStainlessSteel'))
    .inputs(ore('circuitHv'))
    .outputs(item('enderutilities:storage_0', 6)) // Handy Chest (Huge)
    .EUt(VH[LV].toLong())
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Ender Furnace
crafting.removeByOutput(item('enderutilities:machine_0'))
crafting.shapedBuilder()
    .name(resource('gtlite:ender_furnace'))
    .shape('IwI',
           'SFS',
           'ACA')
    .key('F', item('morefurnaces:furnaceblock', 3)) // Obsidian Furnace
    .key('C', item('enderutilities:enderpart', 10)) // Inactive Ender Core (Basic)
    .key('I', item('enderutilities:enderpart')) // Ender Alloy (Basic)
    .key('A', item('enderutilities:enderpart', 21)) // Ender rope
    .key('S', ore('springRedAlloy'))
    .key('w', ore('toolWrench'))
    .output(item('enderutilities:machine_0'))
    .register()

assembler.recipeBuilder()
    .circuitMeta(8)
    .inputs(item('morefurnaces:furnaceblock', 3)) // Obsidian Furnace
    .inputs(ore('springRedAlloy') * 2)
    .inputs(item('enderutilities:enderpart', 10)) // Inactive Ender Core (Basic)
    .inputs(item('enderutilities:enderpart') * 2) // Ender Alloy (Basic)
    .inputs(item('enderutilities:enderpart', 21) * 2) // Ender rope
    .outputs(item('enderutilities:machine_0'))
    .EUt(VH[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Ender Core
crafting.shapelessBuilder()
    .input([item('minecraft:end_crystal'), inactive_ender_core])
    .output(active_ender_core)
    .register()

vacuum_chamber.recipeBuilder()
    .notConsumable(item('minecraft:end_crystal'))
    .inputs(inactive_ender_core)
    .outputs(active_ender_core)
    .EUt(7) // ULV
    .duration(1 * SECOND)
    .buildAndRegister()

crafting.shapelessBuilder()
    .input([item('minecraft:end_crystal'), inactive_enhanced_ender_core])
    .output(active_enhanced_ender_core)
    .register()

vacuum_chamber.recipeBuilder()
    .notConsumable(item('minecraft:end_crystal'))
    .inputs(inactive_enhanced_ender_core)
    .outputs(active_enhanced_ender_core)
    .EUt(7) // ULV
    .duration(1 * SECOND)
    .buildAndRegister()

crafting.shapelessBuilder()
    .input([item('minecraft:end_crystal'), inactive_advanced_ender_core])
    .output(active_advanced_ender_core)
    .register()

vacuum_chamber.recipeBuilder()
    .notConsumable(item('minecraft:end_crystal'))
    .inputs(inactive_advanced_ender_core)
    .outputs(active_advanced_ender_core)
    .EUt(7) // ULV
    .duration(1 * SECOND)
    .buildAndRegister()