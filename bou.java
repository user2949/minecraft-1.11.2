import java.util.List;
import java.util.Random;

public class bou {
	private static final bdt a = new bdt(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
	protected ajs c;
	protected double d;
	protected double e;
	protected double f;
	protected double g;
	protected double h;
	protected double i;
	protected double j;
	protected double k;
	protected double l;
	private bdt b = a;
	protected boolean m;
	protected boolean n;
	protected boolean o;
	protected float p = 0.6F;
	protected float q = 1.8F;
	protected Random r = new Random();
	protected int s;
	protected int t;
	protected float u;
	protected float v;
	protected int w;
	protected int x;
	protected float y;
	protected float z;
	protected float A;
	protected float B;
	protected float C;
	protected float D = 1.0F;
	protected byz E;
	protected float F;
	protected float G;
	public static double H;
	public static double I;
	public static double J;
	public static bdw K;

	protected bou(ajs ajs, double double2, double double3, double double4) {
		this.c = ajs;
		this.a(0.2F, 0.2F);
		this.b(double2, double3, double4);
		this.d = double2;
		this.e = double3;
		this.f = double4;
		this.A = 1.0F;
		this.B = 1.0F;
		this.C = 1.0F;
		this.u = this.r.nextFloat() * 3.0F;
		this.v = this.r.nextFloat() * 3.0F;
		this.y = (this.r.nextFloat() * 0.5F + 0.5F) * 2.0F;
		this.x = (int)(4.0F / (this.r.nextFloat() * 0.9F + 0.1F));
		this.w = 0;
		this.n = true;
	}

	public bou(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		this(ajs, double2, double3, double4);
		this.j = double5 + (Math.random() * 2.0 - 1.0) * 0.4F;
		this.k = double6 + (Math.random() * 2.0 - 1.0) * 0.4F;
		this.l = double7 + (Math.random() * 2.0 - 1.0) * 0.4F;
		float float15 = (float)(Math.random() + Math.random() + 1.0) * 0.15F;
		float float16 = ot.a(this.j * this.j + this.k * this.k + this.l * this.l);
		this.j = this.j / (double)float16 * (double)float15 * 0.4F;
		this.k = this.k / (double)float16 * (double)float15 * 0.4F + 0.1F;
		this.l = this.l / (double)float16 * (double)float15 * 0.4F;
	}

	public bou c(float float1) {
		this.j *= (double)float1;
		this.k = (this.k - 0.1F) * (double)float1 + 0.1F;
		this.l *= (double)float1;
		return this;
	}

	public bou d(float float1) {
		this.a(0.2F * float1, 0.2F * float1);
		this.y *= float1;
		return this;
	}

	public void a(float float1, float float2, float float3) {
		this.A = float1;
		this.B = float2;
		this.C = float3;
	}

	public void e(float float1) {
		this.D = float1;
	}

	public boolean c() {
		return false;
	}

	public float d() {
		return this.A;
	}

	public float e() {
		return this.B;
	}

	public float f() {
		return this.C;
	}

	public void a(int integer) {
		this.x = integer;
	}

	public void a() {
		this.d = this.g;
		this.e = this.h;
		this.f = this.i;
		if (this.w++ >= this.x) {
			this.i();
		}

		this.k = this.k - 0.04 * (double)this.z;
		this.a(this.j, this.k, this.l);
		this.j *= 0.98F;
		this.k *= 0.98F;
		this.l *= 0.98F;
		if (this.m) {
			this.j *= 0.7F;
			this.l *= 0.7F;
		}
	}

	public void a(bpy bpy, sn sn, float float3, float float4, float float5, float float6, float float7, float float8) {
		float float10 = (float)this.s / 16.0F;
		float float11 = float10 + 0.0624375F;
		float float12 = (float)this.t / 16.0F;
		float float13 = float12 + 0.0624375F;
		float float14 = 0.1F * this.y;
		if (this.E != null) {
			float10 = this.E.e();
			float11 = this.E.f();
			float12 = this.E.g();
			float13 = this.E.h();
		}

		float float15 = (float)(this.d + (this.g - this.d) * (double)float3 - H);
		float float16 = (float)(this.e + (this.h - this.e) * (double)float3 - I);
		float float17 = (float)(this.f + (this.i - this.f) * (double)float3 - J);
		int integer18 = this.a(float3);
		int integer19 = integer18 >> 16 & 65535;
		int integer20 = integer18 & 65535;
		bdw[] arr21 = new bdw[]{
			new bdw((double)(-float4 * float14 - float7 * float14), (double)(-float5 * float14), (double)(-float6 * float14 - float8 * float14)),
			new bdw((double)(-float4 * float14 + float7 * float14), (double)(float5 * float14), (double)(-float6 * float14 + float8 * float14)),
			new bdw((double)(float4 * float14 + float7 * float14), (double)(float5 * float14), (double)(float6 * float14 + float8 * float14)),
			new bdw((double)(float4 * float14 - float7 * float14), (double)(-float5 * float14), (double)(float6 * float14 - float8 * float14))
		};
		if (this.F != 0.0F) {
			float float22 = this.F + (this.F - this.G) * float3;
			float float23 = ot.b(float22 * 0.5F);
			float float24 = ot.a(float22 * 0.5F) * (float)K.b;
			float float25 = ot.a(float22 * 0.5F) * (float)K.c;
			float float26 = ot.a(float22 * 0.5F) * (float)K.d;
			bdw bdw27 = new bdw((double)float24, (double)float25, (double)float26);

			for (int integer28 = 0; integer28 < 4; integer28++) {
				arr21[integer28] = bdw27.a(2.0 * arr21[integer28].b(bdw27))
					.e(arr21[integer28].a((double)(float23 * float23) - bdw27.b(bdw27)))
					.e(bdw27.c(arr21[integer28]).a((double)(2.0F * float23)));
			}
		}

		bpy.b((double)float15 + arr21[0].b, (double)float16 + arr21[0].c, (double)float17 + arr21[0].d)
			.a((double)float11, (double)float13)
			.a(this.A, this.B, this.C, this.D)
			.a(integer19, integer20)
			.d();
		bpy.b((double)float15 + arr21[1].b, (double)float16 + arr21[1].c, (double)float17 + arr21[1].d)
			.a((double)float11, (double)float12)
			.a(this.A, this.B, this.C, this.D)
			.a(integer19, integer20)
			.d();
		bpy.b((double)float15 + arr21[2].b, (double)float16 + arr21[2].c, (double)float17 + arr21[2].d)
			.a((double)float10, (double)float12)
			.a(this.A, this.B, this.C, this.D)
			.a(integer19, integer20)
			.d();
		bpy.b((double)float15 + arr21[3].b, (double)float16 + arr21[3].c, (double)float17 + arr21[3].d)
			.a((double)float10, (double)float13)
			.a(this.A, this.B, this.C, this.D)
			.a(integer19, integer20)
			.d();
	}

	public int b() {
		return 0;
	}

	public void a(byz byz) {
		int integer3 = this.b();
		if (integer3 == 1) {
			this.E = byz;
		} else {
			throw new RuntimeException("Invalid call to Particle.setTex, use coordinate methods");
		}
	}

	public void b(int integer) {
		if (this.b() != 0) {
			throw new RuntimeException("Invalid call to Particle.setMiscTex");
		} else {
			this.s = integer % 16;
			this.t = integer / 16;
		}
	}

	public void h() {
		this.s++;
	}

	public String toString() {
		return this.getClass().getSimpleName()
			+ ", Pos ("
			+ this.g
			+ ","
			+ this.h
			+ ","
			+ this.i
			+ "), RGBA ("
			+ this.A
			+ ","
			+ this.B
			+ ","
			+ this.C
			+ ","
			+ this.D
			+ "), Age "
			+ this.w;
	}

	public void i() {
		this.o = true;
	}

	protected void a(float float1, float float2) {
		if (float1 != this.p || float2 != this.q) {
			this.p = float1;
			this.q = float2;
			bdt bdt4 = this.l();
			this.a(new bdt(bdt4.a, bdt4.b, bdt4.c, bdt4.a + (double)this.p, bdt4.b + (double)this.q, bdt4.c + (double)this.p));
		}
	}

	public void b(double double1, double double2, double double3) {
		this.g = double1;
		this.h = double2;
		this.i = double3;
		float float8 = this.p / 2.0F;
		float float9 = this.q;
		this.a(new bdt(double1 - (double)float8, double2, double3 - (double)float8, double1 + (double)float8, double2 + (double)float9, double3 + (double)float8));
	}

	public void a(double double1, double double2, double double3) {
		double double8 = double1;
		double double10 = double2;
		double double12 = double3;
		if (this.n) {
			List<bdt> list14 = this.c.a(null, this.l().b(double1, double2, double3));

			for (bdt bdt16 : list14) {
				double2 = bdt16.b(this.l(), double2);
			}

			this.a(this.l().d(0.0, double2, 0.0));

			for (bdt bdt16 : list14) {
				double1 = bdt16.a(this.l(), double1);
			}

			this.a(this.l().d(double1, 0.0, 0.0));

			for (bdt bdt16 : list14) {
				double3 = bdt16.c(this.l(), double3);
			}

			this.a(this.l().d(0.0, 0.0, double3));
		} else {
			this.a(this.l().d(double1, double2, double3));
		}

		this.j();
		this.m = double10 != double2 && double10 < 0.0;
		if (double8 != double1) {
			this.j = 0.0;
		}

		if (double12 != double3) {
			this.l = 0.0;
		}
	}

	protected void j() {
		bdt bdt2 = this.l();
		this.g = (bdt2.a + bdt2.d) / 2.0;
		this.h = bdt2.b;
		this.i = (bdt2.c + bdt2.f) / 2.0;
	}

	public int a(float float1) {
		co co3 = new co(this.g, this.h, this.i);
		return this.c.e(co3) ? this.c.b(co3, 0) : 0;
	}

	public boolean k() {
		return !this.o;
	}

	public bdt l() {
		return this.b;
	}

	public void a(bdt bdt) {
		this.b = bdt;
	}
}
