package net.mcbedev.mymod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.EntityRendererRegistryImpl;
import net.mcbedev.mymod.client.renderer.JirachiRenderer;

@Environment(EnvType.CLIENT)
public class EntityClient implements ClientModInitializer {



    @Override
    public void onInitializeClient() {

        //註冊渲染器
        EntityRendererRegistryImpl.register(ModEntities.JIRACHI, JirachiRenderer::new);

    }
}