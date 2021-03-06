package com.aaronhowser1.lofirecordstomineto;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LoFiRecordsToMineTo.MOD_ID);

    public static final RegistryObject<SoundEvent> MUSIC_DISC_A_LITTLE_SOMETHING = create("a_little_something");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_A_MIX_OF_SOUND_AND_SPACE = create("a_mix_of_sound_and_space");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_ALONE = create("alone");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_FACE_IT = create("face_it");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_FALLING_LEAVES = create("falling_leaves");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_FINGER_PUPPETS = create("finger_puppets");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_FALLS_FIRST_SUNDAY = create("falls_first_sunday");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_HAPPY_BIRTHDAY = create("happy_birthday");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_IN_SEARCH_OF_LIFE = create("in_search_of_life");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_INTERDIMENSIONAL = create("interdimensional");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_ITS_INSIDE = create("its_inside");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_LOOK_AT_THE_CAMERA = create("look_at_the_camera");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_MAKING_WAYS = create("making_ways");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_MEMORY_LOSS = create("memory_loss");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_NORMAL = create("normal");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_OVERHEAD = create("overhead");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_PLUCKED = create("plucked");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_REMEMBER = create("remember");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_RENDER = create("render");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_RUNNING_FROM_GIANTS = create("running_from_giants");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_SHADOW_PEOPLE = create("shadow_people");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_SPACE_WHALES = create("space_whales");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_SURVIVED_BY = create("survived_by");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_THERE_THERE = create("there_there");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_THICKER = create("thicker");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_TIME_RIDER = create("time_rider");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_TURNING_OVER_ROCKS = create("turning_over_rocks");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_UNCANNY = create("uncanny");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_WAR = create("war");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_WHEN_IT_RAINS = create("when_it_rains");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_WIND = create("wind");

    private static RegistryObject<SoundEvent> create(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(LoFiRecordsToMineTo.MOD_ID, name)));
    }
}
