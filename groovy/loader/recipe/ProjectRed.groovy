import static gregtech.api.GTValues.*

import static util.GroovyUtil.*

log.info("Starting to load ProjectRed Recipes...")

/* -------------------------------------------------------------------------- */
def assembler = recipemap('assembler')
def laser_engraver = recipemap('laser_engraver')
def polarizer = recipemap('polarizer')
def vacuum_chamber = recipemap('vacuum_chamber')
def chemical_bath = recipemap('chemical_bath')
/* -------------------------------------------------------------------------- */

// Circuit Board
furnace.removeByOutput(item('projectred-core:resource_item') * 2)
furnace.add(item('gregtech:meta_plate', 1599), item('projectred-core:resource_item') * 2)

// Silicon Chip
crafting.removeByOutput(item('projectred-core:resource_item', 20))
crafting.shapedBuilder()
        .name(resource('gtlite:pr_silicon_chip'))
        .shape('   ',
                ' S ',
                'BBB')
        .key('B', item('projectred-core:resource_item')) // Circuit Board
        .key('S', ore('dustSilicon'))
        .output(item('projectred-core:resource_item', 20) * 4) // Silicon Chip
        .register()

laser_engraver.recipeBuilder()
        .notConsumable(ore('craftingLensRed'))
        .inputs(item('projectred-core:resource_item')) // Circuit Board
        .outputs(item('projectred-core:resource_item', 20) * 4) // Silicon Chip
        .EUt(VA[LV])
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
        .EUt(VA[LV])
        .duration(2 * SECOND + 10 * TICK)
        .buildAndRegister()

// IC Workbench
crafting.removeByOutput(item('projectred-fabrication:ic_machine'))
crafting.shapedBuilder()
        .name(resource('gtlite:ic_workbench'))
        .shape('PSP',
                'AWA',
                'A A')
        .key('P', ore('plateSteel'))
        .key('A', ore('stickSteel'))
        .key('W', item('gregtech:mte', 5647)) // Workbench (GregTech)
        .key('S', item('gregtech:meta_item_1', 307)) // Screen Cover
        .output(item('projectred-fabrication:ic_machine'))
        .register()

assembler.recipeBuilder()
        .circuitMeta(13)
        .inputs(item('gregtech:mte', 5647)) // Workbench (GregTech)
        .inputs(item('gregtech:meta_item_1', 307)) // Screen Cover
        .inputs(ore('plateSteel') * 2)
        .inputs(ore('stickSteel') * 4)
        .outputs(item('projectred-fabrication:ic_machine'))
        .EUt(VH[LV])
        .duration(2 * SECOND + 10 * TICK)
        .buildAndRegister()

// IC Printer
crafting.removeByOutput(item('projectred-fabrication:ic_machine', 1))
crafting.shapedBuilder()
        .name(resource('gtlite:ic_printer'))
        .shape('GGG',
                'CHR',
                'PwP')
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
        .EUt(VH[LV])
        .duration(2 * SECOND + 10 * TICK)
        .buildAndRegister()

// Screwdriver
crafting.removeByOutput(item('projectred-core:screwdriver'))
crafting.shapedBuilder()
        .name(resource('gtlite:pr_screwdriver'))
        .shape(' fS',
                ' Sh',
                'T  ')
        .key('S', ore('stickIron'))
        .key('T', ore('stickLapis'))
        .key('f', ore('toolFile'))
        .key('h', ore('toolHammer'))
        .output(item('projectred-core:screwdriver'))
        .register()

// Multimeter
crafting.removeByOutput(item('projectred-core:multimeter'))
crafting.shapedBuilder()
        .name(resource('gtlite:multimeter'))
        .shape('RxR',
                'PBP',
                'SwS')
        .key('B', item('gregtech:meta_item_1', 717)) // LV Battery Hull
        .key('P', ore('plateIron'))
        .key('S', ore('screwIronMagnetic'))
        .key('R', ore('springSmallRedAlloy'))
        .key('x', ore('toolWireCutter'))
        .key('w', ore('toolWrench'))
        .output(item('projectred-core:multimeter'))
        .register()

// Wire
crafting.removeByOutput(item('projectred-transmission:wire'))
crafting.shapelessBuilder()
        .name(resource('gtlite:transmission_wire'))
        .input([ore('wireGtSingleRedAlloy')])
        .output([item('projectred-transmission:wire') * 2])
        .register()

vacuum_chamber.recipeBuilder()
        .circuitMeta(1)
        .inputs(ore('wireGtSingleRedAlloy'))
        .outputs(item('projectred-transmission:wire') * 2)
        .EUt(VA[ULV])
        .duration(10 * TICK)
        .buildAndRegister()

// Framed Wire
crafting.removeByOutput(item('projectred-transmission:framed_wire'))
crafting.shapelessBuilder()
        .name(resource('gtlite:framed_transmission_wire'))
        .input([item('projectred-transmission:wire'), ore('frameGtWood')])
        .output([item('projectred-transmission:framed_wire')])
        .register()

assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs(item('projectred-transmission:wire'))
        .inputs(ore('frameGtWood'))
        .outputs(item('projectred-transmission:framed_wire'))
        .EUt(VA[LV])
        .duration(2 * SECOND + 10 * TICK)
        .buildAndRegister()

// Colored Wires
def dyeColors = [ 'white', 'orange', 'magenta', 'light_blue',
                  'yellow', 'lime', 'pink', 'gray',
                  'light_gray', 'cyan', 'purple', 'blue',
                  'brown', 'green', 'red', 'black'
]

def dyeColorOres = [ 'dyeWhite', 'dyeOrange', 'dyeMagenta', 'dyeLightBlue',
                     'dyeYellow', 'dyeLime', 'dyePink', 'dyeGray',
                     'dyeLightGray', 'dyeCyan', 'dyePurple', 'dyeBlue',
                     'dyeBrown', 'dyeGreen', 'dyeRed', 'dyeBlack'
]

for (int i = 0; i < 16; i++) {
    crafting.removeByOutput(item('projectred-transmission:wire', i + 1))
    crafting.shapedBuilder()
            .name(resource('gtlite:transmission_wire_' + dyeColors[i]))
            .shape('WWW',
                    'WDW',
                    'WWW')
            .key('W', item('projectred-transmission:wire'))
            .key('D', ore(dyeColorOres[i]))
            .output(item('projectred-transmission:wire', i + 1))
            .register()

    chemical_bath.recipeBuilder()
            .inputs(item('projectred-transmission:wire'))
            .fluidInputs(fluid('dye_' + dyeColors[i]) * 36)
            .outputs(item('projectred-transmission:wire', i + 1))
            .EUt(VA[LV])
            .duration(TICK)
            .buildAndRegister()

    chemical_bath.recipeBuilder()
            .inputs(item('projectred-transmission:wire', i + 1))
            .fluidInputs(fluid('water') * 100)
            .outputs(item('projectred-transmission:wire'))
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
            .key('W', item('projectred-transmission:framed_wire'))
            .key('D', ore(dyeColorOres[i]))
            .output(item('projectred-transmission:framed_wire', i + 1))
            .register()

    chemical_bath.recipeBuilder()
            .inputs(item('projectred-transmission:framed_wire'))
            .fluidInputs(fluid('dye_' + dyeColors[i]) * 36)
            .outputs(item('projectred-transmission:framed_wire', i + 1))
            .EUt(VA[LV])
            .duration(TICK)
            .buildAndRegister()

    chemical_bath.recipeBuilder()
            .inputs(item('projectred-transmission:framed_wire', i + 1))
            .fluidInputs(fluid('water') * 100)
            .outputs(item('projectred-transmission:framed_wire'))
            .EUt(VA[LV])
            .duration(TICK)
            .buildAndRegister()
}
