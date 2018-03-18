package kristenores.mod;

import kristenores.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class UselessOresTab extends CreativeTabs
{
	public UselessOresTab(String label) { super("uselessorestab"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.INGOT_COPPER1);}
}
