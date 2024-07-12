import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class awa extends avz {
	private Random k;
	private ajs l;
	private co m = co.a;
	int a;
	int b;
	double c = 0.618;
	double d = 0.381;
	double e = 1.0;
	double f = 1.0;
	int g = 1;
	int h = 12;
	int i = 4;
	List<awa.a> j;

	public awa(boolean boolean1) {
		super(boolean1);
	}

	void a() {
		this.b = (int)((double)this.a * this.c);
		if (this.b >= this.a) {
			this.b = this.a - 1;
		}

		int integer2 = (int)(1.382 + Math.pow(this.f * (double)this.a / 13.0, 2.0));
		if (integer2 < 1) {
			integer2 = 1;
		}

		int integer3 = this.m.q() + this.b;
		int integer4 = this.a - this.i;
		this.j = Lists.newArrayList();
		this.j.add(new awa.a(this.m.b(integer4), integer3));

		for (; integer4 >= 0; integer4--) {
			float float5 = this.a(integer4);
			if (!(float5 < 0.0F)) {
				for (int integer6 = 0; integer6 < integer2; integer6++) {
					double double7 = this.e * (double)float5 * ((double)this.k.nextFloat() + 0.328);
					double double9 = (double)(this.k.nextFloat() * 2.0F) * Math.PI;
					double double11 = double7 * Math.sin(double9) + 0.5;
					double double13 = double7 * Math.cos(double9) + 0.5;
					co co15 = this.m.a(double11, (double)(integer4 - 1), double13);
					co co16 = co15.b(this.i);
					if (this.a(co15, co16) == -1) {
						int integer17 = this.m.p() - co15.p();
						int integer18 = this.m.r() - co15.r();
						double double19 = (double)co15.q() - Math.sqrt((double)(integer17 * integer17 + integer18 * integer18)) * this.d;
						int integer21 = double19 > (double)integer3 ? integer3 : (int)double19;
						co co22 = new co(this.m.p(), integer21, this.m.r());
						if (this.a(co22, co15) == -1) {
							this.j.add(new awa.a(co15, co22.q()));
						}
					}
				}
			}
		}
	}

	void a(co co, float float2, atl atl) {
		int integer5 = (int)((double)float2 + 0.618);

		for (int integer6 = -integer5; integer6 <= integer5; integer6++) {
			for (int integer7 = -integer5; integer7 <= integer5; integer7++) {
				if (Math.pow((double)Math.abs(integer6) + 0.5, 2.0) + Math.pow((double)Math.abs(integer7) + 0.5, 2.0) <= (double)(float2 * float2)) {
					co co8 = co.a(integer6, 0, integer7);
					azs azs9 = this.l.o(co8).a();
					if (azs9 == azs.a || azs9 == azs.j) {
						this.a(this.l, co8, atl);
					}
				}
			}
		}
	}

	float a(int integer) {
		if ((float)integer < (float)this.a * 0.3F) {
			return -1.0F;
		} else {
			float float3 = (float)this.a / 2.0F;
			float float4 = float3 - (float)integer;
			float float5 = ot.c(float3 * float3 - float4 * float4);
			if (float4 == 0.0F) {
				float5 = float3;
			} else if (Math.abs(float4) >= float3) {
				return 0.0F;
			}

			return float5 * 0.5F;
		}
	}

	float b(int integer) {
		if (integer < 0 || integer >= this.i) {
			return -1.0F;
		} else {
			return integer != 0 && integer != this.i - 1 ? 3.0F : 2.0F;
		}
	}

	void a(co co) {
		for (int integer3 = 0; integer3 < this.i; integer3++) {
			this.a(co.b(integer3), this.b(integer3), alv.t.t().a(aon.b, false));
		}
	}

	void a(co co1, co co2, alu alu) {
		co co5 = co2.a(-co1.p(), -co1.q(), -co1.r());
		int integer6 = this.b(co5);
		float float7 = (float)co5.p() / (float)integer6;
		float float8 = (float)co5.q() / (float)integer6;
		float float9 = (float)co5.r() / (float)integer6;

		for (int integer10 = 0; integer10 <= integer6; integer10++) {
			co co11 = co1.a((double)(0.5F + (float)integer10 * float7), (double)(0.5F + (float)integer10 * float8), (double)(0.5F + (float)integer10 * float9));
			aor.a a12 = this.b(co1, co11);
			this.a(this.l, co11, alu.t().a(aor.a, a12));
		}
	}

	private int b(co co) {
		int integer3 = ot.a(co.p());
		int integer4 = ot.a(co.q());
		int integer5 = ot.a(co.r());
		if (integer5 > integer3 && integer5 > integer4) {
			return integer5;
		} else {
			return integer4 > integer3 ? integer4 : integer3;
		}
	}

	private aor.a b(co co1, co co2) {
		aor.a a4 = aor.a.Y;
		int integer5 = Math.abs(co2.p() - co1.p());
		int integer6 = Math.abs(co2.r() - co1.r());
		int integer7 = Math.max(integer5, integer6);
		if (integer7 > 0) {
			if (integer5 == integer7) {
				a4 = aor.a.X;
			} else if (integer6 == integer7) {
				a4 = aor.a.Z;
			}
		}

		return a4;
	}

	void b() {
		for (awa.a a3 : this.j) {
			this.a(a3);
		}
	}

	boolean c(int integer) {
		return (double)integer >= (double)this.a * 0.2;
	}

	void c() {
		co co2 = this.m;
		co co3 = this.m.b(this.b);
		alu alu4 = alv.r;
		this.a(co2, co3, alu4);
		if (this.g == 2) {
			this.a(co2.f(), co3.f(), alu4);
			this.a(co2.f().d(), co3.f().d(), alu4);
			this.a(co2.d(), co3.d(), alu4);
		}
	}

	void d() {
		for (awa.a a3 : this.j) {
			int integer4 = a3.s();
			co co5 = new co(this.m.p(), integer4, this.m.r());
			if (!co5.equals(a3) && this.c(integer4 - this.m.q())) {
				this.a(co5, a3, alv.r);
			}
		}
	}

	int a(co co1, co co2) {
		co co4 = co2.a(-co1.p(), -co1.q(), -co1.r());
		int integer5 = this.b(co4);
		float float6 = (float)co4.p() / (float)integer5;
		float float7 = (float)co4.q() / (float)integer5;
		float float8 = (float)co4.r() / (float)integer5;
		if (integer5 == 0) {
			return -1;
		} else {
			for (int integer9 = 0; integer9 <= integer5; integer9++) {
				co co10 = co1.a((double)(0.5F + (float)integer9 * float6), (double)(0.5F + (float)integer9 * float7), (double)(0.5F + (float)integer9 * float8));
				if (!this.a(this.l.o(co10).v())) {
					return integer9;
				}
			}

			return -1;
		}
	}

	@Override
	public void e() {
		this.i = 5;
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		this.l = ajs;
		this.m = co;
		this.k = new Random(random.nextLong());
		if (this.a == 0) {
			this.a = 5 + this.k.nextInt(this.h);
		}

		if (!this.f()) {
			return false;
		} else {
			this.a();
			this.b();
			this.c();
			this.d();
			return true;
		}
	}

	private boolean f() {
		alu alu2 = this.l.o(this.m.b()).v();
		if (alu2 != alv.d && alu2 != alv.c && alu2 != alv.ak) {
			return false;
		} else {
			int integer3 = this.a(this.m, this.m.b(this.a - 1));
			if (integer3 == -1) {
				return true;
			} else if (integer3 < 6) {
				return false;
			} else {
				this.a = integer3;
				return true;
			}
		}
	}

	static class a extends co {
		private final int b;

		public a(co co, int integer) {
			super(co.p(), co.q(), co.r());
			this.b = integer;
		}

		public int s() {
			return this.b;
		}
	}
}
