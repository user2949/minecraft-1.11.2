import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class atu implements Predicate<atl> {
	public static final Predicate<atl> a = new Predicate<atl>() {
		public boolean apply(@Nullable atl atl) {
			return true;
		}
	};
	private final atm b;
	private final Map<aub<?>, Predicate<?>> c = Maps.newHashMap();

	private atu(atm atm) {
		this.b = atm;
	}

	public static atu a(alu alu) {
		return new atu(alu.s());
	}

	public boolean apply(@Nullable atl atl) {
		if (atl != null && atl.v().equals(this.b.c())) {
			for (Entry<aub<?>, Predicate<?>> entry4 : this.c.entrySet()) {
				if (!this.a(atl, (aub)entry4.getKey(), (Predicate<?>)entry4.getValue())) {
					return false;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	protected <T extends Comparable<T>> boolean a(atl atl, aub<T> aub, Predicate<?> predicate) {
		return predicate.apply(atl.c(aub));
	}

	public <V extends Comparable<V>> atu a(aub<V> aub, Predicate<? extends V> predicate) {
		if (!this.b.d().contains(aub)) {
			throw new IllegalArgumentException(this.b + " cannot support property " + aub);
		} else {
			this.c.put(aub, predicate);
			return this;
		}
	}
}
