import gregtech.api.util.LocalizationUtils
import net.minecraftforge.event.entity.player.ItemTooltipEvent

import static gregtech.api.GTValues.MV
import static gregtech.api.GTValues.VNF

log.info("Starting to add Item Tooltips...")

event_manager.listen { ItemTooltipEvent event ->
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
}