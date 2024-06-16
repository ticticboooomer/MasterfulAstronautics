package com.masterfulmc.mods.mastro.registry;

import com.masterfulmc.mods.mastro.Ref;
import com.masterfulmc.mods.mastro.space.PlanetModel;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;

public class MDataPackRegistries {
    public static final ResourceKey<Registry<PlanetModel>> PLANETS = ResourceKey.createRegistryKey(Ref.Registries.PLANETS);
}
