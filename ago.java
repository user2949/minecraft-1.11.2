import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ago extends afh {
	public ago() {
		this.a(aej.f);
	}

	@Override
	public String b(afj afj) {
		String string3 = ("" + dp.a(this.a() + ".name")).trim();
		String string4 = sp.a(h(afj));
		if (string4 != null) {
			string3 = string3 + " " + dp.a("entity." + string4 + ".name");
		}

		return string3;
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		afj afj10 = aay.b(ri);
		if (ajs.E) {
			return rk.SUCCESS;
		} else if (!aay.a(co.a(cv), cv, afj10)) {
			return rk.FAIL;
		} else {
			atl atl11 = ajs.o(co);
			alu alu12 = atl11.v();
			if (alu12 == alv.ac) {
				asc asc13 = ajs.r(co);
				if (asc13 instanceof asr) {
					aji aji14 = ((asr)asc13).a();
					aji14.a(h(afj10));
					asc13.x_();
					ajs.a(co, atl11, atl11, 3);
					if (!aay.bK.d) {
						afj10.g(1);
					}

					return rk.SUCCESS;
				}
			}

			co co13 = co.a(cv);
			double double14 = this.a(ajs, co13);
			sn sn16 = a(ajs, h(afj10), (double)co13.p() + 0.5, (double)co13.q() + double14, (double)co13.r() + 0.5);
			if (sn16 != null) {
				if (sn16 instanceof sw && afj10.t()) {
					sn16.c(afj10.r());
				}

				a(ajs, aay, afj10, sn16);
				if (!aay.bK.d) {
					afj10.g(1);
				}
			}

			return rk.SUCCESS;
		}
	}

	protected double a(ajs ajs, co co) {
		bdt bdt4 = new bdt(co).b(0.0, -1.0, 0.0);
		List<bdt> list5 = ajs.a(null, bdt4);
		if (list5.isEmpty()) {
			return 0.0;
		} else {
			double double6 = bdt4.b;

			for (bdt bdt9 : list5) {
				double6 = Math.max(bdt9.e, double6);
			}

			return double6 - (double)co.q();
		}
	}

	public static void a(ajs ajs, @Nullable aay aay, afj afj, @Nullable sn sn) {
		MinecraftServer minecraftServer5 = ajs.u();
		if (minecraftServer5 != null && sn != null) {
			du du6 = afj.p();
			if (du6 != null && du6.b("EntityTag", 10)) {
				if (!ajs.E && sn.bu() && (aay == null || !minecraftServer5.am().h(aay.cS()))) {
					return;
				}

				du du7 = sn.e(new du());
				UUID uUID8 = sn.be();
				du7.a(du6.o("EntityTag"));
				sn.a(uUID8);
				sn.f(du7);
			}
		}
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = aay.b(ri);
		if (ajs.E) {
			return new rl<>(rk.PASS, afj5);
		} else {
			bdu bdu6 = this.a(ajs, aay, true);
			if (bdu6 != null && bdu6.a == bdu.a.BLOCK) {
				co co7 = bdu6.a();
				if (!(ajs.o(co7).v() instanceof aoq)) {
					return new rl<>(rk.PASS, afj5);
				} else if (ajs.a(aay, co7) && aay.a(co7, bdu6.b, afj5)) {
					sn sn8 = a(ajs, h(afj5), (double)co7.p() + 0.5, (double)co7.q() + 0.5, (double)co7.r() + 0.5);
					if (sn8 == null) {
						return new rl<>(rk.PASS, afj5);
					} else {
						if (sn8 instanceof sw && afj5.t()) {
							sn8.c(afj5.r());
						}

						a(ajs, aay, afj5, sn8);
						if (!aay.bK.d) {
							afj5.g(1);
						}

						aay.b(oa.b(this));
						return new rl<>(rk.SUCCESS, afj5);
					}
				} else {
					return new rl<>(rk.FAIL, afj5);
				}
			} else {
				return new rl<>(rk.PASS, afj5);
			}
		}
	}

	@Nullable
	public static sn a(ajs ajs, @Nullable kq kq, double double3, double double4, double double5) {
		if (kq != null && sp.c.containsKey(kq)) {
			sn sn9 = null;

			for (int integer10 = 0; integer10 < 1; integer10++) {
				sn9 = sp.a(kq, ajs);
				if (sn9 instanceof sx) {
					sx sx11 = (sx)sn9;
					sn9.b(double3, double4, double5, ot.g(ajs.r.nextFloat() * 360.0F), 0.0F);
					sx11.aP = sx11.v;
					sx11.aN = sx11.v;
					sx11.a(ajs.D(new co(sx11)), null);
					ajs.a(sn9);
					sx11.D();
				}
			}

			return sn9;
		} else {
			return null;
		}
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (sp.a a6 : sp.c.values()) {
			afj afj7 = new afj(afh, 1);
			a(afj7, a6.a);
			dd.add(afj7);
		}
	}

	public static void a(afj afj, kq kq) {
		du du3 = afj.o() ? afj.p() : new du();
		du du4 = new du();
		du4.a("id", kq.toString());
		du3.a("EntityTag", du4);
		afj.b(du3);
	}

	@Nullable
	public static kq h(afj afj) {
		du du2 = afj.p();
		if (du2 == null) {
			return null;
		} else if (!du2.b("EntityTag", 10)) {
			return null;
		} else {
			du du3 = du2.o("EntityTag");
			if (!du3.b("id", 8)) {
				return null;
			} else {
				String string4 = du3.l("id");
				kq kq5 = new kq(string4);
				if (!string4.contains(":")) {
					du3.a("id", kq5.toString());
				}

				return kq5;
			}
		}
	}
}
