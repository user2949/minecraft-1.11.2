import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.util.vector.Matrix4f;

public class byl {
	private static final Logger a = LogManager.getLogger();
	private int b;
	private final int c;
	private final int d;
	private final IntBuffer e;
	private final FloatBuffer f;
	private final String g;
	private boolean h;
	private final byg i;

	public byl(String string, int integer2, int integer3, byg byg) {
		this.g = string;
		this.c = integer3;
		this.d = integer2;
		this.i = byg;
		if (integer2 <= 3) {
			this.e = BufferUtils.createIntBuffer(integer3);
			this.f = null;
		} else {
			this.e = null;
			this.f = BufferUtils.createFloatBuffer(integer3);
		}

		this.b = -1;
		this.h();
	}

	private void h() {
		this.h = true;
		if (this.i != null) {
			this.i.d();
		}
	}

	public static int a(String string) {
		int integer2 = -1;
		if ("int".equals(string)) {
			integer2 = 0;
		} else if ("float".equals(string)) {
			integer2 = 4;
		} else if (string.startsWith("matrix")) {
			if (string.endsWith("2x2")) {
				integer2 = 8;
			} else if (string.endsWith("3x3")) {
				integer2 = 9;
			} else if (string.endsWith("4x4")) {
				integer2 = 10;
			}
		}

		return integer2;
	}

	public void b(int integer) {
		this.b = integer;
	}

	public String a() {
		return this.g;
	}

	public void a(float float1) {
		this.f.position(0);
		this.f.put(0, float1);
		this.h();
	}

	public void a(float float1, float float2) {
		this.f.position(0);
		this.f.put(0, float1);
		this.f.put(1, float2);
		this.h();
	}

	public void a(float float1, float float2, float float3) {
		this.f.position(0);
		this.f.put(0, float1);
		this.f.put(1, float2);
		this.f.put(2, float3);
		this.h();
	}

	public void a(float float1, float float2, float float3, float float4) {
		this.f.position(0);
		this.f.put(float1);
		this.f.put(float2);
		this.f.put(float3);
		this.f.put(float4);
		this.f.flip();
		this.h();
	}

	public void b(float float1, float float2, float float3, float float4) {
		this.f.position(0);
		if (this.d >= 4) {
			this.f.put(0, float1);
		}

		if (this.d >= 5) {
			this.f.put(1, float2);
		}

		if (this.d >= 6) {
			this.f.put(2, float3);
		}

		if (this.d >= 7) {
			this.f.put(3, float4);
		}

		this.h();
	}

	public void a(int integer1, int integer2, int integer3, int integer4) {
		this.e.position(0);
		if (this.d >= 0) {
			this.e.put(0, integer1);
		}

		if (this.d >= 1) {
			this.e.put(1, integer2);
		}

		if (this.d >= 2) {
			this.e.put(2, integer3);
		}

		if (this.d >= 3) {
			this.e.put(3, integer4);
		}

		this.h();
	}

	public void a(float[] arr) {
		if (arr.length < this.c) {
			a.warn("Uniform.set called with a too-small value array (expected {}, got {}). Ignoring.", new Object[]{this.c, arr.length});
		} else {
			this.f.position(0);
			this.f.put(arr);
			this.f.position(0);
			this.h();
		}
	}

	public void a(
		float float1,
		float float2,
		float float3,
		float float4,
		float float5,
		float float6,
		float float7,
		float float8,
		float float9,
		float float10,
		float float11,
		float float12,
		float float13,
		float float14,
		float float15,
		float float16
	) {
		this.f.position(0);
		this.f.put(0, float1);
		this.f.put(1, float2);
		this.f.put(2, float3);
		this.f.put(3, float4);
		this.f.put(4, float5);
		this.f.put(5, float6);
		this.f.put(6, float7);
		this.f.put(7, float8);
		this.f.put(8, float9);
		this.f.put(9, float10);
		this.f.put(10, float11);
		this.f.put(11, float12);
		this.f.put(12, float13);
		this.f.put(13, float14);
		this.f.put(14, float15);
		this.f.put(15, float16);
		this.h();
	}

	public void a(Matrix4f matrix4f) {
		this.a(
			matrix4f.m00,
			matrix4f.m01,
			matrix4f.m02,
			matrix4f.m03,
			matrix4f.m10,
			matrix4f.m11,
			matrix4f.m12,
			matrix4f.m13,
			matrix4f.m20,
			matrix4f.m21,
			matrix4f.m22,
			matrix4f.m23,
			matrix4f.m30,
			matrix4f.m31,
			matrix4f.m32,
			matrix4f.m33
		);
	}

	public void b() {
		if (!this.h) {
		}

		this.h = false;
		if (this.d <= 3) {
			this.i();
		} else if (this.d <= 7) {
			this.j();
		} else {
			if (this.d > 10) {
				a.warn("Uniform.upload called, but type value ({}) is not a valid type. Ignoring.", new Object[]{this.d});
				return;
			}

			this.k();
		}
	}

	private void i() {
		switch (this.d) {
			case 0:
				cdb.a(this.b, this.e);
				break;
			case 1:
				cdb.b(this.b, this.e);
				break;
			case 2:
				cdb.c(this.b, this.e);
				break;
			case 3:
				cdb.d(this.b, this.e);
				break;
			default:
				a.warn("Uniform.upload called, but count value ({}) is  not in the range of 1 to 4. Ignoring.", new Object[]{this.c});
		}
	}

	private void j() {
		switch (this.d) {
			case 4:
				cdb.a(this.b, this.f);
				break;
			case 5:
				cdb.b(this.b, this.f);
				break;
			case 6:
				cdb.c(this.b, this.f);
				break;
			case 7:
				cdb.d(this.b, this.f);
				break;
			default:
				a.warn("Uniform.upload called, but count value ({}) is not in the range of 1 to 4. Ignoring.", new Object[]{this.c});
		}
	}

	private void k() {
		switch (this.d) {
			case 8:
				cdb.a(this.b, true, this.f);
				break;
			case 9:
				cdb.b(this.b, true, this.f);
				break;
			case 10:
				cdb.c(this.b, true, this.f);
		}
	}
}
