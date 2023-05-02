package net.liyze.usefuladditions.features.Coffee;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

import static net.liyze.usefuladditions.features.Coffee.Blocks.COFFEE_CROP_BLOCK;

@Environment(EnvType.CLIENT)
public class CoffeeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), COFFEE_CROP_BLOCK);
    }
}
