import java.util.List;
import javax.annotation.Nullable;

public class za extends yy {
	public za(ajs ajs) {
		super(ajs);
	}

	public za(ajs ajs, co co) {
		super(ajs, co);
		this.b((double)co.p() + 0.5, (double)co.q() + 0.5, (double)co.r() + 0.5);
		float float4 = 0.125F;
		float float5 = 0.1875F;
		float float6 = 0.25F;
		this.a(new bdt(this.p - 0.1875, this.q - 0.25 + 0.125, this.r - 0.1875, this.p + 0.1875, this.q + 0.25 + 0.125, this.r + 0.1875));
		this.k = true;
	}

	@Override
	public void b(double double1, double double2, double double3) {
		super.b((double)ot.c(double1) + 0.5, (double)ot.c(double2) + 0.5, (double)ot.c(double3) + 0.5);
	}

	@Override
	protected void j() {
		this.p = (double)this.a.p() + 0.5;
		this.q = (double)this.a.q() + 0.5;
		this.r = (double)this.a.r() + 0.5;
	}

	@Override
	public void a(cv cv) {
	}

	@Override
	public int l() {
		return 9;
	}

	@Override
	public int n() {
		return 9;
	}

	@Override
	public float bq() {
		return -0.0625F;
	}

	@Override
	public boolean a(double double1) {
		return double1 < 1024.0;
	}

	@Override
	public void a(@Nullable sn sn) {
		this.a(nn.dt, 1.0F, 1.0F);
	}

	@Override
	public boolean d(du du) {
		return false;
	}

	@Override
	public void b(du du) {
	}

	@Override
	public void a(du du) {
	}

	@Override
	public boolean b(aay aay, ri ri) {
		if (this.l.E) {
			return true;
		} else {
			boolean boolean4 = false;
			double double5 = 7.0;
			List<sx> list7 = this.l.a(sx.class, new bdt(this.p - 7.0, this.q - 7.0, this.r - 7.0, this.p + 7.0, this.q + 7.0, this.r + 7.0));

			for (sx sx9 : list7) {
				if (sx9.cW() && sx9.cX() == aay) {
					sx9.b(this, true);
					boolean4 = true;
				}
			}

			if (!boolean4) {
				this.T();
				if (aay.bK.d) {
					for (sx sx9x : list7) {
						if (sx9x.cW() && sx9x.cX() == this) {
							sx9x.a(true, false);
						}
					}
				}
			}

			return true;
		}
	}

	@Override
	public boolean k() {
		return this.l.o(this.a).v() instanceof anl;
	}

	public static za a(ajs ajs, co co) {
		za za3 = new za(ajs, co);
		ajs.a(za3);
		za3.o();
		return za3;
	}

	@Nullable
	public static za b(ajs ajs, co co) {
		int integer3 = co.p();
		int integer4 = co.q();
		int integer5 = co.r();

		for (za za8 : ajs.a(
			za.class,
			new bdt((double)integer3 - 1.0, (double)integer4 - 1.0, (double)integer5 - 1.0, (double)integer3 + 1.0, (double)integer4 + 1.0, (double)integer5 + 1.0)
		)) {
			if (za8.q().equals(co)) {
				return za8;
			}
		}

		return null;
	}

	@Override
	public void o() {
		this.a(nn.du, 1.0F, 1.0F);
	}
}
