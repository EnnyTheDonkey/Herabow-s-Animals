package net.mcreator.herabowsanimals.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.herabowsanimals.entity.MouseEntity;

public class MouseModel extends GeoModel<MouseEntity> {
	@Override
	public ResourceLocation getAnimationResource(MouseEntity entity) {
		return ResourceLocation.parse("herabows_animals:animations/mouse.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MouseEntity entity) {
		return ResourceLocation.parse("herabows_animals:geo/mouse.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MouseEntity entity) {
		return ResourceLocation.parse("herabows_animals:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(MouseEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
