import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import javax.annotation.Nullable;

public class brt implements bru {
	private final Iterable<bru> c;

	public brt(Iterable<bru> iterable) {
		this.c = iterable;
	}

	@Override
	public Predicate<atl> a(atm atm) {
		return Predicates.and(Iterables.transform(this.c, new Function<bru, Predicate<atl>>() {
			@Nullable
			public Predicate<atl> apply(@Nullable bru bru) {
				return bru == null ? null : bru.a(atm);
			}
		}));
	}
}
