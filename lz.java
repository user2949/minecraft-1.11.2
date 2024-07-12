public class lz {
	public ajs a;
	public ly b;
	private ajq c = ajq.NOT_SET;
	private boolean d;
	private int e;
	private co f = co.a;
	private int g;
	private boolean h;
	private co i = co.a;
	private int j;
	private int k = -1;

	public lz(ajs ajs) {
		this.a = ajs;
	}

	public void a(ajq ajq) {
		this.c = ajq;
		ajq.a(this.b.bK);
		this.b.w();
		this.b.b.am().a(new hg(hg.a.UPDATE_GAME_MODE, this.b));
		this.a.e();
	}

	public ajq b() {
		return this.c;
	}

	public boolean c() {
		return this.c.e();
	}

	public boolean d() {
		return this.c.d();
	}

	public void b(ajq ajq) {
		if (this.c == ajq.NOT_SET) {
			this.c = ajq;
		}

		this.a(this.c);
	}

	public void a() {
		this.g++;
		if (this.h) {
			int integer2 = this.g - this.j;
			atl atl3 = this.a.o(this.i);
			alu alu4 = atl3.v();
			if (atl3.a() == azs.a) {
				this.h = false;
			} else {
				float float5 = atl3.a(this.b, this.b.l, this.i) * (float)(integer2 + 1);
				int integer6 = (int)(float5 * 10.0F);
				if (integer6 != this.k) {
					this.a.c(this.b.O(), this.i, integer6);
					this.k = integer6;
				}

				if (float5 >= 1.0F) {
					this.h = false;
					this.b(this.i);
				}
			}
		} else if (this.d) {
			atl atl2 = this.a.o(this.f);
			alu alu3 = atl2.v();
			if (atl2.a() == azs.a) {
				this.a.c(this.b.O(), this.f, -1);
				this.k = -1;
				this.d = false;
			} else {
				int integer4 = this.g - this.e;
				float float5x = atl2.a(this.b, this.b.l, this.i) * (float)(integer4 + 1);
				int integer6x = (int)(float5x * 10.0F);
				if (integer6x != this.k) {
					this.a.c(this.b.O(), this.f, integer6x);
					this.k = integer6x;
				}
			}
		}
	}

	public void a(co co, cv cv) {
		if (this.d()) {
			if (!this.a.a(null, co, cv)) {
				this.b(co);
			}
		} else {
			atl atl4 = this.a.o(co);
			alu alu5 = atl4.v();
			if (this.c.c()) {
				if (this.c == ajq.SPECTATOR) {
					return;
				}

				if (!this.b.dc()) {
					afj afj6 = this.b.cg();
					if (afj6.b()) {
						return;
					}

					if (!afj6.a(alu5)) {
						return;
					}
				}
			}

			this.a.a(null, co, cv);
			this.e = this.g;
			float float6 = 1.0F;
			if (atl4.a() != azs.a) {
				alu5.a(this.a, co, (aay)this.b);
				float6 = atl4.a(this.b, this.b.l, co);
			}

			if (atl4.a() != azs.a && float6 >= 1.0F) {
				this.b(co);
			} else {
				this.d = true;
				this.f = co;
				int integer7 = (int)(float6 * 10.0F);
				this.a.c(this.b.O(), co, integer7);
				this.k = integer7;
			}
		}
	}

	public void a(co co) {
		if (co.equals(this.f)) {
			int integer3 = this.g - this.e;
			atl atl4 = this.a.o(co);
			if (atl4.a() != azs.a) {
				float float5 = atl4.a(this.b, this.b.l, co) * (float)(integer3 + 1);
				if (float5 >= 0.7F) {
					this.d = false;
					this.a.c(this.b.O(), co, -1);
					this.b(co);
				} else if (!this.h) {
					this.d = false;
					this.h = true;
					this.i = co;
					this.j = this.e;
				}
			}
		}
	}

	public void e() {
		this.d = false;
		this.a.c(this.b.O(), this.f, -1);
	}

	private boolean c(co co) {
		atl atl3 = this.a.o(co);
		atl3.v().a(this.a, co, atl3, (aay)this.b);
		boolean boolean4 = this.a.g(co);
		if (boolean4) {
			atl3.v().d(this.a, co, atl3);
		}

		return boolean4;
	}

	public boolean b(co co) {
		if (this.c.d() && !this.b.cg().b() && this.b.cg().c() instanceof agr) {
			return false;
		} else {
			atl atl3 = this.a.o(co);
			asc asc4 = this.a.r(co);
			alu alu5 = atl3.v();
			if ((alu5 instanceof amm || alu5 instanceof arg) && !this.b.dk()) {
				this.a.a(co, atl3, atl3, 3);
				return false;
			} else {
				if (this.c.c()) {
					if (this.c == ajq.SPECTATOR) {
						return false;
					}

					if (!this.b.dc()) {
						afj afj6 = this.b.cg();
						if (afj6.b()) {
							return false;
						}

						if (!afj6.a(alu5)) {
							return false;
						}
					}
				}

				this.a.a(this.b, 2001, co, alu.j(atl3));
				boolean boolean6 = this.c(co);
				if (this.d()) {
					this.b.a.a(new gb(this.a, co));
				} else {
					afj afj7 = this.b.cg();
					afj afj8 = afj7.b() ? afj.a : afj7.l();
					boolean boolean9 = this.b.b(atl3);
					if (!afj7.b()) {
						afj7.a(this.a, atl3, co, this.b);
					}

					if (boolean6 && boolean9) {
						atl3.v().a(this.a, this.b, co, atl3, asc4, afj8);
					}
				}

				return boolean6;
			}
		}
	}

	public rk a(aay aay, ajs ajs, afj afj, ri ri) {
		if (this.c == ajq.SPECTATOR) {
			return rk.PASS;
		} else if (aay.di().a(afj.c())) {
			return rk.PASS;
		} else {
			int integer6 = afj.E();
			int integer7 = afj.j();
			rl<afj> rl8 = afj.a(ajs, aay, ri);
			afj afj9 = rl8.b();
			if (afj9 == afj && afj9.E() == integer6 && afj9.m() <= 0 && afj9.j() == integer7) {
				return rl8.a();
			} else if (rl8.a() == rk.FAIL && afj9.m() > 0 && !aay.cy()) {
				return rl8.a();
			} else {
				aay.a(ri, afj9);
				if (this.d()) {
					afj9.e(integer6);
					if (afj9.f()) {
						afj9.b(integer7);
					}
				}

				if (afj9.b()) {
					aay.a(ri, afj.a);
				}

				if (!aay.cy()) {
					((ly)aay).a(aay.bt);
				}

				return rl8.a();
			}
		}
	}

	public rk a(aay aay, ajs ajs, afj afj, ri ri, co co, cv cv, float float7, float float8, float float9) {
		if (this.c == ajq.SPECTATOR) {
			asc asc11 = ajs.r(co);
			if (asc11 instanceof ro) {
				alu alu12 = ajs.o(co).v();
				ro ro13 = (ro)asc11;
				if (ro13 instanceof ase && alu12 instanceof amg) {
					ro13 = ((amg)alu12).c(ajs, co);
				}

				if (ro13 != null) {
					aay.a((rc)ro13);
					return rk.SUCCESS;
				}
			} else if (asc11 instanceof rc) {
				aay.a((rc)asc11);
				return rk.SUCCESS;
			}

			return rk.PASS;
		} else {
			if (!aay.aM() || aay.cg().b() && aay.ch().b()) {
				atl atl11 = ajs.o(co);
				if (atl11.v().a(ajs, co, atl11, aay, ri, cv, float7, float8, float9)) {
					return rk.SUCCESS;
				}
			}

			if (afj.b()) {
				return rk.PASS;
			} else if (aay.di().a(afj.c())) {
				return rk.PASS;
			} else {
				if (afj.c() instanceof adv && !aay.dk()) {
					alu alu11 = ((adv)afj.c()).d();
					if (alu11 instanceof amm || alu11 instanceof arg) {
						return rk.FAIL;
					}
				}

				if (this.d()) {
					int integer11 = afj.j();
					int integer12 = afj.E();
					rk rk13 = afj.a(aay, ajs, co, ri, cv, float7, float8, float9);
					afj.b(integer11);
					afj.e(integer12);
					return rk13;
				} else {
					return afj.a(aay, ajs, co, ri, cv, float7, float8, float9);
				}
			}
		}
	}

	public void a(lw lw) {
		this.a = lw;
	}
}
