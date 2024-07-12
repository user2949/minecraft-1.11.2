public class uk extends uu {
	private final aat c;
	private boolean d;
	private boolean e;
	private int f;

	public uk(aat aat, double double2) {
		super(aat, double2, 16);
		this.c = aat;
	}

	@Override
	public boolean a() {
		if (this.a <= 0) {
			if (!this.c.l.U().b("mobGriefing")) {
				return false;
			}

			this.f = -1;
			this.d = this.c.dq();
			this.e = this.c.dp();
		}

		return super.a();
	}

	@Override
	public boolean b() {
		return this.f >= 0 && super.b();
	}

	@Override
	public void e() {
		super.e();
		this.c.t().a((double)this.b.p() + 0.5, (double)(this.b.q() + 1), (double)this.b.r() + 0.5, 10.0F, (float)this.c.N());
		if (this.f()) {
			ajs ajs2 = this.c.l;
			co co3 = this.b.a();
			atl atl4 = ajs2.o(co3);
			alu alu5 = atl4.v();
			if (this.f == 0 && alu5 instanceof amp && ((amp)alu5).A(atl4)) {
				ajs2.b(co3, true);
			} else if (this.f == 1 && atl4.a() == azs.a) {
				rr rr6 = this.c.dm();

				for (int integer7 = 0; integer7 < rr6.v_(); integer7++) {
					afj afj8 = rr6.a(integer7);
					boolean boolean9 = false;
					if (!afj8.b()) {
						if (afj8.c() == afl.Q) {
							ajs2.a(co3, alv.aj.t(), 3);
							boolean9 = true;
						} else if (afj8.c() == afl.cd) {
							ajs2.a(co3, alv.cc.t(), 3);
							boolean9 = true;
						} else if (afj8.c() == afl.cc) {
							ajs2.a(co3, alv.cb.t(), 3);
							boolean9 = true;
						} else if (afj8.c() == afl.cV) {
							ajs2.a(co3, alv.cZ.t(), 3);
							boolean9 = true;
						}
					}

					if (boolean9) {
						afj8.g(1);
						if (afj8.b()) {
							rr6.a(integer7, afj.a);
						}
						break;
					}
				}
			}

			this.f = -1;
			this.a = 10;
		}
	}

	@Override
	protected boolean a(ajs ajs, co co) {
		alu alu4 = ajs.o(co).v();
		if (alu4 == alv.ak) {
			co = co.a();
			atl atl5 = ajs.o(co);
			alu4 = atl5.v();
			if (alu4 instanceof amp && ((amp)alu4).A(atl5) && this.e && (this.f == 0 || this.f < 0)) {
				this.f = 0;
				return true;
			}

			if (atl5.a() == azs.a && this.d && (this.f == 1 || this.f < 0)) {
				this.f = 1;
				return true;
			}
		}

		return false;
	}
}
