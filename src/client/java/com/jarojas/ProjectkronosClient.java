package com.jarojas;

import static com.jarojas.Projectkronos.LOGGER;

import com.jarojas.model.entity.OmnidroidV0Model;
import com.jarojas.render.entity.OmnidroidV0Renderer;
import com.jarojas.world.entity.ModEntities;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.EntityRendererFactories;

public class ProjectkronosClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		LOGGER.info("Initializing Mod Client: " + Projectkronos.MOD_ID);
		
		EntityModelLayerRegistry.registerModelLayer(OmnidroidV0Model.LAYER_LOCATION, OmnidroidV0Model::getTexturedModelData);
		EntityRendererFactories.register(ModEntities.OMNIDROID_V0, OmnidroidV0Renderer::new);

		
	}
}