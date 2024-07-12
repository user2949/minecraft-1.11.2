import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class aua extends atw<Integer> {
	private final ImmutableSet<Integer> a;

	protected aua(String string, int integer2, int integer3) {
		super(string, Integer.class);
		if (integer2 < 0) {
			throw new IllegalArgumentException("Min value of " + string + " must be 0 or greater");
		} else if (integer3 <= integer2) {
			throw new IllegalArgumentException("Max value of " + string + " must be greater than min (" + integer2 + ")");
		} else {
			Set<Integer> set5 = Sets.newHashSet();

			for (int integer6 = integer2; integer6 <= integer3; integer6++) {
				set5.add(integer6);
			}

			this.a = ImmutableSet.copyOf(set5);
		}
	}

	@Override
	public Collection<Integer> c() {
		return this.a;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (object instanceof aua && super.equals(object)) {
			aua aua3 = (aua)object;
			return this.a.equals(aua3.a);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return 31 * super.hashCode() + this.a.hashCode();
	}

	public static aua a(String string, int integer2, int integer3) {
		return new aua(string, integer2, integer3);
	}

	@Override
	public Optional<Integer> b(String string) {
		try {
			Integer integer3 = Integer.valueOf(string);
			return this.a.contains(integer3) ? Optional.of(integer3) : Optional.absent();
		} catch (NumberFormatException var3) {
			return Optional.absent();
		}
	}

	public String a(Integer integer) {
		return integer.toString();
	}
}
