package net.liyze.usefuladditions.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public abstract class BlocksConfiguration {
    public static final Block QUARTZITE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.25F, 9));
}
