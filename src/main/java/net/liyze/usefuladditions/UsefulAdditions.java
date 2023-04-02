package net.liyze.usefuladditions;

import net.fabricmc.api.ModInitializer;
import net.liyze.usefuladditions.util.Configuration;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.liyze.usefuladditions.item.Items.*;

public class UsefulAdditions implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Useful Additions");
    public static final String ID = "useful_additions";
    public static Configuration CONFIG = new Configuration();

    private void loadConfiguration() {
        CONFIG = Configuration.load();
    }

    public void onInitialize() {
        loadConfiguration();
        if (CONFIG.isEnableMiniIngots()) {
            Registry.register(Registry.ITEM, new Identifier(ID, "mini_gold_ingot"), MINI_GOLD_INGOT);
            Registry.register(Registry.ITEM, new Identifier(ID, "mini_iron_ingot"), MINI_IRON_INGOT);
            Registry.register(Registry.ITEM, new Identifier(ID, "mini_redstone_block"), MINI_REDSTONE_BLOCK);
            Registry.register(Registry.ITEM, new Identifier(ID, "mini_lapis_lazuli_block"), MINI_LAPIS_LAZULI_BLOCK);
        }
        if (CONFIG.isEnableCopperTools()) {
            Registry.register(Registry.ITEM,new Identifier(ID,"copper_pickaxe"),COPPER_PICKAXE);
            Registry.register(Registry.ITEM,new Identifier(ID,"copper_sword"),COPPER_SWORD);
            Registry.register(Registry.ITEM,new Identifier(ID,"copper_axe"),COPPER_AXE);
            Registry.register(Registry.ITEM,new Identifier(ID,"copper_hoe"),COPPER_HOE);
            Registry.register(Registry.ITEM,new Identifier(ID,"copper_shovel"),COPPER_SHOVEL);
        }
    }
}
