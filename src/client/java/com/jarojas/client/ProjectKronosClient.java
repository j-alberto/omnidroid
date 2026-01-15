package com.jarojas.client;

import static com.jarojas.ProjectKronos.LOGGER;

import com.jarojas.ProjectKronos;
import com.jarojas.client.model.entity.OmnidroidV0Model;
import com.jarojas.client.model.entity.OmnidroidV1Model;
import com.jarojas.client.render.entity.OmnidroidV0Renderer;
import com.jarojas.client.render.entity.OmnidroidV1Renderer;
import com.jarojas.world.entity.ModEntities;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.EntityRendererFactories;

public class ProjectKronosClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		LOGGER.info("Initializing Mod Client: " + ProjectKronos.MOD_ID);
		
		EntityModelLayerRegistry.registerModelLayer(OmnidroidV0Model.LAYER_LOCATION, OmnidroidV0Model::getTexturedModelData);
		EntityRendererFactories.register(ModEntities.OMNIDROID_V0, OmnidroidV0Renderer::new);

		EntityModelLayerRegistry.registerModelLayer(OmnidroidV1Model.LAYER_LOCATION, OmnidroidV1Model::getTexturedModelData);
		EntityRendererFactories.register(ModEntities.OMNIDROID_V1, OmnidroidV1Renderer::new);
		
	}
}