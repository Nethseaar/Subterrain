package com.ancientconstruct.subterrain.init;

import com.ancientconstruct.subterrain.Subterrain;
import com.ancientconstruct.subterrain.Subterrain.SubterrainItemGroup;
import com.ancientconstruct.subterrain.objects.blocks.SubterrainLadder;
import net.minecraft.block.Block;
import net.minecraft.block.MushroomBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder (Subterrain.MOD_ID)
@Mod.EventBusSubscriber(modid = Subterrain.MOD_ID, bus = Bus.MOD)
public class BlockInit {

		public static final Block darkstone = null;
		public static final Block dimstone = null;
		public static final Block deathstone = null;
		public static final Block lightstone = null;
		public static final Block floatstone = null;
		public static final Block springstone = null;
		
		public static final Block condensed_darkstone = null;
		public static final Block condensed_dimstone = null;
		public static final Block condensed_deathstone = null;
		public static final Block condensed_lightstone = null;
		public static final Block condensed_floatstone = null;
		public static final Block condensed_springstone = null;
		
		public static final Block smooth_darkstone = null;
		public static final Block smooth_dimstone = null;
		public static final Block smooth_deathstone = null;
		public static final Block smooth_lightstone = null;
		public static final Block smooth_floatstone = null;
		public static final Block smooth_springstone = null;
		
		public static final Block cracked_darkstone = null;
		public static final Block cracked_dimstone = null;
		public static final Block cracked_deathstone = null;
		public static final Block cracked_lightstone = null;
		public static final Block cracked_floatstone = null;
		public static final Block cracked_springstone = null;
		
		public static final Block carved_darkstone = null;
		public static final Block carved_dimstone = null;
		public static final Block carved_deathstone = null;
		public static final Block carved_lightstone = null;
		public static final Block carved_floatstone = null;
		public static final Block carved_springstone = null;
		
		public static final Block darkstone_bricks = null;
		public static final Block dimstone_bricks = null;
		public static final Block deathstone_bricks = null;
		public static final Block lightstone_bricks = null;
		public static final Block floatstone_bricks = null;
		public static final Block springstone_bricks = null;
		
		public static final Block darkstone_tile = null;
		public static final Block dimstone_tile = null;
		public static final Block deathstone_tile = null;
		public static final Block lightstone_tile = null;
		public static final Block floatstone_tile = null;
		public static final Block springstone_tile = null;
		
		public static final Block darkstone_tile_inner = null;
		public static final Block dimstone_tile_inner = null;
		public static final Block deathstone_tile_inner = null;
		public static final Block lightstone_tile_inner = null;
		public static final Block floatstone_tile_inner = null;
		public static final Block springstone_tile_inner = null;
		
		public static final Block darkness_ore_darkstone = null;
		public static final Block darkness_ore_dimstone = null;
		public static final Block darkness_ore_lightstone = null;
		public static final Block lethargy_ore_dimstone = null;
		public static final Block lethargy_ore_lightstone = null;
		public static final Block gravity_ore_lightstone = null;
		public static final Block bitumen_ore = null;
		
		public static final Block darkness_block = null;
		public static final Block lethargy_block = null;
		public static final Block gravity_block = null;
		public static final Block bitumen_block = null;
		
		public static final Block asphalt = null;
		public static final Block end_obsidian = null;
		
		public static final Block ring_tree_planks = null;
		public static final Block ring_tree_wood = null;
		public static final Block purple_berry = null;

		public static final Block glowsand_north = null;
		public static final Block glowsand_south = null;
		public static final Block glowsand_east = null;
		public static final Block glowsand_west = null;
		public static final Block glowsand_up = null;
		public static final Block glowsand_down = null;
		
		public static final Block lantern = null;
		public static final Block bone_ladder = null;
		public static final Block bone_torch = null;
		public static final Block brain_mushroom = null;
		public static final Block stone_table = null;
		public static final Block red_rock = null;
		
//		public static final Block darkstone_stairs = null;

		public static final Block darkstone_white = null;
		public static final Block condensed_darkstone_white = null;
		public static final Block smooth_darkstone_white = null;
		public static final Block cracked_darkstone_white = null;
		public static final Block carved_darkstone_white = null;
		public static final Block darkstone_bricks_white = null;
		public static final Block darkstone_tile_white = null;
		public static final Block darkstone_tile_inner_white = null;

		public static final Block darkstone_pearl = null;
		public static final Block condensed_darkstone_pearl = null;
		public static final Block smooth_darkstone_pearl = null;
		public static final Block cracked_darkstone_pearl = null;
		public static final Block carved_darkstone_pearl = null;
		public static final Block darkstone_bricks_pearl = null;
		public static final Block darkstone_tile_pearl = null;
		public static final Block darkstone_tile_inner_pearl = null;
		
		public static final Block darkstone_red = null;
		public static final Block condensed_darkstone_red = null;
		public static final Block smooth_darkstone_red = null;
		public static final Block cracked_darkstone_red = null;
		public static final Block carved_darkstone_red = null;
		public static final Block darkstone_bricks_red = null;
		public static final Block darkstone_tile_red = null;
		public static final Block darkstone_tile_inner_red = null;

		public static final Block darkstone_maroon = null;
		public static final Block condensed_darkstone_maroon = null;
		public static final Block smooth_darkstone_maroon = null;
		public static final Block cracked_darkstone_maroon = null;
		public static final Block carved_darkstone_maroon = null;
		public static final Block darkstone_bricks_maroon = null;
		public static final Block darkstone_tile_maroon = null;
		public static final Block darkstone_tile_inner_maroon = null;
		
		public static final Block darkstone_blue = null;
		public static final Block condensed_darkstone_blue = null;
		public static final Block smooth_darkstone_blue = null;
		public static final Block cracked_darkstone_blue = null;
		public static final Block carved_darkstone_blue = null;
		public static final Block darkstone_bricks_blue = null;
		public static final Block darkstone_tile_blue = null;
		public static final Block darkstone_tile_inner_blue = null;
		
		public static final Block darkstone_light_blue = null;
		public static final Block condensed_darkstone_light_blue = null;
		public static final Block smooth_darkstone_light_blue = null;
		public static final Block cracked_darkstone_light_blue = null;
		public static final Block carved_darkstone_light_blue = null;
		public static final Block darkstone_bricks_light_blue = null;
		public static final Block darkstone_tile_light_blue = null;
		public static final Block darkstone_tile_inner_light_blue = null;
		
		public static final Block darkstone_cyan = null;
		public static final Block condensed_darkstone_cyan = null;
		public static final Block smooth_darkstone_cyan = null;
		public static final Block cracked_darkstone_cyan = null;
		public static final Block carved_darkstone_cyan = null;
		public static final Block darkstone_bricks_cyan = null;
		public static final Block darkstone_tile_cyan = null;
		public static final Block darkstone_tile_inner_cyan = null;
		
		public static final Block darkstone_orange = null;
		public static final Block condensed_darkstone_orange = null;
		public static final Block smooth_darkstone_orange = null;
		public static final Block cracked_darkstone_orange = null;
		public static final Block carved_darkstone_orange = null;
		public static final Block darkstone_bricks_orange = null;
		public static final Block darkstone_tile_orange = null;
		public static final Block darkstone_tile_inner_orange = null;
		
		public static final Block darkstone_amber = null;
		public static final Block condensed_darkstone_amber = null;
		public static final Block smooth_darkstone_amber = null;
		public static final Block cracked_darkstone_amber = null;
		public static final Block carved_darkstone_amber = null;
		public static final Block darkstone_bricks_amber = null;
		public static final Block darkstone_tile_amber = null;
		public static final Block darkstone_tile_inner_amber = null;
		
		public static final Block darkstone_grey = null;
		public static final Block condensed_darkstone_grey = null;
		public static final Block smooth_darkstone_grey = null;
		public static final Block cracked_darkstone_grey = null;
		public static final Block carved_darkstone_grey = null;
		public static final Block darkstone_bricks_grey = null;
		public static final Block darkstone_tile_grey = null;
		public static final Block darkstone_tile_inner_grey = null;
		
		public static final Block darkstone_dark_grey = null;
		public static final Block condensed_darkstone_dark_grey = null;
		public static final Block smooth_darkstone_dark_grey = null;
		public static final Block cracked_darkstone_dark_grey = null;
		public static final Block carved_darkstone_dark_grey = null;
		public static final Block darkstone_bricks_dark_grey = null;
		public static final Block darkstone_tile_dark_grey = null;
		public static final Block darkstone_tile_inner_dark_grey = null;
		
		public static final Block darkstone_charcoal = null;
		public static final Block condensed_darkstone_charcoal = null;
		public static final Block smooth_darkstone_charcoal = null;
		public static final Block cracked_darkstone_charcoal = null;
		public static final Block carved_darkstone_charcoal = null;
		public static final Block darkstone_bricks_charcoal = null;
		public static final Block darkstone_tile_charcoal = null;
		public static final Block darkstone_tile_inner_charcoal = null;
		
		public static final Block darkstone_black = null;
		public static final Block condensed_darkstone_black = null;
		public static final Block smooth_darkstone_black = null;
		public static final Block cracked_darkstone_black = null;
		public static final Block carved_darkstone_black = null;
		public static final Block darkstone_bricks_black = null;
		public static final Block darkstone_tile_black = null;
		public static final Block darkstone_tile_inner_black = null;
		
		public static final Block darkstone_green = null;
		public static final Block condensed_darkstone_green = null;
		public static final Block smooth_darkstone_green = null;
		public static final Block cracked_darkstone_green = null;
		public static final Block carved_darkstone_green = null;
		public static final Block darkstone_bricks_green = null;
		public static final Block darkstone_tile_green = null;
		public static final Block darkstone_tile_inner_green = null;
		
		public static final Block darkstone_lime = null;
		public static final Block condensed_darkstone_lime = null;
		public static final Block smooth_darkstone_lime = null;
		public static final Block cracked_darkstone_lime = null;
		public static final Block carved_darkstone_lime = null;
		public static final Block darkstone_bricks_lime = null;
		public static final Block darkstone_tile_lime = null;
		public static final Block darkstone_tile_inner_lime = null;
		
		public static final Block darkstone_olive = null;
		public static final Block condensed_darkstone_olive = null;
		public static final Block smooth_darkstone_olive = null;
		public static final Block cracked_darkstone_olive = null;
		public static final Block carved_darkstone_olive = null;
		public static final Block darkstone_bricks_olive = null;
		public static final Block darkstone_tile_olive = null;
		public static final Block darkstone_tile_inner_olive = null;
		
		public static final Block darkstone_magenta = null;
		public static final Block condensed_darkstone_magenta = null;
		public static final Block smooth_darkstone_magenta = null;
		public static final Block cracked_darkstone_magenta = null;
		public static final Block carved_darkstone_magenta = null;
		public static final Block darkstone_bricks_magenta = null;
		public static final Block darkstone_tile_magenta = null;
		public static final Block darkstone_tile_inner_magenta = null;
		
		public static final Block darkstone_yellow = null;
		public static final Block condensed_darkstone_yellow = null;
		public static final Block smooth_darkstone_yellow = null;
		public static final Block cracked_darkstone_yellow = null;
		public static final Block carved_darkstone_yellow = null;
		public static final Block darkstone_bricks_yellow = null;
		public static final Block darkstone_tile_yellow = null;
		public static final Block darkstone_tile_inner_yellow = null;
		
		public static final Block darkstone_pink = null;
		public static final Block condensed_darkstone_pink = null;
		public static final Block smooth_darkstone_pink = null;
		public static final Block cracked_darkstone_pink = null;
		public static final Block carved_darkstone_pink = null;
		public static final Block darkstone_bricks_pink = null;
		public static final Block darkstone_tile_pink = null;
		public static final Block darkstone_tile_inner_pink = null;
		
		public static final Block darkstone_purple = null;
		public static final Block condensed_darkstone_purple = null;
		public static final Block smooth_darkstone_purple = null;
		public static final Block cracked_darkstone_purple = null;
		public static final Block carved_darkstone_purple = null;
		public static final Block darkstone_bricks_purple = null;
		public static final Block darkstone_tile_purple = null;
		public static final Block darkstone_tile_inner_purple = null;
		
		public static final Block darkstone_violet = null;
		public static final Block condensed_darkstone_violet = null;
		public static final Block smooth_darkstone_violet = null;
		public static final Block cracked_darkstone_violet = null;
		public static final Block carved_darkstone_violet = null;
		public static final Block darkstone_bricks_violet = null;
		public static final Block darkstone_tile_violet = null;
		public static final Block darkstone_tile_inner_violet = null;
		
		public static final Block darkstone_brown = null;
		public static final Block condensed_darkstone_brown = null;
		public static final Block smooth_darkstone_brown = null;
		public static final Block cracked_darkstone_brown = null;
		public static final Block carved_darkstone_brown = null;
		public static final Block darkstone_bricks_brown = null;
		public static final Block darkstone_tile_brown = null;
		public static final Block darkstone_tile_inner_brown = null;
		
		public static final Block shale = null;
		
		
		@SubscribeEvent
		public static void registerBlocks (final RegistryEvent.Register<Block> event)
		{
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(10).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("dimstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(5).harvestTool(ToolType.PICKAXE).harvestLevel(3)).setRegistryName("deathstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(15).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("lightstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(7).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("floatstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(7).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("springstone"));

			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(10).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_dimstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(5).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_deathstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(15).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_lightstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(7).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_floatstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(7).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_springstone"));

			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(10).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_dimstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(5).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_deathstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(15).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_lightstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(7).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_floatstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(7).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_springstone"));
		
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(5).lightValue(10).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_dimstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_deathstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(15).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_lightstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(7).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_floatstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(7).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_springstone"));

			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(10).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_dimstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(5).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_deathstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(15).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_lightstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(7).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_floatstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(7).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_springstone"));

			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(10).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("dimstone_bricks"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(5).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("deathstone_bricks"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(15).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("lightstone_bricks"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(7).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("floatstone_bricks"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(7).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("springstone_bricks"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(10).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("dimstone_tile"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(5).harvestTool(ToolType.PICKAXE).harvestLevel(3)).setRegistryName("deathstone_tile"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(15).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("lightstone_tile"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(7).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("floatstone_tile"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(7).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("springstone_tile"));

			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(10).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("dimstone_tile_inner"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(5).harvestTool(ToolType.PICKAXE).harvestLevel(3)).setRegistryName("deathstone_tile_inner"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(15).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("lightstone_tile_inner"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(7).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("floatstone_tile_inner"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).lightValue(7).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("springstone_tile_inner"));

			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkness_ore_dimstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkness_ore_darkstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkness_ore_lightstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("lethargy_ore_dimstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("lethargy_ore_lightstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("gravity_ore_lightstone"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("bitumen_ore"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkness_block"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("lethargy_block"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("gravity_block"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("bitumen_block"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("asphalt"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(3)).setRegistryName("end_obsidian"));

			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(1)).setRegistryName("ring_tree_planks"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(2)).setRegistryName("ring_tree_wood"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.PLANTS).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.SLIME).doesNotBlockMovement().harvestTool(ToolType.AXE).harvestLevel(2)).setRegistryName("purple_berry"));

			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.SAND).lightValue(5).harvestTool(ToolType.SHOVEL).harvestLevel(2)).setRegistryName("glowsand_north"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.SAND).lightValue(5).harvestTool(ToolType.SHOVEL).harvestLevel(2)).setRegistryName("glowsand_south"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.SAND).lightValue(5).harvestTool(ToolType.SHOVEL).harvestLevel(2)).setRegistryName("glowsand_east"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.SAND).lightValue(5).harvestTool(ToolType.SHOVEL).harvestLevel(2)).setRegistryName("glowsand_west"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.SAND).lightValue(5).harvestTool(ToolType.SHOVEL).harvestLevel(2)).setRegistryName("glowsand_up"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.SAND).lightValue(5).harvestTool(ToolType.SHOVEL).harvestLevel(2)).setRegistryName("glowsand_down"));

			event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.METAL).lightValue(14).doesNotBlockMovement().harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("lantern"));
			event.getRegistry().register(new SubterrainLadder(Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.4F).sound(SoundType.LADDER).notSolid()).setRegistryName("bone_ladder"));;
			event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.WOOD).lightValue(14).doesNotBlockMovement().harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName("bone_torch"));
			event.getRegistry().register(new MushroomBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)).setRegistryName("brain_mushroom"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("stone_table"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("red_rock"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_white"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_white"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_white"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_white"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_white"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_white"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_white"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_white"));
	
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_pearl"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_pearl"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_pearl"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_pearl"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_pearl"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_pearl"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_pearl"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_pearl"));
	
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_red"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_red"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_red"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_red"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_red"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_red"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_red"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_red"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_maroon"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_maroon"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_maroon"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_maroon"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_maroon"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_maroon"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_maroon"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_maroon"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_blue"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_blue"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_blue"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_blue"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_blue"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_blue"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_blue"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_blue"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_light_blue"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_light_blue"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_light_blue"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_light_blue"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_light_blue"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_light_blue"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_light_blue"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_light_blue"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_cyan"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_cyan"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_cyan"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_cyan"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_cyan"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_cyan"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_cyan"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_cyan"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_orange"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_orange"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_orange"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_orange"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_orange"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_orange"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_orange"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_orange"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_amber"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_amber"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_amber"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_amber"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_amber"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_amber"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_amber"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_amber"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_grey"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_grey"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_grey"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_grey"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_grey"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_grey"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_grey"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_grey"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_dark_grey"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_dark_grey"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_dark_grey"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_dark_grey"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_dark_grey"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_dark_grey"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_dark_grey"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_dark_grey"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_charcoal"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_charcoal"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_charcoal"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_charcoal"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_charcoal"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_charcoal"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_charcoal"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_charcoal"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_black"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_black"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_black"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_black"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_black"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_black"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_black"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_black"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_green"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_green"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_green"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_green"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_green"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_green"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_green"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_green"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_lime"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_lime"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_lime"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_lime"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_lime"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_lime"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_lime"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_lime"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_olive"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_olive"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_olive"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_olive"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_olive"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_olive"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_olive"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_olive"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_magenta"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_magenta"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_magenta"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_magenta"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_magenta"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_magenta"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_magenta"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_magenta"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_yellow"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_yellow"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_yellow"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_yellow"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_yellow"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_yellow"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_yellow"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_yellow"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_pink"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_pink"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_pink"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_pink"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_pink"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_pink"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_pink"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_pink"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_purple"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_purple"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_purple"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_purple"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_purple"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_purple"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_purple"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_purple"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_violet"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_violet"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_violet"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_violet"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_violet"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_violet"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_violet"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_violet"));
			
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_brown"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("condensed_darkstone_brown"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("smooth_darkstone_brown"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("cracked_darkstone_brown"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("carved_darkstone_brown"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_bricks_brown"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_brown"));
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("darkstone_tile_inner_brown"));
	
			event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("shale"));

		}
		
		@SubscribeEvent
		public static void registerBlockItems (final RegistryEvent.Register<Item> event)
		{
			event.getRegistry().register(new BlockItem(darkstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone"));
			event.getRegistry().register(new BlockItem(dimstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("dimstone"));
			event.getRegistry().register(new BlockItem(deathstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("deathstone"));
			event.getRegistry().register(new BlockItem(lightstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("lightstone"));
			event.getRegistry().register(new BlockItem(floatstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("floatstone"));
			event.getRegistry().register(new BlockItem(springstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("springstone"));
			
			event.getRegistry().register(new BlockItem(condensed_darkstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone"));
			event.getRegistry().register(new BlockItem(condensed_dimstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_dimstone"));
			event.getRegistry().register(new BlockItem(condensed_deathstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_deathstone"));
			event.getRegistry().register(new BlockItem(condensed_lightstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_lightstone"));
			event.getRegistry().register(new BlockItem(condensed_floatstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_floatstone"));
			event.getRegistry().register(new BlockItem(condensed_springstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_springstone"));
			
			event.getRegistry().register(new BlockItem(smooth_darkstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone"));
			event.getRegistry().register(new BlockItem(smooth_dimstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_dimstone"));
			event.getRegistry().register(new BlockItem(smooth_deathstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_deathstone"));
			event.getRegistry().register(new BlockItem(smooth_lightstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_lightstone"));
			event.getRegistry().register(new BlockItem(smooth_floatstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_floatstone"));
			event.getRegistry().register(new BlockItem(smooth_springstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_springstone"));

			event.getRegistry().register(new BlockItem(cracked_darkstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone"));
			event.getRegistry().register(new BlockItem(cracked_dimstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_dimstone"));
			event.getRegistry().register(new BlockItem(cracked_deathstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_deathstone"));
			event.getRegistry().register(new BlockItem(cracked_lightstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_lightstone"));
			event.getRegistry().register(new BlockItem(cracked_floatstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_floatstone"));
			event.getRegistry().register(new BlockItem(cracked_springstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_springstone"));
			
			event.getRegistry().register(new BlockItem(carved_darkstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone"));
			event.getRegistry().register(new BlockItem(carved_dimstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_dimstone"));
			event.getRegistry().register(new BlockItem(carved_deathstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_deathstone"));
			event.getRegistry().register(new BlockItem(carved_lightstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_lightstone"));
			event.getRegistry().register(new BlockItem(carved_floatstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_floatstone"));
			event.getRegistry().register(new BlockItem(carved_springstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_springstone"));
			
			event.getRegistry().register(new BlockItem(darkstone_bricks, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks"));
			event.getRegistry().register(new BlockItem(dimstone_bricks, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("dimstone_bricks"));
			event.getRegistry().register(new BlockItem(deathstone_bricks, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("deathstone_bricks"));
			event.getRegistry().register(new BlockItem(lightstone_bricks, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("lightstone_bricks"));
			event.getRegistry().register(new BlockItem(floatstone_bricks, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("floatstone_bricks"));
			event.getRegistry().register(new BlockItem(springstone_bricks, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("springstone_bricks"));
			
			event.getRegistry().register(new BlockItem(darkness_ore_darkstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkness_ore_darkstone"));
			event.getRegistry().register(new BlockItem(darkness_ore_dimstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkness_ore_dimstone"));
			event.getRegistry().register(new BlockItem(darkness_ore_lightstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkness_ore_lightstone"));
			event.getRegistry().register(new BlockItem(lethargy_ore_dimstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("lethargy_ore_dimstone"));
			event.getRegistry().register(new BlockItem(lethargy_ore_lightstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("lethargy_ore_lightstone"));
			event.getRegistry().register(new BlockItem(gravity_ore_lightstone, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("gravity_ore_lightstone"));
			event.getRegistry().register(new BlockItem(bitumen_ore, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("bitumen_ore"));
			
			event.getRegistry().register(new BlockItem(darkness_block, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkness_block"));
			event.getRegistry().register(new BlockItem(gravity_block, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("gravity_block"));
			event.getRegistry().register(new BlockItem(lethargy_block, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("lethargy_block"));
			event.getRegistry().register(new BlockItem(bitumen_block, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("bitumen_block"));

			
			event.getRegistry().register(new BlockItem(ring_tree_planks, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("ring_tree_planks"));
			event.getRegistry().register(new BlockItem(ring_tree_wood, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("ring_tree_wood"));
			event.getRegistry().register(new BlockItem(purple_berry, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("purple_berry"));
			
			event.getRegistry().register(new BlockItem(asphalt, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("asphalt"));
			event.getRegistry().register(new BlockItem(end_obsidian, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("end_obsidian"));
			
			event.getRegistry().register(new BlockItem(glowsand_north, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("glowsand_north"));
			event.getRegistry().register(new BlockItem(glowsand_south, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("glowsand_south"));
			event.getRegistry().register(new BlockItem(glowsand_east, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("glowsand_east"));
			event.getRegistry().register(new BlockItem(glowsand_west, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("glowsand_west"));
			event.getRegistry().register(new BlockItem(glowsand_up, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("glowsand_up"));
			event.getRegistry().register(new BlockItem(glowsand_down, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("glowsand_down"));
			
			event.getRegistry().register(new BlockItem(lantern, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("lantern"));
			event.getRegistry().register(new BlockItem(bone_ladder, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("bone_ladder"));
			event.getRegistry().register(new BlockItem(bone_torch, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("bone_torch"));
			event.getRegistry().register(new BlockItem(brain_mushroom, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("brain_mushroom"));
			event.getRegistry().register(new BlockItem(stone_table, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("stone_table"));
			event.getRegistry().register(new BlockItem(red_rock, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("red_rock"));
			
			event.getRegistry().register(new BlockItem(darkstone_tile, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile"));
			event.getRegistry().register(new BlockItem(dimstone_tile, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("dimstone_tile"));
			event.getRegistry().register(new BlockItem(deathstone_tile, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("deathstone_tile"));
			event.getRegistry().register(new BlockItem(lightstone_tile, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("lightstone_tile"));
			event.getRegistry().register(new BlockItem(floatstone_tile, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("floatstone_tile"));
			event.getRegistry().register(new BlockItem(springstone_tile, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("springstone_tile"));
			
			event.getRegistry().register(new BlockItem(darkstone_tile_inner, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner"));
			event.getRegistry().register(new BlockItem(dimstone_tile_inner, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("dimstone_tile_inner"));
			event.getRegistry().register(new BlockItem(deathstone_tile_inner, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("deathstone_tile_inner"));
			event.getRegistry().register(new BlockItem(lightstone_tile_inner, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("lightstone_tile_inner"));
			event.getRegistry().register(new BlockItem(floatstone_tile_inner, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("floatstone_tile_inner"));
			event.getRegistry().register(new BlockItem(springstone_tile_inner, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("springstone_tile_inner"));
			
			event.getRegistry().register(new BlockItem(darkstone_white, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_white"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_white, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_white"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_white, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_white"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_white, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_white"));
			event.getRegistry().register(new BlockItem(carved_darkstone_white, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_white"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_white, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_white"));
			event.getRegistry().register(new BlockItem(darkstone_tile_white, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_white"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_white, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_white"));
			
			event.getRegistry().register(new BlockItem(darkstone_pearl, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_pearl"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_pearl, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_pearl"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_pearl, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_pearl"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_pearl, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_pearl"));
			event.getRegistry().register(new BlockItem(carved_darkstone_pearl, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_pearl"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_pearl, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_pearl"));
			event.getRegistry().register(new BlockItem(darkstone_tile_pearl, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_pearl"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_pearl, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_pearl"));
			
			event.getRegistry().register(new BlockItem(darkstone_red, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_red"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_red, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_red"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_red, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_red"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_red, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_red"));
			event.getRegistry().register(new BlockItem(carved_darkstone_red, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_red"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_red, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_red"));
			event.getRegistry().register(new BlockItem(darkstone_tile_red, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_red"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_red, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_red"));
			
			event.getRegistry().register(new BlockItem(darkstone_maroon, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_maroon"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_maroon, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_maroon"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_maroon, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_maroon"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_maroon, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_maroon"));
			event.getRegistry().register(new BlockItem(carved_darkstone_maroon, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_maroon"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_maroon, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_maroon"));
			event.getRegistry().register(new BlockItem(darkstone_tile_maroon, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_maroon"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_maroon, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_maroon"));
			
			event.getRegistry().register(new BlockItem(darkstone_blue, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_blue"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_blue, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_blue"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_blue, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_blue"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_blue, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_blue"));
			event.getRegistry().register(new BlockItem(carved_darkstone_blue, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_blue"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_blue, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_blue"));
			event.getRegistry().register(new BlockItem(darkstone_tile_blue, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_blue"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_blue, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_blue"));
			
			event.getRegistry().register(new BlockItem(darkstone_light_blue, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_light_blue"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_light_blue, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_light_blue"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_light_blue, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_light_blue"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_light_blue, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_light_blue"));
			event.getRegistry().register(new BlockItem(carved_darkstone_light_blue, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_light_blue"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_light_blue, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_light_blue"));
			event.getRegistry().register(new BlockItem(darkstone_tile_light_blue, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_light_blue"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_light_blue, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_light_blue"));
			
			event.getRegistry().register(new BlockItem(darkstone_cyan, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_cyan"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_cyan, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_cyan"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_cyan, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_cyan"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_cyan, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_cyan"));
			event.getRegistry().register(new BlockItem(carved_darkstone_cyan, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_cyan"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_cyan, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_cyan"));
			event.getRegistry().register(new BlockItem(darkstone_tile_cyan, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_cyan"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_cyan, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_cyan"));
			
			event.getRegistry().register(new BlockItem(darkstone_orange, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_orange"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_orange, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_orange"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_orange, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_orange"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_orange, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_orange"));
			event.getRegistry().register(new BlockItem(carved_darkstone_orange, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_orange"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_orange, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_orange"));
			event.getRegistry().register(new BlockItem(darkstone_tile_orange, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_orange"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_orange, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_orange"));
			
			event.getRegistry().register(new BlockItem(darkstone_amber, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_amber"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_amber, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_amber"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_amber, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_amber"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_amber, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_amber"));
			event.getRegistry().register(new BlockItem(carved_darkstone_amber, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_amber"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_amber, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_amber"));
			event.getRegistry().register(new BlockItem(darkstone_tile_amber, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_amber"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_amber, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_amber"));
			
			event.getRegistry().register(new BlockItem(darkstone_grey, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_grey"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_grey, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_grey"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_grey, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_grey"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_grey, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_grey"));
			event.getRegistry().register(new BlockItem(carved_darkstone_grey, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_grey"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_grey, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_grey"));
			event.getRegistry().register(new BlockItem(darkstone_tile_grey, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_grey"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_grey, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_grey"));
			
			event.getRegistry().register(new BlockItem(darkstone_dark_grey, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_dark_grey"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_dark_grey, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_dark_grey"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_dark_grey, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_dark_grey"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_dark_grey, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_dark_grey"));
			event.getRegistry().register(new BlockItem(carved_darkstone_dark_grey, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_dark_grey"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_dark_grey, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_dark_grey"));
			event.getRegistry().register(new BlockItem(darkstone_tile_dark_grey, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_dark_grey"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_dark_grey, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_dark_grey"));
			
			event.getRegistry().register(new BlockItem(darkstone_charcoal, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_charcoal"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_charcoal, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_charcoal"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_charcoal, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_charcoal"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_charcoal, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_charcoal"));
			event.getRegistry().register(new BlockItem(carved_darkstone_charcoal, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_charcoal"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_charcoal, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_charcoal"));
			event.getRegistry().register(new BlockItem(darkstone_tile_charcoal, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_charcoal"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_charcoal, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_charcoal"));
			
			event.getRegistry().register(new BlockItem(darkstone_black, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_black"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_black, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_black"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_black, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_black"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_black, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_black"));
			event.getRegistry().register(new BlockItem(carved_darkstone_black, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_black"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_black, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_black"));
			event.getRegistry().register(new BlockItem(darkstone_tile_black, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_black"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_black, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_black"));
			
			event.getRegistry().register(new BlockItem(darkstone_green, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_green"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_green, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_green"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_green, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_green"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_green, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_green"));
			event.getRegistry().register(new BlockItem(carved_darkstone_green, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_green"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_green, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_green"));
			event.getRegistry().register(new BlockItem(darkstone_tile_green, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_green"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_green, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_green"));
			
			event.getRegistry().register(new BlockItem(darkstone_lime, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_lime"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_lime, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_lime"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_lime, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_lime"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_lime, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_lime"));
			event.getRegistry().register(new BlockItem(carved_darkstone_lime, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_lime"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_lime, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_lime"));
			event.getRegistry().register(new BlockItem(darkstone_tile_lime, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_lime"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_lime, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_lime"));
			
			event.getRegistry().register(new BlockItem(darkstone_olive, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_olive"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_olive, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_olive"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_olive, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_olive"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_olive, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_olive"));
			event.getRegistry().register(new BlockItem(carved_darkstone_olive, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_olive"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_olive, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_olive"));
			event.getRegistry().register(new BlockItem(darkstone_tile_olive, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_olive"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_olive, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_olive"));
			
			event.getRegistry().register(new BlockItem(darkstone_magenta, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_magenta"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_magenta, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_magenta"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_magenta, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_magenta"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_magenta, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_magenta"));
			event.getRegistry().register(new BlockItem(carved_darkstone_magenta, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_magenta"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_magenta, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_magenta"));
			event.getRegistry().register(new BlockItem(darkstone_tile_magenta, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_magenta"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_magenta, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_magenta"));
			
			event.getRegistry().register(new BlockItem(darkstone_yellow, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_yellow"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_yellow, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_yellow"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_yellow, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_yellow"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_yellow, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_yellow"));
			event.getRegistry().register(new BlockItem(carved_darkstone_yellow, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_yellow"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_yellow, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_yellow"));
			event.getRegistry().register(new BlockItem(darkstone_tile_yellow, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_yellow"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_yellow, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_yellow"));
			
			event.getRegistry().register(new BlockItem(darkstone_pink, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_pink"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_pink, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_pink"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_pink, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_pink"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_pink, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_pink"));
			event.getRegistry().register(new BlockItem(carved_darkstone_pink, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_pink"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_pink, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_pink"));
			event.getRegistry().register(new BlockItem(darkstone_tile_pink, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_pink"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_pink, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_pink"));
			
			event.getRegistry().register(new BlockItem(darkstone_purple, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_purple"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_purple, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_purple"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_purple, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_purple"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_purple, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_purple"));
			event.getRegistry().register(new BlockItem(carved_darkstone_purple, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_purple"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_purple, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_purple"));
			event.getRegistry().register(new BlockItem(darkstone_tile_purple, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_purple"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_purple, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_purple"));
			
			event.getRegistry().register(new BlockItem(darkstone_violet, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_violet"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_violet, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_violet"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_violet, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_violet"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_violet, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_violet"));
			event.getRegistry().register(new BlockItem(carved_darkstone_violet, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_violet"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_violet, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_violet"));
			event.getRegistry().register(new BlockItem(darkstone_tile_violet, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_violet"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_violet, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_violet"));
			
			event.getRegistry().register(new BlockItem(darkstone_brown, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_brown"));
			event.getRegistry().register(new BlockItem(condensed_darkstone_brown, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("condensed_darkstone_brown"));
			event.getRegistry().register(new BlockItem(smooth_darkstone_brown, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("smooth_darkstone_brown"));
			event.getRegistry().register(new BlockItem(cracked_darkstone_brown, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("cracked_darkstone_brown"));
			event.getRegistry().register(new BlockItem(carved_darkstone_brown, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("carved_darkstone_brown"));
			event.getRegistry().register(new BlockItem(darkstone_bricks_brown, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_bricks_brown"));
			event.getRegistry().register(new BlockItem(darkstone_tile_brown, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_brown"));
			event.getRegistry().register(new BlockItem(darkstone_tile_inner_brown, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("darkstone_tile_inner_brown"));			
	
			event.getRegistry().register(new BlockItem(shale, new Item.Properties().maxStackSize(64).group(SubterrainItemGroup.instance)).setRegistryName("shale"));			

		}
}
