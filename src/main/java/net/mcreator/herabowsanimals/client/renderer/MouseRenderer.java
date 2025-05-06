
package net.mcreator.herabowsanimals.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.herabowsanimals.entity.MouseEntity;
import net.mcreator.herabowsanimals.client.model.ModelMouse;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MouseRenderer extends MobRenderer<MouseEntity, ModelMouse<MouseEntity>> {
	public MouseRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMouse<MouseEntity>(context.bakeLayer(ModelMouse.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<MouseEntity, ModelMouse<MouseEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("herabows_animals:textures/entities/mouse.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, MouseEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new ModelMouse(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMouse.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
		this.addLayer(new RenderLayer<MouseEntity, ModelMouse<MouseEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("herabows_animals:textures/entities/mouse_brown.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, MouseEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new ModelMouse(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMouse.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
		this.addLayer(new RenderLayer<MouseEntity, ModelMouse<MouseEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("herabows_animals:textures/entities/mouse_white.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, MouseEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new ModelMouse(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMouse.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MouseEntity entity) {
		return ResourceLocation.parse("herabows_animals:textures/entities/mouse.png");
	}
}
