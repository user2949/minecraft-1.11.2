public class ajx {
	public static final ajx[] a = new ajx[16];
	public static final ajx b = new ajx(0, "default", 1).i();
	public static final ajx c = new ajx(1, "flat");
	public static final ajx d = new ajx(2, "largeBiomes");
	public static final ajx e = new ajx(3, "amplified").j();
	public static final ajx f = new ajx(4, "customized");
	public static final ajx g = new ajx(5, "debug_all_block_states");
	public static final ajx h = new ajx(8, "default_1_1", 0).a(false);
	private final int i;
	private final String j;
	private final int k;
	private boolean l;
	private boolean m;
	private boolean n;

	private ajx(int integer, String string) {
		this(integer, string, 0);
	}

	private ajx(int integer1, String string, int integer3) {
		this.j = string;
		this.k = integer3;
		this.l = true;
		this.i = integer1;
		a[integer1] = this;
	}

	public String a() {
		return this.j;
	}

	public String b() {
		return "generator." + this.j;
	}

	public String c() {
		return this.b() + ".info";
	}

	public int d() {
		return this.k;
	}

	public ajx a(int integer) {
		return this == b && integer == 0 ? h : this;
	}

	private ajx a(boolean boolean1) {
		this.l = boolean1;
		return this;
	}

	public boolean e() {
		return this.l;
	}

	private ajx i() {
		this.m = true;
		return this;
	}

	public boolean f() {
		return this.m;
	}

	public static ajx a(String string) {
		for (ajx ajx5 : a) {
			if (ajx5 != null && ajx5.j.equalsIgnoreCase(string)) {
				return ajx5;
			}
		}

		return null;
	}

	public int g() {
		return this.i;
	}

	public boolean h() {
		return this.n;
	}

	private ajx j() {
		this.n = true;
		return this;
	}
}
