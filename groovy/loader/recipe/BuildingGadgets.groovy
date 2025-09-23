log.info("Starting to load BuildingGadgets Recipes...")

// Building Gadget
crafting.removeByOutput(item('buildinggadgets:buildingtool'))
crafting.shapedBuilder()
    .name(resource('gtlite:building_gadget'))
    .shape('ESR',
           'PWP',
           'PBP')
    .key('B', ore('batteryLv'))
    .key('S', metaitem('cover.screen'))
    .key('W', item('betterbuilderswands:wanddiamond'))
    .key('E', metaitem('emitter.lv'))
    .key('R', metaitem('sensor.lv'))
    .key('P', ore('plateSteel'))
    .output(item('buildinggadgets:buildingtool'))
    .register()

// Exchanging Gadget
crafting.removeByOutput(item('buildinggadgets:exchangertool'))
crafting.shapedBuilder()
    .name(resource('gtlite:exchanging_gadget'))
    .shape('ESR',
           'PCP',
           'PBP')
    .key('B', ore('batteryLv'))
    .key('S', metaitem('cover.screen'))
    .key('R', metaitem('robot.arm.lv'))
    .key('E', metaitem('emitter.lv'))
    .key('C', item('enderutilities:linkcrystal'))
    .key('P', ore('plateSteel'))
    .output(item('buildinggadgets:exchangertool'))
    .register()

// Copy-Paste Gadget
crafting.removeByOutput(item('buildinggadgets:copypastetool'))
crafting.shapedBuilder()
    .name(resource('gtlite:copy_paste_gadget'))
    .shape('ESE',
           'APA',
           'WXW')
    .key('E', metaitem('emitter.lv'))
    .key('P', item('enderutilities:endertool')) // Ender Pickaxe
    .key('X', ore('circuitMv'))
    .key('W', metaitem('voltage_coil.lv'))
    .key('S', metaitem('cover.screen'))
    .key('A', ore('plateSteel'))
    .output(item('buildinggadgets:copypastetool'))
    .register()

// Destruction Gadget
crafting.removeByOutput(item('buildinggadgets:destructiontool'))
crafting.shapedBuilder()
    .name(resource('gtlite:destruction_gadget'))
    .shape('PSP',
           'PCP',
           'VEV')
    .key('E', metaitem('emitter.lv'))
    .key('C', metaitem('conveyor.module.lv'))
    .key('S', metaitem('cover.screen'))
    .key('V', item('enderutilities:void_pickaxe'))
    .key('P', ore('plateSteel'))
    .output(item('buildinggadgets:destructiontool'))
    .register()