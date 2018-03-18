package kristenores.mod.recipes;

import kristenores.mod.init.BlockInit;
import kristenores.mod.init.ItemInit;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
	
	public SmeltingRecipes()
	{
		
	}
		public static void addRecipes() 
		{
			
			// Ores
			GameRegistry.addSmelting(BlockInit.ORE_COPPER1, new ItemStack(ItemInit.INGOT_COPPER1), 0.0f);
			GameRegistry.addSmelting(BlockInit.ORE_ITEM_ITEM, new ItemStack(ItemInit.INGOT_ITEM_ITEM), 0.0f);
			GameRegistry.addSmelting(BlockInit.ORE_LITTER, new ItemStack(ItemInit.LITTER), 0.0f);
			GameRegistry.addSmelting(BlockInit.ORE_ILLUSION, new ItemStack(ItemInit.TEAR), 0.0f);
			GameRegistry.addSmelting(BlockInit.ORE_RUBY, new ItemStack(ItemInit.RUBY), 0.0f);
			GameRegistry.addSmelting(BlockInit.ORE_STONE, new ItemStack(ItemInit.TEAR), 0.0f);
			GameRegistry.addSmelting(BlockInit.ORE_ASH, new ItemStack(ItemInit.TEAR), 0.0f);
			GameRegistry.addSmelting(BlockInit.ORE_IRON_RUSTY, new ItemStack(ItemInit.TEAR), 0.0f);
			GameRegistry.addSmelting(BlockInit.ORE_GOLD_FOOLS, new ItemStack(ItemInit.TEAR), 0.0f);
			GameRegistry.addSmelting(BlockInit.ORE_POWDER_RED, new ItemStack(ItemInit.TEAR), 0.0f);
			GameRegistry.addSmelting(BlockInit.ORE_BLUEBERRY_FOSSILIZED, new ItemStack(ItemInit.TEAR), 0.0f);
			GameRegistry.addSmelting(BlockInit.ORE_GRAPHITE, new ItemStack(ItemInit.TEAR), 0.0f);
			GameRegistry.addSmelting(BlockInit.ORE_BILL_DOLLAR, new ItemStack(ItemInit.TEAR), 0.0f);
			GameRegistry.addSmelting(BlockInit.ORE_NETHERRACK, new ItemStack(ItemInit.TEAR), 0.0f);
			GameRegistry.addSmelting(BlockInit.ORE_SHARD_NETHER, new ItemStack(ItemInit.TEAR), 0.0f);
			GameRegistry.addSmelting(BlockInit.ORE_STONE_END, new ItemStack(ItemInit.TEAR), 0.0f);
			GameRegistry.addSmelting(BlockInit.SAND_SANDY, new ItemStack(BlockInit.SAND_SANDY), 0.0f);
			
			// Tears
			GameRegistry.addSmelting(ItemInit.TEAR, new ItemStack(ItemInit.TEAR_ANGER), 0.0f);
			GameRegistry.addSmelting(ItemInit.TEAR_ANGER, new ItemStack(ItemInit.TEAR_SADNESS), 0.0f);
			GameRegistry.addSmelting(ItemInit.TEAR_JOY, new ItemStack(ItemInit.TEAR_SHAME), 0.0f);
			GameRegistry.addSmelting(ItemInit.TEAR_SHAME, new ItemStack(ItemInit.TEAR_ENVY), 0.0f);
			GameRegistry.addSmelting(ItemInit.TEAR_ENVY, new ItemStack(ItemInit.TEAR_DETERMINATION), 0.0f);
			GameRegistry.addSmelting(ItemInit.TEAR_DETERMINATION, new ItemStack(ItemInit.TEAR_LOVE), 0.0f);
			GameRegistry.addSmelting(ItemInit.TEAR_LOVE, new ItemStack(ItemInit.TEAR_HAPPY), 0.0f);
			GameRegistry.addSmelting(ItemInit.TEAR_HAPPY, new ItemStack(ItemInit.TEAR_ACCEPTANCE), 0.0f);
			GameRegistry.addSmelting(ItemInit.TEAR_ACCEPTANCE, new ItemStack(ItemInit.TEAR_BURNT), 0.0f);

			// Fake
			GameRegistry.addSmelting(BlockInit.LOGS_COPPER, new ItemStack(ItemInit.CHARCOAL_COPPER1), 0.0f);
			GameRegistry.addSmelting(ItemInit.COAL_USELESS, new ItemStack(ItemInit.CHARCOAL_USELESS), 0.1F);
			GameRegistry.addSmelting(Items.COAL, new ItemStack(ItemInit.CHARCOAL_USELESS), 0.1F);
			
			// Nuggets
			GameRegistry.addSmelting(ItemInit.SPADE_COPPER, new ItemStack(ItemInit.NUGGET_COPPER1), 0.0f);
			GameRegistry.addSmelting(ItemInit.PICKAXE_COPPER, new ItemStack(ItemInit.NUGGET_COPPER1), 0.0f);
			GameRegistry.addSmelting(ItemInit.AXE_COPPER, new ItemStack(ItemInit.NUGGET_COPPER1), 0.0f);
			GameRegistry.addSmelting(ItemInit.SWORD_COPPER, new ItemStack(ItemInit.NUGGET_COPPER1), 0.0f);
			GameRegistry.addSmelting(ItemInit.HOE_COPPER, new ItemStack(ItemInit.NUGGET_COPPER1), 0.0f);
		}
	}