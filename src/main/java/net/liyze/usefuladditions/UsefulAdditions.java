package net.liyze.usefuladditions;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.liyze.usefuladditions.configuration.ConfigBean;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pers.solid.brrp.v1.api.RuntimeResourcePack;

import java.util.Random;

import static net.liyze.usefuladditions.register.BlockRegister.registerBlocks;
import static net.liyze.usefuladditions.register.EnchantmentRegister.registerEnchantments;
import static net.liyze.usefuladditions.register.ItemRegister.registerItems;
import static net.liyze.usefuladditions.register.WorldgenRegister.registerFeatures;
import static net.liyze.usefuladditions.resource.BRRP.registerRRP;

public class UsefulAdditions implements ModInitializer {
    public static final String ID = "useful_additions";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(ID, "main"),
            () -> new ItemStack(net.minecraft.item.Items.BUCKET));

    public static final Logger LOGGER = LoggerFactory.getLogger("Useful Additions");
    public static final RuntimeResourcePack pack = RuntimeResourcePack.create(new Identifier(ID, "pack"));
    public static Random random = new Random();
    public static ConfigBean cfg;

    @Override
    public void onInitialize() {
        AutoConfig.register(ConfigBean.class, GsonConfigSerializer::new);
        cfg = AutoConfig.getConfigHolder(ConfigBean.class).getConfig();
        registerItems();
        registerBlocks();
        registerRRP();
        registerEnchantments();
        registerFeatures();
        System.gc();
        LOGGER.info("Loaded all enabled features.");
    }
}
