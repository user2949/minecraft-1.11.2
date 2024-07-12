public class bpc extends bou {
	float a;

	protected bpc(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		this(ajs, double2, double3, double4, double5, double6, double7, 1.0F);
	}

	protected bpc(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7, float float8) {
		super(ajs, double2, double3, double4, double5, double6, double7);
		this.j *= 0.1F;
		this.k *= 0.1F;
		this.l *= 0.1F;
		this.j += double5;
		this.k += double6;
		this.l += double7;
		float float16 = 1.0F - (float)(Math.random() * 0.3F);
		this.A = float16;
		this.B = float16;
		this.C = float16;
		this.y *= 0.75F;
		this.y *= float8;
		this.a = this.y;
		this.x = (int)(8.0 / (Math.random() * 0.8 + 0.2));
		this.x = (int)((float)this.x * float8);
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
		this.k -= 0.03;
		this.a(this.j, this.k, this.l);
		this.j *= 0.99F;
		this.k *= 0.99F;
		this.l *= 0.99F;
		if (this.m) {
			this.j *= 0.7F;
			this.l *= 0.7F;
		}
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bpc(ajs, double3, double4, double5, double6, double7, double8);
		}
	}
}
