package com.jarojas.world.entity;

import static com.jarojas.Projectkronos.LOGGER;
import static com.jarojas.Projectkronos.MOD_ID;

import com.jarojas.world.entity.custom.OmnidroidV0Entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final Identifier OMNIDROID_V0_ID =  Identifier.of(MOD_ID, "omnidroid_v0");

    public static final EntityType<OmnidroidV0Entity> OMNIDROID_V0 = Registry.register(
            Registries.ENTITY_TYPE,
            OMNIDROID_V0_ID,
            EntityType.Builder.create(OmnidroidV0Entity::new, SpawnGroup.MONSTER)
                    .dimensions(0.7f, 1.25f)
                    
                    .build(RegistryKey.of(Registries.ENTITY_TYPE.getKey(), OMNIDROID_V0_ID)));
    

    public static void registerModEntities() {
        
        LOGGER.info("Registering Mod Entities for " + MOD_ID);
    }
} 
