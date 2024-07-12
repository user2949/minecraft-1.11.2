import java.util.List;
import javax.annotation.Nullable;

public class asp extends ast implements aso, lf {
	private dd<afj> a = dd.a(5, afj.a);
	private int f = -1;
	private long g;

	public static void a(ph ph) {
		ph.a(pf.BLOCK_ENTITY, new qu(asp.class, "Items"));
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.a = dd.a(this.v_(), afj.a);
		if (!this.c(du)) {
			rd.b(du, this.a);
		}

		if (du.b("CustomName", 8)) {
			this.o = du.l("CustomName");
		}

		this.f = du.h("TransferCooldown");
	}

	@Override
	public du b(du du) {
		super.b(du);
		if (!this.d(du)) {
			rd.a(du, this.a);
		}

		du.a("TransferCooldown", this.f);
		if (this.n_()) {
			du.a("CustomName", this.o);
		}

		return du;
	}

	@Override
	public int v_() {
		return this.a.size();
	}

	@Override
	public afj a(int integer1, int integer2) {
		this.d(null);
		return rd.a(this.q(), integer1, integer2);
	}

	@Override
	public void a(int integer, afj afj) {
		this.d(null);
		this.q().set(integer, afj);
		if (afj.E() > this.y_()) {
			afj.e(this.y_());
		}
	}

	@Override
	public String h_() {
		return this.n_() ? this.o : "container.hopper";
	}

	@Override
	public int y_() {
		return 64;
	}

	@Override
	public void F_() {
		if (this.b != null && !this.b.E) {
			this.f--;
			this.g = this.b.P();
			if (!this.J()) {
				this.d(0);
				this.o();
			}
		}
	}

	private boolean o() {
		if (this.b != null && !this.b.E) {
			if (!this.J() && aoh.f(this.v())) {
				boolean boolean2 = false;
				if (!this.p()) {
					boolean2 = this.s();
				}

				if (!this.r()) {
					boolean2 = a(this) || boolean2;
				}

				if (boolean2) {
					this.d(8);
					this.x_();
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	private boolean p() {
		for (afj afj3 : this.a) {
			if (!afj3.b()) {
				return false;
			}
		}

		return true;
	}

	@Override
	public boolean w_() {
		return this.p();
	}

	private boolean r() {
		for (afj afj3 : this.a) {
			if (afj3.b() || afj3.E() != afj3.d()) {
				return false;
			}
		}

		return true;
	}

	private boolean s() {
		rc rc2 = this.I();
		if (rc2 == null) {
			return false;
		} else {
			cv cv3 = aoh.e(this.v()).d();
			if (this.a(rc2, cv3)) {
				return false;
			} else {
				for (int integer4 = 0; integer4 < this.v_(); integer4++) {
					if (!this.a(integer4).b()) {
						afj afj5 = this.a(integer4).l();
						afj afj6 = a(this, rc2, this.a(integer4, 1), cv3);
						if (afj6.b()) {
							rc2.x_();
							return true;
						}

						this.a(integer4, afj5);
					}
				}

				return false;
			}
		}
	}

	private boolean a(rc rc, cv cv) {
		if (rc instanceof ru) {
			ru ru4 = (ru)rc;
			int[] arr5 = ru4.a(cv);

			for (int integer9 : arr5) {
				afj afj10 = ru4.a(integer9);
				if (afj10.b() || afj10.E() != afj10.d()) {
					return false;
				}
			}
		} else {
			int integer4 = rc.v_();

			for (int integer5 = 0; integer5 < integer4; integer5++) {
				afj afj6 = rc.a(integer5);
				if (afj6.b() || afj6.E() != afj6.d()) {
					return false;
				}
			}
		}

		return true;
	}

	private static boolean b(rc rc, cv cv) {
		if (rc instanceof ru) {
			ru ru3 = (ru)rc;
			int[] arr4 = ru3.a(cv);

			for (int integer8 : arr4) {
				if (!ru3.a(integer8).b()) {
					return false;
				}
			}
		} else {
			int integer3 = rc.v_();

			for (int integer4 = 0; integer4 < integer3; integer4++) {
				if (!rc.a(integer4).b()) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean a(aso aso) {
		rc rc2 = b(aso);
		if (rc2 != null) {
			cv cv3 = cv.DOWN;
			if (b(rc2, cv3)) {
				return false;
			}

			if (rc2 instanceof ru) {
				ru ru4 = (ru)rc2;
				int[] arr5 = ru4.a(cv3);

				for (int integer9 : arr5) {
					if (a(aso, rc2, integer9, cv3)) {
						return true;
					}
				}
			} else {
				int integer4 = rc2.v_();

				for (int integer5 = 0; integer5 < integer4; integer5++) {
					if (a(aso, rc2, integer5, cv3)) {
						return true;
					}
				}
			}
		} else {
			for (zj zj4 : a(aso.D(), aso.E(), aso.F(), aso.G())) {
				if (a(null, aso, zj4)) {
					return true;
				}
			}
		}

		return false;
	}

	private static boolean a(aso aso, rc rc, int integer, cv cv) {
		afj afj5 = rc.a(integer);
		if (!afj5.b() && b(rc, afj5, integer, cv)) {
			afj afj6 = afj5.l();
			afj afj7 = a(rc, aso, rc.a(integer, 1), null);
			if (afj7.b()) {
				rc.x_();
				return true;
			}

			rc.a(integer, afj6);
		}

		return false;
	}

	public static boolean a(rc rc1, rc rc2, zj zj) {
		boolean boolean4 = false;
		if (zj == null) {
			return false;
		} else {
			afj afj5 = zj.k().l();
			afj afj6 = a(rc1, rc2, afj5, null);
			if (afj6.b()) {
				boolean4 = true;
				zj.T();
			} else {
				zj.a(afj6);
			}

			return boolean4;
		}
	}

	public static afj a(rc rc1, rc rc2, afj afj, @Nullable cv cv) {
		if (rc2 instanceof ru && cv != null) {
			ru ru5 = (ru)rc2;
			int[] arr6 = ru5.a(cv);

			for (int integer7 = 0; integer7 < arr6.length && !afj.b(); integer7++) {
				afj = a(rc1, rc2, afj, arr6[integer7], cv);
			}
		} else {
			int integer5 = rc2.v_();

			for (int integer6 = 0; integer6 < integer5 && !afj.b(); integer6++) {
				afj = a(rc1, rc2, afj, integer6, cv);
			}
		}

		return afj;
	}

	private static boolean a(rc rc, afj afj, int integer, cv cv) {
		return !rc.b(integer, afj) ? false : !(rc instanceof ru) || ((ru)rc).a(integer, afj, cv);
	}

	private static boolean b(rc rc, afj afj, int integer, cv cv) {
		return !(rc instanceof ru) || ((ru)rc).b(integer, afj, cv);
	}

	private static afj a(rc rc1, rc rc2, afj afj, int integer, cv cv) {
		afj afj6 = rc2.a(integer);
		if (a(rc2, afj, integer, cv)) {
			boolean boolean7 = false;
			boolean boolean8 = rc2.w_();
			if (afj6.b()) {
				rc2.a(integer, afj);
				afj = afj.a;
				boolean7 = true;
			} else if (a(afj6, afj)) {
				int integer9 = afj.d() - afj6.E();
				int integer10 = Math.min(afj.E(), integer9);
				afj.g(integer10);
				afj6.f(integer10);
				boolean7 = integer10 > 0;
			}

			if (boolean7) {
				if (boolean8 && rc2 instanceof asp) {
					asp asp9 = (asp)rc2;
					if (!asp9.K()) {
						int integer10 = 0;
						if (rc1 != null && rc1 instanceof asp) {
							asp asp11 = (asp)rc1;
							if (asp9.g >= asp11.g) {
								integer10 = 1;
							}
						}

						asp9.d(8 - integer10);
					}
				}

				rc2.x_();
			}
		}

		return afj;
	}

	private rc I() {
		cv cv2 = aoh.e(this.v());
		return b(this.D(), this.E() + (double)cv2.g(), this.F() + (double)cv2.h(), this.G() + (double)cv2.i());
	}

	public static rc b(aso aso) {
		return b(aso.D(), aso.E(), aso.F() + 1.0, aso.G());
	}

	public static List<zj> a(ajs ajs, double double2, double double3, double double4) {
		return ajs.a(zj.class, new bdt(double2 - 0.5, double3, double4 - 0.5, double2 + 0.5, double3 + 1.5, double4 + 0.5), sr.a);
	}

	public static rc b(ajs ajs, double double2, double double3, double double4) {
		rc rc8 = null;
		int integer9 = ot.c(double2);
		int integer10 = ot.c(double3);
		int integer11 = ot.c(double4);
		co co12 = new co(integer9, integer10, integer11);
		alu alu13 = ajs.o(co12).v();
		if (alu13.l()) {
			asc asc14 = ajs.r(co12);
			if (asc14 instanceof rc) {
				rc8 = (rc)asc14;
				if (rc8 instanceof ase && alu13 instanceof amg) {
					rc8 = ((amg)alu13).a(ajs, co12, true);
				}
			}
		}

		if (rc8 == null) {
			List<sn> list14 = ajs.a(null, new bdt(double2 - 0.5, double3 - 0.5, double4 - 0.5, double2 + 0.5, double3 + 0.5, double4 + 0.5), sr.c);
			if (!list14.isEmpty()) {
				rc8 = (rc)list14.get(ajs.r.nextInt(list14.size()));
			}
		}

		return rc8;
	}

	private static boolean a(afj afj1, afj afj2) {
		if (afj1.c() != afj2.c()) {
			return false;
		} else if (afj1.j() != afj2.j()) {
			return false;
		} else {
			return afj1.E() > afj1.d() ? false : afj.a(afj1, afj2);
		}
	}

	@Override
	public double E() {
		return (double)this.c.p() + 0.5;
	}

	@Override
	public double F() {
		return (double)this.c.q() + 0.5;
	}

	@Override
	public double G() {
		return (double)this.c.r() + 0.5;
	}

	private void d(int integer) {
		this.f = integer;
	}

	private boolean J() {
		return this.f > 0;
	}

	private boolean K() {
		return this.f > 8;
	}

	@Override
	public String l() {
		return "minecraft:hopper";
	}

	@Override
	public acl a(aax aax, aay aay) {
		this.d(aay);
		return new acz(aax, this, aay);
	}

	@Override
	protected dd<afj> q() {
		return this.a;
	}
}
