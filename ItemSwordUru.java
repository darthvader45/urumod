package uruToolsAndArmor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemSwordUru extends ItemSword {

	public ItemSwordUru(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		par1 = 6003;
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("urusword");
		func_111206_d("urutoolsarmor:urusword");
	}

}
