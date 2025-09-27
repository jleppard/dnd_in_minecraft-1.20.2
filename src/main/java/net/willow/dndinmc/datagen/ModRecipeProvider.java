package net.willow.dndinmc.datagen;



import com.mojang.datafixers.types.templates.Tag;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.TagEntry;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.willow.dndinmc.Block.ModBlocks;
import net.willow.dndinmc.item.Moditems;

import java.util.List;

import static net.minecraft.data.server.recipe.RecipeProvider.*;
import static net.minecraft.recipe.book.RecipeCategory.*;
import static net.willow.dndinmc.Block.ModBlocks.SILVER_BLOCK;
import static net.willow.dndinmc.item.Moditems.*;
import static net.willow.dndinmc.item.Moditems.SILVER_NUGGET;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> SILVER_SMEALT = List.of(ModBlocks.SILVER_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerSmelting(exporter, SILVER_SMEALT, MISC, SILVER_INGOT, 0.7f, 200, "silver_ingot");
        offerBlasting(exporter, SILVER_SMEALT, MISC, SILVER_INGOT, 0.7f, 100, "silver_ingot");

    offerReversibleCompactingRecipes(exporter, BUILDING_BLOCKS, SILVER_INGOT, DECORATIONS, SILVER_BLOCK);


        ShapelessRecipeJsonBuilder.create(MISC, COPPER_PIECE, 1 ).input(COPPER_NUGGET);
        ShapelessRecipeJsonBuilder.create(MISC, SILVER_PIECE,1).input(SILVER_NUGGET);
        ShapelessRecipeJsonBuilder.create(MISC, GOLD_PIECE,1).input(Items.GOLD_NUGGET);
        ShapelessRecipeJsonBuilder.create(MISC, SILVER_INGOT,9).input(SILVER_BLOCK);


        ShapedRecipeJsonBuilder.create(MISC, SILVER_NUGGET, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', SILVER_NUGGET)
                .criterion(hasItem(SILVER_INGOT),conditionsFromItem(SILVER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(SILVER_NUGGET)));

        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_CLUB, 1)
                .pattern("  @")
                .pattern(" ! ")
                .pattern("!  ")
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_CLUB)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_GREATCLUB, 1)
                .pattern("  #")
                .pattern(" @")
                .pattern("!  ")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_GREATCLUB)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_HANDAXE, 1)
                .pattern(" @@")
                .pattern(" !@")
                .pattern(" ! ")

                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_HANDAXE)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_JAVELIN, 1)
                .pattern("   ")
                .pattern("!@#")
                .pattern("   ")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_JAVELIN)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_LIGHT_HAMMER, 1)
                .pattern(" @ ")
                .pattern("@!@")
                .pattern(" ! ")

                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_LIGHT_HAMMER)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_MACE, 1)
                .pattern("@#@")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_MACE)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_QUARTERSTAFF, 1)
                .pattern(" @ ")
                .pattern(" ! ")
                .pattern(" @ ")

                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_QUARTERSTAFF)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_SICKLE, 1)
                .pattern(" @@")
                .pattern(" ! ")
                .pattern(" ! ")

                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_SPEAR, 1)
                .pattern("!!#")
                .input('#', ItemTags.PLANKS)

                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_SPEAR)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_CLUB, 1)
                .pattern("  @")
                .pattern(" ! ")
                .pattern("!  ")

                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_CLUB)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_BATTLEAXE, 1)
                .pattern(" ##")
                .pattern(" !#")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)

                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_BATTLEAXE)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_FLAIL, 1)
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)

                .input('!', Items.STICK)
                .input('$', Items.CHAIN)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_FLAIL)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_CLUB, 1)
                .pattern("  @")
                .pattern(" ! ")
                .pattern("!  ")

                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_CLUB)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_GREATAXE, 1)
                .pattern("###")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_GREATAXE)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_GREATSWORD, 1)
                .pattern(" # ")
                .pattern("###")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)

                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_GREATAXE)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_HALBERD, 1)
                .pattern(" ##")
                .pattern("@!#")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_HALBERD)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_LANCE, 1)
                .pattern(" ##")
                .pattern(" !#")
                .pattern("!  ")
                .input('#', ItemTags.PLANKS)

                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_LANCE)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_LONGSWORD, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)

                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_LONGSWORD)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_MAUL, 1)
                .pattern("@#@")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)

                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_MAUL)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_MORNINGSTAR, 1)
                .pattern(" @ ")
                .pattern("@#@")
                .pattern(" ! ")

                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_MORNINGSTAR)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_PIKE, 1)
                .pattern("  #")
                .pattern(" ! ")
                .pattern("!  ")
                .input('#', ItemTags.PLANKS)

                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_PIKE)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_RAPIER, 1)
                .pattern(" @ ")
                .pattern("@@@")
                .pattern(" ! ")

                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_RAPIER)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_SCIMITAR, 1)
                .pattern("  @")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_SCIMITAR)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_SHORTSWORD, 1)
                .pattern(" @ ")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_SHORTSWORD)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_TRIDENT, 1)
                .pattern(" #@")
                .pattern("!#@ ")
                .pattern(" #@")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_TRIDENT)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_WAR_PICK, 1)
                .pattern(" #@")
                .pattern(" ! ")
                .pattern(" !  ")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_WAR_PICK)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_WHIP, 1)
                .pattern("  @")
                .pattern("%% ")
                .pattern("!  ")

                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .input('%', Items.STRING)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_WHIP)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_DAGGER, 1)
                .pattern("@")
                .pattern("!")

                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_DAGGER)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_GLAIVE, 1)
                .pattern(" ##")
                .pattern(" !#")
                .pattern("!  ")
                .input('#', ItemTags.PLANKS)

                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_GLAIVE)));
        ShapedRecipeJsonBuilder.create(COMBAT, WOODEN_DOUBLE_BLADED_SCIMITAR, 1)
                .pattern("@")
                .pattern("!")
                .pattern("@")

                .input('@', WOODEN_SCIMITAR)
                .input('!', Items.STICK)
                .criterion(hasItem(BlockTags.PLANKS),conditionsFromItem(BlockTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(WOODEN_DOUBLE_BLADED_SCIMITAR)));




    }

    private String hasItem(TagKey<Block> planks) {
        return null;
    }


    private AdvancementCriterion<?> conditionsFromItem(TagKey<Block> planks) {
        return null;
    }
}
