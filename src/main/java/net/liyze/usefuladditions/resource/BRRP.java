package net.liyze.usefuladditions.resource;

import pers.solid.brrp.v1.RRPEventHelper;

import static net.liyze.usefuladditions.UsefulAdditions.pack;
import static net.liyze.usefuladditions.resource.Lang.generateLang;
import static net.liyze.usefuladditions.resource.Tags.generateTags;

public class BRRP {
    public static void registerRRP() {
        pack.clearResources();
        generateLang();
        generateTags();
        RRPEventHelper.BEFORE_VANILLA.registerPack(pack);
    }
}
