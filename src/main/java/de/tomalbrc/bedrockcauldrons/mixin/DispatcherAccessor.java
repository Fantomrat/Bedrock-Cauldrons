package de.tomalbrc.bedrockcauldrons.mixin;

import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(CauldronInteraction.Dispatcher.class)
public interface DispatcherAccessor {

    @Invoker("put")
    void invokePut(Item item, CauldronInteraction interaction);

    @Invoker("put")
    void invokePut(TagKey<Item> tag, CauldronInteraction interaction);
}
