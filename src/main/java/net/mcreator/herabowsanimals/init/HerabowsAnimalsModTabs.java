
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.herabowsanimals.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.herabowsanimals.HerabowsAnimalsMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class HerabowsAnimalsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HerabowsAnimalsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> HB_ANIMALS = REGISTRY.register("hb_animals",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.herabows_animals.hb_animals")).icon(() -> new ItemStack(Blocks.SLIME_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(HerabowsAnimalsModItems.CROCODILE_SCALE.get());
				tabData.accept(HerabowsAnimalsModItems.REPTILE_SKIN.get());
				tabData.accept(HerabowsAnimalsModItems.CROCODILE_MEAT.get());
				tabData.accept(HerabowsAnimalsModItems.CROCODILE_MEAT_COOKED.get());
				tabData.accept(HerabowsAnimalsModItems.MOUSE_MEAT.get());
				tabData.accept(HerabowsAnimalsModItems.MOUSE_MEAT_COOKED.get());
				tabData.accept(HerabowsAnimalsModItems.REPTILE_ARMOR_HELMET.get());
				tabData.accept(HerabowsAnimalsModItems.REPTILE_ARMOR_CHESTPLATE.get());
				tabData.accept(HerabowsAnimalsModItems.REPTILE_ARMOR_LEGGINGS.get());
				tabData.accept(HerabowsAnimalsModItems.REPTILE_ARMOR_BOOTS.get());
				tabData.accept(HerabowsAnimalsModItems.CROCODILE_ARMOR_HELMET.get());
				tabData.accept(HerabowsAnimalsModItems.CROCODILE_ARMOR_CHESTPLATE.get());
				tabData.accept(HerabowsAnimalsModItems.CROCODILE_ARMOR_LEGGINGS.get());
				tabData.accept(HerabowsAnimalsModItems.CROCODILE_ARMOR_BOOTS.get());
				tabData.accept(HerabowsAnimalsModItems.MOUSE_SPAWN_EGG.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(HerabowsAnimalsModItems.MOUSE_SPAWN_EGG.get());
		}
	}
}
