import javax.annotation.Nullable;

public class yk extends yd {
	private bdw b;

	public yk(yb yb) {
		super(yb);
	}

	@Override
	public void b() {
		bdw bdw2 = this.a.a(1.0F).a();
		bdw2.b((float) (-Math.PI / 4));
		double double3 = this.a.bv.p;
		double double5 = this.a.bv.q + (double)(this.a.bv.H / 2.0F);
		double double7 = this.a.bv.r;

		for (int integer9 = 0; integer9 < 8; integer9++) {
			double double10 = double3 + this.a.bJ().nextGaussian() / 2.0;
			double double12 = double5 + this.a.bJ().nextGaussian() / 2.0;
			double double14 = double7 + this.a.bJ().nextGaussian() / 2.0;
			this.a.l.a(de.DRAGON_BREATH, double10, double12, double14, -bdw2.b * 0.08F + this.a.s, -bdw2.c * 0.3F + this.a.t, -bdw2.d * 0.08F + this.a.u);
			bdw2.b((float) (Math.PI / 16));
		}
	}

	@Override
	public void c() {
		if (this.b == null) {
			this.b = new bdw(this.a.l.q(awm.a));
		}

		if (this.b.c(this.a.p, this.a.q, this.a.r) < 1.0) {
			this.a.da().b(yr.f).j();
			this.a.da().a(yr.g);
		}
	}

	@Override
	public float f() {
		return 1.5F;
	}

	@Override
	public float h() {
		float float2 = ot.a(this.a.s * this.a.s + this.a.u * this.a.u) + 1.0F;
		float float3 = Math.min(float2, 40.0F);
		return float3 / float2;
	}

	@Override
	public void d() {
		this.b = null;
	}

	@Nullable
	@Override
	public bdw g() {
		return this.b;
	}

	@Override
	public yr<yk> i() {
		return yr.d;
	}
}
