import java.util.Random;

public class ald extends akf {
	protected static final atl y = alv.bx.t();

	protected ald(akf.a a) {
		super(a);
		this.t.z = 2;
		this.t.B = 1;
		this.t.D = 1;
		this.t.E = 8;
		this.t.F = 10;
		this.t.J = 1;
		this.t.y = 4;
		this.t.I = 0;
		this.t.H = 0;
		this.t.C = 5;
		this.u.add(new akf.c(aah.class, 1, 1, 1));
	}

	@Override
	public avz a(Random random) {
		return p;
	}

	@Override
	public int b(co co) {
		double double3 = l.a((double)co.p() * 0.0225, (double)co.r() * 0.0225);
		return double3 < -0.1 ? 5011004 : 6975545;
	}

	@Override
	public int c(co co) {
		return 6975545;
	}

	@Override
	public ano.a a(Random random, co co) {
		return ano.a.BLUE_ORCHID;
	}

	@Override
	public void a(ajs ajs, Random random, avp avp, int integer4, int integer5, double double6) {
		double double9 = l.a((double)integer4 * 0.25, (double)integer5 * 0.25);
		if (double9 > 0.0) {
			int integer11 = integer4 & 15;
			int integer12 = integer5 & 15;

			for (int integer13 = 255; integer13 >= 0; integer13--) {
				if (avp.a(integer12, integer13, integer11).a() != azs.a) {
					if (integer13 == 62 && avp.a(integer12, integer13, integer11).v() != alv.j) {
						avp.a(integer12, integer13, integer11, h);
						if (double9 < 0.12) {
							avp.a(integer12, integer13 + 1, integer11, y);
						}
					}
					break;
				}
			}
		}

		this.b(ajs, random, avp, integer4, integer5, double6);
	}

	@Override
	public void a(ajs ajs, Random random, co co) {
		super.a(ajs, random, co);
		if (random.nextInt(64) == 0) {
			new awp().b(ajs, random, co);
		}
	}
}
