import static gregtech.api.GTValues.*
import static util.GroovyUtil.*

log.info("Starting to load extendedae recipes...")

def assembler = recipemap('assembler')
def packer = recipemap('packer')

// ME Infinity Cobblestone Cell
crafting.remove('extendedae:cobblestone_cell')
packer.recipeBuilder()
    .inputs(item('appliedenergistics2:material', 39)) // Empty Storage Cell
    .inputs(item('minecraft:cobblestone'))
    .outputs(item('extendedae:infinity_cell')
        .withNbt(['r': ['Req': 0l, 
                        'Cnt': 1l, 
                        'Damage': (short) 0, 
                        'Count': 1, 
                        'id': 'minecraft:cobblestone', 
                        'Craft': (byte) 0], 
                  't': 'i']))
    .EUt(VA[ULV])
    .duration(2 * TICK)
    .buildAndRegister()

// ME Infinity Water Cell
crafting.remove('extendedae:water_cell')
packer.recipeBuilder()
    .inputs(item('appliedenergistics2:material', 39)) // Empty Storage Cell
    .inputs(metaitem('cover.infinite_water'))
    .outputs(item('extendedae:infinity_cell')
        .withNbt(['r': ['FluidName': 'water', 
                        'Count': (byte) 0, 
                        'Cnt': 1l, 
                        'Req': 0l, 
                        'Craft': (byte) 0], 
                  't': 'f']))
    .EUt(VA[ULV])
    .duration(2 * TICK)
    .buildAndRegister()

// ME Infinity Covered Cable Cell
assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(item('appliedenergistics2:material', 39)) // Empty Storage Cell
    .inputs(item('appliedenergistics2:part', 36) * 64) // Covered Cable - Fluix
    .outputs(item('extendedae:infinity_cell')
        .withNbt(['r': ['id': 'appliedenergistics2:part', 
                        'Count': 1, 
                        'Damage': (short) 36, 
                        'Cnt': 1l, 
                        'Req': 0l, 
                        'Craft': (byte) 0], 
                  't': 'i']))
    .EUt(VA[MV])
    .duration(10 * SECOND)
    .buildAndRegister()

def dyeColorOres = [ 'dyeWhite', 'dyeOrange', 'dyeMagenta', 'dyeLightBlue',
                     'dyeYellow', 'dyeLime', 'dyePink', 'dyeGray',
                     'dyeLightGray', 'dyeCyan', 'dyePurple', 'dyeBlue',
                     'dyeBrown', 'dyeGreen', 'dyeRed', 'dyeBlack' ]

for (int i = 0; i < 16; i++)
{
    crafting.shapelessBuilder()
        .name(resource('gtlite:infinity_covered_cable_' + dyeColorOres[i] + '_cell'))
        .input([item('extendedae:infinity_cell')
            .withNbt(['r': ['id': 'appliedenergistics2:part', 
                            'Count': 1, 
                            'Damage': (short) 36, 
                            'Cnt': 1l, 
                            'Req': 0l, 
                            'Craft': (byte) 0], 
                      't': 'i']), ore(dyeColorOres[i])])
        .output(item('extendedae:infinity_cell')
            .withNbt(['r': ['id': 'appliedenergistics2:part', 
                            'Count': 1, 
                            'Damage': (short) (20 + i), 
                            'Cnt': 1l, 
                            'Req': 0l, 
                            'Craft': (byte) 0], 
                      't': 'i']))
        .register()
}

log.info("Complete load extendedae recipes!")