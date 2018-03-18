package kristenores.mod.objects.blocks;

import java.util.Random;

import kristenores.mod.Main;
import kristenores.mod.init.BlockInit;
import kristenores.mod.init.ItemInit;
import kristenores.mod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.storage.ExtendedBlockStorage;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockQuartzCopper extends Block implements IHasModel{
	public BlockQuartzCopper(String name, Material material, int harvestlevel, String tool)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.USELESSORESTAB);
		setHarvestLevel(tool, harvestlevel);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	

public Item getItemDropped(IBlockState state, Random rand, int fortune)
{
	return ItemInit.QUARTZ_COPPER_NETHER;
}

	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
	{
		return new ItemStack(BlockInit.ORE_QUARTZ_COPPER_NETHER);
	}
}

