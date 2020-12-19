package dev.sapphic.beacons.mixin;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(MobEffect.class)
public interface MobEffectAccessor {
  @Invoker
  static MobEffect newMobEffect(final MobEffectCategory category, final int color) {
    throw new AssertionError();
  }
}
