import javax.annotation.Nullable;

public class bdw {
	public static final bdw a = new bdw(0.0, 0.0, 0.0);
	public final double b;
	public final double c;
	public final double d;

	public bdw(double double1, double double2, double double3) {
		if (double1 == -0.0) {
			double1 = 0.0;
		}

		if (double2 == -0.0) {
			double2 = 0.0;
		}

		if (double3 == -0.0) {
			double3 = 0.0;
		}

		this.b = double1;
		this.c = double2;
		this.d = double3;
	}

	public bdw(dl dl) {
		this((double)dl.p(), (double)dl.q(), (double)dl.r());
	}

	public bdw a(bdw bdw) {
		return new bdw(bdw.b - this.b, bdw.c - this.c, bdw.d - this.d);
	}

	public bdw a() {
		double double2 = (double)ot.a(this.b * this.b + this.c * this.c + this.d * this.d);
		return double2 < 1.0E-4 ? a : new bdw(this.b / double2, this.c / double2, this.d / double2);
	}

	public double b(bdw bdw) {
		return this.b * bdw.b + this.c * bdw.c + this.d * bdw.d;
	}

	public bdw c(bdw bdw) {
		return new bdw(this.c * bdw.d - this.d * bdw.c, this.d * bdw.b - this.b * bdw.d, this.b * bdw.c - this.c * bdw.b);
	}

	public bdw d(bdw bdw) {
		return this.a(bdw.b, bdw.c, bdw.d);
	}

	public bdw a(double double1, double double2, double double3) {
		return this.b(-double1, -double2, -double3);
	}

	public bdw e(bdw bdw) {
		return this.b(bdw.b, bdw.c, bdw.d);
	}

	public bdw b(double double1, double double2, double double3) {
		return new bdw(this.b + double1, this.c + double2, this.d + double3);
	}

	public double f(bdw bdw) {
		double double3 = bdw.b - this.b;
		double double5 = bdw.c - this.c;
		double double7 = bdw.d - this.d;
		return (double)ot.a(double3 * double3 + double5 * double5 + double7 * double7);
	}

	public double g(bdw bdw) {
		double double3 = bdw.b - this.b;
		double double5 = bdw.c - this.c;
		double double7 = bdw.d - this.d;
		return double3 * double3 + double5 * double5 + double7 * double7;
	}

	public double c(double double1, double double2, double double3) {
		double double8 = double1 - this.b;
		double double10 = double2 - this.c;
		double double12 = double3 - this.d;
		return double8 * double8 + double10 * double10 + double12 * double12;
	}

	public bdw a(double double1) {
		return new bdw(this.b * double1, this.c * double1, this.d * double1);
	}

	public double b() {
		return (double)ot.a(this.b * this.b + this.c * this.c + this.d * this.d);
	}

	public double c() {
		return this.b * this.b + this.c * this.c + this.d * this.d;
	}

	@Nullable
	public bdw a(bdw bdw, double double2) {
		double double5 = bdw.b - this.b;
		double double7 = bdw.c - this.c;
		double double9 = bdw.d - this.d;
		if (double5 * double5 < 1.0E-7F) {
			return null;
		} else {
			double double11 = (double2 - this.b) / double5;
			return !(double11 < 0.0) && !(double11 > 1.0) ? new bdw(this.b + double5 * double11, this.c + double7 * double11, this.d + double9 * double11) : null;
		}
	}

	@Nullable
	public bdw b(bdw bdw, double double2) {
		double double5 = bdw.b - this.b;
		double double7 = bdw.c - this.c;
		double double9 = bdw.d - this.d;
		if (double7 * double7 < 1.0E-7F) {
			return null;
		} else {
			double double11 = (double2 - this.c) / double7;
			return !(double11 < 0.0) && !(double11 > 1.0) ? new bdw(this.b + double5 * double11, this.c + double7 * double11, this.d + double9 * double11) : null;
		}
	}

	@Nullable
	public bdw c(bdw bdw, double double2) {
		double double5 = bdw.b - this.b;
		double double7 = bdw.c - this.c;
		double double9 = bdw.d - this.d;
		if (double9 * double9 < 1.0E-7F) {
			return null;
		} else {
			double double11 = (double2 - this.d) / double9;
			return !(double11 < 0.0) && !(double11 > 1.0) ? new bdw(this.b + double5 * double11, this.c + double7 * double11, this.d + double9 * double11) : null;
		}
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (!(object instanceof bdw)) {
			return false;
		} else {
			bdw bdw3 = (bdw)object;
			if (Double.compare(bdw3.b, this.b) != 0) {
				return false;
			} else {
				return Double.compare(bdw3.c, this.c) != 0 ? false : Double.compare(bdw3.d, this.d) == 0;
			}
		}
	}

	public int hashCode() {
		long long3 = Double.doubleToLongBits(this.b);
		int integer2 = (int)(long3 ^ long3 >>> 32);
		long3 = Double.doubleToLongBits(this.c);
		integer2 = 31 * integer2 + (int)(long3 ^ long3 >>> 32);
		long3 = Double.doubleToLongBits(this.d);
		return 31 * integer2 + (int)(long3 ^ long3 >>> 32);
	}

	public String toString() {
		return "(" + this.b + ", " + this.c + ", " + this.d + ")";
	}

	public bdw a(float float1) {
		float float3 = ot.b(float1);
		float float4 = ot.a(float1);
		double double5 = this.b;
		double double7 = this.c * (double)float3 + this.d * (double)float4;
		double double9 = this.d * (double)float3 - this.c * (double)float4;
		return new bdw(double5, double7, double9);
	}

	public bdw b(float float1) {
		float float3 = ot.b(float1);
		float float4 = ot.a(float1);
		double double5 = this.b * (double)float3 + this.d * (double)float4;
		double double7 = this.c;
		double double9 = this.d * (double)float3 - this.b * (double)float4;
		return new bdw(double5, double7, double9);
	}

	public static bdw a(bdv bdv) {
		return a(bdv.i, bdv.j);
	}

	public static bdw a(float float1, float float2) {
		float float3 = ot.b(-float2 * (float) (Math.PI / 180.0) - (float) Math.PI);
		float float4 = ot.a(-float2 * (float) (Math.PI / 180.0) - (float) Math.PI);
		float float5 = -ot.b(-float1 * (float) (Math.PI / 180.0));
		float float6 = ot.a(-float1 * (float) (Math.PI / 180.0));
		return new bdw((double)(float4 * float5), (double)float6, (double)(float3 * float5));
	}
}
