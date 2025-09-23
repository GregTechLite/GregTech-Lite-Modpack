log.info("Starting to load JustEnoughItems recipes...")

// Applied Energistics 2
mods.jei.ingredient.removeAndHide(item('appliedenergistics2:material', 3)) // Nether quartz dust
mods.jei.ingredient.removeAndHide(item('appliedenergistics2:material', 5)) // Silicon
mods.jei.ingredient.removeAndHide(item('appliedenergistics2:material', 13)) // Calculation processor press
mods.jei.ingredient.removeAndHide(item('appliedenergistics2:material', 14)) // Engineering processor press
mods.jei.ingredient.removeAndHide(item('appliedenergistics2:material', 15)) // Logic processor press
mods.jei.ingredient.removeAndHide(item('appliedenergistics2:material', 16)) // Calculation processor print
mods.jei.ingredient.removeAndHide(item('appliedenergistics2:material', 17)) // Engineering processor print
mods.jei.ingredient.removeAndHide(item('appliedenergistics2:material', 18)) // Logic processor print
mods.jei.ingredient.removeAndHide(item('appliedenergistics2:material', 19)) // Silicon press
mods.jei.ingredient.removeAndHide(item('appliedenergistics2:material', 20)) // Silicon print
mods.jei.ingredient.removeAndHide(item('appliedenergistics2:material', 21)) // Name press
mods.jei.ingredient.removeAndHide(item('appliedenergistics2:material', 45)) // Sky stone dust
mods.jei.ingredient.removeAndHide(item('appliedenergistics2:material', 46)) // Fluix dust
mods.jei.ingredient.removeAndHide(item('appliedenergistics2:material', 49)) // Iron dust
mods.jei.ingredient.removeAndHide(item('appliedenergistics2:material', 51)) // Gold dust
mods.jei.ingredient.removeAndHide(item('appliedenergistics2:sky_compass')) // Sky compass

mods.jei.category.hideCategory('appliedenergistics2.inscriber')

// AE2 Stuff Unofficial
mods.jei.ingredient.removeAndHide(item('ae2stuff:inscriber')) // Advanced Inscriber
mods.jei.ingredient.removeAndHide(item('ae2stuff:grower')) // Crystal Grower

// Baubles (Bubbles)
mods.jei.ingredient.removeAndHide(item('baubles:max_verstappen')) // Max Verstappen

// Better Questing Unofficial
mods.jei.ingredient.removeAndHide(item('bq_standard:loot_chest').withNbt(['hideLootInfo': (byte) 1]))
mods.jei.ingredient.removeAndHide(item('bq_standard:loot_chest', 25).withNbt(['hideLootInfo': (byte) 1]))
mods.jei.ingredient.removeAndHide(item('bq_standard:loot_chest', 50).withNbt(['hideLootInfo': (byte) 1]))
mods.jei.ingredient.removeAndHide(item('bq_standard:loot_chest', 75).withNbt(['hideLootInfo': (byte) 1]))
mods.jei.ingredient.removeAndHide(item('bq_standard:loot_chest', 100).withNbt(['hideLootInfo': (byte) 1]))
mods.jei.ingredient.removeAndHide(item('bq_standard:loot_chest', 101).withNbt(['hideLootInfo': (byte) 1]))
mods.jei.ingredient.removeAndHide(item('bq_standard:loot_chest', 102))
mods.jei.ingredient.removeAndHide(item('bq_standard:loot_chest', 103).withNbt(['loottable': 'minecraft:chests/simple_dungeon', 'hideLootInfo': (byte) 1]))
mods.jei.ingredient.removeAndHide(item('bq_standard:loot_chest', 104).withNbt(['fixedLootList': [['Count': 1, 'Damage': (short) 0, 'id': 'minecraft:stone', 'OreDict': '']], 'hideLootInfo': (byte) 1, 'fixedLootName': 'Item Set']))

// EnderIO

mods.jei.ingredient.removeAndHide(item('enderio:item_material')) // Simple Machine Chassi
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 1)) // Industrial Machine Chassis
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 2)) // Machine Parts
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 3)) // Photovoltaic Plate
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 5)) // Silicon
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 6)) // Glider Wing
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 8)) // Nutritious Stick
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 9)) // Wooden Gear
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 10)) // Stone Compound Gear
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 11)) // Infinity Bimetal Gear
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 12)) // Energized Bimetal Gear
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 13)) // Vibrant Bimetal Gear
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 14)) // Pulsating Crystal
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 15)) // Vibrant Crystal
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 16)) // Ender Crystal
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 17)) // Enticing Crystal
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 18)) // Weather Crystal
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 19)) // Presicent Crystal
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 20)) // Grains of Infinity
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 21)) // Flour
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 23)) // Coal Powder
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 24)) // Iron Powder
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 25)) // Gold Powder
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 26)) // Copper Powder
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 27)) // Tin Powder
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 28)) // Ender Pearl Powder
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 29)) // Obsidian Powder
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 31)) // Cobalt Powder
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 32)) // Lapis Powder
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 33)) // Quartz Powder
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 34)) // Grains of Prescience
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 35)) // Grains of Vibrancy
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 36)) // Grains of Piezallity
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 37)) // Grains of the End
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 38)) // Photovoltaic Composite
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 40)) // Zombie Electrode
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 41)) // Z-Logic Controller
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 42)) // Frank'N'Zombie
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 43)) // Ender Resonator
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 44)) // Sentient Ender
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 45)) // Skeletal Contractor
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 46)) // Clippings and Trimmings
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 47)) // Twigs and Prunings
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 48)) // Organic Green Dye
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 49)) // Organic Brown Dye
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 50)) // Organic Black Dye
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 51)) // Industrial Dye Blend
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 52)) // Soul Attuned Dye Blend
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 53)) // Soul Machine Chassis
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 54)) // Enhanced Machine Chassis
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 55)) // Soulless Machine Chassis
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 56)) // Guardian Diode
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 60)) // Redstone Filter Base
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 61)) // Confusing Powder
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 62)) // Ender Fragment
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 63)) // Withering Dust
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 64)) // Remote Awareness Upgrade
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 65)) // Wireless Energy Transmitter Dish Assembly
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 66)) // End Steel Chassis
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 67)) // Enhanced Dye Blend
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 68)) // Enhanced Machine Parts
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 69)) // Simple Machine Parts
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 70)) // Cake Base
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 71)) // Infinity Rod
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 72)) // Nethercotta
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 73)) // Dark Bimetal Gear
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 74)) // Soul Powder
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 75)) // Infinity Reagent
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 76)) // Clay-Coated Glowstone Dust
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 77)) // Black Paper
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 78)) // Animal Token
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 79)) // Monster Token
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 80)) // Player Token
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 81)) // Unfired Death Urn

mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ingot')) // Electrical Steel Ingot
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy')) // Electrical Steel Block
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_nugget')) // Electrical Steel Nugget
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ball')) // Electrical Steel Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ingot', 1)) // Energetic Alloy Ingot
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy', 1)) // Energetic Alloy Block
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_nugget', 1)) // Energetic Alloy Nugget
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ball', 1)) // Energetic Alloy Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ingot', 2)) // Vibrant Alloy Ingot
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy', 2)) // Vibrant Alloy Block
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_nugget', 2)) // Vibrant Alloy Nugget
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ball', 2)) // Vibrant Alloy Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ingot', 3)) // Redstone Alloy Ingot
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy', 3)) // Redstone Alloy Block
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_nugget', 3)) // Redstone Alloy Nugget
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ball', 3)) // Redstone Alloy Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ingot', 4)) // Conductive Iron Ingot
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy', 4)) // Conductive Iron Block
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_nugget', 4)) // Conductive Iron Nugget
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ball', 4)) // Conductive Iron Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ingot', 5)) // Pulsating Iron Ingot
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy', 5)) // Pulsating Iron Block
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_nugget', 5)) // Pulsating Iron Nugget
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ball', 5)) // Pulsating Iron Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ingot', 6)) // Dark Steel Ingot
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy', 6)) // Dark Steel Block
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_nugget', 6)) // Dark Steel Nugget
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ball', 6)) // Dark Steel Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ingot', 7)) // Soularium Ingot
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy', 7)) // Soularium Block
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_nugget', 7)) // Soularium Nugget
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ball', 7)) // Soularium Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ingot', 8)) // End Steel Ingot
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy', 8)) // End Steel Block
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_nugget', 8)) // End Steel Nugget
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ball', 8)) // End Steel Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ingot', 9)) // Iron Alloy Ingot
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy', 9)) // Iron Alloy Block
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_nugget', 9)) // Iron Alloy Nugget
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_ball', 9)) // Iron Alloy Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_ingot')) // Crude Steel Ingot
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy_endergy')) // Crude Steel Block
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_nugget')) // Crude Steel Nugget
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_ball')) // Crude Steel Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_ingot', 1)) // Crystalline Alloy Ingot
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy_endergy', 1)) // Crystalline Alloy Block
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_nugget', 1)) // Crystalline Alloy Nugget
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_ball', 1)) // Crystalline Alloy Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_ingot', 2)) // Melodic Alloy Ingot
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy_endergy', 2)) // Melodic Alloy Block
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_nugget', 2)) // Melodic Alloy Nugget
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_ball', 2)) // Melodic Alloy Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_ingot', 3)) // Stellar Alloy Ingot
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy_endergy', 3)) // Stellar Alloy Block
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_nugget', 3)) // Stellar Alloy Nugget
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_ball', 3)) // Stellar Alloy Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_ingot', 4)) // Crystalline Pink Slime Ingot
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy_endergy', 4)) // Crystalline Pink Slime Block
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_nugget', 4)) // Crystalline Pink Slime Nugget
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_ball', 4)) // Crystalline Pink Slime Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_ingot', 5)) // Energetic Silver Ingot
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy_endergy', 5)) // Energetic Silver Block
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_nugget', 5)) // Energetic Silver Nugget
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_ball', 5)) // Energetic Silver Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_ingot', 6)) // Vivid Alloy Ingot
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy_endergy', 6)) // Vivid Alloy Block
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_nugget', 6)) // Vivid Alloy Nugget
mods.jei.ingredient.removeAndHide(item('enderio:item_alloy_endergy_ball', 6)) // Vivid Alloy Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:item_material', 57)) // Signalum Grinding Ball
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 58)) // Enderium Grinding Ball
mods.jei.ingredient.removeAndHide(item('enderio:item_material', 59)) // Lumium Grinding Ball

mods.jei.ingredient.removeAndHide(item('enderio:block_industrial_insulation')) // Industrial Insulation

for (i in 0 .. 15)
{
    mods.jei.ingredient.removeAndHide(item('enderio:block_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_enlightened_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_enlightened_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_dark_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_dark_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_holy_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_holy_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_holy_enlightened_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_holy_enlightened_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_holy_dark_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_holy_dark_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_unholy_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_unholy_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_unholy_enlightened_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_unholy_enlightened_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_unholy_dark_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_unholy_dark_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_pasture_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_pasture_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_pasture_enlightened_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_pasture_enlightened_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_pasture_dark_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_pasture_dark_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_holy_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_holy_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_holy_enlightened_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_holy_enlightened_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_holy_dark_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_holy_dark_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_unholy_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_unholy_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_unholy_enlightened_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_unholy_enlightened_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_unholy_dark_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_unholy_dark_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_pasture_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_pasture_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_pasture_enlightened_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_pasture_enlightened_fused_glass', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_pasture_dark_fused_quartz', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_not_pasture_dark_fused_glass', i))

    mods.jei.ingredient.removeAndHide(item('enderio:block_decoration1', i))
    mods.jei.ingredient.removeAndHide(item('enderio:block_decoration2', i))
}

for (i in 0 .. 4)
{
    mods.jei.ingredient.removeAndHide(item('enderio:block_decoration3', i))
}

mods.jei.ingredient.removeAndHide(item('enderio:block_simple_furnace')) // Simple Powered Furnace
mods.jei.ingredient.removeAndHide(item('enderio:block_simple_alloy_smelter')) // Simple Alloy Smelter
mods.jei.ingredient.removeAndHide(item('enderio:block_alloy_smelter')) // Alloy Smelter
mods.jei.ingredient.removeAndHide(item('enderio:block_enhanced_alloy_smelter')) // Enhanced Alloy Smelter
mods.jei.ingredient.removeAndHide(item('enderio:block_combustion_generator')) // Combustion Generator
mods.jei.ingredient.removeAndHide(item('enderio:block_enhanced_combustion_generator')) // Enhanced Combustion Generator
mods.jei.ingredient.removeAndHide(item('enderio:block_simple_stirling_generator')) // Simple Stirling Generator
mods.jei.ingredient.removeAndHide(item('enderio:block_stirling_generator')) // Stirling Generator
mods.jei.ingredient.removeAndHide(item('enderio:block_zombie_generator')) // Zombie Generator
mods.jei.ingredient.removeAndHide(item('enderio:block_franken_zombie_generator')) // Franke'n'Zombie Generator
mods.jei.ingredient.removeAndHide(item('enderio:block_ender_generator')) // Ender Generator
mods.jei.ingredient.removeAndHide(item('enderio:block_lava_generator')) // Lava Generator
mods.jei.ingredient.removeAndHide(item('enderio:block_simple_sag_mill')) // Simple SAG Mill
mods.jei.ingredient.removeAndHide(item('enderio:block_sag_mill')) // SAG Mill
mods.jei.ingredient.removeAndHide(item('enderio:block_enhanced_sag_mill')) // Enhanced SAG Mill
mods.jei.ingredient.removeAndHide(item('enderio:block_slice_and_splice')) // Slice'N'Splice
mods.jei.ingredient.removeAndHide(item('enderio:block_solar_panel')) // Simple Photovoltaic Cell
mods.jei.ingredient.removeAndHide(item('enderio:block_solar_panel', 1)) // Photovoltaic Cell
mods.jei.ingredient.removeAndHide(item('enderio:block_solar_panel', 2)) // Advanced Photovoltaic Cell
mods.jei.ingredient.removeAndHide(item('enderio:block_solar_panel', 3)) // Vibrant Photovoltaic Cell
mods.jei.ingredient.removeAndHide(item('enderio:block_solar_panel', 4)) // Crystalline Photovoltaic Cell
mods.jei.ingredient.removeAndHide(item('enderio:block_solar_panel', 5)) // Melodic Photovoltaic Cell
mods.jei.ingredient.removeAndHide(item('enderio:block_solar_panel', 6)) // Stellar Photovoltaic Cell
mods.jei.ingredient.removeAndHide(item('enderio:block_soul_binder')) // Soul Binder
mods.jei.ingredient.removeAndHide(item('enderio:block_powered_spawner').withNbt(['entityId': 'minecraft:chicken'])) // Powered Spawner (Chicken)
mods.jei.ingredient.removeAndHide(item('enderio:block_powered_spawner').withNbt(['entityId': 'minecraft:skeleton'])) // Powered Spawner (Skeleton)
mods.jei.ingredient.removeAndHide(item('enderio:block_powered_spawner').withNbt(['entityId': 'minecraft:stray'])) // Powered Spawner (Stray)
mods.jei.ingredient.removeAndHide(item('enderio:block_powered_spawner').withNbt(['entityId': 'minecraft:enderman'])) // Powered Spawner (Enderman)
mods.jei.ingredient.removeAndHide(item('enderio:block_powered_spawner').withNbt(['entityId': 'minecraft:wither_skeleton'])) // Powered Spawner (Wither Skeleton)
mods.jei.ingredient.removeAndHide(item('enderio:block_powered_spawner')) // Powered Spawner
mods.jei.ingredient.removeAndHide(item('enderio:block_vat')) // The Vat
mods.jei.ingredient.removeAndHide(item('enderio:block_enhanced_vat')) // The Enhanced Vat
mods.jei.ingredient.removeAndHide(item('enderio:block_simple_wired_charger')) // Simple Wired Charger
mods.jei.ingredient.removeAndHide(item('enderio:block_simple_crafter')) // Simple Crafter

mods.jei.ingredient.removeAndHide(item('enderio:item_soul_vial')) // Soul Vial

mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner')) // Broken Spawner
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:husk'])) // Broken Spawner (Husk)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:vex'])) // Broken Spawner (Vex)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:slime'])) // Broken Spawner (Slime)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:snowman'])) // Broken Spawner (Snowman)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:spider'])) // Broken Spawner (Spider)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:pig'])) // Broken Spawner (Pig)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:mooshroom'])) // Broken Spawner (Mooshroom)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:horse'])) // Broken Spawner (House)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:illusion_illager'])) // Broken Spawner (Illusion Illager)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:squid'])) // Broken Spawner (Squid)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:polar_bear'])) // Broken Spawner (Polar Bear)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:guardian'])) // Broken Spawner (Guardian)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:blaze'])) // Broken Spawner (Blaze)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:skeleton'])) // Broken Spawner (Skeleton)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:elder_guardian'])) // Broken Spawner (Elder Guardian)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:zombie_villager'])) // Broken Spawner (Zombie Villager)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:evocation_illager'])) // Broken Spawner (Evocation Illager)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:ghast'])) // Broken Spawner (Ghast)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:stray'])) // Broken Spawner (Stray)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:ocelot'])) // Broken Spawner (Ocelot)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:silverfish'])) // Broken Spawner (Silverfish)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:zombie_pigman'])) // Broken Spawner (Zombie Pigman)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:wither_skeleton'])) // Broken Spawner (Wither Skeleton)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:wolf'])) // Broken Spawner (Wolf)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:rabbit'])) // Broken Spawner (Rabbit)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:wither'])) // Broken Spawner (Wither)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:sheep'])) // Broken Spawner (Sheep)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:magma_cube'])) // Broken Spawner (Magma Cube)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:parrot'])) // Broken Spawner (Parrot)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:vindication_illager'])) // Broken Spawner (Vindication Illager)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:cave_spider'])) // Broken Spawner (Cave Spider)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:bat'])) // Broken Spawner (Bat)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:shulker'])) // Broken Spawner (Shulker)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:chicken'])) // Broken Spawner (Chicken)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:creeper'])) // Broken Spawner (Creeper)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:skeleton_horse'])) // Broken Spawner (Skeleton Horse)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:endermite'])) // Broken Spawner (Endermite)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:mule'])) // Broken Spawner (Mule)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:witch'])) // Broken Spawner (Witch)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:donkey'])) // Broken Spawner (Donkey)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:zombie_horse'])) // Broken Spawner (Zombie Horse)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:cow'])) // Broken Spawner (Cow)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:villager'])) // Broken Spawner (Villager)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:zombie'])) // Broken Spawner (Zombie)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:giant'])) // Broken Spawner (Giant)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:villager_golem'])) // Broken Spawner (Villager Golem)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:enderman'])) // Broken Spawner (Enderman)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'minecraft:llama'])) // Broken Spawner (Llama)
mods.jei.ingredient.removeAndHide(item('enderio:item_broken_spawner').withNbt(['entityId': 'enderutilities:endermanfighter'])) // Broken Spawner (Enderman Fighter)

mods.jei.ingredient.removeAndHide(item('enderio:item_owl_egg')) // Owl Egg
mods.jei.ingredient.removeAndHide(item('enderio:block_death_pouch')) // Death Urn
mods.jei.ingredient.removeAndHide(item('enderio:block_infinity_fog')) // Infinity Dust
mods.jei.ingredient.removeAndHide(item('enderio:block_infinity')) // Infinity Dust Block
mods.jei.ingredient.removeAndHide(item('enderio:block_infinity', 1)) // Compressed Infinity Dust Block
mods.jei.ingredient.removeAndHide(item('enderio:block_infinity', 2)) // Double Compressed Infinity Dust Block
mods.jei.ingredient.removeAndHide(item('enderio:block_holy_fog')) // Glowstone Nano-Particles (old)
mods.jei.ingredient.removeAndHide(item('enderio:block_holier_fog')) // Glowstone Nano-Particles
mods.jei.ingredient.removeAndHide(item('enderio:block_end_iron_bars')) // End Steel Bars
mods.jei.ingredient.removeAndHide(item('enderio:block_dark_paper_anvil')) // Dark Paper Anvil
mods.jei.ingredient.removeAndHide(item('enderio:block_dark_paper_anvil', 1)) // Slightly Damaged Dark Paper Anvil
mods.jei.ingredient.removeAndHide(item('enderio:block_dark_paper_anvil', 2)) // Very Damaged Dark Paper Anvil

mods.jei.ingredient.removeAndHide(item('enderio:item_magnet')) // Item Magnet (Because GregTech provide a same function item
mods.jei.ingredient.removeAndHide(item('enderio:item_magnet').withNbt(['enderio:energy': 100000]))

mods.jei.ingredient.removeAndHide(item('enderio:item_soul_filter_normal')) // Soul Item Filter
mods.jei.ingredient.removeAndHide(item('enderio:item_soul_filter_big')) // Big Soul Item Filter

mods.jei.ingredient.removeAndHide(item('enderio:block_painted_pressure_plate', 10)) // Soularium Pressure Plate
mods.jei.ingredient.removeAndHide(item('enderio:block_painted_pressure_plate', 11)) // Soularium Pressure Plate (Silent)
mods.jei.ingredient.removeAndHide(item('enderio:block_painted_pressure_plate', 12)) // Soularium Pressure Plate (Configurable)
mods.jei.ingredient.removeAndHide(item('enderio:block_painted_pressure_plate', 13)) // Soularium Pressure Plate (Configurable, Silent)

mods.jei.ingredient.removeAndHide(item('enderio:item_capacitor_grainy')) // Grainy Capacitor

mods.jei.category.hideCategory('AlloySmelter')
mods.jei.category.hideCategory('StirlingGenerator')
mods.jei.category.hideCategory('ZombieGenerator')
mods.jei.category.hideCategory('EnderGenerator')
mods.jei.category.hideCategory('LavaGenerator')
mods.jei.category.hideCategory('SolarPanel')
mods.jei.category.hideCategory('Painter')
mods.jei.category.hideCategory('EIOTank')
mods.jei.category.hideCategory('EIOWC')

// More Furnaces
mods.jei.catalyst.add('minecraft.smelting', item('morefurnaces:furnaceblock')) // Iron Furnace
mods.jei.catalyst.add('minecraft.smelting', item('morefurnaces:furnaceblock', 5)) // Copper Furnace
mods.jei.catalyst.add('minecraft.smelting', item('morefurnaces:furnaceblock', 1)) // Gold Furnace
mods.jei.catalyst.add('minecraft.smelting', item('morefurnaces:furnaceblock', 6)) // Silver Furnace
mods.jei.catalyst.add('minecraft.smelting', item('morefurnaces:furnaceblock', 2)) // Diamond Furnace
mods.jei.catalyst.add('minecraft.smelting', item('morefurnaces:furnaceblock', 3)) // Obsidian Furnace
mods.jei.catalyst.add('minecraft.smelting', item('morefurnaces:furnaceblock', 4)) // Netherrack Furnace

// Forge Microblocks
mods.jei.ingredient.removeAndHide(item('microblockcbe:saw_stone'))
mods.jei.ingredient.removeAndHide(item('microblockcbe:saw_iron'))
mods.jei.ingredient.removeAndHide(item('microblockcbe:saw_diamond'))
mods.jei.ingredient.removeAndHide(item('microblockcbe:stone_rod'))
mods.jei.ingredient.removeAndHide(item('microblockcbe:microblock'))
mods.jei.ingredient.removeAndHide(item('microblockcbe:microblock', 1).withNbt(['mat': 'minecraft:stone[variant=stone]']))

// Project Red
mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 100)) // Copper Ingot
mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 101)) // Tin Ingot
mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 102)) // Silver Ingot
mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 103)) // Redstone Alloy Ingot
mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 104)) // Electrotine Alloy Ingot
mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 105)) // Electrotine Dust

mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 200)) // Ruby
mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 201)) // Sapphire
mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 202)) // Peridot

mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 250)) // Sand Coal Mixture
mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 251)) // Redstone Iron Mixture
mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 252)) // Electrotine Iron Mixture

mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 300)) // Crystallized Silicon Ingot
mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 301)) // Silicon

mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 310)) // Redstone Silicon Mixture
mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 311)) // Glowstone Silicon Mixture
mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 312)) // Electrotine Silicon Mixture

mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 320)) // Infused Silicon

mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 341)) // Energized Silicon
mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 342)) // Electrotine Silicon

mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 400)) // Copper Coil
mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 401)) // Iron Coil
mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 402)) // Gold Coil

mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 410)) // Motor

mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 420)) // Cloth
mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 421)) // Sail

mods.jei.ingredient.removeAndHide(item('projectred-core:resource_item', 600)) // Empty Logic Chip

mods.jei.ingredient.removeAndHide(item('projectred-core:drawplate')) // Drawplate
