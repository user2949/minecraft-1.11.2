import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class bdt {
	public final double a;
	public final double b;
	public final double c;
	public final double d;
	public final double e;
	public final double f;

	public bdt(double double1, double double2, double double3, double double4, double double5, double double6) {
		this.a = Math.min(double1, double4);
		this.b = Math.min(double2, double5);
		this.c = Math.min(double3, double6);
		this.d = Math.max(double1, double4);
		this.e = Math.max(double2, double5);
		this.f = Math.max(double3, double6);
	}

	public bdt(co co) {
		this((double)co.p(), (double)co.q(), (double)co.r(), (double)(co.p() + 1), (double)(co.q() + 1), (double)(co.r() + 1));
	}

	public bdt(co co1, co co2) {
		this((double)co1.p(), (double)co1.q(), (double)co1.r(), (double)co2.p(), (double)co2.q(), (double)co2.r());
	}

	public bdt(bdw bdw1, bdw bdw2) {
		this(bdw1.b, bdw1.c, bdw1.d, bdw2.b, bdw2.c, bdw2.d);
	}

	public bdt e(double double1) {
		return new bdt(this.a, this.b, this.c, this.d, double1, this.f);
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (!(object instanceof bdt)) {
			return false;
		} else {
			bdt bdt3 = (bdt)object;
			if (Double.compare(bdt3.a, this.a) != 0) {
				return false;
			} else if (Double.compare(bdt3.b, this.b) != 0) {
				return false;
			} else if (Double.compare(bdt3.c, this.c) != 0) {
				return false;
			} else if (Double.compare(bdt3.d, this.d) != 0) {
				return false;
			} else {
				return Double.compare(bdt3.e, this.e) != 0 ? false : Double.compare(bdt3.f, this.f) == 0;
			}
		}
	}

	public int hashCode() {
		long long2 = Double.doubleToLongBits(this.a);
		int integer4 = (int)(long2 ^ long2 >>> 32);
		long2 = Double.doubleToLongBits(this.b);
		integer4 = 31 * integer4 + (int)(long2 ^ long2 >>> 32);
		long2 = Double.doubleToLongBits(this.c);
		integer4 = 31 * integer4 + (int)(long2 ^ long2 >>> 32);
		long2 = Double.doubleToLongBits(this.d);
		integer4 = 31 * integer4 + (int)(long2 ^ long2 >>> 32);
		long2 = Double.doubleToLongBits(this.e);
		integer4 = 31 * integer4 + (int)(long2 ^ long2 >>> 32);
		long2 = Double.doubleToLongBits(this.f);
		return 31 * integer4 + (int)(long2 ^ long2 >>> 32);
	}

	public bdt a(double double1, double double2, double double3) {
		double double8 = this.a;
		double double10 = this.b;
		double double12 = this.c;
		double double14 = this.d;
		double double16 = this.e;
		double double18 = this.f;
		if (double1 < 0.0) {
			double8 -= double1;
		} else if (double1 > 0.0) {
			double14 -= double1;
		}

		if (double2 < 0.0) {
			double10 -= double2;
		} else if (double2 > 0.0) {
			double16 -= double2;
		}

		if (double3 < 0.0) {
			double12 -= double3;
		} else if (double3 > 0.0) {
			double18 -= double3;
		}

		return new bdt(double8, double10, double12, double14, double16, double18);
	}

	public bdt b(double double1, double double2, double double3) {
		double double8 = this.a;
		double double10 = this.b;
		double double12 = this.c;
		double double14 = this.d;
		double double16 = this.e;
		double double18 = this.f;
		if (double1 < 0.0) {
			double8 += double1;
		} else if (double1 > 0.0) {
			double14 += double1;
		}

		if (double2 < 0.0) {
			double10 += double2;
		} else if (double2 > 0.0) {
			double16 += double2;
		}

		if (double3 < 0.0) {
			double12 += double3;
		} else if (double3 > 0.0) {
			double18 += double3;
		}

		return new bdt(double8, double10, double12, double14, double16, double18);
	}

	public bdt c(double double1, double double2, double double3) {
		double double8 = this.a - double1;
		double double10 = this.b - double2;
		double double12 = this.c - double3;
		double double14 = this.d + double1;
		double double16 = this.e + double2;
		double double18 = this.f + double3;
		return new bdt(double8, double10, double12, double14, double16, double18);
	}

	public bdt g(double double1) {
		return this.c(double1, double1, double1);
	}

	public bdt a(bdt bdt) {
		double double3 = Math.max(this.a, bdt.a);
		double double5 = Math.max(this.b, bdt.b);
		double double7 = Math.max(this.c, bdt.c);
		double double9 = Math.min(this.d, bdt.d);
		double double11 = Math.min(this.e, bdt.e);
		double double13 = Math.min(this.f, bdt.f);
		return new bdt(double3, double5, double7, double9, double11, double13);
	}

	public bdt b(bdt bdt) {
		double double3 = Math.min(this.a, bdt.a);
		double double5 = Math.min(this.b, bdt.b);
		double double7 = Math.min(this.c, bdt.c);
		double double9 = Math.max(this.d, bdt.d);
		double double11 = Math.max(this.e, bdt.e);
		double double13 = Math.max(this.f, bdt.f);
		return new bdt(double3, double5, double7, double9, double11, double13);
	}

	public bdt d(double double1, double double2, double double3) {
		return new bdt(this.a + double1, this.b + double2, this.c + double3, this.d + double1, this.e + double2, this.f + double3);
	}

	public bdt a(co co) {
		return new bdt(
			this.a + (double)co.p(), this.b + (double)co.q(), this.c + (double)co.r(), this.d + (double)co.p(), this.e + (double)co.q(), this.f + (double)co.r()
		);
	}

	public bdt a(bdw bdw) {
		return this.d(bdw.b, bdw.c, bdw.d);
	}

	public double a(bdt bdt, double double2) {
		if (!(bdt.e <= this.b) && !(bdt.b >= this.e) && !(bdt.f <= this.c) && !(bdt.c >= this.f)) {
			if (double2 > 0.0 && bdt.d <= this.a) {
				double double5 = this.a - bdt.d;
				if (double5 < double2) {
					double2 = double5;
				}
			} else if (double2 < 0.0 && bdt.a >= this.d) {
				double double5 = this.d - bdt.a;
				if (double5 > double2) {
					double2 = double5;
				}
			}

			return double2;
		} else {
			return double2;
		}
	}

	public double b(bdt bdt, double double2) {
		if (!(bdt.d <= this.a) && !(bdt.a >= this.d) && !(bdt.f <= this.c) && !(bdt.c >= this.f)) {
			if (double2 > 0.0 && bdt.e <= this.b) {
				double double5 = this.b - bdt.e;
				if (double5 < double2) {
					double2 = double5;
				}
			} else if (double2 < 0.0 && bdt.b >= this.e) {
				double double5 = this.e - bdt.b;
				if (double5 > double2) {
					double2 = double5;
				}
			}

			return double2;
		} else {
			return double2;
		}
	}

	public double c(bdt bdt, double double2) {
		if (!(bdt.d <= this.a) && !(bdt.a >= this.d) && !(bdt.e <= this.b) && !(bdt.b >= this.e)) {
			if (double2 > 0.0 && bdt.f <= this.c) {
				double double5 = this.c - bdt.f;
				if (double5 < double2) {
					double2 = double5;
				}
			} else if (double2 < 0.0 && bdt.c >= this.f) {
				double double5 = this.f - bdt.c;
				if (double5 > double2) {
					double2 = double5;
				}
			}

			return double2;
		} else {
			return double2;
		}
	}

	public boolean c(bdt bdt) {
		return this.a(bdt.a, bdt.b, bdt.c, bdt.d, bdt.e, bdt.f);
	}

	public boolean a(double double1, double double2, double double3, double double4, double double5, double double6) {
		return this.a < double4 && this.d > double1 && this.b < double5 && this.e > double2 && this.c < double6 && this.f > double3;
	}

	public boolean a(bdw bdw1, bdw bdw2) {
		return this.a(
			Math.min(bdw1.b, bdw2.b), Math.min(bdw1.c, bdw2.c), Math.min(bdw1.d, bdw2.d), Math.max(bdw1.b, bdw2.b), Math.max(bdw1.c, bdw2.c), Math.max(bdw1.d, bdw2.d)
		);
	}

	public boolean b(bdw bdw) {
		if (bdw.b <= this.a || bdw.b >= this.d) {
			return false;
		} else {
			return bdw.c <= this.b || bdw.c >= this.e ? false : !(bdw.d <= this.c) && !(bdw.d >= this.f);
		}
	}

	public double a() {
		double double2 = this.d - this.a;
		double double4 = this.e - this.b;
		double double6 = this.f - this.c;
		return (double2 + double4 + double6) / 3.0;
	}

	public bdt h(double double1) {
		return this.g(-double1);
	}

	@Nullable
	public bdu b(bdw bdw1, bdw bdw2) {
		bdw bdw4 = this.a(this.a, bdw1, bdw2);
		cv cv5 = cv.WEST;
		bdw bdw6 = this.a(this.d, bdw1, bdw2);
		if (bdw6 != null && this.a(bdw1, bdw4, bdw6)) {
			bdw4 = bdw6;
			cv5 = cv.EAST;
		}

		bdw6 = this.b(this.b, bdw1, bdw2);
		if (bdw6 != null && this.a(bdw1, bdw4, bdw6)) {
			bdw4 = bdw6;
			cv5 = cv.DOWN;
		}

		bdw6 = this.b(this.e, bdw1, bdw2);
		if (bdw6 != null && this.a(bdw1, bdw4, bdw6)) {
			bdw4 = bdw6;
			cv5 = cv.UP;
		}

		bdw6 = this.c(this.c, bdw1, bdw2);
		if (bdw6 != null && this.a(bdw1, bdw4, bdw6)) {
			bdw4 = bdw6;
			cv5 = cv.NORTH;
		}

		bdw6 = this.c(this.f, bdw1, bdw2);
		if (bdw6 != null && this.a(bdw1, bdw4, bdw6)) {
			bdw4 = bdw6;
			cv5 = cv.SOUTH;
		}

		return bdw4 == null ? null : new bdu(bdw4, cv5);
	}

	@VisibleForTesting
	boolean a(bdw bdw1, @Nullable bdw bdw2, bdw bdw3) {
		return bdw2 == null || bdw1.g(bdw3) < bdw1.g(bdw2);
	}

	@Nullable
	@VisibleForTesting
	bdw a(double double1, bdw bdw2, bdw bdw3) {
		bdw bdw6 = bdw2.a(bdw3, double1);
		return bdw6 != null && this.c(bdw6) ? bdw6 : null;
	}

	@Nullable
	@VisibleForTesting
	bdw b(double double1, bdw bdw2, bdw bdw3) {
		bdw bdw6 = bdw2.b(bdw3, double1);
		return bdw6 != null && this.d(bdw6) ? bdw6 : null;
	}

	@Nullable
	@VisibleForTesting
	bdw c(double double1, bdw bdw2, bdw bdw3) {
		bdw bdw6 = bdw2.c(bdw3, double1);
		return bdw6 != null && this.e(bdw6) ? bdw6 : null;
	}

	@VisibleForTesting
	public boolean c(bdw bdw) {
		return bdw.c >= this.b && bdw.c <= this.e && bdw.d >= this.c && bdw.d <= this.f;
	}

	@VisibleForTesting
	public boolean d(bdw bdw) {
		return bdw.b >= this.a && bdw.b <= this.d && bdw.d >= this.c && bdw.d <= this.f;
	}

	@VisibleForTesting
	public boolean e(bdw bdw) {
		return bdw.b >= this.a && bdw.b <= this.d && bdw.c >= this.b && bdw.c <= this.e;
	}

	public String toString() {
		return "box[" + this.a + ", " + this.b + ", " + this.c + " -> " + this.d + ", " + this.e + ", " + this.f + "]";
	}

	public boolean b() {
		return Double.isNaN(this.a) || Double.isNaN(this.b) || Double.isNaN(this.c) || Double.isNaN(this.d) || Double.isNaN(this.e) || Double.isNaN(this.f);
	}

	public bdw c() {
		return new bdw(this.a + (this.d - this.a) * 0.5, this.b + (this.e - this.b) * 0.5, this.c + (this.f - this.c) * 0.5);
	}
}
