package boni.dummy.client;

import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import boni.dummy.EntityDummy;

public class RenderDummy extends RenderBiped<EntityDummy> {

  private static final ResourceLocation texture = new ResourceLocation("testdummy", "textures/entity/dummy.png");
  public static final ModelDummy model = new ModelDummy(0.0f, 0.0F);

  public RenderDummy(RenderManager renderManager) {
    super(renderManager, model, 0.125f);
    this.addLayer(new LayerDummyArmor(this));
  }

  @Override
  protected ResourceLocation getEntityTexture(EntityDummy p_110775_1_) {
    return texture;
  }

  //@Override
  protected void func_82421_b() {
    //this.field_82423_g = new ModelDummy(1.0F, 0f, 64, 32);
    //this.field_82425_h = new ModelDummy(0.5F, 0f, 64, 32);

    //((ModelDummy)this.field_82423_g).standPlate.showModel = false;
    //((ModelDummy)this.field_82425_h).standPlate.showModel = false;
  }
}
