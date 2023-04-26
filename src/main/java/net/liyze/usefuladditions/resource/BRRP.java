package net.liyze.usefuladditions.resource;

import pers.solid.brrp.v1.RRPEventHelper;

import static net.liyze.usefuladditions.UsefulAdditions.pack;
import static net.liyze.usefuladditions.resource.Lang.enUSLang;

public class BRRP {
    public static void registerRRP() {
        enUSLang();
        RRPEventHelper.BEFORE_VANILLA.registerPack(pack);
    }
}
