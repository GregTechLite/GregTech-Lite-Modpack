log.info("Starting to load Ore Dictionaries...")

// Applied Energistics 2
ore_dict.add('glassMv', item('appliedenergistics2:quartz_glass')) // Quartz Glass
ore_dict.add('glassMv', item('appliedenergistics2:quartz_vibrant_glass')) // Vibration Quartz Glass

// EnderIO
ore_dict.add('capacitorBasic', item('enderio:item_basic_capacitor')) // Basic Capacitor
ore_dict.add('capacitorBasic', item('enderio:item_capacitor_silver')) // Silver Capacitor

ore_dict.add('capacitorAdvanced', item('enderio:item_basic_capacitor', 1)) // Double-Layer Capacitor
ore_dict.add('capacitorAdvanced', item('enderio:item_capacitor_energetic_silver')) // Energetic Silver Capacitor

ore_dict.add('capacitorData', item('enderio:item_basic_capacitor', 2)) // Octadial Capacitor
ore_dict.add('capacitorData', item('enderio:item_capacitor_vivid')) // Vivid Capacitor

ore_dict.add('capacitorElite', item('enderio:item_capacitor_crystalline')) // Crystalline Capacitor

ore_dict.add('capacitorMaster', item('enderio:item_capacitor_melodic')) // Melodic Capacitor

ore_dict.add('capacitorUltimate', item('enderio:item_capacitor_stellar')) // Stellar Capacitor

ore_dict.add('capacitorSuperconductor', item('enderio:item_capacitor_totemic')) // Totemic Capacitor

// GregTech
for (i in 0..7)
{
    ore_dict.add('casingWireCoil', item('gregtech:wire_coil', i))
}

for (i in 0..4)
{
    ore_dict.add('casingWireCoil', item('gtlitecore:wire_coil', i))
}

// GregTech Lite Core
for (i in 0..13)
{
    ore_dict.add('casingMotor', item('gtlitecore:motor_casing', i))
    ore_dict.add('casingPiston', item('gtlitecore:piston_casing', i))
    ore_dict.add('casingPump', item('gtlitecore:pump_casing', i))
    ore_dict.add('casingConveyor', item('gtlitecore:conveyor_casing', i))
    ore_dict.add('casingRobotArm', item('gtlitecore:robot_arm_casing', i))
    ore_dict.add('casingEmitter', item('gtlitecore:emitter_casing', i))
    ore_dict.add('casingSensor', item('gtlitecore:sensor_casing', i))
    ore_dict.add('casingFieldGen', item('gtlitecore:field_gen_casing', i))
    ore_dict.add('casingProcessor', item('gtlitecore:processor_casing', i))
    ore_dict.add('casingComponentAssembly', item('gtlitecore:component_assembly_casing', i))
}