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

import static net.liyze.usefuladditions.block.BlockRegister.registerBlocks;
import static net.liyze.usefuladditions.enchantments.EnchantmentRegister.registerEnchantments;
import static net.liyze.usefuladditions.item.ItemRegister.registerItems;
import static net.liyze.usefuladditions.resource.BRRP.registerRRP;
import static net.liyze.usefuladditions.worldgen.WorldgenRegister.registerFeatures;

public class UsefulAdditions implements ModInitializer {
    public static final String ID = "useful_additions";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(ID, "main"),
            () -> new ItemStack(net.minecraft.item.Items.BUCKET));
    public static ConfigBean config = AutoConfig.getConfigHolder(ConfigBean.class).getConfig();
    public static final Logger LOGGER = LoggerFactory.getLogger("Useful Additions");
    public static final RuntimeResourcePack pack = RuntimeResourcePack.create(new Identifier(ID, "pack"));
    public static Random random = new Random();

    public void onInitialize() {
        AutoConfig.register(ConfigBean.class, GsonConfigSerializer::new);
        registerItems();
        registerBlocks();
        registerRRP();
        registerEnchantments();
        registerFeatures();
        System.gc();
        LOGGER.info("Loaded all enabled features.");
    }


}
