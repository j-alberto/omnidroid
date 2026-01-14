package com.jarojas.world.entity.custom;

import com.jarojas.world.entity.ai.OmnidroidLookAtPlayerGoal;
import com.jarojas.world.entity.ai.OmnidroidMeleeAttackGoal;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

/**
 * Abstract base class for Omnidroid variants.
 * Provides a lightweight "pseudo-brain" with helper methods for goals.
 */
public abstract class OmnidroidBase extends HostileEntity {

    protected OmnidroidBase(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected void initGoals() {
        goalSelector.add(0, new OmnidroidMeleeAttackGoal());
        goalSelector.add(1, new OmnidroidLookAtPlayerGoal());
    }

    // @Override
    // protected void registerGoals() {
    //     // Default goals can be added by derived classes.
    // }
    

    // /**
    //  * Helper to add adaptive goals at runtime from variants.
    //  */
    // public void addAdaptiveGoal(int priority, Goal goal) {
    //     // this.goalSelector.add(priority, goal);
    // }

    // /**
    //  * High-level decision tick called each entity tick.
    //  * Variants may override to implement mode switches or state transitions.
    //  */
    // protected void tickBrain() {
    //     // placeholder for adaptive logic
    // }

    // @Override
    // public void tick() {
    //     super.tick();
    //     tickBrain();
    // }



    // public static AttributeSupplier.Builder createAttributes() {
	// 	return Monster.createMonsterAttributes()
    //         .add(Attributes.ATTACK_DAMAGE, 6.0)
    //         .add(Attributes.MOVEMENT_SPEED, 0.23F)
    //         .add(Attributes.FOLLOW_RANGE, 48.0);
	// }
}
