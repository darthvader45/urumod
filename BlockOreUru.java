package uruToolsAndArmor;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockOreUru extends Block {

	public BlockOreUru(int par1, Material par2Material) {
		super(par1, par2Material);
		par1 = 3500;
		par2Material = Material.rock;
		func_111022_d("urutoolsarmor:uruore");
	}

	public int idDropped(int par1, Random random, int zero) {
        return 3500;
}
	
}
