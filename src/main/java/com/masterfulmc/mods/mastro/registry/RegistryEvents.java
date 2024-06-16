package com.masterfulmc.mods.mastro.registry;

import com.masterfulmc.mods.mastro.space.PlanetModel;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DataPackRegistryEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class RegistryEvents {
    @SubscribeEvent
    public static void registerDatapackRegistries(DataPackRegistryEvent.NewRegistry event) {
        event.dataPackRegistry(MDataPackRegistries.PLANETS, PlanetModel.CODEC, PlanetModel.CODEC);
    }
}
