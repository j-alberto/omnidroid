package com.jarojas.world.entity.custom;

import org.jspecify.annotations.Nullable;

import com.jarojas.world.sound.ModSounds;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.RevengeGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

/**
 * Abstract base class for Omnidroid variants.
 * Provides a lightweight "pseudo-brain" with helper methods for goals.
 */
public abstract class OmnidroidBase extends HostileEntity {

    protected OmnidroidBase(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new MeleeAttackGoal(this, 1.0D, true));
        this.targetSelector.add(3, new RevengeGoal(this));
        
        this.goalSelector.add(4, new WanderAroundFarGoal(this, 3.2D));
        this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 32.0F));
        this.goalSelector.add(6, new LookAroundGoal(this));


        // Targeting
        this.targetSelector.add(0, new ActiveTargetGoal<>(
                this,
                PlayerEntity.class,
                true
        ));
    }


    @Override
    protected void playAttackSound() {
        playSound(ModSounds.MELEE_ATTACK1_SOUND_EVENT,4.0f,1.0F);
    }
 
    @Override
    protected void playHurtSound(DamageSource damageSource) {
        playSound(ModSounds.DAMAGE_SOUND_EVENT);
    }

    @Override
    protected @Nullable SoundEvent getAmbientSound() {
        return ModSounds.SCAN_SOUND_EVENT;
    }

    @Override
    public void playAmbientSound() {
        playSound(getAmbientSound(), 1.0F, 1.0F);
    }

    @Override
    protected SoundEvent getDeathSound() {
        return ModSounds.DEATH_SOUND_EVENT;
    }

}
