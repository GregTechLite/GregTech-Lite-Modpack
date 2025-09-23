package event;

import net.minecraftforge.fml.common.eventhandler.EventPriority
import gregtech.api.unification.material.event.MaterialEvent

import static gregtech.api.unification.material.Materials.*
import static gregtech.api.unification.material.info.MaterialFlags.*

eventManager.listen(EventPriority.LOWEST) { MaterialEvent event ->
   
    // Bolt & Screw
    Copper.addFlags(GENERATE_BOLT_SCREW)
    Stone.addFlags(GENERATE_BOLT_SCREW)
    Obsidian.addFlags(GENERATE_BOLT_SCREW)
    BlackSteel.addFlags(GENERATE_BOLT_SCREW)
    BlueSteel.addFlags(GENERATE_BOLT_SCREW)

    // foil
    Iron.addFlags(GENERATE_FOIL)
    RoseGold.addFlags(GENERATE_FOIL)
    SterlingSilver.addFlags(GENERATE_FOIL)
    BlueAlloy.addFlags(GENERATE_FOIL)
    HSSE.addFlags(GENERATE_FOIL)

    // frameGt
    WroughtIron.addFlags(GENERATE_FRAME)
    Iron.addFlags(GENERATE_FRAME)

    // gear
    Nickel.addFlags(GENERATE_GEAR)

    // gearSmall
    RedAlloy.addFlags(GENERATE_SMALL_GEAR)
    TinAlloy.addFlags(GENERATE_SMALL_GEAR)
    Nickel.addFlags(GENERATE_SMALL_GEAR)
    Brass.addFlags(GENERATE_SMALL_GEAR)

    // plate
    Netherrack.addFlags(GENERATE_PLATE)

    // plateDouble
    Ruridit.addFlags(GENERATE_DOUBLE_PLATE)
    VanadiumGallium.addFlags(GENERATE_DOUBLE_PLATE)

    // plateDense
    VanadiumSteel.addFlags(GENERATE_DENSE)
    HSSG.addFlags(GENERATE_DENSE)
    Ruridit.addFlags(GENERATE_DENSE)
    VanadiumGallium.addFlags(GENERATE_DENSE)

    // ring
    Brass.addFlags(GENERATE_RING)
    Copper.addFlags(GENERATE_RING)

    // round
    Iron.addFlags(GENERATE_ROUND)
    TinAlloy.addFlags(GENERATE_ROUND)

    // stick
    Obsidian.addFlags(GENERATE_ROD)

    // stickLong
    RedAlloy.addFlags(GENERATE_LONG_ROD)
    
    // spring
    WroughtIron.addFlags(GENERATE_SPRING)
    StainlessSteel.addFlags(GENERATE_SPRING)
    RedAlloy.addFlags(GENERATE_SPRING)
    SterlingSilver.addFlags(GENERATE_SPRING)

    // springSmall
    RedAlloy.addFlags(GENERATE_SPRING_SMALL)
    BatteryAlloy.addFlags(GENERATE_SPRING_SMALL)
    Nickel.addFlags(GENERATE_SPRING_SMALL)

    // wireFine
    WroughtIron.addFlags(GENERATE_FINE_WIRE)
    RoseGold.addFlags(GENERATE_FINE_WIRE)

}