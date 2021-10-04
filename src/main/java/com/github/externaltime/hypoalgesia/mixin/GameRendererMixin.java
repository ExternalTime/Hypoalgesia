package com.github.externaltime.hypoalgesia.mixin;

import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public class GameRendererMixin {
    @Inject(method = "bobViewWhenHurt", at = @At("HEAD"), cancellable = true)
    public void bobViewWhenHurt(MatrixStack matrices, float f, CallbackInfo ci) {
        ci.cancel();
    }
}
