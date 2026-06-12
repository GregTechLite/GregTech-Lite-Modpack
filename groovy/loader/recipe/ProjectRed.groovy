import static gregtech.api.GTValues.*
import static util.GroovyUtil.*

log.info("Starting to load projectred recipes...")

def circuit_board = item('projectred-core:resource_item')
def silicon_chip = item('projectred-core:resource_item', 20)
def energized_silicon_chip = item('projectred-core:resource_item', 21)
def ic_chip = item('projectred-fabrication:ic_chip')
def ic_workbench = item('projectred-fabrication:ic_machine')
def ic_printer = item('projectred-fabrication:ic_machine', 1)
def ic_blueprint = item('projectred-fabrication:ic_blueprint')
def screwdriver = item('projectred-core:screwdriver')
def multimeter = item('projectred-core:multimeter')
def red_alloy_wire = item('projectred-transmission:wire')
def framed_red_alloy_wire = item('projectred-transmission:framed_wire')
def bundled_cable = item('projectred-transmission:wire', 17)
def framed_bundled_cable = item('projectred-transmission:framed_wire', 17)
def low_load_wire = item('projectred-transmission:wire', 34)
def framed_low_load_wire = item('projectred-transmission:framed_wire', 34)

def assembler = recipemap('assembler')
def laser_engraver = recipemap('laser_engraver')
def polarizer = recipemap('polarizer')
def vacuum_chamber = recipemap('vacuum_chamber')
def chemical_bath = recipemap('chemical_bath')
def compressor = recipemap('compressor')

// Circuit Board
furnace.removeByOutput(circuit_board * 2)
furnace.add(metaitem('plateStone'), circuit_board * 2)

// Silicon Chip
crafting.removeByOutput(silicon_chip)
crafting.shapedBuilder()
    .name(resource('gtlite:silicon_chip'))
    .shape('   ',
           ' S ',
           'BBB')
    .key('B', circuit_board)
    .key('S', ore('dustSilicon'))
    .output(silicon_chip * 4)
    .register()

laser_engraver.recipeBuilder()
    .notConsumable(ore('craftingLensRed'))
    .inputs(circuit_board)
    .outputs(silicon_chip * 4)
    .EUt(VA[LV])
    .duration(5 * SECOND)
    .buildAndRegister()

// Energized Silicon Chip
crafting.removeByOutput(energized_silicon_chip)
polarizer.recipeBuilder()
    .inputs(silicon_chip)
    .outputs(energized_silicon_chip)
    .EUt(7) // ULV
    .duration(2 * SECOND)
    .buildAndRegister()

// IC Chip
crafting.removeByOutput(ic_chip)
laser_engraver.recipeBuilder()
    .notConsumable(ore('craftingLensBlue'))
    .inputs(ore('circuitUlv'))
    .outputs(ic_chip)
    .EUt(VA[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// IC Workbench
crafting.removeByOutput(ic_workbench)
crafting.shapedBuilder()
    .name(resource('gtlite:ic_workbench'))
    .shape('PSP',
           'AWA',
           'A A')
    .key('P', ore('plateSteel'))
    .key('A', ore('stickSteel'))
    .key('W', metaitem('workbench'))
    .key('S', metaitem('cover.screen'))
    .output(ic_workbench)
    .register()

assembler.recipeBuilder()
    .circuitMeta(13)
    .inputs(metaitem('workbench'))
    .inputs(metaitem('cover.screen'))
    .inputs(ore('plateSteel') * 2)
    .inputs(ore('stickSteel') * 4)
    .outputs(ic_workbench)
    .EUt(VH[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// IC Printer
crafting.removeByOutput(ic_printer)
crafting.shapedBuilder()
    .name(resource('gtlite:ic_printer'))
    .shape('GGG',
           'CHR',
           'PwP')
    .key('C', metaitem('conveyor.module.lv'))
    .key('R', metaitem('robot.arm.lv'))
    .key('H', item('minecraft:bookshelf'))
    .key('G', item('minecraft:glass'))
    .key('P', ore('plankWood'))
    .key('w', ore('toolWrench'))
    .output(ic_printer)
    .register()

assembler.recipeBuilder()
    .circuitMeta(13)
    .inputs(item('minecraft:bookshelf'))
    .inputs(item('minecraft:glass') * 3)
    .inputs(metaitem('conveyor.module.lv'))
    .inputs(metaitem('robot.arm.lv'))
    .inputs(ore('plankWood') * 2)
    .outputs(ic_printer)
    .EUt(VH[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// IC Blueprint
crafting.removeByOutput(ic_blueprint)
crafting.shapelessBuilder()
    .name(resource('gtlite:ic_blueprint'))
    .input([item('minecraft:paper'), ore('dyeBlue')])
    .output(ic_blueprint)
    .register()

chemical_bath.recipeBuilder()
    .inputs(item('minecraft:paper'))
    .fluidInputs(fluid('dye_blue') * 9)
    .outputs(ic_blueprint)
    .EUt(7) // ULV
    .duration(2 * TICK)
    .buildAndRegister()

// Screwdriver
crafting.removeByOutput(screwdriver)
crafting.shapedBuilder()
    .name(resource('gtlite:redstone_screwdriver'))
    .shape(' fS',
           ' Sh',
           'T  ')
    .key('S', ore('stickIron'))
    .key('T', ore('stickLapis'))
    .key('f', ore('toolFile'))
    .key('h', ore('toolHammer'))
    .output(screwdriver)
    .register()

// Multimeter
crafting.removeByOutput(multimeter)
crafting.shapedBuilder()
    .name(resource('gtlite:multimeter'))
    .shape('RxR',
           'PBP',
           'SwS')
    .key('B', metaitem('battery.hull.lv'))
    .key('P', ore('plateIron'))
    .key('S', ore('screwIronMagnetic'))
    .key('R', ore('springSmallRedAlloy'))
    .key('x', ore('toolWireCutter'))
    .key('w', ore('toolWrench'))
    .output(multimeter)
    .register()

// Wire
crafting.removeByOutput(red_alloy_wire)
crafting.shapelessBuilder()
    .name(resource('gtlite:transmission_wire'))
    .input(ore('wireGtSingleRedAlloy'))
    .output(red_alloy_wire * 2)
    .register()

vacuum_chamber.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('wireGtSingleRedAlloy'))
    .outputs(red_alloy_wire * 2)
    .EUt(VA[ULV])
    .duration(10 * TICK)
    .buildAndRegister()

// Framed Wire
crafting.removeByOutput(framed_red_alloy_wire)
crafting.shapelessBuilder()
    .name(resource('gtlite:framed_transmission_wire'))
    .input([red_alloy_wire, ore('frameGtWood')])
    .output(framed_red_alloy_wire)
    .register()

assembler.recipeBuilder()
    .circuitMeta(2)
    .inputs(red_alloy_wire)
    .inputs(ore('frameGtWood'))
    .outputs(framed_red_alloy_wire)
    .EUt(VA[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Colored Wires
def dyeColors = [ 'white', 'orange', 'magenta', 'light_blue',
                  'yellow', 'lime', 'pink', 'gray',
                  'light_gray', 'cyan', 'purple', 'blue',
                  'brown', 'green', 'red', 'black' ]

def dyeColorOres = [ 'dyeWhite', 'dyeOrange', 'dyeMagenta', 'dyeLightBlue',
                     'dyeYellow', 'dyeLime', 'dyePink', 'dyeGray',
                     'dyeLightGray', 'dyeCyan', 'dyePurple', 'dyeBlue',
                     'dyeBrown', 'dyeGreen', 'dyeRed', 'dyeBlack' ]

for (int i = 0; i < 16; i++) {
    crafting.removeByOutput(item('projectred-transmission:wire', i + 1))
    crafting.shapedBuilder()
        .name(resource('gtlite:transmission_wire_' + dyeColors[i]))
        .shape('WWW',
               'WDW',
               'WWW')
        .key('W', red_alloy_wire)
        .key('D', ore(dyeColorOres[i]))
        .output(item('projectred-transmission:wire', i + 1) * 8)
        .register()

    chemical_bath.recipeBuilder()
        .inputs(red_alloy_wire)
        .fluidInputs(fluid('dye_' + dyeColors[i]) * 18)
        .outputs(item('projectred-transmission:wire', i + 1))
        .EUt(VA[LV])
        .duration(TICK)
        .buildAndRegister()

    chemical_bath.recipeBuilder()
        .inputs(item('projectred-transmission:wire', i + 1))
        .fluidInputs(fluid('water') * 100)
        .outputs(red_alloy_wire)
        .EUt(VA[LV])
        .duration(TICK)
        .buildAndRegister()
}

// Colored Framed Wires
for (int i = 0; i < 16; i++) {
    crafting.removeByOutput(item('projectred-transmission:framed_wire', i + 1))
    crafting.shapedBuilder()
        .name(resource('gtlite:framed_transmission_wire_' + dyeColors[i]))
        .shape('WWW',
               'WDW',
               'WWW')
        .key('W', framed_red_alloy_wire)
        .key('D', ore(dyeColorOres[i]))
        .output(item('projectred-transmission:framed_wire', i + 1) * 8)
        .register()

    chemical_bath.recipeBuilder()
        .inputs(framed_red_alloy_wire)
        .fluidInputs(fluid('dye_' + dyeColors[i]) * 18)
        .outputs(item('projectred-transmission:framed_wire', i + 1))
        .EUt(VA[LV])
        .duration(TICK)
        .buildAndRegister()

    chemical_bath.recipeBuilder()
        .inputs(item('projectred-transmission:framed_wire', i + 1))
        .fluidInputs(fluid('water') * 100)
        .outputs(framed_red_alloy_wire)
        .EUt(VA[LV])
        .duration(TICK)
        .buildAndRegister()
}

// Bundled Cable
crafting.removeByOutput(bundled_cable)
crafting.shapelessBuilder()
    .name(resource('gtlite:bundled_cable'))
    .input([red_alloy_wire, ore('ringTin'), item('minecraft:string')])
    .output(bundled_cable)
    .register()

compressor.recipeBuilder()
    .inputs(red_alloy_wire)
    .outputs(bundled_cable)
    .EUt(VH[ULV])
    .duration(5 * TICK)
    .buildAndRegister()

// Framed Bundled Cable
crafting.removeByOutput(framed_bundled_cable)
crafting.shapelessBuilder()
    .name(resource('gtlite:framed_bundled_transmission_wire'))
    .input([bundled_cable, ore('frameGtWood')])
    .output([framed_bundled_cable])
    .register()

assembler.recipeBuilder()
    .circuitMeta(2)
    .inputs(bundled_cable)
    .inputs(ore('frameGtWood'))
    .outputs(framed_bundled_cable)
    .EUt(VA[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Colored Bundled Cables
for (int i = 17; i < 33; i++) {
    crafting.removeByOutput(item('projectred-transmission:wire', i + 1))
    crafting.shapedBuilder()
        .name(resource('gtlite:bundled_cable_' + dyeColors[i - 17]))
        .shape('WWW',
               'WDW',
               'WWW')
        .key('W', bundled_cable)
        .key('D', ore(dyeColorOres[i - 17]))
        .output(item('projectred-transmission:wire', i + 1) * 8)
        .register()

    chemical_bath.recipeBuilder()
        .inputs(bundled_cable)
        .fluidInputs(fluid('dye_' + dyeColors[i - 17]) * 18)
        .outputs(item('projectred-transmission:wire', i + 1))
        .EUt(VA[LV])
        .duration(TICK)
        .buildAndRegister()

    chemical_bath.recipeBuilder()
        .inputs(item('projectred-transmission:wire', i + 1))
        .fluidInputs(fluid('water') * 100)
        .outputs(bundled_cable)
        .EUt(VA[LV])
        .duration(TICK)
        .buildAndRegister()
}

// Low Load Wire
crafting.removeByOutput(low_load_wire)
crafting.shapelessBuilder()
    .name(resource('gtlite:low_load_transmission_wire'))
    .input(ore('wireGtSingleBlueAlloy'))
    .output(low_load_wire * 4)
    .register()

vacuum_chamber.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('wireGtSingleBlueAlloy'))
    .outputs(low_load_wire * 4)
    .EUt(VA[ULV])
    .duration(10 * TICK)
    .buildAndRegister()

// Framed Low Load Wire
crafting.removeByOutput(framed_low_load_wire)
crafting.shapelessBuilder()
    .name(resource('gtlite:framed_low_load_transmission_wire'))
    .input([low_load_wire, ore('frameGtWood')])
    .output([framed_low_load_wire])
    .register()

assembler.recipeBuilder()
    .circuitMeta(2)
    .inputs(low_load_wire)
    .inputs(ore('frameGtWood'))
    .outputs(framed_low_load_wire)
    .EUt(VA[LV])
    .duration(2 * SECOND + 10 * TICK)
    .buildAndRegister()

// Illumar
for (int i = 500; i < 516; i++) {
    crafting.removeByOutput(item('projectred-core:resource_item', i))
    crafting.shapedBuilder()
        .name(resource('gtlite:illumar_' + dyeColors[i - 500]))
        .shape('WWW',
                'WDW',
                'WWW')
        .key('W', item('minecraft:glowstone_dust'))
        .key('D', ore(dyeColorOres[i - 500]))
        .output(item('projectred-core:resource_item', i) * 8)
        .register()

    chemical_bath.recipeBuilder()
        .inputs(item('minecraft:glowstone_dust'))
        .fluidInputs(fluid('dye_' + dyeColors[i - 500]) * 18)
        .outputs(item('projectred-core:resource_item', i))
        .EUt(VA[LV])
        .duration(TICK)
        .buildAndRegister()
}

log.info("Complete load projectred recipes!")