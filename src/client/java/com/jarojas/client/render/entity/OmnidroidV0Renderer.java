package com.jarojas.client.render.entity;

import com.jarojas.ProjectKronos;
import com.jarojas.client.model.entity.OmnidroidV0Model;
import com.jarojas.client.render.entity.state.OmnidroidRenderState;
import com.jarojas.world.entity.custom.OmnidroidV0Entity;

import net.minecraft.client.render.entity.EntityRendererFactory.Context;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class OmnidroidV0Renderer extends MobEntityRenderer<OmnidroidV0Entity,OmnidroidRenderState, OmnidroidV0Model> {

    private static final Identifier OMNI_V1_TEXTURE = Identifier.of(ProjectKronos.MOD_ID, "textures/entity/omnidroid_v0/cuboid.png");

    public OmnidroidV0Renderer(Context context) {
        this(context, new OmnidroidV0Model(context.getPart(OmnidroidV0Model.LAYER_LOCATION)), 0.5f);
    }

    
    public OmnidroidV0Renderer(Context context, OmnidroidV0Model entityModel, float f) {
        super(context, entityModel, f);
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
    public void render(OmnidroidRenderState omnidroidRenderState, MatrixStack matrixStack,
            OrderedRenderCommandQueue orderedRenderCommandQueue, CameraRenderState cameraRenderState) {
        
        super.render(omnidroidRenderState, matrixStack, orderedRenderCommandQueue, cameraRenderState);
        ///manage custom rendering here
    }

    
    
}
