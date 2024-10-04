package com.shnupbups.quicksand.datagen.provider;

import com.shnupbups.quicksand.registry.QuicksandBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryLoader;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class QuicksandBlockLootTableProvider extends FabricBlockLootTableProvider {
    public QuicksandBlockLootTableProvider(FabricDataOutput dataOutput, @NotNull CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        this.addDrop(QuicksandBlocks.QUICKSAND, dropsNothing());
        this.addDrop(QuicksandBlocks.RED_QUICKSAND, dropsNothing());
        this.addDrop(QuicksandBlocks.QUICKSAND_CAULDRON, Blocks.CAULDRON);
        this.addDrop(QuicksandBlocks.RED_QUICKSAND_CAULDRON, Blocks.CAULDRON);
    }
}
