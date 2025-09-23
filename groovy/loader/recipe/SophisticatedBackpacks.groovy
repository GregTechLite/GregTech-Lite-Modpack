log.info("Starting to load SophisticatedBackpacks Recipes...")

// Leather Backpack
crafting.removeByOutput(item('retro_sophisticated_backpacks:backpack_leather'))
crafting.shapedBuilder()
    .row('SLS')
    .row('SCS')
    .row('LLL')
    .key('C', item('gregtech:mte', 5625)) // Wooden Crate
    .key('L', item('minecraft:leather'))
    .key('S', item('minecraft:string'))
    .output(item('retro_sophisticated_backpacks:backpack_leather'))
    .register()

// Iron Backpack
crafting.removeByOutput(item('retro_sophisticated_backpacks:backpack_iron'))
crafting.shapedBuilder()
    .row('PCP')
    .row('PBP')
    .row('PSP')
    .key('B', item('retro_sophisticated_backpacks:backpack_leather'))
    .key('C', item('gtlitecore:mte', 2026)) // Iron Crate
    .key('P', ore('plateDoubleIron'))
    .key('S', ore('screwIron'))
    .output(item('retro_sophisticated_backpacks:backpack_iron'))
    .register()

// Gold Backpack
crafting.removeByOutput(item('retro_sophisticated_backpacks:backpack_gold'))
crafting.shapedBuilder()
    .row('PCP')
    .row('PBP')
    .row('PSP')
    .key('B', item('retro_sophisticated_backpacks:backpack_iron'))
    .key('C', item('gtlitecore:mte', 2029)) // Gold Crate
    .key('P', ore('plateDoubleGold'))
    .key('S', ore('screwGold'))
    .output(item('retro_sophisticated_backpacks:backpack_gold'))
    .register()

// Diamond Backpack
crafting.removeByOutput(item('retro_sophisticated_backpacks:backpack_diamond'))
crafting.shapedBuilder()
    .row('PCP')
    .row('GBG')
    .row('PSP')
    .key('B', item('retro_sophisticated_backpacks:backpack_gold'))
    .key('C', item('gtlitecore:mte', 2030)) // Diamond Crate
    .key('P', ore('plateDiamond'))
    .key('G', ore('gearDiamond'))
    .key('S', ore('screwDiamond'))
    .output(item('retro_sophisticated_backpacks:backpack_diamond'))
    .register()

// Obsidian Backpack
crafting.removeByOutput(item('retro_sophisticated_backpacks:backpack_obsidian'))
crafting.shapedBuilder()
    .row('PFP')
    .row('QBQ')
    .row('PSP')
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
    .row('SLS')
    .row('RFR')
    .row('STS')
    .key('F', metaitem('wooden_form.empty'))
    .key('L', item('minecraft:leather'))
    .key('S', item('minecraft:string'))
    .key('R', ore('ringIron'))
    .key('T', ore('screwIron'))
    .output(item('retro_sophisticated_backpacks:upgrade_base') * 2)
    .register()

// Stack Upgrade T0
crafting.removeByOutput(item('retro_sophisticated_backpacks:stack_upgrade_starter_tier'))
crafting.addShapeless(item('retro_sophisticated_backpacks:stack_upgrade_starter_tier'),
    [item('retro_sophisticated_backpacks:upgrade_base'), ore('gearSmallBrass'), ore('ringBrass')])

// Stack Upgrade T1
crafting.removeByOutput(item('retro_sophisticated_backpacks:stack_upgrade_tier_1'))
crafting.addShapeless(item('retro_sophisticated_backpacks:stack_upgrade_tier_1'),
    [item('retro_sophisticated_backpacks:stack_upgrade_starter_tier'), item('gtlitecore:mte', 2027)]) // Copper Crate

// Stack Upgrade T2
crafting.removeByOutput(item('retro_sophisticated_backpacks:stack_upgrade_tier_2'))
crafting.addShapeless(item('retro_sophisticated_backpacks:stack_upgrade_tier_2'),
    [item('retro_sophisticated_backpacks:stack_upgrade_tier_1'), item('gtlitecore:mte', 2028), metaitem('field.generator.lv'), ore('gearRoseGold')]) // Silver Crate

// Stack Upgrade T3
crafting.removeByOutput(item('retro_sophisticated_backpacks:stack_upgrade_tier_3'))
crafting.addShapeless(item('retro_sophisticated_backpacks:stack_upgrade_tier_3'),
    [item('retro_sophisticated_backpacks:stack_upgrade_tier_2'), item('gregtech:mte', 5628), item('gregtech:mte', 1076), ore('springSterlingSilver')]) // Aluminium Crate, Quantum Storage Proxy

// Stack Upgrade T4
crafting.removeByOutput(item('retro_sophisticated_backpacks:stack_upgrade_tier_4'))
crafting.addShapeless(item('retro_sophisticated_backpacks:stack_upgrade_tier_4'),
    [item('retro_sophisticated_backpacks:stack_upgrade_tier_3'), item('gregtech:mte', 5629), metaitem('field.generator.mv'), ore('plateDenseObsidian')]) // Stainless Steel Crate, MV Field Generator

// Exponential Stack Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:exponential_stack_upgrade'))
crafting.shapedBuilder()
    .row('DSD')
    .row('SFS')
    .row('DSD')
    .key('S', item('retro_sophisticated_backpacks:stack_upgrade_tier_4'))
    .key('F', metaitem('field.generator.mv'))
    .key('D', ore('plateDenseTitanium'))
    .output(item('retro_sophisticated_backpacks:exponential_stack_upgrade'))
    .register()

// Inception Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:inception_upgrade'))
crafting.shapedBuilder()
    .row('DED')
    .row('DBD')
    .row('DMD')
    .key('B', item('retro_sophisticated_backpacks:upgrade_base'))
    .key('E', item('enderutilities:enderbag')) // Ender Bag
    .key('M', item('enderutilities:msu'))
    .key('D', ore('plateDenseVanadiumSteel'))
    .output(item('retro_sophisticated_backpacks:inception_upgrade'))
    .register()

// Pickup Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:pickup_upgrade'))
crafting.addShapeless(item('retro_sophisticated_backpacks:pickup_upgrade'), 
    [item('retro_sophisticated_backpacks:upgrade_base'), item('minecraft:hopper')])

// Advanced Pickup Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:advanced_pickup_upgrade'))
crafting.addShapeless(item('retro_sophisticated_backpacks:advanced_pickup_upgrade'),
    [item('retro_sophisticated_backpacks:pickup_upgrade'), item('enderutilities:pickupmanager')])

// Feeding Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:feeding_upgrade'))
crafting.addShapeless(item('retro_sophisticated_backpacks:feeding_upgrade'),
    [item('retro_sophisticated_backpacks:upgrade_base'), item('minecraft:sugar')])

// Advanced Feeding Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:advanced_feeding_upgrade'))
crafting.addShapeless(item('retro_sophisticated_backpacks:advanced_feeding_upgrade'),
    [item('retro_sophisticated_backpacks:feeding_upgrade'), item('minecraft:cake')])

// Deposit Upgrade 
crafting.removeByOutput(item('retro_sophisticated_backpacks:deposit_upgrade'))
crafting.addShapeless(item('retro_sophisticated_backpacks:deposit_upgrade'),
    [item('retro_sophisticated_backpacks:upgrade_base'), item('minecraft:chest')])

// Advanced Deposit Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:advanced_deposit_upgrade'))
crafting.addShapeless(item('retro_sophisticated_backpacks:advanced_deposit_upgrade'),
    [item('retro_sophisticated_backpacks:deposit_upgrade'), item('enderutilities:storage_0', 3)])

// Restock Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:restock_upgrade'))
crafting.addShapeless(item('retro_sophisticated_backpacks:restock_upgrade'),
    [item('retro_sophisticated_backpacks:upgrade_base'), ore('drawerBasic')])

// Advanced Restock Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:advanced_restock_upgrade'))
crafting.addShapeless(item('retro_sophisticated_backpacks:advanced_restock_upgrade'),
    [item('retro_sophisticated_backpacks:restock_upgrade'), item('storagedrawers:compdrawers')])

// Filter Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:filter_upgrade'))
crafting.addShapeless(item('retro_sophisticated_backpacks:filter_upgrade'),
    [item('retro_sophisticated_backpacks:upgrade_base'), item('enderio:item_basic_item_filter')])

// Advanced Filter Upgrade
crafting.removeByOutput(item('retro_sophisticated_backpacks:advanced_filter_upgrade'))
crafting.addShapeless(item('retro_sophisticated_backpacks:advanced_filter_upgrade'),
    [item('retro_sophisticated_backpacks:filter_upgrade'), item('enderio:item_advanced_item_filter')])