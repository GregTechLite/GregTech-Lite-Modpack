import static gregtech.api.GTValues.*

import static util.GroovyUtil.*

log.info("Starting to load GregTechLiteCore Recipes...")

/* -------------------------------------------------------------------------- */
def vacuum_chamber = recipemap('vacuum_chamber')
def wiremill = recipemap('wiremill')
/* -------------------------------------------------------------------------- */

// Cotton -> String
crafting.addShapeless(item('minecraft:string') * 4, [item('gtlitecore:gtlite_meta_item_2', 219)]) // Cotton

wiremill.recipeBuilder()
        .circuitMeta(1)
        .inputs(item('gtlitecore:gtlite_meta_item_2', 219)) // Cotton
        .outputs(item('minecraft:string') * 4)
        .EUt(7) // ULV
        .duration(2 * TICK)
        .buildAndRegister()

// Drain
crafting.removeByOutput(item('gtlitecore:gtlite_meta_item_1', 116))
crafting.shapedBuilder()
        .name(resource('gtlitecore:drain'))
        .shape('SSS',
                'IPI',
                'SSS')
        .key('S', ore('stickIron'))
        .key('P', ore('pipeSmallFluidSteel'))
        .key('I', ore('barsIron'))
        .output(item('gtlitecore:gtlite_meta_item_1', 116))
        .register()

// Bedrock convert
vacuum_chamber.recipeBuilder()
        .inputs(item('gtlitecore:meta_block_compressed_135', 12)) // Bedrockium block
        .outputs(item('minecraft:bedrock'))
        .EUt(VA[LV])
        .duration(5 * SECOND)
        .buildAndRegister()
