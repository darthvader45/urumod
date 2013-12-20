package uruToolsAndArmor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;

public class ItemLegsUru extends Item {
	public ItemLegsUru(int par1, EnumArmorMaterial uRU2, int i) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("uruarmor_leggins");
		func_111206_d("urutoolsarmor:uruarmor_leggins");
	}
}
