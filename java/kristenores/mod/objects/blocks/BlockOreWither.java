package kristenores.mod.objects.blocks;

import java.util.Random;

import kristenores.mod.Main;
import kristenores.mod.init.BlockInit;
import kristenores.mod.init.ItemInit;
import kristenores.mod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockOreWither extends Block implements IHasModel{
	public BlockOreWither(String name, Material material, int harvestlevel, String tool)
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
	
	@SubscribeEvent
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {
        ((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.WITHER, 1200, 1));
    }

public Item getItemDropped(IBlockState state, Random rand, int fortune)
{
	return null;
}

	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
	{
		return new ItemStack(BlockInit.BLOCK_ORE_WITHER);
	}
}

