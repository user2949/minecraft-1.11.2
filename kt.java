import com.mojang.authlib.GameProfile;
import java.io.PrintStream;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class kt {
	public static final PrintStream a = System.out;
	private static boolean b;
	private static final Logger c = LogManager.getLogger();

	public static boolean a() {
		return b;
	}

	static void b() {
		amw.c.a(afl.h, new ks() {
			@Override
			protected abj a(ajs ajs, df df, afj afj) {
				abu abu5 = new abu(ajs, df.a(), df.b(), df.c());
				abu5.c = abb.a.ALLOWED;
				return abu5;
			}
		});
		amw.c.a(afl.j, new ks() {
			@Override
			protected abj a(ajs ajs, df df, afj afj) {
				abu abu5 = new abu(ajs, df.a(), df.b(), df.c());
				abu5.a(afj);
				abu5.c = abb.a.ALLOWED;
				return abu5;
			}
		});
		amw.c.a(afl.i, new ks() {
			@Override
			protected abj a(ajs ajs, df df, afj afj) {
				abb abb5 = new abo(ajs, df.a(), df.b(), df.c());
				abb5.c = abb.a.ALLOWED;
				return abb5;
			}
		});
		amw.c.a(afl.aX, new ks() {
			@Override
			protected abj a(ajs ajs, df df, afj afj) {
				return new abq(ajs, df.a(), df.b(), df.c());
			}
		});
		amw.c.a(afl.aG, new ks() {
			@Override
			protected abj a(ajs ajs, df df, afj afj) {
				return new abn(ajs, df.a(), df.b(), df.c());
			}
		});
		amw.c.a(afl.bV, new ks() {
			@Override
			protected abj a(ajs ajs, df df, afj afj) {
				return new abs(ajs, df.a(), df.b(), df.c());
			}

			@Override
			protected float a() {
				return super.a() * 0.5F;
			}

			@Override
			protected float b() {
				return super.b() * 1.25F;
			}
		});
		amw.c.a(afl.bI, new cw() {
			@Override
			public afj a(cp cp, afj afj) {
				return (new ks() {
					@Override
					protected abj a(ajs ajs, df df, afj afj) {
						return new abt(ajs, df.a(), df.b(), df.c(), afj.l());
					}

					@Override
					protected float a() {
						return super.a() * 0.5F;
					}

					@Override
					protected float b() {
						return super.b() * 1.25F;
					}
				}).a(cp, afj);
			}
		});
		amw.c.a(afl.bJ, new cw() {
			@Override
			public afj a(cp cp, afj afj) {
				return (new ks() {
					@Override
					protected abj a(ajs ajs, df df, afj afj) {
						return new abt(ajs, df.a(), df.b(), df.c(), afj.l());
					}

					@Override
					protected float a() {
						return super.a() * 0.5F;
					}

					@Override
					protected float b() {
						return super.b() * 1.25F;
					}
				}).a(cp, afj);
			}
		});
		amw.c.a(afl.bU, new cs() {
			@Override
			public afj b(cp cp, afj afj) {
				cv cv4 = cp.e().c(amw.a);
				double double5 = cp.a() + (double)cv4.g();
				double double7 = (double)((float)(cp.d().q() + cv4.h()) + 0.2F);
				double double9 = cp.c() + (double)cv4.i();
				sn sn11 = ago.a(cp.h(), ago.h(afj), double5, double7, double9);
				if (sn11 instanceof sw && afj.t()) {
					sn11.c(afj.r());
				}

				ago.a(cp.h(), null, afj, sn11);
				afj.g(1);
				return afj;
			}
		});
		amw.c.a(afl.cm, new cs() {
			@Override
			public afj b(cp cp, afj afj) {
				cv cv4 = cp.e().c(amw.a);
				double double5 = cp.a() + (double)cv4.g();
				double double7 = (double)((float)cp.d().q() + 0.2F);
				double double9 = cp.c() + (double)cv4.i();
				abg abg11 = new abg(cp.h(), double5, double7, double9, afj);
				cp.h().a(abg11);
				afj.g(1);
				return afj;
			}

			@Override
			protected void a(cp cp) {
				cp.h().b(1004, cp.d(), 0);
			}
		});
		amw.c.a(afl.bW, new cs() {
			@Override
			public afj b(cp cp, afj afj) {
				cv cv4 = cp.e().c(amw.a);
				df df5 = amw.a(cp);
				double double6 = df5.a() + (double)((float)cv4.g() * 0.3F);
				double double8 = df5.b() + (double)((float)cv4.h() * 0.3F);
				double double10 = df5.c() + (double)((float)cv4.i() * 0.3F);
				ajs ajs12 = cp.h();
				Random random13 = ajs12.r;
				double double14 = random13.nextGaussian() * 0.05 + (double)cv4.g();
				double double16 = random13.nextGaussian() * 0.05 + (double)cv4.h();
				double double18 = random13.nextGaussian() * 0.05 + (double)cv4.i();
				ajs12.a(new abm(ajs12, double6, double8, double10, double14, double16, double18));
				afj.g(1);
				return afj;
			}

			@Override
			protected void a(cp cp) {
				cp.h().b(1018, cp.d(), 0);
			}
		});
		amw.c.a(afl.aH, new kt.a(abx.b.OAK));
		amw.c.a(afl.aI, new kt.a(abx.b.SPRUCE));
		amw.c.a(afl.aJ, new kt.a(abx.b.BIRCH));
		amw.c.a(afl.aK, new kt.a(abx.b.JUNGLE));
		amw.c.a(afl.aM, new kt.a(abx.b.DARK_OAK));
		amw.c.a(afl.aL, new kt.a(abx.b.ACACIA));
		cw cw1 = new cs() {
			private final cs b = new cs();

			@Override
			public afj b(cp cp, afj afj) {
				aec aec4 = (aec)afj.c();
				co co5 = cp.d().a(cp.e().c(amw.a));
				return aec4.a(null, cp.h(), co5) ? new afj(afl.az) : this.b.a(cp, afj);
			}
		};
		amw.c.a(afl.aB, cw1);
		amw.c.a(afl.aA, cw1);
		amw.c.a(afl.az, new cs() {
			private final cs b = new cs();

			@Override
			public afj b(cp cp, afj afj) {
				ajs ajs4 = cp.h();
				co co5 = cp.d().a(cp.e().c(amw.a));
				atl atl6 = ajs4.o(co5);
				alu alu7 = atl6.v();
				azs azs8 = atl6.a();
				afh afh9;
				if (azs.h.equals(azs8) && alu7 instanceof aoq && (Integer)atl6.c(aoq.b) == 0) {
					afh9 = afl.aA;
				} else {
					if (!azs.i.equals(azs8) || !(alu7 instanceof aoq) || (Integer)atl6.c(aoq.b) != 0) {
						return super.b(cp, afj);
					}

					afh9 = afl.aB;
				}

				ajs4.g(co5);
				afj.g(1);
				if (afj.b()) {
					return new afj(afh9);
				} else {
					if (cp.<asi>g().a(new afj(afh9)) < 0) {
						this.b.a(cp, new afj(afh9));
					}

					return afj;
				}
			}
		});
		amw.c.a(afl.e, new kt.b() {
			@Override
			protected afj b(cp cp, afj afj) {
				ajs ajs4 = cp.h();
				this.b = true;
				co co5 = cp.d().a(cp.e().c(amw.a));
				if (ajs4.d(co5)) {
					ajs4.a(co5, alv.ab.t());
					if (afj.a(1, ajs4.r)) {
						afj.e(0);
					}
				} else if (ajs4.o(co5).v() == alv.W) {
					alv.W.d(ajs4, co5, alv.W.t().a(ark.a, true));
					ajs4.g(co5);
				} else {
					this.b = false;
				}

				return afj;
			}
		});
		amw.c.a(afl.be, new kt.b() {
			@Override
			protected afj b(cp cp, afj afj) {
				this.b = true;
				if (aem.WHITE == aem.a(afj.j())) {
					ajs ajs4 = cp.h();
					co co5 = cp.d().a(cp.e().c(amw.a));
					if (aen.a(afj, ajs4, co5)) {
						if (!ajs4.E) {
							ajs4.b(2005, co5, 0);
						}
					} else {
						this.b = false;
					}

					return afj;
				} else {
					return super.b(cp, afj);
				}
			}
		});
		amw.c.a(afh.a(alv.W), new cs() {
			@Override
			protected afj b(cp cp, afj afj) {
				ajs ajs4 = cp.h();
				co co5 = cp.d().a(cp.e().c(amw.a));
				zk zk6 = new zk(ajs4, (double)co5.p() + 0.5, (double)co5.q(), (double)co5.r() + 0.5, null);
				ajs4.a(zk6);
				ajs4.a(null, zk6.p, zk6.q, zk6.r, nn.gV, no.BLOCKS, 1.0F, 1.0F);
				afj.g(1);
				return afj;
			}
		});
		amw.c.a(afl.ci, new kt.b() {
			@Override
			protected afj b(cp cp, afj afj) {
				ajs ajs4 = cp.h();
				cv cv5 = cp.e().c(amw.a);
				co co6 = cp.d().a(cv5);
				aqp aqp7 = alv.ce;
				this.b = true;
				if (ajs4.d(co6) && aqp7.b(ajs4, co6, afj)) {
					if (!ajs4.E) {
						ajs4.a(co6, aqp7.t().a(aqp.a, cv.UP), 3);
						asc asc8 = ajs4.r(co6);
						if (asc8 instanceof asw) {
							if (afj.j() == 3) {
								GameProfile gameProfile9 = null;
								if (afj.o()) {
									du du10 = afj.p();
									if (du10.b("SkullOwner", 10)) {
										gameProfile9 = ee.a(du10.o("SkullOwner"));
									} else if (du10.b("SkullOwner", 8)) {
										String string11 = du10.l("SkullOwner");
										if (!oy.b(string11)) {
											gameProfile9 = new GameProfile(null, string11);
										}
									}
								}

								((asw)asc8).a(gameProfile9);
							} else {
								((asw)asc8).a(afj.j());
							}

							((asw)asc8).b(cv5.d().b() * 4);
							alv.ce.a(ajs4, co6, (asw)asc8);
						}

						afj.g(1);
					}
				} else if (adp.a(cp, afj).b()) {
					this.b = false;
				}

				return afj;
			}
		});
		amw.c.a(afh.a(alv.aU), new kt.b() {
			@Override
			protected afj b(cp cp, afj afj) {
				ajs ajs4 = cp.h();
				co co5 = cp.d().a(cp.e().c(amw.a));
				apu apu6 = (apu)alv.aU;
				this.b = true;
				if (ajs4.d(co5) && apu6.b(ajs4, co5)) {
					if (!ajs4.E) {
						ajs4.a(co5, apu6.t(), 3);
					}

					afj.g(1);
				} else {
					afj afj7 = adp.a(cp, afj);
					if (afj7.b()) {
						this.b = false;
					}
				}

				return afj;
			}
		});

		for (aem aem5 : aem.values()) {
			amw.c.a(afh.a(aqn.a(aem5)), new kt.c());
		}
	}

	public static void c() {
		if (!b) {
			b = true;
			d();
			nm.b();
			alu.w();
			ann.e();
			sg.k();
			aii.g();
			afh.u();
			agy.b();
			agz.a();
			sp.b();
			oa.a();
			akf.q();
			b();
		}
	}

	private static void d() {
		if (c.isDebugEnabled()) {
			System.setErr(new kx("STDERR", System.err));
			System.setOut(new kx("STDOUT", a));
		} else {
			System.setErr(new kz("STDERR", System.err));
			System.setOut(new kz("STDOUT", a));
		}
	}

	public static void a(String string) {
		a.println(string);
	}

	public static class a extends cs {
		private final cs b = new cs();
		private final abx.b c;

		public a(abx.b b) {
			this.c = b;
		}

		@Override
		public afj b(cp cp, afj afj) {
			cv cv4 = cp.e().c(amw.a);
			ajs ajs5 = cp.h();
			double double6 = cp.a() + (double)((float)cv4.g() * 1.125F);
			double double8 = cp.b() + (double)((float)cv4.h() * 1.125F);
			double double10 = cp.c() + (double)((float)cv4.i() * 1.125F);
			co co12 = cp.d().a(cv4);
			azs azs13 = ajs5.o(co12).a();
			double double14;
			if (azs.h.equals(azs13)) {
				double14 = 1.0;
			} else {
				if (!azs.a.equals(azs13) || !azs.h.equals(ajs5.o(co12.b()).a())) {
					return this.b.a(cp, afj);
				}

				double14 = 0.0;
			}

			abx abx16 = new abx(ajs5, double6, double8 + double14, double10);
			abx16.a(this.c);
			abx16.v = cv4.l();
			ajs5.a(abx16);
			afj.g(1);
			return afj;
		}

		@Override
		protected void a(cp cp) {
			cp.h().b(1000, cp.d(), 0);
		}
	}

	public abstract static class b extends cs {
		protected boolean b = true;

		@Override
		protected void a(cp cp) {
			cp.h().b(this.b ? 1000 : 1001, cp.d(), 0);
		}
	}

	static class c extends kt.b {
		private c() {
		}

		@Override
		protected afj b(cp cp, afj afj) {
			alu alu4 = alu.a(afj.c());
			ajs ajs5 = cp.h();
			cv cv6 = cp.e().c(amw.a);
			co co7 = cp.d().a(cv6);
			this.b = ajs5.a(alu4, co7, false, cv.DOWN, null);
			if (this.b) {
				cv cv8 = ajs5.d(co7.b()) ? cv6 : cv.UP;
				atl atl9 = alu4.t().a(aqn.a, cv8);
				ajs5.a(co7, atl9);
				asc asc10 = ajs5.r(co7);
				afj afj11 = afj.a(1);
				if (afj11.o()) {
					((asu)asc10).e(afj11.p().o("BlockEntityTag"));
				}

				if (afj11.t()) {
					((asu)asc10).a(afj11.r());
				}

				ajs5.d(co7, atl9.v());
			}

			return afj;
		}
	}
}
