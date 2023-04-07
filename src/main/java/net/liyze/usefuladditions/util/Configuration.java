/*
 * Used code from Farmer's Delight Fabric by newhoryzon
 * under MIT License.
 * */
package net.liyze.usefuladditions.util;

import com.google.gson.GsonBuilder;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;

import static net.liyze.usefuladditions.UsefulAdditions.LOGGER;

@SuppressWarnings({"FieldCanBeLocal", "FieldMayBeFinal"})
public final class Configuration {
    private static final File CONFIG_FILE = new File(FabricLoader.getInstance().getConfigDir().toFile(), "useful_additions.json");
    /*Settings*/
    private boolean enableMiniIngots = true;
    private boolean enableCopperTools = true;
    private boolean enableCopperArmors = true;
    private boolean enableIceTools = true;
    private boolean enableQuartize = true;

    public Configuration() {
    }

    public static Configuration load() {
        Configuration configuration = new Configuration();
        //Create config file there.
        if (!CONFIG_FILE.exists()) {
            save(configuration);
        }
        Reader reader;
        //Try to read configure.
        try {
            reader = Files.newBufferedReader(CONFIG_FILE.toPath());
            configuration = (new GsonBuilder().setPrettyPrinting().create()).fromJson(reader, Configuration.class);
            reader.close();
        } catch (IOException e) {
            LOGGER.error("Failed to load configuration file. Used default configuration.", e);
        }
        return configuration;
    }

    public static void save(Configuration config) {
        try {
            Writer writer = Files.newBufferedWriter(CONFIG_FILE.toPath());
            (new GsonBuilder().setPrettyPrinting().create()).toJson(config, writer);
            LOGGER.info("Creating the configuration file");
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Failed to save configuration file.", e);
        }
    }

    /*Methods to read settings*/
    public boolean isEnableMiniIngots() {
        return enableMiniIngots;
    }

    public boolean isEnableCopperTools() {
        return enableCopperTools;
    }

    public boolean isEnableCopperArmors() {
        return enableCopperArmors;
    }

    public boolean isEnableIceTools() {
        return enableIceTools;
    }

    public boolean isEnableQuartize() {
        return enableQuartize;
    }
}
