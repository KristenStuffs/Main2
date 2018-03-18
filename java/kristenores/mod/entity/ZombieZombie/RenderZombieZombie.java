package kristenores.mod.entity.ZombieZombie;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderZombieZombie extends RenderLiving<EntityZombieZombie> {

    private ResourceLocation mobTexture = new ResourceLocation("uselessores:textures/entity/zombie_zombie.png");

    public static final Factory FACTORY = new Factory();

    public RenderZombieZombie(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelZombie(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityZombieZombie entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityZombieZombie> {

        @Override
        public Render<? super EntityZombieZombie> createRenderFor(RenderManager manager) {
            return new RenderZombieZombie(manager);
        }

    }

}
