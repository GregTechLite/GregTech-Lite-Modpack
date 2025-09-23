import static gregtech.api.GTValues.*

import static util.GroovyUtil.*

log.info("Starting to load Translocators Recipes...")

/* -------------------------------------------------------------------------- */
def alloy_smelter = recipemap('alloy_smelter')
/* -------------------------------------------------------------------------- */

// Diamond nugget
crafting.remove('translocators:diamond_nugget')
alloy_smelter.recipeBuilder()
    .notConsumable(metaitem('shape.mold.nugget'))
    .inputs(ore('gemDiamond'))
    .outputs(item('translocators:diamond_nugget') * 9)
    .EUt(7) // ULV
    .duration(6 * SECOND + 10 * TICK)
    .buildAndRegister()

// Item Translocator
crafting.shapedBuilder()
    .name(resource('translocators:item_translocator'))
    .replaceByName()
    .shape('   ',
           'PCP',
           'RQR')
    .key('C', item('minecraft:chest'))
    .key('P', ore('plateIron'))
    .key('Q', ore('plateGold'))
    .key('R', ore('ringIron'))
    .output(item('translocators:translocator_part') * 2)
    .register()

// Fluid Translocator
crafting.shapedBuilder()
    .name(resource('translocators:fluid_translocator'))
    .replaceByName()
    .shape('   ',
           'PCP',
           'RQR')
    .key('C', item('minecraft:bucket'))
    .key('P', ore('plateCopper'))
    .key('Q', ore('plateSilver'))
    .key('R', ore('ringCopper'))
    .output(item('translocators:translocator_part', 1) * 2)
    .register()