import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class bfh extends bfi {
	private static final kq f = new kq("textures/misc/vignette.png");
	private static final kq g = new kq("textures/gui/widgets.png");
	private static final kq h = new kq("textures/misc/pumpkinblur.png");
	private final Random i = new Random();
	private final bes j;
	private final bvh k;
	private final bfn l;
	private int m;
	private String n = "";
	private int o;
	private boolean p;
	public float a = 1.0F;
	private int q;
	private afj r = afj.a;
	private final bfp s;
	private final bgf t;
	private final bgh u;
	private final bgc v;
	private final bfl w;
	private int x;
	private String y = "";
	private String z = "";
	private int A;
	private int B;
	private int C;
	private int D;
	private int E;
	private long F;
	private long G;

	public bfh(bes bes) {
		this.j = bes;
		this.k = bes.ad();
		this.s = new bfp(bes);
		this.u = new bgh(bes);
		this.l = new bfn(bes);
		this.v = new bgc(bes, this);
		this.w = new bfl(bes);
		this.t = new bgf(bes);
		this.a();
	}

	public void a() {
		this.A = 10;
		this.B = 70;
		this.C = 20;
	}

	public void a(float float1) {
		bfk bfk3 = new bfk(this.j);
		int integer4 = bfk3.a();
		int integer5 = bfk3.b();
		bfg bfg6 = this.f();
		bqg.m();
		if (bes.x()) {
			this.b(this.j.h.e(float1), bfk3);
		} else {
			bqg.k();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		}

		afj afj7 = this.j.h.bs.g(3);
		if (this.j.u.as == 0 && afj7.c() == afh.a(alv.aU)) {
			this.f(bfk3);
		}

		if (!this.j.h.a(si.i)) {
			float float8 = this.j.h.bW + (this.j.h.bV - this.j.h.bW) * float1;
			if (float8 > 0.0F) {
				this.c(float8, bfk3);
			}
		}

		if (this.j.c.a()) {
			this.u.a(bfk3, float1);
		} else {
			this.a(bfk3, float1);
		}

		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.j.N().a(d);
		bqg.m();
		this.a(float1, bfk3);
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		this.j.B.a("bossHealth");
		this.w.a();
		this.j.B.b();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.j.N().a(d);
		if (this.j.c.b()) {
			this.d(bfk3);
		}

		this.e(bfk3);
		bqg.l();
		if (this.j.h.cV() > 0) {
			this.j.B.a("sleep");
			bqg.j();
			bqg.d();
			int integer8 = this.j.h.cV();
			float float9 = (float)integer8 / 100.0F;
			if (float9 > 1.0F) {
				float9 = 1.0F - (float)(integer8 - 100) / 10.0F;
			}

			int integer10 = (int)(220.0F * float9) << 24 | 1052704;
			a(0, 0, integer4, integer5, integer10);
			bqg.e();
			bqg.k();
			this.j.B.b();
		}

		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		int integer8 = integer4 / 2 - 91;
		if (this.j.h.I()) {
			this.a(bfk3, integer8);
		} else if (this.j.c.f()) {
			this.b(bfk3, integer8);
		}

		if (this.j.u.E && !this.j.c.a()) {
			this.b(bfk3);
		} else if (this.j.h.y()) {
			this.u.a(bfk3);
		}

		if (this.j.u()) {
			this.c(bfk3);
		}

		this.a(bfk3);
		if (this.j.u.at) {
			this.s.a(bfk3);
		}

		if (this.o > 0) {
			this.j.B.a("overlayMessage");
			float float9 = (float)this.o - float1;
			int integer10 = (int)(float9 * 255.0F / 20.0F);
			if (integer10 > 255) {
				integer10 = 255;
			}

			if (integer10 > 8) {
				bqg.G();
				bqg.c((float)(integer4 / 2), (float)(integer5 - 68), 0.0F);
				bqg.m();
				bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
				int integer11 = 16777215;
				if (this.p) {
					integer11 = ot.c(float9 / 50.0F, 0.7F, 0.6F) & 16777215;
				}

				bfg6.a(this.n, -bfg6.a(this.n) / 2, -4, integer11 + (integer10 << 24 & 0xFF000000));
				bqg.l();
				bqg.H();
			}

			this.j.B.b();
		}

		this.t.a(bfk3);
		if (this.x > 0) {
			this.j.B.a("titleAndSubtitle");
			float float9x = (float)this.x - float1;
			int integer10x = 255;
			if (this.x > this.C + this.B) {
				float float11 = (float)(this.A + this.B + this.C) - float9x;
				integer10x = (int)(float11 * 255.0F / (float)this.A);
			}

			if (this.x <= this.C) {
				integer10x = (int)(float9x * 255.0F / (float)this.C);
			}

			integer10x = ot.a(integer10x, 0, 255);
			if (integer10x > 8) {
				bqg.G();
				bqg.c((float)(integer4 / 2), (float)(integer5 / 2), 0.0F);
				bqg.m();
				bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
				bqg.G();
				bqg.b(4.0F, 4.0F, 4.0F);
				int integer11 = integer10x << 24 & 0xFF000000;
				bfg6.a(this.y, (float)(-bfg6.a(this.y) / 2), -10.0F, 16777215 | integer11, true);
				bqg.H();
				bqg.G();
				bqg.b(2.0F, 2.0F, 2.0F);
				bfg6.a(this.z, (float)(-bfg6.a(this.z) / 2), 5.0F, 16777215 | integer11, true);
				bqg.H();
				bqg.l();
				bqg.H();
			}

			this.j.B.b();
		}

		bec bec9 = this.j.f.ad();
		bdy bdy10 = null;
		bdz bdz11 = bec9.g(this.j.h.h_());
		if (bdz11 != null) {
			int integer12 = bdz11.m().b();
			if (integer12 >= 0) {
				bdy10 = bec9.a(3 + integer12);
			}
		}

		bdy bdy12 = bdy10 != null ? bdy10 : bec9.a(1);
		if (bdy12 != null) {
			this.a(bdy12, bfk3);
		}

		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		bqg.d();
		bqg.G();
		bqg.c(0.0F, (float)(integer5 - 48), 0.0F);
		this.j.B.a("chat");
		this.l.a(this.m);
		this.j.B.b();
		bqg.H();
		bdy12 = bec9.a(0);
		if (!this.j.u.ag.e() || this.j.D() && this.j.h.d.d().size() <= 1 && bdy12 == null) {
			this.v.a(false);
		} else {
			this.v.a(true);
			this.v.a(integer4, bec9, bdy12);
		}

		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.g();
		bqg.e();
	}

	private void a(float float1, bfk bfk) {
		beu beu4 = this.j.u;
		if (beu4.as == 0) {
			if (this.j.c.a() && this.j.i == null) {
				bdu bdu5 = this.j.t;
				if (bdu5 == null || bdu5.a != bdu.a.BLOCK) {
					return;
				}

				co co6 = bdu5.a();
				if (!this.j.f.o(co6).v().l() || !(this.j.f.r(co6) instanceof rc)) {
					return;
				}
			}

			int integer5 = bfk.a();
			int integer6 = bfk.b();
			if (beu4.at && !beu4.ar && !this.j.h.df() && !beu4.w) {
				bqg.G();
				bqg.c((float)(integer5 / 2), (float)(integer6 / 2), this.e);
				sn sn7 = this.j.aa();
				bqg.b(sn7.y + (sn7.w - sn7.y) * float1, -1.0F, 0.0F, 0.0F);
				bqg.b(sn7.x + (sn7.v - sn7.x) * float1, 0.0F, 1.0F, 0.0F);
				bqg.b(-1.0F, -1.0F, -1.0F);
				cdb.m(10);
				bqg.H();
			} else {
				bqg.a(bqg.r.ONE_MINUS_DST_COLOR, bqg.l.ONE_MINUS_SRC_COLOR, bqg.r.ONE, bqg.l.ZERO);
				bqg.e();
				this.b(integer5 / 2 - 7, integer6 / 2 - 7, 0, 0, 16, 16);
				if (this.j.u.N == 1) {
					float float7 = this.j.h.o(0.0F);
					boolean boolean8 = false;
					if (this.j.i != null && this.j.i instanceof sw && float7 >= 1.0F) {
						boolean8 = this.j.h.dg() > 5.0F;
						boolean8 &= ((sw)this.j.i).au();
					}

					int integer9 = integer6 / 2 - 7 + 16;
					int integer10 = integer5 / 2 - 8;
					if (boolean8) {
						this.b(integer10, integer9, 68, 94, 16, 16);
					} else if (float7 < 1.0F) {
						int integer11 = (int)(float7 * 17.0F);
						this.b(integer10, integer9, 36, 94, 16, 4);
						this.b(integer10, integer9, 52, 94, integer11, 4);
					}
				}
			}
		}
	}

	protected void a(bfk bfk) {
		Collection<sh> collection3 = this.j.h.bS();
		if (!collection3.isEmpty()) {
			this.j.N().a(big.a);
			bqg.m();
			int integer4 = 0;
			int integer5 = 0;

			for (sh sh7 : Ordering.natural().reverse().sortedCopy(collection3)) {
				sg sg8 = sh7.a();
				if (sg8.c() && sh7.e()) {
					int integer9 = bfk.a();
					int integer10 = 1;
					if (this.j.u()) {
						integer10 += 15;
					}

					int integer11 = sg8.d();
					if (sg8.i()) {
						integer4++;
						integer9 -= 25 * integer4;
					} else {
						integer5++;
						integer9 -= 25 * integer5;
						integer10 += 26;
					}

					bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
					float float12 = 1.0F;
					if (sh7.d()) {
						this.b(integer9, integer10, 165, 166, 24, 24);
					} else {
						this.b(integer9, integer10, 141, 166, 24, 24);
						if (sh7.b() <= 200) {
							int integer13 = 10 - sh7.b() / 20;
							float12 = ot.a((float)sh7.b() / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
								+ ot.b((float)sh7.b() * (float) Math.PI / 5.0F) * ot.a((float)integer13 / 10.0F * 0.25F, 0.0F, 0.25F);
						}
					}

					bqg.c(1.0F, 1.0F, 1.0F, float12);
					this.b(integer9 + 3, integer10 + 3, integer11 % 8 * 18, 198 + integer11 / 8 * 18, 18, 18);
				}
			}
		}
	}

	protected void a(bfk bfk, float float2) {
		if (this.j.aa() instanceof aay) {
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			this.j.N().a(g);
			aay aay4 = (aay)this.j.aa();
			afj afj5 = aay4.ch();
			sv sv6 = aay4.cx().a();
			int integer7 = bfk.a() / 2;
			float float8 = this.e;
			int integer9 = 182;
			int integer10 = 91;
			this.e = -90.0F;
			this.b(integer7 - 91, bfk.b() - 22, 0, 0, 182, 22);
			this.b(integer7 - 91 - 1 + aay4.bs.d * 20, bfk.b() - 22 - 1, 0, 22, 24, 22);
			if (!afj5.b()) {
				if (sv6 == sv.LEFT) {
					this.b(integer7 - 91 - 29, bfk.b() - 23, 24, 22, 29, 24);
				} else {
					this.b(integer7 + 91, bfk.b() - 23, 53, 22, 29, 24);
				}
			}

			this.e = float8;
			bqg.D();
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
			beq.c();

			for (int integer11 = 0; integer11 < 9; integer11++) {
				int integer12 = integer7 - 90 + integer11 * 20 + 2;
				int integer13 = bfk.b() - 16 - 3;
				this.a(integer12, integer13, float2, aay4, aay4.bs.a.get(integer11));
			}

			if (!afj5.b()) {
				int integer11 = bfk.b() - 16 - 3;
				if (sv6 == sv.LEFT) {
					this.a(integer7 - 91 - 26, integer11, float2, aay4, afj5);
				} else {
					this.a(integer7 + 91 + 10, integer11, float2, aay4, afj5);
				}
			}

			if (this.j.u.N == 2) {
				float float11 = this.j.h.o(0.0F);
				if (float11 < 1.0F) {
					int integer12 = bfk.b() - 20;
					int integer13 = integer7 + 91 + 6;
					if (sv6 == sv.RIGHT) {
						integer13 = integer7 - 91 - 22;
					}

					this.j.N().a(bfi.d);
					int integer14 = (int)(float11 * 19.0F);
					bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
					this.b(integer13, integer12, 0, 94, 18, 18);
					this.b(integer13, integer12 + 18 - integer14, 18, 112 - integer14, 18, integer14);
				}
			}

			beq.a();
			bqg.E();
			bqg.l();
		}
	}

	public void a(bfk bfk, int integer) {
		this.j.B.a("jumpBar");
		this.j.N().a(bfi.d);
		float float4 = this.j.h.J();
		int integer5 = 182;
		int integer6 = (int)(float4 * 183.0F);
		int integer7 = bfk.b() - 32 + 3;
		this.b(integer, integer7, 0, 84, 182, 5);
		if (integer6 > 0) {
			this.b(integer, integer7, 0, 89, integer6, 5);
		}

		this.j.B.b();
	}

	public void b(bfk bfk, int integer) {
		this.j.B.a("expBar");
		this.j.N().a(bfi.d);
		int integer4 = this.j.h.cZ();
		if (integer4 > 0) {
			int integer5 = 182;
			int integer6 = (int)(this.j.h.bN * 183.0F);
			int integer7 = bfk.b() - 32 + 3;
			this.b(integer, integer7, 0, 64, 182, 5);
			if (integer6 > 0) {
				this.b(integer, integer7, 0, 69, integer6, 5);
			}
		}

		this.j.B.b();
		if (this.j.h.bL > 0) {
			this.j.B.a("expLevel");
			String string5 = "" + this.j.h.bL;
			int integer6 = (bfk.a() - this.f().a(string5)) / 2;
			int integer7 = bfk.b() - 31 - 4;
			this.f().a(string5, integer6 + 1, integer7, 0);
			this.f().a(string5, integer6 - 1, integer7, 0);
			this.f().a(string5, integer6, integer7 + 1, 0);
			this.f().a(string5, integer6, integer7 - 1, 0);
			this.f().a(string5, integer6, integer7, 8453920);
			this.j.B.b();
		}
	}

	public void b(bfk bfk) {
		this.j.B.a("selectedItemName");
		if (this.q > 0 && !this.r.b()) {
			String string3 = this.r.r();
			if (this.r.t()) {
				string3 = a.ITALIC + string3;
			}

			int integer4 = (bfk.a() - this.f().a(string3)) / 2;
			int integer5 = bfk.b() - 59;
			if (!this.j.c.b()) {
				integer5 += 14;
			}

			int integer6 = (int)((float)this.q * 256.0F / 10.0F);
			if (integer6 > 255) {
				integer6 = 255;
			}

			if (integer6 > 0) {
				bqg.G();
				bqg.m();
				bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
				this.f().a(string3, (float)integer4, (float)integer5, 16777215 + (integer6 << 24));
				bqg.l();
				bqg.H();
			}
		}

		this.j.B.b();
	}

	public void c(bfk bfk) {
		this.j.B.a("demo");
		String string3;
		if (this.j.f.P() >= 120500L) {
			string3 = cah.a("demo.demoExpired");
		} else {
			string3 = cah.a("demo.remainingTime", oy.a((int)(120500L - this.j.f.P())));
		}

		int integer4 = this.f().a(string3);
		this.f().a(string3, (float)(bfk.a() - integer4 - 10), 5.0F, 16777215);
		this.j.B.b();
	}

	private void a(bdy bdy, bfk bfk) {
		bec bec4 = bdy.a();
		Collection<bea> collection5 = bec4.i(bdy);
		List<bea> list6 = Lists.newArrayList(Iterables.filter(collection5, new Predicate<bea>() {
			public boolean apply(@Nullable bea bea) {
				return bea.e() != null && !bea.e().startsWith("#");
			}
		}));
		if (list6.size() > 15) {
			collection5 = Lists.newArrayList(Iterables.skip(list6, collection5.size() - 15));
		} else {
			collection5 = list6;
		}

		int integer7 = this.f().a(bdy.d());

		for (bea bea9 : collection5) {
			bdz bdz10 = bec4.g(bea9.e());
			String string11 = bdz.a(bdz10, bea9.e()) + ": " + a.RED + bea9.c();
			integer7 = Math.max(integer7, this.f().a(string11));
		}

		int integer8 = collection5.size() * this.f().a;
		int integer9 = bfk.b() / 2 + integer8 / 3;
		int integer10 = 3;
		int integer11 = bfk.a() - integer7 - 3;
		int integer12 = 0;

		for (bea bea14 : collection5) {
			integer12++;
			bdz bdz15 = bec4.g(bea14.e());
			String string16 = bdz.a(bdz15, bea14.e());
			String string17 = a.RED + "" + bea14.c();
			int integer19 = integer9 - integer12 * this.f().a;
			int integer20 = bfk.a() - 3 + 2;
			a(integer11 - 2, integer19, integer20, integer19 + this.f().a, 1342177280);
			this.f().a(string16, integer11, integer19, 553648127);
			this.f().a(string17, integer20 - this.f().a(string17), integer19, 553648127);
			if (integer12 == collection5.size()) {
				String string21 = bdy.d();
				a(integer11 - 2, integer19 - this.f().a - 1, integer20, integer19 - 1, 1610612736);
				a(integer11 - 2, integer19 - 1, integer20, integer19, 1342177280);
				this.f().a(string21, integer11 + integer7 / 2 - this.f().a(string21) / 2, integer19 - this.f().a, 553648127);
			}
		}
	}

	private void d(bfk bfk) {
		if (this.j.aa() instanceof aay) {
			aay aay3 = (aay)this.j.aa();
			int integer4 = ot.f(aay3.bU());
			boolean boolean5 = this.G > (long)this.m && (this.G - (long)this.m) / 3L % 2L == 1L;
			if (integer4 < this.D && aay3.V > 0) {
				this.F = bes.I();
				this.G = (long)(this.m + 20);
			} else if (integer4 > this.D && aay3.V > 0) {
				this.F = bes.I();
				this.G = (long)(this.m + 10);
			}

			if (bes.I() - this.F > 1000L) {
				this.D = integer4;
				this.E = integer4;
				this.F = bes.I();
			}

			this.D = integer4;
			int integer6 = this.E;
			this.i.setSeed((long)(this.m * 312871));
			acj acj7 = aay3.da();
			int integer8 = acj7.a();
			tk tk9 = aay3.a(aad.a);
			int integer10 = bfk.a() / 2 - 91;
			int integer11 = bfk.a() / 2 + 91;
			int integer12 = bfk.b() - 39;
			float float13 = (float)tk9.e();
			int integer14 = ot.f(aay3.cv());
			int integer15 = ot.f((float13 + (float)integer14) / 2.0F / 10.0F);
			int integer16 = Math.max(10 - (integer15 - 2), 3);
			int integer17 = integer12 - (integer15 - 1) * integer16 - 10;
			int integer18 = integer12 - 10;
			int integer19 = integer14;
			int integer20 = aay3.bY();
			int integer21 = -1;
			if (aay3.a(si.j)) {
				integer21 = this.m % ot.f(float13 + 5.0F);
			}

			this.j.B.a("armor");

			for (int integer22 = 0; integer22 < 10; integer22++) {
				if (integer20 > 0) {
					int integer23 = integer10 + integer22 * 8;
					if (integer22 * 2 + 1 < integer20) {
						this.b(integer23, integer17, 34, 9, 9, 9);
					}

					if (integer22 * 2 + 1 == integer20) {
						this.b(integer23, integer17, 25, 9, 9, 9);
					}

					if (integer22 * 2 + 1 > integer20) {
						this.b(integer23, integer17, 16, 9, 9, 9);
					}
				}
			}

			this.j.B.c("health");

			for (int integer22x = ot.f((float13 + (float)integer14) / 2.0F) - 1; integer22x >= 0; integer22x--) {
				int integer23x = 16;
				if (aay3.a(si.s)) {
					integer23x += 36;
				} else if (aay3.a(si.t)) {
					integer23x += 72;
				}

				int integer24 = 0;
				if (boolean5) {
					integer24 = 1;
				}

				int integer25 = ot.f((float)(integer22x + 1) / 10.0F) - 1;
				int integer26 = integer10 + integer22x % 10 * 8;
				int integer27 = integer12 - integer25 * integer16;
				if (integer4 <= 4) {
					integer27 += this.i.nextInt(2);
				}

				if (integer19 <= 0 && integer22x == integer21) {
					integer27 -= 2;
				}

				int integer28 = 0;
				if (aay3.l.T().s()) {
					integer28 = 5;
				}

				this.b(integer26, integer27, 16 + integer24 * 9, 9 * integer28, 9, 9);
				if (boolean5) {
					if (integer22x * 2 + 1 < integer6) {
						this.b(integer26, integer27, integer23x + 54, 9 * integer28, 9, 9);
					}

					if (integer22x * 2 + 1 == integer6) {
						this.b(integer26, integer27, integer23x + 63, 9 * integer28, 9, 9);
					}
				}

				if (integer19 > 0) {
					if (integer19 == integer14 && integer14 % 2 == 1) {
						this.b(integer26, integer27, integer23x + 153, 9 * integer28, 9, 9);
						integer19--;
					} else {
						this.b(integer26, integer27, integer23x + 144, 9 * integer28, 9, 9);
						integer19 -= 2;
					}
				} else {
					if (integer22x * 2 + 1 < integer4) {
						this.b(integer26, integer27, integer23x + 36, 9 * integer28, 9, 9);
					}

					if (integer22x * 2 + 1 == integer4) {
						this.b(integer26, integer27, integer23x + 45, 9 * integer28, 9, 9);
					}
				}
			}

			sn sn22 = aay3.bB();
			if (sn22 == null || !(sn22 instanceof sw)) {
				this.j.B.c("food");

				for (int integer23xx = 0; integer23xx < 10; integer23xx++) {
					int integer24x = integer12;
					int integer25x = 16;
					int integer26x = 0;
					if (aay3.a(si.q)) {
						integer25x += 36;
						integer26x = 13;
					}

					if (aay3.da().e() <= 0.0F && this.m % (integer8 * 3 + 1) == 0) {
						integer24x = integer12 + (this.i.nextInt(3) - 1);
					}

					int integer27x = integer11 - integer23xx * 8 - 9;
					this.b(integer27x, integer24x, 16 + integer26x * 9, 27, 9, 9);
					if (integer23xx * 2 + 1 < integer8) {
						this.b(integer27x, integer24x, integer25x + 36, 27, 9, 9);
					}

					if (integer23xx * 2 + 1 == integer8) {
						this.b(integer27x, integer24x, integer25x + 45, 27, 9, 9);
					}
				}
			}

			this.j.B.c("air");
			if (aay3.a(azs.h)) {
				int integer23xx = this.j.h.aR();
				int integer24xx = ot.f((double)(integer23xx - 2) * 10.0 / 300.0);
				int integer25xx = ot.f((double)integer23xx * 10.0 / 300.0) - integer24xx;

				for (int integer26xx = 0; integer26xx < integer24xx + integer25xx; integer26xx++) {
					if (integer26xx < integer24xx) {
						this.b(integer11 - integer26xx * 8 - 9, integer18, 16, 18, 9, 9);
					} else {
						this.b(integer11 - integer26xx * 8 - 9, integer18, 25, 18, 9, 9);
					}
				}
			}

			this.j.B.b();
		}
	}

	private void e(bfk bfk) {
		if (this.j.aa() instanceof aay) {
			aay aay3 = (aay)this.j.aa();
			sn sn4 = aay3.bB();
			if (sn4 instanceof sw) {
				this.j.B.c("mountHealth");
				sw sw5 = (sw)sn4;
				int integer6 = (int)Math.ceil((double)sw5.bU());
				float float7 = sw5.cb();
				int integer8 = (int)(float7 + 0.5F) / 2;
				if (integer8 > 30) {
					integer8 = 30;
				}

				int integer9 = bfk.b() - 39;
				int integer10 = bfk.a() / 2 + 91;
				int integer11 = integer9;
				int integer12 = 0;

				for (boolean boolean13 = false; integer8 > 0; integer12 += 20) {
					int integer14 = Math.min(integer8, 10);
					integer8 -= integer14;

					for (int integer15 = 0; integer15 < integer14; integer15++) {
						int integer16 = 52;
						int integer17 = 0;
						int integer18 = integer10 - integer15 * 8 - 9;
						this.b(integer18, integer11, 52 + integer17 * 9, 9, 9, 9);
						if (integer15 * 2 + 1 + integer12 < integer6) {
							this.b(integer18, integer11, 88, 9, 9, 9);
						}

						if (integer15 * 2 + 1 + integer12 == integer6) {
							this.b(integer18, integer11, 97, 9, 9, 9);
						}
					}

					integer11 -= 10;
				}
			}
		}
	}

	private void f(bfk bfk) {
		bqg.j();
		bqg.a(false);
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.d();
		this.j.N().a(h);
		bqs bqs3 = bqs.a();
		bpy bpy4 = bqs3.c();
		bpy4.a(7, bzh.g);
		bpy4.b(0.0, (double)bfk.b(), -90.0).a(0.0, 1.0).d();
		bpy4.b((double)bfk.a(), (double)bfk.b(), -90.0).a(1.0, 1.0).d();
		bpy4.b((double)bfk.a(), 0.0, -90.0).a(1.0, 0.0).d();
		bpy4.b(0.0, 0.0, -90.0).a(0.0, 0.0).d();
		bqs3.b();
		bqg.a(true);
		bqg.k();
		bqg.e();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
	}

	private void b(float float1, bfk bfk) {
		float1 = 1.0F - float1;
		float1 = ot.a(float1, 0.0F, 1.0F);
		auf auf4 = this.j.f.aj();
		float float5 = (float)auf4.a(this.j.h);
		double double6 = Math.min(auf4.o() * (double)auf4.p() * 1000.0, Math.abs(auf4.j() - auf4.h()));
		double double8 = Math.max((double)auf4.q(), double6);
		if ((double)float5 < double8) {
			float5 = 1.0F - (float)((double)float5 / double8);
		} else {
			float5 = 0.0F;
		}

		this.a = (float)((double)this.a + (double)(float1 - this.a) * 0.01);
		bqg.j();
		bqg.a(false);
		bqg.a(bqg.r.ZERO, bqg.l.ONE_MINUS_SRC_COLOR, bqg.r.ONE, bqg.l.ZERO);
		if (float5 > 0.0F) {
			bqg.c(0.0F, float5, float5, 1.0F);
		} else {
			bqg.c(this.a, this.a, this.a, 1.0F);
		}

		this.j.N().a(f);
		bqs bqs10 = bqs.a();
		bpy bpy11 = bqs10.c();
		bpy11.a(7, bzh.g);
		bpy11.b(0.0, (double)bfk.b(), -90.0).a(0.0, 1.0).d();
		bpy11.b((double)bfk.a(), (double)bfk.b(), -90.0).a(1.0, 1.0).d();
		bpy11.b((double)bfk.a(), 0.0, -90.0).a(1.0, 0.0).d();
		bpy11.b(0.0, 0.0, -90.0).a(0.0, 0.0).d();
		bqs10.b();
		bqg.a(true);
		bqg.k();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
	}

	private void c(float float1, bfk bfk) {
		if (float1 < 1.0F) {
			float1 *= float1;
			float1 *= float1;
			float1 = float1 * 0.8F + 0.2F;
		}

		bqg.d();
		bqg.j();
		bqg.a(false);
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		bqg.c(1.0F, 1.0F, 1.0F, float1);
		this.j.N().a(byy.g);
		byz byz4 = this.j.ab().a().a(alv.aY.t());
		float float5 = byz4.e();
		float float6 = byz4.g();
		float float7 = byz4.f();
		float float8 = byz4.h();
		bqs bqs9 = bqs.a();
		bpy bpy10 = bqs9.c();
		bpy10.a(7, bzh.g);
		bpy10.b(0.0, (double)bfk.b(), -90.0).a((double)float5, (double)float8).d();
		bpy10.b((double)bfk.a(), (double)bfk.b(), -90.0).a((double)float7, (double)float8).d();
		bpy10.b((double)bfk.a(), 0.0, -90.0).a((double)float7, (double)float6).d();
		bpy10.b(0.0, 0.0, -90.0).a((double)float5, (double)float6).d();
		bqs9.b();
		bqg.a(true);
		bqg.k();
		bqg.e();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
	}

	private void a(int integer1, int integer2, float float3, aay aay, afj afj) {
		if (!afj.b()) {
			float float7 = (float)afj.D() - float3;
			if (float7 > 0.0F) {
				bqg.G();
				float float8 = 1.0F + float7 / 5.0F;
				bqg.c((float)(integer1 + 8), (float)(integer2 + 12), 0.0F);
				bqg.b(1.0F / float8, (float8 + 1.0F) / 2.0F, 1.0F);
				bqg.c((float)(-(integer1 + 8)), (float)(-(integer2 + 12)), 0.0F);
			}

			this.k.a(aay, afj, integer1, integer2);
			if (float7 > 0.0F) {
				bqg.H();
			}

			this.k.a(this.j.k, afj, integer1, integer2);
		}
	}

	public void c() {
		if (this.o > 0) {
			this.o--;
		}

		if (this.x > 0) {
			this.x--;
			if (this.x <= 0) {
				this.y = "";
				this.z = "";
			}
		}

		this.m++;
		if (this.j.h != null) {
			afj afj2 = this.j.h.bs.i();
			if (afj2.b()) {
				this.q = 0;
			} else if (!this.r.b() && afj2.c() == this.r.c() && afj.a(afj2, this.r) && (afj2.f() || afj2.j() == this.r.j())) {
				if (this.q > 0) {
					this.q--;
				}
			} else {
				this.q = 40;
			}

			this.r = afj2;
		}
	}

	public void a(String string) {
		this.a(cah.a("record.nowPlaying", string), true);
	}

	public void a(String string, boolean boolean2) {
		this.n = string;
		this.o = 60;
		this.p = boolean2;
	}

	public void a(String string1, String string2, int integer3, int integer4, int integer5) {
		if (string1 == null && string2 == null && integer3 < 0 && integer4 < 0 && integer5 < 0) {
			this.y = "";
			this.z = "";
			this.x = 0;
		} else if (string1 != null) {
			this.y = string1;
			this.x = this.A + this.B + this.C;
		} else if (string2 != null) {
			this.z = string2;
		} else {
			if (integer3 >= 0) {
				this.A = integer3;
			}

			if (integer4 >= 0) {
				this.B = integer4;
			}

			if (integer5 >= 0) {
				this.C = integer5;
			}

			if (this.x > 0) {
				this.x = this.A + this.B + this.C;
			}
		}
	}

	public void a(fb fb, boolean boolean2) {
		this.a(fb.c(), boolean2);
	}

	public bfn d() {
		return this.l;
	}

	public int e() {
		return this.m;
	}

	public bfg f() {
		return this.j.k;
	}

	public bgh g() {
		return this.u;
	}

	public bgc h() {
		return this.v;
	}

	public void i() {
		this.v.a();
		this.w.b();
	}

	public bfl j() {
		return this.w;
	}
}
