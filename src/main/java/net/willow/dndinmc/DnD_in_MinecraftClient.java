package net.willow.dndinmc;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;
import net.willow.dndinmc.item.Moditems;
import net.willow.dndinmc.util.ModModelPredicateProvider;

public class DnD_in_MinecraftClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.RegisterModModels();

    }

}










