package uruToolsAndArmor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class ItemShovelUru extends ItemSpade {

	public ItemShovelUru(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		par1 = 6005;
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName("urushovel");
		func_111206_d("urutoolsarmor:urushovel");
	}

}
