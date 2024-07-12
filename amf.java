import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class amf extends alu {
	public static final aua a = aua.a("level", 0, 3);
	protected static final bdt b = new bdt(0.0, 0.0, 0.0, 1.0, 0.3125, 1.0);
	protected static final bdt c = new bdt(0.0, 0.0, 0.0, 1.0, 1.0, 0.125);
	protected static final bdt d = new bdt(0.0, 0.0, 0.875, 1.0, 1.0, 1.0);
	protected static final bdt e = new bdt(0.875, 0.0, 0.0, 1.0, 1.0, 1.0);
	protected static final bdt f = new bdt(0.0, 0.0, 0.0, 0.125, 1.0, 1.0);

	public amf() {
		super(azs.f, azt.m);
		this.y(this.A.b().a(a, 0));
	}

	@Override
	public void a(atl atl, ajs ajs, co co, bdt bdt, List<bdt> list, @Nullable sn sn, boolean boolean7) {
		a(co, bdt, list, b);
		a(co, bdt, list, f);
		a(co, bdt, list, c);
		a(co, bdt, list, e);
		a(co, bdt, list, d);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return j;
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
	public void a(ajs ajs, co co, atl atl, sn sn) {
		int integer6 = (Integer)atl.c(a);
		float float7 = (float)co.q() + (6.0F + (float)(3 * integer6)) / 16.0F;
		if (!ajs.E && sn.aJ() && integer6 > 0 && sn.bo().b <= (double)float7) {
			sn.X();
			this.a(ajs, co, atl, integer6 - 1);
		}
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		afj afj11 = aay.b(ri);
		if (afj11.b()) {
			return true;
		} else {
			int integer12 = (Integer)atl.c(a);
			afh afh13 = afj11.c();
			if (afh13 == afl.aA) {
				if (integer12 < 3 && !ajs.E) {
					if (!aay.bK.d) {
						aay.a(ri, new afj(afl.az));
					}

					aay.b(oa.I);
					this.a(ajs, co, atl, 3);
					ajs.a(null, co, nn.N, no.BLOCKS, 1.0F, 1.0F);
				}

				return true;
			} else if (afh13 == afl.az) {
				if (integer12 == 3 && !ajs.E) {
					if (!aay.bK.d) {
						afj11.g(1);
						if (afj11.b()) {
							aay.a(ri, new afj(afl.aA));
						} else if (!aay.bs.c(new afj(afl.aA))) {
							aay.a(new afj(afl.aA), false);
						}
					}

					aay.b(oa.J);
					this.a(ajs, co, atl, 0);
					ajs.a(null, co, nn.P, no.BLOCKS, 1.0F, 1.0F);
				}

				return true;
			} else if (afh13 == afl.bK) {
				if (integer12 > 0 && !ajs.E) {
					if (!aay.bK.d) {
						afj afj14 = aha.a(new afj(afl.bH), ahb.b);
						aay.b(oa.J);
						afj11.g(1);
						if (afj11.b()) {
							aay.a(ri, afj14);
						} else if (!aay.bs.c(afj14)) {
							aay.a(afj14, false);
						} else if (aay instanceof ly) {
							((ly)aay).a(aay.bt);
						}
					}

					ajs.a(null, co, nn.K, no.BLOCKS, 1.0F, 1.0F);
					this.a(ajs, co, atl, integer12 - 1);
				}

				return true;
			} else if (afh13 == afl.bH && aha.d(afj11) == ahb.b) {
				if (integer12 < 3 && !ajs.E) {
					if (!aay.bK.d) {
						afj afj14 = new afj(afl.bK);
						aay.b(oa.J);
						aay.a(ri, afj14);
						if (aay instanceof ly) {
							((ly)aay).a(aay.bt);
						}
					}

					ajs.a(null, co, nn.J, no.BLOCKS, 1.0F, 1.0F);
					this.a(ajs, co, atl, integer12 + 1);
				}

				return true;
			} else {
				if (integer12 > 0 && afh13 instanceof adp) {
					adp adp14 = (adp)afh13;
					if (adp14.d() == adp.a.LEATHER && adp14.e_(afj11) && !ajs.E) {
						adp14.d(afj11);
						this.a(ajs, co, atl, integer12 - 1);
						aay.b(oa.K);
						return true;
					}
				}

				if (integer12 > 0 && afh13 instanceof adt) {
					if (arz.b(afj11) > 0 && !ajs.E) {
						afj afj14 = afj11.l();
						afj14.e(1);
						arz.c(afj14);
						aay.b(oa.L);
						if (!aay.bK.d) {
							afj11.g(1);
							this.a(ajs, co, atl, integer12 - 1);
						}

						if (afj11.b()) {
							aay.a(ri, afj14);
						} else if (!aay.bs.c(afj14)) {
							aay.a(afj14, false);
						} else if (aay instanceof ly) {
							((ly)aay).a(aay.bt);
						}
					}

					return true;
				} else {
					return false;
				}
			}
		}
	}

	public void a(ajs ajs, co co, atl atl, int integer) {
		ajs.a(co, atl.a(a, ot.a(integer, 0, 3)), 2);
		ajs.d(co, this);
	}

	@Override
	public void h(ajs ajs, co co) {
		if (ajs.r.nextInt(20) == 1) {
			float float4 = ajs.b(co).a(co);
			if (!(ajs.A().a(float4, co.q()) < 0.15F)) {
				atl atl5 = ajs.o(co);
				if ((Integer)atl5.c(a) < 3) {
					ajs.a(co, atl5.a(a), 2);
				}
			}
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.bR;
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(afl.bR);
	}

	@Override
	public boolean x(atl atl) {
		return true;
	}

	@Override
	public int c(atl atl, ajs ajs, co co) {
		return (Integer)atl.c(a);
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, integer);
	}

	@Override
	public int e(atl atl) {
		return (Integer)atl.c(a);
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	@Override
	public boolean b(ajw ajw, co co) {
		return true;
	}
}
