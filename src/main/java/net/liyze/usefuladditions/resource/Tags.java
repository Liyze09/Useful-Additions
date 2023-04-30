package net.liyze.usefuladditions.resource;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import pers.solid.brrp.v1.tag.IdentifiedTagBuilder;

import static net.liyze.usefuladditions.UsefulAdditions.*;
import static net.liyze.usefuladditions.item.ItemsConfiguration.*;

public abstract class Tags {
    public static void generateTags() {
        IdentifiedTagBuilder<Item> pickaxes = IdentifiedTagBuilder.createItem(new Identifier("fabric", "pickaxes"));
        IdentifiedTagBuilder<Item> axes = IdentifiedTagBuilder.createItem(new Identifier("fabric", "axes"));
        IdentifiedTagBuilder<Item> hoes = IdentifiedTagBuilder.createItem(new Identifier("fabric", "hoes"));
        IdentifiedTagBuilder<Item> shovels = IdentifiedTagBuilder.createItem(new Identifier("fabric", "shovels"));
        IdentifiedTagBuilder<Item> swords = IdentifiedTagBuilder.createItem(new Identifier("fabric", "swords"));
        if (cfg.enableCopperTools) {
            pickaxes = IdentifiedTagBuilder.createItem(new Identifier("fabric", "pickaxes"))
                    .add(COPPER_PICKAXE);
            axes = IdentifiedTagBuilder.createItem(new Identifier("fabric", "axes"))
                    .add(COPPER_AXE);
            hoes = IdentifiedTagBuilder.createItem(new Identifier("fabric", "hoes"))
                    .add(COPPER_HOE);
            shovels = IdentifiedTagBuilder.createItem(new Identifier("fabric", "shovels"))
                    .add(COPPER_SHOVEL);
            swords = IdentifiedTagBuilder.createItem(new Identifier("fabric", "swords"))
                    .add(COPPER_SWORD);
        }
        if (cfg.enableIceTools) {
            pickaxes = IdentifiedTagBuilder.createItem(new Identifier("fabric", "pickaxes"))
                    .add(ICE_PICKAXE);
            axes = IdentifiedTagBuilder.createItem(new Identifier("fabric", "axes"))
                    .add(ICE_AXE);
            hoes = IdentifiedTagBuilder.createItem(new Identifier("fabric", "hoes"))
                    .add(ICE_HOE);
            shovels = IdentifiedTagBuilder.createItem(new Identifier("fabric", "shovels"))
                    .add(ICE_SHOVEL);
            swords = IdentifiedTagBuilder.createItem(new Identifier("fabric", "swords"))
                    .add(ICE_SWORD);
        }
        pack.addTag(pickaxes);
        pack.addTag(axes);
        pack.addTag(hoes);
        pack.addTag(shovels);
        pack.addTag(swords);
    }
}
