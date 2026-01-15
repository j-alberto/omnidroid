package com.jarojas.client.render.entity;

import com.jarojas.ProjectKronos;
import com.jarojas.client.model.entity.OmnidroidV1Model;
import com.jarojas.client.render.entity.state.OmnidroidRenderState;
import com.jarojas.world.entity.custom.OmnidroidV1Entity;

import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.EntityRendererFactory.Context;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class OmnidroidV1Renderer extends MobEntityRenderer<OmnidroidV1Entity,OmnidroidRenderState, OmnidroidV1Model> {

    private static final Identifier OMNI_V1_TEXTURE = Identifier.of(ProjectKronos.MOD_ID, "textures/entity/omnidroid_v1/omni1_base.png");

    public OmnidroidV1Renderer(Context context) {
        super(context, new OmnidroidV1Model(context.getPart(OmnidroidV1Model.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public Identifier getTexture(OmnidroidRenderState state) {
        return OMNI_V1_TEXTURE;
    }

    @Override
    public OmnidroidRenderState createRenderState() {
        return new OmnidroidRenderState();
    }

    @Override
    public void updateRenderState(OmnidroidV1Entity omnidroidV1Entity, OmnidroidRenderState omnidroidRenderState, float f) {
        super.updateRenderState(omnidroidV1Entity, omnidroidRenderState, f);
        omnidroidRenderState.idleAnimationState.copyFrom(omnidroidV1Entity.idleAnimationState); //el puente oficial entidad → render
    }

    @Override
    public void render(OmnidroidRenderState omnidroidRenderState, MatrixStack matrixStack,
            OrderedRenderCommandQueue orderedRenderCommandQueue, CameraRenderState cameraRenderState) {

        super.render(omnidroidRenderState, matrixStack, orderedRenderCommandQueue, cameraRenderState);
        ///manage custom rendering here
    }

    
    
}
