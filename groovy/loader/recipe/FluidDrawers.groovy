log.info("Starting to load FluidDrawers Recipes...")

// Fluid Drawer
crafting.removeByOutput(item('fluiddrawers:tank'))
crafting.shapedBuilder()
    .name(resource('gtlite:fluid_drawer_1'))
    .shape('PPP',
           'GDG',
           'PPP')
    .key('P', ore('plateSteel'))
    .key('D', item('gtlitecore:mte', 2001)) // Iron Drum
    .key('G', item('minecraft:glass_pane'))
    .output(item('fluiddrawers:tank'))
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:fluid_drawer_2'))
    .shape('PPP',
           'GDG',
           'PPP')
    .key('P', ore('plateSteel'))
    .key('D', item('gtlitecore:mte', 2001)) // Iron Drum
    .key('G', ore('plateGlass'))
    .output(item('fluiddrawers:tank'))
    .register()