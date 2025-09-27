package net.willow.dndinmc.Block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.willow.dndinmc.DnD_in_Minecraft;

public class ModBlocks {

    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));







    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(DnD_in_Minecraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM,new Identifier(DnD_in_Minecraft.MOD_ID, name),
         new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks(){
        DnD_in_Minecraft.LOGGER.info("Registering Mod Blocks for" + DnD_in_Minecraft.MOD_ID);
    }
}
