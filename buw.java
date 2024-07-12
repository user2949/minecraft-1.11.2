public class buw extends bus<zi> {
	public buw(bur bur) {
		super(bur);
		this.c = 0.5F;
	}

	public void a(zi zi, double double2, double double3, double double4, float float5, float float6) {
		if (zi.l() != null) {
			atl atl11 = zi.l();
			if (atl11.j() == aqf.MODEL) {
				ajs ajs12 = zi.k();
				if (atl11 != ajs12.o(new co(zi)) && atl11.j() != aqf.INVISIBLE) {
					this.a(byy.g);
					bqg.G();
					bqg.g();
					bqs bqs13 = bqs.a();
					bpy bpy14 = bqs13.c();
					if (this.e) {
						bqg.h();
						bqg.e(this.c(zi));
					}

					bpy14.a(7, bzh.a);
					co co15 = new co(zi.p, zi.bo().e, zi.r);
					bqg.c((float)(double2 - (double)co15.p() - 0.5), (float)(double3 - (double)co15.q()), (float)(double4 - (double)co15.r() - 0.5));
					bra bra16 = bes.z().ab();
					bra16.b().a(ajs12, bra16.a(atl11), atl11, co15, bpy14, false, ot.a(zi.j()));
					bqs13.b();
					if (this.e) {
						bqg.n();
						bqg.i();
					}

					bqg.f();
					bqg.H();
					super.a(zi, double2, double3, double4, float5, float6);
				}
			}
		}
	}

	protected kq a(zi zi) {
		return byy.g;
	}
}
