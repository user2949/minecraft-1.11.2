public class akd implements Comparable<akd> {
	private static long d;
	private final alu e;
	public final co a;
	public long b;
	public int c;
	private final long f;

	public akd(co co, alu alu) {
		this.f = d++;
		this.a = co;
		this.e = alu;
	}

	public boolean equals(Object object) {
		if (!(object instanceof akd)) {
			return false;
		} else {
			akd akd3 = (akd)object;
			return this.a.equals(akd3.a) && alu.a(this.e, akd3.e);
		}
	}

	public int hashCode() {
		return this.a.hashCode();
	}

	public akd a(long long1) {
		this.b = long1;
		return this;
	}

	public void a(int integer) {
		this.c = integer;
	}

	public int compareTo(akd akd) {
		if (this.b < akd.b) {
			return -1;
		} else if (this.b > akd.b) {
			return 1;
		} else if (this.c != akd.c) {
			return this.c - akd.c;
		} else if (this.f < akd.f) {
			return -1;
		} else {
			return this.f > akd.f ? 1 : 0;
		}
	}

	public String toString() {
		return alu.a(this.e) + ": " + this.a + ", " + this.b + ", " + this.c + ", " + this.f;
	}

	public alu a() {
		return this.e;
	}
}
