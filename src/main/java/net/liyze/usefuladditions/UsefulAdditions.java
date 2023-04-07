package net.liyze.usefuladditions;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.liyze.usefuladditions.util.Configuration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.liyze.usefuladditions.register.BlockRegister.registerBlocks;
import static net.liyze.usefuladditions.register.ItemRegister.registerItems;

public class UsefulAdditions implements ModInitializer {
    public static final String ID = "useful_additions";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(ID, "main"),
            () -> new ItemStack(net.minecraft.item.Items.BUCKET));

    public static Configuration CONFIG = new Configuration();
    public static final Logger LOGGER = LoggerFactory.getLogger("Useful Additions");

    public void onInitialize() {
        loadConfiguration();
        registerItems();
        registerBlocks();
    }

    protected void loadConfiguration() {
        CONFIG = Configuration.load();
    }
}
