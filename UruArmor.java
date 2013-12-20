package uruToolsAndArmor;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class UruArmor extends ItemArmor {

	public UruArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
			super(par1, par2EnumArmorMaterial, par3, par4);
			func_111206_d("generic:genericItem");
			func_111206_d("generic:genericItem");
			func_111206_d("generic:genericItem");
			}

			public String getArmorTextureFile(ItemStack itemstack) {
			if(itemstack.itemID == UruToolsandArmor.ItemHelmetUru.itemID || itemstack.itemID == UruToolsandArmor.ItemPlateUru.itemID){
				return "urutoolsandarmor:textures/armor/uru_1.png";
			}

			if(itemstack.itemID == UruToolsandArmor.ItemBootsUru.itemID){
				return "urutoolsandarmor:textures/armor/uru_1.png";
			}

			if(itemstack.itemID == UruToolsandArmor.ItemLegsUru.itemID){
				return "urutoolsandarmor:textures/armor/uru_2.png";
			}
			else return null;

			}

			}

