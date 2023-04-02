package net.liyze.usefuladditions;

import net.fabricmc.api.ModInitializer;
import net.liyze.usefuladditions.util.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.liyze.usefuladditions.item.Register.registerItems;

public class UsefulAdditions implements ModInitializer {
    public static final String ID = "useful_additions";
    public static Configuration CONFIG = new Configuration();
    public static final Logger LOGGER = LoggerFactory.getLogger("Useful Additions");

    private void loadConfiguration() {
        Configuration CONFIG = Configuration.load();
    }

    public void onInitialize() {
        loadConfiguration();
        registerItems();
    }
}
