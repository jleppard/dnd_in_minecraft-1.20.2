package net.willow.dndinmc.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.willow.dndinmc.DnD_in_Minecraft;
import net.minecraft.item.Item;

public class Moditems {
    public static final Item GOLD_PIECE = registerItem("gold_piece", new Item(new FabricItemSettings()));
    public static final Item COPPER_PIECE = registerItem("copper_piece", new Item(new FabricItemSettings()));
    public static final Item SILVER_PIECE = registerItem("silver_piece", new Item(new FabricItemSettings()));
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(GOLD_PIECE);
        entries.add(COPPER_PIECE);
        entries.add(SILVER_PIECE);

    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DnD_in_Minecraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DnD_in_Minecraft.LOGGER.info("Registering Mod items for" + DnD_in_Minecraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditems::addItemsToIngredientTabItemGroup);
    }
}


