import java.lang.reflect.Constructor;
import java.util.Arrays;

public class yr<T extends yl> {
	private static yr<?>[] l = new yr[0];
	public static final yr<yh> a = a(yh.class, "HoldingPattern");
	public static final yr<yp> b = a(yp.class, "StrafePlayer");
	public static final yr<yj> c = a(yj.class, "LandingApproach");
	public static final yr<yk> d = a(yk.class, "Landing");
	public static final yr<yq> e = a(yq.class, "Takeoff");
	public static final yr<yn> f = a(yn.class, "SittingFlaming");
	public static final yr<yo> g = a(yo.class, "SittingScanning");
	public static final yr<ym> h = a(ym.class, "SittingAttacking");
	public static final yr<yf> i = a(yf.class, "ChargingPlayer");
	public static final yr<yg> j = a(yg.class, "Dying");
	public static final yr<yi> k = a(yi.class, "Hover");
	private final Class<? extends yl> m;
	private final int n;
	private final String o;

	private yr(int integer, Class<? extends yl> class2, String string) {
		this.n = integer;
		this.m = class2;
		this.o = string;
	}

	public yl a(yb yb) {
		try {
			Constructor<? extends yl> constructor3 = this.a();
			return (yl)constructor3.newInstance(yb);
		} catch (Exception var3) {
			throw new Error(var3);
		}
	}

	protected Constructor<? extends yl> a() throws NoSuchMethodException {
		return this.m.getConstructor(yb.class);
	}

	public int b() {
		return this.n;
	}

	public String toString() {
		return this.o + " (#" + this.n + ")";
	}

	public static yr<?> a(int integer) {
		return integer >= 0 && integer < l.length ? l[integer] : a;
	}

	public static int c() {
		return l.length;
	}

	private static <T extends yl> yr<T> a(Class<T> class1, String string) {
		yr<T> yr3 = new yr<>(l.length, class1, string);
		l = (yr<?>[])Arrays.copyOf(l, l.length + 1);
		l[yr3.b()] = yr3;
		return yr3;
	}
}
