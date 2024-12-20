package com.shnupbups.quicksand.registry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.PowderSnowBucketItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;

import com.shnupbups.cauldronlib.block.FullCauldronBlock;
import com.shnupbups.quicksand.Quicksand;
import com.shnupbups.quicksand.block.QuicksandBlock;
import net.minecraft.util.ColorCode;
import net.minecraft.util.Identifier;

import static com.shnupbups.quicksand.Quicksand.id;

public class QuicksandBlocks {
	public static Block QUICKSAND;
	public static BlockItem QUICKSAND_BUCKET;
	public static Block QUICKSAND_CAULDRON;
	public static Block RED_QUICKSAND;
	public static BlockItem RED_QUICKSAND_BUCKET;
	public static Block RED_QUICKSAND_CAULDRON;

	public static RegistryKey<Block> registryKeyBlock(String id) {
		return RegistryKey.of(RegistryKeys.BLOCK, id(id));
	}

	public static RegistryKey<Item> registryKeyItem(String id) {
		return RegistryKey.of(RegistryKeys.ITEM, id(id));
	}

	public static void init() {
		QUICKSAND = new QuicksandBlock(AbstractBlock.Settings.copy(Blocks.SAND).registryKey(registryKeyBlock("quicksand")), new ColorCode(14406560), () -> QUICKSAND_BUCKET);
		QUICKSAND_BUCKET = new PowderSnowBucketItem(QUICKSAND, SoundEvents.BLOCK_SAND_PLACE, new Item.Settings().maxCount(1).registryKey(registryKeyItem("quicksand_bucket")));
		QUICKSAND_CAULDRON =  new FullCauldronBlock(AbstractBlock.Settings.copy(Blocks.CAULDRON).registryKey(registryKeyBlock("quicksand_cauldron")), QuicksandCauldronBehavior.QUICKSAND_CAULDRON_BEHAVIOR);

		RED_QUICKSAND = new QuicksandBlock(AbstractBlock.Settings.copy(Blocks.RED_SAND).registryKey(registryKeyBlock("red_quicksand")), new ColorCode(11098145), () -> RED_QUICKSAND_BUCKET);
		RED_QUICKSAND_BUCKET = new PowderSnowBucketItem(RED_QUICKSAND, SoundEvents.BLOCK_SAND_PLACE, new Item.Settings().maxCount(1).registryKey(registryKeyItem("red_quicksand_bucket")));
		RED_QUICKSAND_CAULDRON =  new FullCauldronBlock(AbstractBlock.Settings.copy(Blocks.CAULDRON).registryKey(registryKeyBlock("red_quicksand_cauldron")), QuicksandCauldronBehavior.RED_QUICKSAND_CAULDRON_BEHAVIOR);

		register();
	}

	private static void register() {
		Registry.register(Registries.BLOCK, id("quicksand"), QUICKSAND);
		Registry.register(Registries.ITEM, id("quicksand_bucket"), QUICKSAND_BUCKET);
		QUICKSAND_BUCKET.appendBlocks(Item.BLOCK_ITEMS, QUICKSAND_BUCKET);
		Registry.register(Registries.BLOCK, id("quicksand_cauldron"), QUICKSAND_CAULDRON);

		Registry.register(Registries.BLOCK, id("red_quicksand"), RED_QUICKSAND);
		Registry.register(Registries.ITEM, id("red_quicksand_bucket"), RED_QUICKSAND_BUCKET);
		RED_QUICKSAND_BUCKET.appendBlocks(Item.BLOCK_ITEMS, RED_QUICKSAND_BUCKET);
		Registry.register(Registries.BLOCK, id("red_quicksand_cauldron"), RED_QUICKSAND_CAULDRON);
	}
}
