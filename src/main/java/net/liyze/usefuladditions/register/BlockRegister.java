package net.liyze.usefuladditions.register;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.liyze.usefuladditions.UsefulAdditions.*;
import static net.liyze.usefuladditions.api.register.Register.regBlocks;
import static net.liyze.usefuladditions.features.Quartzite.Blocks.*;

public abstract class BlockRegister {
    public static void registerBlocks() {
        regBlocks();
        if (cfg.enableQuartzite) {
            Registry.register(Registry.BLOCK, new Identifier(ID, "quartzite"), QUARTZITE_BLOCK);
            Registry.register(Registry.ITEM, new Identifier(ID, "quartzite"), QUARTZITE_ITEM);
        }
    }
}
