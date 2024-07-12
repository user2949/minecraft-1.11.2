public class bot extends bou {
	float a;

	protected bot(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		this(ajs, double2, double3, double4, double5, double6, double7, 2.0F);
	}

	protected bot(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7, float float8) {
		super(ajs, double2, double3, double4, 0.0, 0.0, 0.0);
		this.j *= 0.01F;
		this.k *= 0.01F;
		this.l *= 0.01F;
		this.k += 0.2;
		this.A = ot.a(((float)double5 + 0.0F) * (float) (Math.PI * 2)) * 0.65F + 0.35F;
		this.B = ot.a(((float)double5 + 0.33333334F) * (float) (Math.PI * 2)) * 0.65F + 0.35F;
		this.C = ot.a(((float)double5 + 0.6666667F) * (float) (Math.PI * 2)) * 0.65F + 0.35F;
		this.y *= 0.75F;
		this.y *= float8;
		this.a = this.y;
		this.x = 6;
		this.b(64);
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

		this.a(this.j, this.k, this.l);
		if (this.h == this.e) {
			this.j *= 1.1;
			this.l *= 1.1;
		}

		this.j *= 0.66F;
		this.k *= 0.66F;
		this.l *= 0.66F;
		if (this.m) {
			this.j *= 0.7F;
			this.l *= 0.7F;
		}
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bot(ajs, double3, double4, double5, double6, double7, double8);
		}
	}
}
