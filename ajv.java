public final class ajv {
	private final long a;
	private final ajq b;
	private final boolean c;
	private final boolean d;
	private final ajx e;
	private boolean f;
	private boolean g;
	private String h = "";

	public ajv(long long1, ajq ajq, boolean boolean3, boolean boolean4, ajx ajx) {
		this.a = long1;
		this.b = ajq;
		this.c = boolean3;
		this.d = boolean4;
		this.e = ajx;
	}

	public ajv(bbv bbv) {
		this(bbv.a(), bbv.q(), bbv.r(), bbv.s(), bbv.t());
	}

	public ajv a() {
		this.g = true;
		return this;
	}

	public ajv b() {
		this.f = true;
		return this;
	}

	public ajv a(String string) {
		this.h = string;
		return this;
	}

	public boolean c() {
		return this.g;
	}

	public long d() {
		return this.a;
	}

	public ajq e() {
		return this.b;
	}

	public boolean f() {
		return this.d;
	}

	public boolean g() {
		return this.c;
	}

	public ajx h() {
		return this.e;
	}

	public boolean i() {
		return this.f;
	}

	public static ajq a(int integer) {
		return ajq.a(integer);
	}

	public String j() {
		return this.h;
	}
}
