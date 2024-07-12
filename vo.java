import com.google.common.collect.Sets;
import java.util.Set;

public class vo extends ui {
	private final te a;
	private final double b;
	private double c;
	private double d;
	private double e;
	private double f;
	private double g;
	private aay h;
	private int i;
	private boolean j;
	private final Set<afh> k;
	private final boolean l;

	public vo(te te, double double2, afh afh, boolean boolean4) {
		this(te, double2, boolean4, Sets.newHashSet(new afh[]{afh}));
	}

	public vo(te te, double double2, boolean boolean3, Set<afh> set) {
		this.a = te;
		this.b = double2;
		this.k = set;
		this.l = boolean3;
		this.a(3);
		if (!(te.x() instanceof we)) {
			throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
		}
	}

	@Override
	public boolean a() {
		if (this.i > 0) {
			this.i--;
			return false;
		} else {
			this.h = this.a.l.a(this.a, 10.0);
			return this.h == null ? false : this.a(this.h.cg()) || this.a(this.h.ch());
		}
	}

	protected boolean a(afj afj) {
		return this.k.contains(afj.c());
	}

	@Override
	public boolean b() {
		if (this.l) {
			if (this.a.h(this.h) < 36.0) {
				if (this.h.d(this.c, this.d, this.e) > 0.010000000000000002) {
					return false;
				}

				if (Math.abs((double)this.h.w - this.f) > 5.0 || Math.abs((double)this.h.v - this.g) > 5.0) {
					return false;
				}
			} else {
				this.c = this.h.p;
				this.d = this.h.q;
				this.e = this.h.r;
			}

			this.f = (double)this.h.w;
			this.g = (double)this.h.v;
		}

		return this.a();
	}

	@Override
	public void c() {
		this.c = this.h.p;
		this.d = this.h.q;
		this.e = this.h.r;
		this.j = true;
	}

	@Override
	public void d() {
		this.h = null;
		this.a.x().o();
		this.i = 100;
		this.j = false;
	}

	@Override
	public void e() {
		this.a.t().a(this.h, (float)(this.a.cL() + 20), (float)this.a.N());
		if (this.a.h(this.h) < 6.25) {
			this.a.x().o();
		} else {
			this.a.x().a(this.h, this.b);
		}
	}

	public boolean f() {
		return this.j;
	}
}
