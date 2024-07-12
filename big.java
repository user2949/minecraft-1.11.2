import com.google.common.collect.Sets;
import java.util.Set;
import org.lwjgl.input.Keyboard;

public abstract class big extends bho {
	public static final kq a = new kq("textures/gui/container/inventory.png");
	protected int f = 176;
	protected int g = 166;
	public acl h;
	protected int i;
	protected int r;
	private adl u;
	private adl v;
	private boolean w;
	private afj x = afj.a;
	private int y;
	private int z;
	private adl A;
	private long B;
	private afj C = afj.a;
	private adl D;
	private long E;
	protected final Set<adl> s = Sets.newHashSet();
	protected boolean t;
	private int F;
	private int G;
	private boolean H;
	private int I;
	private long J;
	private adl K;
	private int L;
	private boolean M;
	private afj N = afj.a;

	public big(acl acl) {
		this.h = acl;
		this.H = true;
	}

	@Override
	public void b() {
		super.b();
		this.j.h.bu = this.h;
		this.i = (this.l - this.f) / 2;
		this.r = (this.m - this.g) / 2;
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		int integer5 = this.i;
		int integer6 = this.r;
		this.a(float3, integer1, integer2);
		bqg.E();
		beq.a();
		bqg.g();
		bqg.j();
		super.a(integer1, integer2, float3);
		beq.c();
		bqg.G();
		bqg.c((float)integer5, (float)integer6, 0.0F);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.D();
		this.u = null;
		int integer7 = 240;
		int integer8 = 240;
		cdb.a(cdb.r, 240.0F, 240.0F);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);

		for (int integer9 = 0; integer9 < this.h.c.size(); integer9++) {
			adl adl10 = (adl)this.h.c.get(integer9);
			if (adl10.b()) {
				this.a(adl10);
			}

			if (this.a(adl10, integer1, integer2) && adl10.b()) {
				this.u = adl10;
				bqg.g();
				bqg.j();
				int integer11 = adl10.f;
				int integer12 = adl10.g;
				bqg.a(true, true, true, false);
				this.a(integer11, integer12, integer11 + 16, integer12 + 16, -2130706433, -2130706433);
				bqg.a(true, true, true, true);
				bqg.f();
				bqg.k();
			}
		}

		beq.a();
		this.b(integer1, integer2);
		beq.c();
		aax aax9 = this.j.h.bs;
		afj afj10 = this.x.b() ? aax9.p() : this.x;
		if (!afj10.b()) {
			int integer11 = 8;
			int integer12 = this.x.b() ? 8 : 16;
			String string13 = null;
			if (!this.x.b() && this.w) {
				afj10 = afj10.l();
				afj10.e(ot.f((float)afj10.E() / 2.0F));
			} else if (this.t && this.s.size() > 1) {
				afj10 = afj10.l();
				afj10.e(this.I);
				if (afj10.b()) {
					string13 = "" + a.YELLOW + "0";
				}
			}

			this.a(afj10, integer1 - integer5 - 8, integer2 - integer6 - integer12, string13);
		}

		if (!this.C.b()) {
			float float11 = (float)(bes.I() - this.B) / 100.0F;
			if (float11 >= 1.0F) {
				float11 = 1.0F;
				this.C = afj.a;
			}

			int integer12 = this.A.f - this.y;
			int integer13 = this.A.g - this.z;
			int integer14 = this.y + (int)((float)integer12 * float11);
			int integer15 = this.z + (int)((float)integer13 * float11);
			this.a(this.C, integer14, integer15, null);
		}

		bqg.H();
		if (aax9.p().b() && this.u != null && this.u.e()) {
			afj afj11 = this.u.d();
			this.a(afj11, integer1, integer2);
		}

		bqg.f();
		bqg.k();
		beq.b();
	}

	private void a(afj afj, int integer2, int integer3, String string) {
		bqg.c(0.0F, 0.0F, 32.0F);
		this.e = 200.0F;
		this.k.a = 200.0F;
		this.k.b(afj, integer2, integer3);
		this.k.a(this.q, afj, integer2, integer3 - (this.x.b() ? 0 : 8), string);
		this.e = 0.0F;
		this.k.a = 0.0F;
	}

	protected void b(int integer1, int integer2) {
	}

	protected abstract void a(float float1, int integer2, int integer3);

	private void a(adl adl) {
		int integer3 = adl.f;
		int integer4 = adl.g;
		afj afj5 = adl.d();
		boolean boolean6 = false;
		boolean boolean7 = adl == this.v && !this.x.b() && !this.w;
		afj afj8 = this.j.h.bs.p();
		String string9 = null;
		if (adl == this.v && !this.x.b() && this.w && !afj5.b()) {
			afj5 = afj5.l();
			afj5.e(afj5.E() / 2);
		} else if (this.t && this.s.contains(adl) && !afj8.b()) {
			if (this.s.size() == 1) {
				return;
			}

			if (acl.a(adl, afj8, true) && this.h.b(adl)) {
				afj5 = afj8.l();
				boolean6 = true;
				acl.a(this.s, this.F, afj5, adl.d().b() ? 0 : adl.d().E());
				int integer10 = Math.min(afj5.d(), adl.b(afj5));
				if (afj5.E() > integer10) {
					string9 = a.YELLOW.toString() + integer10;
					afj5.e(integer10);
				}
			} else {
				this.s.remove(adl);
				this.a();
			}
		}

		this.e = 100.0F;
		this.k.a = 100.0F;
		if (afj5.b() && adl.b()) {
			String string10 = adl.c();
			if (string10 != null) {
				byz byz11 = this.j.R().a(string10);
				bqg.g();
				this.j.N().a(byy.g);
				this.a(integer3, integer4, byz11, 16, 16);
				bqg.f();
				boolean7 = true;
			}
		}

		if (!boolean7) {
			if (boolean6) {
				a(integer3, integer4, integer3 + 16, integer4 + 16, -2130706433);
			}

			bqg.k();
			this.k.a(this.j.h, afj5, integer3, integer4);
			this.k.a(this.q, afj5, integer3, integer4, string9);
		}

		this.k.a = 0.0F;
		this.e = 0.0F;
	}

	private void a() {
		afj afj2 = this.j.h.bs.p();
		if (!afj2.b() && this.t) {
			if (this.F == 2) {
				this.I = afj2.d();
			} else {
				this.I = afj2.E();

				for (adl adl4 : this.s) {
					afj afj5 = afj2.l();
					afj afj6 = adl4.d();
					int integer7 = afj6.b() ? 0 : afj6.E();
					acl.a(this.s, this.F, afj5, integer7);
					int integer8 = Math.min(afj5.d(), adl4.b(afj5));
					if (afj5.E() > integer8) {
						afj5.e(integer8);
					}

					this.I = this.I - (afj5.E() - integer7);
				}
			}
		}
	}

	private adl c(int integer1, int integer2) {
		for (int integer4 = 0; integer4 < this.h.c.size(); integer4++) {
			adl adl5 = (adl)this.h.c.get(integer4);
			if (this.a(adl5, integer1, integer2) && adl5.b()) {
				return adl5;
			}
		}

		return null;
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		super.a(integer1, integer2, integer3);
		boolean boolean5 = integer3 == this.j.u.ae.j() + 100;
		adl adl6 = this.c(integer1, integer2);
		long long7 = bes.I();
		this.M = this.K == adl6 && long7 - this.J < 250L && this.L == integer3;
		this.H = false;
		if (integer3 == 0 || integer3 == 1 || boolean5) {
			int integer9 = this.i;
			int integer10 = this.r;
			boolean boolean11 = integer1 < integer9 || integer2 < integer10 || integer1 >= integer9 + this.f || integer2 >= integer10 + this.g;
			int integer12 = -1;
			if (adl6 != null) {
				integer12 = adl6.e;
			}

			if (boolean11) {
				integer12 = -999;
			}

			if (this.j.u.A && boolean11 && this.j.h.bs.p().b()) {
				this.j.a(null);
				return;
			}

			if (integer12 != -1) {
				if (this.j.u.A) {
					if (adl6 != null && adl6.e()) {
						this.v = adl6;
						this.x = afj.a;
						this.w = integer3 == 1;
					} else {
						this.v = null;
					}
				} else if (!this.t) {
					if (this.j.h.bs.p().b()) {
						if (integer3 == this.j.u.ae.j() + 100) {
							this.a(adl6, integer12, integer3, acq.CLONE);
						} else {
							boolean boolean13 = integer12 != -999 && (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54));
							acq acq14 = acq.PICKUP;
							if (boolean13) {
								this.N = adl6 != null && adl6.e() ? adl6.d().l() : afj.a;
								acq14 = acq.QUICK_MOVE;
							} else if (integer12 == -999) {
								acq14 = acq.THROW;
							}

							this.a(adl6, integer12, integer3, acq14);
						}

						this.H = true;
					} else {
						this.t = true;
						this.G = integer3;
						this.s.clear();
						if (integer3 == 0) {
							this.F = 0;
						} else if (integer3 == 1) {
							this.F = 1;
						} else if (integer3 == this.j.u.ae.j() + 100) {
							this.F = 2;
						}
					}
				}
			}
		}

		this.K = adl6;
		this.J = long7;
		this.L = integer3;
	}

	@Override
	protected void a(int integer1, int integer2, int integer3, long long4) {
		adl adl7 = this.c(integer1, integer2);
		afj afj8 = this.j.h.bs.p();
		if (this.v != null && this.j.u.A) {
			if (integer3 == 0 || integer3 == 1) {
				if (this.x.b()) {
					if (adl7 != this.v && !this.v.d().b()) {
						this.x = this.v.d().l();
					}
				} else if (this.x.E() > 1 && adl7 != null && acl.a(adl7, this.x, false)) {
					long long9 = bes.I();
					if (this.D == adl7) {
						if (long9 - this.E > 500L) {
							this.a(this.v, this.v.e, 0, acq.PICKUP);
							this.a(adl7, adl7.e, 1, acq.PICKUP);
							this.a(this.v, this.v.e, 0, acq.PICKUP);
							this.E = long9 + 750L;
							this.x.g(1);
						}
					} else {
						this.D = adl7;
						this.E = long9;
					}
				}
			}
		} else if (this.t && adl7 != null && !afj8.b() && (afj8.E() > this.s.size() || this.F == 2) && acl.a(adl7, afj8, true) && adl7.a(afj8) && this.h.b(adl7)) {
			this.s.add(adl7);
			this.a();
		}
	}

	@Override
	protected void b(int integer1, int integer2, int integer3) {
		adl adl5 = this.c(integer1, integer2);
		int integer6 = this.i;
		int integer7 = this.r;
		boolean boolean8 = integer1 < integer6 || integer2 < integer7 || integer1 >= integer6 + this.f || integer2 >= integer7 + this.g;
		int integer9 = -1;
		if (adl5 != null) {
			integer9 = adl5.e;
		}

		if (boolean8) {
			integer9 = -999;
		}

		if (this.M && adl5 != null && integer3 == 0 && this.h.a(afj.a, adl5)) {
			if (r()) {
				if (!this.N.b()) {
					for (adl adl11 : this.h.c) {
						if (adl11 != null && adl11.a(this.j.h) && adl11.e() && adl11.d == adl5.d && acl.a(adl11, this.N, true)) {
							this.a(adl11, adl11.e, integer3, acq.QUICK_MOVE);
						}
					}
				}
			} else {
				this.a(adl5, integer9, integer3, acq.PICKUP_ALL);
			}

			this.M = false;
			this.J = 0L;
		} else {
			if (this.t && this.G != integer3) {
				this.t = false;
				this.s.clear();
				this.H = true;
				return;
			}

			if (this.H) {
				this.H = false;
				return;
			}

			if (this.v != null && this.j.u.A) {
				if (integer3 == 0 || integer3 == 1) {
					if (this.x.b() && adl5 != this.v) {
						this.x = this.v.d();
					}

					boolean boolean10 = acl.a(adl5, this.x, false);
					if (integer9 != -1 && !this.x.b() && boolean10) {
						this.a(this.v, this.v.e, integer3, acq.PICKUP);
						this.a(adl5, integer9, 0, acq.PICKUP);
						if (this.j.h.bs.p().b()) {
							this.C = afj.a;
						} else {
							this.a(this.v, this.v.e, integer3, acq.PICKUP);
							this.y = integer1 - integer6;
							this.z = integer2 - integer7;
							this.A = this.v;
							this.C = this.x;
							this.B = bes.I();
						}
					} else if (!this.x.b()) {
						this.y = integer1 - integer6;
						this.z = integer2 - integer7;
						this.A = this.v;
						this.C = this.x;
						this.B = bes.I();
					}

					this.x = afj.a;
					this.v = null;
				}
			} else if (this.t && !this.s.isEmpty()) {
				this.a(null, -999, acl.d(0, this.F), acq.QUICK_CRAFT);

				for (adl adl11x : this.s) {
					this.a(adl11x, adl11x.e, acl.d(1, this.F), acq.QUICK_CRAFT);
				}

				this.a(null, -999, acl.d(2, this.F), acq.QUICK_CRAFT);
			} else if (!this.j.h.bs.p().b()) {
				if (integer3 == this.j.u.ae.j() + 100) {
					this.a(adl5, integer9, integer3, acq.CLONE);
				} else {
					boolean boolean10 = integer9 != -999 && (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54));
					if (boolean10) {
						this.N = adl5 != null && adl5.e() ? adl5.d().l() : afj.a;
					}

					this.a(adl5, integer9, integer3, boolean10 ? acq.QUICK_MOVE : acq.PICKUP);
				}
			}
		}

		if (this.j.h.bs.p().b()) {
			this.J = 0L;
		}

		this.t = false;
	}

	private boolean a(adl adl, int integer2, int integer3) {
		return this.c(adl.f, adl.g, 16, 16, integer2, integer3);
	}

	protected boolean c(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		int integer8 = this.i;
		int integer9 = this.r;
		integer5 -= integer8;
		integer6 -= integer9;
		return integer5 >= integer1 - 1 && integer5 < integer1 + integer3 + 1 && integer6 >= integer2 - 1 && integer6 < integer2 + integer4 + 1;
	}

	protected void a(adl adl, int integer2, int integer3, acq acq) {
		if (adl != null) {
			integer2 = adl.e;
		}

		this.j.c.a(this.h.d, integer2, integer3, acq, this.j.h);
	}

	@Override
	protected void a(char character, int integer) {
		if (integer == 1 || integer == this.j.u.Z.j()) {
			this.j.h.q();
		}

		this.b(integer);
		if (this.u != null && this.u.e()) {
			if (integer == this.j.u.ae.j()) {
				this.a(this.u, this.u.e, 0, acq.CLONE);
			} else if (integer == this.j.u.ab.j()) {
				this.a(this.u, this.u.e, q() ? 1 : 0, acq.THROW);
			}
		}
	}

	protected boolean b(int integer) {
		if (this.j.h.bs.p().b() && this.u != null) {
			for (int integer3 = 0; integer3 < 9; integer3++) {
				if (integer == this.j.u.an[integer3].j()) {
					this.a(this.u, this.u.e, integer3, acq.SWAP);
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public void m() {
		if (this.j.h != null) {
			this.h.b(this.j.h);
		}
	}

	@Override
	public boolean d() {
		return false;
	}

	@Override
	public void e() {
		super.e();
		if (!this.j.h.au() || this.j.h.F) {
			this.j.h.q();
		}
	}
}
