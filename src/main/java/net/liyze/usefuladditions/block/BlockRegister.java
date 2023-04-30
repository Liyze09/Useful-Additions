package net.liyze.usefuladditions.block;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.liyze.usefuladditions.UsefulAdditions.*;
import static net.liyze.usefuladditions.block.BlockItemsConfiguration.QUARTZITE_ITEM;
import static net.liyze.usefuladditions.block.BlocksConfiguration.QUARTZITE_BLOCK;

public abstract class BlockRegister {
    public static void registerBlocks() {
        if (cfg.enableQuartzite) {
            Registry.register(Registry.BLOCK, new Identifier(ID, "quartzite"), QUARTZITE_BLOCK);
            Registry.register(Registry.ITEM, new Identifier(ID, "quartzite"), QUARTZITE_ITEM);
        }
    }
}
