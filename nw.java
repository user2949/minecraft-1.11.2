import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class nw {
	public final String e;
	private final fb a;
	public boolean f;
	private final nx b;
	private final bei c;
	private Class<? extends nz> d;
	private static final NumberFormat k = NumberFormat.getIntegerInstance(Locale.US);
	public static nx g = new nx() {
		@Override
		public String a(int integer) {
			return nw.k.format((long)integer);
		}
	};
	private static final DecimalFormat l = new DecimalFormat("########0.00");
	public static nx h = new nx() {
		@Override
		public String a(int integer) {
			double double3 = (double)integer / 20.0;
			double double5 = double3 / 60.0;
			double double7 = double5 / 60.0;
			double double9 = double7 / 24.0;
			double double11 = double9 / 365.0;
			if (double11 > 0.5) {
				return nw.l.format(double11) + " y";
			} else if (double9 > 0.5) {
				return nw.l.format(double9) + " d";
			} else if (double7 > 0.5) {
				return nw.l.format(double7) + " h";
			} else {
				return double5 > 0.5 ? nw.l.format(double5) + " m" : double3 + " s";
			}
		}
	};
	public static nx i = new nx() {
		@Override
		public String a(int integer) {
			double double3 = (double)integer / 100.0;
			double double5 = double3 / 1000.0;
			if (double5 > 0.5) {
				return nw.l.format(double5) + " km";
			} else {
				return double3 > 0.5 ? nw.l.format(double3) + " m" : integer + " cm";
			}
		}
	};
	public static nx j = new nx() {
		@Override
		public String a(int integer) {
			return nw.l.format((double)integer * 0.1);
		}
	};

	public nw(String string, fb fb, nx nx) {
		this.e = string;
		this.a = fb;
		this.b = nx;
		this.c = new bek(this);
		bei.a.put(this.c.a(), this.c);
	}

	public nw(String string, fb fb) {
		this(string, fb, g);
	}

	public nw i() {
		this.f = true;
		return this;
	}

	public nw h() {
		if (oa.a.containsKey(this.e)) {
			throw new RuntimeException("Duplicate stat id: \"" + ((nw)oa.a.get(this.e)).a + "\" and \"" + this.a + "\" at id " + this.e);
		} else {
			oa.b.add(this);
			oa.a.put(this.e, this);
			return this;
		}
	}

	public boolean d() {
		return false;
	}

	public String a(int integer) {
		return this.b.a(integer);
	}

	public fb e() {
		fb fb2 = this.a.f();
		fb2.b().a(a.GRAY);
		fb2.b().a(new fd(fd.a.SHOW_ACHIEVEMENT, new fh(this.e)));
		return fb2;
	}

	public fb j() {
		fb fb2 = this.e();
		fb fb3 = new fh("[").a(fb2).a("]");
		fb3.a(fb2.b());
		return fb3;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (object != null && this.getClass() == object.getClass()) {
			nw nw3 = (nw)object;
			return this.e.equals(nw3.e);
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.e.hashCode();
	}

	public String toString() {
		return "Stat{id=" + this.e + ", nameId=" + this.a + ", awardLocallyOnly=" + this.f + ", formatter=" + this.b + ", objectiveCriteria=" + this.c + '}';
	}

	public bei k() {
		return this.c;
	}

	public Class<? extends nz> l() {
		return this.d;
	}

	public nw b(Class<? extends nz> class1) {
		this.d = class1;
		return this;
	}
}
