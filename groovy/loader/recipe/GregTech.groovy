import static gregtech.api.GTValues.*

import static util.GroovyUtil.*

log.info("Starting to load GregTech Recipes...")

/* -------------------------------------------------------------------------- */
def assembler = recipemap('assembler')
def lathe = recipemap('lathe')
/* -------------------------------------------------------------------------- */

// Obsidian Stick
lathe.recipeBuilder()
    .inputs(item('minecraft:obsidian'))
    .outputs(metaitem('stickObsidian') * 2)
    .EUt(7) // ULV
    .duration(2 * SECOND)
    .buildAndRegister()

// Redstone Plate
crafting.addShapeless(metaitem('plateRedstone'),
    [ore('toolRollingPin'), ore('dustRedstone')])

// Diamond Gear
assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('plateDiamond') * 4)
    .inputs(ore('stickDiamond') * 4)
    .fluidInputs(fluid('glue') * 250)
    .outputs(metaitem('gearDiamond'))
    .EUt(VA[LV])
    .duration(2 * SECOND)
    .buildAndRegister()

// Crafting Station
crafting.shapedBuilder()
    .name(resource('gtlite:workbench'))
    .shape('CSC',
           'PWP',
           'PTP')
    .key('W', item('craftingstation:crafting_station'))
    .key('S', ore('slabWood'))
    .key('P', ore('plankWood'))
    .key('C', item('minecraft:chest'))
    .key('T', ore('toolSaw'))
    .output(metaitem('workbench'))
    .register()
