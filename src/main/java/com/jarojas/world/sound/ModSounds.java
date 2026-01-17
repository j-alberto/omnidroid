package com.jarojas.world.sound;

import static com.jarojas.ProjectKronos.LOGGER;
import static com.jarojas.ProjectKronos.MOD_ID;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static SoundEvent SCAN_SOUND_EVENT = registerSoundEvent("omni_scan");
    public static SoundEvent DAMAGE_SOUND_EVENT = registerSoundEvent("omni_damage");
    public static SoundEvent LASER_SOUND_EVENT = registerSoundEvent("omni_laser");
    public static SoundEvent MELEE_ATTACK1_SOUND_EVENT = registerSoundEvent("omni_melee_attack1");
    public static SoundEvent DEATH_SOUND_EVENT = registerSoundEvent("omni_death");

    public static void registerModSounds() {
        LOGGER.info("Registering Sounds for " + MOD_ID);
    }

    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(MOD_ID, name);
		 return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}
