public class agm extends adv {
	public agm(alu alu) {
		super(alu);
		this.e(0);
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		afj afj10 = aay.b(ri);
		if (!afj10.b() && aay.a(co, cv, afj10)) {
			atl atl11 = ajs.o(co);
			alu alu12 = atl11.v();
			co co13 = co;
			if ((cv != cv.UP || alu12 != this.a) && !alu12.a((ajw)ajs, co)) {
				co13 = co.a(cv);
				atl11 = ajs.o(co13);
				alu12 = atl11.v();
			}

			if (alu12 == this.a) {
				int integer14 = (Integer)atl11.c(aqs.a);
				if (integer14 < 8) {
					atl atl15 = atl11.a(aqs.a, integer14 + 1);
					bdt bdt16 = atl15.c((ajw)ajs, co13);
					if (bdt16 != alu.k && ajs.b(bdt16.a(co13)) && ajs.a(co13, atl15, 10)) {
						aqu aqu17 = this.a.v();
						ajs.a(aay, co13, aqu17.e(), no.BLOCKS, (aqu17.a() + 1.0F) / 2.0F, aqu17.b() * 0.8F);
						afj10.g(1);
						return rk.SUCCESS;
					}
				}
			}

			return super.a(aay, ajs, co, ri, cv, float6, float7, float8);
		} else {
			return rk.FAIL;
		}
	}

	@Override
	public int a(int integer) {
		return integer;
	}
}
