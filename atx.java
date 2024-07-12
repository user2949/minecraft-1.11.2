import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;

public class atx extends atw<Boolean> {
	private final ImmutableSet<Boolean> a = ImmutableSet.of(true, false);

	protected atx(String string) {
		super(string, Boolean.class);
	}

	@Override
	public Collection<Boolean> c() {
		return this.a;
	}

	public static atx a(String string) {
		return new atx(string);
	}

	@Override
	public Optional<Boolean> b(String string) {
		return !"true".equals(string) && !"false".equals(string) ? Optional.absent() : Optional.of(Boolean.valueOf(string));
	}

	public String a(Boolean boolean1) {
		return boolean1.toString();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (object instanceof atx && super.equals(object)) {
			atx atx3 = (atx)object;
			return this.a.equals(atx3.a);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return 31 * super.hashCode() + this.a.hashCode();
	}
}
