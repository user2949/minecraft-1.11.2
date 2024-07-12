import java.util.Random;

public class akt extends akf {
	private final boolean y;
	private static final atl z = alv.r.t().a(apk.b, apn.a.JUNGLE);
	private static final atl A = alv.t.t().a(apj.e, apn.a.JUNGLE).a(aon.b, false);
	private static final atl B = alv.t.t().a(apj.e, apn.a.OAK).a(aon.b, false);

	public akt(boolean boolean1, akf.a a) {
		super(a);
		this.y = boolean1;
		if (boolean1) {
			this.t.z = 2;
		} else {
			this.t.z = 50;
		}

		this.t.C = 25;
		this.t.B = 4;
		if (!boolean1) {
			this.u.add(new akf.c(xb.class, 2, 1, 1));
		}

		this.v.add(new akf.c(wx.class, 10, 4, 4));
	}

	@Override
	public avz a(Random random) {
		if (random.nextInt(10) == 0) {
			return o;
		} else if (random.nextInt(2) == 0) {
			return new awq(z, B);
		} else {
			return (avz)(!this.y && random.nextInt(3) == 0 ? new awz(false, 10, 20, z, A) : new axq(false, 4 + random.nextInt(7), z, A, true));
		}
	}

	@Override
	public awn b(Random random) {
		return random.nextInt(4) == 0 ? new axp(ari.a.FERN) : new axp(ari.a.GRASS);
	}

	@Override
	public void a(ajs ajs, Random random, co co) {
		super.a(ajs, random, co);
		int integer5 = random.nextInt(16) + 8;
		int integer6 = random.nextInt(16) + 8;
		int integer7 = random.nextInt(ajs.l(co.a(integer5, 0, integer6)).q() * 2);
		new axc().b(ajs, random, co.a(integer5, integer7, integer6));
		axr axr5 = new axr();

		for (int integer6x = 0; integer6x < 50; integer6x++) {
			integer7 = random.nextInt(16) + 8;
			int integer8 = 128;
			int integer9 = random.nextInt(16) + 8;
			axr5.b(ajs, random, co.a(integer7, 128, integer9));
		}
	}
}
