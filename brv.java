import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.util.List;
import javax.annotation.Nullable;

public class brv implements bru {
	private static final Splitter c = Splitter.on('|').omitEmptyStrings();
	private final String d;
	private final String e;

	public brv(String string1, String string2) {
		this.d = string1;
		this.e = string2;
	}

	@Override
	public Predicate<atl> a(atm atm) {
		final aub<?> aub3 = atm.a(this.d);
		if (aub3 == null) {
			throw new RuntimeException(this.toString() + ": Definition: " + atm + " has no property: " + this.d);
		} else {
			String string4 = this.e;
			boolean boolean5 = !string4.isEmpty() && string4.charAt(0) == '!';
			if (boolean5) {
				string4 = string4.substring(1);
			}

			List<String> list6 = c.splitToList(string4);
			if (list6.isEmpty()) {
				throw new RuntimeException(this.toString() + ": has an empty value: " + this.e);
			} else {
				Predicate<atl> predicate7;
				if (list6.size() == 1) {
					predicate7 = this.a(aub3, string4);
				} else {
					predicate7 = Predicates.or(Iterables.transform(list6, new Function<String, Predicate<atl>>() {
						@Nullable
						public Predicate<atl> apply(@Nullable String string) {
							return brv.this.a(aub3, string);
						}
					}));
				}

				return boolean5 ? Predicates.not(predicate7) : predicate7;
			}
		}
	}

	private Predicate<atl> a(aub<?> aub, String string) {
		final Optional<?> optional4 = aub.b(string);
		if (!optional4.isPresent()) {
			throw new RuntimeException(this.toString() + ": has an unknown value: " + this.e);
		} else {
			return new Predicate<atl>() {
				public boolean apply(@Nullable atl atl) {
					return atl != null && atl.c(aub).equals(optional4.get());
				}
			};
		}
	}

	public String toString() {
		return Objects.toStringHelper(this).add("key", this.d).add("value", this.e).toString();
	}
}
