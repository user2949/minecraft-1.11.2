import java.util.List;

public final class abk {
	public static bdu a(sn sn1, boolean boolean2, boolean boolean3, sn sn4) {
		double double5 = sn1.p;
		double double7 = sn1.q;
		double double9 = sn1.r;
		double double11 = sn1.s;
		double double13 = sn1.t;
		double double15 = sn1.u;
		ajs ajs17 = sn1.l;
		bdw bdw18 = new bdw(double5, double7, double9);
		bdw bdw19 = new bdw(double5 + double11, double7 + double13, double9 + double15);
		bdu bdu20 = ajs17.a(bdw18, bdw19, false, true, false);
		if (boolean2) {
			if (bdu20 != null) {
				bdw19 = new bdw(bdu20.c.b, bdu20.c.c, bdu20.c.d);
			}

			sn sn21 = null;
			List<sn> list22 = ajs17.b(sn1, sn1.bo().b(double11, double13, double15).g(1.0));
			double double23 = 0.0;

			for (int integer25 = 0; integer25 < list22.size(); integer25++) {
				sn sn26 = (sn)list22.get(integer25);
				if (sn26.aq() && (boolean3 || !sn26.s(sn4)) && !sn26.Q) {
					bdt bdt27 = sn26.bo().g(0.3F);
					bdu bdu28 = bdt27.b(bdw18, bdw19);
					if (bdu28 != null) {
						double double29 = bdw18.g(bdu28.c);
						if (double29 < double23 || double23 == 0.0) {
							sn21 = sn26;
							double23 = double29;
						}
					}
				}
			}

			if (sn21 != null) {
				bdu20 = new bdu(sn21);
			}
		}

		return bdu20;
	}

	public static final void a(sn sn, float float2) {
		double double3 = sn.s;
		double double5 = sn.t;
		double double7 = sn.u;
		float float9 = ot.a(double3 * double3 + double7 * double7);
		sn.v = (float)(ot.c(double7, double3) * 180.0F / (float)Math.PI) + 90.0F;
		sn.w = (float)(ot.c((double)float9, double5) * 180.0F / (float)Math.PI) - 90.0F;

		while (sn.w - sn.y < -180.0F) {
			sn.y -= 360.0F;
		}

		while (sn.w - sn.y >= 180.0F) {
			sn.y += 360.0F;
		}

		while (sn.v - sn.x < -180.0F) {
			sn.x -= 360.0F;
		}

		while (sn.v - sn.x >= 180.0F) {
			sn.x += 360.0F;
		}

		sn.w = sn.y + (sn.w - sn.y) * float2;
		sn.v = sn.x + (sn.v - sn.x) * float2;
	}
}
