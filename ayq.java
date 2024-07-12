import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public abstract class ayq {
	protected axz l;
	@Nullable
	private cv a;
	private aou b;
	private aqi c;
	protected int m;

	public ayq() {
	}

	protected ayq(int integer) {
		this.m = integer;
	}

	public final du c() {
		du du2 = new du();
		du2.a("id", ayo.a(this));
		du2.a("BB", this.l.g());
		cv cv3 = this.f();
		du2.a("O", cv3 == null ? -1 : cv3.b());
		du2.a("GD", this.m);
		this.a(du2);
		return du2;
	}

	protected abstract void a(du du);

	public void a(ajs ajs, du du) {
		if (du.e("BB")) {
			this.l = new axz(du.n("BB"));
		}

		int integer4 = du.h("O");
		this.a(integer4 == -1 ? null : cv.b(integer4));
		this.m = du.h("GD");
		this.a(du, ajs.S().h());
	}

	protected abstract void a(du du, ayz ayz);

	public void a(ayq ayq, List<ayq> list, Random random) {
	}

	public abstract boolean a(ajs ajs, Random random, axz axz);

	public axz d() {
		return this.l;
	}

	public int e() {
		return this.m;
	}

	public static ayq a(List<ayq> list, axz axz) {
		for (ayq ayq4 : list) {
			if (ayq4.d() != null && ayq4.d().a(axz)) {
				return ayq4;
			}
		}

		return null;
	}

	protected boolean a(ajs ajs, axz axz) {
		int integer4 = Math.max(this.l.a - 1, axz.a);
		int integer5 = Math.max(this.l.b - 1, axz.b);
		int integer6 = Math.max(this.l.c - 1, axz.c);
		int integer7 = Math.min(this.l.d + 1, axz.d);
		int integer8 = Math.min(this.l.e + 1, axz.e);
		int integer9 = Math.min(this.l.f + 1, axz.f);
		co.a a10 = new co.a();

		for (int integer11 = integer4; integer11 <= integer7; integer11++) {
			for (int integer12 = integer6; integer12 <= integer9; integer12++) {
				if (ajs.o(a10.c(integer11, integer5, integer12)).a().d()) {
					return true;
				}

				if (ajs.o(a10.c(integer11, integer8, integer12)).a().d()) {
					return true;
				}
			}
		}

		for (int integer11 = integer4; integer11 <= integer7; integer11++) {
			for (int integer12 = integer5; integer12 <= integer8; integer12++) {
				if (ajs.o(a10.c(integer11, integer12, integer6)).a().d()) {
					return true;
				}

				if (ajs.o(a10.c(integer11, integer12, integer9)).a().d()) {
					return true;
				}
			}
		}

		for (int integer11 = integer6; integer11 <= integer9; integer11++) {
			for (int integer12 = integer5; integer12 <= integer8; integer12++) {
				if (ajs.o(a10.c(integer4, integer12, integer11)).a().d()) {
					return true;
				}

				if (ajs.o(a10.c(integer7, integer12, integer11)).a().d()) {
					return true;
				}
			}
		}

		return false;
	}

	protected int a(int integer1, int integer2) {
		cv cv4 = this.f();
		if (cv4 == null) {
			return integer1;
		} else {
			switch (cv4) {
				case NORTH:
				case SOUTH:
					return this.l.a + integer1;
				case WEST:
					return this.l.d - integer2;
				case EAST:
					return this.l.a + integer2;
				default:
					return integer1;
			}
		}
	}

	protected int d(int integer) {
		return this.f() == null ? integer : integer + this.l.b;
	}

	protected int b(int integer1, int integer2) {
		cv cv4 = this.f();
		if (cv4 == null) {
			return integer2;
		} else {
			switch (cv4) {
				case NORTH:
					return this.l.f - integer2;
				case SOUTH:
					return this.l.c + integer2;
				case WEST:
				case EAST:
					return this.l.c + integer1;
				default:
					return integer2;
			}
		}
	}

	protected void a(ajs ajs, atl atl, int integer3, int integer4, int integer5, axz axz) {
		co co8 = new co(this.a(integer3, integer5), this.d(integer4), this.b(integer3, integer5));
		if (axz.b(co8)) {
			if (this.b != aou.NONE) {
				atl = atl.a(this.b);
			}

			if (this.c != aqi.NONE) {
				atl = atl.a(this.c);
			}

			ajs.a(co8, atl, 2);
		}
	}

	protected atl a(ajs ajs, int integer2, int integer3, int integer4, axz axz) {
		int integer7 = this.a(integer2, integer4);
		int integer8 = this.d(integer3);
		int integer9 = this.b(integer2, integer4);
		co co10 = new co(integer7, integer8, integer9);
		return !axz.b(co10) ? alv.a.t() : ajs.o(co10);
	}

	protected int b(ajs ajs, int integer2, int integer3, int integer4, axz axz) {
		int integer7 = this.a(integer2, integer4);
		int integer8 = this.d(integer3 + 1);
		int integer9 = this.b(integer2, integer4);
		co co10 = new co(integer7, integer8, integer9);
		return !axz.b(co10) ? ajy.SKY.c : ajs.b(ajy.SKY, co10);
	}

	protected void a(ajs ajs, axz axz, int integer3, int integer4, int integer5, int integer6, int integer7, int integer8) {
		for (int integer10 = integer4; integer10 <= integer7; integer10++) {
			for (int integer11 = integer3; integer11 <= integer6; integer11++) {
				for (int integer12 = integer5; integer12 <= integer8; integer12++) {
					this.a(ajs, alv.a.t(), integer11, integer10, integer12, axz);
				}
			}
		}
	}

	protected void a(ajs ajs, axz axz, int integer3, int integer4, int integer5, int integer6, int integer7, int integer8, atl atl9, atl atl10, boolean boolean11) {
		for (int integer13 = integer4; integer13 <= integer7; integer13++) {
			for (int integer14 = integer3; integer14 <= integer6; integer14++) {
				for (int integer15 = integer5; integer15 <= integer8; integer15++) {
					if (!boolean11 || this.a(ajs, integer14, integer13, integer15, axz).a() != azs.a) {
						if (integer13 != integer4 && integer13 != integer7 && integer14 != integer3 && integer14 != integer6 && integer15 != integer5 && integer15 != integer8) {
							this.a(ajs, atl10, integer14, integer13, integer15, axz);
						} else {
							this.a(ajs, atl9, integer14, integer13, integer15, axz);
						}
					}
				}
			}
		}
	}

	protected void a(
		ajs ajs, axz axz, int integer3, int integer4, int integer5, int integer6, int integer7, int integer8, boolean boolean9, Random random, ayq.a a
	) {
		for (int integer13 = integer4; integer13 <= integer7; integer13++) {
			for (int integer14 = integer3; integer14 <= integer6; integer14++) {
				for (int integer15 = integer5; integer15 <= integer8; integer15++) {
					if (!boolean9 || this.a(ajs, integer14, integer13, integer15, axz).a() != azs.a) {
						a.a(
							random,
							integer14,
							integer13,
							integer15,
							integer13 == integer4 || integer13 == integer7 || integer14 == integer3 || integer14 == integer6 || integer15 == integer5 || integer15 == integer8
						);
						this.a(ajs, a.a(), integer14, integer13, integer15, axz);
					}
				}
			}
		}
	}

	protected void a(
		ajs ajs,
		axz axz,
		Random random,
		float float4,
		int integer5,
		int integer6,
		int integer7,
		int integer8,
		int integer9,
		int integer10,
		atl atl11,
		atl atl12,
		boolean boolean13,
		int integer14
	) {
		for (int integer16 = integer6; integer16 <= integer9; integer16++) {
			for (int integer17 = integer5; integer17 <= integer8; integer17++) {
				for (int integer18 = integer7; integer18 <= integer10; integer18++) {
					if (!(random.nextFloat() > float4)
						&& (!boolean13 || this.a(ajs, integer17, integer16, integer18, axz).a() != azs.a)
						&& (integer14 <= 0 || this.b(ajs, integer17, integer16, integer18, axz) < integer14)) {
						if (integer16 != integer6 && integer16 != integer9 && integer17 != integer5 && integer17 != integer8 && integer18 != integer7 && integer18 != integer10) {
							this.a(ajs, atl12, integer17, integer16, integer18, axz);
						} else {
							this.a(ajs, atl11, integer17, integer16, integer18, axz);
						}
					}
				}
			}
		}
	}

	protected void a(ajs ajs, axz axz, Random random, float float4, int integer5, int integer6, int integer7, atl atl) {
		if (random.nextFloat() < float4) {
			this.a(ajs, atl, integer5, integer6, integer7, axz);
		}
	}

	protected void a(ajs ajs, axz axz, int integer3, int integer4, int integer5, int integer6, int integer7, int integer8, atl atl, boolean boolean10) {
		float float12 = (float)(integer6 - integer3 + 1);
		float float13 = (float)(integer7 - integer4 + 1);
		float float14 = (float)(integer8 - integer5 + 1);
		float float15 = (float)integer3 + float12 / 2.0F;
		float float16 = (float)integer5 + float14 / 2.0F;

		for (int integer17 = integer4; integer17 <= integer7; integer17++) {
			float float18 = (float)(integer17 - integer4) / float13;

			for (int integer19 = integer3; integer19 <= integer6; integer19++) {
				float float20 = ((float)integer19 - float15) / (float12 * 0.5F);

				for (int integer21 = integer5; integer21 <= integer8; integer21++) {
					float float22 = ((float)integer21 - float16) / (float14 * 0.5F);
					if (!boolean10 || this.a(ajs, integer19, integer17, integer21, axz).a() != azs.a) {
						float float23 = float20 * float20 + float18 * float18 + float22 * float22;
						if (float23 <= 1.05F) {
							this.a(ajs, atl, integer19, integer17, integer21, axz);
						}
					}
				}
			}
		}
	}

	protected void c(ajs ajs, int integer2, int integer3, int integer4, axz axz) {
		co co7 = new co(this.a(integer2, integer4), this.d(integer3), this.b(integer2, integer4));
		if (axz.b(co7)) {
			while (!ajs.d(co7) && co7.q() < 255) {
				ajs.a(co7, alv.a.t(), 2);
				co7 = co7.a();
			}
		}
	}

	protected void b(ajs ajs, atl atl, int integer3, int integer4, int integer5, axz axz) {
		int integer8 = this.a(integer3, integer5);
		int integer9 = this.d(integer4);
		int integer10 = this.b(integer3, integer5);
		if (axz.b(new co(integer8, integer9, integer10))) {
			while ((ajs.d(new co(integer8, integer9, integer10)) || ajs.o(new co(integer8, integer9, integer10)).a().d()) && integer9 > 1) {
				ajs.a(new co(integer8, integer9, integer10), atl, 2);
				integer9--;
			}
		}
	}

	protected boolean a(ajs ajs, axz axz, Random random, int integer4, int integer5, int integer6, kq kq) {
		co co9 = new co(this.a(integer4, integer6), this.d(integer5), this.b(integer4, integer6));
		return this.a(ajs, axz, random, co9, kq, null);
	}

	protected boolean a(ajs ajs, axz axz, Random random, co co, kq kq, @Nullable atl atl) {
		if (axz.b(co) && ajs.o(co).v() != alv.ae) {
			if (atl == null) {
				atl = alv.ae.f(ajs, co, alv.ae.t());
			}

			ajs.a(co, atl, 2);
			asc asc8 = ajs.r(co);
			if (asc8 instanceof ase) {
				((ase)asc8).a(kq, random.nextLong());
			}

			return true;
		} else {
			return false;
		}
	}

	protected boolean a(ajs ajs, axz axz, Random random, int integer4, int integer5, int integer6, cv cv, kq kq) {
		co co10 = new co(this.a(integer4, integer6), this.d(integer5), this.b(integer4, integer6));
		if (axz.b(co10) && ajs.o(co10).v() != alv.z) {
			this.a(ajs, alv.z.t().a(amw.a, cv), integer4, integer5, integer6, axz);
			asc asc11 = ajs.r(co10);
			if (asc11 instanceof asi) {
				((asi)asc11).a(kq, random.nextLong());
			}

			return true;
		} else {
			return false;
		}
	}

	protected void a(ajs ajs, axz axz, Random random, int integer4, int integer5, int integer6, cv cv, amx amx) {
		this.a(ajs, amx.t().a(amx.a, cv), integer4, integer5, integer6, axz);
		this.a(ajs, amx.t().a(amx.a, cv).a(amx.e, amx.a.UPPER), integer4, integer5 + 1, integer6, axz);
	}

	public void a(int integer1, int integer2, int integer3) {
		this.l.a(integer1, integer2, integer3);
	}

	@Nullable
	public cv f() {
		return this.a;
	}

	public void a(@Nullable cv cv) {
		this.a = cv;
		if (cv == null) {
			this.c = aqi.NONE;
			this.b = aou.NONE;
		} else {
			switch (cv) {
				case SOUTH:
					this.b = aou.LEFT_RIGHT;
					this.c = aqi.NONE;
					break;
				case WEST:
					this.b = aou.LEFT_RIGHT;
					this.c = aqi.CLOCKWISE_90;
					break;
				case EAST:
					this.b = aou.NONE;
					this.c = aqi.CLOCKWISE_90;
					break;
				default:
					this.b = aou.NONE;
					this.c = aqi.NONE;
			}
		}
	}

	public abstract static class a {
		protected atl a = alv.a.t();

		protected a() {
		}

		public abstract void a(Random random, int integer2, int integer3, int integer4, boolean boolean5);

		public atl a() {
			return this.a;
		}
	}
}
