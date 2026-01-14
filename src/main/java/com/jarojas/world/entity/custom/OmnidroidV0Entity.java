package com.jarojas.world.entity.custom;

import net.minecraft.block.entity.ShulkerBoxBlockEntity.AnimationStage;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class OmnidroidV0Entity extends OmnidroidBase {
     


    public OmnidroidV0Entity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createOmnidroidV0Attributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.MAX_HEALTH, 20.0)
                .add(EntityAttributes.MOVEMENT_SPEED, 0.45)
                .add(EntityAttributes.ARMOR, 2.0)
                .add(EntityAttributes.FOLLOW_RANGE, 4.0);
    }

    private void setUpAnimationStates() {
        // Placeholder for animation state setup
    }

    @Override
    public void tick() {
        // TODO Auto-generated method stub
        super.tick();
    }

    AnimationStage getAnimationStage() {
        // TODO Auto-generated method stub
        return null;
    }
 }
