
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.herabowsanimals.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.herabowsanimals.item.ReptileSkinItem;
import net.mcreator.herabowsanimals.item.ReptileArmorItem;
import net.mcreator.herabowsanimals.item.MouseMeatItem;
import net.mcreator.herabowsanimals.item.MouseMeatCookedItem;
import net.mcreator.herabowsanimals.item.CrocodileScaleItem;
import net.mcreator.herabowsanimals.item.CrocodileMeatItem;
import net.mcreator.herabowsanimals.item.CrocodileMeatCookedItem;
import net.mcreator.herabowsanimals.item.CrocodileArmorItem;
import net.mcreator.herabowsanimals.HerabowsAnimalsMod;

public class HerabowsAnimalsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(HerabowsAnimalsMod.MODID);
	public static final DeferredItem<Item> REPTILE_SKIN = REGISTRY.register("reptile_skin", ReptileSkinItem::new);
	public static final DeferredItem<Item> REPTILE_ARMOR_HELMET = REGISTRY.register("reptile_armor_helmet", ReptileArmorItem.Helmet::new);
	public static final DeferredItem<Item> REPTILE_ARMOR_CHESTPLATE = REGISTRY.register("reptile_armor_chestplate", ReptileArmorItem.Chestplate::new);
	public static final DeferredItem<Item> REPTILE_ARMOR_LEGGINGS = REGISTRY.register("reptile_armor_leggings", ReptileArmorItem.Leggings::new);
	public static final DeferredItem<Item> REPTILE_ARMOR_BOOTS = REGISTRY.register("reptile_armor_boots", ReptileArmorItem.Boots::new);
	public static final DeferredItem<Item> CROCODILE_SCALE = REGISTRY.register("crocodile_scale", CrocodileScaleItem::new);
	public static final DeferredItem<Item> CROCODILE_ARMOR_HELMET = REGISTRY.register("crocodile_armor_helmet", CrocodileArmorItem.Helmet::new);
	public static final DeferredItem<Item> CROCODILE_ARMOR_CHESTPLATE = REGISTRY.register("crocodile_armor_chestplate", CrocodileArmorItem.Chestplate::new);
	public static final DeferredItem<Item> CROCODILE_ARMOR_LEGGINGS = REGISTRY.register("crocodile_armor_leggings", CrocodileArmorItem.Leggings::new);
	public static final DeferredItem<Item> CROCODILE_ARMOR_BOOTS = REGISTRY.register("crocodile_armor_boots", CrocodileArmorItem.Boots::new);
	public static final DeferredItem<Item> CROCODILE_MEAT = REGISTRY.register("crocodile_meat", CrocodileMeatItem::new);
	public static final DeferredItem<Item> CROCODILE_MEAT_COOKED = REGISTRY.register("crocodile_meat_cooked", CrocodileMeatCookedItem::new);
	public static final DeferredItem<Item> MOUSE_MEAT = REGISTRY.register("mouse_meat", MouseMeatItem::new);
	public static final DeferredItem<Item> MOUSE_MEAT_COOKED = REGISTRY.register("mouse_meat_cooked", MouseMeatCookedItem::new);
	public static final DeferredItem<Item> MOUSE_SPAWN_EGG = REGISTRY.register("mouse_spawn_egg", () -> new DeferredSpawnEggItem(HerabowsAnimalsModEntities.MOUSE, -6710887, -13108, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
