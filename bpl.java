public class bpl extends bou {
	private final sn a;
	private int b;
	private final int L;
	private final de M;

	public bpl(ajs ajs, sn sn, de de) {
		this(ajs, sn, de, 3);
	}

	public bpl(ajs ajs, sn sn, de de, int integer) {
		super(ajs, sn.p, sn.bo().b + (double)(sn.H / 2.0F), sn.r, sn.s, sn.t, sn.u);
		this.a = sn;
		this.L = integer;
		this.M = de;
		this.a();
	}

	@Override
	public void a(bpy bpy, sn sn, float float3, float float4, float float5, float float6, float float7, float float8) {
	}

	@Override
	public void a() {
		for (int integer2 = 0; integer2 < 16; integer2++) {
			double double3 = (double)(this.r.nextFloat() * 2.0F - 1.0F);
			double double5 = (double)(this.r.nextFloat() * 2.0F - 1.0F);
			double double7 = (double)(this.r.nextFloat() * 2.0F - 1.0F);
			if (!(double3 * double3 + double5 * double5 + double7 * double7 > 1.0)) {
				double double9 = this.a.p + double3 * (double)this.a.G / 4.0;
				double double11 = this.a.bo().b + (double)(this.a.H / 2.0F) + double5 * (double)this.a.H / 4.0;
				double double13 = this.a.r + double7 * (double)this.a.G / 4.0;
				this.c.a(this.M, false, double9, double11, double13, double3, double5 + 0.2, double7);
			}
		}

		this.b++;
		if (this.b >= this.L) {
			this.i();
		}
	}

	@Override
	public int b() {
		return 3;
	}
}
