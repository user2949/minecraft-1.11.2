import javax.annotation.concurrent.Immutable;

@Immutable
public class rh {
	private final rg a;
	private final float b;

	public rh(rg rg, long long2, long long3, float float4) {
		this.a = rg;
		this.b = this.a(rg, long2, long3, float4);
	}

	public float b() {
		return this.b;
	}

	public float d() {
		if (this.b < 2.0F) {
			return 0.0F;
		} else {
			return this.b > 4.0F ? 1.0F : (this.b - 2.0F) / 2.0F;
		}
	}

	private float a(rg rg, long long2, long long3, float float4) {
		if (rg == rg.PEACEFUL) {
			return 0.0F;
		} else {
			boolean boolean8 = rg == rg.HARD;
			float float9 = 0.75F;
			float float10 = ot.a(((float)long2 + -72000.0F) / 1440000.0F, 0.0F, 1.0F) * 0.25F;
			float9 += float10;
			float float11 = 0.0F;
			float11 += ot.a((float)long3 / 3600000.0F, 0.0F, 1.0F) * (boolean8 ? 1.0F : 0.75F);
			float11 += ot.a(float4 * 0.25F, 0.0F, float10);
			if (rg == rg.EASY) {
				float11 *= 0.5F;
			}

			float9 += float11;
			return (float)rg.a() * float9;
		}
	}
}
