package urutoolsandarmor;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import uruToolsAndArmor.common.UruCommonProxy;
import uruToolsAndArmor.client.UruClientProxy;

@Mod(modid="UruToolsAndArmor", name="Uru Tools and Armor", version="2.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class UruToolsandArmor {

	public static Block BlockOreUru;
	public static Block BlockUru;
	public static Item ItemIngotUru;
	public static Item ItemPickaxeUru;
	public static Item ItemAxeUru;
	public static Item ItemHoeUru;
	public static Item ItemSwordUru;
	public static Item ItemShovelUru;
	public static Item ItemHelmetUru;
	public static Item ItemPlateUru;
	public static Item ItemLegsUru;
	public static Item ItemBootsUru;
	public static Item Mjolnir;
	public static Item Gungnir;
	UruGeneration urugeneration = new UruGeneration();
        // The instance of your mod that Forge uses.
        @Instance("UruToolsAndArmor")
        public static UruToolsandArmor instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="urutoolsandarmor.client.UruClientProxy", serverSide="urutoolsandarmor.common.UruCommonProxy")
        public static UruCommonProxy proxy;
        
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
        
        @EventHandler
        public void load(FMLInitializationEvent event) {
            BlockOreUru = new BlockOreUru(3500, Material.rock).setHardness(4F).setResistance(15.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("uruore").setCreativeTab(CreativeTabs.tabBlock);
            BlockUru = new BlockUru(3501, Material.iron).setHardness(4F).setResistance(6000.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("blockuru").setCreativeTab(CreativeTabs.tabBlock);
        	ItemIngotUru = new ItemIngotUru(6000).setMaxStackSize(64).setUnlocalizedName("ingoturu");
        	EnumToolMaterial URU= new EnumHelper().addToolMaterial("URU", 3, 3122, 16F, 16, 50); 
        	EnumArmorMaterial URU2 = new EnumHelper().addArmorMaterial("URU", 83, new int[] {9, 24, 12, 9}, 50);
        	ItemPickaxeUru = new ItemPickaxeUru(6001, URU).setUnlocalizedName("axeuru");
        	ItemAxeUru = new ItemAxeUru(6002,URU).setUnlocalizedName("pickaxeuru");
        	ItemSwordUru = new ItemSwordUru(6003,URU).setUnlocalizedName("sworduru");
        	ItemHoeUru = new ItemHoeUru(6004,URU).setUnlocalizedName("hoeuru");
        	ItemShovelUru = new ItemShovelUru(6005,URU).setUnlocalizedName("shoveluru");
        	ItemHelmetUru = new ItemHelmetUru(6006,URU2, proxy.addArmor("URU")).setUnlocalizedName("helmeturu");
        	ItemPlateUru = new ItemPlateUru(6007,URU2, proxy.addArmor("URU")).setUnlocalizedName("plateuru");
        	ItemLegsUru = new ItemLegsUru(6008,URU2, proxy.addArmor("URU")).setUnlocalizedName("legsuru");
        	ItemBootsUru = new ItemBootsUru(6009,URU2, proxy.addArmor("URU")).setUnlocalizedName("bootsuru");
        	Mjolnir = new ItemMjolnir(6010).setUnlocalizedName("mjolnir");
        	Gungnir = new ItemGungnir(6011).setUnlocalizedName("gungnir");
        	MinecraftForge.setBlockHarvestLevel(BlockOreUru, "pickaxe", 3);
        	MinecraftForge.setBlockHarvestLevel(BlockUru, "pickaxe", 3);
        	GameRegistry.addSmelting(3500, new ItemStack(ItemIngotUru, 1), 100.0F);
        	GameRegistry.addRecipe(new ItemStack(BlockUru, 1), "xxx", "xxx", "xxx",
        	        'x', ItemIngotUru);
        	GameRegistry.addRecipe(new ItemStack(ItemPickaxeUru, 1), "xxx", "y", "y",
        	        'x', ItemIngotUru, 'y', Item.stick);
        	GameRegistry.addRecipe(new ItemStack(ItemAxeUru, 1), "xx", "xy", "y",
        	        'x', ItemIngotUru, 'y', Item.stick);
        	GameRegistry.addRecipe(new ItemStack(ItemShovelUru, 1), "x", "y", "y",
        	        'x', ItemIngotUru, 'y', Item.stick);
        	GameRegistry.addRecipe(new ItemStack(ItemHoeUru, 1), "xx", "y", "y",
        	        'x', ItemIngotUru, 'y', Item.stick);
        	GameRegistry.addRecipe(new ItemStack(ItemSwordUru, 1), "x", "x", "y",
        	        'x', ItemIngotUru, 'y', Item.stick);
        	GameRegistry.addRecipe(new ItemStack(Mjolnir, 1), "xxx", "xyx", " z ",
        	        'x', BlockUru, 'z', Item.stick, 'y', Item.netherStar);
        	GameRegistry.addRecipe(new ItemStack(ItemHelmetUru, 1), "xxx", "x x",
        	        'x', ItemIngotUru);
        	GameRegistry.addRecipe(new ItemStack(ItemPlateUru, 1), "x x", "xxx", "xxx",
        	        'x', ItemIngotUru);
        	GameRegistry.addRecipe(new ItemStack(ItemLegsUru, 1), "xxx", "x x","x x",
        	        'x', ItemIngotUru);
        	GameRegistry.addRecipe(new ItemStack(ItemBootsUru, 1), "x x", "x x",
        	        'x', ItemIngotUru);
        	GameRegistry.addRecipe(new ItemStack(Mjolnir, 1), "xxx", "xyx", "xyx",
        	        'x', BlockUru, 'y', Item.ingotGold);
        	LanguageRegistry.addName(BlockOreUru, "Uru Ore");
        	LanguageRegistry.addName(BlockUru, "Block of Uru");
        	LanguageRegistry.addName(ItemIngotUru, "Uru Ingot");
        	LanguageRegistry.addName(ItemPickaxeUru, "Uru Pickaxe");
        	LanguageRegistry.addName(ItemAxeUru, "Uru Axe");
        	LanguageRegistry.addName(ItemHoeUru, "Uru Hoe");
        	LanguageRegistry.addName(BlockOreUru, "Uru Ore");
        	LanguageRegistry.addName(ItemHelmetUru, "Uru Helmet");
        	LanguageRegistry.addName(ItemPlateUru, "Uru Chestplate");
        	LanguageRegistry.addName(ItemLegsUru, "Uru Leggings");
        	LanguageRegistry.addName(ItemBootsUru, "Uru Boots");
        	LanguageRegistry.addName(Mjolnir, "Mjolnir");
        	LanguageRegistry.addName(Gungnir, "Gungnir");
        	LanguageRegistry.addName(ItemShovelUru, "Uru Shovel");
        	LanguageRegistry.addName(ItemSwordUru, "Uru Sword");
        	MinecraftForge.setBlockHarvestLevel(BlockOreUru, "pickaxe", 3);
        	GameRegistry.registerBlock(BlockOreUru, "uruore");
        	GameRegistry.registerBlock(BlockUru, "blockuru");
        	GameRegistry.registerWorldGenerator(urugeneration);
        	proxy.registerRenderers();
        }
        
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}
