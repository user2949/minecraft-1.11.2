public class bod extends bou {
	private final float a;
	private boolean b;

	protected bod(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4, double5, double6, double7);
		this.j = double5;
		this.k = double6;
		this.l = double7;
		this.A = ot.a(this.r, 0.7176471F, 0.8745098F);
		this.B = ot.a(this.r, 0.0F, 0.0F);
		this.C = ot.a(this.r, 0.8235294F, 0.9764706F);
		this.y *= 0.75F;
		this.a = this.y;
		this.x = (int)(20.0 / ((double)this.r.nextFloat() * 0.8 + 0.2));
		this.b = false;
	}

	@Override
	public void a() {
		this.d = this.g;
		this.e = this.h;
		this.f = this.i;
		if (this.w++ >= this.x) {
			this.i();
		} else {
			this.b(3 * this.w / this.x + 5);
			if (this.m) {
				this.k = 0.0;
				this.b = true;
			}

			if (this.b) {
				this.k += 0.002;
			}

			this.a(this.j, this.k, this.l);
			if (this.h == this.e) {
				this.j *= 1.1;
				this.l *= 1.1;
			}

			this.j *= 0.96F;
			this.l *= 0.96F;
			if (this.b) {
				this.k *= 0.96F;
			}
		}
	}

	@Override
	public void a(bpy bpy, sn sn, float float3, float float4, float float5, float float6, float float7, float float8) {
		this.y = this.a * ot.a(((float)this.w + float3) / (float)this.x * 32.0F, 0.0F, 1.0F);
		super.a(bpy, sn, float3, float4, float5, float6, float7, float8);
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bod(ajs, double3, double4, double5, double6, double7, double8);
		}
	}
}
