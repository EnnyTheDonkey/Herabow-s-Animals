
package net.mcreator.herabowsanimals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class MouseMeatCookedItem extends Item {
	public MouseMeatCookedItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.4f).build()));
	}
}
