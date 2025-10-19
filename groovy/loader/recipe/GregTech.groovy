import static gregtech.api.GTValues.*

import static util.GroovyUtil.*

log.info("Starting to load GregTech Recipes...")

/* -------------------------------------------------------------------------- */
def assembler = recipemap('assembler')
def lathe = recipemap('lathe')
def alloyer = recipemap('alloy_smelter')
def mixer = recipemap('mixer')
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

//Convenient Potin
crafting.addShapeless(metaitem('dustPotin') * 8,{def recipe = [ore('dustBronze')]*9;recipe[8]=ore('dustLead');return recipe}())
mixer.recipeBuilder()
    .outputs(metaitem('dustPotin')*9)
    .inputs(ore('dustBronze')*8,ore('dustLead'))
    .EUt(7)//ULV
    .duration(20*SECOND)
    .buildAndRegister()

[[ore('dustBronze'),ore('ingotBronze')],[ore('dustLead'),ore('ingotLead')]].combinations().forEach({
    alloyer.recipeBuilder()
    .outputs(metaitem('ingotPotin')*9)
    .inputs(it[0]*8,it[1])
    .EUt(16)//LV
    .duration(10*SECOND)
    .buildAndRegister()
})
