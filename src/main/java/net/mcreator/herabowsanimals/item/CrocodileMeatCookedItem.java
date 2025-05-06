
package net.mcreator.herabowsanimals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CrocodileMeatCookedItem extends Item {
	public CrocodileMeatCookedItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(6).saturationModifier(1f).build()));
	}
}
