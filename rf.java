import java.util.Random;

public class rf {
	private static final Random a = new Random();

	public static void a(ajs ajs, co co, rc rc) {
		a(ajs, (double)co.p(), (double)co.q(), (double)co.r(), rc);
	}

	public static void a(ajs ajs, sn sn, rc rc) {
		a(ajs, sn.p, sn.q, sn.r, rc);
	}

	private static void a(ajs ajs, double double2, double double3, double double4, rc rc) {
		for (int integer9 = 0; integer9 < rc.v_(); integer9++) {
			afj afj10 = rc.a(integer9);
			if (!afj10.b()) {
				a(ajs, double2, double3, double4, afj10);
			}
		}
	}

	public static void a(ajs ajs, double double2, double double3, double double4, afj afj) {
		float float9 = a.nextFloat() * 0.8F + 0.1F;
		float float10 = a.nextFloat() * 0.8F + 0.1F;
		float float11 = a.nextFloat() * 0.8F + 0.1F;

		while (!afj.b()) {
			zj zj12 = new zj(ajs, double2 + (double)float9, double3 + (double)float10, double4 + (double)float11, afj.a(a.nextInt(21) + 10));
			float float13 = 0.05F;
			zj12.s = a.nextGaussian() * 0.05F;
			zj12.t = a.nextGaussian() * 0.05F + 0.2F;
			zj12.u = a.nextGaussian() * 0.05F;
			ajs.a(zj12);
		}
	}
}
