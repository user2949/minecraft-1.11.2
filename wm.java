import java.util.Random;
import javax.annotation.Nullable;

public class wm {
	private static bdw a = bdw.a;

	@Nullable
	public static bdw a(te te, int integer2, int integer3) {
		return c(te, integer2, integer3, null);
	}

	@Nullable
	public static bdw b(te te, int integer2, int integer3) {
		return a(te, integer2, integer3, null, false);
	}

	@Nullable
	public static bdw a(te te, int integer2, int integer3, bdw bdw) {
		a = bdw.a(te.p, te.q, te.r);
		return c(te, integer2, integer3, a);
	}

	@Nullable
	public static bdw b(te te, int integer2, int integer3, bdw bdw) {
		a = new bdw(te.p, te.q, te.r).d(bdw);
		return c(te, integer2, integer3, a);
	}

	@Nullable
	private static bdw c(te te, int integer2, int integer3, @Nullable bdw bdw) {
		return a(te, integer2, integer3, bdw, true);
	}

	@Nullable
	private static bdw a(te te, int integer2, int integer3, @Nullable bdw bdw, boolean boolean5) {
		wf wf6 = te.x();
		Random random7 = te.bJ();
		boolean boolean8;
		if (te.df()) {
			double double9 = te.dc().f((double)ot.c(te.p), (double)ot.c(te.q), (double)ot.c(te.r)) + 4.0;
			double double11 = (double)(te.dd() + (float)integer2);
			boolean8 = double9 < double11 * double11;
		} else {
			boolean8 = false;
		}

		boolean boolean9 = false;
		float float10 = -99999.0F;
		int integer11 = 0;
		int integer12 = 0;
		int integer13 = 0;

		for (int integer14 = 0; integer14 < 10; integer14++) {
			int integer15 = random7.nextInt(2 * integer2 + 1) - integer2;
			int integer16 = random7.nextInt(2 * integer3 + 1) - integer3;
			int integer17 = random7.nextInt(2 * integer2 + 1) - integer2;
			if (bdw == null || !((double)integer15 * bdw.b + (double)integer17 * bdw.d < 0.0)) {
				if (te.df() && integer2 > 1) {
					co co18 = te.dc();
					if (te.p > (double)co18.p()) {
						integer15 -= random7.nextInt(integer2 / 2);
					} else {
						integer15 += random7.nextInt(integer2 / 2);
					}

					if (te.r > (double)co18.r()) {
						integer17 -= random7.nextInt(integer2 / 2);
					} else {
						integer17 += random7.nextInt(integer2 / 2);
					}
				}

				co co18x = new co((double)integer15 + te.p, (double)integer16 + te.q, (double)integer17 + te.r);
				if ((!boolean8 || te.f(co18x)) && wf6.b(co18x)) {
					if (!boolean5) {
						co18x = a(co18x, te);
						if (b(co18x, te)) {
							continue;
						}
					}

					float float19 = te.a(co18x);
					if (float19 > float10) {
						float10 = float19;
						integer11 = integer15;
						integer12 = integer16;
						integer13 = integer17;
						boolean9 = true;
					}
				}
			}
		}

		return boolean9 ? new bdw((double)integer11 + te.p, (double)integer12 + te.q, (double)integer13 + te.r) : null;
	}

	private static co a(co co, te te) {
		if (!te.l.o(co).a().a()) {
			return co;
		} else {
			co co3 = co.a();

			while (co3.q() < te.l.Y() && te.l.o(co3).a().a()) {
				co3 = co3.a();
			}

			return co3;
		}
	}

	private static boolean b(co co, te te) {
		return te.l.o(co).a() == azs.h;
	}
}
