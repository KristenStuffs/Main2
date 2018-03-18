package kristenores.mod.init;

import kristenores.mod.world.biomes.BiomeCopperWasteland;
import kristenores.mod.world.biomes.BiomeWitherMountains;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit 
{	
	public static final Biome COPPERWASTELAND = new BiomeCopperWasteland();
	public static final Biome WITHERMOUNTAINS = new BiomeWitherMountains();

	public static void registerBiomes()
	
	{
		initBiome(COPPERWASTELAND, "Copper Wasteland", BiomeType.DESERT, Type.DRY);
		initBiome(WITHERMOUNTAINS, "Wither Mountains", BiomeType.DESERT, Type.DRY, Type.HOT);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types)
	
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Useless Biomes Added");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		BiomeManager.addSpawnBiome(biome);
		return biome;
	}

}
