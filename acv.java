import java.util.List;
import java.util.Random;

public class acv extends acl {
	public rc a = new rr("Enchant", true, 2) {
		@Override
		public int y_() {
			return 64;
		}

		@Override
		public void x_() {
			super.x_();
			acv.this.a(this);
		}
	};
	private final ajs j;
	private final co k;
	private final Random l = new Random();
	public int f;
	public int[] g = new int[3];
	public int[] h = new int[]{-1, -1, -1};
	public int[] i = new int[]{-1, -1, -1};

	public acv(aax aax, ajs ajs) {
		this(aax, ajs, co.a);
	}

	public acv(aax aax, ajs ajs, co co) {
		this.j = ajs;
		this.k = co;
		this.f = aax.e.cY();
		this.a(new adl(this.a, 0, 15, 47) {
			@Override
			public boolean a(afj afj) {
				return true;
			}

			@Override
			public int a() {
				return 1;
			}
		});
		this.a(new adl(this.a, 1, 35, 47) {
			@Override
			public boolean a(afj afj) {
				return afj.c() == afl.be && aem.a(afj.j()) == aem.BLUE;
			}
		});

		for (int integer5 = 0; integer5 < 3; integer5++) {
			for (int integer6 = 0; integer6 < 9; integer6++) {
				this.a(new adl(aax, integer6 + integer5 * 9 + 9, 8 + integer6 * 18, 84 + integer5 * 18));
			}
		}

		for (int integer5 = 0; integer5 < 9; integer5++) {
			this.a(new adl(aax, integer5, 8 + integer5 * 18, 142));
		}
	}

	protected void c(acr acr) {
		acr.a(this, 0, this.g[0]);
		acr.a(this, 1, this.g[1]);
		acr.a(this, 2, this.g[2]);
		acr.a(this, 3, this.f & -16);
		acr.a(this, 4, this.h[0]);
		acr.a(this, 5, this.h[1]);
		acr.a(this, 6, this.h[2]);
		acr.a(this, 7, this.i[0]);
		acr.a(this, 8, this.i[1]);
		acr.a(this, 9, this.i[2]);
	}

	@Override
	public void a(acr acr) {
		super.a(acr);
		this.c(acr);
	}

	@Override
	public void b() {
		super.b();

		for (int integer2 = 0; integer2 < this.e.size(); integer2++) {
			acr acr3 = (acr)this.e.get(integer2);
			this.c(acr3);
		}
	}

	@Override
	public void b(int integer1, int integer2) {
		if (integer1 >= 0 && integer1 <= 2) {
			this.g[integer1] = integer2;
		} else if (integer1 == 3) {
			this.f = integer2;
		} else if (integer1 >= 4 && integer1 <= 6) {
			this.h[integer1 - 4] = integer2;
		} else if (integer1 >= 7 && integer1 <= 9) {
			this.i[integer1 - 7] = integer2;
		} else {
			super.b(integer1, integer2);
		}
	}

	@Override
	public void a(rc rc) {
		if (rc == this.a) {
			afj afj3 = rc.a(0);
			if (!afj3.b() && afj3.w()) {
				if (!this.j.E) {
					int integer4 = 0;

					for (int integer5 = -1; integer5 <= 1; integer5++) {
						for (int integer6 = -1; integer6 <= 1; integer6++) {
							if ((integer5 != 0 || integer6 != 0) && this.j.d(this.k.a(integer6, 0, integer5)) && this.j.d(this.k.a(integer6, 1, integer5))) {
								if (this.j.o(this.k.a(integer6 * 2, 0, integer5 * 2)).v() == alv.X) {
									integer4++;
								}

								if (this.j.o(this.k.a(integer6 * 2, 1, integer5 * 2)).v() == alv.X) {
									integer4++;
								}

								if (integer6 != 0 && integer5 != 0) {
									if (this.j.o(this.k.a(integer6 * 2, 0, integer5)).v() == alv.X) {
										integer4++;
									}

									if (this.j.o(this.k.a(integer6 * 2, 1, integer5)).v() == alv.X) {
										integer4++;
									}

									if (this.j.o(this.k.a(integer6, 0, integer5 * 2)).v() == alv.X) {
										integer4++;
									}

									if (this.j.o(this.k.a(integer6, 1, integer5 * 2)).v() == alv.X) {
										integer4++;
									}
								}
							}
						}
					}

					this.l.setSeed((long)this.f);

					for (int integer5 = 0; integer5 < 3; integer5++) {
						this.g[integer5] = aik.a(this.l, integer5, integer4, afj3);
						this.h[integer5] = -1;
						this.i[integer5] = -1;
						if (this.g[integer5] < integer5 + 1) {
							this.g[integer5] = 0;
						}
					}

					for (int integer5x = 0; integer5x < 3; integer5x++) {
						if (this.g[integer5x] > 0) {
							List<ail> list6 = this.a(afj3, integer5x, this.g[integer5x]);
							if (list6 != null && !list6.isEmpty()) {
								ail ail7 = (ail)list6.get(this.l.nextInt(list6.size()));
								this.h[integer5x] = aii.b(ail7.b);
								this.i[integer5x] = ail7.c;
							}
						}
					}

					this.b();
				}
			} else {
				for (int integer4 = 0; integer4 < 3; integer4++) {
					this.g[integer4] = 0;
					this.h[integer4] = -1;
					this.i[integer4] = -1;
				}
			}
		}
	}

	@Override
	public boolean a(aay aay, int integer) {
		afj afj4 = this.a.a(0);
		afj afj5 = this.a.a(1);
		int integer6 = integer + 1;
		if ((afj5.b() || afj5.E() < integer6) && !aay.bK.d) {
			return false;
		} else if (this.g[integer] > 0 && !afj4.b() && (aay.bL >= integer6 && aay.bL >= this.g[integer] || aay.bK.d)) {
			if (!this.j.E) {
				List<ail> list7 = this.a(afj4, integer, this.g[integer]);
				if (!list7.isEmpty()) {
					aay.b(integer6);
					boolean boolean8 = afj4.c() == afl.aT;
					if (boolean8) {
						afj4 = new afj(afl.co);
						this.a.a(0, afj4);
					}

					for (int integer9 = 0; integer9 < list7.size(); integer9++) {
						ail ail10 = (ail)list7.get(integer9);
						if (boolean8) {
							afl.co.a(afj4, ail10);
						} else {
							afj4.a(ail10.b, ail10.c);
						}
					}

					if (!aay.bK.d) {
						afj5.g(integer6);
						if (afj5.b()) {
							this.a.a(1, afj.a);
						}
					}

					aay.b(oa.W);
					this.a.x_();
					this.f = aay.cY();
					this.a(this.a);
					this.j.a(null, this.k, nn.aO, no.BLOCKS, 1.0F, this.j.r.nextFloat() * 0.1F + 0.9F);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	private List<ail> a(afj afj, int integer2, int integer3) {
		this.l.setSeed((long)(this.f + integer2));
		List<ail> list5 = aik.b(this.l, afj, integer3, false);
		if (afj.c() == afl.aT && list5.size() > 1) {
			list5.remove(this.l.nextInt(list5.size()));
		}

		return list5;
	}

	public int e() {
		afj afj2 = this.a.a(1);
		return afj2.b() ? 0 : afj2.E();
	}

	@Override
	public void b(aay aay) {
		super.b(aay);
		if (!this.j.E) {
			for (int integer3 = 0; integer3 < this.a.v_(); integer3++) {
				afj afj4 = this.a.b(integer3);
				if (!afj4.b()) {
					aay.a(afj4, false);
				}
			}
		}
	}

	@Override
	public boolean a(aay aay) {
		return this.j.o(this.k).v() != alv.bC ? false : !(aay.d((double)this.k.p() + 0.5, (double)this.k.q() + 0.5, (double)this.k.r() + 0.5) > 64.0);
	}

	@Override
	public afj b(aay aay, int integer) {
		afj afj4 = afj.a;
		adl adl5 = (adl)this.c.get(integer);
		if (adl5 != null && adl5.e()) {
			afj afj6 = adl5.d();
			afj4 = afj6.l();
			if (integer == 0) {
				if (!this.a(afj6, 2, 38, true)) {
					return afj.a;
				}
			} else if (integer == 1) {
				if (!this.a(afj6, 2, 38, true)) {
					return afj.a;
				}
			} else if (afj6.c() == afl.be && aem.a(afj6.j()) == aem.BLUE) {
				if (!this.a(afj6, 1, 2, true)) {
					return afj.a;
				}
			} else {
				if (((adl)this.c.get(0)).e() || !((adl)this.c.get(0)).a(afj6)) {
					return afj.a;
				}

				if (afj6.o() && afj6.E() == 1) {
					((adl)this.c.get(0)).d(afj6.l());
					afj6.e(0);
				} else if (!afj6.b()) {
					((adl)this.c.get(0)).d(new afj(afj6.c(), 1, afj6.j()));
					afj6.g(1);
				}
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
}
