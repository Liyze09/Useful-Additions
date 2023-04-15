package net.liyze.usefuladditions.block;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.liyze.usefuladditions.UsefulAdditions.CONFIG;
import static net.liyze.usefuladditions.UsefulAdditions.ID;
import static net.liyze.usefuladditions.block.BlockItemsConfiguration.QUARTZITE_ITEM;
import static net.liyze.usefuladditions.block.BlocksConfiguration.QUARTZITE_BLOCK;

public class BlockRegister {
    public static void registerBlocks() {
        if (CONFIG.isEnableQuartzite()) {
            Registry.register(Registry.BLOCK, new Identifier(ID, "quartzite"), QUARTZITE_BLOCK);
            Registry.register(Registry.ITEM, new Identifier(ID, "quartzite"), QUARTZITE_ITEM);
        }
    }
}
