import java.util.Random;

public class axr extends awn {
	@Override
	public boolean b(ajs ajs, Random random, co co) {
		while (co.q() < 128) {
			if (ajs.d(co)) {
				for (cv cv8 : cv.c.HORIZONTAL.a()) {
					if (alv.bn.b(ajs, co, cv8)) {
						atl atl9 = alv.bn.t().a(arp.b, cv8 == cv.NORTH).a(arp.c, cv8 == cv.EAST).a(arp.d, cv8 == cv.SOUTH).a(arp.e, cv8 == cv.WEST);
						ajs.a(co, atl9, 2);
						break;
					}
				}
			} else {
				co = co.a(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
			}

			co = co.a();
		}

		return true;
	}
}
