import static gregtech.api.GTValues.*

import static util.GroovyUtil.*

log.info("Starting to load GregTechLiteCore Recipes...")

/* -------------------------------------------------------------------------- */
def wiremill = recipemap('wiremill')
/* -------------------------------------------------------------------------- */

// Cotton -> String
crafting.addShapeless(item('minecraft:string') * 4, [item('gtlitecore:gtlite_meta_item', 9269)]) // Cotton

wiremill.recipeBuilder()
    .circuitMeta(1)
    .inputs(item('gtlitecore:gtlite_meta_item', 9269)) // Cotton
    .outputs(item('minecraft:string') * 4)
    .EUt(7) // ULV
    .duration(2 * TICK)
    .buildAndRegister()