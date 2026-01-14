package com.jarojas.world.entity.custom;

public class Damage {
	public static final Damage OMNIDROID_V1 = new Damage(0.2F, 0.5F, 0.75F, 0.85F);

	private final float damageModerate;
	private final float damageMajor;
	private final float damageSevere;
	private final float damageCritical;

	private Damage( final float damageModerate, 
            final float damageMajor, final float damageSevere,
            final float damageCritical) {
		this.damageModerate = damageModerate;
		this.damageMajor = damageMajor;
		this.damageSevere = damageSevere;
		this.damageCritical = damageCritical;
	}

	public Damage.Level byDamage(final float damage) {

		if (damage < this.damageModerate) {
			return Damage.Level.IRRELEVANT;
		} else if (damage < this.damageMajor) {
			return Damage.Level.MODERATE;
		} else if (damage < this.damageSevere) {
            return Damage.Level.MAJOR;
        } else if (damage < this.damageCritical) {
            return Damage.Level.SEVERE;
        } else {
            return Damage.Level.CRITICAL;
		}
	}

	public static enum Level {
		IRRELEVANT,
        MODERATE,
        MAJOR,
        SEVERE,
		CRITICAL;
	}

}
