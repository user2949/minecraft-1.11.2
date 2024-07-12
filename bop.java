public class bop extends bou {
	private final sn a;
	private final sn b;
	private int L;
	private final int M;
	private final float N;
	private final bur O = bes.z().ac();

	public bop(ajs ajs, sn sn2, sn sn3, float float4) {
		super(ajs, sn2.p, sn2.q, sn2.r, sn2.s, sn2.t, sn2.u);
		this.a = sn2;
		this.b = sn3;
		this.M = 3;
		this.N = float4;
	}

	@Override
	public void a(bpy bpy, sn sn, float float3, float float4, float float5, float float6, float float7, float float8) {
		float float10 = ((float)this.L + float3) / (float)this.M;
		float10 *= float10;
		double double11 = this.a.p;
		double double13 = this.a.q;
		double double15 = this.a.r;
		double double17 = this.b.M + (this.b.p - this.b.M) * (double)float3;
		double double19 = this.b.N + (this.b.q - this.b.N) * (double)float3 + (double)this.N;
		double double21 = this.b.O + (this.b.r - this.b.O) * (double)float3;
		double double23 = double11 + (double17 - double11) * (double)float10;
		double double25 = double13 + (double19 - double13) * (double)float10;
		double double27 = double15 + (double21 - double15) * (double)float10;
		int integer29 = this.a(float3);
		int integer30 = integer29 % 65536;
		int integer31 = integer29 / 65536;
		cdb.a(cdb.r, (float)integer30, (float)integer31);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		double23 -= H;
		double25 -= I;
		double27 -= J;
		bqg.f();
		this.O.a(this.a, double23, double25, double27, this.a.v, float3, false);
	}

	@Override
	public void a() {
		this.L++;
		if (this.L == this.M) {
			this.i();
		}
	}

	@Override
	public int b() {
		return 3;
	}
}
