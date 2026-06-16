log.info("Starting to load retro_sophisticated_backpacks recipes...")

// Leather Backpack
crafting.removeByOutput(item('retro_sophisticated_backpacks:backpack_leather'))
crafting.shapedBuilder()
    .name(resource('gtlite:leather_backpack'))
    .shape('SLS',
           'SCS',
           'LLL')
    .key('C', metaitem('crate.wood'))
    .key('L', item('minecraft:leather'))
    .key('S', item('minecraft:string'))
    .output(item('retro_sophisticated_backpacks:backpack_leather'))
    .register()

// Iron Backpack
crafting.removeByOutput(item('retro_sophisticated_backpacks:backpack_iron'))
crafting.shapedBuilder()
    .name(resource('gtlite:iron_backpack'))
    .shape('PCP',
           'PBP',
           'PSP')
    .key('B', item('retro_sophisticated_backpacks:backpack_leather'))
    .key('C', metaitem('gtlitecore:crate.iron'))
    .key('P', ore('plateDoubleIron'))
    .key('S', ore('screwIron'))
    .output(item('retro_sophisticated_backpacks:backpack_iron'))
    .register()

// Gold Backpack
crafting.removeByOutput(item('retro_sophisticated_backpacks:backpack_gold'))
crafting.shapedBuilder()
    .name(resource('gtlite:gold_backpack'))
    .shape('PCP',
           'PBP',
           'PSP')
    .key('B', item('retro_sophisticated_backpacks:backpack_iron'))
    .key('C', metaitem('gtlitecore:crate.gold'))
    .key('P', ore('plateDoubleGold'))
    .key('S', ore('screwGold'))
    .output(item('retro_sophisticated_backpacks:backpack_gold'))
    .register()

// Diamond Backpack
crafting.removeByOutput(item('retro_sophisticated_backpacks:backpack_diamond'))
crafting.shapedBuilder()
    .name(resource('gtlite:diamond_backpack'))
    .shape('PCP',
           'GBG',
           'PSP')
    .key('B', item('retro_sophisticated_backpacks:backpack_gold'))
    .key('C', metaitem('gtlitecore:crate.diamond'))
    .key('P', ore('plateDiamond'))
    .key('G', ore('gearDiamond'))
    .key('S', ore('screwDiamond'))
    .output(item('retro_sophisticated_backpacks:backpack_diamond'))
    .register()

// Obsidian Backpack
crafting.removeByOutput(item('retro_sophisticated_backpacks:backpack_obsidian'))
crafting.shapedBuilder()
    .name(resource('gtlite:obsidian_backpack'))
    .shape('PFP',
           'QBQ',
           'PSP')
    .key('B', item('retro_sophisticated_backpacks:backpack_diamond'))
    .key('F', metaitem('field.generator.lv'))
    .key('P', ore('plateDenseObsidian'))
    .key('Q', ore('plateDenseSteel'))
    .key('S', ore('screwObsidian'))
    .output(item('retro_sophisticated_backpacks:backpack_obsidian'))
    .register()

// Upgrade Base
crafting.removeByOutput(item('retro_sophisticated_backpacks:upgrade_base'))
crafting.shapedBuilder()
    .name(resource('gtlite:backpack_upgrade_base'))
    .shape('SLS',
           'RFR',
           'STS')
    .key('F', metaitem('wooden_form.empty'))
    .key('L', item('minecraft:leather'))
    .key('S', item('minecraft:string'))
    .key('R', ore('ringIron'))
    .key('T', ore('screwIron'))
    .output(item('retro_sophisticated_backpacks:upgrade_base') * 2)
    .register()

// Stack Upgrade T0
crafting.removeByOutput(item('retro_sophisticated_backpacks:stack_upgrade_starter_tier'))
crafting.shapelessBuilder()
    .name(resource('gtlite:stack_upgrade_0'))
    .input([item('retro_sophisticated_backpacks:upgrade_base'),
            ore('gearSmallBrass'), 
            ore('ringBrass')])
    .output(item('retro_sophisticated_backpacks:stack_upgrade_starter_tier'))
    .register()

// Stack Upgrade T1
crafting.removeByOutput(item('retro_sophisticated_backpacks:stack_upgrade_tier_1'))
crafting.shapelessBuilder()
    .name(resource('gtlite:stack_upgrade_1'))
    .input([item('retro_sophisticated_backpacks:stack_upgrade_starter_tier'), 
            metaitem('gtlitecore:crate.copper')])
    .output(item('retro_sophisticated_backpacks:stack_upgrade_tier_1'))
    .register()

// Stack Upgrade T2
crafting.removeByOutput(item('retro_sophisticated_backpacks:stack_upgrade_tier_2'))
crafting.shapelessBuilder()
    .name(resource('gtlite:stack_upgrade_2'))
    .input([item('retro_sophisticated_backpacks:stack_upgrade_tier_1'), 
            metaitem('gtlitecore:crate.silver'),
            metaitem('field.generator.lv'), 
            ore('gearRoseGold')])
    .output(item('retro_sophisticated_backpacks:stack_upgrade_tier_2'))
    .register()

// Stack Upgrade T3
crafting.removeByOutput(item('retro_sophisticated_backpacks:stack_upgrade_tier_3'))
crafting.shapelessBuilder()
    .name(resource('gtlite:stack_upgrade_3'))
    .input([item('retro_sophisticated_backpacks:stack_upgrade_tier_2'),
            metaitem('crate.aluminium'), 
            metaitem('quantum_storage_proxy'),
            ore('springSterlingSilver')])
    .output(item('retro_sophisticated_backpacks:stack_upgrade_tier_3'))
    .register()

// Stack Upgrade T4
crafting.removeByOutput(item('retro_sophisticated_backpacks:stack_upgrade_tier_4'))
crafting.shapelessBuilder()
    .name(resource('gtlite:stack_upgrade_4'))
    .input([item('retro_sophisticated_backpacks:stack_upgrade_tier_3'),
            metaitem('crate.stainless_steel'), 
            metaitem('field.generator.mv'), 
            ore('plateDenseObsidian')])
    .output(item('retro_sophisticated_backpacks:stack_upgrade_tier_4'))
    .register()

// Exponential Stack Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:exponential_stack_upgrade'))
crafting.shapedBuilder()
    .name(resource('gtlite:exponential_stack_upgrade'))
    .shape('DSD',
           'SFS',
           'DSD')
    .key('S', item('retro_sophisticated_backpacks:stack_upgrade_tier_4'))
    .key('F', metaitem('field.generator.mv'))
    .key('D', ore('plateDenseTitanium'))
    .output(item('retro_sophisticated_backpacks:exponential_stack_upgrade'))
    .register()

// Inception Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:inception_upgrade'))
crafting.shapedBuilder()
    .name(resource('gtlite:inception_upgrade'))
    .shape('DED',
           'DBD',
           'DMD')
    .key('B', item('retro_sophisticated_backpacks:upgrade_base'))
    .key('E', item('enderutilities:enderbag'))
    .key('M', item('enderutilities:msu'))
    .key('D', ore('plateDenseVanadiumSteel'))
    .output(item('retro_sophisticated_backpacks:inception_upgrade'))
    .register()

// Pickup Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:pickup_upgrade'))
crafting.shapelessBuilder()
    .name(resource('gtlite:pickup_upgrade'))
    .input([item('retro_sophisticated_backpacks:upgrade_base'), 
            item('minecraft:hopper')])
    .output(item('retro_sophisticated_backpacks:pickup_upgrade'))
    .register()

// Advanced Pickup Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:advanced_pickup_upgrade'))
crafting.shapelessBuilder()
    .name(resource('gtlite:advanced_pickup_upgrade'))
    .input([item('retro_sophisticated_backpacks:pickup_upgrade'), 
            item('enderutilities:pickupmanager')])
    .output(item('retro_sophisticated_backpacks:advanced_pickup_upgrade'))
    .register()

// Feeding Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:feeding_upgrade'))
crafting.shapelessBuilder()
    .name(resource('gtlite:feeding_upgrade'))
    .input([item('retro_sophisticated_backpacks:upgrade_base'),
            item('minecraft:sugar')])
    .output(item('retro_sophisticated_backpacks:feeding_upgrade'))
    .register()

// Advanced Feeding Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:advanced_feeding_upgrade'))
crafting.shapelessBuilder()
    .name(resource('gtlite:advanced_feeding_upgrade'))
    .input([item('retro_sophisticated_backpacks:feeding_upgrade'), 
            item('minecraft:cake')])
    .output(item('retro_sophisticated_backpacks:advanced_feeding_upgrade'))
    .register()

// Deposit Upgrade 
crafting.removeByOutput(item('retro_sophisticated_backpacks:deposit_upgrade'))
crafting.shapelessBuilder()
    .name(resource('gtlite:deposit_upgrade'))
    .input([item('retro_sophisticated_backpacks:upgrade_base'),
            item('minecraft:chest')])
    .output(item('retro_sophisticated_backpacks:deposit_upgrade'))
    .register()

// Advanced Deposit Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:advanced_deposit_upgrade'))
crafting.shapelessBuilder()
    .name(resource('gtlite:advanced_deposit_upgrade'))
    .input([item('retro_sophisticated_backpacks:deposit_upgrade'), 
            item('enderutilities:storage_0', 3)])
    .output(item('retro_sophisticated_backpacks:advanced_deposit_upgrade'))
    .register()

// Restock Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:restock_upgrade'))
crafting.shapelessBuilder()
    .name(resource('gtlite:restock_upgrade'))
    .input([item('retro_sophisticated_backpacks:upgrade_base'), 
            ore('drawerBasic')])
    .output(item('retro_sophisticated_backpacks:restock_upgrade'))
    .register()

// Advanced Restock Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:advanced_restock_upgrade'))
crafting.shapelessBuilder()
    .name(resource('gtlite:advanced_restock_upgrade'))
    .input([item('retro_sophisticated_backpacks:restock_upgrade'),
            item('functionalstoragelegacy:compacting_drawer')])
    .output(item('retro_sophisticated_backpacks:advanced_restock_upgrade'))
    .register()

// Filter Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:filter_upgrade'))
crafting.shapelessBuilder()
    .name(resource('gtlite:filter_upgrade'))
    .input([item('retro_sophisticated_backpacks:upgrade_base'),
            item('enderio:item_basic_item_filter')])
    .output(item('retro_sophisticated_backpacks:filter_upgrade'))
    .register()

// Advanced Filter Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:advanced_filter_upgrade'))
crafting.shapelessBuilder()
    .name(resource('gtlite:advanced_filter_upgrade'))
    .input([item('retro_sophisticated_backpacks:filter_upgrade'),
            item('enderio:item_advanced_item_filter')])
    .output(item('retro_sophisticated_backpacks:advanced_filter_upgrade'))
    .register()

log.info("Complete load retro_sophisticated_backpacks recipes...")