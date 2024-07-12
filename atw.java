import com.google.common.base.Objects;

public abstract class atw<T extends Comparable<T>> implements aub<T> {
	private final Class<T> a;
	private final String b;

	protected atw(String string, Class<T> class2) {
		this.a = class2;
		this.b = string;
	}

	@Override
	public String a() {
		return this.b;
	}

	@Override
	public Class<T> b() {
		return this.a;
	}

	public String toString() {
		return Objects.toStringHelper(this).add("name", this.b).add("clazz", this.a).add("values", this.c()).toString();
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (!(object instanceof atw)) {
			return false;
		} else {
			atw<?> atw3 = (atw<?>)object;
			return this.a.equals(atw3.a) && this.b.equals(atw3.b);
		}
	}

	public int hashCode() {
		return 31 * this.a.hashCode() + this.b.hashCode();
	}
}
