public class boz extends bou {
	float a;

	protected boz(ajs ajs, double double2, double double3, double double4, float float5, float float6, float float7) {
		this(ajs, double2, double3, double4, 1.0F, float5, float6, float7);
	}

	protected boz(ajs ajs, double double2, double double3, double double4, float float5, float float6, float float7, float float8) {
		super(ajs, double2, double3, double4, 0.0, 0.0, 0.0);
		this.j *= 0.1F;
		this.k *= 0.1F;
		this.l *= 0.1F;
		if (float6 == 0.0F) {
			float6 = 1.0F;
		}

		float float13 = (float)Math.random() * 0.4F + 0.6F;
		this.A = ((float)(Math.random() * 0.2F) + 0.8F) * float6 * float13;
		this.B = ((float)(Math.random() * 0.2F) + 0.8F) * float7 * float13;
		this.C = ((float)(Math.random() * 0.2F) + 0.8F) * float8 * float13;
		this.y *= 0.75F;
		this.y *= float5;
		this.a = this.y;
		this.x = (int)(8.0 / (Math.random() * 0.8 + 0.2));
		this.x = (int)((float)this.x * float5);
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

		this.b(7 - this.w * 8 / this.x);
		this.a(this.j, this.k, this.l);
		if (this.h == this.e) {
			this.j *= 1.1;
			this.l *= 1.1;
		}

		this.j *= 0.96F;
		this.k *= 0.96F;
		this.l *= 0.96F;
		if (this.m) {
			this.j *= 0.7F;
			this.l *= 0.7F;
		}
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new boz(ajs, double3, double4, double5, (float)double6, (float)double7, (float)double8);
		}
	}
}
