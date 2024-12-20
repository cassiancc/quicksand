package com.shnupbups.quicksand.datagen.provider;

import com.shnupbups.quicksand.registry.QuicksandBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TextureMap;

public class QuicksandModelProvider extends FabricModelProvider {
    public QuicksandModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
        generator.registerSimpleState(QuicksandBlocks.QUICKSAND);
        generator.registerSimpleState(QuicksandBlocks.RED_QUICKSAND);

        generator.blockStateCollector.accept(
                BlockStateModelGenerator.createSingletonBlockState(
                        QuicksandBlocks.QUICKSAND_CAULDRON,
                        Models.TEMPLATE_CAULDRON_FULL.upload(QuicksandBlocks.QUICKSAND_CAULDRON, TextureMap.cauldron(TextureMap.getId(QuicksandBlocks.QUICKSAND)), generator.modelCollector)
                )
        );
        generator.blockStateCollector.accept(
                BlockStateModelGenerator.createSingletonBlockState(
                        QuicksandBlocks.RED_QUICKSAND_CAULDRON,
                        Models.TEMPLATE_CAULDRON_FULL.upload(QuicksandBlocks.RED_QUICKSAND_CAULDRON, TextureMap.cauldron(TextureMap.getId(QuicksandBlocks.RED_QUICKSAND)), generator.modelCollector)
                )
        );
    }

    @Override
    public void generateItemModels(ItemModelGenerator generator) {
        generator.register(QuicksandBlocks.QUICKSAND_BUCKET, Models.GENERATED);
        generator.register(QuicksandBlocks.RED_QUICKSAND_BUCKET, Models.GENERATED);
    }
}
