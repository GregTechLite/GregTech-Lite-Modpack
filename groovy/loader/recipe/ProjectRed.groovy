import static gregtech.api.GTValues.*

import static util.GroovyUtil.*

log.info("Starting to load ProjectRed Recipes...")

/* -------------------------------------------------------------------------- */
def assembler = recipemap('assembler')
def laser_engraver = recipemap('laser_engraver')
def polarizer = recipemap('polarizer')
/* -------------------------------------------------------------------------- */

// Circuit Board
furnace.removeByOutput(item('projectred-core:resource_item') * 2)
furnace.add(item('gregtech:meta_plate', 1599), item('projectred-core:resource_item') * 2)

// Silicon Chip
crafting.removeByOutput(item('projectred-core:resource_item', 20))
crafting.shapedBuilder()
    .row('   ')
    .row(' S ')
    .row('BBB')
    .key('B', item('projectred-core:resource_item')) // Circuit Board
    .key('S', ore('dustSilicon'))
    .output(item('projectred-core:resource_item', 20) * 4) // Silicon Chip
    .register()

laser_engraver.recipeBuilder()
    .notConsumable(ore('craftingLensRed'))
    .inputs(item('projectred-core:resource_item')) // Circuit Board
    .outputs(item('projectred-core:resource_item', 20) * 4) // Silicon Chip
    .EUt(VA[LV].toLong())
    .duration(5 * SECOND)
    .buildAndRegister()

// Energized Silicon Chip
crafting.removeByOutput(item('projectred-core:resource_item', 21))
polarizer.recipeBuilder()
    .inputs(item('projectred-core:resource_item', 20)) // Silicon Chip
    .outputs(item('projectred-core:resource_item', 21)) // Energized Silicon Chip
    .EUt(7) // ULV
    .duration(2 * SECOND)
    .buildAndRegister()

// IC Chip
crafting.removeByOutput(item('projectred-fabrication:ic_chip'))
laser_engraver.recipeBuilder()
    .notConsumable(ore('craftingLensBlue'))
    .inputs(ore('circuitUlv'))
    .outputs(item('projectred-fabrication:ic_chip'))
    .EUt(VA[LV].toLong())
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// IC Workbench
crafting.removeByOutput(item('projectred-fabrication:ic_machine'))
crafting.shapedBuilder()
    .row('PSP')
    .row('AWA')
    .row('A A')
    .key('P', ore('plateSteel'))
    .key('A', ore('stickSteel'))
    .key('W', item('gregtech:mte', 1647)) // Workbench (GregTech)
    .key('S', item('gregtech:meta_item_1', 307)) // Screen Cover
    .output(item('projectred-fabrication:ic_machine'))
    .register()

assembler.recipeBuilder()
    .circuitMeta(13)
    .inputs(item('gregtech:mte', 1647)) // Workbench (GregTech)
    .inputs(item('gregtech:meta_item_1', 307)) // Screen Cover
    .inputs(ore('plateSteel') * 2)
    .inputs(ore('stickSteel') * 4)
    .outputs(item('projectred-fabrication:ic_machine'))
    .EUt(VH[LV].toLong())
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// IC Printer
crafting.removeByOutput(item('projectred-fabrication:ic_machine', 1))
crafting.shapedBuilder()
    .row('GGG')
    .row('CHR')
    .row('PwP')
    .key('C', item('gregtech:meta_item_1', 157)) // LV Conveyor Module
    .key('R', item('gregtech:meta_item_1', 187)) // LV Robotic Arm
    .key('H', item('minecraft:bookshelf'))
    .key('G', item('minecraft:glass'))
    .key('P', ore('plankWood'))
    .key('w', ore('toolWrench'))
    .output(item('projectred-fabrication:ic_machine', 1))
    .register()

assembler.recipeBuilder()
    .circuitMeta(13)
    .inputs(item('minecraft:bookshelf'))
    .inputs(item('minecraft:glass') * 3)
    .inputs(item('gregtech:meta_item_1', 157)) // LV Conveyor Module
    .inputs(item('gregtech:meta_item_1', 187)) // LV Robotic Arm
    .inputs(ore('plankWood') * 2)
    .outputs(item('projectred-fabrication:ic_machine', 1))
    .EUt(VH[LV].toLong())
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Screwdriver
crafting.removeByOutput(item('projectred-core:screwdriver'))
crafting.shapedBuilder()
    .row(' fS')
    .row(' Sh')
    .row('T  ')
    .key('S', ore('stickIron'))
    .key('T', ore('stickLapis'))
    .key('f', ore('toolFile'))
    .key('h', ore('toolHammer'))
    .output(item('projectred-core:screwdriver'))
    .register()

// Multimeter
crafting.removeByOutput(item('projectred-core:multimeter'))
crafting.shapedBuilder()
    .row('RxR')
    .row('PBP')
    .row('SwS')
    .key('B', item('gregtech:meta_item_1', 717)) // LV Battery Hull
    .key('P', ore('plateIron'))
    .key('S', ore('screwIronMagnetic'))
    .key('R', ore('springSmallRedAlloy'))
    .key('x', ore('toolWireCutter'))
    .key('w', ore('toolWrench'))
    .output(item('projectred-core:multimeter'))
    .register()