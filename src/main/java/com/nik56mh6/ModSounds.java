package com.nik56mh6;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

public class ModSounds {
    public static final SoundEvent GOURD_OF_RETURN = SoundEvent.createVariableRangeEvent(
            Identifier.fromNamespaceAndPath("niksadditions", "gourd_of_return")
    );

    public static void register() {
        Registry.register(BuiltInRegistries.SOUND_EVENT,
                Identifier.fromNamespaceAndPath("niksadditions", "gourd_of_return"),
                GOURD_OF_RETURN
        );
    }
}
