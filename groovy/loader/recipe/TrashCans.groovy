import static gregtech.api.GTValues.*

import static util.GroovyUtil.*

log.info("Starting to load TrashCans Recipes...")

/* -------------------------------------------------------------------------- */
def assembler = recipemap('assembler')
/* -------------------------------------------------------------------------- */

// Item Trash Can
crafting.removeByOutput(item('trashcans:item_trash_can'))
crafting.shapedBuilder()
    .row('PwP')
    .row('PCP')
    .row('PSP')
    .key('w', ore('toolWrench'))
    .key('P', ore('plateIron'))
    .key('C', item('minecraft:chest'))
    .key('S', ore('screwIron'))
    .output(item('trashcans:item_trash_can'))
    .register()

assembler.recipeBuilder()
    .circuitMeta(13)
    .inputs(item('minecraft:chest'))
    .inputs(ore('plateIron') * 6)
    .outputs(item('trashcans:item_trash_can'))
    .EUt(4) // ULV
    .duration(10 * TICK)
    .buildAndRegister()

// Liquid Trash Can
crafting.removeByOutput(item('trashcans:liquid_trash_can'))
crafting.shapedBuilder()
    .row('PwP')
    .row('PCP')
    .row('PSP')
    .key('w', ore('toolWrench'))
    .key('P', ore('plateIron'))
    .key('C', item('minecraft:bucket'))
    .key('S', ore('screwIron'))
    .output(item('trashcans:liquid_trash_can'))
    .register()

assembler.recipeBuilder()
    .circuitMeta(13)
    .inputs(item('minecraft:bucket'))
    .inputs(ore('plateIron') * 6)
    .outputs(item('trashcans:liquid_trash_can'))
    .EUt(4) // ULV
    .duration(10 * TICK)
    .buildAndRegister()

// Energy Trash Can
crafting.removeByOutput(item('trashcans:energy_trash_can'))
crafting.shapedBuilder()
    .row('PwP')
    .row('PCP')
    .row('PSP')
    .key('w', ore('toolWrench'))
    .key('P', ore('plateIron'))
    .key('C', item('enderio:item_basic_capacitor'))
    .key('S', ore('screwIron'))
    .output(item('trashcans:energy_trash_can'))
    .register()

assembler.recipeBuilder()
    .circuitMeta(13)
    .inputs(item('enderio:item_basic_capacitor'))
    .inputs(ore('plateIron') * 6)
    .outputs(item('trashcans:energy_trash_can'))
    .EUt(4) // ULV
    .duration(10 * TICK)
    .buildAndRegister()

// Ultimate Trash Can
assembler.recipeBuilder()
    .inputs(item('trashcans:item_trash_can'))
    .inputs(item('trashcans:liquid_trash_can'))
    .inputs(item('trashcans:energy_trash_can'))
    .outputs(item('trashcans:ultimate_trash_can'))
    .EUt(4) // ULV
    .duration(2 * SECOND)
    .buildAndRegister()