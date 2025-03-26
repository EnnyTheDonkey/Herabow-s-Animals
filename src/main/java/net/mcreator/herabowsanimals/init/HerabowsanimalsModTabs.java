
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

import net.mcreator.herabowsanimals.HerabowsanimalsMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class HerabowsanimalsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HerabowsanimalsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> HB_ANIMALS = REGISTRY.register("hb_animals",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.herabowsanimals.hb_animals")).icon(() -> new ItemStack(Blocks.SLIME_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(HerabowsanimalsModItems.REPTILE_SKIN.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(HerabowsanimalsModItems.REPTILE_ARMOR_HELMET.get());
			tabData.accept(HerabowsanimalsModItems.REPTILE_ARMOR_CHESTPLATE.get());
			tabData.accept(HerabowsanimalsModItems.REPTILE_ARMOR_LEGGINGS.get());
			tabData.accept(HerabowsanimalsModItems.REPTILE_ARMOR_BOOTS.get());
		}
	}
}
