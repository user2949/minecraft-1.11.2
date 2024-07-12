import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public abstract class ati implements atl {
	private static final Joiner a = Joiner.on(',');
	private static final Function<Entry<aub<?>, Comparable<?>>, String> b = new Function<Entry<aub<?>, Comparable<?>>, String>() {
		@Nullable
		public String apply(@Nullable Entry<aub<?>, Comparable<?>> entry) {
			if (entry == null) {
				return "<NULL>";
			} else {
				aub<?> aub3 = (aub<?>)entry.getKey();
				return aub3.a() + "=" + this.a(aub3, (Comparable<?>)entry.getValue());
			}
		}

		private <T extends Comparable<T>> String a(aub<T> aub, Comparable<?> comparable) {
			return aub.a((T)comparable);
		}
	};

	@Override
	public <T extends Comparable<T>> atl a(aub<T> aub) {
		return this.a(aub, a(aub.c(), this.c(aub)));
	}

	protected static <T> T a(Collection<T> collection, T object) {
		Iterator<T> iterator3 = collection.iterator();

		while (iterator3.hasNext()) {
			if (iterator3.next().equals(object)) {
				if (iterator3.hasNext()) {
					return (T)iterator3.next();
				}

				return (T)collection.iterator().next();
			}
		}

		return (T)iterator3.next();
	}

	public String toString() {
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append(alu.h.b(this.v()));
		if (!this.u().isEmpty()) {
			stringBuilder2.append("[");
			a.appendTo(stringBuilder2, Iterables.transform(this.u().entrySet(), b));
			stringBuilder2.append("]");
		}

		return stringBuilder2.toString();
	}
}
