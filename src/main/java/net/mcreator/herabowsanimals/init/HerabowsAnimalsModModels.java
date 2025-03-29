
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.herabowsanimals.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.herabowsanimals.client.model.ModelSnake;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HerabowsAnimalsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelSnake.LAYER_LOCATION, ModelSnake::createBodyLayer);
	}
}
