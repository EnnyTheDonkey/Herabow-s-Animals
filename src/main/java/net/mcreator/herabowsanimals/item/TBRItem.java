
package net.mcreator.herabowsanimals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TBRItem extends Item {
	public TBRItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
