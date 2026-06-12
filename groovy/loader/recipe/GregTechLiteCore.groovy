import static gregtech.api.GTValues.*
import static util.GroovyUtil.*

log.info("Starting to load gtlitecore recipes...")

def vacuum_chamber = recipemap('vacuum_chamber')
def wiremill = recipemap('wiremill')

// Cotton -> String
crafting.shapelessBuilder()
    .name(resource('gtlite:cotton_string'))
    .input(metaitem('gtlitecore:crop.fruit.cotton'))
    .output(item('minecraft:string') * 4)
    .register()

wiremill.recipeBuilder()
    .circuitMeta(1)
    .inputs(metaitem('gtlitecore:crop.fruit.cotton'))
    .outputs(item('minecraft:string') * 4)
    .EUt(7) // ULV
    .duration(2 * TICK)
    .buildAndRegister()

// Drain
crafting.removeByOutput(metaitem('gtlitecore:cover.drain'))
crafting.shapedBuilder()
    .name(resource('gtlitecore:drain'))
    .shape('SSS',
           'IPI',
           'SSS')
    .key('S', ore('stickIron'))
    .key('P', ore('pipeSmallFluidSteel'))
    .key('I', ore('barsIron'))
    .output(metaitem('gtlitecore:cover.drain'))
    .register()

// Bedrock convert
vacuum_chamber.recipeBuilder()
    .inputs(metaitem('gtlitecore:blockBedrockium'))
    .outputs(item('minecraft:bedrock'))
    .EUt(VA[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

log.info("Complete load gtlitecore recipes!")