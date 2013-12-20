package uruToolsAndArmor;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemGungnir extends Item {

	public ItemGungnir(int par1) {
		super(par1);
		efficiencyOnProperMaterial = 16;
		setMaxDamage(3122);
		setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabCombat);
		func_111206_d("urutoolsarmor:gungnir");
		}
	private Block[] blocksEffectiveAgainst = new Block[]
        {            
        };

        //harvest level
        int harvest = 4;

protected float efficiencyOnProperMaterial;


public boolean canHarvestBlock(Block par1Block)
{
    if (par1Block == Block.obsidian)
    {
        return harvest == 3;
    }

    if (par1Block == Block.blockDiamond || par1Block == Block.oreDiamond)
    {
        return harvest >= 2;
    }

    if (par1Block == Block.blockGold || par1Block == Block.oreGold)
    {
        return harvest >= 2;
    }

    if (par1Block == Block.blockIron || par1Block == Block.oreIron)
    {
        return harvest >= 1;
    }

    if (par1Block == Block.blockLapis || par1Block == Block.oreLapis)
    {
        return harvest >= 1;
    }

    if (par1Block == Block.oreRedstone || par1Block == Block.oreRedstoneGlowing)
    {
        return harvest >= 2;
    }

    if (par1Block.blockMaterial == Material.rock)
    {
        return true;
    }

    return par1Block.blockMaterial == Material.iron;
}


/**
* Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct blocktype, 1.5F if
* sword
*/
public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
{
for (int i = 0; i < blocksEffectiveAgainst.length; i++)
{
    if (blocksEffectiveAgainst[i] == par2Block)
    {
        return efficiencyOnProperMaterial;
    }
}

return 0.0F;
}

/**
* Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
* the damage on the stack.
*/
public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
{
par1ItemStack.damageItem(2, par3EntityLiving);
return true;
}

public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLiving par7EntityLiving){
    par1ItemStack.damageItem(1, par7EntityLiving);
    return true;
}

/**
* Returns the damage against a given entity.
*/
public int getDamageVsEntity(Entity par1Entity)
{
return 16;
}

/**
* Returns True is the item is renderer in full 3D when hold.
*/
public boolean isFull3D()
{
return true;
}

/**
* Return the enchantability factor of the item, most of the time is based on material.
*/
public int getItemEnchantability()
{
//kok se lohk cara
return 50;
}

public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
{
float f = 1.0F;
float f1 = entityplayer.prevRotationPitch + (entityplayer.rotationPitch - entityplayer.prevRotationPitch) * f;
float f2 = entityplayer.prevRotationYaw + (entityplayer.rotationYaw - entityplayer.prevRotationYaw) * f;
double d = entityplayer.prevPosX + (entityplayer.posX - entityplayer.prevPosX) * (double)f;
double d1 = (entityplayer.prevPosY + (entityplayer.posY - entityplayer.prevPosY) * (double)f + 1.6200000000000001D) - (double)entityplayer.yOffset;
double d2 = entityplayer.prevPosZ + (entityplayer.posZ - entityplayer.prevPosZ) * (double)f;
Vec3 vec3 = Vec3.createVectorHelper(d, d1, d2);
float f3 = MathHelper.cos(-f2 * 0.01745329F - 3.141593F);
float f4 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
float f5 = -MathHelper.cos(-f1 * 0.01745329F);
float f6 = MathHelper.sin(-f1 * 0.01745329F);
float f7 = f4 * f5;
float f8 = f6;
float f9 = f3 * f5;
double d3 = 5000D;
Vec3 vec31 = vec3.addVector((double)f7 * d3, (double)f8 * d3, (double)f9 * d3);
MovingObjectPosition movingobjectposition = world.rayTraceBlocks_do_do(vec3, vec31, false, true);
if (movingobjectposition == null) 
{
return itemstack;
}
if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE) 
{
int i = movingobjectposition.blockX;
    int j = movingobjectposition.blockY;
    int k = movingobjectposition.blockZ;
    world.spawnEntityInWorld(new EntityLightningBolt(world, i, j, k));
}
return itemstack;
}

public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
par1ItemStack.addEnchantment(Enchantment.knockback, 4);
}


}

