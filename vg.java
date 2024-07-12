public class vg extends ui {
	private final sx a;
	private final aac b;
	private sw c;
	private int d = -1;
	private final double e;
	private int f;
	private final int g;
	private final int h;
	private final float i;
	private final float j;

	public vg(aac aac, double double2, int integer, float float4) {
		this(aac, double2, integer, integer, float4);
	}

	public vg(aac aac, double double2, int integer3, int integer4, float float5) {
		if (!(aac instanceof sw)) {
			throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
		} else {
			this.b = aac;
			this.a = (sx)aac;
			this.e = double2;
			this.g = integer3;
			this.h = integer4;
			this.i = float5;
			this.j = float5 * float5;
			this.a(3);
		}
	}

	@Override
	public boolean a() {
		sw sw2 = this.a.z();
		if (sw2 == null) {
			return false;
		} else {
			this.c = sw2;
			return true;
		}
	}

	@Override
	public boolean b() {
		return this.a() || !this.a.x().n();
	}

	@Override
	public void d() {
		this.c = null;
		this.f = 0;
		this.d = -1;
	}

	@Override
	public void e() {
		double double2 = this.a.d(this.c.p, this.c.bo().b, this.c.r);
		boolean boolean4 = this.a.y().a(this.c);
		if (boolean4) {
			this.f++;
		} else {
			this.f = 0;
		}

		if (!(double2 > (double)this.j) && this.f >= 20) {
			this.a.x().o();
		} else {
			this.a.x().a(this.c, this.e);
		}

		this.a.t().a(this.c, 30.0F, 30.0F);
		if (--this.d == 0) {
			if (!boolean4) {
				return;
			}

			float float5 = ot.a(double2) / this.i;
			float float6 = ot.a(float5, 0.1F, 1.0F);
			this.b.a(this.c, float6);
			this.d = ot.d(float5 * (float)(this.h - this.g) + (float)this.g);
		} else if (this.d < 0) {
			float float5 = ot.a(double2) / this.i;
			this.d = ot.d(float5 * (float)(this.h - this.g) + (float)this.g);
		}
	}
}
