import com.google.common.collect.ComparisonChain;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class sh implements Comparable<sh> {
	private static final Logger a = LogManager.getLogger();
	private final sg b;
	private int c;
	private int d;
	private boolean e;
	private boolean f;
	private boolean g;
	private boolean h;

	public sh(sg sg) {
		this(sg, 0, 0);
	}

	public sh(sg sg, int integer) {
		this(sg, integer, 0);
	}

	public sh(sg sg, int integer2, int integer3) {
		this(sg, integer2, integer3, false, true);
	}

	public sh(sg sg, int integer2, int integer3, boolean boolean4, boolean boolean5) {
		this.b = sg;
		this.c = integer2;
		this.d = integer3;
		this.f = boolean4;
		this.h = boolean5;
	}

	public sh(sh sh) {
		this.b = sh.b;
		this.c = sh.c;
		this.d = sh.d;
		this.f = sh.f;
		this.h = sh.h;
	}

	public void a(sh sh) {
		if (this.b != sh.b) {
			a.warn("This method should only be called for matching effects!");
		}

		if (sh.d > this.d) {
			this.d = sh.d;
			this.c = sh.c;
		} else if (sh.d == this.d && this.c < sh.c) {
			this.c = sh.c;
		} else if (!sh.f && this.f) {
			this.f = sh.f;
		}

		this.h = sh.h;
	}

	public sg a() {
		return this.b;
	}

	public int b() {
		return this.c;
	}

	public int c() {
		return this.d;
	}

	public boolean d() {
		return this.f;
	}

	public boolean e() {
		return this.h;
	}

	public boolean a(sw sw) {
		if (this.c > 0) {
			if (this.b.a(this.c, this.d)) {
				this.b(sw);
			}

			this.h();
		}

		return this.c > 0;
	}

	private int h() {
		return --this.c;
	}

	public void b(sw sw) {
		if (this.c > 0) {
			this.b.a(sw, this.d);
		}
	}

	public String f() {
		return this.b.a();
	}

	public String toString() {
		String string2;
		if (this.d > 0) {
			string2 = this.f() + " x " + (this.d + 1) + ", Duration: " + this.c;
		} else {
			string2 = this.f() + ", Duration: " + this.c;
		}

		if (this.e) {
			string2 = string2 + ", Splash: true";
		}

		if (!this.h) {
			string2 = string2 + ", Particles: false";
		}

		return string2;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (!(object instanceof sh)) {
			return false;
		} else {
			sh sh3 = (sh)object;
			return this.c == sh3.c && this.d == sh3.d && this.e == sh3.e && this.f == sh3.f && this.b.equals(sh3.b);
		}
	}

	public int hashCode() {
		int integer2 = this.b.hashCode();
		integer2 = 31 * integer2 + this.c;
		integer2 = 31 * integer2 + this.d;
		integer2 = 31 * integer2 + (this.e ? 1 : 0);
		return 31 * integer2 + (this.f ? 1 : 0);
	}

	public du a(du du) {
		du.a("Id", (byte)sg.a(this.a()));
		du.a("Amplifier", (byte)this.c());
		du.a("Duration", this.b());
		du.a("Ambient", this.d());
		du.a("ShowParticles", this.e());
		return du;
	}

	public static sh b(du du) {
		int integer2 = du.f("Id");
		sg sg3 = sg.a(integer2);
		if (sg3 == null) {
			return null;
		} else {
			int integer4 = du.f("Amplifier");
			int integer5 = du.h("Duration");
			boolean boolean6 = du.p("Ambient");
			boolean boolean7 = true;
			if (du.b("ShowParticles", 1)) {
				boolean7 = du.p("ShowParticles");
			}

			return new sh(sg3, integer5, integer4 < 0 ? 0 : integer4, boolean6, boolean7);
		}
	}

	public void b(boolean boolean1) {
		this.g = boolean1;
	}

	public boolean g() {
		return this.g;
	}

	public int compareTo(sh sh) {
		int integer3 = 32147;
		return (this.b() <= 32147 || sh.b() <= 32147) && (!this.d() || !sh.d())
			? ComparisonChain.start().compare(this.d(), sh.d()).compare(this.b(), sh.b()).compare(this.a().g(), sh.a().g()).result()
			: ComparisonChain.start().compare(this.d(), sh.d()).compare(this.a().g(), sh.a().g()).result();
	}
}
