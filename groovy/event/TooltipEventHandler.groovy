import com.morphismmc.morphismlib.util.I18nUtil
import net.minecraftforge.event.entity.player.ItemTooltipEvent

import static gregtech.api.GTValues.MV
import static gregtech.api.GTValues.VNF

log.info("Starting to add Item Tooltips...")

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack() in item('appliedenergistics2:quartz_glass'))
        event.getToolTip() << I18nUtil.format('gtlitecore.tooltip.glass_tier', VNF[MV])
    if (event.getItemStack() in item('appliedenergistics2:quartz_vibrant_glass'))
        event.getToolTip() << I18nUtil.format('gtlitecore.tooltip.glass_tier', VNF[MV])
}