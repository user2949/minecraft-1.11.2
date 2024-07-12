public class btt {
	public final btt.a a;
	public final btt.a b;
	public final btt.a c;
	public final btt.a d;
	public final btt.a e;
	public final btt.a f;
	private boolean g;
	private boolean h;
	private boolean i;
	private boolean j;
	private boolean k;
	private boolean l;

	public btt(bes bes) {
		this.a = new btw(bes);
		this.b = new btx(bes);
		this.c = new btr(bes);
		this.d = new btu(bes);
		this.e = new bts(bes);
		this.f = new btv(bes);
	}

	public boolean a() {
		return this.g || this.h || this.i || this.j || this.k || this.l;
	}

	public boolean b() {
		this.g = !this.g;
		return this.g;
	}

	public void a(float float1, long long2) {
		if (this.h) {
			this.a.a(float1, long2);
		}

		if (this.g && !bes.z().am()) {
			this.c.a(float1, long2);
		}

		if (this.i) {
			this.b.a(float1, long2);
		}

		if (this.j) {
			this.d.a(float1, long2);
		}

		if (this.k) {
			this.e.a(float1, long2);
		}

		if (this.l) {
			this.f.a(float1, long2);
		}
	}

	public static void a(String string, int integer2, int integer3, int integer4, float float5, int integer6) {
		a(string, (double)integer2 + 0.5, (double)integer3 + 0.5, (double)integer4 + 0.5, float5, integer6);
	}

	public static void a(String string, double double2, double double3, double double4, float float5, int integer) {
		bes bes10 = bes.z();
		if (bes10.h != null && bes10.ac() != null && bes10.ac().g != null) {
			bfg bfg11 = bes10.k;
			aay aay12 = bes10.h;
			double double13 = aay12.M + (aay12.p - aay12.M) * (double)float5;
			double double15 = aay12.N + (aay12.q - aay12.N) * (double)float5;
			double double17 = aay12.O + (aay12.r - aay12.O) * (double)float5;
			bqg.G();
			bqg.c((float)(double2 - double13), (float)(double3 - double15) + 0.07F, (float)(double4 - double17));
			bqg.a(0.0F, 1.0F, 0.0F);
			bqg.b(0.02F, -0.02F, 0.02F);
			bur bur19 = bes10.ac();
			bqg.b(-bur19.e, 0.0F, 1.0F, 0.0F);
			bqg.b((float)(bur19.g.as == 2 ? 1 : -1) * bur19.f, 1.0F, 0.0F, 0.0F);
			bqg.g();
			bqg.y();
			bqg.k();
			bqg.a(true);
			bqg.b(-1.0F, 1.0F, 1.0F);
			bfg11.a(string, -bfg11.a(string) / 2, 0, integer);
			bqg.f();
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			bqg.H();
		}
	}

	public interface a {
		void a(float float1, long long2);
	}
}
