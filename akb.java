import javax.annotation.Nullable;

public class akb implements ajw {
	protected int a;
	protected int b;
	protected auo[][] c;
	protected boolean d;
	protected ajs e;

	public akb(ajs ajs, co co2, co co3, int integer) {
		this.e = ajs;
		this.a = co2.p() - integer >> 4;
		this.b = co2.r() - integer >> 4;
		int integer6 = co3.p() + integer >> 4;
		int integer7 = co3.r() + integer >> 4;
		this.c = new auo[integer6 - this.a + 1][integer7 - this.b + 1];
		this.d = true;

		for (int integer8 = this.a; integer8 <= integer6; integer8++) {
			for (int integer9 = this.b; integer9 <= integer7; integer9++) {
				this.c[integer8 - this.a][integer9 - this.b] = ajs.a(integer8, integer9);
			}
		}

		for (int integer8 = co2.p() >> 4; integer8 <= co3.p() >> 4; integer8++) {
			for (int integer9 = co2.r() >> 4; integer9 <= co3.r() >> 4; integer9++) {
				auo auo10 = this.c[integer8 - this.a][integer9 - this.b];
				if (auo10 != null && !auo10.c(co2.q(), co3.q())) {
					this.d = false;
				}
			}
		}
	}

	public boolean aa() {
		return this.d;
	}

	@Nullable
	@Override
	public asc r(co co) {
		return this.a(co, auo.a.IMMEDIATE);
	}

	@Nullable
	public asc a(co co, auo.a a) {
		int integer4 = (co.p() >> 4) - this.a;
		int integer5 = (co.r() >> 4) - this.b;
		return this.c[integer4][integer5].a(co, a);
	}

	@Override
	public int b(co co, int integer) {
		int integer4 = this.a(ajy.SKY, co);
		int integer5 = this.a(ajy.BLOCK, co);
		if (integer5 < integer) {
			integer5 = integer;
		}

		return integer4 << 20 | integer5 << 4;
	}

	@Override
	public atl o(co co) {
		if (co.q() >= 0 && co.q() < 256) {
			int integer3 = (co.p() >> 4) - this.a;
			int integer4 = (co.r() >> 4) - this.b;
			if (integer3 >= 0 && integer3 < this.c.length && integer4 >= 0 && integer4 < this.c[integer3].length) {
				auo auo5 = this.c[integer3][integer4];
				if (auo5 != null) {
					return auo5.a(co);
				}
			}
		}

		return alv.a.t();
	}

	@Override
	public akf b(co co) {
		int integer3 = (co.p() >> 4) - this.a;
		int integer4 = (co.r() >> 4) - this.b;
		return this.c[integer3][integer4].a(co, this.e.A());
	}

	private int a(ajy ajy, co co) {
		if (ajy == ajy.SKY && !this.e.s.m()) {
			return 0;
		} else if (co.q() >= 0 && co.q() < 256) {
			if (this.o(co).f()) {
				int integer4 = 0;

				for (cv cv8 : cv.values()) {
					int integer9 = this.b(ajy, co.a(cv8));
					if (integer9 > integer4) {
						integer4 = integer9;
					}

					if (integer4 >= 15) {
						return integer4;
					}
				}

				return integer4;
			} else {
				int integer4 = (co.p() >> 4) - this.a;
				int integer5 = (co.r() >> 4) - this.b;
				return this.c[integer4][integer5].a(ajy, co);
			}
		} else {
			return ajy.c;
		}
	}

	@Override
	public boolean d(co co) {
		return this.o(co).a() == azs.a;
	}

	public int b(ajy ajy, co co) {
		if (co.q() >= 0 && co.q() < 256) {
			int integer4 = (co.p() >> 4) - this.a;
			int integer5 = (co.r() >> 4) - this.b;
			return this.c[integer4][integer5].a(ajy, co);
		} else {
			return ajy.c;
		}
	}

	@Override
	public int a(co co, cv cv) {
		return this.o(co).b(this, co, cv);
	}

	@Override
	public ajx L() {
		return this.e.L();
	}
}
