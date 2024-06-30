package com.example.mod1;

import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod("testmod1")
public class Mod1Entrypoint {
    public Mod1Entrypoint(ModContainer container) {
        System.out.println(container.getModId() + " initialised!");
    }
}
