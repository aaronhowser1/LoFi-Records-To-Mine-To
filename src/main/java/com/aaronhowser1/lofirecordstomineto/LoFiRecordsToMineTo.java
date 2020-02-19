package com.aaronhowser1.lofirecordstomineto;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("lofirecordstomineto")
public class LoFiRecordsToMineTo {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public LoFiRecordsToMineTo() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }




    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        private static Item createItemModRecord(ResourceLocation resourceLocation, SoundEvent soundEvent) {
            return new ItemModRecord(0, soundEvent, (new Item.Properties().maxStackSize(1).group(ItemGroup.MISC))).setRegistryName(resourceLocation);
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll(
                    createItemModRecord(new ResourceLocation(MOD_ID, "a_little_something"), ModSoundEvents.MUSIC_DISC_A_LITTLE_SOMETHING),
                    createItemModRecord(new ResourceLocation(MOD_ID, "a_mix_of_time_and_space"), ModSoundEvents.MUSIC_DISC_A_MIX_OF_SOUND_AND_SPACE),
                    createItemModRecord(new ResourceLocation(MOD_ID, "alone"), ModSoundEvents.MUSIC_DISC_ALONE),
                    createItemModRecord(new ResourceLocation(MOD_ID, "face_it"), ModSoundEvents.MUSIC_DISC_FACE_IT),
//                    createItemModRecord(new ResourceLocation(MOD_ID, "faces"), ModSoundEvents.FACES),
                    createItemModRecord(new ResourceLocation(MOD_ID, "falling_leaves"), ModSoundEvents.MUSIC_DISC_FALLING_LEAVES),
                    createItemModRecord(new ResourceLocation(MOD_ID, "finger_puppets"), ModSoundEvents.MUSIC_DISC_FINGER_PUPPETS),
                    createItemModRecord(new ResourceLocation(MOD_ID, "falls_first_sunday"), ModSoundEvents.MUSIC_DISC_FIRST_FALLS_SUNDAY),
                    createItemModRecord(new ResourceLocation(MOD_ID, "happy_birthday"), ModSoundEvents.MUSIC_DISC_HAPPY_BIRTHDAY),
                    createItemModRecord(new ResourceLocation(MOD_ID, "in_search_of_life"), ModSoundEvents.MUSIC_DISC_IN_SEARCH_OF_LIFE),
                    createItemModRecord(new ResourceLocation(MOD_ID, "interdimensional"), ModSoundEvents.MUSIC_DISC_INTERDIMENSIONAL),
                    createItemModRecord(new ResourceLocation(MOD_ID, "its_inside"), ModSoundEvents.MUSIC_DISC_ITS_INSIDE),
//                    createItemModRecord(new ResourceLocation(MOD_ID, "keyhole"), ModSoundEvents.KEYHOLE),
                    createItemModRecord(new ResourceLocation(MOD_ID, "look_at_the_camera"), ModSoundEvents.MUSIC_DISC_LOOK_AT_THE_CAMERA),
                    createItemModRecord(new ResourceLocation(MOD_ID, "making_ways"), ModSoundEvents.MUSIC_DISC_MAKING_WAYS),
                    createItemModRecord(new ResourceLocation(MOD_ID, "memory_loss"), ModSoundEvents.MUSIC_DISC_MEMORY_LOSS),
                    createItemModRecord(new ResourceLocation(MOD_ID, "normal"), ModSoundEvents.MUSIC_DISC_NORMAL),
                    createItemModRecord(new ResourceLocation(MOD_ID, "overhead"), ModSoundEvents.MUSIC_DISC_OVERHEAD),
                    createItemModRecord(new ResourceLocation(MOD_ID, "plucked"), ModSoundEvents.MUSIC_DISC_PLUCKED),
                    createItemModRecord(new ResourceLocation(MOD_ID, "remember"), ModSoundEvents.MUSIC_DISC_REMEMBER),
                    createItemModRecord(new ResourceLocation(MOD_ID, "render"), ModSoundEvents.MUSIC_DISC_RENDER),
                    createItemModRecord(new ResourceLocation(MOD_ID, "running_from_giants"), ModSoundEvents.MUSIC_DISC_RUNNING_FROM_GIANTS),
                    createItemModRecord(new ResourceLocation(MOD_ID, "shadow_people"), ModSoundEvents.MUSIC_DISC_SHADOW_PEOPLE),
                    createItemModRecord(new ResourceLocation(MOD_ID, "space_whales"), ModSoundEvents.MUSIC_DISC_SPACE_WHALES),
                    createItemModRecord(new ResourceLocation(MOD_ID, "survived_by"), ModSoundEvents.MUSIC_DISC_SURVIVED_BY),
                    createItemModRecord(new ResourceLocation(MOD_ID, "there_there"), ModSoundEvents.MUSIC_DISC_THERE_THERE),
                    createItemModRecord(new ResourceLocation(MOD_ID, "thicker"), ModSoundEvents.MUSIC_DISC_THICKER),
                    createItemModRecord(new ResourceLocation(MOD_ID, "time_rider"), ModSoundEvents.MUSIC_DISC_TIME_RIDER),
                    createItemModRecord(new ResourceLocation(MOD_ID, "turning_over_rocks"), ModSoundEvents.MUSIC_DISC_TURNING_OVER_ROCKS),
                    createItemModRecord(new ResourceLocation(MOD_ID, "uncanny"), ModSoundEvents.MUSIC_DISC_UNCANNY),
                    createItemModRecord(new ResourceLocation(MOD_ID, "war"), ModSoundEvents.MUSIC_DISC_WAR),
                    createItemModRecord(new ResourceLocation(MOD_ID, "when_it_rains"), ModSoundEvents.MUSIC_DISC_WHEN_IT_RAINS),
                    createItemModRecord(new ResourceLocation(MOD_ID, "wind"), ModSoundEvents.MUSIC_DISC_WIND)
            );
        }
    }


}
