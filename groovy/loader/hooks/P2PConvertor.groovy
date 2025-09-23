package loader.hooks

import net.minecraft.item.ItemStack
import org.apache.commons.lang3.tuple.Pair

class P2PConvertor 
{

    private static ItemStack p2pStack = null
    private static List<Pair<String, ItemStack>> p2pVariants = null
    
    public static ItemStack getP2PStack() 
    {
        if (p2pStack != null) return p2pStack
        p2pStack = item('appliedenergistics2:part', 460)
        return p2pStack
    }

    public static List<Pair<String, ItemStack>> getP2PVariants()
    {
        if (p2pVariants != null) return p2pVariants
        p2pVariants = [
            Pair.of('Redstone', item('appliedenergistics2:part', 461)),
			Pair.of('Item', item('appliedenergistics2:part', 462)),
			Pair.of('Fluid', item('appliedenergistics2:part', 463)),
			Pair.of('Light', item('appliedenergistics2:part', 467)),
			Pair.of('RF', item('appliedenergistics2:part', 469)),
			Pair.of('EU', item('appliedenergistics2:part', 470))
            // TODO If we added ME Interface P2P, then added it at here.
        ]
        return p2pVariants
    }

}