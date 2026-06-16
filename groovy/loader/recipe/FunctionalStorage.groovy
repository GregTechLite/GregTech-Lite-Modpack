log.info("Starting to load functionalstorage recipes...")

import static gregtech.api.GTValues.*
import static util.GroovyUtil.*

def assembler = recipemap('assembler')

// Iron Downgrade
crafting.removeByOutput(item('functionalstoragelegacy:iron_downgrade'))
crafting.shapedBuilder()
    .name(resource('gtlite:drawer_iron_downgrade'))
    .shape('PdP',
           'PUP',
           'PSP')
    .key('U', ore('drawerAny'))
    .key('P', ore('plateIron'))
    .key('S', ore('screwIron'))
    .key('d', ore('toolScrewdriver'))
    .output(item('functionalstoragelegacy:iron_downgrade') * 2)
    .register()

assembler.recipeBuilder()
    .circuitMeta(6)
    .inputs(ore('drawerAny'))
    .inputs(ore('plateIron') * 6)
    .outputs(item('functionalstoragelegacy:iron_downgrade') * 2)
    .EUt(VA[LV])
    .duration(4 * SECOND + 16 * TICK)
    .buildAndRegister()

// Copper Upgrade
crafting.removeByOutput(item('functionalstoragelegacy:copper_upgrade'))
crafting.shapedBuilder()
    .name(resource('gtlite:drawer_copper_upgrade'))
    .shape('PdP',
           'PUP',
           'PSP')
    .key('U', ore('drawerAny'))
    .key('P', ore('plateCopper'))
    .key('S', ore('screwCopper'))
    .key('d', ore('toolScrewdriver'))
    .output(item('functionalstoragelegacy:copper_upgrade') * 2)
    .register()

assembler.recipeBuilder()
    .circuitMeta(6)
    .inputs(ore('drawerAny'))
    .inputs(ore('plateCopper') * 6)
    .outputs(item('functionalstoragelegacy:copper_upgrade') * 2)
    .EUt(VA[LV])
    .duration(4 * SECOND + 16 * TICK)
    .buildAndRegister()

// Gold Upgrade
crafting.removeByOutput(item('functionalstoragelegacy:gold_upgrade'))
crafting.shapedBuilder()
    .name(resource('gtlite:drawer_gold_upgrade'))
    .shape('PdP',
           'PUP',
           'PSP')
    .key('U', item('functionalstoragelegacy:copper_upgrade'))
    .key('P', ore('plateGold'))
    .key('S', ore('screwGold'))
    .key('d', ore('toolScrewdriver'))
    .output(item('functionalstoragelegacy:gold_upgrade') * 2)
    .register()

assembler.recipeBuilder()
    .circuitMeta(6)
    .inputs(item('functionalstoragelegacy:copper_upgrade'))
    .inputs(ore('plateGold') * 6)
    .outputs(item('functionalstoragelegacy:gold_upgrade') * 2)
    .EUt(VA[LV])
    .duration(4 * SECOND + 16 * TICK)
    .buildAndRegister()

// Diamond Upgrade
crafting.removeByOutput(item('functionalstoragelegacy:diamond_upgrade'))
crafting.shapedBuilder()
    .name(resource('gtlite:drawer_diamond_upgrade'))
    .shape('PdP',
           'PUP',
           'PSP')
    .key('U', item('functionalstoragelegacy:gold_upgrade'))
    .key('P', ore('plateDiamond'))
    .key('S', ore('screwDiamond'))
    .key('d', ore('toolScrewdriver'))
    .output(item('functionalstoragelegacy:diamond_upgrade') * 2)
    .register()

assembler.recipeBuilder()
    .circuitMeta(6)
    .inputs(item('functionalstoragelegacy:gold_upgrade'))
    .inputs(ore('plateDiamond') * 6)
    .outputs(item('functionalstoragelegacy:diamond_upgrade') * 2)
    .EUt(VA[LV])
    .duration(4 * SECOND + 16 * TICK)
    .buildAndRegister()

// Obsidian Upgrade
crafting.removeByOutput(item('functionalstoragelegacy:netherite_upgrade'))
crafting.shapedBuilder()
    .name(resource('gtlite:drawer_netherite_upgrade'))
    .shape('PdP',
           'PUP',
           'PSP')
    .key('U', item('functionalstoragelegacy:diamond_upgrade'))
    .key('P', ore('plateObsidian'))
    .key('S', ore('screwObsidian'))
    .key('d', ore('toolScrewdriver'))
    .output(item('functionalstoragelegacy:netherite_upgrade') * 2)
    .register()

assembler.recipeBuilder()
    .circuitMeta(6)
    .inputs(item('functionalstoragelegacy:diamond_upgrade'))
    .inputs(ore('plateObsidian') * 6)
    .outputs(item('functionalstoragelegacy:netherite_upgrade') * 2)
    .EUt(VA[LV])
    .duration(4 * SECOND + 16 * TICK)
    .buildAndRegister()

// 1x1 Fluid Drawer
crafting.removeByOutput(item('functionalstoragelegacy:fluid_1'))
crafting.shapedBuilder()
    .name(resource('gtlite:fluid_drawer_1x1a'))
    .shape('PPP',
           'GDG',
           'PPP')
    .key('D', metaitem('gtlitecore:drum.iron'))
    .key('P', ore('plateSteel'))
    .key('G', item('minecraft:glass_pane'))
    .output(item('functionalstoragelegacy:fluid_1'))
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:fluid_drawer_1x1b'))
    .shape('PPP',
           'GDG',
           'PPP')
    .key('D', metaitem('gtlitecore:drum.iron'))
    .key('P', ore('plateSteel'))
    .key('G', ore('plateGlass'))
    .output(item('functionalstoragelegacy:fluid_1'))
    .register()

// 1x2 Fluid Drawer
crafting.removeByOutput(item('functionalstoragelegacy:fluid_2'))
crafting.shapedBuilder()
    .name(resource('gtlite:fluid_drawer_1x2a'))
    .shape('PPP',
           'DGD',
           'PPP')
    .key('D', metaitem('gtlitecore:drum.iron'))
    .key('P', ore('plateSteel'))
    .key('G', item('minecraft:glass_pane'))
    .output(item('functionalstoragelegacy:fluid_2'))
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:fluid_drawer_1x2b'))
    .shape('PPP',
           'DGD',
           'PPP')
    .key('D', metaitem('gtlitecore:drum.iron'))
    .key('P', ore('plateSteel'))
    .key('G', ore('plateGlass'))
    .output(item('functionalstoragelegacy:fluid_2'))
    .register()

// 2x2 Fluid Drawer
crafting.removeByOutput(item('functionalstoragelegacy:fluid_4'))
crafting.shapedBuilder()
    .name(resource('gtlite:fluid_drawer_2x2a'))
    .shape('DPD',
           'PGP',
           'DPD')
    .key('D', metaitem('gtlitecore:drum.iron'))
    .key('P', ore('plateSteel'))
    .key('G', item('minecraft:glass_pane'))
    .output(item('functionalstoragelegacy:fluid_4'))
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:fluid_drawer_2x2b'))
    .shape('DPD',
           'PGP',
           'DPD')
    .key('D', metaitem('gtlitecore:drum.iron'))
    .key('P', ore('plateSteel'))
    .key('G', ore('plateGlass'))
    .output(item('functionalstoragelegacy:fluid_4'))
    .register()

log.info("Complete load functionalstorage recipes...")