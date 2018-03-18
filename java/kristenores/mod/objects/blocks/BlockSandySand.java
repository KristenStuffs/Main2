package kristenores.mod.objects.blocks;

import kristenores.mod.Main;
import kristenores.mod.init.BlockInit;
import kristenores.mod.init.ItemInit;
import kristenores.mod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockSandySand extends BlockFalling implements IHasModel{
	public BlockSandySand(String name, Material material, int harvestlevel, String tool)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.SAND);
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

}
