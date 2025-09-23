import static gregtech.api.GTValues.*

import static util.GroovyUtil.*

log.info("Starting to load EnderIO Recipes...")

/* -------------------------------------------------------------------------- */
def conduit_binder = item('enderio:item_material', 4)
def glider_wings = item('enderio:item_material', 7)
def conduit_binder_composite = item('enderio:item_material', 22)

def basic_capacitor = item('enderio:item_basic_capacitor')
def double_layer_capacitor = item('enderio:item_basic_capacitor', 1)
def octadic_capacitor = item('enderio:item_basic_capacitor', 2)

def silver_capacitor = item('enderio:item_capacitor_silver')
def energetic_silver_capacitor = item('enderio:item_capacitor_energetic_silver')
def vivid_capacitor = item('enderio:item_capacitor_vivid')
def crystalline_capacitor = item('enderio:item_capacitor_crystalline')
def melodic_capacitor = item('enderio:item_capacitor_melodic')
def stellar_capacitor = item('enderio:item_capacitor_stellar')
def totemic_capacitor = item('enderio:item_capacitor_totemic')

def ender_alloy = item('enderutilities:enderpart')
def advanced_ender_alloy = item('enderutilities:enderpart', 2)
def basic_ender_core = item('enderutilities:enderpart', 15)
/* -------------------------------------------------------------------------- */
def alloy_smelter = recipemap('alloy_smelter')
def assembler = recipemap('assembler')
def canner = recipemap('canner')
def chemical_reactor = recipemap('chemical_reactor')
def forming_press = recipemap('forming_press')
def fluid_solidifier = recipemap('fluid_solidifier')
def mixer = recipemap('mixer')
/* -------------------------------------------------------------------------- */

// Conduit Binder Composite
crafting.shapedBuilder()
    .name(resource('gtlite:conduit_binder_composite_gravel'))
    .shape('GCG',
           'SGS',
           'GCG')
    .key('G', item('minecraft:gravel'))
    .key('S', ore('dustSand'))
    .key('C', ore('dustClay'))
    .output(conduit_binder_composite * 16)
    .register()

mixer.recipeBuilder()
    .circuitMeta(3)
    .inputs(item('minecraft:gravel')  * 5)
    .inputs(ore('dustSand') * 2)
    .inputs(ore('dustClay') * 2)
    .outputs(conduit_binder_composite * 16)
    .EUt(VA[LV])
    .duration(2 * SECOND)
    .buildAndRegister()

crafting.shapedBuilder()
    .name(resource('gtlite:conduit_binder_composite_paraffin'))
    .shape('GCG',
           'SGS',
           'GCG')
    .key('G', ore('dustParaffin'))
    .key('S', ore('dustSand'))
    .key('C', ore('dustClay'))
    .output(conduit_binder_composite * 64)
    .register()

mixer.recipeBuilder()
    .circuitMeta(3)
    .inputs(ore('dustParaffin')  * 5)
    .inputs(ore('dustSand') * 2)
    .inputs(ore('dustClay') * 2)
    .outputs(conduit_binder_composite * 64)
    .EUt(VA[LV])
    .duration(2 * SECOND)
    .buildAndRegister()

// Conduit Binder
furnace.add(conduit_binder_composite, conduit_binder * 4)

// Exit Rail
crafting.shapedBuilder()
    .name(resource('gtlite:exit_rail'))
    .shape('IPI',
           'ISI',
           'IDI')
    .key('I', ore('ingotIron'))
    .key('P', item('minecraft:piston'))
    .key('S', item('minecraft:stone_pressure_plate'))
    .key('D', ore('dustRedstone'))
    .output(item('enderio:block_exit_rail') * 6)
    .register()

assembler.recipeBuilder()
    .circuitMeta(5)
    .inputs(ore('stickIron') * 12)
    .inputs(ore('dustRedstone'))
    .inputs(item('minecraft:stone_pressure_plate'))
    .inputs(item('minecraft:piston'))
    .outputs(item('enderio:block_exit_rail') * 12)
    .EUt(VA[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

// Conduit Facade
crafting.shapedBuilder()
    .name(resource('gtlite:conduit_facade'))
    .shape('CCC',
           'CFC',
           'CCC')
    .key('F', ore('frameGtIron'))
    .key('C', conduit_binder)
    .output(item('enderio:item_conduit_facade') * 2) 
    .register()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('frameGtIron'))
    .inputs(conduit_binder * 8)
    .outputs(item('enderio:item_conduit_facade') * 2)
    .EUt(VH[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Hardened Conduit Facade
crafting.shapelessBuilder()
    .name(resource('gtlite:hardened_conduit_facade'))
    .input([item('enderio:item_conduit_facade'), 
            item('minecraft:obsidian')])
    .output(item('enderio:item_conduit_facade', 1))
    .register()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(item('enderio:item_conduit_facade'))
    .inputs(item('minecraft:obsidian'))
    .outputs(item('enderio:item_conduit_facade', 1))
    .EUt(VH[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Transparent Conduit Facade
crafting.shapelessBuilder()
    .name(resource('gtlite:transparent_conduit_facade'))
    .input([item('enderio:item_conduit_facade'), item('minecraft:glass')])
    .output(item('enderio:item_conduit_facade', 2))
    .register()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(item('enderio:item_conduit_facade'))
    .inputs(item('minecraft:glass'))
    .outputs(item('enderio:item_conduit_facade', 2))
    .EUt(VH[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Transparent Hardened Conduit Facade
crafting.shapelessBuilder()
    .name(resource('gtlite:transparent_hardened_conduit_facade_1'))
    .input([item('enderio:item_conduit_facade'), 
            item('minecraft:glass'), 
            item('minecraft:obsidian')])
    .output(item('enderio:item_conduit_facade', 3))
    .register()

crafting.shapelessBuilder()
    .name(resource('gtlite:transparent_hardened_conduit_facade_2'))
    .input([item('enderio:item_conduit_facade', 1), 
            item('minecraft:glass')])
    .output(item('enderio:item_conduit_facade', 3))
    .register()

crafting.shapelessBuilder()
    .name(resource('gtlite:transparent_hardened_conduit_facade_3'))
    .input([item('enderio:item_conduit_facade', 2), 
            item('minecraft:obsidian')])
    .output(item('enderio:item_conduit_facade', 3))
    .register()

assembler.recipeBuilder()
    .circuitMeta(2)
    .inputs(item('enderio:item_conduit_facade'))
    .inputs(item('minecraft:glass'))
    .inputs(item('minecraft:obsidian'))
    .outputs(item('enderio:item_conduit_facade', 3))
    .EUt(VH[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(item('enderio:item_conduit_facade', 1))
    .inputs(item('minecraft:glass'))
    .outputs(item('enderio:item_conduit_facade', 3))
    .EUt(VH[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(item('enderio:item_conduit_facade', 2))
    .inputs(item('minecraft:obsidian'))
    .outputs(item('enderio:item_conduit_facade', 3))
    .EUt(VH[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Basic Capacitor
crafting.shapedBuilder()
    .name(resource('gtlite:basic_capacitor'))
    .shape(' F ',
           'FDF',
           'B B')
    .key('F', ore('foilIron'))
    .key('D', ore('dustGallium'))
    .key('B', ore('boltTin'))
    .output(basic_capacitor * 2)
    .register()

assembler.recipeBuilder()
    .inputs(ore('dustGallium'))
    .inputs(ore('foilIron'))
    .fluidInputs(fluid('plastic') * L)
    .outputs(basic_capacitor * 8)
    .EUt(4) // ULV
    .duration(1 * SECOND + 10 * TICK)
    .buildAndRegister()

// Silver Capacitor
crafting.shapedBuilder()
    .name(resource('gtlite:silver_capacitor'))
    .shape(' F ',
           'FDF',
           'B B')
    .key('F', ore('foilSilver'))
    .key('D', ore('dustGallium'))
    .key('B', ore('boltTin'))
    .output(silver_capacitor * 2)
    .register()

assembler.recipeBuilder()
    .inputs(ore('dustGallium'))
    .inputs(ore('foilSilver'))
    .fluidInputs(fluid('plastic') * L)
    .outputs(silver_capacitor * 8)
    .EUt(4) // ULV
    .duration(1 * SECOND + 10 * TICK)
    .buildAndRegister()

// Double-Layer Capacitor
crafting.shapedBuilder()
    .name(resource('gtlite:double_layer_capacitor'))
    .shape(' F ',
           'FCF',
           'B B')
    .key('F', ore('foilGold'))
    .key('B', ore('boltSilver'))
    .key('C', basic_capacitor)
    .output(double_layer_capacitor * 2)
    .register()

assembler.recipeBuilder()
    .inputs(basic_capacitor)
    .inputs(ore('foilGold') * 2)
    .fluidInputs(fluid('silver') * L)
    .outputs(double_layer_capacitor * 8)
    .EUt(4) // ULV
    .duration(1 * SECOND + 10 * TICK)
    .buildAndRegister()

// Energetic Silver Capacitor
crafting.shapedBuilder()
    .name(resource('gtlite:energetic_silver_capacitor'))
    .shape(' F ',
           'FCF',
           'B B')
    .key('F', ore('foilBlueAlloy'))
    .key('B', ore('boltAnnealedCopper'))
    .key('C', silver_capacitor)
    .output(energetic_silver_capacitor * 2)
    .register()

assembler.recipeBuilder()
    .inputs(silver_capacitor)
    .inputs(ore('foilBlueAlloy') * 2)
    .fluidInputs(fluid('annealed_copper') * L)
    .outputs(energetic_silver_capacitor * 8)
    .EUt(4) // ULV
    .duration(1 * SECOND + 10 * TICK)
    .buildAndRegister()

// Octadic Capacitor
crafting.shapedBuilder()
    .name(resource('gtlite:octadic_capacitor'))
    .shape(' F ',
           'FCF',
           'B B')
    .key('F', ore('foilElectrum'))
    .key('B', ore('boltSterlingSilver'))
    .key('C', double_layer_capacitor)
    .output(octadic_capacitor * 2)
    .register()

assembler.recipeBuilder()
    .inputs(double_layer_capacitor)
    .inputs(ore('foilElectrum') * 2)
    .fluidInputs(fluid('sterling_silver') * L)
    .outputs(octadic_capacitor * 8)
    .EUt(4) // ULV
    .duration(1 * SECOND + 10 * TICK)
    .buildAndRegister()

// Vivid Capacitor
crafting.shapedBuilder()
    .name(resource('gtlite:vivid_capacitor'))
    .shape(' F ',
           'FCF',
           'B B')
    .key('F', ore('foilAluminium'))
    .key('B', ore('boltBlackSteel'))
    .key('C', energetic_silver_capacitor)
    .output(vivid_capacitor * 2)
    .register()

assembler.recipeBuilder()
    .inputs(energetic_silver_capacitor)
    .inputs(ore('foilAluminium') * 2)
    .fluidInputs(fluid('black_steel') * L)
    .outputs(vivid_capacitor * 8)
    .EUt(4) // ULV
    .duration(1 * SECOND + 10 * TICK)
    .buildAndRegister()

// Crystalline Capacitor
crafting.shapedBuilder()
    .name(resource('gtlite:crystalline_capacitor'))
    .shape(' F ',
           'FCF',
           'B B')
    .key('F', ore('foilRuthenium'))
    .key('B', ore('boltBlueSteel'))
    .key('C', ore('capacitorData'))
    .output(crystalline_capacitor * 2)
    .register()

assembler.recipeBuilder()
    .inputs(ore('capacitorData'))
    .inputs(ore('foilRuthenium') * 2)
    .fluidInputs(fluid('blue_steel') * L)
    .outputs(crystalline_capacitor * 8)
    .EUt(4) // ULV
    .duration(1 * SECOND + 10 * TICK)
    .buildAndRegister()

// Melodic Capacitor
crafting.shapedBuilder()
    .name(resource('gtlite:melodic_capacitor'))
    .shape(' F ',
           'FCF',
           'B B')
    .key('F', ore('foilOsmium'))
    .key('B', ore('boltIridium'))
    .key('C', ore('capacitorElite'))
    .output(melodic_capacitor * 2)
    .register()

assembler.recipeBuilder()
    .inputs(ore('capacitorElite'))
    .inputs(ore('foilOsmium') * 2)
    .fluidInputs(fluid('iridium') * L)
    .outputs(melodic_capacitor * 8)
    .EUt(4) // ULV
    .duration(1 * SECOND + 10 * TICK)
    .buildAndRegister()

// Stellar Capacitor
crafting.shapedBuilder()
    .name(resource('gtlite:stellar_capacitor'))
    .shape(' F ',
           'FCF',
           'B B')
    .key('F', ore('foilHsse'))
    .key('B', ore('boltRuridit'))
    .key('C', ore('capacitorMaster'))
    .output(stellar_capacitor * 2)
    .register()

assembler.recipeBuilder()
    .inputs(ore('capacitorMaster'))
    .inputs(ore('foilHsse') * 2)
    .fluidInputs(fluid('ruridit') * L)
    .outputs(stellar_capacitor * 8)
    .EUt(4) // ULV
    .duration(1 * SECOND + 10 * TICK)
    .buildAndRegister()

// Totemic Capacitor
crafting.shapedBuilder()
    .name(resource('gtlite:totemic_capacitor'))
    .shape(' F ',
           'FCF',
           'B B')
    .key('F', ore('foilNaquadahAlloy'))
    .key('B', ore('boltOsmiridium'))
    .key('C', ore('capacitorUltimate'))
    .output(totemic_capacitor * 2)
    .register()

assembler.recipeBuilder()
    .inputs(ore('capacitorUltimate'))
    .inputs(ore('foilNaquadahAlloy') * 2)
    .fluidInputs(fluid('osmiridium') * L)
    .outputs(totemic_capacitor * 8)
    .EUt(4) // ULV
    .duration(1 * SECOND + 10 * TICK)
    .buildAndRegister()

// Item Conduit
crafting.shapedBuilder()
    .name(resource('gtlite:item_conduit_1a'))
    .shape('GGG',
           'BPB',
           'GGG')
    .key('P', ore('pipeSmallItemCobalt'))
    .key('B', conduit_binder)
    .key('G', item('minecraft:glass_pane'))
    .output(item('enderio:item_item_conduit') * 4)
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:item_conduit_2a'))
    .shape('GGG',
           'BPB',
           'GGG')
    .key('P', ore('pipeSmallItemSterlingSilver'))
    .key('B', conduit_binder)
    .key('G', item('minecraft:glass_pane'))
    .output(item('enderio:item_item_conduit') * 16) // Item Conduit
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:item_conduit_3a'))
    .shape('GGG',
           'BPB',
           'GGG')
    .key('P', ore('pipeSmallItemUltimet'))
    .key('B', conduit_binder)
    .key('G', item('minecraft:glass_pane'))
    .output(item('enderio:item_item_conduit') * 64)
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:item_conduit_1b'))
    .shape('GGG',
           'BPB',
           'GGG')
    .key('P', ore('pipeSmallItemCobalt'))
    .key('B', conduit_binder)
    .key('G', ore('plateGlass'))
    .output(item('enderio:item_item_conduit') * 4)
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:item_conduit_2b'))
    .shape('GGG',
           'BPB',
           'GGG')
    .key('P', ore('pipeSmallItemSterlingSilver'))
    .key('B', conduit_binder)
    .key('G', ore('plateGlass'))
    .output(item('enderio:item_item_conduit') * 16)
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:item_conduit_3b'))
    .shape('GGG',
           'BPB',
           'GGG')
    .key('P', ore('pipeSmallItemUltimet'))
    .key('B', conduit_binder)
    .key('G', ore('plateGlass'))
    .output(item('enderio:item_item_conduit') * 64)
    .register()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('pipeSmallItemCobalt'))
    .inputs(item('minecraft:glass_pane') * 6)
    .inputs(conduit_binder * 2)
    .outputs(item('enderio:item_item_conduit') * 4)
    .EUt(VH[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('pipeSmallItemSterlingSilver'))
    .inputs(item('minecraft:glass_pane') * 6)
    .inputs(conduit_binder * 2)
    .outputs(item('enderio:item_item_conduit') * 16)
    .EUt(VH[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('pipeSmallItemUltimet'))
    .inputs(item('minecraft:glass_pane') * 6)
    .inputs(conduit_binder * 2)
    .outputs(item('enderio:item_item_conduit') * 64)
    .EUt(VH[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('pipeSmallItemCobalt'))
    .inputs(ore('plateGlass') * 6)
    .inputs(conduit_binder * 2)
    .outputs(item('enderio:item_item_conduit') * 4)
    .EUt(VH[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('pipeSmallItemSterlingSilver'))
    .inputs(ore('plateGlass') * 6)
    .inputs(conduit_binder * 2)
    .outputs(item('enderio:item_item_conduit') * 16)
    .EUt(VH[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('pipeSmallItemUltimet'))
    .inputs(ore('plateGlass') * 6)
    .inputs(conduit_binder * 2)
    .outputs(item('enderio:item_item_conduit') * 64)
    .EUt(VH[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

// Fluid Conduit
crafting.shapedBuilder()
    .name(resource('gtlite:fluid_conduit_1a'))
    .shape('GGG',
           'BPB',
           'GGG')
    .key('P', ore('pipeTinyFluidGold'))
    .key('B', conduit_binder)
    .key('G', item('minecraft:glass_pane'))
    .output(item('enderio:item_liquid_conduit') * 4)
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:fluid_conduit_2a'))
    .shape('GGG',
           'BPB',
           'GGG')
    .key('P', ore('pipeTinyFluidChrome'))
    .key('B', conduit_binder)
    .key('G', item('minecraft:glass_pane'))
    .output(item('enderio:item_liquid_conduit') * 16)
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:fluid_conduit_3a'))
    .shape('GGG',
           'BPB',
           'GGG')
    .key('P', ore('pipeTinyFluidStainlessSteel'))
    .key('B', conduit_binder)
    .key('G', item('minecraft:glass_pane'))
    .output(item('enderio:item_liquid_conduit') * 64)
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:fluid_conduit_1b'))
    .shape('GGG',
           'BPB',
           'GGG')
    .key('P', ore('pipeTinyFluidGold'))
    .key('B', conduit_binder)
    .key('G', ore('plateGlass'))
    .output(item('enderio:item_liquid_conduit') * 4)
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:fluid_conduit_2b'))
    .shape('GGG',
           'BPB',
           'GGG')
    .key('P', ore('pipeTinyFluidChrome'))
    .key('B', conduit_binder)
    .key('G', ore('plateGlass'))
    .output(item('enderio:item_liquid_conduit') * 16)
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:fluid_conduit_3b'))
    .shape('GGG',
           'BPB',
           'GGG')
    .key('P', ore('pipeTinyFluidStainlessSteel'))
    .key('B', conduit_binder)
    .key('G', ore('plateGlass'))
    .output(item('enderio:item_liquid_conduit') * 64)
    .register()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('pipeTinyFluidGold'))
    .inputs(item('minecraft:glass_pane') * 6)
    .inputs(conduit_binder* 2)
    .outputs(item('enderio:item_liquid_conduit') * 4)
    .EUt(VH[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('pipeTinyFluidChrome'))
    .inputs(item('minecraft:glass_pane') * 6)
    .inputs(conduit_binder * 2)
    .outputs(item('enderio:item_liquid_conduit') * 16)
    .EUt(VH[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('pipeTinyFluidStainlessSteel'))
    .inputs(item('minecraft:glass_pane') * 6)
    .inputs(conduit_binder * 2)
    .outputs(item('enderio:item_liquid_conduit') * 64)
    .EUt(VH[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('pipeTinyFluidGold'))
    .inputs(ore('plateGlass') * 6)
    .inputs(conduit_binder * 2)
    .outputs(item('enderio:item_liquid_conduit') * 4)
    .EUt(VH[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('pipeTinyFluidChrome'))
    .inputs(ore('plateGlass') * 6)
    .inputs(conduit_binder * 2)
    .outputs(item('enderio:item_liquid_conduit') * 16)
    .EUt(VH[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('pipeTinyFluidStainlessSteel'))
    .inputs(ore('plateGlass') * 6)
    .inputs(conduit_binder * 2)
    .outputs(item('enderio:item_liquid_conduit') * 64)
    .EUt(VH[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

// Pressurized Fluid Conduit
crafting.shapelessBuilder()
    .name(resource('gtlite:pressurized_fluid_conduit'))
    .input([item('enderio:item_liquid_conduit'),
            ore('springSmallSteel')])
    .output(item('enderio:item_liquid_conduit', 1) * 2)
    .register()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(item('enderio:item_liquid_conduit'))
    .inputs(ore('springSmallSteel'))
    .outputs(item('enderio:item_liquid_conduit', 1) * 2)
    .EUt(VH[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Ender Fluid Conduit
crafting.shapelessBuilder()
    .name(resource('gtlite:ender_fluid_conduit'))
    .input([item('enderio:item_liquid_conduit', 1), 
            ore('gearSmallAluminium')])
    .output(item('enderio:item_liquid_conduit', 2) * 2)
    .register()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(item('enderio:item_liquid_conduit', 1))
    .inputs(ore('gearSmallAluminium'))
    .outputs(item('enderio:item_liquid_conduit', 2) * 2)
    .EUt(VH[MV])
    .duration(5 * SECOND)
    .buildAndRegister()

// Redstone Conduit
crafting.shapedBuilder()
    .name(resource('gtlite:redstone_conduit_1'))
    .shape('GGG',
           'BRB',
           'GGG')
    .key('G', item('minecraft:glass_pane'))
    .key('B', conduit_binder)
    .key('R', item('projectred-transmission:wire'))
    .output(item('enderio:item_redstone_conduit') * 4)
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:redstone_conduit_2'))
    .shape('GGG',
           'BRB',
           'GGG')
    .key('G', ore('plateGlass'))
    .key('B', conduit_binder)
    .key('R', item('projectred-transmission:wire'))
    .output(item('enderio:item_redstone_conduit') * 4)
    .register()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(item('projectred-transmission:wire'))
    .inputs(item('minecraft:glass_pane') * 6)
    .inputs(conduit_binder * 2)
    .outputs(item('enderio:item_redstone_conduit') * 4)
    .EUt(VH[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(item('projectred-transmission:wire'))
    .inputs(ore('plateGlass') * 6)
    .inputs(conduit_binder * 2)
    .outputs(item('enderio:item_redstone_conduit') * 4)
    .EUt(VH[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

// Glider Wings
assembler.recipeBuilder()
    .inputs(ore('platePlastic') * 2)
    .inputs(ore('plateSteel'))
    .inputs(ore('ringSteel') * 2)
    .fluidInputs(fluid('soldering_alloy') * (L / 2))
    .outputs(glider_wings)
    .EUt(VH[LV])
    .duration(10 * SECOND)
    .buildAndRegister()

// Dark Steel Anvil
crafting.shapedBuilder()
    .name(resource('gtlite:dark_steel_anvil'))
    .shape('BBB',
           ' I ',
           'III')
    .key('B', ore('blockSteel'))
    .key('I', ore('ingotSteel'))
    .output(item('enderio:block_dark_steel_anvil'))
    .register()

fluid_solidifier.recipeBuilder()
    .notConsumable(metaitem('shape.mold.anvil'))
    .fluidInputs(fluid('steel') * (L * 31))
    .outputs(item('enderio:block_dark_steel_anvil')) // Dark Steel Anvil
    .EUt(VH[LV])
    .duration(84 * SECOND)
    .buildAndRegister()

alloy_smelter.recipeBuilder()
    .notConsumable(metaitem('shape.mold.anvil'))
    .inputs(ore('ingotSteel') * 31)
    .outputs(item('enderio:block_dark_steel_anvil'))
    .EUt(VH[LV])
    .duration(84 * SECOND)
    .buildAndRegister()

// Dark Steel Ladder
crafting.shapedBuilder()
    .name(resource('gtlite:dark_steel_ladder'))
    .shape('R R',
           'RRR',
           'R R')
    .key('R', ore('stickSteel'))
    .output(item('enderio:block_dark_steel_ladder') * 3)
    .register()

assembler.recipeBuilder()
    .circuitMeta(7)
    .inputs(ore('stickSteel') * 7)
    .outputs(item('enderio:block_dark_steel_ladder') * 3)
    .EUt(1) // ULV
    .duration(2 * SECOND)
    .buildAndRegister()

// Dark Iron Bars
crafting.shapedBuilder()
    .name(resource('gtlite:dark_iron_bars'))
    .shape(' h ',
           'RRR',
           'RRR')
    .key('h', ore('toolHammer'))
    .key('R', ore('stickSteel'))
    .output(item('enderio:block_dark_iron_bars') * 8)
    .register()

assembler.recipeBuilder()
    .circuitMeta(3)
    .inputs(ore('stickSteel') * 3)
    .outputs(item('enderio:block_dark_iron_bars') * 4)
    .EUt(4) // ULV
    .duration(15 * SECOND)
    .buildAndRegister()

// Dark Steel Trapdoor
crafting.shapedBuilder()
    .name(resource('gtlite:dark_steel_trapdoor'))
    .shape('II ',
           'II ',
           '   ')
    .key('I', ore('ingotSteel'))
    .output(item('enderio:block_dark_steel_trapdoor'))
    .register()

assembler.recipeBuilder()
    .circuitMeta(4)
    .inputs(ore('plateSteel') * 4)
    .outputs(item('enderio:block_dark_steel_trapdoor'))
    .EUt(VH[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

// Dark Steel Door
crafting.shapedBuilder()
    .name(resource('gtlite:dark_steel_door'))
    .shape('II ',
           'II ',
           'II ')
    .key('I', ore('ingotSteel'))
    .output(item('enderio:block_dark_steel_door') * 3)
    .register()

assembler.recipeBuilder()
    .circuitMeta(6)
    .inputs(ore('plateSteel') * 6)
    .outputs(item('enderio:block_dark_steel_door') * 3)
    .EUt(VH[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

// Reinforced Obsidian
crafting.shapedBuilder()
    .name(resource('gtlite:reinforced_obsidian'))
    .shape('DBD',
           'SCS',
           'DBD')
    .key('C', item('minecraft:obsidian'))
    .key('D', ore('plateDenseSteel'))
    .key('S', ore('stickLongSteel'))
    .key('B', item('enderio:block_dark_iron_bars'))
    .output(item('enderio:block_reinforced_obsidian'))
    .register()

assembler.recipeBuilder()
    .inputs(item('minecraft:obsidian'))
    .inputs(ore('plateDenseSteel') * 4)
    .outputs(item('enderio:block_reinforced_obsidian'))
    .EUt(4) // ULV
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Self-Resetting Lever (5s)
crafting.shapedBuilder()
    .name(resource('gtlite:self_resetting_lever_5s'))
    .shape('LG ',
           '   ',
           '   ')
    .key('L', item('minecraft:lever'))
    .key('G', ore('gearSmallRedAlloy'))
    .output(item('enderio:block_self_resetting_lever5') * 4)
    .register()

// Self-Resetting Lever (10s)
crafting.shapedBuilder()
    .name(resource('gtlite:self_resetting_lever_10s'))
    .shape('L G',
           '   ',
           '   ')
    .key('L', item('minecraft:lever'))
    .key('G', ore('gearSmallRedAlloy'))
    .output(item('enderio:block_self_resetting_lever10') * 2)
    .register()

// Self-Resetting Lever (30s)
crafting.shapedBuilder()
    .name(resource('gtlite:self_resetting_lever_30s'))
    .shape('L  ',
           'G  ',
           '   ')
    .key('L', item('minecraft:lever'))
    .key('G', ore('gearSmallRedAlloy'))
    .output(item('enderio:block_self_resetting_lever30'))
    .register()

// Self-Resetting Lever (1m)
crafting.shapedBuilder()
    .name(resource('gtlite:self_resetting_lever_1m'))
    .shape('LG ',
           'S  ',
           '   ')
    .key('L', item('minecraft:lever'))
    .key('G', ore('gearSmallRedAlloy'))
    .key('S', ore('springSmallRedAlloy'))
    .output(item('enderio:block_self_resetting_lever60') * 2)
    .register()

// Self-Resetting Lever (5m)
crafting.shapedBuilder()
    .name(resource('gtlite:self_resetting_lever_5m'))
    .shape('LG ',
           ' S ',
           '   ')
    .key('L', item('minecraft:lever'))
    .key('G', ore('gearSmallRedAlloy'))
    .key('S', ore('springSmallRedAlloy'))
    .output(item('enderio:block_self_resetting_lever300'))
    .register()

// Inverted Self-Resetting Lever (5s)
crafting.shapelessBuilder()
    .name(resource('gtlite:inverted_self_resetting_lever_5s'))
    .input([item('enderio:block_self_resetting_lever5')])
    .output(item('enderio:block_self_resetting_lever5i'))
    .register()

// Inverted Self-Resetting Lever (10s)
crafting.shapelessBuilder()
    .name(resource('gtlite:inverted_self_resetting_lever_10s'))
    .input([item('enderio:block_self_resetting_lever10')])
    .output(item('enderio:block_self_resetting_lever10i'))
    .register()

// Inverted Self-Resetting Lever (30s)
crafting.shapelessBuilder()
    .name(resource('gtlite:inverted_self_resetting_lever_30s'))
    .input([item('enderio:block_self_resetting_lever30')])
    .output(item('enderio:block_self_resetting_lever30i'))
    .register()

// Inverted Self-Resetting Lever (1m)
crafting.shapelessBuilder()
    .name(resource('gtlite:inverted_self_resetting_lever_1m'))
    .input([item('enderio:block_self_resetting_lever60')])
    .output(item('enderio:block_self_resetting_lever60i'))
    .register()

// Inverted Self-Resetting Lever (5m)
crafting.shapelessBuilder()
    .name(resource('gtlite:inverted_self_resetting_lever_5m'))
    .input([item('enderio:block_self_resetting_lever300')])
    .output(item('enderio:block_self_resetting_lever300i'))
    .register()

// Confusion Charge
chemical_reactor.recipeBuilder()
    .inputs(item('minecraft:tnt'))
    .fluidInputs(fluid('diethyl_ether') * 250)
    .outputs(item('enderio:block_confusion_charge'))
    .EUt(VA[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Concussion Charge
chemical_reactor.recipeBuilder()
    .inputs(item('minecraft:tnt'))
    .fluidInputs(fluid('tectonic_petrotheum') * 250)
    .outputs(item('enderio:block_concussion_charge'))
    .EUt(VA[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Ender Charge
chemical_reactor.recipeBuilder()
    .inputs(item('minecraft:tnt'))
    .inputs(ore('dustEnderPearl'))
    .fluidInputs(fluid('zephyrean_aerotheum') * 250)
    .outputs(item('enderio:block_ender_charge'))
    .EUt(VA[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Conduit Probe
crafting.shapedBuilder()
    .name(resource('gtlite:conduit_probe'))
    .shape('SwS',
           'PXP',
           'PPP')
    .key('S', ore('springSmallIron'))
    .key('P', ore('plateIron'))
    .key('w', ore('toolWrench'))
    .key('X', ore('springNickel'))
    .output(item('enderio:item_conduit_probe'))
    .register()

// Yeta Wrench
crafting.shapedBuilder()
    .name(resource('gtlite:yeta_wrench'))
    .shape('PhP',
           'PGP',
           ' P ')
    .key('h', ore('toolHammer'))
    .key('P', ore('plateNickel'))
    .key('G', ore('gearNickel'))
    .output(item('enderio:item_yeta_wrench'))
    .register()

// Liquid XP/Experience Bottle convert.
canner.recipeBuilder()
    .inputs(item('minecraft:glass_bottle'))
    .fluidInputs(fluid('xpjuice') * 250)
    .outputs(item('minecraft:experience_bottle'))
    .EUt(7) // ULV
    .duration(10 * TICK)
    .buildAndRegister()

canner.recipeBuilder()
    .inputs(item('minecraft:experience_bottle'))
    .outputs(item('minecraft:glass_bottle'))
    .fluidOutputs(fluid('xpjuice') * 250)
    .EUt(7) // ULV
    .duration(1 * SECOND)
    .buildAndRegister()

// XP Transfer
crafting.shapedBuilder()
    .name(resource('gtlite:xp_transfer'))
    .shape('  S',
           ' B ',
           'S  ')
    .key('S', ore('stickIron'))
    .key('B', item('minecraft:experience_bottle'))
    .output(item('enderio:item_xp_transfer'))
    .register()

// Travel Staff
crafting.shapedBuilder()
    .name(resource('gtlite:travel_staff'))
    .shape('  X',
           ' S ',
           'S  ')
    .key('S', ore('stickIron'))
    .key('X', basic_ender_core)
    .output(item('enderio:item_travel_staff'))
    .register()

// Return Rod
crafting.shapedBuilder()
    .name(resource('gtlite:return_rod'))
    .shape('  X',
           ' S ',
           'S  ')
    .key('S', ore('stickIron'))
    .key('X', item('enderutilities:linkcrystal'))
    .output(item('enderio:item_rod_of_return'))
    .register()

// Travel Anchor
crafting.shapedBuilder()
    .name(resource('gtlite:travel_anchor'))
    .shape('FGF',
           'SES',
           'FGF')
    .key('E', item('enderutilities:ender_elevator'))
    .key('G', advanced_ender_alloy)
    .key('S', ore('screwAluminium'))
    .key('F', item('gtlitecore:meta_block_sheeted_frame_0', 6)) // Aluminium Sheeted Frame
    .output(item('enderio:block_travel_anchor'))
    .register()

// Endervoir
crafting.shapedBuilder()
    .name(resource('gtlite:endervoir'))
    .shape('GGG',
           'GPG',
           'GGG')
    .key('G', item('appliedenergistics2:quartz_glass')) // Quartz Glass
    .key('P', metaitem('electric.pump.lv'))
    .output(item('enderio:block_reservoir') * 4)
    .register()

// Omnivoir
crafting.shapedBuilder()
    .name(resource('gtlite:omnivoir'))
    .shape('GGG',
           'GPG',
           'GGG')
    .key('G', item('appliedenergistics2:quartz_vibrant_glass'))
    .key('P', metaitem('electric.pump.mv'))
    .output(item('enderio:block_omni_reservoir'))
    .register()

// Basic Capacitor Bank
crafting.shapedBuilder()
    .name(resource('gtlite:basic_capacitor_bank'))
    .shape('FCF',
           'CBC',
           'FCF')
    .key('B', ore('batteryLv'))
    .key('C', basic_capacitor)
    .key('F', item('gtlitecore:meta_block_sheeted_frame_81', 4)) // Steel Sheeted Frame
    .output(item('enderio:block_cap_bank', 1))
    .register()

// Capacitor Bank
crafting.removeByOutput(item('enderio:block_cap_bank', 2))
crafting.shapedBuilder()
    .name(resource('gtlite:capacitor_bank'))
    .shape('FCF',
           'CBC',
           'FCF')
    .key('B', ore('batteryMv'))
    .key('C', double_layer_capacitor)
    .key('F', item('gtlitecore:meta_block_sheeted_frame_0', 6)) // Aluminium Sheeted Frame
    .output(item('enderio:block_cap_bank', 2))
    .register()

// Vibrant Capacitor Bank
crafting.removeByOutput(item('enderio:block_cap_bank', 3))
crafting.shapedBuilder()
    .name(resource('gtlite:vibrant_capacitor_bank'))
    .shape('FCF',
           'CBC',
           'FCF')
    .key('B', ore('batteryHv'))
    .key('C', octadic_capacitor)
    .key('F', item('gtlitecore:meta_block_sheeted_frame_80', 7)) // Stainless Steel Sheeted Frame
    .output(item('enderio:block_cap_bank', 3))
    .register()

// Basic Item Filter
crafting.shapedBuilder()
    .name(resource('gtlite:basic_item_filter'))
    .shape('AAA',
           'APA',
           'AAA')
    .key('P', ore('plateTin'))
    .key('A', item('minecraft:paper'))
    .output(item('enderio:item_basic_item_filter') * 4)
    .register()

forming_press.recipeBuilder()
    .inputs(ore('plateTin'))
    .inputs(item('minecraft:paper') * 2)
    .outputs(item('enderio:item_basic_item_filter') * 4)
    .EUt(VH[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

// Advanced Item Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:advanced_item_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            ore('gearSmallBronze')])
    .output(item('enderio:item_advanced_item_filter') * 2)
    .register()

// Limited Item Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:limited_item_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            ore('gearSmallTinAlloy')])
    .output(item('enderio:item_limited_item_filter') * 2)
    .register()

// Big Item Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:big_item_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            ore('pipeSmallItemBrass')])
    .output(item('enderio:item_big_item_filter') * 2)
    .register()

// Big Advanced Item Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:big_advanced_item_filter'))
    .input([item('enderio:item_advanced_item_filter'), 
            ore('pipeSmallItemBrass')])
    .output(item('enderio:item_big_advanced_item_filter') * 2)
    .register()

// Existing Item Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:existing_item_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            item('projectred-core:resource_item', 12)]) // Pointer
    .output(item('enderio:item_existing_item_filter') * 2)
    .register()

// Mod Item Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:mod_item_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            item('storagedrawers:upgrade_template')])
    .output(item('enderio:item_mod_item_filter') * 2)
    .register()

// Power Item Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:power_item_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            ore('springSmallBatteryAlloy')])
    .output(item('enderio:item_power_item_filter') * 2)
    .register()

// Enchantment Item Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:enchantment_item_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            ore('boltObsidian')])
    .output(item('enderio:item_enchantment_filter_normal') * 2)
    .register()

// Enchantment Big Item Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:enchantment_big_item_filter'))
    .input([item('enderio:item_big_item_filter'), ore('boltObsidian')])
    .output(item('enderio:item_enchantment_filter_big') * 2)
    .register()

// Basic Fluid Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:basic_fluid_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            ore('roundIron')])
    .output(item('enderio:item_fluid_filter') * 2)
    .register()

// Redstone NOT Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:redstone_not_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            item('projectred-integration:gate', 2)]) // NOT Gate
    .output(item('enderio:item_redstone_not_filter') * 2)
    .register()

// Redstone OR Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:redstone_or_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            item('projectred-integration:gate')]) // OR Gate
    .output(item('enderio:item_redstone_or_filter') * 2)
    .register()

// Redstone AND Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:redstone_and_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            item('projectred-integration:gate', 3)]) // AND Gate
    .output(item('enderio:item_redstone_and_filter') * 2)
    .register()

// Redstone NOR Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:redstone_nor_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            item('projectred-integration:gate', 1)]) // NOR Gate
    .output(item('enderio:item_redstone_nor_filter') * 2)
    .register()

// Redstone NAND Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:redstone_nand_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            item('projectred-integration:gate', 4)]) // NAND Gate
    .output(item('enderio:item_redstone_nand_filter') * 2)
    .register()

// Redstone XOR Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:redstone_xor_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            item('projectred-integration:gate', 5)]) // XOR Gate
    .output(item('enderio:item_redstone_xor_filter') * 2)
    .register()

// Redstone XNOR Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:redstone_xnor_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            item('projectred-integration:gate', 6)]) // XNOR Gate
    .output(item('enderio:item_redstone_xnor_filter') * 2)
    .register()

// Redstone Toggle Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:redstone_toggle_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            item('projectred-integration:gate', 12)]) // RS Toggle
    .output(item('enderio:item_redstone_toggle_filter') * 2)
    .register()

// Redstone Counting Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:redstone_counting_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            item('projectred-integration:gate', 19)]) // Counter
    .output(item('enderio:item_redstone_counting_filter') * 2)
    .register()

// Redstone Sensor Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:redstone_sensor_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            item('projectred-integration:gate', 21)]) // Synchronizer
    .output(item('enderio:item_redstone_sensor_filter') * 2)
    .register()

// Redstone Timer Filter
crafting.shapelessBuilder()
    .name(resource('gtlite:redstone_timer_filter'))
    .input([item('enderio:item_basic_item_filter'), 
            item('projectred-integration:gate', 17)]) // Timer
    .output(item('enderio:item_redstone_timer_filter') * 2)
    .register()

// Conduit Extract Speed Upgrade/Downgrade
crafting.shapelessBuilder()
    .name(resource('gtlite:conduit_extract_speed_upgrade'))
    .input([item('enderio:item_basic_item_filter'), 
            ore('springSmallNickel'), 
            ore('gearSmallNickel')])
    .output(item('enderio:item_extract_speed_upgrade') * 2)
    .register()

crafting.shapelessBuilder()
    .name(resource('gtlite:conduit_extract_speed_downgrade'))
    .input([item('enderio:item_extract_speed_upgrade')])
    .output(item('enderio:item_extract_speed_downgrade'))
    .register()

// Vacuum Chest
crafting.shapedBuilder()
    .name(resource('gtlite:vacuum_chest'))
    .shape('PHP',
           'PCP',
           'PGP')
    .key('C', metaitem('crate.bronze'))
    .key('H', item('minecraft:hopper'))
    .key('G', ore('gearSmallBronze'))
    .key('P', ore('plateBronze'))
    .output(item('enderio:block_vacuum_chest'))
    .register()

// XP Vacuum Chest
crafting.shapedBuilder()
    .name(resource('gtlite:xp_vacuum_chest'))
    .shape('PHP', 
           'PCP',
           'PGP')
    .key('C', metaitem('crate.steel'))
    .key('H', item('minecraft:experience_bottle'))
    .key('G', ore('gearSmallSteel'))
    .key('P', ore('plateSteel'))
    .output(item('enderio:block_xp_vacuum'))
    .register()

// Cold Fire Igniter
crafting.shapelessBuilder()
    .name(resource('gtlite:cold_fire_igniter'))
    .input([item('minecraft:flint_and_steel'), 
            metaitem('fluid_cell'),
            ore('roundTinAlloy')])
    .output(item('enderio:item_cold_fire_igniter'))
    .register()