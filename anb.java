import java.util.EnumSet;
import java.util.Random;
import java.util.Set;

public class anb extends aoq {
	int a;

	protected anb(azs azs) {
		super(azs);
	}

	private void f(ajs ajs, co co, atl atl) {
		ajs.a(co, b(this.x).t().a(b, atl.c(b)), 2);
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		int integer6 = (Integer)atl.c(b);
		int integer7 = 1;
		if (this.x == azs.i && !ajs.s.l()) {
			integer7 = 2;
		}

		int integer8 = this.a(ajs);
		if (integer6 > 0) {
			int integer9 = -100;
			this.a = 0;

			for (cv cv11 : cv.c.HORIZONTAL) {
				integer9 = this.a(ajs, co.a(cv11), integer9);
			}

			int integer10 = integer9 + integer7;
			if (integer10 >= 8 || integer9 < 0) {
				integer10 = -1;
			}

			int integer11 = this.i(ajs.o(co.a()));
			if (integer11 >= 0) {
				if (integer11 >= 8) {
					integer10 = integer11;
				} else {
					integer10 = integer11 + 8;
				}
			}

			if (this.a >= 2 && this.x == azs.h) {
				atl atl12 = ajs.o(co.b());
				if (atl12.a().a()) {
					integer10 = 0;
				} else if (atl12.a() == this.x && (Integer)atl12.c(b) == 0) {
					integer10 = 0;
				}
			}

			if (this.x == azs.i && integer6 < 8 && integer10 < 8 && integer10 > integer6 && random.nextInt(4) != 0) {
				integer8 *= 4;
			}

			if (integer10 == integer6) {
				this.f(ajs, co, atl);
			} else {
				integer6 = integer10;
				if (integer10 < 0) {
					ajs.g(co);
				} else {
					atl = atl.a(b, integer10);
					ajs.a(co, atl, 2);
					ajs.a(co, this, integer8);
					ajs.b(co, this, false);
				}
			}
		} else {
			this.f(ajs, co, atl);
		}

		atl atl9 = ajs.o(co.b());
		if (this.h(ajs, co.b(), atl9)) {
			if (this.x == azs.i && ajs.o(co.b()).a() == azs.h) {
				ajs.a(co.b(), alv.b.t());
				this.b(ajs, co.b());
				return;
			}

			if (integer6 >= 8) {
				this.a(ajs, co.b(), atl9, integer6);
			} else {
				this.a(ajs, co.b(), atl9, integer6 + 8);
			}
		} else if (integer6 >= 0 && (integer6 == 0 || this.g(ajs, co.b(), atl9))) {
			Set<cv> set10 = this.c(ajs, co);
			int integer11x = integer6 + integer7;
			if (integer6 >= 8) {
				integer11x = 1;
			}

			if (integer11x >= 8) {
				return;
			}

			for (cv cv13 : set10) {
				this.a(ajs, co.a(cv13), ajs.o(co.a(cv13)), integer11x);
			}
		}
	}

	private void a(ajs ajs, co co, atl atl, int integer) {
		if (this.h(ajs, co, atl)) {
			if (atl.a() != azs.a) {
				if (this.x == azs.i) {
					this.b(ajs, co);
				} else {
					atl.v().b(ajs, co, atl, 0);
				}
			}

			ajs.a(co, this.t().a(b, integer), 3);
		}
	}

	private int a(ajs ajs, co co, int integer, cv cv) {
		int integer6 = 1000;

		for (cv cv8 : cv.c.HORIZONTAL) {
			if (cv8 != cv) {
				co co9 = co.a(cv8);
				atl atl10 = ajs.o(co9);
				if (!this.g(ajs, co9, atl10) && (atl10.a() != this.x || (Integer)atl10.c(b) > 0)) {
					if (!this.g(ajs, co9.b(), atl10)) {
						return integer;
					}

					if (integer < this.b(ajs)) {
						int integer11 = this.a(ajs, co9, integer + 1, cv8.d());
						if (integer11 < integer6) {
							integer6 = integer11;
						}
					}
				}
			}
		}

		return integer6;
	}

	private int b(ajs ajs) {
		return this.x == azs.i && !ajs.s.l() ? 2 : 4;
	}

	private Set<cv> c(ajs ajs, co co) {
		int integer4 = 1000;
		Set<cv> set5 = EnumSet.noneOf(cv.class);

		for (cv cv7 : cv.c.HORIZONTAL) {
			co co8 = co.a(cv7);
			atl atl9 = ajs.o(co8);
			if (!this.g(ajs, co8, atl9) && (atl9.a() != this.x || (Integer)atl9.c(b) > 0)) {
				int integer10;
				if (this.g(ajs, co8.b(), ajs.o(co8.b()))) {
					integer10 = this.a(ajs, co8, 1, cv7.d());
				} else {
					integer10 = 0;
				}

				if (integer10 < integer4) {
					set5.clear();
				}

				if (integer10 <= integer4) {
					set5.add(cv7);
					integer4 = integer10;
				}
			}
		}

		return set5;
	}

	private boolean g(ajs ajs, co co, atl atl) {
		alu alu5 = ajs.o(co).v();
		if (alu5 instanceof amx || alu5 == alv.an || alu5 == alv.au || alu5 == alv.aM) {
			return true;
		} else {
			return alu5.x != azs.E && alu5.x != azs.J ? alu5.x.c() : true;
		}
	}

	protected int a(ajs ajs, co co, int integer) {
		int integer5 = this.i(ajs.o(co));
		if (integer5 < 0) {
			return integer;
		} else {
			if (integer5 == 0) {
				this.a++;
			}

			if (integer5 >= 8) {
				integer5 = 0;
			}

			return integer >= 0 && integer5 >= integer ? integer : integer5;
		}
	}

	private boolean h(ajs ajs, co co, atl atl) {
		azs azs5 = atl.a();
		return azs5 != this.x && azs5 != azs.i && !this.g(ajs, co, atl);
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		if (!this.e(ajs, co, atl)) {
			ajs.a(co, this, this.a(ajs));
		}
	}
}
