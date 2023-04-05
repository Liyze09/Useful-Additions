package net.liyze.usefuladditions;

import net.fabricmc.api.ModInitializer;
import net.liyze.usefuladditions.util.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.liyze.usefuladditions.item.ItemRegister.registerItems;

public class UsefulAdditions implements ModInitializer {
    public static final String ID = "useful_additions";
    public static Configuration CONFIG = new Configuration();
    public static final Logger LOGGER = LoggerFactory.getLogger("Useful Additions");

    public void onInitialize() {
        loadConfiguration();
        registerItems();
    }

    protected void loadConfiguration() {
        CONFIG = Configuration.load();
    }
}
