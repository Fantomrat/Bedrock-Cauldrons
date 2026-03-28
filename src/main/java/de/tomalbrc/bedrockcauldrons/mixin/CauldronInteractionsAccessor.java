package de.tomalbrc.bedrockcauldrons.mixin;

import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.core.cauldron.CauldronInteractions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(CauldronInteractions.class)
public interface CauldronInteractionsAccessor {
    @Invoker
    static CauldronInteraction.Dispatcher invokeNewDispatcher(String string) {
        throw new AssertionError();
    }
}
