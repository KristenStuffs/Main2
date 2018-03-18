package kristenores.mod.init;

import java.util.ArrayList;
import java.util.List;

import kristenores.mod.Main;
import kristenores.mod.objects.blocks.BlockBase;
import kristenores.mod.objects.blocks.BlockCustomLogs;
import kristenores.mod.objects.blocks.BlockIllusionOre;
import kristenores.mod.objects.blocks.BlockOreLitter;
import kristenores.mod.objects.blocks.BlockQuartzCopper;
import kristenores.mod.objects.blocks.BlockRubyOre;
import kristenores.mod.objects.blocks.BlockSandySand;
import kristenores.mod.objects.blocks.BlockCustomWall;
import kristenores.mod.objects.blocks.BlockOreWither;
import kristenores.mod.objects.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ORE_COPPER1 = new BlockBase("ore_copper1", Material.ROCK, 1, "pickaxe").setHardness(5).setResistance(15);
	public static final Block BLOCK_COPPER1 = new BlockBase("block_copper1", Material.IRON, 1, "pickaxe").setHardness(8).setResistance(20);
	public static final Block ORE_QUARTZ_COPPER_NETHER = new BlockQuartzCopper("ore_quartz_copper_nether", Material.ROCK, 1, "pickaxe").setHardness(4).setResistance(10);
	public static final Block LOGS_COPPER = new BlockCustomLogs("logs_copper", Main.USELESSORESTAB).setHardness(2).setResistance(10);
	public static final Block ORE_ITEM_ITEM = new BlockBase("ore_item_item", Material.ROCK, 0, "pickaxe").setHardness(1).setResistance(5);
	public static final Block ORE_LITTER= new BlockOreLitter("ore_litter", Material.GRASS, 0, "spade").setHardness(2).setResistance(0);
	public static final Block ORE_ILLUSION = new BlockIllusionOre("ore_illusion", Material.AIR, 0, "pickaxe").setHardness(1).setResistance(5);
	public static final Block ORE_RUBY = new BlockRubyOre("ore_ruby", Material.ROCK, 20, "pickaxe").setHardness(3).setResistance(15);
	public static final Block ORE_STONE= new BlockBase("ore_stone", Material.ROCK, 0, "pickaxe").setHardness(2).setResistance(30);
	public static final Block ORE_ASH= new BlockBase("ore_ash", Material.ROCK, 0, "pickaxe").setHardness(3).setResistance(15);
	public static final Block ORE_IRON_RUSTY= new BlockBase("ore_iron_rusty", Material.ROCK, 1, "pickaxe").setHardness(3).setResistance(15);
	public static final Block ORE_GOLD_FOOLS= new BlockBase("ore_gold_fools", Material.ROCK, 2, "pickaxe").setHardness(3).setResistance(15);
	public static final Block ORE_POWDER_RED= new BlockBase("ore_powder_red", Material.ROCK, 2, "pickaxe").setHardness(3).setResistance(15);
	public static final Block ORE_BLUEBERRY_FOSSILIZED= new BlockBase("ore_blueberry_fossilized", Material.ROCK, 1, "pickaxe").setHardness(3).setResistance(15);
	public static final Block ORE_GRAPHITE= new BlockBase("ore_graphite", Material.ROCK, 2, "pickaxe").setHardness(3).setResistance(15);
	public static final Block ORE_BILL_DOLLAR= new BlockBase("ore_bill_dollar", Material.ROCK, 2, "pickaxe").setHardness(3).setResistance(15);
	public static final Block ORE_NETHERRACK= new BlockBase("ore_netherrack", Material.ROCK, 0, "pickaxe").setHardness(1).setResistance(2);
	public static final Block ORE_SHARD_NETHER= new BlockBase("ore_shard_nether", Material.ROCK, 0, "pickaxe").setHardness(3).setResistance(15);
	public static final Block ORE_STONE_END= new BlockBase("ore_stone_end", Material.ROCK, 0, "pickaxe").setHardness(3).setResistance(45);
	public static final Block BLOCK_ORE_WITHER= new BlockOreWither("block_ore_wither", Material.ROCK, 3, "pickaxe").setHardness(40).setResistance(18000);
	public static final Block SAND_SANDY= new BlockSandySand("sand_sandy", Material.SAND, 0, "spade").setHardness(1).setResistance(3);
	public static final Block ICE_WALL_LUL = new BlockCustomWall("ice_wall_lul", Material.ICE, 5, 5, SoundType.GLASS);		
	}
