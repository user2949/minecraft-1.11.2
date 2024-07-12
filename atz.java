import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;

public class atz<T extends Enum<T> & ox> extends atw<T> {
	private final ImmutableSet<T> a;
	private final Map<String, T> b = Maps.newHashMap();

	protected atz(String string, Class<T> class2, Collection<T> collection) {
		super(string, class2);
		this.a = ImmutableSet.copyOf(collection);

		for (T enum6 : collection) {
			String string7 = enum6.m();
			if (this.b.containsKey(string7)) {
				throw new IllegalArgumentException("Multiple values have the same name '" + string7 + "'");
			}

			this.b.put(string7, enum6);
		}
	}

	@Override
	public Collection<T> c() {
		return this.a;
	}

	@Override
	public Optional<T> b(String string) {
		return Optional.fromNullable(this.b.get(string));
	}

	public String a(T enum1) {
		return enum1.m();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (object instanceof atz && super.equals(object)) {
			atz<?> atz3 = (atz<?>)object;
			return this.a.equals(atz3.a) && this.b.equals(atz3.b);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int integer2 = super.hashCode();
		integer2 = 31 * integer2 + this.a.hashCode();
		return 31 * integer2 + this.b.hashCode();
	}

	public static <T extends Enum<T> & ox> atz<T> a(String string, Class<T> class2) {
		return a(string, class2, Predicates.alwaysTrue());
	}

	public static <T extends Enum<T> & ox> atz<T> a(String string, Class<T> class2, Predicate<T> predicate) {
		return a(string, class2, Collections2.filter(Lists.newArrayList(class2.getEnumConstants()), predicate));
	}

	public static <T extends Enum<T> & ox> atz<T> a(String string, Class<T> class2, T... arr) {
		return a(string, class2, Lists.newArrayList(arr));
	}

	public static <T extends Enum<T> & ox> atz<T> a(String string, Class<T> class2, Collection<T> collection) {
		return new atz<>(string, class2, collection);
	}
}
