package kristenores.mod.objects.items.tools;

import kristenores.mod.Main;
import kristenores.mod.init.ItemInit;
import kristenores.mod.util.interfaces.IHasModel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel{

	public ToolHoe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.USELESSORESTAB);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
