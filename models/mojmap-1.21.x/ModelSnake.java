// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSnake<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "snake"), "main");
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart seg1;
	private final ModelPart seg2;
	private final ModelPart seg3;
	private final ModelPart seg4;
	private final ModelPart seg5;
	private final ModelPart seg6;
	private final ModelPart bb_main;

	public ModelSnake(ModelPart root) {
		this.head = root.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.seg1 = root.getChild("seg1");
		this.seg2 = root.getChild("seg2");
		this.seg3 = root.getChild("seg3");
		this.seg4 = root.getChild("seg4");
		this.seg5 = root.getChild("seg5");
		this.seg6 = root.getChild("seg6");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-12.0F, -2.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(13, 8).addBox(-12.0F, -1.0F,
				-1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition seg1 = partdefinition.addOrReplaceChild("seg1", CubeListBuilder.create().texOffs(0, 9).addBox(
				-8.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition seg2 = partdefinition.addOrReplaceChild("seg2", CubeListBuilder.create().texOffs(0, 9).addBox(
				-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition seg3 = partdefinition.addOrReplaceChild("seg3", CubeListBuilder.create().texOffs(0, 9).addBox(
				0.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition seg4 = partdefinition.addOrReplaceChild("seg4", CubeListBuilder.create().texOffs(0, 9).addBox(
				4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition seg5 = partdefinition.addOrReplaceChild("seg5", CubeListBuilder.create().texOffs(0, 9).addBox(
				8.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition seg6 = partdefinition.addOrReplaceChild("seg6", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 9)
				.addBox(12.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		seg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		seg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		seg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		seg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		seg5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		seg6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.jaw.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.bb_main.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.seg6.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.seg5.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.seg2.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.seg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.seg4.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.seg3.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}