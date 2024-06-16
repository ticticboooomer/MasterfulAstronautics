package com.masterfulmc.mods.mastro.space;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.resources.ResourceLocation;

public record PlanetModel(
        ResourceLocation dimensionId
) {
    public static final Codec<PlanetModel> CODEC = RecordCodecBuilder.create(b -> b.group(
            ResourceLocation.CODEC.fieldOf("dimensionId").forGetter(x -> x.dimensionId)
    ).apply(b, PlanetModel::new));
}
