package com.jarojas.client.model.entity;

import com.jarojas.client.animation.entity.OmnidroidAnimations;
import com.jarojas.client.render.entity.state.OmnidroidRenderState;
import com.jarojas.world.entity.ModEntities;

import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class OmnidroidV1Model extends EntityModel<OmnidroidRenderState> {

    public static final EntityModelLayer LAYER_LOCATION = new EntityModelLayer( ModEntities.OMNIDROID_V1_ID, "main");

	private final Animation idleAnimation;

	private final ModelPart mob;
	private final ModelPart head;
	private final ModelPart arm_1;
	private final ModelPart arm_1_2;
	private final ModelPart arm_1_3;
	private final ModelPart arm_1_4;
	private final ModelPart arm_2;
	private final ModelPart arm_2_4;
	private final ModelPart arm_2_2;
	private final ModelPart arm_2_3;
	private final ModelPart chassis;
	private final ModelPart hand_1;
	private final ModelPart hand_2;
	private final ModelPart wheel_1;
	private final ModelPart wheel_2;

	public OmnidroidV1Model(ModelPart root) {
		super(root);
		this.mob = root.getChild("mob");
		this.head = this.mob.getChild("head");
		this.arm_1 = this.head.getChild("arm_1");
		this.arm_1_2 = this.arm_1.getChild("arm_1_2");
		this.arm_1_3 = this.arm_1_2.getChild("arm_1_3");
		this.arm_1_4 = this.arm_1_3.getChild("arm_1_4");
		this.hand_1 = this.arm_1_4.getChild("hand_1");
		this.arm_2 = this.head.getChild("arm_2");
		this.arm_2_4 = this.arm_2.getChild("arm_2_4");
		this.arm_2_2 = this.arm_2_4.getChild("arm_2_2");
		this.arm_2_3 = this.arm_2_2.getChild("arm_2_3");
		this.hand_2 = this.arm_2_3.getChild("hand_2");
		this.chassis = this.mob.getChild("chassis");
		this.wheel_1 = this.chassis.getChild("wheel_1");
		this.wheel_2 = this.chassis.getChild("wheel_2");

		idleAnimation = OmnidroidAnimations.IDLE.createAnimation(root);
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData mob = modelPartData.addChild("mob", ModelPartBuilder.create(), ModelTransform.of(0.75F, 11.3964F, -0.5F, 0.0F, -1.5708F, 0.0F));

		ModelPartData head = mob.addChild("head", ModelPartBuilder.create().uv(54, 81).cuboid(-6.0156F, -3.3649F, -6.9828F, 12.0F, 1.0F, 14.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-10.0156F, -14.6149F, -10.9828F, 20.0F, 1.0F, 22.0F, new Dilation(0.0F))
		.uv(0, 23).cuboid(-9.0156F, -15.6149F, -9.9828F, 18.0F, 1.0F, 20.0F, new Dilation(0.0F))
		.uv(0, 44).cuboid(-8.0156F, -16.6149F, -8.9828F, 16.0F, 1.0F, 18.0F, new Dilation(0.0F))
		.uv(0, 63).cuboid(-7.0156F, -17.6149F, -7.9828F, 14.0F, 1.0F, 16.0F, new Dilation(0.0F))
		.uv(84, 0).cuboid(-4.0156F, -18.6149F, -5.9828F, 8.0F, 1.0F, 12.0F, new Dilation(0.0F))
		.uv(106, 81).cuboid(-2.0156F, -10.3649F, 10.0172F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(106, 87).cuboid(-2.0156F, -10.3649F, -11.9828F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.origin(-0.7344F, 6.9685F, 0.4828F));

		ModelPartData h8_r1 = head.addChild("h8_r1", ModelPartBuilder.create().uv(70, 106).cuboid(-1.5F, -7.0F, -2.5F, 2.0F, 13.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(8.0825F, -7.2981F, -8.5808F, 0.2293F, 0.7581F, 0.3273F));

		ModelPartData h7_r1 = head.addChild("h7_r1", ModelPartBuilder.create().uv(82, 106).cuboid(0.0F, -6.5F, -2.75F, 2.0F, 13.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-7.6137F, -7.5481F, 9.6153F, -0.2293F, 0.7581F, -0.3273F));

		ModelPartData h6_r1 = head.addChild("h6_r1", ModelPartBuilder.create().uv(58, 106).cuboid(-0.75F, -6.75F, -2.0F, 2.0F, 13.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-7.6137F, -7.5481F, -8.5808F, 0.2293F, -0.7581F, -0.3273F));

		ModelPartData h5_r1 = head.addChild("h5_r1", ModelPartBuilder.create().uv(98, 96).cuboid(-1.25F, -6.75F, -2.0F, 2.0F, 13.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(7.5825F, -7.5481F, 8.6153F, -0.2293F, -0.7581F, 0.3273F));

		ModelPartData h4_r1 = head.addChild("h4_r1", ModelPartBuilder.create().uv(0, 80).cuboid(-12.0F, -2.0F, -7.0F, 13.0F, 2.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(-0.0156F, -2.3649F, -8.9828F, -1.5708F, -0.3054F, 1.5708F));

		ModelPartData h3_r1 = head.addChild("h3_r1", ModelPartBuilder.create().uv(76, 23).cuboid(-12.0F, -2.0F, -6.0F, 13.0F, 2.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(-1.0156F, -2.3649F, 9.0172F, 1.5708F, 0.3054F, 1.5708F));

		ModelPartData h2_r1 = head.addChild("h2_r1", ModelPartBuilder.create().uv(68, 44).cuboid(-12.0F, -2.25F, -8.0F, 13.0F, 2.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(-8.0156F, -2.3649F, 0.0172F, 0.0F, 0.0F, 1.2654F));

		ModelPartData h1_r1 = head.addChild("h1_r1", ModelPartBuilder.create().uv(60, 63).cuboid(-1.0F, -2.0F, -8.0F, 13.0F, 2.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(7.9844F, -2.3649F, 0.0172F, 0.0F, 0.0F, -1.2654F));

		ModelPartData arm_1 = head.addChild("arm_1", ModelPartBuilder.create().uv(24, 113).cuboid(-1.0F, -1.0F, -0.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.0156F, -8.3649F, 12.2672F, -0.1745F, 0.0F, 0.0F));

		ModelPartData arm_1_2 = arm_1.addChild("arm_1_2", ModelPartBuilder.create().uv(94, 113).cuboid(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.75F, -0.2182F, 0.0F, 0.0F));

		ModelPartData arm_1_3 = arm_1_2.addChild("arm_1_3", ModelPartBuilder.create().uv(102, 113).cuboid(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 2.0F, -0.2182F, 0.0F, 0.0F));

		ModelPartData arm_1_4 = arm_1_3.addChild("arm_1_4", ModelPartBuilder.create().uv(110, 113).cuboid(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 2.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData hand_1 = arm_1_4.addChild("hand_1", ModelPartBuilder.create().uv(14, 117).cuboid(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 117).cuboid(-1.0F, -2.0F, 1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(94, 117).cuboid(-1.0F, 1.0F, 1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 2.0F, -0.2182F, 0.0F, 0.0F));

		ModelPartData arm_2 = head.addChild("arm_2", ModelPartBuilder.create().uv(32, 114).cuboid(-1.0F, -1.0F, -1.75F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.0156F, -8.3649F, -12.2328F, 0.1745F, 0.0F, 0.0F));

		ModelPartData arm_2_4 = arm_2.addChild("arm_2_4", ModelPartBuilder.create().uv(40, 114).cuboid(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -1.75F, 0.2182F, 0.0F, 0.0F));

		ModelPartData arm_2_2 = arm_2_4.addChild("arm_2_2", ModelPartBuilder.create().uv(48, 114).cuboid(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -2.0F, 0.2182F, 0.0F, 0.0F));

		ModelPartData arm_2_3 = arm_2_2.addChild("arm_2_3", ModelPartBuilder.create().uv(116, 39).cuboid(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -2.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData hand_2 = arm_2_3.addChild("hand_2", ModelPartBuilder.create().uv(0, 117).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 117).cuboid(-1.0F, -2.0F, -3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(6, 117).cuboid(-1.0F, 1.0F, -3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -2.0F, 0.2182F, 0.0F, 0.0F));

		ModelPartData chassis = mob.addChild("chassis", ModelPartBuilder.create().uv(0, 96).cuboid(-0.5F, 2.083F, -8.0F, 1.0F, 1.0F, 16.0F, new Dilation(-0.001F))
		.uv(58, 96).cuboid(-1.5F, 1.333F, -3.5F, 3.0F, 2.0F, 7.0F, new Dilation(0.0F))
		.uv(84, 13).cuboid(-2.5F, 0.833F, -3.0F, 5.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.origin(-0.75F, 7.5634F, 0.5F));

		ModelPartData c_1_r1 = chassis.addChild("c_1_r1", ModelPartBuilder.create().uv(106, 13).cuboid(-2.0F, -2.0F, -3.1035F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F))
		.uv(34, 96).cuboid(-5.0F, -6.0F, -3.1035F, 10.0F, 12.0F, 2.0F, new Dilation(0.0F))
		.uv(78, 96).cuboid(-4.0F, -4.0F, -2.1035F, 8.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.0634F, 0.0F, -1.5708F, 0.0F, 0.0F));

		ModelPartData wheel_1 = chassis.addChild("wheel_1", ModelPartBuilder.create().uv(76, 39).cuboid(-1.0F, -2.4142F, 0.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.002F))
		.uv(50, 110).cuboid(-1.0F, 0.4142F, 0.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.002F)), ModelTransform.origin(0.0F, 2.6259F, 6.0F));

		ModelPartData cube_r1 = wheel_1.addChild("cube_r1", ModelPartBuilder.create().uv(108, 39).cuboid(0.9016F, -1.4874F, 6.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(92, 39).cuboid(0.9016F, -4.3159F, 6.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.6893F, -6.0F, 0.0F, 0.0F, 2.3562F));

		ModelPartData cube_r2 = wheel_1.addChild("cube_r2", ModelPartBuilder.create().uv(34, 110).cuboid(1.6893F, 0.4142F, 6.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.001F))
		.uv(100, 39).cuboid(1.6893F, -2.4142F, 6.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.001F)), ModelTransform.of(0.0F, -2.6893F, -6.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r3 = wheel_1.addChild("cube_r3", ModelPartBuilder.create().uv(42, 110).cuboid(0.9016F, 2.3159F, 6.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(84, 39).cuboid(0.9016F, -0.5126F, 6.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.6893F, -6.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData wheel_2 = chassis.addChild("wheel_2", ModelPartBuilder.create().uv(110, 93).cuboid(-1.0F, -2.4142F, -2.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.002F))
		.uv(110, 109).cuboid(-1.0F, 0.4142F, -2.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.002F)), ModelTransform.origin(0.0F, 2.6259F, -6.0F));

		ModelPartData cube_r4 = wheel_2.addChild("cube_r4", ModelPartBuilder.create().uv(16, 113).cuboid(0.9016F, -1.4874F, -8.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(110, 105).cuboid(0.9016F, -4.3159F, -8.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.6893F, 6.0F, 0.0F, 0.0F, 2.3562F));

		ModelPartData cube_r5 = wheel_2.addChild("cube_r5", ModelPartBuilder.create().uv(8, 113).cuboid(1.6893F, 0.4142F, -8.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.001F))
		.uv(110, 101).cuboid(1.6893F, -2.4142F, -8.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.001F)), ModelTransform.of(0.0F, -2.6893F, 6.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r6 = wheel_2.addChild("cube_r6", ModelPartBuilder.create().uv(0, 113).cuboid(0.9016F, 2.3159F, -8.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(110, 97).cuboid(0.9016F, -0.5126F, -8.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.6893F, 6.0F, 0.0F, 0.0F, 0.7854F));
		return TexturedModelData.of(modelData, 256, 256);
	}


    @Override
    public void setAngles(OmnidroidRenderState state) {
    	super.setAngles(state);

		this.idleAnimation.apply(state.idleAnimationState, state.age);

    }

}
