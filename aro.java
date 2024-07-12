import com.google.common.base.Objects;
import java.util.Random;
import javax.annotation.Nullable;

public class aro extends alu {
	public static final aty a = aoi.D;
	public static final atx b = atx.a("powered");
	public static final atx c = atx.a("attached");
	protected static final bdt d = new bdt(0.3125, 0.0, 0.625, 0.6875, 0.625, 1.0);
	protected static final bdt e = new bdt(0.3125, 0.0, 0.0, 0.6875, 0.625, 0.375);
	protected static final bdt f = new bdt(0.625, 0.0, 0.3125, 1.0, 0.625, 0.6875);
	protected static final bdt g = new bdt(0.0, 0.0, 0.3125, 0.375, 0.625, 0.6875);

	public aro() {
		super(azs.q);
		this.y(this.A.b().a(a, cv.NORTH).a(b, false).a(c, false));
		this.a(aej.d);
		this.a(true);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		switch ((cv)atl.c(a)) {
			case EAST:
			default:
				return g;
			case WEST:
				return f;
			case SOUTH:
				return e;
			case NORTH:
				return d;
		}
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		return k;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean b(ajs ajs, co co, cv cv) {
		return cv.k().c() && ajs.o(co.a(cv.d())).m();
	}

	@Override
	public boolean a(ajs ajs, co co) {
		for (cv cv5 : cv.c.HORIZONTAL) {
			if (ajs.o(co.a(cv5)).m()) {
				return true;
			}
		}

		return false;
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		atl atl10 = this.t().a(b, false).a(c, false);
		if (cv.k().c()) {
			atl10 = atl10.a(a, cv);
		}

		return atl10;
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sw sw, afj afj) {
		this.a(ajs, co, atl, false, false, -1, null);
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (alu != this) {
			if (this.e(ajs, co3, atl)) {
				cv cv7 = atl.c(a);
				if (!ajs.o(co3.a(cv7.d())).m()) {
					this.b(ajs, co3, atl, 0);
					ajs.g(co3);
				}
			}
		}
	}

	public void a(ajs ajs, co co, atl atl3, boolean boolean4, boolean boolean5, int integer, @Nullable atl atl7) {
		cv cv9 = atl3.c(a);
		boolean boolean10 = (Boolean)atl3.c(c);
		boolean boolean11 = (Boolean)atl3.c(b);
		boolean boolean12 = !boolean4;
		boolean boolean13 = false;
		int integer14 = 0;
		atl[] arr15 = new atl[42];

		for (int integer16 = 1; integer16 < 42; integer16++) {
			co co17 = co.a(cv9, integer16);
			atl atl18 = ajs.o(co17);
			if (atl18.v() == alv.bR) {
				if (atl18.c(a) == cv9.d()) {
					integer14 = integer16;
				}
				break;
			}

			if (atl18.v() != alv.bS && integer16 != integer) {
				arr15[integer16] = null;
				boolean12 = false;
			} else {
				if (integer16 == integer) {
					atl18 = (atl)Objects.firstNonNull(atl7, atl18);
				}

				boolean boolean19 = !(Boolean)atl18.c(arn.c);
				boolean boolean20 = (Boolean)atl18.c(arn.a);
				boolean13 |= boolean19 && boolean20;
				arr15[integer16] = atl18;
				if (integer16 == integer) {
					ajs.a(co, this, this.a(ajs));
					boolean12 &= boolean19;
				}
			}
		}

		boolean12 &= integer14 > 1;
		boolean13 &= boolean12;
		atl atl16 = this.t().a(c, boolean12).a(b, boolean13);
		if (integer14 > 0) {
			co co17x = co.a(cv9, integer14);
			cv cv18 = cv9.d();
			ajs.a(co17x, atl16.a(a, cv18), 3);
			this.a(ajs, co17x, cv18);
			this.a(ajs, co17x, boolean12, boolean13, boolean10, boolean11);
		}

		this.a(ajs, co, boolean12, boolean13, boolean10, boolean11);
		if (!boolean4) {
			ajs.a(co, atl16.a(a, cv9), 3);
			if (boolean5) {
				this.a(ajs, co, cv9);
			}
		}

		if (boolean10 != boolean12) {
			for (int integer17 = 1; integer17 < integer14; integer17++) {
				co co18 = co.a(cv9, integer17);
				atl atl19 = arr15[integer17];
				if (atl19 != null && ajs.o(co18).a() != azs.a) {
					ajs.a(co18, atl19.a(c, boolean12), 3);
				}
			}
		}
	}

	@Override
	public void a(ajs ajs, co co, atl atl, Random random) {
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		this.a(ajs, co, atl, false, true, -1, null);
	}

	private void a(ajs ajs, co co, boolean boolean3, boolean boolean4, boolean boolean5, boolean boolean6) {
		if (boolean4 && !boolean6) {
			ajs.a(null, co, nn.gZ, no.BLOCKS, 0.4F, 0.6F);
		} else if (!boolean4 && boolean6) {
			ajs.a(null, co, nn.gY, no.BLOCKS, 0.4F, 0.5F);
		} else if (boolean3 && !boolean5) {
			ajs.a(null, co, nn.gX, no.BLOCKS, 0.4F, 0.7F);
		} else if (!boolean3 && boolean5) {
			ajs.a(null, co, nn.ha, no.BLOCKS, 0.4F, 1.2F / (ajs.r.nextFloat() * 0.2F + 0.9F));
		}
	}

	private void a(ajs ajs, co co, cv cv) {
		ajs.b(co, this, false);
		ajs.b(co.a(cv.d()), this, false);
	}

	private boolean e(ajs ajs, co co, atl atl) {
		if (!this.a(ajs, co)) {
			this.b(ajs, co, atl, 0);
			ajs.g(co);
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		boolean boolean5 = (Boolean)atl.c(c);
		boolean boolean6 = (Boolean)atl.c(b);
		if (boolean5 || boolean6) {
			this.a(ajs, co, atl, true, false, -1, null);
		}

		if (boolean6) {
			ajs.b(co, this, false);
			ajs.b(co.a(((cv)atl.c(a)).d()), this, false);
		}

		super.b(ajs, co, atl);
	}

	@Override
	public int b(atl atl, ajw ajw, co co, cv cv) {
		return atl.c(b) ? 15 : 0;
	}

	@Override
	public int c(atl atl, ajw ajw, co co, cv cv) {
		if (!(Boolean)atl.c(b)) {
			return 0;
		} else {
			return atl.c(a) == cv ? 15 : 0;
		}
	}

	@Override
	public boolean g(atl atl) {
		return true;
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT_MIPPED;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, cv.b(integer & 3)).a(b, (integer & 8) > 0).a(c, (integer & 4) > 0);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((cv)atl.c(a)).b();
		if ((Boolean)atl.c(b)) {
			integer3 |= 8;
		}

		if ((Boolean)atl.c(c)) {
			integer3 |= 4;
		}

		return integer3;
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(a, aqi.a(atl.c(a)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(atl.c(a)));
	}

	@Override
	protected atm b() {
		return new atm(this, a, b, c);
	}
}
