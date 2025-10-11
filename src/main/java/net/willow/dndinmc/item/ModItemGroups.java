package net.willow.dndinmc.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.willow.dndinmc.Block.ModBlocks;
import net.willow.dndinmc.DnD_in_Minecraft;

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

    public static final ItemGroup DND_WEAPONS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DnD_in_Minecraft.MOD_ID, "dnd_weapon"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dnd_weapon"))
                    .icon(() -> new ItemStack(Moditems.SILVER_INGOT)) .entries((displayContext, entries) -> {
                        entries.add(Moditems.WOODEN_CLUB);
                        entries.add(Moditems.WOODEN_DAGGER);
                        entries.add(Moditems.WOODEN_GREATCLUB);
                        entries.add(Moditems.WOODEN_HANDAXE);
                        entries.add(Moditems.WOODEN_JAVELIN);
                        entries.add(Moditems.WOODEN_LIGHT_HAMMER);
                        entries.add(Moditems.WOODEN_MACE);
                        entries.add(Moditems.WOODEN_QUARTERSTAFF);
                        entries.add(Moditems.WOODEN_SICKLE);
                        entries.add(Moditems.WOODEN_SPEAR);
                        entries.add(Moditems.WOODEN_BATTLEAXE);
                        entries.add(Moditems.WOODEN_FLAIL);
                        entries.add(Moditems.WOODEN_GLAIVE);
                        entries.add(Moditems.WOODEN_GREATAXE);
                        entries.add(Moditems.WOODEN_HALBERD);
                        entries.add(Moditems.WOODEN_LANCE);
                        entries.add(Moditems.WOODEN_LONGSWORD);
                        entries.add(Moditems.WOODEN_MAUL);
                        entries.add(Moditems.WOODEN_MORNINGSTAR);
                        entries.add(Moditems.WOODEN_PIKE);
                        entries.add(Moditems.WOODEN_RAPIER);
                        entries.add(Moditems.WOODEN_SCIMITAR);
                        entries.add(Moditems.WOODEN_SHORTSWORD);
                        entries.add(Moditems.WOODEN_TRIDENT);
                        entries.add(Moditems.WOODEN_WHIP);
                        entries.add(Moditems.WOODEN_WAR_PICK);
                        entries.add(Moditems.WOODEN_WARHAMMER);
                        entries.add(Moditems.STONE_CLUB);
                        entries.add(Moditems.STONE_DAGGER);
                        entries.add(Moditems.STONE_GREATCLUB);
                        entries.add(Moditems.STONE_HANDAXE);
                        entries.add(Moditems.STONE_JAVELIN);
                        entries.add(Moditems.STONE_LIGHT_HAMMER);
                        entries.add(Moditems.STONE_MACE);
                        entries.add(Moditems.STONE_QUARTERSTAFF);
                        entries.add(Moditems.STONE_SICKLE);
                        entries.add(Moditems.STONE_SPEAR);
                        entries.add(Moditems.STONE_BATTLEAXE);
                        entries.add(Moditems.STONE_FLAIL);
                        entries.add(Moditems.STONE_GLAIVE);
                        entries.add(Moditems.STONE_GREATAXE);
                        entries.add(Moditems.STONE_HALBERD);
                        entries.add(Moditems.STONE_LANCE);
                        entries.add(Moditems.STONE_LONGSWORD);
                        entries.add(Moditems.STONE_MAUL);
                        entries.add(Moditems.STONE_MORNINGSTAR);
                        entries.add(Moditems.STONE_PIKE);
                        entries.add(Moditems.STONE_RAPIER);
                        entries.add(Moditems.STONE_SCIMITAR);
                        entries.add(Moditems.STONE_SHORTSWORD);
                        entries.add(Moditems.STONE_TRIDENT);
                        entries.add(Moditems.STONE_WHIP);
                        entries.add(Moditems.STONE_WAR_PICK);
                        entries.add(Moditems.STONE_WARHAMMER);


                        entries.add(Moditems.IRON_CLUB);
                        entries.add(Moditems.IRON_DAGGER);
                        entries.add(Moditems.IRON_GREATCLUB);
                        entries.add(Moditems.IRON_HANDAXE);
                        entries.add(Moditems.IRON_JAVELIN);
                        entries.add(Moditems.IRON_LIGHT_HAMMER);
                        entries.add(Moditems.IRON_MACE);
                        entries.add(Moditems.IRON_QUARTERSTAFF);
                        entries.add(Moditems.IRON_SICKLE);
                        entries.add(Moditems.IRON_SPEAR);
                        entries.add(Moditems.IRON_BATTLEAXE);
                        entries.add(Moditems.IRON_FLAIL);
                        entries.add(Moditems.IRON_GLAIVE);
                        entries.add(Moditems.IRON_GREATAXE);
                        entries.add(Moditems.IRON_HALBERD);
                        entries.add(Moditems.IRON_LANCE);
                        entries.add(Moditems.IRON_LONGSWORD);
                        entries.add(Moditems.IRON_MAUL);
                        entries.add(Moditems.IRON_MORNINGSTAR);
                        entries.add(Moditems.IRON_PIKE);
                        entries.add(Moditems.IRON_RAPIER);
                        entries.add(Moditems.IRON_SCIMITAR);
                        entries.add(Moditems.IRON_SHORTSWORD);
                        entries.add(Moditems.IRON_TRIDENT);
                        entries.add(Moditems.IRON_WHIP);
                        entries.add(Moditems.IRON_WAR_PICK);
                        entries.add(Moditems.IRON_WARHAMMER);
                        entries.add(Moditems.DIAMOND_CLUB);
                        entries.add(Moditems.DIAMOND_DAGGER);
                        entries.add(Moditems.DIAMOND_GREATCLUB);
                        entries.add(Moditems.DIAMOND_HANDAXE);
                        entries.add(Moditems.DIAMOND_JAVELIN);
                        entries.add(Moditems.DIAMOND_LIGHT_HAMMER);
                        entries.add(Moditems.DIAMOND_MACE);
                        entries.add(Moditems.DIAMOND_QUARTERSTAFF);
                        entries.add(Moditems.DIAMOND_SICKLE);
                        entries.add(Moditems.DIAMOND_SPEAR);
                        entries.add(Moditems.DIAMOND_BATTLEAXE);
                        entries.add(Moditems.DIAMOND_FLAIL);
                        entries.add(Moditems.DIAMOND_GLAIVE);
                        entries.add(Moditems.DIAMOND_GREATAXE);
                        entries.add(Moditems.DIAMOND_HALBERD);
                        entries.add(Moditems.DIAMOND_LANCE);
                        entries.add(Moditems.DIAMOND_LONGSWORD);
                        entries.add(Moditems.DIAMOND_MAUL);
                        entries.add(Moditems.DIAMOND_MORNINGSTAR);
                        entries.add(Moditems.DIAMOND_PIKE);
                        entries.add(Moditems.DIAMOND_RAPIER);
                        entries.add(Moditems.DIAMOND_SCIMITAR);
                        entries.add(Moditems.DIAMOND_SHORTSWORD);
                        entries.add(Moditems.DIAMOND_TRIDENT);
                        entries.add(Moditems.DIAMOND_WHIP);
                        entries.add(Moditems.DIAMOND_WAR_PICK);
                        entries.add(Moditems.DIAMOND_WARHAMMER);
                        entries.add(Moditems.NETHERITE_CLUB);
                        entries.add(Moditems.NETHERITE_DAGGER);
                        entries.add(Moditems.NETHERITE_GREATCLUB);
                        entries.add(Moditems.NETHERITE_HANDAXE);
                        entries.add(Moditems.NETHERITE_JAVELIN);
                        entries.add(Moditems.NETHERITE_LIGHT_HAMMER);
                        entries.add(Moditems.NETHERITE_MACE);
                        entries.add(Moditems.NETHERITE_QUARTERSTAFF);
                        entries.add(Moditems.NETHERITE_SICKLE);
                        entries.add(Moditems.NETHERITE_SPEAR);
                        entries.add(Moditems.NETHERITE_BATTLEAXE);
                        entries.add(Moditems.NETHERITE_FLAIL);
                        entries.add(Moditems.NETHERITE_GLAIVE);
                        entries.add(Moditems.NETHERITE_GREATAXE);
                        entries.add(Moditems.NETHERITE_HALBERD);
                        entries.add(Moditems.NETHERITE_LANCE);
                        entries.add(Moditems.NETHERITE_LONGSWORD);
                        entries.add(Moditems.NETHERITE_MAUL);
                        entries.add(Moditems.NETHERITE_MORNINGSTAR);
                        entries.add(Moditems.NETHERITE_PIKE);
                        entries.add(Moditems.NETHERITE_RAPIER);
                        entries.add(Moditems.NETHERITE_SCIMITAR);
                        entries.add(Moditems.NETHERITE_SHORTSWORD);
                        entries.add(Moditems.NETHERITE_TRIDENT);
                        entries.add(Moditems.NETHERITE_WHIP);
                        entries.add(Moditems.NETHERITE_WAR_PICK);
                        entries.add(Moditems.NETHERITE_WARHAMMER);
                        entries.add(Moditems.ADAMANTITE_CLUB);
                        entries.add(Moditems.ADAMANTITE_DAGGER);
                        entries.add(Moditems.ADAMANTITE_GREATCLUB);
                        entries.add(Moditems.ADAMANTITE_HANDAXE);
                        entries.add(Moditems.ADAMANTITE_JAVELIN);
                        entries.add(Moditems.ADAMANTITE_LIGHT_HAMMER);
                        entries.add(Moditems.ADAMANTITE_MACE);
                        entries.add(Moditems.ADAMANTITE_QUARTERSTAFF);
                        entries.add(Moditems.ADAMANTITE_SICKLE);
                        entries.add(Moditems.ADAMANTITE_SPEAR);
                        entries.add(Moditems.ADAMANTITE_BATTLEAXE);
                        entries.add(Moditems.ADAMANTITE_FLAIL);
                        entries.add(Moditems.ADAMANTITE_GLAIVE);
                        entries.add(Moditems.ADAMANTITE_GREATAXE);
                        entries.add(Moditems.ADAMANTITE_HALBERD);
                        entries.add(Moditems.ADAMANTITE_LANCE);
                        entries.add(Moditems.ADAMANTITE_LONGSWORD);
                        entries.add(Moditems.ADAMANTITE_MAUL);
                        entries.add(Moditems.ADAMANTITE_MORNINGSTAR);
                        entries.add(Moditems.ADAMANTITE_PIKE);
                        entries.add(Moditems.ADAMANTITE_RAPIER);
                        entries.add(Moditems.ADAMANTITE_SCIMITAR);
                        entries.add(Moditems.ADAMANTITE_SHORTSWORD);
                        entries.add(Moditems.ADAMANTITE_TRIDENT);
                        entries.add(Moditems.ADAMANTITE_WHIP);
                        entries.add(Moditems.ADAMANTITE_WAR_PICK);
                        entries.add(Moditems.ADAMANTITE_WARHAMMER);




                    }).build());

    public static void registerItemGroups(){
        DnD_in_Minecraft.LOGGER.info("Registering Item Groups for" +DnD_in_Minecraft.MOD_ID);
    }
}
