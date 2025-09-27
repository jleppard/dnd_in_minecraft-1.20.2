package net.willow.dndinmc.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.willow.dndinmc.DnD_in_Minecraft;

public class Moditems {
    public static final Item GOLD_PIECE = registerItem("gold_piece",   new Item(new FabricItemSettings()));
    public static final Item COPPER_PIECE = registerItem("copper_piece",   new Item(new  FabricItemSettings()));
    public static final Item SILVER_PIECE = registerItem("silver_piece",   new Item(new  FabricItemSettings()));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget",   new Item(new  FabricItemSettings()));
    public static final Item COPPER_NUGGET = registerItem("copper_nugget",   new Item( new  FabricItemSettings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot",   new Item(new  FabricItemSettings()));
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {


        entries.add(SILVER_NUGGET);
        entries.add(COPPER_NUGGET);
        entries.add(SILVER_INGOT);
    }
    public static void addItemsToCombatTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SILVER_SWORD);
        entries.add(SILVER_AXE);
    }
    public static void addItemsToToolsTabItemGroup(FabricItemGroupEntries entries){
        entries.add(SILVER_HOE);
        entries.add(SILVER_AXE);
        entries.add(SILVER_PICKAXE);
        entries.add(SILVER_SHOVEL);
    }

public static final Item WOODEN_CLUB = registerItem("wooden_club", new SwordItem(ToolMaterials.WOOD,1, -1.6F,new FabricItemSettings()));
public static final Item WOODEN_DAGGER = registerItem("wooden_dagger", new SwordItem(ToolMaterials.WOOD,1,-0.8F,new FabricItemSettings()));
    public static final Item WOODEN_GREATCLUB = registerItem("wooden_greatclub",   new SwordItem(ToolMaterials.WOOD,3,-2.4F,new FabricItemSettings()));
    public static final Item WOODEN_HANDAXE = registerItem("wooden_handaxe", new AxeItem(ToolMaterials.WOOD,2,-1.6F,new FabricItemSettings()));
public static final Item WOODEN_JAVELIN = registerItem("wooden_javelin", new SwordItem(ToolMaterials.WOOD,2,-2.4F,new FabricItemSettings()));
    public static final Item WOODEN_LIGHT_HAMMER = registerItem("wooden_light_hammer", new SwordItem(ToolMaterials.WOOD,1,-1.6F,new FabricItemSettings()));
public static final Item WOODEN_MACE = registerItem("wooden_mace", new SwordItem(ToolMaterials.WOOD,2,-2.4F,new FabricItemSettings()));
    public static final Item WOODEN_QUARTERSTAFF = registerItem("wooden_quarterstaff", new SwordItem(ToolMaterials.WOOD,2,-2.4F,new FabricItemSettings()));
    public static final Item WOODEN_SICKLE = registerItem("wooden_sickle", new SwordItem(ToolMaterials.WOOD,1,-1.6F,new FabricItemSettings()));
public static final Item WOODEN_SPEAR = registerItem("wooden_spear", new SwordItem(ToolMaterials.WOOD,2,-2.4F,new FabricItemSettings()));


    public static final Item WOODEN_BATTLEAXE = registerItem("wooden_battleaxe",   new AxeItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item WOODEN_FLAIL = registerItem("wooden_flail",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item WOODEN_GLAIVE = registerItem("wooden_glaive",   new SwordItem(ToolMaterials.WOOD,4,-3.2F, new  FabricItemSettings()));
    public static final Item WOODEN_GREATAXE = registerItem("wooden_greataxe",   new AxeItem(ToolMaterials.WOOD,5,-3.2F, new  FabricItemSettings()));
    public static final Item WOODEN_GREATSWORD = registerItem("wooden_greatsword",   new AxeItem(ToolMaterials.WOOD,5,-3.2F, new  FabricItemSettings()));
    public static final Item WOODEN_HALBERD = registerItem("wooden_halberd",   new AxeItem(ToolMaterials.WOOD,4,-3.2F, new  FabricItemSettings()));
    public static final Item WOODEN_LANCE = registerItem("wooden_lance",   new SwordItem(ToolMaterials.WOOD,4,-3.2F, new  FabricItemSettings()));
    public static final Item WOODEN_LONGSWORD = registerItem("wooden_longsword",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item WOODEN_MAUL = registerItem("wooden_maul",   new SwordItem(ToolMaterials.WOOD,5,-3.2F, new  FabricItemSettings()));
    public static final Item WOODEN_MORNINGSTAR = registerItem("wooden_morningstar",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item WOODEN_PIKE = registerItem("wooden_pike",   new SwordItem(ToolMaterials.WOOD,4,-3.2F, new  FabricItemSettings()));
    public static final Item WOODEN_RAPIER = registerItem("wooden_rapier",   new SwordItem(ToolMaterials.WOOD,3,-1.6F, new  FabricItemSettings()));
    public static final Item WOODEN_SCIMITAR = registerItem("wooden_scimitar",   new SwordItem(ToolMaterials.WOOD,2,-0.8F, new  FabricItemSettings()));
    public static final Item WOODEN_SHORTSWORD = registerItem("wooden_shortsword",   new SwordItem(ToolMaterials.WOOD,2,-0.8F, new  FabricItemSettings()));
    public static final Item WOODEN_TRIDENT = registerItem("wooden_trident",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item WOODEN_WAR_PICK = registerItem("wooden_war_pick",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item WOODEN_WHIP = registerItem("wooden_whip",   new SwordItem(ToolMaterials.WOOD,1,-1.6F, new  FabricItemSettings()));

    public static final Item WOODEN_YKLWA = registerItem("wooden_yklwa",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));

    public static final Item WOODEN_HOOPAK = registerItem("wooden_hoopak",   new SwordItem(ToolMaterials.WOOD,2,-1.6F, new  FabricItemSettings()));
    public static final Item WOODEN_DOUBLE_BLADED_SCIMITAR = registerItem("wooden_double_bladed_scimitar",   new SwordItem(ToolMaterials.WOOD,2,-1.6F, new  FabricItemSettings()));

    public static final Item WOODEN_DART = registerItem("wooden_dart",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item WOODEN_LIGHT_CROSSBOW = registerItem("wooden_light_crossbow",   new CrossbowItem( new  FabricItemSettings()));
    public static final Item WOODEN_SHORTBOW = registerItem("wooden_shortbow",   new BowItem( new  FabricItemSettings()));
    public static final Item WOODEN_SLING = registerItem("wooden_sling",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));


    public static final Item WOODEN_BLOWGUN = registerItem("wooden_blowgun",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item WOODEN_HAND_CROSSBOW = registerItem("wooden_hand_crossbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item WOODEN_HEAVY_CROSSBOW = registerItem("wooden_heavy_crossbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item WOODEN_LONGBOW = registerItem("wooden_longbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item WOODEN_MUSKET = registerItem("wooden_musket",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item WOODEN_PISTOL = registerItem("wooden_pistol",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    
    public static final Item STONE_CLUB = registerItem("stone_club",   new SwordItem(ToolMaterials.STONE,1,-1.6F, new  FabricItemSettings()));
    public static final Item STONE_DAGGER = registerItem("stone_dagger",   new SwordItem(ToolMaterials.STONE,1,-0.8F, new  FabricItemSettings()));
    public static final Item STONE_GREATCLUB = registerItem("stone_greatclub",   new SwordItem(ToolMaterials.STONE,3,-2.4F, new  FabricItemSettings()));
    public static final Item STONE_HANDAXE = registerItem("stone_handaxe",   new SwordItem(ToolMaterials.STONE,2,-1.6F, new  FabricItemSettings()));
    public static final Item STONE_JAVELIN = registerItem("stone_javelin",   new SwordItem(ToolMaterials.STONE,2,-2.4F, new  FabricItemSettings()));
    public static final Item STONE_LIGHT_HAMMER = registerItem("stone_light_hammer",   new SwordItem(ToolMaterials.STONE,1,-1.6F, new  FabricItemSettings()));
    public static final Item STONE_MACE = registerItem("stone_mace",   new SwordItem(ToolMaterials.STONE,2,-2.4F, new  FabricItemSettings()));
    public static final Item STONE_QUARTERSTAFF = registerItem("stone_quarterstaff",   new SwordItem(ToolMaterials.STONE,2,-2.4F, new  FabricItemSettings()));
    public static final Item STONE_SICKLE = registerItem("stone_sickle",   new SwordItem(ToolMaterials.STONE,1,-1.6F, new  FabricItemSettings()));
    public static final Item STONE_SPEAR = registerItem("stone_spear",   new SwordItem(ToolMaterials.STONE,2,-2.4F, new  FabricItemSettings()));



    public static final Item STONE_BATTLEAXE = registerItem("stone_battleaxe",   new SwordItem(ToolMaterials.STONE,3,-2.4F, new  FabricItemSettings()));
    public static final Item STONE_FLAIL = registerItem("stone_flail",   new SwordItem(ToolMaterials.STONE,3,-2.4F, new  FabricItemSettings()));
    public static final Item STONE_GLAIVE = registerItem("stone_glaive",   new SwordItem(ToolMaterials.STONE,4,-3.2F, new  FabricItemSettings()));
    public static final Item STONE_GREATAXE = registerItem("stone_greataxe",   new SwordItem(ToolMaterials.STONE,5,-3.2F, new  FabricItemSettings()));
    public static final Item STONE_GREATSWORD = registerItem("stone_greatsword",   new SwordItem(ToolMaterials.STONE,5,-3.2F, new  FabricItemSettings()));
    public static final Item STONE_HALBERD = registerItem("stone_halberd",   new SwordItem(ToolMaterials.STONE,4,-3.2F, new  FabricItemSettings()));
    public static final Item STONE_LANCE = registerItem("stone_lance",   new SwordItem(ToolMaterials.STONE,4,-3.2F, new  FabricItemSettings()));
    public static final Item STONE_LONGSWORD = registerItem("stone_longsword",   new SwordItem(ToolMaterials.STONE,3,-2.4F, new  FabricItemSettings()));
    public static final Item STONE_MAUL = registerItem("stone_maul",   new SwordItem(ToolMaterials.STONE,5,-3.2F, new  FabricItemSettings()));
    public static final Item STONE_MORNINGSTAR = registerItem("stone_morningstar",   new SwordItem(ToolMaterials.STONE,3,-2.4F, new  FabricItemSettings()));
    public static final Item STONE_PIKE = registerItem("stone_pike",   new SwordItem(ToolMaterials.STONE,4,-3.2F, new  FabricItemSettings()));
    public static final Item STONE_RAPIER = registerItem("stone_rapier",   new SwordItem(ToolMaterials.STONE,3,-1.6F, new  FabricItemSettings()));
    public static final Item STONE_SCIMITAR = registerItem("stone_scimitar",   new SwordItem(ToolMaterials.STONE,2,-0.8F, new  FabricItemSettings()));
    public static final Item STONE_SHORTSWORD = registerItem("stone_shortsword",   new SwordItem(ToolMaterials.STONE,2,-0.8F, new  FabricItemSettings()));
    public static final Item STONE_TRIDENT = registerItem("stone_trident",   new SwordItem(ToolMaterials.STONE,3,-2.4F, new  FabricItemSettings()));
    public static final Item STONE_WAR_PICK = registerItem("stone_war_pick",   new SwordItem(ToolMaterials.STONE,3,-2.4F, new  FabricItemSettings()));
    public static final Item STONE_WHIP = registerItem("stone_whip",   new SwordItem(ToolMaterials.STONE,1,-1.6F, new  FabricItemSettings()));

    public static final Item STONE_YKLWA = registerItem("stone_yklwa",   new SwordItem(ToolMaterials.STONE,3,-2.4F, new  FabricItemSettings()));

    public static final Item STONE_HOOPAK = registerItem("stone_hoopak",   new SwordItem(ToolMaterials.STONE,2,-1.6F, new  FabricItemSettings()));
    public static final Item STONE_DOUBLE_BLADED_SCIMITAR = registerItem("stone_double_bladed_scimitar",   new SwordItem(ToolMaterials.STONE,2,-1.6F, new  FabricItemSettings()));


    public static final Item STONE_DART = registerItem("stone_dart",   new SwordItem(ToolMaterials.STONE,1,1, new  FabricItemSettings()));
    public static final Item STONE_LIGHT_CROSSBOW = registerItem("stone_light_crossbow",   new SwordItem(ToolMaterials.STONE,1,1, new  FabricItemSettings()));
    public static final Item STONE_SHORTBOW = registerItem("stone_shortbow",   new SwordItem(ToolMaterials.STONE,1,1, new  FabricItemSettings()));
    public static final Item STONE_SLING = registerItem("stone_sling",   new SwordItem(ToolMaterials.STONE,1,1, new  FabricItemSettings()));


    public static final Item STONE_BLOWGUN = registerItem("stone_blowgun",   new SwordItem(ToolMaterials.STONE,1,1, new  FabricItemSettings()));
    public static final Item STONE_HAND_CROSSBOW = registerItem("stone_hand_crossbow",   new SwordItem(ToolMaterials.STONE,1,1, new  FabricItemSettings()));
    public static final Item STONE_HEAVY_CROSSBOW = registerItem("stone_heavy_crossbow",   new SwordItem(ToolMaterials.STONE,1,1, new  FabricItemSettings()));
    public static final Item STONE_LONGBOW = registerItem("stone_longbow",   new SwordItem(ToolMaterials.STONE,1,1, new  FabricItemSettings()));
    public static final Item STONE_MUSKET = registerItem("stone_musket",   new SwordItem(ToolMaterials.STONE,1,1, new  FabricItemSettings()));
    public static final Item STONE_PISTOL = registerItem("stone_pistol",   new SwordItem(ToolMaterials.STONE,1,1, new  FabricItemSettings()));




    public static final Item IRON_CLUB = registerItem("iron_club",   new SwordItem(ToolMaterials.IRON,1,-1.6F, new  FabricItemSettings()));
    public static final Item IRON_DAGGER = registerItem("iron_dagger",   new SwordItem(ToolMaterials.IRON,1,-0.8F, new  FabricItemSettings()));
    public static final Item IRON_GREATCLUB = registerItem("iron_greatclub",   new SwordItem(ToolMaterials.IRON,3,-2.4F, new  FabricItemSettings()));
    public static final Item IRON_HANDAXE = registerItem("iron_handaxe",   new SwordItem(ToolMaterials.IRON,2,-1.6F, new  FabricItemSettings()));
    public static final Item IRON_JAVELIN = registerItem("iron_javelin",   new SwordItem(ToolMaterials.IRON,2,-2.4F, new  FabricItemSettings()));
    public static final Item IRON_LIGHT_HAMMER = registerItem("iron_light_hammer",   new SwordItem(ToolMaterials.IRON,1,-1.6F, new  FabricItemSettings()));
    public static final Item IRON_MACE = registerItem("iron_mace",   new SwordItem(ToolMaterials.IRON,2,-2.4F, new  FabricItemSettings()));
    public static final Item IRON_QUARTERSTAFF = registerItem("iron_quarterstaff",   new SwordItem(ToolMaterials.IRON,2,-2.4F, new  FabricItemSettings()));
    public static final Item IRON_SICKLE = registerItem("iron_sickle",   new SwordItem(ToolMaterials.IRON,1,-1.6F, new  FabricItemSettings()));
    public static final Item IRON_SPEAR = registerItem("iron_spear",   new SwordItem(ToolMaterials.IRON,2,-2.4F, new  FabricItemSettings()));


    public static final Item IRON_BATTLEAXE = registerItem("iron_battleaxe",   new SwordItem(ToolMaterials.IRON,3,-2.4F, new  FabricItemSettings()));
    public static final Item IRON_FLAIL = registerItem("iron_flail",   new SwordItem(ToolMaterials.IRON,3,-2.4F, new  FabricItemSettings()));
    public static final Item IRON_GLAIVE = registerItem("iron_glaive",   new SwordItem(ToolMaterials.IRON,4,-3.2F, new  FabricItemSettings()));
    public static final Item IRON_GREATAXE = registerItem("iron_greataxe",   new SwordItem(ToolMaterials.IRON,5,-3.2F, new  FabricItemSettings()));
    public static final Item IRON_GREATSWORD = registerItem("iron_greatsword",   new SwordItem(ToolMaterials.IRON,5,-3.2F, new  FabricItemSettings()));
    public static final Item IRON_HALBERD = registerItem("iron_halberd",   new SwordItem(ToolMaterials.IRON,4,-3.2F, new  FabricItemSettings()));
    public static final Item IRON_LANCE = registerItem("iron_lance",   new SwordItem(ToolMaterials.IRON,4,-3.2F, new  FabricItemSettings()));
    public static final Item IRON_LONGSWORD = registerItem("iron_longsword",   new SwordItem(ToolMaterials.IRON,3,-2.4F, new  FabricItemSettings()));
    public static final Item IRON_MAUL = registerItem("iron_maul",   new SwordItem(ToolMaterials.IRON,5,-3.2F, new  FabricItemSettings()));
    public static final Item IRON_MORNINGSTAR = registerItem("iron_morningstar",   new SwordItem(ToolMaterials.IRON,3,-2.4F, new  FabricItemSettings()));
    public static final Item IRON_PIKE = registerItem("iron_pike",   new SwordItem(ToolMaterials.IRON,4,-3.2F, new  FabricItemSettings()));
    public static final Item IRON_RAPIER = registerItem("iron_rapier",   new SwordItem(ToolMaterials.IRON,3,-1.6F, new  FabricItemSettings()));
    public static final Item IRON_SCIMITAR = registerItem("iron_scimitar",   new SwordItem(ToolMaterials.IRON,2,-0.8F, new  FabricItemSettings()));
    public static final Item IRON_SHORTSWORD = registerItem("iron_shortsword",   new SwordItem(ToolMaterials.IRON,2,-0.8F, new  FabricItemSettings()));
    public static final Item IRON_TRIDENT = registerItem("iron_trident",   new SwordItem(ToolMaterials.IRON,3,-2.4F, new  FabricItemSettings()));
    public static final Item IRON_WAR_PICK = registerItem("iron_war_pick",   new SwordItem(ToolMaterials.IRON,3,-2.4F, new  FabricItemSettings()));
    public static final Item IRON_WHIP = registerItem("iron_whip",   new SwordItem(ToolMaterials.IRON,1,-1.6F, new  FabricItemSettings()));

    public static final Item IRON_YKLWA = registerItem("iron_yklwa",   new SwordItem(ToolMaterials.IRON,3,-2.4F, new  FabricItemSettings()));

    public static final Item IRON_HOOPAK = registerItem("iron_hoopak",   new SwordItem(ToolMaterials.IRON,2,-1.6F, new  FabricItemSettings()));
    public static final Item IRON_DOUBLE_BLADED_SCIMITAR = registerItem("iron_double_bladed_scimitar",   new SwordItem(ToolMaterials.IRON,2,-1.6F, new  FabricItemSettings()));

    public static final Item IRON_DART = registerItem("iron_dart",   new SwordItem(ToolMaterials.IRON,1,1, new  FabricItemSettings()));
    public static final Item IRON_LIGHT_CROSSBOW = registerItem("iron_light_crossbow",   new SwordItem(ToolMaterials.IRON,1,1, new  FabricItemSettings()));
    public static final Item IRON_SHORTBOW = registerItem("iron_shortbow",   new SwordItem(ToolMaterials.IRON,1,1, new  FabricItemSettings()));
    public static final Item IRON_SLING = registerItem("iron_sling",   new SwordItem(ToolMaterials.IRON,1,1, new  FabricItemSettings()));


    public static final Item IRON_BLOWGUN = registerItem("iron_blowgun",   new SwordItem(ToolMaterials.IRON,1,1, new  FabricItemSettings()));
    public static final Item IRON_HAND_CROSSBOW = registerItem("iron_hand_crossbow",   new SwordItem(ToolMaterials.IRON,1,1, new  FabricItemSettings()));
    public static final Item IRON_HEAVY_CROSSBOW = registerItem("iron_heavy_crossbow",   new SwordItem(ToolMaterials.IRON,1,1, new  FabricItemSettings()));
    public static final Item IRON_LONGBOW = registerItem("iron_longbow",   new SwordItem(ToolMaterials.IRON,1,1, new  FabricItemSettings()));
    public static final Item IRON_MUSKET = registerItem("iron_musket",   new SwordItem(ToolMaterials.IRON,1,1, new  FabricItemSettings()));
    public static final Item IRON_PISTOL = registerItem("iron_pistol",   new SwordItem(ToolMaterials.IRON,1,1, new  FabricItemSettings()));
    
    public static final Item DIAMOND_CLUB = registerItem("diamond_club",   new SwordItem(ToolMaterials.WOOD,1,-1.6F, new  FabricItemSettings()));
    public static final Item DIAMOND_DAGGER = registerItem("diamond_dagger",   new SwordItem(ToolMaterials.WOOD,1,-0.8F, new  FabricItemSettings()));
    public static final Item DIAMOND_GREATCLUB = registerItem("diamond_greatclub",   new SwordItem(ToolMaterials.WOOD,3,-1.6F, new  FabricItemSettings()));
    public static final Item DIAMOND_HANDAXE = registerItem("diamond_handaxe",   new SwordItem(ToolMaterials.WOOD,2,-1.6F, new  FabricItemSettings()));
    public static final Item DIAMOND_JAVELIN = registerItem("diamond_javelin",   new SwordItem(ToolMaterials.WOOD,2,-2.4F, new  FabricItemSettings()));
    public static final Item DIAMOND_LIGHT_HAMMER = registerItem("diamond_light_hammer",   new SwordItem(ToolMaterials.WOOD,1,-1.6F, new  FabricItemSettings()));
    public static final Item DIAMOND_MACE = registerItem("diamond_mace",   new SwordItem(ToolMaterials.WOOD,2,-2.4F, new  FabricItemSettings()));
    public static final Item DIAMOND_QUARTERSTAFF = registerItem("diamond_quarterstaff",   new SwordItem(ToolMaterials.WOOD,2,-2.4F, new  FabricItemSettings()));
    public static final Item DIAMOND_SICKLE = registerItem("diamond_sickle",   new SwordItem(ToolMaterials.WOOD,1,-1.6F, new  FabricItemSettings()));
    public static final Item DIAMOND_SPEAR = registerItem("diamond_spear",   new SwordItem(ToolMaterials.WOOD,2,-2.4F, new  FabricItemSettings()));


    public static final Item DIAMOND_BATTLEAXE = registerItem("diamond_battleaxe",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item DIAMOND_FLAIL = registerItem("diamond_flail",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item DIAMOND_GLAIVE = registerItem("diamond_glaive",   new SwordItem(ToolMaterials.WOOD,4,-3.2F, new  FabricItemSettings()));
    public static final Item DIAMOND_GREATAXE = registerItem("diamond_greataxe",   new SwordItem(ToolMaterials.WOOD,5,-3.2F, new  FabricItemSettings()));
    public static final Item DIAMOND_GREATSWORD = registerItem("diamond_greatsword",   new SwordItem(ToolMaterials.WOOD,5,-3.2F, new  FabricItemSettings()));
    public static final Item DIAMOND_HALBERD = registerItem("diamond_halberd",   new SwordItem(ToolMaterials.WOOD,4,-3.2F, new  FabricItemSettings()));
    public static final Item DIAMOND_LANCE = registerItem("diamond_lance",   new SwordItem(ToolMaterials.WOOD,4,-3.2F, new  FabricItemSettings()));
    public static final Item DIAMOND_LONGSWORD = registerItem("diamond_longsword",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item DIAMOND_MAUL = registerItem("diamond_maul",   new SwordItem(ToolMaterials.WOOD,5,-3.2F, new  FabricItemSettings()));
    public static final Item DIAMOND_MORNINGSTAR = registerItem("diamond_morningstar",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item DIAMOND_PIKE = registerItem("diamond_pike",   new SwordItem(ToolMaterials.WOOD,4,-3.2F, new  FabricItemSettings()));
    public static final Item DIAMOND_RAPIER = registerItem("diamond_rapier",   new SwordItem(ToolMaterials.WOOD,3,-1.6F, new  FabricItemSettings()));
    public static final Item DIAMOND_SCIMITAR = registerItem("diamond_scimitar",   new SwordItem(ToolMaterials.WOOD,2,-0.8F, new  FabricItemSettings()));
    public static final Item DIAMOND_SHORTSWORD = registerItem("diamond_shortsword",   new SwordItem(ToolMaterials.WOOD,2,-0.8F, new  FabricItemSettings()));
    public static final Item DIAMOND_TRIDENT = registerItem("diamond_trident",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item DIAMOND_WAR_PICK = registerItem("diamond_war_pick",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item DIAMOND_WHIP = registerItem("diamond_whip",   new SwordItem(ToolMaterials.WOOD,1,-1.6F, new  FabricItemSettings()));


    public static final Item DIAMOND_DART = registerItem("diamond_dart",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item DIAMOND_LIGHT_CROSSBOW = registerItem("diamond_light_crossbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item DIAMOND_SHORTBOW = registerItem("diamond_shortbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item DIAMOND_SLING = registerItem("diamond_sling",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));


    public static final Item DIAMOND_BLOWGUN = registerItem("diamond_blowgun",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item DIAMOND_HAND_CROSSBOW = registerItem("diamond_hand_crossbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item DIAMOND_HEAVY_CROSSBOW = registerItem("diamond_heavy_crossbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item DIAMOND_LONGBOW = registerItem("diamond_longbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item DIAMOND_MUSKET = registerItem("diamond_musket",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item DIAMOND_PISTOL = registerItem("diamond_pistol",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));




    public static final Item NETHERITE_CLUB = registerItem("netherite_club",   new SwordItem(ToolMaterials.WOOD,1,-1.6F, new  FabricItemSettings()));
    public static final Item NETHERITE_DAGGER = registerItem("netherite_dagger",   new SwordItem(ToolMaterials.WOOD,1,-0.8F, new  FabricItemSettings()));
    public static final Item NETHERITE_GREATCLUB = registerItem("netherite_greatclub",   new SwordItem(ToolMaterials.WOOD,3,-1.6F, new  FabricItemSettings()));
    public static final Item NETHERITE_HANDAXE = registerItem("netherite_handaxe",   new SwordItem(ToolMaterials.WOOD,2,-1.6F, new  FabricItemSettings()));
    public static final Item NETHERITE_JAVELIN = registerItem("netherite_javelin",   new SwordItem(ToolMaterials.WOOD,2,-2.4F, new  FabricItemSettings()));
    public static final Item NETHERITE_LIGHT_HAMMER = registerItem("netherite_light_hammer",   new SwordItem(ToolMaterials.WOOD,1,-1.6F, new  FabricItemSettings()));
    public static final Item NETHERITE_MACE = registerItem("netherite_mace",   new SwordItem(ToolMaterials.WOOD,2,-2.4F, new  FabricItemSettings()));
    public static final Item NETHERITE_QUARTERSTAFF = registerItem("netherite_quarterstaff",   new SwordItem(ToolMaterials.WOOD,2,-2.4F, new  FabricItemSettings()));
    public static final Item NETHERITE_SICKLE = registerItem("netherite_sickle",   new SwordItem(ToolMaterials.WOOD,1,-1.6F, new  FabricItemSettings()));
    public static final Item NETHERITE_SPEAR = registerItem("netherite_spear",   new SwordItem(ToolMaterials.WOOD,2,-2.4F, new  FabricItemSettings()));


    public static final Item NETHERITE_BATTLEAXE = registerItem("netherite_battleaxe",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item NETHERITE_FLAIL = registerItem("netherite_flail",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item NETHERITE_GLAIVE = registerItem("netherite_glaive",   new SwordItem(ToolMaterials.WOOD,4,-3.2F, new  FabricItemSettings()));
    public static final Item NETHERITE_GREATAXE = registerItem("netherite_greataxe",   new SwordItem(ToolMaterials.WOOD,5,-3.2F, new  FabricItemSettings()));
    public static final Item NETHERITE_GREATSWORD = registerItem("netherite_greatsword",   new SwordItem(ToolMaterials.WOOD,5,-3.2F, new  FabricItemSettings()));
    public static final Item NETHERITE_HALBERD = registerItem("netherite_halberd",   new SwordItem(ToolMaterials.WOOD,4,-3.2F, new  FabricItemSettings()));
    public static final Item NETHERITE_LANCE = registerItem("netherite_lance",   new SwordItem(ToolMaterials.WOOD,4,-3.2F, new  FabricItemSettings()));
    public static final Item NETHERITE_LONGSWORD = registerItem("netherite_longsword",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item NETHERITE_MAUL = registerItem("netherite_maul",   new SwordItem(ToolMaterials.WOOD,5,-3.2F, new  FabricItemSettings()));
    public static final Item NETHERITE_MORNINGSTAR = registerItem("netherite_morningstar",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item NETHERITE_PIKE = registerItem("netherite_pike",   new SwordItem(ToolMaterials.WOOD,4,-3.2F, new  FabricItemSettings()));
    public static final Item NETHERITE_RAPIER = registerItem("netherite_rapier",   new SwordItem(ToolMaterials.WOOD,3,-1.6F, new  FabricItemSettings()));
    public static final Item NETHERITE_SCIMITAR = registerItem("netherite_scimitar",   new SwordItem(ToolMaterials.WOOD,2,-0.8F, new  FabricItemSettings()));
    public static final Item NETHERITE_SHORTSWORD = registerItem("netherite_shortsword",   new SwordItem(ToolMaterials.WOOD,2,-0.8F, new  FabricItemSettings()));
    public static final Item NETHERITE_TRIDENT = registerItem("netherite_trident",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item NETHERITE_WAR_PICK = registerItem("netherite_war_pick",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item NETHERITE_WHIP = registerItem("netherite_whip",   new SwordItem(ToolMaterials.WOOD,1,-1.6F, new  FabricItemSettings()));


    public static final Item NETHERITE_DART = registerItem("netherite_dart",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item NETHERITE_LIGHT_CROSSBOW = registerItem("netherite_light_crossbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item NETHERITE_SHORTBOW = registerItem("netherite_shortbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item NETHERITE_SLING = registerItem("netherite_sling",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));


    public static final Item NETHERITE_BLOWGUN = registerItem("netherite_blowgun",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item NETHERITE_HAND_CROSSBOW = registerItem("netherite_hand_crossbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item NETHERITE_HEAVY_CROSSBOW = registerItem("netherite_heavy_crossbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item NETHERITE_LONGBOW = registerItem("netherite_longbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item NETHERITE_MUSKET = registerItem("netherite_musket",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item NETHERITE_PISTOL = registerItem("netherite_pistol",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));

    public static final Item ADAMANTITE_CLUB = registerItem("adamantite_club",   new SwordItem(ToolMaterials.WOOD,1,-1.6F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_DAGGER = registerItem("adamantite_dagger",   new SwordItem(ToolMaterials.WOOD,1,-0.8F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_GREATCLUB = registerItem("adamantite_greatclub",   new SwordItem(ToolMaterials.WOOD,3,-1.6F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_HANDAXE = registerItem("adamantite_handaxe",   new SwordItem(ToolMaterials.WOOD,2,-1.6F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_JAVELIN = registerItem("adamantite_javelin",   new SwordItem(ToolMaterials.WOOD,2,-2.4F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_LIGHT_HAMMER = registerItem("adamantite_light_hammer",   new SwordItem(ToolMaterials.WOOD,1,-1.6F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_MACE = registerItem("adamantite_mace",   new SwordItem(ToolMaterials.WOOD,2,-2.4F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_QUARTERSTAFF = registerItem("adamantite_quarterstaff",   new SwordItem(ToolMaterials.WOOD,2,-2.4F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_SICKLE = registerItem("adamantite_sickle",   new SwordItem(ToolMaterials.WOOD,1,-1.6F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_SPEAR = registerItem("adamantite_spear",   new SwordItem(ToolMaterials.WOOD,2,-2.4F, new  FabricItemSettings()));




    public static final Item ADAMANTITE_BATTLEAXE = registerItem("adamantite_battleaxe",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_FLAIL = registerItem("adamantite_flail",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_GLAIVE = registerItem("adamantite_glaive",   new SwordItem(ToolMaterials.WOOD,4,-3.2F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_GREATAXE = registerItem("adamantite_greataxe",   new SwordItem(ToolMaterials.WOOD,5,-3.2F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_GREATSWORD = registerItem("adamantite_greatsword",   new SwordItem(ToolMaterials.WOOD,5,-3.2F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_HALBERD = registerItem("adamantite_halberd",   new SwordItem(ToolMaterials.WOOD,4,-3.2F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_LANCE = registerItem("adamantite_lance",   new SwordItem(ToolMaterials.WOOD,4,-3.2F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_LONGSWORD = registerItem("adamantite_longsword",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_MAUL = registerItem("adamantite_maul",   new SwordItem(ToolMaterials.WOOD,5,-3.2F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_MORNINGSTAR = registerItem("adamantite_morningstar",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_PIKE = registerItem("adamantite_pike",   new SwordItem(ToolMaterials.WOOD,4,-3.2F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_RAPIER = registerItem("adamantite_rapier",   new SwordItem(ToolMaterials.WOOD,3,-1.6F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_SCIMITAR = registerItem("adamantite_scimitar",   new SwordItem(ToolMaterials.WOOD,2,-0.8F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_SHORTSWORD = registerItem("adamantite_shortsword",   new SwordItem(ToolMaterials.WOOD,2,-0.8F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_TRIDENT = registerItem("adamantite_trident",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_WAR_PICK = registerItem("adamantite_war_pick",   new SwordItem(ToolMaterials.WOOD,3,-2.4F, new  FabricItemSettings()));
    public static final Item ADAMANTITE_WHIP = registerItem("adamantite_whip",   new SwordItem(ToolMaterials.WOOD,1,-1.6F, new  FabricItemSettings()));




    public static final Item ADAMANTITE_DART = registerItem("adamantite_dart",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item ADAMANTITE_LIGHT_CROSSBOW = registerItem("adamantite_light_crossbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item ADAMANTITE_SHORTBOW = registerItem("adamantite_shortbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item ADAMANTITE_SLING = registerItem("adamantite_sling",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));




    public static final Item ADAMANTITE_BLOWGUN = registerItem("adamantite_blowgun",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item ADAMANTITE_HAND_CROSSBOW = registerItem("adamantite_hand_crossbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item ADAMANTITE_HEAVY_CROSSBOW = registerItem("adamantite_heavy_crossbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item ADAMANTITE_LONGBOW = registerItem("adamantite_longbow",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item ADAMANTITE_MUSKET = registerItem("adamantite_musket",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));
    public static final Item ADAMANTITE_PISTOL = registerItem("adamantite_pistol",   new SwordItem(ToolMaterials.WOOD,1,1, new  FabricItemSettings()));



    public static final Item SILVER_PICKAXE = registerItem("silver_pickaxe",
            new PickaxeItem(ModToolMaterial.SILVER_INGOT,4,6f,new FabricItemSettings()));
    public static final Item SILVER_AXE = registerItem("silver_axe",
            new AxeItem(ModToolMaterial.SILVER_INGOT,6,-3.1f,new FabricItemSettings()));
    public static final Item SILVER_SHOVEL = registerItem("silver_shovel",
            new ShovelItem(ModToolMaterial.SILVER_INGOT, 1.5f,-3f,new FabricItemSettings()));
    public static final Item SILVER_HOE = registerItem("silver_hoe",
            new HoeItem(ModToolMaterial.SILVER_INGOT,-2,-1f,new FabricItemSettings()));
    public static final Item SILVER_SWORD = registerItem("silver_sword",
            new SwordItem(ModToolMaterial.SILVER_INGOT,3,-2.4f,new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DnD_in_Minecraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DnD_in_Minecraft.LOGGER.info("Registering Mod items for" + DnD_in_Minecraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(Moditems::addItemsToCombatTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(Moditems::addItemsToToolsTabItemGroup);
    }
}


