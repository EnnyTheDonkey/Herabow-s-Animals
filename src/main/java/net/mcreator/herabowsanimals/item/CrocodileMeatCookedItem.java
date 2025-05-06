
package net.mcreator.herabowsanimals.item;

public class CrocodileMeatCookedItem extends Item {
	public CrocodileMeatCookedItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(6).saturationModifier(1f).build()));
	}
}