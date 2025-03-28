
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.herabowsanimals.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.herabowsanimals.item.ReptileSkinItem;
import net.mcreator.herabowsanimals.item.ReptileArmorItem;
import net.mcreator.herabowsanimals.HerabowsAnimalsMod;

public class HerabowsAnimalsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(HerabowsAnimalsMod.MODID);
	public static final DeferredItem<Item> REPTILE_SKIN = REGISTRY.register("reptile_skin", ReptileSkinItem::new);
	public static final DeferredItem<Item> REPTILE_ARMOR_HELMET = REGISTRY.register("reptile_armor_helmet", ReptileArmorItem.Helmet::new);
	public static final DeferredItem<Item> REPTILE_ARMOR_CHESTPLATE = REGISTRY.register("reptile_armor_chestplate", ReptileArmorItem.Chestplate::new);
	public static final DeferredItem<Item> REPTILE_ARMOR_LEGGINGS = REGISTRY.register("reptile_armor_leggings", ReptileArmorItem.Leggings::new);
	public static final DeferredItem<Item> REPTILE_ARMOR_BOOTS = REGISTRY.register("reptile_armor_boots", ReptileArmorItem.Boots::new);
	// Start of user code block custom items
	// End of user code block custom items
}
