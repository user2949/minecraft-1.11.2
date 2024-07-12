import io.netty.buffer.Unpooled;

public class bnp {
	private final bes a;
	private final bno b;
	private co c = new co(-1, -1, -1);
	private afj d = afj.a;
	private float e;
	private float f;
	private int g;
	private boolean h;
	private ajq i = ajq.SURVIVAL;
	private int j;

	public bnp(bes bes, bno bno) {
		this.a = bes;
		this.b = bno;
	}

	public static void a(bes bes, bnp bnp, co co, cv cv) {
		if (!bes.f.a(bes.h, co, cv)) {
			bnp.a(co);
		}
	}

	public void a(aay aay) {
		this.i.a(aay.bK);
	}

	public boolean a() {
		return this.i == ajq.SPECTATOR;
	}

	public void a(ajq ajq) {
		this.i = ajq;
		this.i.a(this.a.h.bK);
	}

	public void b(aay aay) {
		aay.v = -180.0F;
	}

	public boolean b() {
		return this.i.e();
	}

	public boolean a(co co) {
		if (this.i.c()) {
			if (this.i == ajq.SPECTATOR) {
				return false;
			}

			if (!this.a.h.dc()) {
				afj afj3 = this.a.h.cg();
				if (afj3.b()) {
					return false;
				}

				if (!afj3.a(this.a.f.o(co).v())) {
					return false;
				}
			}
		}

		if (this.i.d() && !this.a.h.cg().b() && this.a.h.cg().c() instanceof agr) {
			return false;
		} else {
			ajs ajs3 = this.a.f;
			atl atl4 = ajs3.o(co);
			alu alu5 = atl4.v();
			if ((alu5 instanceof amm || alu5 instanceof arg) && !this.a.h.dk()) {
				return false;
			} else if (atl4.a() == azs.a) {
				return false;
			} else {
				ajs3.b(2001, co, alu.j(atl4));
				alu5.a(ajs3, co, atl4, (aay)this.a.h);
				boolean boolean6 = ajs3.a(co, alv.a.t(), 11);
				if (boolean6) {
					alu5.d(ajs3, co, atl4);
				}

				this.c = new co(this.c.p(), -1, this.c.r());
				if (!this.i.d()) {
					afj afj7 = this.a.h.cg();
					if (!afj7.b()) {
						afj7.a(ajs3, atl4, co, this.a.h);
						if (afj7.b()) {
							this.a.h.a(ri.MAIN_HAND, afj.a);
						}
					}
				}

				return boolean6;
			}
		}
	}

	public boolean a(co co, cv cv) {
		if (this.i.c()) {
			if (this.i == ajq.SPECTATOR) {
				return false;
			}

			if (!this.a.h.dc()) {
				afj afj4 = this.a.h.cg();
				if (afj4.b()) {
					return false;
				}

				if (!afj4.a(this.a.f.o(co).v())) {
					return false;
				}
			}
		}

		if (!this.a.f.aj().a(co)) {
			return false;
		} else {
			if (this.i.d()) {
				this.b.a(new jd(jd.a.START_DESTROY_BLOCK, co, cv));
				a(this.a, this, co, cv);
				this.g = 5;
			} else if (!this.h || !this.b(co)) {
				if (this.h) {
					this.b.a(new jd(jd.a.ABORT_DESTROY_BLOCK, this.c, cv));
				}

				this.b.a(new jd(jd.a.START_DESTROY_BLOCK, co, cv));
				atl atl4 = this.a.f.o(co);
				boolean boolean5 = atl4.a() != azs.a;
				if (boolean5 && this.e == 0.0F) {
					atl4.v().a(this.a.f, co, (aay)this.a.h);
				}

				if (boolean5 && atl4.a(this.a.h, this.a.h.l, co) >= 1.0F) {
					this.a(co);
				} else {
					this.h = true;
					this.c = co;
					this.d = this.a.h.cg();
					this.e = 0.0F;
					this.f = 0.0F;
					this.a.f.c(this.a.h.O(), this.c, (int)(this.e * 10.0F) - 1);
				}
			}

			return true;
		}
	}

	public void c() {
		if (this.h) {
			this.b.a(new jd(jd.a.ABORT_DESTROY_BLOCK, this.c, cv.DOWN));
			this.h = false;
			this.e = 0.0F;
			this.a.f.c(this.a.h.O(), this.c, -1);
			this.a.h.dh();
		}
	}

	public boolean b(co co, cv cv) {
		this.n();
		if (this.g > 0) {
			this.g--;
			return true;
		} else if (this.i.d() && this.a.f.aj().a(co)) {
			this.g = 5;
			this.b.a(new jd(jd.a.START_DESTROY_BLOCK, co, cv));
			a(this.a, this, co, cv);
			return true;
		} else if (this.b(co)) {
			atl atl4 = this.a.f.o(co);
			alu alu5 = atl4.v();
			if (atl4.a() == azs.a) {
				this.h = false;
				return false;
			} else {
				this.e = this.e + atl4.a(this.a.h, this.a.h.l, co);
				if (this.f % 4.0F == 0.0F) {
					aqu aqu6 = alu5.v();
					this.a.U().a(new cby(aqu6.f(), no.NEUTRAL, (aqu6.a() + 1.0F) / 8.0F, aqu6.b() * 0.5F, co));
				}

				this.f++;
				if (this.e >= 1.0F) {
					this.h = false;
					this.b.a(new jd(jd.a.STOP_DESTROY_BLOCK, co, cv));
					this.a(co);
					this.e = 0.0F;
					this.f = 0.0F;
					this.g = 5;
				}

				this.a.f.c(this.a.h.O(), this.c, (int)(this.e * 10.0F) - 1);
				return true;
			}
		} else {
			return this.a(co, cv);
		}
	}

	public float d() {
		return this.i.d() ? 5.0F : 4.5F;
	}

	public void e() {
		this.n();
		if (this.b.a().g()) {
			this.b.a().a();
		} else {
			this.b.a().l();
		}
	}

	private boolean b(co co) {
		afj afj3 = this.a.h.cg();
		boolean boolean4 = this.d.b() && afj3.b();
		if (!this.d.b() && !afj3.b()) {
			boolean4 = afj3.c() == this.d.c() && afj.a(afj3, this.d) && (afj3.f() || afj3.j() == this.d.j());
		}

		return co.equals(this.c) && boolean4;
	}

	private void n() {
		int integer2 = this.a.h.bs.d;
		if (integer2 != this.j) {
			this.j = integer2;
			this.b.a(new jh(this.j));
		}
	}

	public rk a(bps bps, bnq bnq, co co, cv cv, bdw bdw, ri ri) {
		this.n();
		afj afj8 = bps.b(ri);
		float float9 = (float)(bdw.b - (double)co.p());
		float float10 = (float)(bdw.c - (double)co.q());
		float float11 = (float)(bdw.d - (double)co.r());
		boolean boolean12 = false;
		if (!this.a.f.aj().a(co)) {
			return rk.FAIL;
		} else {
			if (this.i != ajq.SPECTATOR) {
				atl atl13 = bnq.o(co);
				if ((!bps.aM() || bps.cg().b() && bps.ch().b()) && atl13.v().a(bnq, co, atl13, bps, ri, cv, float9, float10, float11)) {
					boolean12 = true;
				}

				if (!boolean12 && afj8.c() instanceof adv) {
					adv adv14 = (adv)afj8.c();
					if (!adv14.a(bnq, co, cv, bps, afj8)) {
						return rk.FAIL;
					}
				}
			}

			this.b.a(new jm(co, cv, ri, float9, float10, float11));
			if (boolean12 || this.i == ajq.SPECTATOR) {
				return rk.SUCCESS;
			} else if (afj8.b()) {
				return rk.PASS;
			} else if (bps.di().a(afj8.c())) {
				return rk.PASS;
			} else {
				if (afj8.c() instanceof adv && !bps.dk()) {
					alu alu13 = ((adv)afj8.c()).d();
					if (alu13 instanceof amm || alu13 instanceof arg) {
						return rk.FAIL;
					}
				}

				if (this.i.d()) {
					int integer13 = afj8.j();
					int integer14 = afj8.E();
					rk rk15 = afj8.a(bps, bnq, co, ri, cv, float9, float10, float11);
					afj8.b(integer13);
					afj8.e(integer14);
					return rk15;
				} else {
					return afj8.a(bps, bnq, co, ri, cv, float9, float10, float11);
				}
			}
		}
	}

	public rk a(aay aay, ajs ajs, ri ri) {
		if (this.i == ajq.SPECTATOR) {
			return rk.PASS;
		} else {
			this.n();
			this.b.a(new jn(ri));
			afj afj5 = aay.b(ri);
			if (aay.di().a(afj5.c())) {
				return rk.PASS;
			} else {
				int integer6 = afj5.E();
				rl<afj> rl7 = afj5.a(ajs, aay, ri);
				afj afj8 = rl7.b();
				if (afj8 != afj5 || afj8.E() != integer6) {
					aay.a(ri, afj8);
				}

				return rl7.a();
			}
		}
	}

	public bps a(ajs ajs, ob ob) {
		return new bps(this.a, ajs, this.b, ob);
	}

	public void a(aay aay, sn sn) {
		this.n();
		this.b.a(new ix(sn));
		if (this.i != ajq.SPECTATOR) {
			aay.f(sn);
			aay.dh();
		}
	}

	public rk a(aay aay, sn sn, ri ri) {
		this.n();
		this.b.a(new ix(sn, ri));
		return this.i == ajq.SPECTATOR ? rk.PASS : aay.a(sn, ri);
	}

	public rk a(aay aay, sn sn, bdu bdu, ri ri) {
		this.n();
		bdw bdw6 = new bdw(bdu.c.b - sn.p, bdu.c.c - sn.q, bdu.c.d - sn.r);
		this.b.a(new ix(sn, ri, bdw6));
		return this.i == ajq.SPECTATOR ? rk.PASS : sn.a(aay, bdw6, ri);
	}

	public afj a(int integer1, int integer2, int integer3, acq acq, aay aay) {
		short short7 = aay.bu.a(aay.bs);
		afj afj8 = aay.bu.a(integer2, integer3, acq, aay);
		this.b.a(new iu(integer1, integer2, integer3, acq, afj8, short7));
		return afj8;
	}

	public void a(int integer1, int integer2) {
		this.b.a(new it(integer1, integer2));
	}

	public void a(afj afj, int integer) {
		if (this.i.d()) {
			this.b.a(new ji(integer, afj));
		}
	}

	public void a(afj afj) {
		if (this.i.d() && !afj.b()) {
			this.b.a(new ji(-1, afj));
		}
	}

	public void c(aay aay) {
		this.n();
		this.b.a(new jd(jd.a.RELEASE_USE_ITEM, co.a, cv.DOWN));
		aay.cE();
	}

	public boolean f() {
		return this.i.e();
	}

	public boolean g() {
		return !this.i.d();
	}

	public boolean h() {
		return this.i.d();
	}

	public boolean i() {
		return this.i.d();
	}

	public boolean j() {
		return this.a.h.aK() && this.a.h.bB() instanceof xm;
	}

	public boolean k() {
		return this.i == ajq.SPECTATOR;
	}

	public ajq l() {
		return this.i;
	}

	public boolean m() {
		return this.h;
	}

	public void a(int integer) {
		this.b.a(new iw("MC|PickItem", new et(Unpooled.buffer()).d(integer)));
	}
}
