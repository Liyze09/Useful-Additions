package net.liyze.usefuladditions.resource;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import pers.solid.brrp.v1.tag.IdentifiedTagBuilder;

import static net.liyze.usefuladditions.UsefulAdditions.*;
import static net.liyze.usefuladditions.block.BlocksConfiguration.QUARTZITE_BLOCK;
import static net.liyze.usefuladditions.item.ItemsConfiguration.*;

abstract class Tags {
    static void generateTags() {
        String MC = "minecraft";
        String FAB = "fabric";
        IdentifiedTagBuilder<Item> pickaxes = IdentifiedTagBuilder.createItem(new Identifier(FAB, "pickaxes"));
        IdentifiedTagBuilder<Item> axes = IdentifiedTagBuilder.createItem(new Identifier(FAB, "axes"));
        IdentifiedTagBuilder<Item> hoes = IdentifiedTagBuilder.createItem(new Identifier(FAB, "hoes"));
        IdentifiedTagBuilder<Item> shovels = IdentifiedTagBuilder.createItem(new Identifier(FAB, "shovels"));
        IdentifiedTagBuilder<Item> swords = IdentifiedTagBuilder.createItem(new Identifier(FAB, "swords"));
        IdentifiedTagBuilder<Block> mpickaxe = IdentifiedTagBuilder.createBlock(new Identifier(MC, "mineable/pickaxe"));
        IdentifiedTagBuilder<Block> mstone = IdentifiedTagBuilder.createBlock(new Identifier(MC, "needs_stone_tool"));
        if (cfg.enableCopperTools) {
            pickaxes.add(COPPER_PICKAXE);
            axes.add(COPPER_AXE);
            hoes.add(COPPER_HOE);
            shovels.add(COPPER_SHOVEL);
            swords.add(COPPER_SWORD);
        }
        if (cfg.enableIceTools) {
            pickaxes.add(ICE_PICKAXE);
            axes.add(ICE_AXE);
            hoes.add(ICE_HOE);
            shovels.add(ICE_SHOVEL);
            swords.add(ICE_SWORD);
        }
        if (cfg.enableQuartzite) {
            mpickaxe.add(QUARTZITE_BLOCK);
            mstone.add(QUARTZITE_BLOCK);
        }
        pack.addTag(pickaxes);
        pack.addTag(axes);
        pack.addTag(hoes);
        pack.addTag(shovels);
        pack.addTag(swords);
        pack.addTag(mpickaxe);
        pack.addTag(mstone);
    }
}
