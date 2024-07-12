import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum avg {
	OVERWORLD(0, "Overworld", "", avi.class),
	NETHER(-1, "Nether", "_nether", avh.class),
	THE_END(1, "The End", "_end", avl.class);

	private final int d;
	private final String e;
	private final String f;
	private final Class<? extends avf> g;

	private avg(int integer3, String string4, String string5, Class<? extends avf> class6) {
		this.d = integer3;
		this.e = string4;
		this.f = string5;
		this.g = class6;
	}

	public int a() {
		return this.d;
	}

	public String b() {
		return this.e;
	}

	public String c() {
		return this.f;
	}

	public avf d() {
		try {
			Constructor<? extends avf> constructor2 = this.g.getConstructor();
			return (avf)constructor2.newInstance();
		} catch (NoSuchMethodException var2) {
			throw new Error("Could not create new dimension", var2);
		} catch (InvocationTargetException var3) {
			throw new Error("Could not create new dimension", var3);
		} catch (InstantiationException var4) {
			throw new Error("Could not create new dimension", var4);
		} catch (IllegalAccessException var5) {
			throw new Error("Could not create new dimension", var5);
		}
	}

	public static avg a(int integer) {
		for (avg avg5 : values()) {
			if (avg5.a() == integer) {
				return avg5;
			}
		}

		throw new IllegalArgumentException("Invalid dimension id " + integer);
	}
}
