package kristenores.mod;

import kristenores.mod.entity.CopperZombie.EntityCopperZombie;
import kristenores.mod.entity.CopperZombie.RenderCopperZombie;
import kristenores.mod.entity.ZombieZombie.EntityZombieZombie;
import kristenores.mod.entity.ZombieZombie.RenderZombieZombie;
import kristenores.mod.init.BiomeInit;
import kristenores.mod.util.Reference;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {

    public static void init() {
        // Every entity in our mod has an ID (local to this mod)
        int id = 1;
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "copperzombie"), EntityCopperZombie.class, "CopperZombie", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "zombiezombie"), EntityZombieZombie.class, "ZombieZombie", id++, Main.instance, 64, 3, true, 0x088d75, 0x304c24);

        // We want our mob to spawn in Plains and ice plains biomes. If you don't add this then it will not spawn automatically
        // but you can of course still make it spawn manually
        EntityRegistry.addSpawn(EntityCopperZombie.class, 100, 3, 5, EnumCreatureType.MONSTER, BiomeInit.COPPERWASTELAND);
        EntityRegistry.addSpawn(EntityZombieZombie.class, 100, 3, 5, EnumCreatureType.MONSTER, Biomes.SWAMPLAND);

        // This is the loot table for our mob
        LootTableList.register(EntityCopperZombie.LOOT);
        LootTableList.register(EntityZombieZombie.LOOT);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityCopperZombie.class, RenderCopperZombie.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieZombie.class, RenderZombieZombie.FACTORY);
    }
}
