package uruToolsAndArmor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;

public class ItemHelmetUru extends Item {

	public ItemHelmetUru(int par1, EnumArmorMaterial URU2, int i) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("uruarmor_head");
		func_111206_d("urutoolsarmor:uruarmor_head");
	}

}
