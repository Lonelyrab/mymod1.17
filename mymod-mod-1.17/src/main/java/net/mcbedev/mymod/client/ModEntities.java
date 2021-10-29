package net.mcbedev.mymod.client;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.mcbedev.mymod.Main;
import net.mcbedev.mymod.client.entity.JirachiEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModEntities {

  // 註冊實體
  public static final EntityType<JirachiEntity> JIRACHI = Registry.register(Registry.ENTITY_TYPE,
      new Identifier(Main.MOD_ID, "jirachi"), FabricEntityTypeBuilder
          .create(SpawnGroup.CREATURE, JirachiEntity::new).dimensions(EntityDimensions.fixed(0.5f, 2f)).build());

  public static void registerEntities() {
    // 註冊實體屬性
    FabricDefaultAttributeRegistry.register(JIRACHI, JirachiEntity.createMobAttributes());
    System.out.println("Registering mod mobs for" + Main.MOD_ID);
  }
}