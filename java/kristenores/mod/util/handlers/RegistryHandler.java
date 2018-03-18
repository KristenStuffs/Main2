package kristenores.mod.util.handlers;

import kristenores.mod.ModEntities;
import kristenores.mod.init.BiomeInit;
import kristenores.mod.init.BlockInit;
import kristenores.mod.init.ItemInit;
import kristenores.mod.util.interfaces.IHasModel;
import kristenores.mod.world.gen.WorldGenCustomOres;
import kristenores.mod.world.gen.generators.structures.buildings.junkyard.WorldGenCustomJunkyard;
import kristenores.mod.world.gen.generators.structures.trees.copper_tree.WorldGenCustomCopper_Tree;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
{
		for(Item item : ItemInit.ITEMS)
		{
			if (item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
				
			{
				((IHasModel)block).registerModels();
			}
		}
		
		
}
	public static void preInitRegistries()    {
        GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenCustomJunkyard(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenCustomCopper_Tree(), 0);

        BiomeInit.registerBiomes();
        
        ModEntities.initModels();
        }

}