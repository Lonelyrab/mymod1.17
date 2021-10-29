package net.mcbedev.mymod.client.renderer;

import net.mcbedev.mymod.client.entity.JirachiEntity;
import net.mcbedev.mymod.client.model.JirachiModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class JirachiRenderer extends GeoEntityRenderer<JirachiEntity> {
    public JirachiRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new JirachiModel());
    }
}