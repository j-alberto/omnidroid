package com.jarojas.world.item;

import com.jarojas.Projectkronos;
import com.jarojas.world.entity.ModEntities;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // public static final Item OMNIDROID_SPAWN_EGG = registerItem(
    //     "omnidroid_v0_spawn_egg", 
    //     new SpawnEggItem(new Item.Settings().spawnEgg(ModEntities.OMNIDROID_V0))
    //     );





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Projectkronos.MOD_ID, name), item);
    }


    public static void registerModItems() {
        // Projectkronos.LOGGER.info("Registering Mod Items for " + Projectkronos.MOD_ID);

        // ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(entries -> {
        //     entries.add(OMNIDROID_SPAWN_EGG);
        // });
    }
}
