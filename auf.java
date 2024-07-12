import com.google.common.collect.Lists;
import java.util.List;

public class auf {
	private final List<aud> a = Lists.newArrayList();
	private double b;
	private double c;
	private double d = 6.0E7;
	private double e = this.d;
	private long f;
	private long g;
	private int h = 29999984;
	private double i = 0.2;
	private double j = 5.0;
	private int k = 15;
	private int l = 5;

	public boolean a(co co) {
		return (double)(co.p() + 1) > this.b() && (double)co.p() < this.d() && (double)(co.r() + 1) > this.c() && (double)co.r() < this.e();
	}

	public boolean a(ajl ajl) {
		return (double)ajl.e() > this.b() && (double)ajl.c() < this.d() && (double)ajl.f() > this.c() && (double)ajl.d() < this.e();
	}

	public boolean a(bdt bdt) {
		return bdt.d > this.b() && bdt.a < this.d() && bdt.f > this.c() && bdt.c < this.e();
	}

	public double a(sn sn) {
		return this.b(sn.p, sn.r);
	}

	public double b(double double1, double double2) {
		double double6 = double2 - this.c();
		double double8 = this.e() - double2;
		double double10 = double1 - this.b();
		double double12 = this.d() - double1;
		double double14 = Math.min(double10, double12);
		double14 = Math.min(double14, double6);
		return Math.min(double14, double8);
	}

	public aue a() {
		if (this.e < this.d) {
			return aue.SHRINKING;
		} else {
			return this.e > this.d ? aue.GROWING : aue.STATIONARY;
		}
	}

	public double b() {
		double double2 = this.f() - this.h() / 2.0;
		if (double2 < (double)(-this.h)) {
			double2 = (double)(-this.h);
		}

		return double2;
	}

	public double c() {
		double double2 = this.g() - this.h() / 2.0;
		if (double2 < (double)(-this.h)) {
			double2 = (double)(-this.h);
		}

		return double2;
	}

	public double d() {
		double double2 = this.f() + this.h() / 2.0;
		if (double2 > (double)this.h) {
			double2 = (double)this.h;
		}

		return double2;
	}

	public double e() {
		double double2 = this.g() + this.h() / 2.0;
		if (double2 > (double)this.h) {
			double2 = (double)this.h;
		}

		return double2;
	}

	public double f() {
		return this.b;
	}

	public double g() {
		return this.c;
	}

	public void c(double double1, double double2) {
		this.b = double1;
		this.c = double2;

		for (aud aud7 : this.k()) {
			aud7.a(this, double1, double2);
		}
	}

	public double h() {
		if (this.a() != aue.STATIONARY) {
			double double2 = (double)((float)(System.currentTimeMillis() - this.g) / (float)(this.f - this.g));
			if (!(double2 >= 1.0)) {
				return this.d + (this.e - this.d) * double2;
			}

			this.a(this.e);
		}

		return this.d;
	}

	public long i() {
		return this.a() == aue.STATIONARY ? 0L : this.f - System.currentTimeMillis();
	}

	public double j() {
		return this.e;
	}

	public void a(double double1) {
		this.d = double1;
		this.e = double1;
		this.f = System.currentTimeMillis();
		this.g = this.f;

		for (aud aud5 : this.k()) {
			aud5.a(this, double1);
		}
	}

	public void a(double double1, double double2, long long3) {
		this.d = double1;
		this.e = double2;
		this.g = System.currentTimeMillis();
		this.f = this.g + long3;

		for (aud aud9 : this.k()) {
			aud9.a(this, double1, double2, long3);
		}
	}

	protected List<aud> k() {
		return Lists.newArrayList(this.a);
	}

	public void a(aud aud) {
		this.a.add(aud);
	}

	public void a(int integer) {
		this.h = integer;
	}

	public int l() {
		return this.h;
	}

	public double m() {
		return this.j;
	}

	public void b(double double1) {
		this.j = double1;

		for (aud aud5 : this.k()) {
			aud5.c(this, double1);
		}
	}

	public double n() {
		return this.i;
	}

	public void c(double double1) {
		this.i = double1;

		for (aud aud5 : this.k()) {
			aud5.b(this, double1);
		}
	}

	public double o() {
		return this.f == this.g ? 0.0 : Math.abs(this.d - this.e) / (double)(this.f - this.g);
	}

	public int p() {
		return this.k;
	}

	public void b(int integer) {
		this.k = integer;

		for (aud aud4 : this.k()) {
			aud4.a(this, integer);
		}
	}

	public int q() {
		return this.l;
	}

	public void c(int integer) {
		this.l = integer;

		for (aud aud4 : this.k()) {
			aud4.b(this, integer);
		}
	}
}
