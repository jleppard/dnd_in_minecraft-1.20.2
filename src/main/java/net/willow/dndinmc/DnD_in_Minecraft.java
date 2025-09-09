package net.willow.dndinmc;

import net.fabricmc.api.ModInitializer;

import net.willow.dndinmc.Block.ModBlocks;
import net.willow.dndinmc.item.ModItemGroups;
import net.willow.dndinmc.item.Moditems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DnD_in_Minecraft implements ModInitializer {
    public static final String MOD_ID = "dnd_in_minecraft";


    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();

        Moditems.registerModItems();
        ModBlocks.registerModBlocks();



    }
}