import static gregtech.api.GTValues.*

import static util.GroovyUtil.*

log.info("Starting to load Chisel Recipes...")

/* -------------------------------------------------------------------------- */
def assembler = recipemap('assembler')
/* -------------------------------------------------------------------------- */
def redstone_torch_group = 'redstone_torch'
def wooden_pressure_plate_group = 'wooden_pressure_plate'
def stone_pressure_plate_group = 'stone_pressure_plate'
def heavy_weighted_pressure_plate_group = 'heavy_weighted_pressure_plate'
def light_weighted_pressure_plate_group = 'light_weighted_pressure_plate'
def dark_steel_pressure_plate_group = 'dark_steel_pressure_plate'
def block_detector_group = 'block_detector'
def p2p_tunnels_group = 'p2p_tunnels'
/* -------------------------------------------------------------------------- */

// Redstone Torch Group
crafting.removeByOutput(item('appliedenergistics2:light_detector'))
mods.chisel.carving.addGroup(redstone_torch_group)
mods.chisel.carving.addVariation(redstone_torch_group, item('minecraft:redstone_torch'))
mods.chisel.carving.addVariation(redstone_torch_group, item('appliedenergistics2:quartz_fixture'))
mods.chisel.carving.addVariation(redstone_torch_group, item('appliedenergistics2:light_detector'))

// Wooden Pressure Plate
mods.chisel.carving.addGroup(wooden_pressure_plate_group)
mods.chisel.carving.addVariation(wooden_pressure_plate_group, item('minecraft:wooden_pressure_plate'))
mods.chisel.carving.addVariation(wooden_pressure_plate_group, item('enderio:block_painted_pressure_plate', 1))

// Stone Pressure Plate
mods.chisel.carving.addGroup(stone_pressure_plate_group)
mods.chisel.carving.addVariation(stone_pressure_plate_group, item('minecraft:stone_pressure_plate'))
mods.chisel.carving.addVariation(stone_pressure_plate_group, item('enderio:block_painted_pressure_plate', 3))

// Heavy Weighted Pressure Plate
mods.chisel.carving.addGroup(heavy_weighted_pressure_plate_group)
mods.chisel.carving.addVariation(heavy_weighted_pressure_plate_group, item('minecraft:heavy_weighted_pressure_plate'))
mods.chisel.carving.addVariation(heavy_weighted_pressure_plate_group, item('enderio:block_painted_pressure_plate', 5))

// Light Weighted Pressure Plate
mods.chisel.carving.addGroup(light_weighted_pressure_plate_group)
mods.chisel.carving.addVariation(light_weighted_pressure_plate_group, item('minecraft:light_weighted_pressure_plate'))
mods.chisel.carving.addVariation(light_weighted_pressure_plate_group, item('enderio:block_painted_pressure_plate', 7))

// Dark Steel Pressure Plate
crafting.shapedBuilder()
    .name(resource('gtlite:dark_steel_pressure_plate'))
    .shape('   ',
           'II ',
           '   ')
    .key('I', ore('ingotSteel'))
    .output(item('enderio:block_painted_pressure_plate', 8))
    .register()

assembler.recipeBuilder()
    .circuitMeta(2)
    .inputs(ore('ingotSteel') * 2)
    .outputs(item('enderio:block_painted_pressure_plate', 8))
    .EUt(4) // ULV
    .duration(5 * SECOND)
    .buildAndRegister()

mods.chisel.carving.addGroup(dark_steel_pressure_plate_group)
mods.chisel.carving.addVariation(dark_steel_pressure_plate_group, item('enderio:block_painted_pressure_plate', 8))
mods.chisel.carving.addVariation(dark_steel_pressure_plate_group, item('enderio:block_painted_pressure_plate', 9))

// Block Detector
crafting.shapedBuilder()
    .name(resource('gtlite:block_detector'))
    .shape('PSP',
           'GRG',
           'PPP')
    .key('R', item('projectred-core:resource_item', 2)) // Wire Board
    .key('S', metaitem('sensor.lv'))
    .key('P', ore('plateSteel'))
    .key('G', item('minecraft:glass'))
    .output(item('enderio:block_detector_block'))
    .register()

mods.chisel.carving.addGroup(block_detector_group)
mods.chisel.carving.addVariation(block_detector_group, item('enderio:block_detector_block'))
mods.chisel.carving.addVariation(block_detector_group, item('enderio:block_detector_block_silent'))

// P2P Tunnels
mods.chisel.carving.addGroup(p2p_tunnels_group)
mods.chisel.carving.addVariation(p2p_tunnels_group, item('appliedenergistics2:part', 460)) // ME
mods.chisel.carving.addVariation(p2p_tunnels_group, item('appliedenergistics2:part', 461)) // Redstone
mods.chisel.carving.addVariation(p2p_tunnels_group, item('appliedenergistics2:part', 462)) // Item
mods.chisel.carving.addVariation(p2p_tunnels_group, item('appliedenergistics2:part', 463)) // Fluid
mods.chisel.carving.addVariation(p2p_tunnels_group, item('appliedenergistics2:part', 467)) // Light
mods.chisel.carving.addVariation(p2p_tunnels_group, item('appliedenergistics2:part', 469)) // FE
mods.chisel.carving.addVariation(p2p_tunnels_group, item('appliedenergistics2:part', 470)) // GTEU
