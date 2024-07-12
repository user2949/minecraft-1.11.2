import java.util.Random;

public class akx extends alb {
	public akx(akf.a a) {
		super(a);
		this.t.z = 2;
		this.t.B = 2;
		this.t.C = 5;
	}

	@Override
	public void a(ajs ajs, Random random, avp avp, int integer4, int integer5, double double6) {
		this.r = alv.c.t();
		this.s = alv.d.t();
		if (double6 > 1.75) {
			this.r = alv.b.t();
			this.s = alv.b.t();
		} else if (double6 > -0.5) {
			this.r = alv.d.t().a(amv.a, amv.a.COARSE_DIRT);
		}

		this.b(ajs, random, avp, integer4, integer5, double6);
	}

	@Override
	public void a(ajs ajs, Random random, co co) {
		this.t.a(ajs, random, this, co);
	}
}
