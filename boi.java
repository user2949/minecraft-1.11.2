import javax.annotation.Nullable;

public class boi extends bou {
	float a;
	final float b;

	protected boi(ajs ajs, double double2, double double3, double double4, float float5, float float6, float float7) {
		super(ajs, double2, double3, double4, 0.0, 0.0, 0.0);
		this.j = 0.0;
		this.k = 0.0;
		this.l = 0.0;
		this.A = float5;
		this.B = float6;
		this.C = float7;
		float float12 = 0.9F;
		this.y *= 0.75F;
		this.y *= 0.9F;
		this.a = this.y;
		this.x = (int)(32.0 / (Math.random() * 0.8 + 0.2));
		this.x = (int)((float)this.x * 0.9F);
		this.b = ((float)Math.random() - 0.5F) * 0.1F;
		this.F = (float)Math.random() * (float) (Math.PI * 2);
	}

	@Override
	public void a(bpy bpy, sn sn, float float3, float float4, float float5, float float6, float float7, float float8) {
		float float10 = ((float)this.w + float3) / (float)this.x * 32.0F;
		float10 = ot.a(float10, 0.0F, 1.0F);
		this.y = this.a * float10;
		super.a(bpy, sn, float3, float4, float5, float6, float7, float8);
	}

	@Override
	public void a() {
		this.d = this.g;
		this.e = this.h;
		this.f = this.i;
		if (this.w++ >= this.x) {
			this.i();
		}

		this.G = this.F;
		this.F = this.F + (float) Math.PI * this.b * 2.0F;
		if (this.m) {
			this.G = this.F = 0.0F;
		}

		this.b(7 - this.w * 8 / this.x);
		this.a(this.j, this.k, this.l);
		this.k -= 0.003F;
		this.k = Math.max(this.k, -0.14F);
	}

	public static class a implements bow {
		@Nullable
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			atl atl17 = alu.c(arr[0]);
			if (atl17.v() != alv.a && atl17.j() == aqf.INVISIBLE) {
				return null;
			} else {
				int integer18 = bes.z().ak().a(atl17);
				if (atl17.v() instanceof anj) {
					integer18 = ((anj)atl17.v()).z(atl17);
				}

				float float19 = (float)(integer18 >> 16 & 0xFF) / 255.0F;
				float float20 = (float)(integer18 >> 8 & 0xFF) / 255.0F;
				float float21 = (float)(integer18 & 0xFF) / 255.0F;
				return new boi(ajs, double3, double4, double5, float19, float20, float21);
			}
		}
	}
}
