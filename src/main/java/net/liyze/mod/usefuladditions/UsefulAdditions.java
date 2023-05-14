package net.liyze.mod.usefuladditions;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.liyze.mod.usefuladditions.configuration.ConfigBean;
import net.liyze.mod.usefuladditions.resource.BRRP;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pers.solid.brrp.v1.api.RuntimeResourcePack;

import java.util.Random;

import static net.liyze.mod.usefuladditions.misc.WorldgenRegister.registerFeatures;
import static net.minecraft.item.Items.BUCKET;

public class UsefulAdditions implements ModInitializer {
    public static final String ID = "useful_additions";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(ID, "main"),
            () -> new ItemStack(BUCKET));

    public static final Logger LOGGER = LoggerFactory.getLogger("Useful Additions");
    public static final RuntimeResourcePack pack = RuntimeResourcePack.create(new Identifier(ID, "pack"));
    public static Random random = new Random();
    public static ConfigBean cfg;

    @Override
    public void onInitialize() {
        AutoConfig.register(ConfigBean.class, Toml4jConfigSerializer::new);
        cfg = AutoConfig.getConfigHolder(ConfigBean.class).getConfig();
        BRRP.registerRRP();
        registerFeatures();
        System.gc();
        LOGGER.info("Loaded all enabled features.");
    }
}
