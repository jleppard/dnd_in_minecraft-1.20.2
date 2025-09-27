package net.willow.dndinmc.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.willow.dndinmc.Block.ModBlocks;
import net.willow.dndinmc.item.Moditems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    itemModelGenerator.register(Moditems.COPPER_NUGGET, Models.GENERATED);
    itemModelGenerator.register(Moditems.SILVER_NUGGET, Models.GENERATED);
    itemModelGenerator.register(Moditems.COPPER_PIECE, Models.GENERATED);
    itemModelGenerator.register(Moditems.GOLD_PIECE, Models.GENERATED);
    itemModelGenerator.register(Moditems.SILVER_PIECE, Models.GENERATED);
    itemModelGenerator.register(Moditems.SILVER_INGOT, Models.GENERATED);

    itemModelGenerator.register(Moditems.SILVER_AXE, Models.HANDHELD);
    itemModelGenerator.register(Moditems.SILVER_PICKAXE, Models.HANDHELD);
    itemModelGenerator.register(Moditems.SILVER_SHOVEL, Models.HANDHELD);
    itemModelGenerator.register(Moditems.SILVER_SWORD, Models.HANDHELD);
    itemModelGenerator.register(Moditems.SILVER_HOE, Models.HANDHELD);
    }
}
