public class bwn extends bus<zk> {
	public bwn(bur bur) {
		super(bur);
		this.c = 0.5F;
	}

	public void a(zk zk, double double2, double double3, double double4, float float5, float float6) {
		bra bra11 = bes.z().ab();
		bqg.G();
		bqg.c((float)double2, (float)double3 + 0.5F, (float)double4);
		if ((float)zk.l() - float6 + 1.0F < 10.0F) {
			float float12 = 1.0F - ((float)zk.l() - float6 + 1.0F) / 10.0F;
			float12 = ot.a(float12, 0.0F, 1.0F);
			float12 *= float12;
			float12 *= float12;
			float float13 = 1.0F + float12 * 0.3F;
			bqg.b(float13, float13, float13);
		}

		float float12 = (1.0F - ((float)zk.l() - float6 + 1.0F) / 100.0F) * 0.8F;
		this.d(zk);
		bqg.b(-90.0F, 0.0F, 1.0F, 0.0F);
		bqg.c(-0.5F, -0.5F, 0.5F);
		bra11.a(alv.W.t(), zk.e(float6));
		bqg.c(0.0F, 0.0F, 1.0F);
		if (this.e) {
			bqg.h();
			bqg.e(this.c(zk));
			bra11.a(alv.W.t(), 1.0F);
			bqg.n();
			bqg.i();
		} else if (zk.l() / 5 % 2 == 0) {
			bqg.z();
			bqg.g();
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.DST_ALPHA);
			bqg.c(1.0F, 1.0F, 1.0F, float12);
			bqg.a(-3.0F, -3.0F);
			bqg.s();
			bra11.a(alv.W.t(), 1.0F);
			bqg.a(0.0F, 0.0F);
			bqg.t();
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			bqg.l();
			bqg.f();
			bqg.y();
		}

		bqg.H();
		super.a(zk, double2, double3, double4, float5, float6);
	}

	protected kq a(zk zk) {
		return byy.g;
	}
}
