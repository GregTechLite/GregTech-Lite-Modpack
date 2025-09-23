
log.info("Starting to load Entangled Recipes...")

// Entangled Block
crafting.shapedBuilder()
    .name(resource('entangled:block'))
    .replaceByName()
    .shape('GXG',
           'CHC',
           'GQG')
    .key('Q', item('appliedenergistics2:quantum_ring'))
    .key('G', item('gtlitecore:meta_block_sheeted_frame_627', 6)) // Red Steel Sheeted Frame
    .key('X', ore('circuitIv'))
    .key('C', item('enderutilities:enderpart', 17)) // Advanced Ender Core
    .key('H', item('gtlitecore:mte', 2054)) // Universal Bridger
    .output(item('entangled:block'))
    .register()

// Entangled Binder
crafting.shapedBuilder()
    .name(resource('entangled:item'))
    .replaceByName()
    .shape('  E',
           ' R ',
           'R  ')
    .key('E', item('enderutilities:enderporter')) // Ender Porter
    .key('R', ore('stickTungstenSteel'))
    .output(item('entangled:item'))
    .register()