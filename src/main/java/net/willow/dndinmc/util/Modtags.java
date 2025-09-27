package net.willow.dndinmc.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.willow.dndinmc.DnD_in_Minecraft;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;

public class Modtags {
public static class Blocks {


private static TagKey<Block> createTag(String name) {
    return TagKey.of(RegistryKeys.BLOCK, new Identifier(DnD_in_Minecraft.MOD_ID, name));
}
}

public static class Items {

    private static TagKey<Item> createTag(String name) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(DnD_in_Minecraft.MOD_ID, name));
    }
}
}
