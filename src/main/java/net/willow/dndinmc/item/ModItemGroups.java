package net.willow.dndinmc.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.willow.dndinmc.Block.ModBlocks;
import net.willow.dndinmc.DnD_in_Minecraft;

import java.util.Currency;

public class ModItemGroups {

    public static final ItemGroup ORES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DnD_in_Minecraft.MOD_ID, "silver"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.silver"))
                    .icon(() -> new ItemStack(Moditems.SILVER_INGOT)) .entries((displayContext, entries) -> {
entries.add(ModBlocks.SILVER_BLOCK);
entries.add(Moditems.SILVER_INGOT);
entries.add(Moditems.SILVER_NUGGET);
entries.add(Moditems.SILVER_AXE);
entries.add(Moditems.SILVER_SHOVEL);
entries.add(Moditems.SILVER_SWORD);
entries.add(Moditems.SILVER_PICKAXE);
entries.add(Moditems.SILVER_HOE);
entries.add(ModBlocks.SILVER_ORE);


                    }).build());

    public static final ItemGroup CURRENCY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DnD_in_Minecraft.MOD_ID, "currency"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.currency"))
                    .icon(() -> new ItemStack(Moditems.GOLD_PIECE)) .entries((displayContext, entries) -> {
        entries.add(Moditems.COPPER_PIECE);
        entries.add(Moditems.SILVER_PIECE);
        entries.add(Moditems.GOLD_PIECE);


    }).build());


    public static void registerItemGroups(){
        DnD_in_Minecraft.LOGGER.info("Registering Item Groups for" +DnD_in_Minecraft.MOD_ID);
    }
}
