import com.google.common.collect.Lists;
import java.util.List;

public class ut extends ui {
	private final te a;
	private final double b;
	private bbd c;
	private wo d;
	private final boolean e;
	private final List<wo> f = Lists.newArrayList();

	public ut(te te, double double2, boolean boolean3) {
		this.a = te;
		this.b = double2;
		this.e = boolean3;
		this.a(1);
		if (!(te.x() instanceof we)) {
			throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
		}
	}

	@Override
	public boolean a() {
		this.f();
		if (this.e && this.a.l.B()) {
			return false;
		} else {
			wp wp2 = this.a.l.ai().a(new co(this.a), 0);
			if (wp2 == null) {
				return false;
			} else {
				this.d = this.a(wp2);
				if (this.d == null) {
					return false;
				} else {
					we we3 = (we)this.a.x();
					boolean boolean4 = we3.f();
					we3.a(false);
					this.c = we3.a(this.d.d());
					we3.a(boolean4);
					if (this.c != null) {
						return true;
					} else {
						bdw bdw5 = wm.a(this.a, 10, 7, new bdw((double)this.d.d().p(), (double)this.d.d().q(), (double)this.d.d().r()));
						if (bdw5 == null) {
							return false;
						} else {
							we3.a(false);
							this.c = this.a.x().a(bdw5.b, bdw5.c, bdw5.d);
							we3.a(boolean4);
							return this.c != null;
						}
					}
				}
			}
		}
	}

	@Override
	public boolean b() {
		if (this.a.x().n()) {
			return false;
		} else {
			float float2 = this.a.G + 4.0F;
			return this.a.c(this.d.d()) > (double)(float2 * float2);
		}
	}

	@Override
	public void c() {
		this.a.x().a(this.c, this.b);
	}

	@Override
	public void d() {
		if (this.a.x().n() || this.a.c(this.d.d()) < 16.0) {
			this.f.add(this.d);
		}
	}

	private wo a(wp wp) {
		wo wo3 = null;
		int integer4 = Integer.MAX_VALUE;

		for (wo wo7 : wp.f()) {
			int integer8 = wo7.b(ot.c(this.a.p), ot.c(this.a.q), ot.c(this.a.r));
			if (integer8 < integer4 && !this.a(wo7)) {
				wo3 = wo7;
				integer4 = integer8;
			}
		}

		return wo3;
	}

	private boolean a(wo wo) {
		for (wo wo4 : this.f) {
			if (wo.d().equals(wo4.d())) {
				return true;
			}
		}

		return false;
	}

	private void f() {
		if (this.f.size() > 15) {
			this.f.remove(0);
		}
	}
}
