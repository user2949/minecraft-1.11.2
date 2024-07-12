import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class asy extends asz implements lf {
	private static final Logger a = LogManager.getLogger();
	private long f;
	private int g;
	private co h;
	private boolean i;

	@Override
	public du b(du du) {
		super.b(du);
		du.a("Age", this.f);
		if (this.h != null) {
			du.a("ExitPortal", ee.a(this.h));
		}

		if (this.i) {
			du.a("ExactTeleport", this.i);
		}

		return du;
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.f = du.i("Age");
		if (du.b("ExitPortal", 10)) {
			this.h = ee.c(du.o("ExitPortal"));
		}

		this.i = du.p("ExactTeleport");
	}

	@Override
	public double t() {
		return 65536.0;
	}

	@Override
	public void F_() {
		boolean boolean2 = this.a();
		boolean boolean3 = this.e();
		this.f++;
		if (boolean3) {
			this.g--;
		} else if (!this.b.E) {
			List<sn> list4 = this.b.a(sn.class, new bdt(this.w()));
			if (!list4.isEmpty()) {
				this.a((sn)list4.get(0));
			}

			if (this.f % 2400L == 0L) {
				this.f();
			}
		}

		if (boolean2 != this.a() || boolean3 != this.e()) {
			this.x_();
		}
	}

	public boolean a() {
		return this.f < 200L;
	}

	public boolean e() {
		return this.g > 0;
	}

	public float a(float float1) {
		return ot.a(((float)this.f + float1) / 200.0F, 0.0F, 1.0F);
	}

	public float b(float float1) {
		return 1.0F - ot.a(((float)this.g - float1) / 40.0F, 0.0F, 1.0F);
	}

	@Nullable
	@Override
	public fz c() {
		return new fz(this.c, 8, this.d());
	}

	@Override
	public du d() {
		return this.b(new du());
	}

	public void f() {
		if (!this.b.E) {
			this.g = 40;
			this.b.c(this.w(), this.x(), 1, 0);
			this.x_();
		}
	}

	@Override
	public boolean c(int integer1, int integer2) {
		if (integer1 == 1) {
			this.g = 40;
			return true;
		} else {
			return super.c(integer1, integer2);
		}
	}

	public void a(sn sn) {
		if (!this.b.E && !this.e()) {
			this.g = 100;
			if (this.h == null && this.b.s instanceof avl) {
				this.j();
			}

			if (this.h != null) {
				co co3 = this.i ? this.h : this.i();
				sn.a((double)co3.p() + 0.5, (double)co3.q() + 0.5, (double)co3.r() + 0.5);
			}

			this.f();
		}
	}

	private co i() {
		co co2 = a(this.b, this.h, 5, false);
		a.debug("Best exit position for portal at {} is {}", new Object[]{this.h, co2});
		return co2.a();
	}

	private void j() {
		bdw bdw2 = new bdw((double)this.w().p(), 0.0, (double)this.w().r()).a();
		bdw bdw3 = bdw2.a(1024.0);

		for (int integer4 = 16; a(this.b, bdw3).g() > 0 && integer4-- > 0; bdw3 = bdw3.e(bdw2.a(-16.0))) {
			a.debug("Skipping backwards past nonempty chunk at {}", new Object[]{bdw3});
		}

		for (int var5 = 16; a(this.b, bdw3).g() == 0 && var5-- > 0; bdw3 = bdw3.e(bdw2.a(16.0))) {
			a.debug("Skipping forward past empty chunk at {}", new Object[]{bdw3});
		}

		a.debug("Found chunk at {}", new Object[]{bdw3});
		auo auo5 = a(this.b, bdw3);
		this.h = a(auo5);
		if (this.h == null) {
			this.h = new co(bdw3.b + 0.5, 75.0, bdw3.d + 0.5);
			a.debug("Failed to find suitable block, settling on {}", new Object[]{this.h});
			new awl().b(this.b, new Random(this.h.g()), this.h);
		} else {
			a.debug("Found block at {}", new Object[]{this.h});
		}

		this.h = a(this.b, this.h, 16, true);
		a.debug("Creating portal at {}", new Object[]{this.h});
		this.h = this.h.b(10);
		this.c(this.h);
		this.x_();
	}

	private static co a(ajs ajs, co co, int integer, boolean boolean4) {
		co co5 = null;

		for (int integer6 = -integer; integer6 <= integer; integer6++) {
			for (int integer7 = -integer; integer7 <= integer; integer7++) {
				if (integer6 != 0 || integer7 != 0 || boolean4) {
					for (int integer8 = 255; integer8 > (co5 == null ? 0 : co5.q()); integer8--) {
						co co9 = new co(co.p() + integer6, integer8, co.r() + integer7);
						atl atl10 = ajs.o(co9);
						if (atl10.l() && (boolean4 || atl10.v() != alv.h)) {
							co5 = co9;
							break;
						}
					}
				}
			}
		}

		return co5 == null ? co : co5;
	}

	private static auo a(ajs ajs, bdw bdw) {
		return ajs.a(ot.c(bdw.b / 16.0), ot.c(bdw.d / 16.0));
	}

	@Nullable
	private static co a(auo auo) {
		co co2 = new co(auo.b * 16, 30, auo.c * 16);
		int integer3 = auo.g() + 16 - 1;
		co co4 = new co(auo.b * 16 + 16 - 1, integer3, auo.c * 16 + 16 - 1);
		co co5 = null;
		double double6 = 0.0;

		for (co co9 : co.a(co2, co4)) {
			atl atl10 = auo.a(co9);
			if (atl10.v() == alv.bH && !auo.a(co9.b(1)).l() && !auo.a(co9.b(2)).l()) {
				double double11 = co9.g(0.0, 0.0, 0.0);
				if (co5 == null || double11 < double6) {
					co5 = co9;
					double6 = double11;
				}
			}
		}

		return co5;
	}

	private void c(co co) {
		new awk().b(this.b, new Random(), co);
		asc asc3 = this.b.r(co);
		if (asc3 instanceof asy) {
			asy asy4 = (asy)asc3;
			asy4.h = new co(this.w());
			asy4.x_();
		} else {
			a.warn("Couldn't save exit portal at {}", new Object[]{co});
		}
	}

	@Override
	public boolean a(cv cv) {
		return this.x().t().c(this.b, this.w(), cv);
	}

	public int h() {
		int integer2 = 0;

		for (cv cv6 : cv.values()) {
			integer2 += this.a(cv6) ? 1 : 0;
		}

		return integer2;
	}

	public void b(co co) {
		this.i = true;
		this.h = co;
	}
}
