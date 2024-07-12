import javax.annotation.Nullable;

public class amg extends alo {
	public static final aty a = aoi.D;
	protected static final bdt b = new bdt(0.0625, 0.0, 0.0, 0.9375, 0.875, 0.9375);
	protected static final bdt c = new bdt(0.0625, 0.0, 0.0625, 0.9375, 0.875, 1.0);
	protected static final bdt d = new bdt(0.0, 0.0, 0.0625, 0.9375, 0.875, 0.9375);
	protected static final bdt e = new bdt(0.0625, 0.0, 0.0625, 1.0, 0.875, 0.9375);
	protected static final bdt f = new bdt(0.0625, 0.0, 0.0625, 0.9375, 0.875, 0.9375);
	public final amg.a g;

	protected amg(amg.a a) {
		super(azs.d);
		this.y(this.A.b().a(amg.a, cv.NORTH));
		this.g = a;
		this.a(a == amg.a.TRAP ? aej.d : aej.c);
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean v(atl atl) {
		return true;
	}

	@Override
	public aqf a(atl atl) {
		return aqf.ENTITYBLOCK_ANIMATED;
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		if (ajw.o(co.c()).v() == this) {
			return b;
		} else if (ajw.o(co.d()).v() == this) {
			return c;
		} else if (ajw.o(co.e()).v() == this) {
			return d;
		} else {
			return ajw.o(co.f()).v() == this ? e : f;
		}
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		this.e(ajs, co, atl);

		for (cv cv6 : cv.c.HORIZONTAL) {
			co co7 = co.a(cv6);
			atl atl8 = ajs.o(co7);
			if (atl8.v() == this) {
				this.e(ajs, co7, atl8);
			}
		}
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return this.t().a(a, sw.bl());
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sw sw, afj afj) {
		cv cv7 = cv.b(ot.c((double)(sw.v * 4.0F / 360.0F) + 0.5) & 3).d();
		atl = atl.a(a, cv7);
		co co8 = co.c();
		co co9 = co.d();
		co co10 = co.e();
		co co11 = co.f();
		boolean boolean12 = this == ajs.o(co8).v();
		boolean boolean13 = this == ajs.o(co9).v();
		boolean boolean14 = this == ajs.o(co10).v();
		boolean boolean15 = this == ajs.o(co11).v();
		if (!boolean12 && !boolean13 && !boolean14 && !boolean15) {
			ajs.a(co, atl, 3);
		} else if (cv7.k() != cv.a.X || !boolean12 && !boolean13) {
			if (cv7.k() == cv.a.Z && (boolean14 || boolean15)) {
				if (boolean14) {
					ajs.a(co10, atl, 3);
				} else {
					ajs.a(co11, atl, 3);
				}

				ajs.a(co, atl, 3);
			}
		} else {
			if (boolean12) {
				ajs.a(co8, atl, 3);
			} else {
				ajs.a(co9, atl, 3);
			}

			ajs.a(co, atl, 3);
		}

		if (afj.t()) {
			asc asc16 = ajs.r(co);
			if (asc16 instanceof ase) {
				((ase)asc16).a(afj.r());
			}
		}
	}

	public atl e(ajs ajs, co co, atl atl) {
		if (ajs.E) {
			return atl;
		} else {
			atl atl5 = ajs.o(co.c());
			atl atl6 = ajs.o(co.d());
			atl atl7 = ajs.o(co.e());
			atl atl8 = ajs.o(co.f());
			cv cv9 = atl.c(a);
			if (atl5.v() != this && atl6.v() != this) {
				boolean boolean10 = atl5.b();
				boolean boolean11 = atl6.b();
				if (atl7.v() == this || atl8.v() == this) {
					co co12 = atl7.v() == this ? co.e() : co.f();
					atl atl13 = ajs.o(co12.c());
					atl atl14 = ajs.o(co12.d());
					cv9 = cv.SOUTH;
					cv cv15;
					if (atl7.v() == this) {
						cv15 = atl7.c(a);
					} else {
						cv15 = atl8.c(a);
					}

					if (cv15 == cv.NORTH) {
						cv9 = cv.NORTH;
					}

					if ((boolean10 || atl13.b()) && !boolean11 && !atl14.b()) {
						cv9 = cv.SOUTH;
					}

					if ((boolean11 || atl14.b()) && !boolean10 && !atl13.b()) {
						cv9 = cv.NORTH;
					}
				}
			} else {
				co co10 = atl5.v() == this ? co.c() : co.d();
				atl atl11 = ajs.o(co10.e());
				atl atl12 = ajs.o(co10.f());
				cv9 = cv.EAST;
				cv cv13;
				if (atl5.v() == this) {
					cv13 = atl5.c(a);
				} else {
					cv13 = atl6.c(a);
				}

				if (cv13 == cv.WEST) {
					cv9 = cv.WEST;
				}

				if ((atl7.b() || atl11.b()) && !atl8.b() && !atl12.b()) {
					cv9 = cv.EAST;
				}

				if ((atl8.b() || atl12.b()) && !atl7.b() && !atl11.b()) {
					cv9 = cv.WEST;
				}
			}

			atl = atl.a(a, cv9);
			ajs.a(co, atl, 3);
			return atl;
		}
	}

	public atl f(ajs ajs, co co, atl atl) {
		cv cv5 = null;

		for (cv cv7 : cv.c.HORIZONTAL) {
			atl atl8 = ajs.o(co.a(cv7));
			if (atl8.v() == this) {
				return atl;
			}

			if (atl8.b()) {
				if (cv5 != null) {
					cv5 = null;
					break;
				}

				cv5 = cv7;
			}
		}

		if (cv5 != null) {
			return atl.a(a, cv5.d());
		} else {
			cv cv6 = atl.c(a);
			if (ajs.o(co.a(cv6)).b()) {
				cv6 = cv6.d();
			}

			if (ajs.o(co.a(cv6)).b()) {
				cv6 = cv6.e();
			}

			if (ajs.o(co.a(cv6)).b()) {
				cv6 = cv6.d();
			}

			return atl.a(a, cv6);
		}
	}

	@Override
	public boolean a(ajs ajs, co co) {
		int integer4 = 0;
		co co5 = co.e();
		co co6 = co.f();
		co co7 = co.c();
		co co8 = co.d();
		if (ajs.o(co5).v() == this) {
			if (this.d(ajs, co5)) {
				return false;
			}

			integer4++;
		}

		if (ajs.o(co6).v() == this) {
			if (this.d(ajs, co6)) {
				return false;
			}

			integer4++;
		}

		if (ajs.o(co7).v() == this) {
			if (this.d(ajs, co7)) {
				return false;
			}

			integer4++;
		}

		if (ajs.o(co8).v() == this) {
			if (this.d(ajs, co8)) {
				return false;
			}

			integer4++;
		}

		return integer4 <= 1;
	}

	private boolean d(ajs ajs, co co) {
		if (ajs.o(co).v() != this) {
			return false;
		} else {
			for (cv cv5 : cv.c.HORIZONTAL) {
				if (ajs.o(co.a(cv5)).v() == this) {
					return true;
				}
			}

			return false;
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		super.a(atl, ajs, co3, alu, co5);
		asc asc7 = ajs.r(co3);
		if (asc7 instanceof ase) {
			asc7.B();
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		asc asc5 = ajs.r(co);
		if (asc5 instanceof rc) {
			rf.a(ajs, co, (rc)asc5);
			ajs.d(co, this);
		}

		super.b(ajs, co, atl);
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (ajs.E) {
			return true;
		} else {
			ro ro11 = this.c(ajs, co);
			if (ro11 != null) {
				aay.a((rc)ro11);
				if (this.g == amg.a.BASIC) {
					aay.b(oa.aa);
				} else if (this.g == amg.a.TRAP) {
					aay.b(oa.U);
				}
			}

			return true;
		}
	}

	@Nullable
	public ro c(ajs ajs, co co) {
		return this.a(ajs, co, false);
	}

	@Nullable
	public ro a(ajs ajs, co co, boolean boolean3) {
		asc asc5 = ajs.r(co);
		if (!(asc5 instanceof ase)) {
			return null;
		} else {
			ro ro6 = (ase)asc5;
			if (!boolean3 && this.e(ajs, co)) {
				return null;
			} else {
				for (cv cv8 : cv.c.HORIZONTAL) {
					co co9 = co.a(cv8);
					alu alu10 = ajs.o(co9).v();
					if (alu10 == this) {
						if (this.e(ajs, co9)) {
							return null;
						}

						asc asc11 = ajs.r(co9);
						if (asc11 instanceof ase) {
							if (cv8 != cv.WEST && cv8 != cv.NORTH) {
								ro6 = new rb("container.chestDouble", ro6, (ase)asc11);
							} else {
								ro6 = new rb("container.chestDouble", (ase)asc11, ro6);
							}
						}
					}
				}

				return ro6;
			}
		}
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new ase();
	}

	@Override
	public boolean g(atl atl) {
		return this.g == amg.a.TRAP;
	}

	@Override
	public int b(atl atl, ajw ajw, co co, cv cv) {
		if (!atl.n()) {
			return 0;
		} else {
			int integer6 = 0;
			asc asc7 = ajw.r(co);
			if (asc7 instanceof ase) {
				integer6 = ((ase)asc7).l;
			}

			return ot.a(integer6, 0, 15);
		}
	}

	@Override
	public int c(atl atl, ajw ajw, co co, cv cv) {
		return cv == cv.UP ? atl.a(ajw, co, cv) : 0;
	}

	private boolean e(ajs ajs, co co) {
		return this.i(ajs, co) || this.j(ajs, co);
	}

	private boolean i(ajs ajs, co co) {
		return ajs.o(co.a()).m();
	}

	private boolean j(ajs ajs, co co) {
		for (sn sn5 : ajs.a(xb.class, new bdt((double)co.p(), (double)(co.q() + 1), (double)co.r(), (double)(co.p() + 1), (double)(co.q() + 2), (double)(co.r() + 1)))) {
			xb xb6 = (xb)sn5;
			if (xb6.dj()) {
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean x(atl atl) {
		return true;
	}

	@Override
	public int c(atl atl, ajs ajs, co co) {
		return acl.b(this.c(ajs, co));
	}

	@Override
	public atl a(int integer) {
		cv cv3 = cv.a(integer);
		if (cv3.k() == cv.a.Y) {
			cv3 = cv.NORTH;
		}

		return this.t().a(a, cv3);
	}

	@Override
	public int e(atl atl) {
		return ((cv)atl.c(a)).a();
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(a, aqi.a(atl.c(a)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(atl.c(a)));
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	public static enum a {
		BASIC,
		TRAP;
	}
}
