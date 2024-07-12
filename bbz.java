public class bbz implements Comparable<bbz> {
	private final String a;
	private final String b;
	private final long c;
	private final long d;
	private final boolean e;
	private final ajq f;
	private final boolean g;
	private final boolean h;
	private final String i;
	private final int j;
	private final boolean k;

	public bbz(bbv bbv, String string2, String string3, long long4, boolean boolean5) {
		this.a = string2;
		this.b = string3;
		this.c = bbv.l();
		this.d = long4;
		this.f = bbv.q();
		this.e = boolean5;
		this.g = bbv.s();
		this.h = bbv.u();
		this.i = bbv.M();
		this.j = bbv.K();
		this.k = bbv.L();
	}

	public String a() {
		return this.a;
	}

	public String b() {
		return this.b;
	}

	public long c() {
		return this.d;
	}

	public boolean d() {
		return this.e;
	}

	public long e() {
		return this.c;
	}

	public int compareTo(bbz bbz) {
		if (this.c < bbz.c) {
			return 1;
		} else {
			return this.c > bbz.c ? -1 : this.a.compareTo(bbz.a);
		}
	}

	public ajq f() {
		return this.f;
	}

	public boolean g() {
		return this.g;
	}

	public boolean h() {
		return this.h;
	}

	public String i() {
		return oy.b(this.i) ? dp.a("selectWorld.versionUnknown") : this.i;
	}

	public boolean l() {
		return this.m();
	}

	public boolean m() {
		return this.j > 922;
	}
}
