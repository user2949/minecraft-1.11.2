public class bfr extends bfm {
	private float p = 1.0F;
	public boolean o;
	private final String q;
	private final float r;
	private final float s;
	private final bgb.b t;
	private bfr.a u;

	public bfr(bgb.b b, int integer2, int integer3, int integer4, String string, float float6, float float7, float float8, bfr.a a) {
		super(integer2, integer3, integer4, 150, 20, "");
		this.q = string;
		this.r = float6;
		this.s = float7;
		this.p = (float8 - float6) / (float7 - float6);
		this.u = a;
		this.t = b;
		this.j = this.e();
	}

	public float c() {
		return this.r + (this.s - this.r) * this.p;
	}

	public void a(float float1, boolean boolean2) {
		this.p = (float1 - this.r) / (this.s - this.r);
		this.j = this.e();
		if (boolean2) {
			this.t.a(this.k, this.c());
		}
	}

	public float d() {
		return this.p;
	}

	private String e() {
		return this.u == null ? cah.a(this.q) + ": " + this.c() : this.u.a(this.k, cah.a(this.q), this.c());
	}

	@Override
	protected int a(boolean boolean1) {
		return 0;
	}

	@Override
	protected void b(bes bes, int integer2, int integer3) {
		if (this.m) {
			if (this.o) {
				this.p = (float)(integer2 - (this.h + 4)) / (float)(this.f - 8);
				if (this.p < 0.0F) {
					this.p = 0.0F;
				}

				if (this.p > 1.0F) {
					this.p = 1.0F;
				}

				this.j = this.e();
				this.t.a(this.k, this.c());
			}

			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			this.b(this.h + (int)(this.p * (float)(this.f - 8)), this.i, 0, 66, 4, 20);
			this.b(this.h + (int)(this.p * (float)(this.f - 8)) + 4, this.i, 196, 66, 4, 20);
		}
	}

	public void a(float float1) {
		this.p = float1;
		this.j = this.e();
		this.t.a(this.k, this.c());
	}

	@Override
	public boolean c(bes bes, int integer2, int integer3) {
		if (super.c(bes, integer2, integer3)) {
			this.p = (float)(integer2 - (this.h + 4)) / (float)(this.f - 8);
			if (this.p < 0.0F) {
				this.p = 0.0F;
			}

			if (this.p > 1.0F) {
				this.p = 1.0F;
			}

			this.j = this.e();
			this.t.a(this.k, this.c());
			this.o = true;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void a(int integer1, int integer2) {
		this.o = false;
	}

	public interface a {
		String a(int integer, String string, float float3);
	}
}
