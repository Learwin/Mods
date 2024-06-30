package com.example.mod2;

import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod("testmod2")
public class Mod2Entrypoint {
    public Mod2Entrypoint(ModContainer container) {
        System.out.println(container.getModId() + " initialised!");
    }
}
