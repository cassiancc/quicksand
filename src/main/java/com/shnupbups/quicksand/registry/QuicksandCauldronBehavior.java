package com.shnupbups.quicksand.registry;

import net.minecraft.block.cauldron.CauldronBehavior;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;

import com.shnupbups.cauldronlib.CauldronLib;

public interface QuicksandCauldronBehavior extends CauldronBehavior {
	CauldronBehaviorMap QUICKSAND_CAULDRON_BEHAVIOR = CauldronBehavior.createMap("quicksand");
	CauldronBehaviorMap RED_QUICKSAND_CAULDRON_BEHAVIOR = CauldronBehavior.createMap("red_quicksand");

	static void init() {
		CauldronLib.registerFillFromBucketBehavior(QuicksandBlocks.QUICKSAND_BUCKET, QuicksandBlocks.QUICKSAND_CAULDRON, SoundEvents.BLOCK_SAND_PLACE);
		CauldronLib.registerFillFromBucketBehavior(QuicksandBlocks.RED_QUICKSAND_BUCKET, QuicksandBlocks.RED_QUICKSAND_CAULDRON, SoundEvents.BLOCK_SAND_PLACE);

		QUICKSAND_CAULDRON_BEHAVIOR.map().put(Items.BUCKET, CauldronLib.createEmptyBehavior(QuicksandBlocks.QUICKSAND_BUCKET, SoundEvents.BLOCK_SAND_BREAK));
		RED_QUICKSAND_CAULDRON_BEHAVIOR.map().put(Items.BUCKET, CauldronLib.createEmptyBehavior(QuicksandBlocks.RED_QUICKSAND_BUCKET, SoundEvents.BLOCK_SAND_BREAK));
	}
}
