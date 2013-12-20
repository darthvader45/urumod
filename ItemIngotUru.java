package uruToolsAndArmor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemIngotUru extends Item {

	public ItemIngotUru(int par1) {
		super(par1);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("ingoturu");
		func_111206_d("urutoolsarmor:ingoturu");
	}

}
