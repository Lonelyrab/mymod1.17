package net.mcbedev.mymod;

import net.fabricmc.api.ModInitializer;
import net.mcbedev.mymod.client.ModEntities;

public class Main implements ModInitializer {
    public static final String MOD_ID = "mymod";
    ModEntities.registerEntities();

    @Override
    public void onInitialize() {
        System.out.println("Hello Fabric world!");
    }

}