package com.jarojas.model.entity;

import com.jarojas.render.entity.state.OmnidroidRenderState;
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
	private final ModelPart head;
	private final ModelPart skull;
	private final ModelPart body;
	private final ModelPart torso;
	private final ModelPart leg_front_left;
	private final ModelPart leg_front_left_2;
	private final ModelPart leg_front_lef_3;
	private final ModelPart leg_front_left_4;
	private final ModelPart leg_back_left;
	private final ModelPart leg_back_left_2;
	private final ModelPart leg_back_left_3;
	private final ModelPart leg_back_left_4;
	private final ModelPart leg_front_right;
	private final ModelPart leg_front_right_2;
	private final ModelPart leg_front_right_3;
	private final ModelPart leg_front_right_4;
	private final ModelPart leg_back_right;
	private final ModelPart leg_back_right_2;
	private final ModelPart leg_back_right_3;
	private final ModelPart leg_back_right_4;


	public OmnidroidV0Model(ModelPart root) {
		super(root);
		this.mob = root.getChild("mob");
		this.head = this.mob.getChild("head");
		this.skull = this.head.getChild("skull");
		this.body = this.mob.getChild("body");
		this.torso = this.body.getChild("torso");
		this.leg_front_left = this.body.getChild("leg_front_left");
		this.leg_front_left_2 = this.leg_front_left.getChild("leg_front_left_2");
		this.leg_front_lef_3 = this.leg_front_left_2.getChild("leg_front_lef_3");
		this.leg_front_left_4 = this.leg_front_lef_3.getChild("leg_front_left_4");
		this.leg_back_left = this.body.getChild("leg_back_left");
		this.leg_back_left_2 = this.leg_back_left.getChild("leg_back_left_2");
		this.leg_back_left_3 = this.leg_back_left_2.getChild("leg_back_left_3");
		this.leg_back_left_4 = this.leg_back_left_3.getChild("leg_back_left_4");
		this.leg_front_right = this.body.getChild("leg_front_right");
		this.leg_front_right_2 = this.leg_front_right.getChild("leg_front_right_2");
		this.leg_front_right_3 = this.leg_front_right_2.getChild("leg_front_right_3");
		this.leg_front_right_4 = this.leg_front_right_3.getChild("leg_front_right_4");
		this.leg_back_right = this.body.getChild("leg_back_right");
		this.leg_back_right_2 = this.leg_back_right.getChild("leg_back_right_2");
		this.leg_back_right_3 = this.leg_back_right_2.getChild("leg_back_right_3");
		this.leg_back_right_4 = this.leg_back_right_3.getChild("leg_back_right_4");
	}
	
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData mob = modelPartData.addChild("mob", ModelPartBuilder.create(), ModelTransform.rotation(0.0F, 0.0F, 0.0F));

		ModelPartData head = mob.addChild("head", ModelPartBuilder.create(), ModelTransform.rotation(0.0F, -5.0F, 0.0F));

		ModelPartData skull = head.addChild("skull", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -9.25F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 32).cuboid(-4.5F, -8.75F, -3.25F, 9.0F, 7.0F, 6.5F, new Dilation(0.0F))
		.uv(62, 56).cuboid(-5.0F, -8.0F, -2.5F, 10.0F, 5.5F, 5.0F, new Dilation(0.0F)), ModelTransform.rotation(0.0F, 0.0F, 0.0F));

		ModelPartData skull_r1 = skull.addChild("skull_r1", ModelPartBuilder.create().uv(64, 0).cuboid(-5.0F, -2.75F, -2.5F, 10.0F, 5.5F, 5.0F, new Dilation(0.0F))
		.uv(32, 14).cuboid(-4.5F, -3.5F, -3.25F, 9.0F, 7.0F, 6.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, -5.25F, 0.0F, 0.0F, -1.5708F, 1.5708F));

		ModelPartData skull_r2 = skull.addChild("skull_r2", ModelPartBuilder.create().uv(32, 56).cuboid(-5.0F, -2.75F, -2.5F, 10.25F, 5.5F, 5.0F, new Dilation(0.0F))
		.uv(32, 0).cuboid(-4.5F, -3.5F, -3.25F, 9.0F, 7.0F, 6.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, -5.25F, 0.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData body = mob.addChild("body", ModelPartBuilder.create(), ModelTransform.rotation(0.0F, 0.0179F, 0.0F));

		ModelPartData torso = body.addChild("torso", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -4.0179F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(32, 28).cuboid(-4.5F, -3.5179F, -3.25F, 9.0F, 7.0F, 6.5F, new Dilation(0.0F))
		.uv(64, 11).cuboid(-5.0F, -2.7679F, -2.5F, 10.0F, 5.5F, 5.0F, new Dilation(0.0F)), ModelTransform.rotation(0.0F, 0.0F, 0.0F));

		ModelPartData torso_r1 = torso.addChild("torso_r1", ModelPartBuilder.create().uv(64, 22).cuboid(-5.0F, -2.75F, -2.5F, 10.0F, 5.5F, 5.0F, new Dilation(0.0F))
		.uv(0, 46).cuboid(-4.5F, -3.5F, -3.25F, 9.0F, 7.0F, 6.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.0179F, 0.0F, 0.0F, -1.5708F, 1.5708F));

		ModelPartData torso_r2 = torso.addChild("torso_r2", ModelPartBuilder.create().uv(0, 60).cuboid(-5.0F, -2.75F, -2.5F, 10.25F, 5.5F, 5.0F, new Dilation(0.0F))
		.uv(32, 42).cuboid(-4.5F, -3.5F, -3.25F, 9.0F, 7.0F, 6.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.0179F, 0.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData leg_front_left = body.addChild("leg_front_left", ModelPartBuilder.create().uv(38, 67).cuboid(-0.3192F, -4.0019F, -0.5531F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.75F, 2.4643F, -4.0F, -3.1371F, -0.5673F, -3.1005F));

		ModelPartData leg_front_left_2 = leg_front_left.addChild("leg_front_left_2", ModelPartBuilder.create().uv(54, 67).cuboid(-0.4F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0808F, -4.0019F, -0.0531F, 0.0F, 0.0F, -0.3054F));

		ModelPartData leg_front_lef_3 = leg_front_left_2.addChild("leg_front_lef_3", ModelPartBuilder.create().uv(58, 67).cuboid(-0.4F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -2.0508F));

		ModelPartData leg_front_left_4 = leg_front_lef_3.addChild("leg_front_left_4", ModelPartBuilder.create().uv(64, 33).cuboid(-0.4F, -10.0F, -0.5F, 1.0F, 10.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		ModelPartData leg_back_left = body.addChild("leg_back_left", ModelPartBuilder.create().uv(42, 67).cuboid(-0.3192F, -4.0019F, -0.4469F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.75F, 2.4643F, 4.0F, 3.1371F, 0.5673F, -3.1005F));

		ModelPartData leg_back_left_2 = leg_back_left.addChild("leg_back_left_2", ModelPartBuilder.create().uv(62, 67).cuboid(-0.4F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0808F, -4.0019F, 0.0531F, 0.0F, 0.0F, -0.3054F));

		ModelPartData leg_back_left_3 = leg_back_left_2.addChild("leg_back_left_3", ModelPartBuilder.create().uv(66, 67).cuboid(-0.4F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -2.0508F));

		ModelPartData leg_back_left_4 = leg_back_left_3.addChild("leg_back_left_4", ModelPartBuilder.create().uv(64, 44).cuboid(-0.4F, -10.0F, -0.5F, 1.0F, 10.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		ModelPartData leg_front_right = body.addChild("leg_front_right", ModelPartBuilder.create().uv(46, 67).cuboid(-0.6808F, -4.0019F, -0.5531F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.75F, 2.4643F, -4.0F, -3.1371F, 0.5673F, 3.1005F));

		ModelPartData leg_front_right_2 = leg_front_right.addChild("leg_front_right_2", ModelPartBuilder.create().uv(68, 33).cuboid(-0.6F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0808F, -4.0019F, -0.0531F, 0.0F, 0.0F, 0.3054F));

		ModelPartData leg_front_right_3 = leg_front_right_2.addChild("leg_front_right_3", ModelPartBuilder.create().uv(68, 37).cuboid(-0.6F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 2.0508F));

		ModelPartData leg_front_right_4 = leg_front_right_3.addChild("leg_front_right_4", ModelPartBuilder.create().uv(30, 67).cuboid(-0.6F, -10.0F, -0.5F, 1.0F, 10.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		ModelPartData leg_back_right = body.addChild("leg_back_right", ModelPartBuilder.create().uv(50, 67).cuboid(-0.6808F, -4.0019F, -0.4469F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.75F, 2.4643F, 4.0F, 3.1371F, -0.5673F, 3.1005F));

		ModelPartData leg_back_right_2 = leg_back_right.addChild("leg_back_right_2", ModelPartBuilder.create().uv(68, 41).cuboid(-0.6F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0808F, -4.0019F, 0.0531F, 0.0F, 0.0F, 0.3054F));

		ModelPartData leg_back_right_3 = leg_back_right_2.addChild("leg_back_right_3", ModelPartBuilder.create().uv(68, 45).cuboid(-0.6F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 2.0508F));

		ModelPartData leg_back_right_4 = leg_back_right_3.addChild("leg_back_right_4", ModelPartBuilder.create().uv(34, 67).cuboid(-0.6F, -10.0F, -0.5F, 1.0F, 10.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.4363F));
		return TexturedModelData.of(modelData, 128, 128);
	}


    @Override
    public void setAngles(OmnidroidRenderState state) {
       super.setAngles(state);
       this.setHeadAngles(state, state.relativeHeadYaw, state.pitch);

    }

   private void setHeadAngles(OmnidroidRenderState state, float headYaw, float headPitch) {
      headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
      headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

      this.head.yaw = headYaw * 0.017453292F;
      this.head.pitch = headPitch * 0.017453292F;
	  
   }


   }
