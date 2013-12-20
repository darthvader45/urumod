package uruToolsAndArmor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;

public class ItemPlateUru extends Item {

	public ItemPlateUru(int par1, EnumArmorMaterial URU2, int i) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("uruarmor_body");
		func_111206_d("urutoolsarmor:uruarmor_body");
		}

}
