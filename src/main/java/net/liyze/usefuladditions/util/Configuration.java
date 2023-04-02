package net.liyze.usefuladditions.util;

import com.google.gson.GsonBuilder;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;

import static net.liyze.usefuladditions.UsefulAdditions.*;

public final class Configuration {
    private static final File CONFIG_FILE = new File(FabricLoader.getInstance().getConfigDir().toFile(), "useful_additions.json");

    public boolean enableMiniIngots = true;
    public boolean enableCopperTools = true;

    public Configuration() {
    }

    public static Configuration load() {
        Configuration configuration = new Configuration();
        if (!CONFIG_FILE.exists()) {
            save(configuration);
        }
        Reader reader;
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

    public boolean isEnableMiniIngots() {
        return enableMiniIngots;
    }
    public boolean isEnableCopperTools() {
        return enableCopperTools;
    }
}
