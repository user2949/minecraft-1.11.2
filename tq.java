import javax.annotation.Nullable;

public class tq extends tm {
	private final double a;
	private final double b;
	private String c;

	public tq(@Nullable tj tj, String string, double double3, double double4, double double5) {
		super(tj, string, double3);
		this.a = double4;
		this.b = double5;
		if (double4 > double5) {
			throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
		} else if (double3 < double4) {
			throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
		} else if (double3 > double5) {
			throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
		}
	}

	public tq a(String string) {
		this.c = string;
		return this;
	}

	public String g() {
		return this.c;
	}

	@Override
	public double a(double double1) {
		return ot.a(double1, this.a, this.b);
	}
}
