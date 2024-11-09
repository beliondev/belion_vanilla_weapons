package com.beliondev.belion_vanilla_weapons.items;

import com.beliondev.belion_vanilla_weapons.Main;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    @SubscribeEvent
    public static void createSwordWood(RegistryEvent.Register<Item> event) {
        // Uso de un nombre de registro en minúsculas y sin espacios
        event.getRegistry().register(Weapons.createSword(
                "espada_madera_reforzada", // Nombre de registro corregido
                Tiers.WOOD,
                5,
                -2.0F
        ));
    }

    @SubscribeEvent
    public static void createSwordStone(RegistryEvent.Register<Item> event) {
        // Uso de un nombre de registro en minúsculas y sin espacios
        event.getRegistry().register(Weapons.createSword(
                "espada_piedra_reforzada", // Nombre de registro corregido
                Tiers.STONE,
                6,
                -2.0F
        ));
    }

    @SubscribeEvent
    public static void createSwordIron(RegistryEvent.Register<Item> event) {
        // Uso de un nombre de registro en minúsculas y sin espacios
        event.getRegistry().register(Weapons.createSword(
                "espada_hierro_reforzada", // Nombre de registro corregido
                Tiers.IRON,
                8,
                -2.0F
        ));
    }

    @SubscribeEvent
    public static void createDiamondIron(RegistryEvent.Register<Item> event) {
        // Uso de un nombre de registro en minúsculas y sin espacios
        event.getRegistry().register(Weapons.createSword(
                "espada_diamante_reforzada", // Nombre de registro corregido
                Tiers.DIAMOND,
                10,
                -2.0F
        ));
    }
}
