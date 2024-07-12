public class kk<T> {
	private final int a;
	private final kl<T> b;

	public kk(int integer, kl<T> kl) {
		this.a = integer;
		this.b = kl;
	}

	public int a() {
		return this.a;
	}

	public kl<T> b() {
		return this.b;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (object != null && this.getClass() == object.getClass()) {
			kk<?> kk3 = (kk<?>)object;
			return this.a == kk3.a;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.a;
	}
}
