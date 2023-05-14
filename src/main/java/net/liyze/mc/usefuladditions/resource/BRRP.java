package net.liyze.mc.usefuladditions.resource;

import pers.solid.brrp.v1.RRPEventHelper;

import static net.liyze.mc.usefuladditions.UsefulAdditions.pack;

public abstract class BRRP {
    public static void registerRRP() {
        pack.clearResources();
        Lang.generateLang();
        Tags.generateTags();
        RRPEventHelper.BEFORE_VANILLA.registerPack(pack);
    }
}
