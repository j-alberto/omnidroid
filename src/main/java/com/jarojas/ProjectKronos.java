package com.jarojas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jarojas.world.entity.ModEntities;
import com.jarojas.world.entity.custom.OmnidroidV0Entity;
import com.jarojas.world.item.ModItems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ProjectKronos implements ModInitializer {
	public static final String MOD_ID = "projectkronos";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Initializing Mod: " + MOD_ID);

		ModItems.registerModItems();
		ModEntities.registerModEntities();

		FabricDefaultAttributeRegistry.register(ModEntities.OMNIDROID_V0, OmnidroidV0Entity.createOmnidroidV0Attributes());
	}
}