package kristenores.mod.world.gen;

import java.util.Random;

import kristenores.mod.init.BlockInit;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator 
{

    private WorldGenerator copper1_ore;
    private WorldGenerator item_item_ore;
    private WorldGenerator quartz_copper_ore;
    private WorldGenerator stone_ore;
    private WorldGenerator illusion_ore;
    private WorldGenerator ash_ore;
    private WorldGenerator rusty_iron_ore;
    private WorldGenerator litter_ore;
    private WorldGenerator litter_ore2;
    private WorldGenerator fools_gold_ore;
    private WorldGenerator red_powder_ore;
    private WorldGenerator red_powder_ore_lit;
    private WorldGenerator fossilized_blueberry_ore;
    private WorldGenerator graphite_ore;
    private WorldGenerator dollar_bill_ore;
    private WorldGenerator nether_ore;
    private WorldGenerator nether_shard_ore;
    private WorldGenerator end_stone_ore;
    private WorldGenerator sandy_sand;
    private WorldGenerator wither_ore_block;
    private WorldGenerator ruby_ore;

    public WorldGenCustomOres()
    {
        copper1_ore = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 20, BlockMatcher.forBlock(Blocks.STONE));
        item_item_ore = new WorldGenMinable(BlockInit.ORE_ITEM_ITEM.getDefaultState(), 20, BlockMatcher.forBlock(Blocks.STONE));
        quartz_copper_ore = new WorldGenMinable(BlockInit.ORE_QUARTZ_COPPER_NETHER.getDefaultState(), 20, BlockMatcher.forBlock(Blocks.NETHERRACK));
        litter_ore = new WorldGenMinable(BlockInit.ORE_LITTER.getDefaultState(), 20, BlockMatcher.forBlock(Blocks.GRASS));
        litter_ore2 = new WorldGenMinable(BlockInit.ORE_LITTER.getDefaultState(), 20, BlockMatcher.forBlock(Blocks.MYCELIUM));
        illusion_ore = new WorldGenMinable(BlockInit.ORE_ILLUSION.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
        stone_ore = new WorldGenMinable(BlockInit.ORE_STONE.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        ash_ore = new WorldGenMinable(BlockInit.ORE_ASH.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.COAL_ORE));
        rusty_iron_ore = new WorldGenMinable(BlockInit.ORE_IRON_RUSTY.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.IRON_ORE));
        fools_gold_ore = new WorldGenMinable(BlockInit.ORE_GOLD_FOOLS.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.GOLD_ORE));
        red_powder_ore = new WorldGenMinable(BlockInit.ORE_POWDER_RED.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.REDSTONE_ORE));
        red_powder_ore_lit = new WorldGenMinable(BlockInit.ORE_POWDER_RED.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.LIT_REDSTONE_ORE));
        fossilized_blueberry_ore = new WorldGenMinable(BlockInit.ORE_BLUEBERRY_FOSSILIZED.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.LAPIS_ORE));
        graphite_ore = new WorldGenMinable(BlockInit.ORE_GRAPHITE.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.DIAMOND_ORE));
        dollar_bill_ore = new WorldGenMinable(BlockInit.ORE_BILL_DOLLAR.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.EMERALD_ORE));
        nether_ore = new WorldGenMinable(BlockInit.ORE_NETHERRACK.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.NETHERRACK));
        nether_shard_ore = new WorldGenMinable(BlockInit.ORE_SHARD_NETHER.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.QUARTZ_ORE));
        end_stone_ore = new WorldGenMinable(BlockInit.ORE_STONE_END.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.END_STONE));
        sandy_sand = new WorldGenMinable(BlockInit.SAND_SANDY.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.SAND));
        wither_ore_block = new WorldGenMinable(BlockInit.BLOCK_ORE_WITHER.getDefaultState(), 13, BlockMatcher.forBlock(Blocks.NETHERRACK));
        ruby_ore = new WorldGenMinable(BlockInit.ORE_RUBY.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.STONE));
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) 
    {
        switch(world.provider.getDimension())
        {
        case 0:

            runGenerator(copper1_ore, world, random, chunkX, chunkZ, 10, 0, 255);
            runGenerator(item_item_ore, world, random, chunkX, chunkZ, 10, 0, 255);
            runGenerator(litter_ore, world, random, chunkX, chunkZ, 50, 0, 255);
            runGenerator(litter_ore2, world, random, chunkX, chunkZ, 50, 0, 255);
            runGenerator(illusion_ore, world, random, chunkX, chunkZ, 10, 0, 255);
            runGenerator(stone_ore, world, random, chunkX, chunkZ, 50, 0, 255);
            runGenerator(ash_ore, world, random, chunkX, chunkZ, 50, 0, 255);
            runGenerator(rusty_iron_ore, world, random, chunkX, chunkZ, 50, 0, 255);
            runGenerator(fools_gold_ore, world, random, chunkX, chunkZ, 50, 0, 255);
            runGenerator(red_powder_ore, world, random, chunkX, chunkZ, 50, 0, 255);
            runGenerator(red_powder_ore_lit, world, random, chunkX, chunkZ, 50, 0, 255);
            runGenerator(fossilized_blueberry_ore, world, random, chunkX, chunkZ, 50, 0, 255);
            runGenerator(graphite_ore, world, random, chunkX, chunkZ, 50, 0, 255);
            runGenerator(dollar_bill_ore, world, random, chunkX, chunkZ, 50, 0, 255);
            runGenerator(sandy_sand, world, random, chunkX, chunkZ, 50, 0, 255);
            runGenerator(ruby_ore, world, random, chunkX, chunkZ, 3, 0, 30);
            break;

        case 1:
            runGenerator(end_stone_ore, world, random, chunkX, chunkZ, 50, 0, 255);
            break;

        case -1:
            runGenerator(quartz_copper_ore, world, random, chunkX, chunkZ, 10, 0, 128);
            runGenerator(nether_ore, world, random, chunkX, chunkZ, 50, 0, 128);
            runGenerator(nether_shard_ore, world, random, chunkX, chunkZ, 50, 0, 128);
            runGenerator(wither_ore_block, world, random, chunkX, chunkZ, 6, 23, 37);

            break;
        }
    }

    private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
    {
        if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore Generated out of Bounds");
        int heightDiff = maxHeight - minHeight +1;

        for(int i = 0; i < chance; i++)
        {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(16);

            gen.generate(world,  rand,  new BlockPos(x, y, z));
        }
    }

}
