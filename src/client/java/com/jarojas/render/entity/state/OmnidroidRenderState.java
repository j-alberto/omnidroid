package com.jarojas.render.entity.state;

import com.jarojas.world.entity.custom.Damage;

import net.minecraft.client.render.entity.state.LivingEntityRenderState;


public class OmnidroidRenderState extends LivingEntityRenderState {
	public boolean isAggressive;
	public boolean isConverting;
	public float attackTicksRemaining;
	public int isScanning;
	public Damage.Level damage = Damage.Level.IRRELEVANT;
}
