import java.util.List;
import javax.annotation.Nullable;

public class asu extends ast implements lf, ru {
	private static final int[] a = new int[27];
	private dd<afj> f = dd.a(27, afj.a);
	private boolean g;
	private int h;
	private asu.a i = asu.a.CLOSED;
	private float j;
	private float k;
	private aem l;
	private boolean p;

	public asu() {
		this(null);
	}

	public asu(@Nullable aem aem) {
		this.l = aem;
	}

	@Override
	public void F_() {
		this.o();
		if (this.i == asu.a.OPENING || this.i == asu.a.CLOSING) {
			this.G();
		}
	}

	protected void o() {
		this.k = this.j;
		switch (this.i) {
			case CLOSED:
				this.j = 0.0F;
				break;
			case OPENING:
				this.j += 0.1F;
				if (this.j >= 1.0F) {
					this.G();
					this.i = asu.a.OPENED;
					this.j = 1.0F;
				}
				break;
			case CLOSING:
				this.j -= 0.1F;
				if (this.j <= 0.0F) {
					this.i = asu.a.CLOSED;
					this.j = 0.0F;
				}
				break;
			case OPENED:
				this.j = 1.0F;
		}
	}

	public asu.a p() {
		return this.i;
	}

	public bdt a(atl atl) {
		return this.b(atl.c(aqn.a));
	}

	public bdt b(cv cv) {
		return alu.j.b((double)(0.5F * this.a(1.0F) * (float)cv.g()), (double)(0.5F * this.a(1.0F) * (float)cv.h()), (double)(0.5F * this.a(1.0F) * (float)cv.i()));
	}

	private bdt c(cv cv) {
		cv cv3 = cv.d();
		return this.b(cv).a((double)cv3.g(), (double)cv3.h(), (double)cv3.i());
	}

	private void G() {
		atl atl2 = this.b.o(this.w());
		if (atl2.v() instanceof aqn) {
			cv cv3 = atl2.c(aqn.a);
			bdt bdt4 = this.c(cv3).a(this.c);
			List<sn> list5 = this.b.b(null, bdt4);
			if (!list5.isEmpty()) {
				for (int integer6 = 0; integer6 < list5.size(); integer6++) {
					sn sn7 = (sn)list5.get(integer6);
					if (sn7.o_() != azv.IGNORE) {
						double double8 = 0.0;
						double double10 = 0.0;
						double double12 = 0.0;
						bdt bdt14 = sn7.bo();
						switch (cv3.k()) {
							case X:
								if (cv3.c() == cv.b.POSITIVE) {
									double8 = bdt4.d - bdt14.a;
								} else {
									double8 = bdt14.d - bdt4.a;
								}

								double8 += 0.01;
								break;
							case Y:
								if (cv3.c() == cv.b.POSITIVE) {
									double10 = bdt4.e - bdt14.b;
								} else {
									double10 = bdt14.e - bdt4.b;
								}

								double10 += 0.01;
								break;
							case Z:
								if (cv3.c() == cv.b.POSITIVE) {
									double12 = bdt4.f - bdt14.c;
								} else {
									double12 = bdt14.f - bdt4.c;
								}

								double12 += 0.01;
						}

						sn7.a(tc.SHULKER_BOX, double8 * (double)cv3.g(), double10 * (double)cv3.h(), double12 * (double)cv3.i());
					}
				}
			}
		}
	}

	@Override
	public int v_() {
		return this.f.size();
	}

	@Override
	public int y_() {
		return 64;
	}

	@Override
	public boolean c(int integer1, int integer2) {
		if (integer1 == 1) {
			this.h = integer2;
			if (integer2 == 0) {
				this.i = asu.a.CLOSING;
			}

			if (integer2 == 1) {
				this.i = asu.a.OPENING;
			}

			return true;
		} else {
			return super.c(integer1, integer2);
		}
	}

	@Override
	public void b(aay aay) {
		if (!aay.y()) {
			if (this.h < 0) {
				this.h = 0;
			}

			this.h++;
			this.b.c(this.c, this.x(), 1, this.h);
			if (this.h == 1) {
				this.b.a(null, this.c, nn.fB, no.BLOCKS, 0.5F, this.b.r.nextFloat() * 0.1F + 0.9F);
			}
		}
	}

	@Override
	public void c(aay aay) {
		if (!aay.y()) {
			this.h--;
			this.b.c(this.c, this.x(), 1, this.h);
			if (this.h <= 0) {
				this.b.a(null, this.c, nn.fA, no.BLOCKS, 0.5F, this.b.r.nextFloat() * 0.1F + 0.9F);
			}
		}
	}

	@Override
	public acl a(aax aax, aay aay) {
		return new adj(aax, this, aay);
	}

	@Override
	public String l() {
		return "minecraft:shulker_box";
	}

	@Override
	public String h_() {
		return this.n_() ? this.o : "container.shulkerBox";
	}

	public static void a(ph ph) {
		ph.a(pf.BLOCK_ENTITY, new qu(asu.class, "Items"));
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.e(du);
	}

	@Override
	public du b(du du) {
		super.b(du);
		return this.f(du);
	}

	public void e(du du) {
		this.f = dd.a(this.v_(), afj.a);
		if (!this.c(du) && du.b("Items", 9)) {
			rd.b(du, this.f);
		}

		if (du.b("CustomName", 8)) {
			this.o = du.l("CustomName");
		}
	}

	public du f(du du) {
		if (!this.d(du)) {
			rd.a(du, this.f, false);
		}

		if (this.n_()) {
			du.a("CustomName", this.o);
		}

		if (!du.e("Lock") && this.z_()) {
			this.j().a(du);
		}

		return du;
	}

	@Override
	protected dd<afj> q() {
		return this.f;
	}

	@Override
	public boolean w_() {
		for (afj afj3 : this.f) {
			if (!afj3.b()) {
				return false;
			}
		}

		return true;
	}

	@Override
	public int[] a(cv cv) {
		return a;
	}

	@Override
	public boolean a(int integer, afj afj, cv cv) {
		return !(alu.a(afj.c()) instanceof aqn);
	}

	@Override
	public boolean b(int integer, afj afj, cv cv) {
		return true;
	}

	@Override
	public void m() {
		this.g = true;
		super.m();
	}

	public boolean r() {
		return this.g;
	}

	public float a(float float1) {
		return this.k + (this.j - this.k) * float1;
	}

	public aem s() {
		if (this.l == null) {
			this.l = aqn.c(this.x());
		}

		return this.l;
	}

	@Nullable
	@Override
	public fz c() {
		return new fz(this.c, 10, this.d());
	}

	public boolean E() {
		return this.p;
	}

	public void a(boolean boolean1) {
		this.p = boolean1;
	}

	public boolean F() {
		return !this.E() || !this.w_() || this.n_() || this.m != null;
	}

	static {
		int integer1 = 0;

		while (integer1 < a.length) {
			a[integer1] = integer1++;
		}
	}

	public static enum a {
		CLOSED,
		OPENING,
		OPENED,
		CLOSING;
	}
}
