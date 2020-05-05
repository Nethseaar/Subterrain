package com.ancientconstruct.subterrain.init;

import java.util.function.Supplier;

import com.ancientconstruct.subterrain.Subterrain;
import com.ancientconstruct.subterrain.Subterrain.SubterrainItemGroup;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraft.util.LazyValue;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Subterrain.MOD_ID, bus = Bus.MOD)
@ObjectHolder(Subterrain.MOD_ID)
public class ItemInit {
	
	//Villdimension organic
	public static final Item green_berry = null;
	public static final Item shriveled_green_berry = null;
	public static final Item shriveled_purple_berry = null;
	public static final Item compact_green_berry = null;
	public static final Item compact_purple_berry = null;
	public static final Item ring_tree_stick = null;
	public static final Item sphere_tree_stick = null;
	
	//Villdimension inorganic
	public static final Item darkstone_hex = null;
	public static final Item dimstone_hex = null;
	public static final Item deathstone_hex = null;
	public static final Item springstone_hex = null;
	public static final Item floatstone_hex = null;
	public static final Item lightstone_hex = null;
	public static final Item darkness = null;
	public static final Item gravity = null;
	public static final Item lethargy = null;

	//Tools
	
	public static final Item flint_tool = null;
	
	//Picks
	public static final Item bone_pick_stone = null;
	public static final Item bone_pick_iron = null;
	public static final Item bone_pick_gold = null;
	public static final Item bone_pick_diamond = null;
	
	//Shovels
	public static final Item bone_shovel_stone = null;
	public static final Item bone_shovel_iron = null;
	public static final Item bone_shovel_gold = null;
	public static final Item bone_shovel_diamond = null;
	
	//Hoes
	public static final Item bone_hoe_stone = null;
	public static final Item bone_hoe_iron = null;
	public static final Item bone_hoe_gold = null;
	public static final Item bone_hoe_diamond = null;
	
	//Axes
	public static final Item bone_axe_stone = null;
	public static final Item bone_axe_iron = null;
	public static final Item bone_axe_gold = null;
	public static final Item bone_axe_diamond = null;
	
	//Swords
	public static final Item bone_sword_stone = null;
	public static final Item bone_sword_iron = null;
	public static final Item bone_sword_gold = null;
	public static final Item bone_sword_diamond = null;
	
	//Misc Overworld
	public static final Item bitumen_bucket = null;
	public static final Item bucket_with_bitumen = null;
	public static final Item bitumen = null;
	
	//Dyed hexes
	public static final Item darkstone_hex_white = null;
	public static final Item darkstone_hex_pearl = null;
	public static final Item darkstone_hex_red = null;
	public static final Item darkstone_hex_maroon = null;
	public static final Item darkstone_hex_blue = null;
	public static final Item darkstone_hex_light_blue = null;
	public static final Item darkstone_hex_cyan = null;
	public static final Item darkstone_hex_orange = null;
	public static final Item darkstone_hex_amber = null;
	public static final Item darkstone_hex_grey = null;
	public static final Item darkstone_hex_dark_grey = null;
	public static final Item darkstone_charcoal = null;
	public static final Item darkstone_hex_black = null;
	public static final Item darkstone_hex_green = null;
	public static final Item darkstone_hex_lime = null;
	public static final Item darkstone_hex_olive = null;
	public static final Item darkstone_hex_magenta = null;
	public static final Item darkstone_hex_yellow = null;
	public static final Item darkstone_hex_pink = null;
	public static final Item darkstone_hex_purple = null;
	public static final Item darkstone_hex_violet = null;
	public static final Item darkstone_hex_brown = null;
	
	public static final Item trilobite = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		
		//Villdimension organic
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance).food(new Food.Builder().hunger(1).saturation(0.6f).build())).setRegistryName("green_berry"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance).food(new Food.Builder().hunger(1).saturation(0.3f).fastToEat().setAlwaysEdible().effect(new EffectInstance(Effects.HASTE), 6000).build())).setRegistryName("shriveled_green_berry"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance).food(new Food.Builder().hunger(4).saturation(0.6f).fastToEat().setAlwaysEdible().effect(new EffectInstance(Effects.NIGHT_VISION), 6000).build())).setRegistryName("shriveled_purple_berry"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("compact_green_berry"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("compact_purple_berry"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("ring_tree_stick"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("sphere_tree_stick"));
		
		//Villdimension inorganic
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("dimstone_hex"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("deathstone_hex"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("springstone_hex"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("floatstone_hex"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("lightstone_hex"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkness"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("lethargy"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("gravity"));
		
		//Dyed hexes
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_white"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_pearl"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_red"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_maroon"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_blue"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_light_blue"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_cyan"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_orange"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_amber"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_grey"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_dark_grey"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_charcoal"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_black"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_green"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_lime"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_olive"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_magenta"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_yellow"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_pink"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_purple"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_violet"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("darkstone_hex_brown"));
		
		//Misc overworld
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bitumen"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bucket_with_bitumen"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bitumen_bucket"));
		event.getRegistry().register(new Item(new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("trilobite"));


		
		//Tools
		
			event.getRegistry().register(new PickaxeItem(ModItemTier.FLINT, 4, 2.0f, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("flint_tool"));
			
			//Picks
			event.getRegistry().register(new PickaxeItem(ItemTier.STONE, 1, -2.8f, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_pick_stone"));
			event.getRegistry().register(new PickaxeItem(ItemTier.IRON, 1, -2.8f, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_pick_iron"));
			event.getRegistry().register(new PickaxeItem(ItemTier.GOLD, 1, -2.8f, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_pick_gold"));
			event.getRegistry().register(new PickaxeItem(ItemTier.DIAMOND, 1, -2.8f, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_pick_diamond"));
			
			//Shovels
			event.getRegistry().register(new ShovelItem(ItemTier.STONE, 1.5F, -3.0f, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_shovel_stone"));
			event.getRegistry().register(new ShovelItem(ItemTier.IRON, 1.5F, -3.0f, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_shovel_iron"));
			event.getRegistry().register(new ShovelItem(ItemTier.GOLD, 1.5F, -3.0f, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_shovel_gold"));
			event.getRegistry().register(new ShovelItem(ItemTier.DIAMOND, 1.5F, -3.0f, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_shovel_diamond"));
			
			//Hoes
			event.getRegistry().register(new HoeItem(ItemTier.STONE, -2.0f, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_hoe_stone"));
			event.getRegistry().register(new HoeItem(ItemTier.IRON, -1.0f, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_hoe_iron"));
			event.getRegistry().register(new HoeItem(ItemTier.GOLD, -3.0f, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_hoe_gold"));
			event.getRegistry().register(new HoeItem(ItemTier.DIAMOND, 0.0f, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_hoe_diamond"));
			
			//Axes
			event.getRegistry().register(new AxeItem(ItemTier.STONE, 7.0F, -3.2f, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_axe_stone"));
			event.getRegistry().register(new AxeItem(ItemTier.IRON, 6.0F, -3.1F, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_axe_iron"));
			event.getRegistry().register(new AxeItem(ItemTier.GOLD, 6.0F, -3.0f, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_axe_gold"));
			event.getRegistry().register(new AxeItem(ItemTier.DIAMOND, 5.0F, -3.0f, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_axe_diamond"));
			
			//Swords
			event.getRegistry().register(new SwordItem(ItemTier.STONE, 3, -2.4F, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_sword_stone"));
			event.getRegistry().register(new SwordItem(ItemTier.IRON, 3, -2.4F, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_sword_iron"));
			event.getRegistry().register(new SwordItem(ItemTier.GOLD, 3, -2.4F, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_sword_gold"));
			event.getRegistry().register(new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().group(SubterrainItemGroup.instance)).setRegistryName("bone_sword_diamond"));
	}
	
	public enum ModItemTier implements IItemTier {
		// int harvestLevel, int maxUses, float efficiency, float attackDamage, int
		// enchantability, Supplier<Ingredient> repairMaterial
		FLINT(0, 9, 2.0F, 0.0F, 15, () -> {
			return Ingredient.fromItems(ItemInit.flint_tool);
		});

		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;

		private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,
				Supplier<Ingredient> repairMaterial) {
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}
		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
	}
}