package net.liyze.mod.uapi.ub.builders;

import net.liyze.mod.uapi.ub.UB;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class UArmorItem extends ArmorItem implements UB {
    public UArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    public UArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings, Identifier identifier, @NotNull Boolean isEnable) {
        super(material, slot, settings);
        if (isEnable) Registry.register(Registry.ITEM, identifier, this.asItem());
        id = identifier.toString();
    }

    private String id;

    @Override
    public String getNamespace() {
        return id;
    }
}
