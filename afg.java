import com.google.common.collect.Multimap;

public class afg extends afh {
	private final float b;
	protected afh.a a;

	public afg(afh.a a) {
		this.a = a;
		this.k = 1;
		this.e(a.a());
		this.a(aej.i);
		this.b = a.c() + 1.0F;
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		afj afj10 = aay.b(ri);
		if (!aay.a(co.a(cv), cv, afj10)) {
			return rk.FAIL;
		} else {
			atl atl11 = ajs.o(co);
			alu alu12 = atl11.v();
			if (cv != cv.DOWN && ajs.o(co.a()).a() == azs.a) {
				if (alu12 == alv.c || alu12 == alv.da) {
					this.a(afj10, aay, ajs, co, alv.ak.t());
					return rk.SUCCESS;
				}

				if (alu12 == alv.d) {
					switch ((amv.a)atl11.c(amv.a)) {
						case DIRT:
							this.a(afj10, aay, ajs, co, alv.ak.t());
							return rk.SUCCESS;
						case COARSE_DIRT:
							this.a(afj10, aay, ajs, co, alv.d.t().a(amv.a, amv.a.DIRT));
							return rk.SUCCESS;
					}
				}
			}

			return rk.PASS;
		}
	}

	@Override
	public boolean a(afj afj, sw sw2, sw sw3) {
		afj.a(1, sw3);
		return true;
	}

	protected void a(afj afj, aay aay, ajs ajs, co co, atl atl) {
		ajs.a(aay, co, nn.cy, no.BLOCKS, 1.0F, 1.0F);
		if (!ajs.E) {
			ajs.a(co, atl, 11);
			afj.a(1, aay);
		}
	}

	@Override
	public boolean C_() {
		return true;
	}

	public String g() {
		return this.a.toString();
	}

	@Override
	public Multimap<String, tl> a(ss ss) {
		Multimap<String, tl> multimap3 = super.a(ss);
		if (ss == ss.MAINHAND) {
			multimap3.put(aad.e.a(), new tl(h, "Weapon modifier", 0.0, 0));
			multimap3.put(aad.f.a(), new tl(i, "Weapon modifier", (double)(this.b - 4.0F), 0));
		}

		return multimap3;
	}
}
