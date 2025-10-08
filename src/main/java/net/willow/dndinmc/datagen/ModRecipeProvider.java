package net.willow.dndinmc.datagen;



import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.willow.dndinmc.Block.ModBlocks;

import java.util.List;

import static net.minecraft.recipe.book.RecipeCategory.*;
import static net.willow.dndinmc.Block.ModBlocks.SILVER_BLOCK;
import static net.willow.dndinmc.item.Moditems.*;
import static net.willow.dndinmc.item.Moditems.SILVER_NUGGET;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> SILVER_SMELT = List.of(ModBlocks.SILVER_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerSmelting(exporter, SILVER_SMELT, MISC, SILVER_INGOT, 0.7f, 200, "silver_ingot");
        offerBlasting(exporter, SILVER_SMELT, MISC, SILVER_INGOT, 0.7f, 100, "silver_ingot");

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

        ShapedRecipeJsonBuilder.create(COMBAT, STONE_CLUB, 1)
                .pattern("  @")
                .pattern(" ! ")
                .pattern("!  ")
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_CLUB)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_GREATCLUB, 1)
                .pattern("  #")
                .pattern(" @ ")
                .pattern("!  ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_GREATCLUB)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_HANDAXE, 1)
                .pattern(" @@")
                .pattern(" !@")
                .pattern(" ! ")

                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_HANDAXE)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_JAVELIN, 1)
                .pattern("!@#")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_JAVELIN)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_LIGHT_HAMMER, 1)
                .pattern(" @ ")
                .pattern("@!@")
                .pattern(" ! ")

                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_LIGHT_HAMMER)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_MACE, 1)
                .pattern("@#@")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_MACE)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_QUARTERSTAFF, 1)
                .pattern(" @ ")
                .pattern(" ! ")
                .pattern(" @ ")

                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_QUARTERSTAFF)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_SICKLE, 1)
                .pattern(" @@")
                .pattern(" ! ")
                .pattern(" ! ")

                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_SICKLE)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_SPEAR, 1)
                .pattern("!!#")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)

                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_SPEAR)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_BATTLEAXE, 1)
                .pattern(" ##")
                .pattern(" !#")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)

                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_BATTLEAXE)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_FLAIL, 1)
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)

                .input('!', Items.STICK)
                .input('$', Items.CHAIN)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_FLAIL)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_GREATAXE, 1)
                .pattern("###")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_GREATAXE)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_GREATSWORD, 1)
                .pattern(" # ")
                .pattern("###")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)

                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_GREATSWORD)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_HALBERD, 1)
                .pattern(" ##")
                .pattern("@!#")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_HALBERD)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_LANCE, 1)
                .pattern(" ##")
                .pattern(" !#")
                .pattern("!  ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)

                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_LANCE)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_LONGSWORD, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)

                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_LONGSWORD)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_MAUL, 1)
                .pattern("@#@")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_MAUL)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_MORNINGSTAR, 1)
                .pattern(" @ ")
                .pattern("@#@")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_MORNINGSTAR)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_PIKE, 1)
                .pattern("  #")
                .pattern(" ! ")
                .pattern("!  ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)

                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_PIKE)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_RAPIER, 1)
                .pattern(" @ ")
                .pattern("@@@")
                .pattern(" ! ")

                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_RAPIER)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_SCIMITAR, 1)
                .pattern("  @")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_SCIMITAR)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_SHORTSWORD, 1)
                .pattern(" @ ")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_SHORTSWORD)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_TRIDENT, 1)
                .pattern(" #@")
                .pattern("!#@")
                .pattern(" #@")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_TRIDENT)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_WAR_PICK, 1)
                .pattern(" #@")
                .pattern(" ! ")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_WAR_PICK)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_WHIP, 1)
                .pattern("  @")
                .pattern("%% ")
                .pattern("!  ")

                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .input('%', Items.STRING)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_WHIP)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_DAGGER, 1)
                .pattern(" @ ")
                .pattern(" ! ")

                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_DAGGER)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_GLAIVE, 1)
                .pattern(" ##")
                .pattern(" !#")
                .pattern("!  ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)

                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_GLAIVE)));
        ShapedRecipeJsonBuilder.create(COMBAT, STONE_DOUBLE_BLADED_SCIMITAR, 1)
                .pattern(" @ ")
                .pattern(" ! ")
                .pattern(" @ ")

                .input('@', STONE_SCIMITAR)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(STONE_DOUBLE_BLADED_SCIMITAR)));




    }

    private String hasItem(TagKey<Item> itemTagKey) {
        return "has_" + itemTagKey.id().toTranslationKey();
    }


}

