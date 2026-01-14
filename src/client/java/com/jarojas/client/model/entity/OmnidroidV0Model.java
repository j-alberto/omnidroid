package com.jarojas.client.model.entity;

import com.jarojas.client.render.entity.state.OmnidroidRenderState;
import com.jarojas.world.entity.ModEntities;

import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.math.MathHelper;

public class OmnidroidV0Model extends EntityModel<OmnidroidRenderState> {

	public static final EntityModelLayer LAYER_LOCATION = new EntityModelLayer( ModEntities.OMNIDROID_V0_ID, "main");

	private final ModelPart mob;

	public OmnidroidV0Model(ModelPart root) {
		super(root);
		this.mob = root.getChild("mob");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData mob = modelPartData.addChild("mob", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.rotation(0.0F, 23.0F, 0.0F));
		return TexturedModelData.of(modelData, 16, 16);
	}


    @Override
    public void setAngles(OmnidroidRenderState state) {
       super.setAngles(state);
       this.setHeadAngles(state, state.relativeHeadYaw, state.pitch);

    }

   private void setHeadAngles(OmnidroidRenderState state, float headYaw, float headPitch) {
      headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
      headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

    //   this.head.yaw = headYaw * 0.017453292F;
    //   this.head.pitch = headPitch * 0.017453292F;
	  
   }


   }
