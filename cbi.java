import com.google.common.collect.Maps;
import java.util.Map;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

public enum cbi {
	X0_Y0(0, 0),
	X0_Y90(0, 90),
	X0_Y180(0, 180),
	X0_Y270(0, 270),
	X90_Y0(90, 0),
	X90_Y90(90, 90),
	X90_Y180(90, 180),
	X90_Y270(90, 270),
	X180_Y0(180, 0),
	X180_Y90(180, 90),
	X180_Y180(180, 180),
	X180_Y270(180, 270),
	X270_Y0(270, 0),
	X270_Y90(270, 90),
	X270_Y180(270, 180),
	X270_Y270(270, 270);

	private static final Map<Integer, cbi> q = Maps.newHashMap();
	private final int r;
	private final Matrix4f s;
	private final int t;
	private final int u;

	private static int b(int integer1, int integer2) {
		return integer1 * 360 + integer2;
	}

	private cbi(int integer3, int integer4) {
		this.r = b(integer3, integer4);
		this.s = new Matrix4f();
		Matrix4f matrix4f6 = new Matrix4f();
		matrix4f6.setIdentity();
		Matrix4f.rotate((float)(-integer3) * (float) (Math.PI / 180.0), new Vector3f(1.0F, 0.0F, 0.0F), matrix4f6, matrix4f6);
		this.t = ot.a(integer3 / 90);
		Matrix4f matrix4f7 = new Matrix4f();
		matrix4f7.setIdentity();
		Matrix4f.rotate((float)(-integer4) * (float) (Math.PI / 180.0), new Vector3f(0.0F, 1.0F, 0.0F), matrix4f7, matrix4f7);
		this.u = ot.a(integer4 / 90);
		Matrix4f.mul(matrix4f7, matrix4f6, this.s);
	}

	public Matrix4f a() {
		return this.s;
	}

	public cv a(cv cv) {
		cv cv3 = cv;

		for (int integer4 = 0; integer4 < this.t; integer4++) {
			cv3 = cv3.a(cv.a.X);
		}

		if (cv3.k() != cv.a.Y) {
			for (int integer4 = 0; integer4 < this.u; integer4++) {
				cv3 = cv3.a(cv.a.Y);
			}
		}

		return cv3;
	}

	public int a(cv cv, int integer) {
		int integer4 = integer;
		if (cv.k() == cv.a.X) {
			integer4 = (integer + this.t) % 4;
		}

		cv cv5 = cv;

		for (int integer6 = 0; integer6 < this.t; integer6++) {
			cv5 = cv5.a(cv.a.X);
		}

		if (cv5.k() == cv.a.Y) {
			integer4 = (integer4 + this.u) % 4;
		}

		return integer4;
	}

	public static cbi a(int integer1, int integer2) {
		return (cbi)q.get(b(ot.b(integer1, 360), ot.b(integer2, 360)));
	}

	static {
		for (cbi cbi4 : values()) {
			q.put(cbi4.r, cbi4);
		}
	}
}
