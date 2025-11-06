package net.willow.dndinmc.datagen;



import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.SmithingTransformRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.willow.dndinmc.Block.ModBlocks;
import net.willow.dndinmc.item.Moditems;

import java.util.List;

import static net.willow.dndinmc.Block.ModBlocks.SILVER_BLOCK;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> SILVER_SMELT = List.of(ModBlocks.SILVER_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerSmelting(exporter, SILVER_SMELT, RecipeCategory.MISC, Moditems.SILVER_INGOT, 0.7f, 200, "silver_ingot");
        offerBlasting(exporter, SILVER_SMELT, RecipeCategory.MISC, Moditems.SILVER_INGOT, 0.7f, 100, "silver_ingot");

    offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Moditems.SILVER_INGOT, RecipeCategory.DECORATIONS, SILVER_BLOCK);


        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.COPPER_PIECE, 1 ).input(Moditems.COPPER_NUGGET);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.SILVER_PIECE,1).input(Moditems.SILVER_NUGGET);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.GOLD_PIECE,1).input(Items.GOLD_NUGGET);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.SILVER_INGOT,9).input(SILVER_BLOCK);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.SILVER_NUGGET,9).input(Moditems.SILVER_INGOT);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.SILVER_INGOT,1).input(Moditems.SILVER_NUGGET,9);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.DIAMOND,1).input(Moditems.DIAMOND_SHARD,9);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.DIAMOND_SHARD,9).input(Items.DIAMOND);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.SILVER_NUGGET, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Moditems.SILVER_NUGGET)
                .criterion(hasItem(Moditems.SILVER_INGOT),conditionsFromItem(Moditems.SILVER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.SILVER_NUGGET)));



    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_CLUB, 1)
                .pattern("  @")
                .pattern(" ! ")
                .pattern("!  ")
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_CLUB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_GREATCLUB, 1)
                .pattern("  #")
                .pattern(" @ ")
                .pattern("!  ")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_GREATCLUB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_HANDAXE, 1)
                .pattern(" @@")
                .pattern(" !@")
                .pattern(" ! ")


                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_HANDAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_JAVELIN, 1)
                .pattern("!@#")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_JAVELIN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_LIGHT_HAMMER, 1)
                .pattern(" @ ")
                .pattern("@!@")
                .pattern(" ! ")


                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_LIGHT_HAMMER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_MACE, 1)
                .pattern("@#@")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_MACE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_QUARTERSTAFF, 1)
                .pattern(" @ ")
                .pattern(" ! ")
                .pattern(" @ ")


                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_QUARTERSTAFF)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_SICKLE, 1)
                .pattern(" @@")
                .pattern(" ! ")
                .pattern(" ! ")


                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_SPEAR, 1)
                .pattern("!!#")
                .input('#', ItemTags.PLANKS)


                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_SPEAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_BATTLEAXE, 1)
                .pattern(" ##")
                .pattern(" !#")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)


                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_BATTLEAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_FLAIL, 1)
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)


                .input('!', Items.STICK)
                .input('$', Items.CHAIN)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_FLAIL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_GREATAXE, 1)
                .pattern("###")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_GREATAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_GREATSWORD, 1)
                .pattern(" # ")
                .pattern("###")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)


                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_GREATSWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_HALBERD, 1)
                .pattern(" ##")
                .pattern("@!#")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_HALBERD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_LANCE, 1)
                .pattern(" ##")
                .pattern(" !#")
                .pattern("!  ")
                .input('#', ItemTags.PLANKS)


                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_LANCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_LONGSWORD, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)


                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_LONGSWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_MAUL, 1)
                .pattern("@#@")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_MAUL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_MORNINGSTAR, 1)
                .pattern(" @ ")
                .pattern("@#@")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_MORNINGSTAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_PIKE, 1)
                .pattern("  #")
                .pattern(" ! ")
                .pattern("!  ")
                .input('#', ItemTags.PLANKS)


                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_PIKE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_RAPIER, 1)
                .pattern(" @ ")
                .pattern("@@@")
                .pattern(" ! ")


                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_RAPIER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_SCIMITAR, 1)
                .pattern("  @")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_SCIMITAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_SHORTSWORD, 1)
                .pattern(" @ ")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_SHORTSWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_TRIDENT, 1)
                .pattern(" #@")
                .pattern("!#@")
                .pattern(" #@")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_TRIDENT)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_WAR_PICK, 1)
                .pattern(" #@")
                .pattern(" ! ")
                .pattern(" ! ")
                .input('#', ItemTags.PLANKS)
                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_WAR_PICK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_WHIP, 1)
                .pattern("  @")
                .pattern("%% ")
                .pattern("!  ")


                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .input('%', Items.STRING)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_WHIP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_DAGGER, 1)
                .pattern(" @ ")
                .pattern(" ! ")


                .input('@', ItemTags.WOODEN_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_DAGGER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_GLAIVE, 1)
                .pattern("  #")
                .pattern(" !#")
                .pattern("!  ")
                .input('#', ItemTags.PLANKS)


                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_GLAIVE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.WOODEN_DOUBLE_BLADED_SCIMITAR, 1)
                .pattern(" @ ")
                .pattern(" ! ")
                .pattern(" @ ")


                .input('@', Moditems.WOODEN_SCIMITAR)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.PLANKS),conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.WOODEN_DOUBLE_BLADED_SCIMITAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_CLUB, 1)
                .pattern("  @")
                .pattern(" ! ")
                .pattern("!  ")
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_CLUB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_GREATCLUB, 1)
                .pattern("  #")
                .pattern(" @ ")
                .pattern("!  ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_GREATCLUB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_HANDAXE, 1)
                .pattern(" @@")
                .pattern(" !@")
                .pattern(" ! ")


                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_HANDAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_JAVELIN, 1)
                .pattern("!@#")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_JAVELIN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_LIGHT_HAMMER, 1)
                .pattern(" @ ")
                .pattern("@!@")
                .pattern(" ! ")


                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_LIGHT_HAMMER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_MACE, 1)
                .pattern("@#@")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_MACE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_QUARTERSTAFF, 1)
                .pattern(" @ ")
                .pattern(" ! ")
                .pattern(" @ ")


                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_QUARTERSTAFF)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_SICKLE, 1)
                .pattern(" @@")
                .pattern(" ! ")
                .pattern(" ! ")


                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_SICKLE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_SPEAR, 1)
                .pattern("!!#")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)


                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_SPEAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_BATTLEAXE, 1)
                .pattern(" ##")
                .pattern(" !#")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_BATTLEAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_FLAIL, 1)
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)


                .input('!', Items.STICK)
                .input('$', Items.CHAIN)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_FLAIL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_GREATAXE, 1)
                .pattern("###")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_GREATAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_GREATSWORD, 1)
                .pattern(" # ")
                .pattern("###")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)


                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_GREATSWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_HALBERD, 1)
                .pattern(" ##")
                .pattern("@!#")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_HALBERD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_LANCE, 1)
                .pattern(" ##")
                .pattern(" !#")
                .pattern("!  ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)


                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_LANCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_LONGSWORD, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)


                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_LONGSWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_MAUL, 1)
                .pattern("@#@")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_MAUL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_MORNINGSTAR, 1)
                .pattern(" @ ")
                .pattern("@#@")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_MORNINGSTAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_PIKE, 1)
                .pattern("  #")
                .pattern(" ! ")
                .pattern("!  ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)


                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_PIKE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_RAPIER, 1)
                .pattern(" @ ")
                .pattern("@@@")
                .pattern(" ! ")


                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_RAPIER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_SCIMITAR, 1)
                .pattern("  @")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_SCIMITAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_SHORTSWORD, 1)
                .pattern(" @ ")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_SHORTSWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_TRIDENT, 1)
                .pattern(" #@")
                .pattern("!#@")
                .pattern(" #@")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_TRIDENT)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_WAR_PICK, 1)
                .pattern(" #@")
                .pattern(" ! ")
                .pattern(" ! ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)
                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_WAR_PICK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_WHIP, 1)
                .pattern("  @")
                .pattern("%% ")
                .pattern("!  ")


                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .input('%', Items.STRING)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_WHIP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_DAGGER, 1)
                .pattern(" @ ")
                .pattern(" ! ")


                .input('@', ItemTags.STONE_BUTTONS)
                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_DAGGER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_GLAIVE, 1)
                .pattern("  #")
                .pattern(" !#")
                .pattern("!  ")
                .input('#', ItemTags.STONE_TOOL_MATERIALS)


                .input('!', Items.STICK)
                .criterion(hasItem(ItemTags.STONE_TOOL_MATERIALS),conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_GLAIVE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.STONE_DOUBLE_BLADED_SCIMITAR, 1)
                .pattern(" @ ")
                .pattern(" ! ")
                .pattern(" @ ")
                .input('@', Moditems.STONE_SCIMITAR)
                .input('!', Items.STICK)
                .criterion(hasItem(Moditems.STONE_SCIMITAR),conditionsFromItem(Moditems.STONE_SCIMITAR))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.STONE_DOUBLE_BLADED_SCIMITAR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_CLUB, 1)
                .pattern("  @")
                .pattern(" ! ")
                .pattern("!  ")
                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_CLUB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_GREATCLUB, 1)
                .pattern("  #")
                .pattern(" @ ")
                .pattern("!  ")
                .input('#', Items.IRON_INGOT)
                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_GREATCLUB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_HANDAXE, 1)
                .pattern(" @@")
                .pattern(" !@")
                .pattern(" ! ")


                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_HANDAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_JAVELIN, 1)
                .pattern("!@#")
                .input('#', Items.IRON_INGOT)
                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_JAVELIN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_LIGHT_HAMMER, 1)
                .pattern(" @ ")
                .pattern("@!@")
                .pattern(" ! ")


                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_LIGHT_HAMMER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_MACE, 1)
                .pattern("@#@")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', Items.IRON_INGOT)
                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_MACE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_QUARTERSTAFF, 1)
                .pattern(" @ ")
                .pattern(" ! ")
                .pattern(" @ ")


                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_QUARTERSTAFF)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_SICKLE, 1)
                .pattern(" @@")
                .pattern(" ! ")
                .pattern(" ! ")


                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_SICKLE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_SPEAR, 1)
                .pattern("!!#")
                .input('#', Items.IRON_INGOT)


                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_SPEAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_BATTLEAXE, 1)
                .pattern(" ##")
                .pattern(" !#")
                .pattern(" ! ")
                .input('#', Items.IRON_INGOT)


                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_BATTLEAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_FLAIL, 1)
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" ! ")
                .input('#', Items.IRON_INGOT)


                .input('!', Items.STICK)
                .input('$', Items.CHAIN)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_FLAIL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_GREATAXE, 1)
                .pattern("###")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', Items.IRON_INGOT)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_GREATAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_GREATSWORD, 1)
                .pattern(" # ")
                .pattern("###")
                .pattern(" ! ")
                .input('#', Items.IRON_INGOT)


                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_GREATSWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_HALBERD, 1)
                .pattern(" ##")
                .pattern("@!#")
                .pattern(" ! ")
                .input('#', Items.IRON_INGOT)
                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_HALBERD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_LANCE, 1)
                .pattern(" ##")
                .pattern(" !#")
                .pattern("!  ")
                .input('#', Items.IRON_INGOT)


                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_LANCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_LONGSWORD, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', Items.IRON_INGOT)


                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_LONGSWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_MAUL, 1)
                .pattern("@#@")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', Items.IRON_INGOT)
                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_MAUL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_MORNINGSTAR, 1)
                .pattern(" @ ")
                .pattern("@#@")
                .pattern(" ! ")
                .input('#', Items.IRON_INGOT)
                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_MORNINGSTAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_PIKE, 1)
                .pattern("  #")
                .pattern(" ! ")
                .pattern("!  ")
                .input('#', Items.IRON_INGOT)


                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_PIKE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_RAPIER, 1)
                .pattern(" @ ")
                .pattern("@@@")
                .pattern(" ! ")


                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_RAPIER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_SCIMITAR, 1)
                .pattern("  @")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', Items.IRON_INGOT)
                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_SCIMITAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_SHORTSWORD, 1)
                .pattern(" @ ")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', Items.IRON_INGOT)
                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_SHORTSWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_TRIDENT, 1)
                .pattern(" #@")
                .pattern("!#@")
                .pattern(" #@")
                .input('#', Items.IRON_INGOT)
                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_TRIDENT)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_WAR_PICK, 1)
                .pattern(" #@")
                .pattern(" ! ")
                .pattern(" ! ")
                .input('#', Items.IRON_INGOT)
                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_WAR_PICK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_WHIP, 1)
                .pattern("  @")
                .pattern("%% ")
                .pattern("!  ")


                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .input('%', Items.STRING)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_WHIP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_DAGGER, 1)
                .pattern(" @ ")
                .pattern(" ! ")


                .input('@', Items.IRON_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_DAGGER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.IRON_GLAIVE, 1)
                .pattern("  #")
                .pattern(" !#")
                .pattern("!  ")
                .input('#', Items.IRON_INGOT)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.IRON_GLAIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_CLUB, 1)
                .pattern("  @")
                .pattern(" ! ")
                .pattern("!  ")
                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_CLUB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_GREATCLUB, 1)
                .pattern("  #")
                .pattern(" @ ")
                .pattern("!  ")
                .input('#', Items.GOLD_INGOT)
                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_GREATCLUB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_HANDAXE, 1)
                .pattern(" @@")
                .pattern(" !@")
                .pattern(" ! ")




                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_HANDAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_JAVELIN, 1)
                .pattern("!@#")
                .input('#', Items.GOLD_INGOT)
                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_JAVELIN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_LIGHT_HAMMER, 1)
                .pattern(" @ ")
                .pattern("@!@")
                .pattern(" ! ")




                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_LIGHT_HAMMER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_MACE, 1)
                .pattern("@#@")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', Items.GOLD_INGOT)
                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_MACE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_QUARTERSTAFF, 1)
                .pattern(" @ ")
                .pattern(" ! ")
                .pattern(" @ ")




                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_QUARTERSTAFF)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_SICKLE, 1)
                .pattern(" @@")
                .pattern(" ! ")
                .pattern(" ! ")




                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_SICKLE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_SPEAR, 1)
                .pattern("!!#")
                .input('#', Items.GOLD_INGOT)




                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_SPEAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_BATTLEAXE, 1)
                .pattern(" ##")
                .pattern(" !#")
                .pattern(" ! ")
                .input('#', Items.GOLD_INGOT)




                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_BATTLEAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_FLAIL, 1)
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" ! ")
                .input('#', Items.GOLD_INGOT)




                .input('!', Items.STICK)
                .input('$', Items.CHAIN)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_FLAIL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_GREATAXE, 1)
                .pattern("###")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', Items.GOLD_INGOT)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_GREATAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_GREATSWORD, 1)
                .pattern(" # ")
                .pattern("###")
                .pattern(" ! ")
                .input('#', Items.GOLD_INGOT)




                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_GREATSWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_HALBERD, 1)
                .pattern(" ##")
                .pattern("@!#")
                .pattern(" ! ")
                .input('#', Items.GOLD_INGOT)
                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_HALBERD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_LANCE, 1)
                .pattern(" ##")
                .pattern(" !#")
                .pattern("!  ")
                .input('#', Items.GOLD_INGOT)




                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_LANCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_LONGSWORD, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', Items.GOLD_INGOT)




                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_LONGSWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_MAUL, 1)
                .pattern("@#@")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', Items.GOLD_INGOT)
                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_MAUL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_MORNINGSTAR, 1)
                .pattern(" @ ")
                .pattern("@#@")
                .pattern(" ! ")
                .input('#', Items.GOLD_INGOT)
                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_MORNINGSTAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_PIKE, 1)
                .pattern("  #")
                .pattern(" ! ")
                .pattern("!  ")
                .input('#', Items.GOLD_INGOT)




                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_PIKE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_RAPIER, 1)
                .pattern(" @ ")
                .pattern("@@@")
                .pattern(" ! ")




                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_RAPIER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_SCIMITAR, 1)
                .pattern("  @")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', Items.GOLD_INGOT)
                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_SCIMITAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_SHORTSWORD, 1)
                .pattern(" @ ")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', Items.GOLD_INGOT)
                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_SHORTSWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_TRIDENT, 1)
                .pattern(" #@")
                .pattern("!#@")
                .pattern(" #@")
                .input('#', Items.GOLD_INGOT)
                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_TRIDENT)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_WAR_PICK, 1)
                .pattern(" #@")
                .pattern(" ! ")
                .pattern(" ! ")
                .input('#', Items.GOLD_INGOT)
                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_WAR_PICK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_WHIP, 1)
                .pattern("  @")
                .pattern("%% ")
                .pattern("!  ")




                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .input('%', Items.STRING)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_WHIP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_DAGGER, 1)
                .pattern(" @ ")
                .pattern(" ! ")




                .input('@', Items.GOLD_NUGGET)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_DAGGER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.GOLD_GLAIVE, 1)
                .pattern("  #")
                .pattern(" !#")
                .pattern("!  ")
                .input('#', Items.GOLD_INGOT)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.GOLD_GLAIVE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_CLUB, 1)
                .pattern("  @")
                .pattern(" ! ")
                .pattern("!  ")
                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_CLUB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_GREATCLUB, 1)
                .pattern("  #")
                .pattern(" @ ")
                .pattern("!  ")
                .input('#', Items.DIAMOND)
                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_GREATCLUB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_HANDAXE, 1)
                .pattern(" @@")
                .pattern(" !@")
                .pattern(" ! ")


                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_HANDAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_JAVELIN, 1)
                .pattern("!@#")
                .input('#', Items.DIAMOND)
                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_JAVELIN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_LIGHT_HAMMER, 1)
                .pattern(" @ ")
                .pattern("@!@")
                .pattern(" ! ")


                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_LIGHT_HAMMER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_MACE, 1)
                .pattern("@#@")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', Items.DIAMOND)
                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_MACE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_QUARTERSTAFF, 1)
                .pattern(" @ ")
                .pattern(" ! ")
                .pattern(" @ ")


                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_QUARTERSTAFF)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_SICKLE, 1)
                .pattern(" @@")
                .pattern(" ! ")
                .pattern(" ! ")


                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_SICKLE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_SPEAR, 1)
                .pattern("!!#")
                .input('#', Items.DIAMOND)


                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_SPEAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_BATTLEAXE, 1)
                .pattern(" ##")
                .pattern(" !#")
                .pattern(" ! ")
                .input('#', Items.DIAMOND)


                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_BATTLEAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_FLAIL, 1)
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" ! ")
                .input('#', Items.DIAMOND)


                .input('!', Items.STICK)
                .input('$', Items.CHAIN)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_FLAIL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_GREATAXE, 1)
                .pattern("###")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', Items.DIAMOND)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_GREATAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_GREATSWORD, 1)
                .pattern(" # ")
                .pattern("###")
                .pattern(" ! ")
                .input('#', Items.DIAMOND)


                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_GREATSWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_HALBERD, 1)
                .pattern(" ##")
                .pattern("@!#")
                .pattern(" ! ")
                .input('#', Items.DIAMOND)
                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_HALBERD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_LANCE, 1)
                .pattern(" ##")
                .pattern(" !#")
                .pattern("!  ")
                .input('#', Items.DIAMOND)


                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_LANCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_LONGSWORD, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', Items.DIAMOND)


                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_LONGSWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_MAUL, 1)
                .pattern("@#@")
                .pattern("#!#")
                .pattern(" ! ")
                .input('#', Items.DIAMOND)
                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_MAUL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_MORNINGSTAR, 1)
                .pattern(" @ ")
                .pattern("@#@")
                .pattern(" ! ")
                .input('#', Items.DIAMOND)
                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_MORNINGSTAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_PIKE, 1)
                .pattern("  #")
                .pattern(" ! ")
                .pattern("!  ")
                .input('#', Items.DIAMOND)


                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_PIKE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_RAPIER, 1)
                .pattern(" @ ")
                .pattern("@@@")
                .pattern(" ! ")


                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_RAPIER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_SCIMITAR, 1)
                .pattern("  @")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', Items.DIAMOND)
                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_SCIMITAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_SHORTSWORD, 1)
                .pattern(" @ ")
                .pattern(" # ")
                .pattern(" ! ")
                .input('#', Items.DIAMOND)
                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_SHORTSWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_TRIDENT, 1)
                .pattern(" #@")
                .pattern("!#@")
                .pattern(" #@")
                .input('#', Items.DIAMOND)
                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_TRIDENT)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_WAR_PICK, 1)
                .pattern(" #@")
                .pattern(" ! ")
                .pattern(" ! ")
                .input('#', Items.DIAMOND)
                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_WAR_PICK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_WHIP, 1)
                .pattern("  @")
                .pattern("%% ")
                .pattern("!  ")


                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .input('%', Items.STRING)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_WHIP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_DAGGER, 1)
                .pattern(" @ ")
                .pattern(" ! ")


                .input('@', Moditems.DIAMOND_SHARD)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_DAGGER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_GLAIVE, 1)
                .pattern("  #")
                .pattern(" !#")
                .pattern("!  ")
                .input('#', Items.DIAMOND)


                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_GLAIVE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.DIAMOND_DOUBLE_BLADED_SCIMITAR, 1)
                .pattern(" @ ")
                .pattern(" ! ")
                .pattern(" @ ")
                .input('@', Moditems.DIAMOND_SCIMITAR)
                .input('!', Items.STICK)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.DIAMOND_DOUBLE_BLADED_SCIMITAR)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_DAGGER),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_DAGGER).criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_dagger_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_CLUB),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_CLUB).criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_club_smithing"));


        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_GREATCLUB),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT, Moditems.NETHERITE_GREATCLUB)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_greatclub_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_HANDAXE),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_HANDAXE)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_handaxe_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_JAVELIN),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_JAVELIN)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_javelin_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_LIGHT_HAMMER),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_LIGHT_HAMMER)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_light_hammer_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_MACE),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_MACE)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_mace_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_QUARTERSTAFF),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_QUARTERSTAFF)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_quarterstaff_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_SICKLE),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_SICKLE)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_sickle_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_SPEAR),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_SPEAR)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_spear_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_BATTLEAXE),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_BATTLEAXE)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_battleaxe_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_FLAIL),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_FLAIL)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_flail_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_GLAIVE),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_GLAIVE)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_glaive_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_GREATAXE),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_GREATAXE)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_greataxe_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_GREATSWORD),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_GREATSWORD)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_greatsword_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_HALBERD),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_HALBERD)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_halberd_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_LANCE),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_LANCE)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_lance_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_LONGSWORD),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_LONGSWORD)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_longsword_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_MAUL),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_MAUL)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_maul_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_MORNINGSTAR),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_MORNINGSTAR)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_morningstar_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_PIKE),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_PIKE)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_pike_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.DIAMOND_RAPIER),
                Ingredient.ofItems(Items.NETHERITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.NETHERITE_RAPIER)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_rapier_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_SCIMITAR),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_SCIMITAR)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_scimitar_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_SHORTSWORD),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_SHORTSWORD)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_shortsword_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.DIAMOND_TRIDENT),
                Ingredient.ofItems(Items.NETHERITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.NETHERITE_TRIDENT)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_trident_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.DIAMOND_WAR_PICK),
                Ingredient.ofItems(Items.NETHERITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.NETHERITE_WAR_PICK)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_war_pick_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_CLUB),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_WARHAMMER)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_warhammer_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.DIAMOND_WHIP),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_WHIP)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_whip_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.NETHERITE_DOUBLE_BLADED_SCIMITAR),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.NETHERITE_DOUBLE_BLADED_SCIMITAR)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "netherite_double_bladed_scimitar_smithing"));


        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
            Ingredient.ofItems(Moditems.NETHERITE_DAGGER),
            Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
            RecipeCategory.COMBAT,
            Moditems.ADAMANTITE_DAGGER).criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
            .offerTo(exporter, new Identifier("dndinmc", "adamantite_dagger_smithing"));
    SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
            Ingredient.ofItems(Moditems.NETHERITE_CLUB),
            Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
            RecipeCategory.COMBAT,
            Moditems.ADAMANTITE_CLUB).criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
            .offerTo(exporter, new Identifier("dndinmc", "adamantite_club_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_GREATCLUB),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT, Moditems.ADAMANTITE_GREATCLUB)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_greatclub_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_HANDAXE),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_HANDAXE)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_handaxe_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_JAVELIN),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_JAVELIN)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_javelin_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_LIGHT_HAMMER),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_LIGHT_HAMMER)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_light_hammer_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_MACE),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_MACE)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_mace_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_QUARTERSTAFF),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_QUARTERSTAFF)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_quarterstaff_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_SICKLE),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_SICKLE)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_sickle_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_SPEAR),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_SPEAR)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_spear_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_BATTLEAXE),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_BATTLEAXE)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_battleaxe_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_FLAIL),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_FLAIL)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_flail_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_GLAIVE),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_GLAIVE)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_glaive_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_GREATAXE),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_GREATAXE)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_greataxe_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_GREATSWORD),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_GREATSWORD)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_greatsword_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_HALBERD),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_HALBERD)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_halberd_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_LANCE),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_LANCE)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_lance_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_LONGSWORD),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_LONGSWORD)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_longsword_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_MAUL),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_MAUL)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_maul_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_MORNINGSTAR),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_MORNINGSTAR)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_morningstar_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_PIKE),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_PIKE)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_pike_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_RAPIER),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_RAPIER)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_rapier_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_SCIMITAR),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_SCIMITAR)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_scimitar_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_SHORTSWORD),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_SHORTSWORD)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_shortsword_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_TRIDENT),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_TRIDENT)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_trident_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_WAR_PICK),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_WAR_PICK)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_war_pick_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_CLUB),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_WARHAMMER)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_warhammer_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Moditems.NETHERITE_WHIP),
                Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                RecipeCategory.COMBAT,
                Moditems.ADAMANTITE_WHIP)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_whip_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Moditems.ADAMANTITE_DOUBLE_BLADED_SCIMITAR),
                        Ingredient.ofItems(Moditems.ADAMANTITE_INGOT),
                        RecipeCategory.COMBAT,
                        Moditems.ADAMANTITE_DOUBLE_BLADED_SCIMITAR)
                .criterion(hasItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(Moditems.ADAMANTITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier("dndinmc", "adamantite_double_bladed_scimitar_smithing"));





    }

    private String hasItem(TagKey<Item> itemTagKey) {
        return "has_" + itemTagKey.id().toTranslationKey();
    }


}

