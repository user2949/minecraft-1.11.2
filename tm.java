import javax.annotation.Nullable;

public abstract class tm implements tj {
	private final tj a;
	private final String b;
	private final double c;
	private boolean d;

	protected tm(@Nullable tj tj, String string, double double3) {
		this.a = tj;
		this.b = string;
		this.c = double3;
		if (string == null) {
			throw new IllegalArgumentException("Name cannot be null!");
		}
	}

	@Override
	public String a() {
		return this.b;
	}

	@Override
	public double b() {
		return this.c;
	}

	@Override
	public boolean c() {
		return this.d;
	}

	public tm a(boolean boolean1) {
		this.d = boolean1;
		return this;
	}

	@Nullable
	@Override
	public tj d() {
		return this.a;
	}

	public int hashCode() {
		return this.b.hashCode();
	}

	public boolean equals(Object object) {
		return object instanceof tj && this.b.equals(((tj)object).a());
	}
}
