public class bpa extends bou {
	private final int a;
	private final int b;
	private final float L;
	private float M = 0.91F;
	private float N;
	private float O;
	private float P;
	private boolean Q;

	public bpa(ajs ajs, double double2, double double3, double double4, int integer5, int integer6, float float7) {
		super(ajs, double2, double3, double4);
		this.a = integer5;
		this.b = integer6;
		this.L = float7;
	}

	public void c(int integer) {
		float float3 = (float)((integer & 0xFF0000) >> 16) / 255.0F;
		float float4 = (float)((integer & 0xFF00) >> 8) / 255.0F;
		float float5 = (float)((integer & 0xFF) >> 0) / 255.0F;
		float float6 = 1.0F;
		this.a(float3 * 1.0F, float4 * 1.0F, float5 * 1.0F);
	}

	public void d(int integer) {
		this.N = (float)((integer & 0xFF0000) >> 16) / 255.0F;
		this.O = (float)((integer & 0xFF00) >> 8) / 255.0F;
		this.P = (float)((integer & 0xFF) >> 0) / 255.0F;
		this.Q = true;
	}

	@Override
	public boolean c() {
		return true;
	}

	@Override
	public void a() {
		this.d = this.g;
		this.e = this.h;
		this.f = this.i;
		if (this.w++ >= this.x) {
			this.i();
		}

		if (this.w > this.x / 2) {
			this.e(1.0F - ((float)this.w - (float)(this.x / 2)) / (float)this.x);
			if (this.Q) {
				this.A = this.A + (this.N - this.A) * 0.2F;
				this.B = this.B + (this.O - this.B) * 0.2F;
				this.C = this.C + (this.P - this.C) * 0.2F;
			}
		}

		this.b(this.a + (this.b - 1 - this.w * this.b / this.x));
		this.k = this.k + (double)this.L;
		this.a(this.j, this.k, this.l);
		this.j = this.j * (double)this.M;
		this.k = this.k * (double)this.M;
		this.l = this.l * (double)this.M;
		if (this.m) {
			this.j *= 0.7F;
			this.l *= 0.7F;
		}
	}

	@Override
	public int a(float float1) {
		return 15728880;
	}

	protected void f(float float1) {
		this.M = float1;
	}
}
