package com.beliondev.belion_vanilla_weapons.items;

import com.beliondev.belion_vanilla_weapons.Main;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;

public class Weapons {

    // Método reutilizable para crear espadas
    public static Item createSword(String name, Tiers tier, int damage, float speed) {
        Item sword = new SwordItem(
                tier,
                damage, // Daño base
                speed, // Velocidad de ataque
                new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
        ).setRegistryName(Main.MODID, name); // Referencia a MODID desde la clase Main
        return sword;
    }

}