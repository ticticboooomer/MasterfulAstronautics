package com.masterfulmc.mods.mastro;

import net.minecraft.resources.ResourceLocation;

public class Ref {
    public static final String ID = "mastro";

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(ID, path);
    }

    public static class Registries {
        public static final ResourceLocation PLANETS = id("planets");
    }
}
