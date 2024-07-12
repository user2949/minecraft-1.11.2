import com.google.common.collect.Maps;
import java.util.Map;

public class bdk {
	private static final Map<kq, bdl.a<?>> a = Maps.newHashMap();
	private static final Map<Class<? extends bdl>, bdl.a<?>> b = Maps.newHashMap();

	public static <T extends bdl> void a(bdl.a<? extends T> a) {
		kq kq2 = a.a();
		Class<T> class3 = (Class<T>)a.b();
		if (bdk.a.containsKey(kq2)) {
			throw new IllegalArgumentException("Can't re-register entity property name " + kq2);
		} else if (b.containsKey(class3)) {
			throw new IllegalArgumentException("Can't re-register entity property class " + class3.getName());
		} else {
			bdk.a.put(kq2, a);
			b.put(class3, a);
		}
	}

	public static bdl.a<?> a(kq kq) {
		bdl.a<?> a2 = (bdl.a<?>)a.get(kq);
		if (a2 == null) {
			throw new IllegalArgumentException("Unknown loot entity property '" + kq + "'");
		} else {
			return a2;
		}
	}

	public static <T extends bdl> bdl.a<T> a(T bdl) {
		bdl.a<?> a2 = (bdl.a<?>)b.get(bdl.getClass());
		if (a2 == null) {
			throw new IllegalArgumentException("Unknown loot entity property " + bdl);
		} else {
			return (bdl.a<T>)a2;
		}
	}

	static {
		a(new bdm.a());
	}
}
