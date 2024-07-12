import java.util.List;

public class vn extends ui {
	private final aat a;
	private xi b;
	private int c;
	private boolean d;

	public vn(aat aat) {
		this.a = aat;
		this.a(3);
	}

	@Override
	public boolean a() {
		if (this.a.l() >= 0) {
			return false;
		} else if (!this.a.l.B()) {
			return false;
		} else {
			List<xi> list2 = this.a.l.a(xi.class, this.a.bo().c(6.0, 2.0, 6.0));
			if (list2.isEmpty()) {
				return false;
			} else {
				for (xi xi4 : list2) {
					if (xi4.di() > 0) {
						this.b = xi4;
						break;
					}
				}

				return this.b != null;
			}
		}
	}

	@Override
	public boolean b() {
		return this.b.di() > 0;
	}

	@Override
	public void c() {
		this.c = this.a.bJ().nextInt(320);
		this.d = false;
		this.b.x().o();
	}

	@Override
	public void d() {
		this.b = null;
		this.a.x().o();
	}

	@Override
	public void e() {
		this.a.t().a(this.b, 30.0F, 30.0F);
		if (this.b.di() == this.c) {
			this.a.x().a(this.b, 0.5);
			this.d = true;
		}

		if (this.d && this.a.h(this.b) < 4.0) {
			this.b.a(false);
			this.a.x().o();
		}
	}
}
