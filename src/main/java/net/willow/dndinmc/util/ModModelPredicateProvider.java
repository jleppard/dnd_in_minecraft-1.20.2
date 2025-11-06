package net.willow.dndinmc.util;

import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.willow.dndinmc.DnD_in_Minecraft;
import net.willow.dndinmc.item.Moditems;

public class ModModelPredicateProvider {
    public static void RegisterModModels(){
registerBow(Moditems.WOODEN_LONGBOW);
registerBow(Moditems.WOODEN_SHORTBOW);
registerBow(Moditems.WOODEN_SLING);
registerBow(Moditems.STONE_LONGBOW);
registerBow(Moditems.STONE_SHORTBOW);
registerBow(Moditems.STONE_SLING);
registerBow(Moditems.IRON_LONGBOW);
registerBow(Moditems.IRON_SHORTBOW);
registerBow(Moditems.IRON_SLING);
registerBow(Moditems.GOLD_LONGBOW);
registerBow(Moditems.GOLD_SHORTBOW);
registerBow(Moditems.GOLD_SLING);
registerBow(Moditems.DIAMOND_LONGBOW);
registerBow(Moditems.DIAMOND_SHORTBOW);
registerBow(Moditems.DIAMOND_SLING);
registerBow(Moditems.NETHERITE_LONGBOW);
registerBow(Moditems.NETHERITE_SHORTBOW);
registerBow(Moditems.NETHERITE_SLING);
registerBow(Moditems.ADAMANTITE_LONGBOW);
registerBow(Moditems.ADAMANTITE_SHORTBOW);
registerBow(Moditems.ADAMANTITE_SLING);
    }
    private static void registerBow(Item bow) {
        ModelPredicateProviderRegistry.register(bow, new Identifier("pull"), (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0f;
            }
            if (entity.getActiveItem() != stack) {
                return 0.0f;
            }
            return (float)(stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0f;
        });
        ModelPredicateProviderRegistry.register(bow, new Identifier("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);
        
}}
