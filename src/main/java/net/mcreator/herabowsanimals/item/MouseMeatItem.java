
package net.mcreator.herabowsanimals.item;

public class MouseMeatItem extends Item {
	public MouseMeatItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.2f).build()));
	}
}