package uruToolsAndArmor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class ItemAxeUru extends ItemAxe {

	public ItemAxeUru(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		par1 = 6002;
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName("uruaxe");
		func_111206_d("urutoolsarmor:uruaxe");
	}

}
