
package net.mcreator.herabowsanimals.item;

public class CrocodileMeatItem extends Item {
	public CrocodileMeatItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(6).saturationModifier(1f).build()));
	}
}