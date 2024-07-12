public class we extends wf {
	private boolean f;

	public we(sx sx, ajs ajs) {
		super(sx, ajs);
	}

	@Override
	protected bbe a() {
		this.e = new bbg();
		this.e.a(true);
		return new bbe(this.e);
	}

	@Override
	protected boolean b() {
		return this.a.z || this.g() && this.p() || this.a.aK();
	}

	@Override
	protected bdw c() {
		return new bdw(this.a.p, (double)this.r(), this.a.r);
	}

	@Override
	public bbd a(co co) {
		if (this.b.o(co).a() == azs.a) {
			co co3 = co.b();

			while (co3.q() > 0 && this.b.o(co3).a() == azs.a) {
				co3 = co3.b();
			}

			if (co3.q() > 0) {
				return super.a(co3.a());
			}

			while (co3.q() < this.b.Y() && this.b.o(co3).a() == azs.a) {
				co3 = co3.a();
			}

			co = co3;
		}

		if (!this.b.o(co).a().a()) {
			return super.a(co);
		} else {
			co co3 = co.a();

			while (co3.q() < this.b.Y() && this.b.o(co3).a().a()) {
				co3 = co3.a();
			}

			return super.a(co3);
		}
	}

	@Override
	public bbd a(sn sn) {
		return this.a(new co(sn));
	}

	private int r() {
		if (this.a.aj() && this.g()) {
			int integer2 = (int)this.a.bo().b;
			alu alu3 = this.b.o(new co(ot.c(this.a.p), integer2, ot.c(this.a.r))).v();
			int integer4 = 0;

			while (alu3 == alv.i || alu3 == alv.j) {
				alu3 = this.b.o(new co(ot.c(this.a.p), ++integer2, ot.c(this.a.r))).v();
				if (++integer4 > 16) {
					return (int)this.a.bo().b;
				}
			}

			return integer2;
		} else {
			return (int)(this.a.bo().b + 0.5);
		}
	}

	@Override
	protected void d() {
		super.d();

		for (int integer2 = 0; integer2 < this.c.d(); integer2++) {
			bbb bbb3 = this.c.a(integer2);
			bbb bbb4 = integer2 + 1 < this.c.d() ? this.c.a(integer2 + 1) : null;
			atl atl5 = this.b.o(new co(bbb3.a, bbb3.b, bbb3.c));
			alu alu6 = atl5.v();
			if (alu6 == alv.bE) {
				this.c.a(integer2, bbb3.a(bbb3.a, bbb3.b + 1, bbb3.c));
				if (bbb4 != null && bbb3.b >= bbb4.b) {
					this.c.a(integer2 + 1, bbb4.a(bbb4.a, bbb3.b + 1, bbb4.c));
				}
			}
		}

		if (this.f) {
			if (this.b.h(new co(ot.c(this.a.p), (int)(this.a.bo().b + 0.5), ot.c(this.a.r)))) {
				return;
			}

			for (int integer2x = 0; integer2x < this.c.d(); integer2x++) {
				bbb bbb3 = this.c.a(integer2x);
				if (this.b.h(new co(bbb3.a, bbb3.b, bbb3.c))) {
					this.c.b(integer2x - 1);
					return;
				}
			}
		}
	}

	@Override
	protected boolean a(bdw bdw1, bdw bdw2, int integer3, int integer4, int integer5) {
		int integer7 = ot.c(bdw1.b);
		int integer8 = ot.c(bdw1.d);
		double double9 = bdw2.b - bdw1.b;
		double double11 = bdw2.d - bdw1.d;
		double double13 = double9 * double9 + double11 * double11;
		if (double13 < 1.0E-8) {
			return false;
		} else {
			double double15 = 1.0 / Math.sqrt(double13);
			double9 *= double15;
			double11 *= double15;
			integer3 += 2;
			integer5 += 2;
			if (!this.a(integer7, (int)bdw1.c, integer8, integer3, integer4, integer5, bdw1, double9, double11)) {
				return false;
			} else {
				integer3 -= 2;
				integer5 -= 2;
				double double17 = 1.0 / Math.abs(double9);
				double double19 = 1.0 / Math.abs(double11);
				double double21 = (double)integer7 - bdw1.b;
				double double23 = (double)integer8 - bdw1.d;
				if (double9 >= 0.0) {
					double21++;
				}

				if (double11 >= 0.0) {
					double23++;
				}

				double21 /= double9;
				double23 /= double11;
				int integer25 = double9 < 0.0 ? -1 : 1;
				int integer26 = double11 < 0.0 ? -1 : 1;
				int integer27 = ot.c(bdw2.b);
				int integer28 = ot.c(bdw2.d);
				int integer29 = integer27 - integer7;
				int integer30 = integer28 - integer8;

				while (integer29 * integer25 > 0 || integer30 * integer26 > 0) {
					if (double21 < double23) {
						double21 += double17;
						integer7 += integer25;
						integer29 = integer27 - integer7;
					} else {
						double23 += double19;
						integer8 += integer26;
						integer30 = integer28 - integer8;
					}

					if (!this.a(integer7, (int)bdw1.c, integer8, integer3, integer4, integer5, bdw1, double9, double11)) {
						return false;
					}
				}

				return true;
			}
		}
	}

	private boolean a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, bdw bdw, double double8, double double9) {
		int integer13 = integer1 - integer4 / 2;
		int integer14 = integer3 - integer6 / 2;
		if (!this.b(integer13, integer2, integer14, integer4, integer5, integer6, bdw, double8, double9)) {
			return false;
		} else {
			for (int integer15 = integer13; integer15 < integer13 + integer4; integer15++) {
				for (int integer16 = integer14; integer16 < integer14 + integer6; integer16++) {
					double double17 = (double)integer15 + 0.5 - bdw.b;
					double double19 = (double)integer16 + 0.5 - bdw.d;
					if (!(double17 * double8 + double19 * double9 < 0.0)) {
						bba bba21 = this.e.a(this.b, integer15, integer2 - 1, integer16, this.a, integer4, integer5, integer6, true, true);
						if (bba21 == bba.WATER) {
							return false;
						}

						if (bba21 == bba.LAVA) {
							return false;
						}

						if (bba21 == bba.OPEN) {
							return false;
						}

						bba21 = this.e.a(this.b, integer15, integer2, integer16, this.a, integer4, integer5, integer6, true, true);
						float float22 = this.a.a(bba21);
						if (float22 < 0.0F || float22 >= 8.0F) {
							return false;
						}

						if (bba21 == bba.DAMAGE_FIRE || bba21 == bba.DANGER_FIRE || bba21 == bba.DAMAGE_OTHER) {
							return false;
						}
					}
				}
			}

			return true;
		}
	}

	private boolean b(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, bdw bdw, double double8, double double9) {
		for (co co14 : co.a(new co(integer1, integer2, integer3), new co(integer1 + integer4 - 1, integer2 + integer5 - 1, integer3 + integer6 - 1))) {
			double double15 = (double)co14.p() + 0.5 - bdw.b;
			double double17 = (double)co14.r() + 0.5 - bdw.d;
			if (!(double15 * double8 + double17 * double9 < 0.0)) {
				alu alu19 = this.b.o(co14).v();
				if (!alu19.b(this.b, co14)) {
					return false;
				}
			}
		}

		return true;
	}

	public void a(boolean boolean1) {
		this.e.b(boolean1);
	}

	public void b(boolean boolean1) {
		this.e.a(boolean1);
	}

	public boolean f() {
		return this.e.c();
	}

	public void c(boolean boolean1) {
		this.e.c(boolean1);
	}

	public boolean g() {
		return this.e.e();
	}

	public void d(boolean boolean1) {
		this.f = boolean1;
	}
}
