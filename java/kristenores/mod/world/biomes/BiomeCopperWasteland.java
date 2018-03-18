package kristenores.mod.world.biomes;

import kristenores.mod.init.BlockInit;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeCopperWasteland extends Biome 
{
	public BiomeCopperWasteland()
	{
		super(new BiomeProperties("Copper Wasteland").setBaseHeight(0.145F).setHeightVariation(0.15F).setTemperature(2.0F).setRainDisabled().setWaterColor(10718976));
		
		topBlock = BlockInit.ORE_COPPER1.getDefaultState();
		fillerBlock = BlockInit.BLOCK_COPPER1.getDefaultState();
        this.decorator.treesPerChunk = -999;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityZombie.class, 19, 4, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityZombieVillager.class, 1, 1, 1));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityHusk.class, 80, 4, 4));
	}
}
