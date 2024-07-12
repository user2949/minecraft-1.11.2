import com.google.common.base.Objects;
import javax.annotation.concurrent.Immutable;

@Immutable
public class dl implements Comparable<dl> {
	public static final dl e = new dl(0, 0, 0);
	private final int a;
	private final int b;
	private final int c;

	public dl(int integer1, int integer2, int integer3) {
		this.a = integer1;
		this.b = integer2;
		this.c = integer3;
	}

	public dl(double double1, double double2, double double3) {
		this(ot.c(double1), ot.c(double2), ot.c(double3));
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (!(object instanceof dl)) {
			return false;
		} else {
			dl dl3 = (dl)object;
			if (this.p() != dl3.p()) {
				return false;
			} else {
				return this.q() != dl3.q() ? false : this.r() == dl3.r();
			}
		}
	}

	public int hashCode() {
		return (this.q() + this.r() * 31) * 31 + this.p();
	}

	public int compareTo(dl dl) {
		if (this.q() == dl.q()) {
			return this.r() == dl.r() ? this.p() - dl.p() : this.r() - dl.r();
		} else {
			return this.q() - dl.q();
		}
	}

	public int p() {
		return this.a;
	}

	public int q() {
		return this.b;
	}

	public int r() {
		return this.c;
	}

	public dl d(dl dl) {
		return new dl(this.q() * dl.r() - this.r() * dl.q(), this.r() * dl.p() - this.p() * dl.r(), this.p() * dl.q() - this.q() * dl.p());
	}

	public double h(int integer1, int integer2, int integer3) {
		double double5 = (double)(this.p() - integer1);
		double double7 = (double)(this.q() - integer2);
		double double9 = (double)(this.r() - integer3);
		return Math.sqrt(double5 * double5 + double7 * double7 + double9 * double9);
	}

	public double f(double double1, double double2, double double3) {
		double double8 = (double)this.p() - double1;
		double double10 = (double)this.q() - double2;
		double double12 = (double)this.r() - double3;
		return double8 * double8 + double10 * double10 + double12 * double12;
	}

	public double g(double double1, double double2, double double3) {
		double double8 = (double)this.p() + 0.5 - double1;
		double double10 = (double)this.q() + 0.5 - double2;
		double double12 = (double)this.r() + 0.5 - double3;
		return double8 * double8 + double10 * double10 + double12 * double12;
	}

	public double n(dl dl) {
		return this.f((double)dl.p(), (double)dl.q(), (double)dl.r());
	}

	public String toString() {
		return Objects.toStringHelper(this).add("x", this.p()).add("y", this.q()).add("z", this.r()).toString();
	}
}
