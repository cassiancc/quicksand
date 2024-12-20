package com.shnupbups.quicksand.mixin.client;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.render.entity.ZombieBaseEntityRenderer;
import net.minecraft.client.render.entity.state.ZombieEntityRenderState;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import com.shnupbups.quicksand.util.ZombieEntityInterface;

@Mixin(ZombieBaseEntityRenderer.class)
public abstract class ZombieBaseEntityRendererMixin<T extends ZombieEntityRenderState> {
//	@ModifyReturnValue(method = "isShaking(Lnet/minecraft/client/render/entity/state/ZombieEntityRenderState;)Z", at = @At("RETURN"))
//	private boolean quicksand_isShaking(boolean original, @Local(argsOnly = true) T zombie) {
//		return original || ((ZombieEntityInterface)zombie).quicksand_isConvertingInQuicksand();
//	}
}
