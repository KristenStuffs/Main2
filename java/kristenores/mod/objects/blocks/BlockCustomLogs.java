package kristenores.mod.objects.blocks;

import kristenores.mod.Main;
import kristenores.mod.init.BlockInit;
import kristenores.mod.init.ItemInit;
import kristenores.mod.util.handlers.EnumHandler;
import kristenores.mod.util.interfaces.IHasModel;
import net.minecraft.block.BlockLog;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class BlockCustomLogs extends BlockLog implements IHasModel
{
	private String name;
	private CreativeTabs tabs;
	
	public BlockCustomLogs(String name, CreativeTabs tab)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.WOOD);
		setCreativeTab(tab);
		
		this.name = name;
		this.tabs = tab;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	{
		for(EnumHandler.EnumType customblockplanks$enumtype : EnumHandler.EnumType.values())
		{
			items.add(new ItemStack(this, 1, customblockplanks$enumtype.getMeta()));
		}
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
		{
			IBlockState state = this.getDefaultState();
			
			switch(meta & 6)
			{
			case 0:
			state = state.withProperty(LOG_AXIS, EnumAxis.Y);
			break;
			
			case 2:
				state = state.withProperty(LOG_AXIS, EnumAxis.X);
				break;
				
			case 4:
				state = state.withProperty(LOG_AXIS, EnumAxis.Z);
				break;
				
				default:
					state = state.withProperty(LOG_AXIS, EnumAxis.NONE);
			}
			
			return state;
			
			}

		@SuppressWarnings("incomplete-switch")
		@Override
		public int getMetaFromState(IBlockState state)
		{
			int i = 0;
			
			switch((BlockLog.EnumAxis)state.getValue(LOG_AXIS))
			{
			case X:
				i |= 2;
			break;
			
			case Y:
				i |= 4;
			
			case Z:
				i |= 6;
			
			}
			
			return i;
		
		}
		
		@Override
		protected BlockStateContainer createBlockState()
		{
			return new BlockStateContainer(this, new IProperty[] {LOG_AXIS});
		}
		
		@Override
		public void registerModels()
		{
			for(int i = 0; i < EnumHandler.EnumType.values().length; i++)
			{
				Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "logs_" + EnumHandler.EnumType.values()[i].getName(), "inventory");
			}
		
	}

}
