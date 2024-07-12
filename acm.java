import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class acm extends acl {
	private static final Logger f = LogManager.getLogger();
	private final rc g = new adh();
	private final rc h = new rr("Repair", true, 2) {
		@Override
		public void x_() {
			super.x_();
			acm.this.a(this);
		}
	};
	private final ajs i;
	private final co j;
	public int a;
	private int k;
	private String l;
	private final aay m;

	public acm(aax aax, ajs ajs, aay aay) {
		this(aax, ajs, co.a, aay);
	}

	public acm(aax aax, ajs ajs, co co, aay aay) {
		this.j = co;
		this.i = ajs;
		this.m = aay;
		this.a(new adl(this.h, 0, 27, 47));
		this.a(new adl(this.h, 1, 76, 47));
		this.a(new adl(this.g, 2, 134, 47) {
			@Override
			public boolean a(afj afj) {
				return false;
			}

			@Override
			public boolean a(aay aay) {
				return (aay.bK.d || aay.bL >= acm.this.a) && acm.this.a > 0 && this.e();
			}

			@Override
			public afj a(aay aay, afj afj) {
				if (!aay.bK.d) {
					aay.a(-acm.this.a);
				}

				afj afj4 = acm.this.h.a(0);
				if (afj4.E() != 1 && !aay.bK.d && !(afj4.c() instanceof aft)) {
					afj4.e(afj4.E() - 1);
				} else {
					acm.this.h.a(0, afj.a);
				}

				if (acm.this.k > 0) {
					afj afj5 = acm.this.h.a(1);
					if (!afj5.b() && afj5.E() > acm.this.k) {
						afj5.g(acm.this.k);
						acm.this.h.a(1, afj5);
					} else {
						acm.this.h.a(1, afj.a);
					}
				} else {
					acm.this.h.a(1, afj.a);
				}

				acm.this.a = 0;
				atl atl5 = ajs.o(co);
				if (!aay.bK.d && !ajs.E && atl5.v() == alv.cf && aay.bJ().nextFloat() < 0.12F) {
					int integer6 = (Integer)atl5.c(all.b);
					if (++integer6 > 2) {
						ajs.g(co);
						ajs.b(1029, co, 0);
					} else {
						ajs.a(co, atl5.a(all.b, integer6), 2);
						ajs.b(1030, co, 0);
					}
				} else if (!ajs.E) {
					ajs.b(1030, co, 0);
				}

				return afj;
			}
		});

		for (int integer6 = 0; integer6 < 3; integer6++) {
			for (int integer7 = 0; integer7 < 9; integer7++) {
				this.a(new adl(aax, integer7 + integer6 * 9 + 9, 8 + integer7 * 18, 84 + integer6 * 18));
			}
		}

		for (int integer6 = 0; integer6 < 9; integer6++) {
			this.a(new adl(aax, integer6, 8 + integer6 * 18, 142));
		}
	}

	@Override
	public void a(rc rc) {
		super.a(rc);
		if (rc == this.h) {
			this.e();
		}
	}

	public void e() {
		afj afj2 = this.h.a(0);
		this.a = 1;
		int integer3 = 0;
		int integer4 = 0;
		int integer5 = 0;
		if (afj2.b()) {
			this.g.a(0, afj.a);
			this.a = 0;
		} else {
			afj afj6 = afj2.l();
			if (afj6.E() > 1 && !this.m.bK.d && !(afj6.c() instanceof aft)) {
				afj6.e(1);
			}

			afj afj7 = this.h.a(1);
			Map<aii, Integer> map8 = aik.a(afj6);
			integer4 += afj2.B() + (afj7.b() ? 0 : afj7.B());
			this.k = 0;
			if (!afj7.b()) {
				boolean boolean9 = afj7.c() == afl.co && !afl.co.h(afj7).b_();
				if (afj6.f() && afj6.c().a(afj2, afj7)) {
					int integer10 = Math.min(afj6.i(), afj6.k() / 4);
					if (integer10 <= 0) {
						this.g.a(0, afj.a);
						this.a = 0;
						return;
					}

					int integer11;
					for (integer11 = 0; integer10 > 0 && integer11 < afj7.E(); integer11++) {
						int integer12 = afj6.i() - integer10;
						afj6.b(integer12);
						integer3++;
						integer10 = Math.min(afj6.i(), afj6.k() / 4);
					}

					this.k = integer11;
				} else {
					if (!boolean9 && (afj6.c() != afj7.c() || !afj6.f())) {
						this.g.a(0, afj.a);
						this.a = 0;
						return;
					}

					if (afj6.f() && !boolean9) {
						int integer10x = afj2.k() - afj2.i();
						int integer11 = afj7.k() - afj7.i();
						int integer12 = integer11 + afj6.k() * 12 / 100;
						int integer13 = integer10x + integer12;
						int integer14 = afj6.k() - integer13;
						if (integer14 < 0) {
							integer14 = 0;
						}

						if (integer14 < afj6.j()) {
							afj6.b(integer14);
							integer3 += 2;
						}
					}

					Map<aii, Integer> map10 = aik.a(afj7);
					boolean boolean11 = false;
					boolean boolean12 = false;

					for (aii aii14 : map10.keySet()) {
						if (aii14 != null) {
							int integer15 = map8.containsKey(aii14) ? (Integer)map8.get(aii14) : 0;
							int integer16 = (Integer)map10.get(aii14);
							integer16 = integer15 == integer16 ? integer16 + 1 : Math.max(integer16, integer15);
							boolean boolean17 = aii14.a(afj2);
							if (this.m.bK.d || afj2.c() == afl.co) {
								boolean17 = true;
							}

							for (aii aii19 : map8.keySet()) {
								if (aii19 != aii14 && !aii14.c(aii19)) {
									boolean17 = false;
									integer3++;
								}
							}

							if (!boolean17) {
								boolean12 = true;
							} else {
								boolean11 = true;
								if (integer16 > aii14.b()) {
									integer16 = aii14.b();
								}

								map8.put(aii14, integer16);
								int integer18 = 0;
								switch (aii14.e()) {
									case COMMON:
										integer18 = 1;
										break;
									case UNCOMMON:
										integer18 = 2;
										break;
									case RARE:
										integer18 = 4;
										break;
									case VERY_RARE:
										integer18 = 8;
								}

								if (boolean9) {
									integer18 = Math.max(1, integer18 / 2);
								}

								integer3 += integer18 * integer16;
							}
						}
					}

					if (boolean12 && !boolean11) {
						this.g.a(0, afj.a);
						this.a = 0;
						return;
					}
				}
			}

			if (StringUtils.isBlank(this.l)) {
				if (afj2.t()) {
					integer5 = 1;
					integer3 += integer5;
					afj6.s();
				}
			} else if (!this.l.equals(afj2.r())) {
				integer5 = 1;
				integer3 += integer5;
				afj6.g(this.l);
			}

			this.a = integer4 + integer3;
			if (integer3 <= 0) {
				afj6 = afj.a;
			}

			if (integer5 == integer3 && integer5 > 0 && this.a >= 40) {
				this.a = 39;
			}

			if (this.a >= 40 && !this.m.bK.d) {
				afj6 = afj.a;
			}

			if (!afj6.b()) {
				int integer9 = afj6.B();
				if (!afj7.b() && integer9 < afj7.B()) {
					integer9 = afj7.B();
				}

				if (integer5 != integer3 || integer5 == 0) {
					integer9 = integer9 * 2 + 1;
				}

				afj6.c(integer9);
				aik.a(map8, afj6);
			}

			this.g.a(0, afj6);
			this.b();
		}
	}

	@Override
	public void a(acr acr) {
		super.a(acr);
		acr.a(this, 0, this.a);
	}

	@Override
	public void b(int integer1, int integer2) {
		if (integer1 == 0) {
			this.a = integer2;
		}
	}

	@Override
	public void b(aay aay) {
		super.b(aay);
		if (!this.i.E) {
			for (int integer3 = 0; integer3 < this.h.v_(); integer3++) {
				afj afj4 = this.h.b(integer3);
				if (!afj4.b()) {
					aay.a(afj4, false);
				}
			}
		}
	}

	@Override
	public boolean a(aay aay) {
		return this.i.o(this.j).v() != alv.cf ? false : !(aay.d((double)this.j.p() + 0.5, (double)this.j.q() + 0.5, (double)this.j.r() + 0.5) > 64.0);
	}

	@Override
	public afj b(aay aay, int integer) {
		afj afj4 = afj.a;
		adl adl5 = (adl)this.c.get(integer);
		if (adl5 != null && adl5.e()) {
			afj afj6 = adl5.d();
			afj4 = afj6.l();
			if (integer == 2) {
				if (!this.a(afj6, 3, 39, true)) {
					return afj.a;
				}

				adl5.a(afj6, afj4);
			} else if (integer != 0 && integer != 1) {
				if (integer >= 3 && integer < 39 && !this.a(afj6, 0, 2, false)) {
					return afj.a;
				}
			} else if (!this.a(afj6, 3, 39, false)) {
				return afj.a;
			}

			if (afj6.b()) {
				adl5.d(afj.a);
			} else {
				adl5.f();
			}

			if (afj6.E() == afj4.E()) {
				return afj.a;
			}

			adl5.a(aay, afj6);
		}

		return afj4;
	}

	public void a(String string) {
		this.l = string;
		if (this.a(2).e()) {
			afj afj3 = this.a(2).d();
			if (StringUtils.isBlank(string)) {
				afj3.s();
			} else {
				afj3.g(this.l);
			}
		}

		this.e();
	}
}
