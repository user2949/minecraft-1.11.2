import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;

public class bgc extends bfi {
	private static final Ordering<bnr> a = Ordering.from(new bgc.a());
	private final bes f;
	private final bfh g;
	private fb h;
	private fb i;
	private long j;
	private boolean k;

	public bgc(bes bes, bfh bfh) {
		this.f = bes;
		this.g = bfh;
	}

	public String a(bnr bnr) {
		return bnr.l() != null ? bnr.l().d() : bdz.a(bnr.j(), bnr.a().getName());
	}

	public void a(boolean boolean1) {
		if (boolean1 && !this.k) {
			this.j = bes.I();
		}

		this.k = boolean1;
	}

	public void a(int integer, bec bec, @Nullable bdy bdy) {
		bno bno5 = this.f.h.d;
		List<bnr> list6 = a.sortedCopy(bno5.d());
		int integer7 = 0;
		int integer8 = 0;

		for (bnr bnr10 : list6) {
			int integer11 = this.f.k.a(this.a(bnr10));
			integer7 = Math.max(integer7, integer11);
			if (bdy != null && bdy.e() != bei.a.HEARTS) {
				integer11 = this.f.k.a(" " + bec.c(bnr10.a().getName(), bdy).c());
				integer8 = Math.max(integer8, integer11);
			}
		}

		list6 = list6.subList(0, Math.min(list6.size(), 80));
		int integer9 = list6.size();
		int integer10 = integer9;

		int integer11;
		for (integer11 = 1; integer10 > 20; integer10 = (integer9 + integer11 - 1) / integer11) {
			integer11++;
		}

		boolean boolean12 = this.f.D() || this.f.v().a().f();
		int integer13;
		if (bdy != null) {
			if (bdy.e() == bei.a.HEARTS) {
				integer13 = 90;
			} else {
				integer13 = integer8;
			}
		} else {
			integer13 = 0;
		}

		int integer14 = Math.min(integer11 * ((boolean12 ? 9 : 0) + integer7 + integer13 + 13), integer - 50) / integer11;
		int integer15 = integer / 2 - (integer14 * integer11 + (integer11 - 1) * 5) / 2;
		int integer16 = 10;
		int integer17 = integer14 * integer11 + (integer11 - 1) * 5;
		List<String> list18 = null;
		if (this.i != null) {
			list18 = this.f.k.c(this.i.d(), integer - 50);

			for (String string20 : list18) {
				integer17 = Math.max(integer17, this.f.k.a(string20));
			}
		}

		List<String> list19 = null;
		if (this.h != null) {
			list19 = this.f.k.c(this.h.d(), integer - 50);

			for (String string21 : list19) {
				integer17 = Math.max(integer17, this.f.k.a(string21));
			}
		}

		if (list18 != null) {
			a(integer / 2 - integer17 / 2 - 1, integer16 - 1, integer / 2 + integer17 / 2 + 1, integer16 + list18.size() * this.f.k.a, Integer.MIN_VALUE);

			for (String string21 : list18) {
				int integer22 = this.f.k.a(string21);
				this.f.k.a(string21, (float)(integer / 2 - integer22 / 2), (float)integer16, -1);
				integer16 += this.f.k.a;
			}

			integer16++;
		}

		a(integer / 2 - integer17 / 2 - 1, integer16 - 1, integer / 2 + integer17 / 2 + 1, integer16 + integer10 * 9, Integer.MIN_VALUE);

		for (int integer20 = 0; integer20 < integer9; integer20++) {
			int integer21 = integer20 / integer10;
			int integer22 = integer20 % integer10;
			int integer23 = integer15 + integer21 * integer14 + integer21 * 5;
			int integer24 = integer16 + integer22 * 9;
			a(integer23, integer24, integer23 + integer14, integer24 + 8, 553648127);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			bqg.e();
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
			if (integer20 < list6.size()) {
				bnr bnr25 = (bnr)list6.get(integer20);
				GameProfile gameProfile26 = bnr25.a();
				if (boolean12) {
					aay aay27 = this.f.f.b(gameProfile26.getId());
					boolean boolean28 = aay27 != null && aay27.a(aaz.CAPE) && ("Dinnerbone".equals(gameProfile26.getName()) || "Grumm".equals(gameProfile26.getName()));
					this.f.N().a(bnr25.g());
					int integer29 = 8 + (boolean28 ? 8 : 0);
					int integer30 = 8 * (boolean28 ? -1 : 1);
					bfi.a(integer23, integer24, 8.0F, (float)integer29, 8, integer30, 8, 8, 64.0F, 64.0F);
					if (aay27 != null && aay27.a(aaz.HAT)) {
						int integer31 = 8 + (boolean28 ? 8 : 0);
						int integer32 = 8 * (boolean28 ? -1 : 1);
						bfi.a(integer23, integer24, 40.0F, (float)integer31, 8, integer32, 8, 8, 64.0F, 64.0F);
					}

					integer23 += 9;
				}

				String string27 = this.a(bnr25);
				if (bnr25.b() == ajq.SPECTATOR) {
					this.f.k.a(a.ITALIC + string27, (float)integer23, (float)integer24, -1862270977);
				} else {
					this.f.k.a(string27, (float)integer23, (float)integer24, -1);
				}

				if (bdy != null && bnr25.b() != ajq.SPECTATOR) {
					int integer28 = integer23 + integer7 + 1;
					int integer29 = integer28 + integer13;
					if (integer29 - integer28 > 5) {
						this.a(bdy, integer24, gameProfile26.getName(), integer28, integer29, bnr25);
					}
				}

				this.a(integer14, integer23 - (boolean12 ? 9 : 0), integer24, bnr25);
			}
		}

		if (list19 != null) {
			integer16 += integer10 * 9 + 1;
			a(integer / 2 - integer17 / 2 - 1, integer16 - 1, integer / 2 + integer17 / 2 + 1, integer16 + list19.size() * this.f.k.a, Integer.MIN_VALUE);

			for (String string21 : list19) {
				int integer22 = this.f.k.a(string21);
				this.f.k.a(string21, (float)(integer / 2 - integer22 / 2), (float)integer16, -1);
				integer16 += this.f.k.a;
			}
		}
	}

	protected void a(int integer1, int integer2, int integer3, bnr bnr) {
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.f.N().a(d);
		int integer6 = 0;
		int integer7;
		if (bnr.c() < 0) {
			integer7 = 5;
		} else if (bnr.c() < 150) {
			integer7 = 0;
		} else if (bnr.c() < 300) {
			integer7 = 1;
		} else if (bnr.c() < 600) {
			integer7 = 2;
		} else if (bnr.c() < 1000) {
			integer7 = 3;
		} else {
			integer7 = 4;
		}

		this.e += 100.0F;
		this.b(integer2 + integer1 - 11, integer3, 0, 176 + integer7 * 8, 10, 8);
		this.e -= 100.0F;
	}

	private void a(bdy bdy, int integer2, String string, int integer4, int integer5, bnr bnr) {
		int integer8 = bdy.a().c(string, bdy).c();
		if (bdy.e() == bei.a.HEARTS) {
			this.f.N().a(d);
			if (this.j == bnr.q()) {
				if (integer8 < bnr.m()) {
					bnr.a(bes.I());
					bnr.b((long)(this.g.e() + 20));
				} else if (integer8 > bnr.m()) {
					bnr.a(bes.I());
					bnr.b((long)(this.g.e() + 10));
				}
			}

			if (bes.I() - bnr.o() > 1000L || this.j != bnr.q()) {
				bnr.b(integer8);
				bnr.c(integer8);
				bnr.a(bes.I());
			}

			bnr.c(this.j);
			bnr.b(integer8);
			int integer9 = ot.f((float)Math.max(integer8, bnr.n()) / 2.0F);
			int integer10 = Math.max(ot.f((float)(integer8 / 2)), Math.max(ot.f((float)(bnr.n() / 2)), 10));
			boolean boolean11 = bnr.p() > (long)this.g.e() && (bnr.p() - (long)this.g.e()) / 3L % 2L == 1L;
			if (integer9 > 0) {
				float float12 = Math.min((float)(integer5 - integer4 - 4) / (float)integer10, 9.0F);
				if (float12 > 3.0F) {
					for (int integer13 = integer9; integer13 < integer10; integer13++) {
						this.a((float)integer4 + (float)integer13 * float12, (float)integer2, boolean11 ? 25 : 16, 0, 9, 9);
					}

					for (int integer13 = 0; integer13 < integer9; integer13++) {
						this.a((float)integer4 + (float)integer13 * float12, (float)integer2, boolean11 ? 25 : 16, 0, 9, 9);
						if (boolean11) {
							if (integer13 * 2 + 1 < bnr.n()) {
								this.a((float)integer4 + (float)integer13 * float12, (float)integer2, 70, 0, 9, 9);
							}

							if (integer13 * 2 + 1 == bnr.n()) {
								this.a((float)integer4 + (float)integer13 * float12, (float)integer2, 79, 0, 9, 9);
							}
						}

						if (integer13 * 2 + 1 < integer8) {
							this.a((float)integer4 + (float)integer13 * float12, (float)integer2, integer13 >= 10 ? 160 : 52, 0, 9, 9);
						}

						if (integer13 * 2 + 1 == integer8) {
							this.a((float)integer4 + (float)integer13 * float12, (float)integer2, integer13 >= 10 ? 169 : 61, 0, 9, 9);
						}
					}
				} else {
					float float13 = ot.a((float)integer8 / 20.0F, 0.0F, 1.0F);
					int integer14 = (int)((1.0F - float13) * 255.0F) << 16 | (int)(float13 * 255.0F) << 8;
					String string15 = "" + (float)integer8 / 2.0F;
					if (integer5 - this.f.k.a(string15 + "hp") >= integer4) {
						string15 = string15 + "hp";
					}

					this.f.k.a(string15, (float)((integer5 + integer4) / 2 - this.f.k.a(string15) / 2), (float)integer2, integer14);
				}
			}
		} else {
			String string9 = a.YELLOW + "" + integer8;
			this.f.k.a(string9, (float)(integer5 - this.f.k.a(string9)), (float)integer2, 16777215);
		}
	}

	public void a(@Nullable fb fb) {
		this.h = fb;
	}

	public void b(@Nullable fb fb) {
		this.i = fb;
	}

	public void a() {
		this.i = null;
		this.h = null;
	}

	static class a implements Comparator<bnr> {
		private a() {
		}

		public int compare(bnr bnr1, bnr bnr2) {
			bdz bdz4 = bnr1.j();
			bdz bdz5 = bnr2.j();
			return ComparisonChain.start()
				.compareTrueFirst(bnr1.b() != ajq.SPECTATOR, bnr2.b() != ajq.SPECTATOR)
				.compare(bdz4 != null ? bdz4.b() : "", bdz5 != null ? bdz5.b() : "")
				.compare(bnr1.a().getName(), bnr2.a().getName())
				.result();
		}
	}
}
