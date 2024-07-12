import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.util.glu.GLU;

public class ben {
	private static final IntBuffer a = ber.f(16);
	private static final FloatBuffer b = ber.h(16);
	private static final FloatBuffer c = ber.h(16);
	private static final FloatBuffer d = ber.h(3);
	private static bdw e = new bdw(0.0, 0.0, 0.0);
	private static float f;
	private static float g;
	private static float h;
	private static float i;
	private static float j;

	public static void a(aay aay, boolean boolean2) {
		bqg.c(2982, b);
		bqg.c(2983, c);
		bqg.a(2978, a);
		float float3 = (float)((a.get(0) + a.get(2)) / 2);
		float float4 = (float)((a.get(1) + a.get(3)) / 2);
		GLU.gluUnProject(float3, float4, 0.0F, b, c, a, d);
		e = new bdw((double)d.get(0), (double)d.get(1), (double)d.get(2));
		int integer5 = boolean2 ? 1 : 0;
		float float6 = aay.w;
		float float7 = aay.v;
		f = ot.b(float7 * (float) (Math.PI / 180.0)) * (float)(1 - integer5 * 2);
		h = ot.a(float7 * (float) (Math.PI / 180.0)) * (float)(1 - integer5 * 2);
		i = -h * ot.a(float6 * (float) (Math.PI / 180.0)) * (float)(1 - integer5 * 2);
		j = f * ot.a(float6 * (float) (Math.PI / 180.0)) * (float)(1 - integer5 * 2);
		g = ot.b(float6 * (float) (Math.PI / 180.0));
	}

	public static bdw a(sn sn, double double2) {
		double double4 = sn.m + (sn.p - sn.m) * double2;
		double double6 = sn.n + (sn.q - sn.n) * double2;
		double double8 = sn.o + (sn.r - sn.o) * double2;
		double double10 = double4 + e.b;
		double double12 = double6 + e.c;
		double double14 = double8 + e.d;
		return new bdw(double10, double12, double14);
	}

	public static atl a(ajs ajs, sn sn, float float3) {
		bdw bdw4 = a(sn, (double)float3);
		co co5 = new co(bdw4);
		atl atl6 = ajs.o(co5);
		if (atl6.a().d()) {
			float float7 = 0.0F;
			if (atl6.v() instanceof aoq) {
				float7 = aoq.e((Integer)atl6.c(aoq.b)) - 0.11111111F;
			}

			float float8 = (float)(co5.q() + 1) - float7;
			if (bdw4.c >= (double)float8) {
				atl6 = ajs.o(co5.a());
			}
		}

		return atl6;
	}

	public static float b() {
		return f;
	}

	public static float c() {
		return g;
	}

	public static float d() {
		return h;
	}

	public static float e() {
		return i;
	}

	public static float f() {
		return j;
	}
}
