package net.minecraft.realms;

public class RealmsSliderButton extends RealmsButton {
	public float value = 1.0F;
	public boolean sliding;
	private final float minValue;
	private final float maxValue;
	private int steps;

	public RealmsSliderButton(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		this(integer1, integer2, integer3, integer4, integer6, 0, 1.0F, (float)integer5);
	}

	public RealmsSliderButton(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, float float7, float float8) {
		super(integer1, integer2, integer3, integer4, 20, "");
		this.minValue = float7;
		this.maxValue = float8;
		this.value = this.toPct((float)integer6);
		this.getProxy().j = this.getMessage();
	}

	public String getMessage() {
		return "";
	}

	public float toPct(float float1) {
		return ot.a((this.clamp(float1) - this.minValue) / (this.maxValue - this.minValue), 0.0F, 1.0F);
	}

	public float toValue(float float1) {
		return this.clamp(this.minValue + (this.maxValue - this.minValue) * ot.a(float1, 0.0F, 1.0F));
	}

	public float clamp(float float1) {
		float1 = this.clampSteps(float1);
		return ot.a(float1, this.minValue, this.maxValue);
	}

	protected float clampSteps(float float1) {
		if (this.steps > 0) {
			float1 = (float)(this.steps * Math.round(float1 / (float)this.steps));
		}

		return float1;
	}

	@Override
	public int getYImage(boolean boolean1) {
		return 0;
	}

	@Override
	public void renderBg(int integer1, int integer2) {
		if (this.getProxy().m) {
			if (this.sliding) {
				this.value = (float)(integer1 - (this.getProxy().h + 4)) / (float)(this.getProxy().b() - 8);
				this.value = ot.a(this.value, 0.0F, 1.0F);
				float float4 = this.toValue(this.value);
				this.clicked(float4);
				this.value = this.toPct(float4);
				this.getProxy().j = this.getMessage();
			}

			bes.z().N().a(WIDGETS_LOCATION);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			this.blit(this.getProxy().h + (int)(this.value * (float)(this.getProxy().b() - 8)), this.getProxy().i, 0, 66, 4, 20);
			this.blit(this.getProxy().h + (int)(this.value * (float)(this.getProxy().b() - 8)) + 4, this.getProxy().i, 196, 66, 4, 20);
		}
	}

	@Override
	public void clicked(int integer1, int integer2) {
		this.value = (float)(integer1 - (this.getProxy().h + 4)) / (float)(this.getProxy().b() - 8);
		this.value = ot.a(this.value, 0.0F, 1.0F);
		this.clicked(this.toValue(this.value));
		this.getProxy().j = this.getMessage();
		this.sliding = true;
	}

	public void clicked(float float1) {
	}

	@Override
	public void released(int integer1, int integer2) {
		this.sliding = false;
	}
}
