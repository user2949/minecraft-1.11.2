import java.util.Comparator;

public class bea {
	public static final Comparator<bea> a = new Comparator<bea>() {
		public int compare(bea bea1, bea bea2) {
			if (bea1.c() > bea2.c()) {
				return 1;
			} else {
				return bea1.c() < bea2.c() ? -1 : bea2.e().compareToIgnoreCase(bea1.e());
			}
		}
	};
	private final bec b;
	private final bdy c;
	private final String d;
	private int e;
	private boolean f;
	private boolean g;

	public bea(bec bec, bdy bdy, String string) {
		this.b = bec;
		this.c = bdy;
		this.d = string;
		this.g = true;
	}

	public void a(int integer) {
		if (this.c.c().b()) {
			throw new IllegalStateException("Cannot modify read-only score");
		} else {
			this.c(this.c() + integer);
		}
	}

	public void b(int integer) {
		if (this.c.c().b()) {
			throw new IllegalStateException("Cannot modify read-only score");
		} else {
			this.c(this.c() - integer);
		}
	}

	public void a() {
		if (this.c.c().b()) {
			throw new IllegalStateException("Cannot modify read-only score");
		} else {
			this.a(1);
		}
	}

	public int c() {
		return this.e;
	}

	public void c(int integer) {
		int integer3 = this.e;
		this.e = integer;
		if (integer3 != integer || this.g) {
			this.g = false;
			this.f().a(this);
		}
	}

	public bdy d() {
		return this.c;
	}

	public String e() {
		return this.d;
	}

	public bec f() {
		return this.b;
	}

	public boolean g() {
		return this.f;
	}

	public void a(boolean boolean1) {
		this.f = boolean1;
	}
}
