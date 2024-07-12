public class agl extends adv {
	private final aob b;
	private final aob c;

	public agl(alu alu, aob aob2, aob aob3) {
		super(alu);
		this.b = aob2;
		this.c = aob3;
		this.e(0);
		this.a(true);
	}

	@Override
	public int a(int integer) {
		return integer;
	}

	@Override
	public String a(afj afj) {
		return this.b.e(afj.j());
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		afj afj10 = aay.b(ri);
		if (!afj10.b() && aay.a(co.a(cv), cv, afj10)) {
			Comparable<?> comparable11 = this.b.a(afj10);
			atl atl12 = ajs.o(co);
			if (atl12.v() == this.b) {
				aub<?> aub13 = this.b.g();
				Comparable<?> comparable14 = atl12.c((aub<Comparable<?>>)aub13);
				aob.a a15 = atl12.c(aob.a);
				if ((cv == cv.UP && a15 == aob.a.BOTTOM || cv == cv.DOWN && a15 == aob.a.TOP) && comparable14 == comparable11) {
					atl atl16 = this.a(aub13, comparable14);
					bdt bdt17 = atl16.c((ajw)ajs, co);
					if (bdt17 != alu.k && ajs.b(bdt17.a(co)) && ajs.a(co, atl16, 11)) {
						aqu aqu18 = this.c.v();
						ajs.a(aay, co, aqu18.e(), no.BLOCKS, (aqu18.a() + 1.0F) / 2.0F, aqu18.b() * 0.8F);
						afj10.g(1);
					}

					return rk.SUCCESS;
				}
			}

			return this.a(aay, afj10, ajs, co.a(cv), comparable11) ? rk.SUCCESS : super.a(aay, ajs, co, ri, cv, float6, float7, float8);
		} else {
			return rk.FAIL;
		}
	}

	@Override
	public boolean a(ajs ajs, co co, cv cv, aay aay, afj afj) {
		aub<?> aub8 = this.b.g();
		Comparable<?> comparable9 = this.b.a(afj);
		atl atl10 = ajs.o(co);
		if (atl10.v() == this.b) {
			boolean boolean11 = atl10.c(aob.a) == aob.a.TOP;
			if ((cv == cv.UP && !boolean11 || cv == cv.DOWN && boolean11) && comparable9 == atl10.c(aub8)) {
				return true;
			}
		}

		co var11 = co.a(cv);
		atl atl11 = ajs.o(var11);
		return atl11.v() == this.b && comparable9 == atl11.c(aub8) ? true : super.a(ajs, co, cv, aay, afj);
	}

	private boolean a(aay aay, afj afj, ajs ajs, co co, Object object) {
		atl atl7 = ajs.o(co);
		if (atl7.v() == this.b) {
			Comparable<?> comparable8 = atl7.c((aub<Comparable<?>>)this.b.g());
			if (comparable8 == object) {
				atl atl9 = this.a(this.b.g(), comparable8);
				bdt bdt10 = atl9.c((ajw)ajs, co);
				if (bdt10 != alu.k && ajs.b(bdt10.a(co)) && ajs.a(co, atl9, 11)) {
					aqu aqu11 = this.c.v();
					ajs.a(aay, co, aqu11.e(), no.BLOCKS, (aqu11.a() + 1.0F) / 2.0F, aqu11.b() * 0.8F);
					afj.g(1);
				}

				return true;
			}
		}

		return false;
	}

	protected <T extends Comparable<T>> atl a(aub<T> aub, Comparable<?> comparable) {
		return this.c.t().a(aub, comparable);
	}
}
