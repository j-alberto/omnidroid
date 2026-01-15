package com.jarojas.world.entity.custom;

import net.minecraft.entity.AnimationState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class OmnidroidV1Entity extends OmnidroidBase {

    public static final float SCALE = 3.0f;

    public final AnimationState idleAnimationState = new AnimationState();

    public OmnidroidV1Entity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createOmnidroidAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.MAX_HEALTH, 80.0)
                .add(EntityAttributes.ATTACK_DAMAGE, 4)
                .add(EntityAttributes.MOVEMENT_SPEED, 0.4)
                .add(EntityAttributes.ARMOR, 2.0)
                .add(EntityAttributes.SCALE, SCALE)
                .add(EntityAttributes.FOLLOW_RANGE, 8.0); //matching with LookAtEntityGoal's range
    }

    @Override
    public void tick() {
        super.tick();

        updateAnimations();
    }

    private void updateAnimations() {
        if (!this.isMovingHorizontally()) {
            this.idleAnimationState.startIfNotRunning(this.age);
        } else {
            this.idleAnimationState.stop();
        }
	}

    @Override
	protected Entity.MoveEffect getMoveEffect() {
		return Entity.MoveEffect.NONE;
	}
 }
