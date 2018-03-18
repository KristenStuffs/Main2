package kristenores.mod.entity.CopperZombie;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderCopperZombie extends RenderLiving<EntityCopperZombie> {

    private ResourceLocation mobTexture = new ResourceLocation("uselessores:textures/entity/copper_zombie.png");

    public static final Factory FACTORY = new Factory();

    public RenderCopperZombie(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelZombie(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityCopperZombie entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityCopperZombie> {

        @Override
        public Render<? super EntityCopperZombie> createRenderFor(RenderManager manager) {
            return new RenderCopperZombie(manager);
        }

    }

}
