package kristenores.mod.world.biomes;

import kristenores.mod.init.BlockInit;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeWitherMountains extends Biome 
{
	public BiomeWitherMountains()
	{
		super(new BiomeProperties("Wither Mountains").setBaseHeight(1.2371F).setHeightVariation(0.83F).setTemperature(2.0F).setRainDisabled().setWaterColor(000000));
		
		topBlock = BlockInit.BLOCK_ORE_WITHER.getDefaultState();
		fillerBlock = BlockInit.BLOCK_ORE_WITHER.getDefaultState();
        this.decorator.treesPerChunk = -999;
       	
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWither.class, 35, 1, 5));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityWither.class, 35, 1, 5));
	}
}
