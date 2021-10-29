package net.mcbedev.mymod.client.model;

import net.mcbedev.mymod.client.entity.JirachiEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class JirachiModel extends AnimatedGeoModel<JirachiEntity> {

    @Override
    public Identifier getModelLocation(JirachiEntity object) {
        return new Identifier("mymod", "geo/jirachi.geo.json");
    }

    @Override
    public Identifier getTextureLocation(JirachiEntity object) {
        return new Identifier("mymod", "textures/entity/jirachi.png");
    }

    @Override
    public Identifier getAnimationFileLocation(JirachiEntity animatable) {
        return new Identifier("mymod", "animations/jirachi.animation.json");
    }
}