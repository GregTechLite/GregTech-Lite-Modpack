import gregtech.api.util.LocalizationUtils
import gregtech.api.util.SmallDigits
import net.minecraft.util.text.TextFormatting
import net.minecraftforge.event.entity.player.ItemTooltipEvent

import static gregtech.api.GTValues.MV
import static gregtech.api.GTValues.VNF

event_manager.listen { ItemTooltipEvent event ->
    // Tooltip
    if (event.getItemStack() in item('appliedenergistics2:quartz_glass'))
        event.getToolTip() << LocalizationUtils.format('gtlitecore.tooltip.glass_tier', VNF[MV])
    if (event.getItemStack() in item('appliedenergistics2:quartz_vibrant_glass'))
        event.getToolTip() << LocalizationUtils.format('gtlitecore.tooltip.glass_tier', VNF[MV])
    if (event.getItemStack() in item('functionalstoragelegacy:fluid_1'))
        event.getToolTip() << LocalizationUtils.format('gregtech.universal.tooltip.fluid_storage_capacity', 32000)
    if (event.getItemStack() in item('functionalstoragelegacy:fluid_2'))
        event.getToolTip() << LocalizationUtils.format('gregtech.universal.tooltip.fluid_storage_capacity_mult', 2, 16000)
    if (event.getItemStack() in item('functionalstoragelegacy:fluid_4'))
        event.getToolTip() << LocalizationUtils.format('gregtech.universal.tooltip.fluid_storage_capacity_mult', 4, 8000)

    // Chemical Formula
    if (event.getItemStack() in item('enderutilities:enderpart'))
        event.getToolTip() << TextFormatting.YELLOW.toString() + SmallDigits.toSmallDownNumbers("(BeK4N5)Fe")
    if (event.getItemStack() in item('enderutilities:enderpart', 1))
        event.getToolTip() << TextFormatting.YELLOW.toString() + SmallDigits.toSmallDownNumbers("(BeK4N5)Fe")
    if (event.getItemStack() in item('enderutilities:enderpart', 2))
        event.getToolTip() << TextFormatting.YELLOW.toString() + SmallDigits.toSmallDownNumbers("(BeK4N5)Al")
    if (event.getItemStack() in item('appliedenergistics2:material', 7))
        event.getToolTip() << TextFormatting.YELLOW.toString() + SmallDigits.toSmallDownNumbers("(Si(FeS2)5(CrAl2O3)Hg3)(SiO2)2")
    if (event.getItemStack() in item('appliedenergistics2:fluix_block'))
        event.getToolTip() << TextFormatting.YELLOW.toString() + SmallDigits.toSmallDownNumbers("(Si(FeS2)5(CrAl2O3)Hg3)(SiO2)2")
    if (event.getItemStack() in item('appliedenergistics2:material', 8))
        event.getToolTip() << TextFormatting.YELLOW.toString() + SmallDigits.toSmallDownNumbers("(Si(FeS2)5(CrAl2O3)Hg3)(SiO2)2")
}