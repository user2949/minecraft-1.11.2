import javax.annotation.Nullable;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public class brl {
	private static final float a = 1.0F / (float)Math.cos((float) (Math.PI / 8)) - 1.0F;
	private static final float b = 1.0F / (float)Math.cos((float) (Math.PI / 4)) - 1.0F;
	private static final brl.a[] c = new brl.a[cbi.values().length * cv.values().length];
	private static final brl.a d = new brl.a() {
		@Override
		brh a(float float1, float float2, float float3, float float4) {
			return new brh(new float[]{float1, float2, float3, float4}, 0);
		}
	};
	private static final brl.a e = new brl.a() {
		@Override
		brh a(float float1, float float2, float float3, float float4) {
			return new brh(new float[]{float4, 16.0F - float1, float2, 16.0F - float3}, 270);
		}
	};
	private static final brl.a f = new brl.a() {
		@Override
		brh a(float float1, float float2, float float3, float float4) {
			return new brh(new float[]{16.0F - float1, 16.0F - float2, 16.0F - float3, 16.0F - float4}, 0);
		}
	};
	private static final brl.a g = new brl.a() {
		@Override
		brh a(float float1, float float2, float float3, float float4) {
			return new brh(new float[]{16.0F - float2, float3, 16.0F - float4, float1}, 90);
		}
	};

	public brd a(Vector3f vector3f1, Vector3f vector3f2, brf brf, byz byz, cv cv, cbi cbi, @Nullable brg brg, boolean boolean8, boolean boolean9) {
		brh brh11 = brf.e;
		if (boolean8) {
			brh11 = this.a(brf.e, cv, cbi);
		}

		int[] arr12 = this.a(brh11, byz, cv, this.a(vector3f1, vector3f2), cbi, brg, boolean9);
		cv cv13 = a(arr12);
		if (brg == null) {
			this.a(arr12, cv13);
		}

		return new brd(arr12, brf.c, cv13, byz);
	}

	private brh a(brh brh, cv cv, cbi cbi) {
		return c[a(cbi, cv)].a(brh);
	}

	private int[] a(brh brh, byz byz, cv cv, float[] arr, cbi cbi, @Nullable brg brg, boolean boolean7) {
		int[] arr9 = new int[28];

		for (int integer10 = 0; integer10 < 4; integer10++) {
			this.a(arr9, integer10, cv, brh, arr, byz, cbi, brg, boolean7);
		}

		return arr9;
	}

	private int a(cv cv) {
		float float3 = this.b(cv);
		int integer4 = ot.a((int)(float3 * 255.0F), 0, 255);
		return 0xFF000000 | integer4 << 16 | integer4 << 8 | integer4;
	}

	private float b(cv cv) {
		switch (cv) {
			case DOWN:
				return 0.5F;
			case UP:
				return 1.0F;
			case NORTH:
			case SOUTH:
				return 0.8F;
			case WEST:
			case EAST:
				return 0.6F;
			default:
				return 1.0F;
		}
	}

	private float[] a(Vector3f vector3f1, Vector3f vector3f2) {
		float[] arr4 = new float[cv.values().length];
		arr4[bqd.a.f] = vector3f1.x / 16.0F;
		arr4[bqd.a.e] = vector3f1.y / 16.0F;
		arr4[bqd.a.d] = vector3f1.z / 16.0F;
		arr4[bqd.a.c] = vector3f2.x / 16.0F;
		arr4[bqd.a.b] = vector3f2.y / 16.0F;
		arr4[bqd.a.a] = vector3f2.z / 16.0F;
		return arr4;
	}

	private void a(int[] arr, int integer, cv cv, brh brh, float[] arr, byz byz, cbi cbi, @Nullable brg brg, boolean boolean9) {
		cv cv11 = cbi.a(cv);
		int integer12 = boolean9 ? this.a(cv11) : -1;
		bqd.b b13 = bqd.a(cv).a(integer);
		Vector3f vector3f14 = new Vector3f(arr[b13.a], arr[b13.b], arr[b13.c]);
		this.a(vector3f14, brg);
		int integer15 = this.a(vector3f14, cv, integer, cbi);
		this.a(arr, integer15, integer, vector3f14, integer12, byz, brh);
	}

	private void a(int[] arr, int integer2, int integer3, Vector3f vector3f, int integer5, byz byz, brh brh) {
		int integer9 = integer2 * 7;
		arr[integer9] = Float.floatToRawIntBits(vector3f.x);
		arr[integer9 + 1] = Float.floatToRawIntBits(vector3f.y);
		arr[integer9 + 2] = Float.floatToRawIntBits(vector3f.z);
		arr[integer9 + 3] = integer5;
		arr[integer9 + 4] = Float.floatToRawIntBits(byz.a((double)brh.a(integer3)));
		arr[integer9 + 4 + 1] = Float.floatToRawIntBits(byz.b((double)brh.b(integer3)));
	}

	private void a(Vector3f vector3f, @Nullable brg brg) {
		if (brg != null) {
			Matrix4f matrix4f4 = this.a();
			Vector3f vector3f5 = new Vector3f(0.0F, 0.0F, 0.0F);
			switch (brg.b) {
				case X:
					Matrix4f.rotate(brg.c * (float) (Math.PI / 180.0), new Vector3f(1.0F, 0.0F, 0.0F), matrix4f4, matrix4f4);
					vector3f5.set(0.0F, 1.0F, 1.0F);
					break;
				case Y:
					Matrix4f.rotate(brg.c * (float) (Math.PI / 180.0), new Vector3f(0.0F, 1.0F, 0.0F), matrix4f4, matrix4f4);
					vector3f5.set(1.0F, 0.0F, 1.0F);
					break;
				case Z:
					Matrix4f.rotate(brg.c * (float) (Math.PI / 180.0), new Vector3f(0.0F, 0.0F, 1.0F), matrix4f4, matrix4f4);
					vector3f5.set(1.0F, 1.0F, 0.0F);
			}

			if (brg.d) {
				if (Math.abs(brg.c) == 22.5F) {
					vector3f5.scale(a);
				} else {
					vector3f5.scale(b);
				}

				Vector3f.add(vector3f5, new Vector3f(1.0F, 1.0F, 1.0F), vector3f5);
			} else {
				vector3f5.set(1.0F, 1.0F, 1.0F);
			}

			this.a(vector3f, new Vector3f(brg.a), matrix4f4, vector3f5);
		}
	}

	public int a(Vector3f vector3f, cv cv, int integer, cbi cbi) {
		if (cbi == cbi.X0_Y0) {
			return integer;
		} else {
			this.a(vector3f, new Vector3f(0.5F, 0.5F, 0.5F), cbi.a(), new Vector3f(1.0F, 1.0F, 1.0F));
			return cbi.a(cv, integer);
		}
	}

	private void a(Vector3f vector3f1, Vector3f vector3f2, Matrix4f matrix4f, Vector3f vector3f4) {
		Vector4f vector4f6 = new Vector4f(vector3f1.x - vector3f2.x, vector3f1.y - vector3f2.y, vector3f1.z - vector3f2.z, 1.0F);
		Matrix4f.transform(matrix4f, vector4f6, vector4f6);
		vector4f6.x = vector4f6.x * vector3f4.x;
		vector4f6.y = vector4f6.y * vector3f4.y;
		vector4f6.z = vector4f6.z * vector3f4.z;
		vector3f1.set(vector4f6.x + vector3f2.x, vector4f6.y + vector3f2.y, vector4f6.z + vector3f2.z);
	}

	private Matrix4f a() {
		Matrix4f matrix4f2 = new Matrix4f();
		matrix4f2.setIdentity();
		return matrix4f2;
	}

	public static cv a(int[] arr) {
		Vector3f vector3f2 = new Vector3f(Float.intBitsToFloat(arr[0]), Float.intBitsToFloat(arr[1]), Float.intBitsToFloat(arr[2]));
		Vector3f vector3f3 = new Vector3f(Float.intBitsToFloat(arr[7]), Float.intBitsToFloat(arr[8]), Float.intBitsToFloat(arr[9]));
		Vector3f vector3f4 = new Vector3f(Float.intBitsToFloat(arr[14]), Float.intBitsToFloat(arr[15]), Float.intBitsToFloat(arr[16]));
		Vector3f vector3f5 = new Vector3f();
		Vector3f vector3f6 = new Vector3f();
		Vector3f vector3f7 = new Vector3f();
		Vector3f.sub(vector3f2, vector3f3, vector3f5);
		Vector3f.sub(vector3f4, vector3f3, vector3f6);
		Vector3f.cross(vector3f6, vector3f5, vector3f7);
		float float8 = (float)Math.sqrt((double)(vector3f7.x * vector3f7.x + vector3f7.y * vector3f7.y + vector3f7.z * vector3f7.z));
		vector3f7.x /= float8;
		vector3f7.y /= float8;
		vector3f7.z /= float8;
		cv cv9 = null;
		float float10 = 0.0F;

		for (cv cv14 : cv.values()) {
			dl dl15 = cv14.n();
			Vector3f vector3f16 = new Vector3f((float)dl15.p(), (float)dl15.q(), (float)dl15.r());
			float float17 = Vector3f.dot(vector3f7, vector3f16);
			if (float17 >= 0.0F && float17 > float10) {
				float10 = float17;
				cv9 = cv14;
			}
		}

		return cv9 == null ? cv.UP : cv9;
	}

	private void a(int[] arr, cv cv) {
		int[] arr4 = new int[arr.length];
		System.arraycopy(arr, 0, arr4, 0, arr.length);
		float[] arr5 = new float[cv.values().length];
		arr5[bqd.a.f] = 999.0F;
		arr5[bqd.a.e] = 999.0F;
		arr5[bqd.a.d] = 999.0F;
		arr5[bqd.a.c] = -999.0F;
		arr5[bqd.a.b] = -999.0F;
		arr5[bqd.a.a] = -999.0F;

		for (int integer6 = 0; integer6 < 4; integer6++) {
			int integer7 = 7 * integer6;
			float float8 = Float.intBitsToFloat(arr4[integer7]);
			float float9 = Float.intBitsToFloat(arr4[integer7 + 1]);
			float float10 = Float.intBitsToFloat(arr4[integer7 + 2]);
			if (float8 < arr5[bqd.a.f]) {
				arr5[bqd.a.f] = float8;
			}

			if (float9 < arr5[bqd.a.e]) {
				arr5[bqd.a.e] = float9;
			}

			if (float10 < arr5[bqd.a.d]) {
				arr5[bqd.a.d] = float10;
			}

			if (float8 > arr5[bqd.a.c]) {
				arr5[bqd.a.c] = float8;
			}

			if (float9 > arr5[bqd.a.b]) {
				arr5[bqd.a.b] = float9;
			}

			if (float10 > arr5[bqd.a.a]) {
				arr5[bqd.a.a] = float10;
			}
		}

		bqd bqd6 = bqd.a(cv);

		for (int integer7x = 0; integer7x < 4; integer7x++) {
			int integer8 = 7 * integer7x;
			bqd.b b9 = bqd6.a(integer7x);
			float float10x = arr5[b9.a];
			float float11 = arr5[b9.b];
			float float12 = arr5[b9.c];
			arr[integer8] = Float.floatToRawIntBits(float10x);
			arr[integer8 + 1] = Float.floatToRawIntBits(float11);
			arr[integer8 + 2] = Float.floatToRawIntBits(float12);

			for (int integer13 = 0; integer13 < 4; integer13++) {
				int integer14 = 7 * integer13;
				float float15 = Float.intBitsToFloat(arr4[integer14]);
				float float16 = Float.intBitsToFloat(arr4[integer14 + 1]);
				float float17 = Float.intBitsToFloat(arr4[integer14 + 2]);
				if (ot.a(float10x, float15) && ot.a(float11, float16) && ot.a(float12, float17)) {
					arr[integer8 + 4] = arr4[integer14 + 4];
					arr[integer8 + 4 + 1] = arr4[integer14 + 4 + 1];
				}
			}
		}
	}

	private static void a(cbi cbi, cv cv, brl.a a) {
		c[a(cbi, cv)] = a;
	}

	private static int a(cbi cbi, cv cv) {
		return cbi.values().length * cv.ordinal() + cbi.ordinal();
	}

	static {
		a(cbi.X0_Y0, cv.DOWN, d);
		a(cbi.X0_Y0, cv.EAST, d);
		a(cbi.X0_Y0, cv.NORTH, d);
		a(cbi.X0_Y0, cv.SOUTH, d);
		a(cbi.X0_Y0, cv.UP, d);
		a(cbi.X0_Y0, cv.WEST, d);
		a(cbi.X0_Y90, cv.EAST, d);
		a(cbi.X0_Y90, cv.NORTH, d);
		a(cbi.X0_Y90, cv.SOUTH, d);
		a(cbi.X0_Y90, cv.WEST, d);
		a(cbi.X0_Y180, cv.EAST, d);
		a(cbi.X0_Y180, cv.NORTH, d);
		a(cbi.X0_Y180, cv.SOUTH, d);
		a(cbi.X0_Y180, cv.WEST, d);
		a(cbi.X0_Y270, cv.EAST, d);
		a(cbi.X0_Y270, cv.NORTH, d);
		a(cbi.X0_Y270, cv.SOUTH, d);
		a(cbi.X0_Y270, cv.WEST, d);
		a(cbi.X90_Y0, cv.DOWN, d);
		a(cbi.X90_Y0, cv.SOUTH, d);
		a(cbi.X90_Y90, cv.DOWN, d);
		a(cbi.X90_Y180, cv.DOWN, d);
		a(cbi.X90_Y180, cv.NORTH, d);
		a(cbi.X90_Y270, cv.DOWN, d);
		a(cbi.X180_Y0, cv.DOWN, d);
		a(cbi.X180_Y0, cv.UP, d);
		a(cbi.X270_Y0, cv.SOUTH, d);
		a(cbi.X270_Y0, cv.UP, d);
		a(cbi.X270_Y90, cv.UP, d);
		a(cbi.X270_Y180, cv.NORTH, d);
		a(cbi.X270_Y180, cv.UP, d);
		a(cbi.X270_Y270, cv.UP, d);
		a(cbi.X0_Y270, cv.UP, e);
		a(cbi.X0_Y90, cv.DOWN, e);
		a(cbi.X90_Y0, cv.WEST, e);
		a(cbi.X90_Y90, cv.WEST, e);
		a(cbi.X90_Y180, cv.WEST, e);
		a(cbi.X90_Y270, cv.NORTH, e);
		a(cbi.X90_Y270, cv.SOUTH, e);
		a(cbi.X90_Y270, cv.WEST, e);
		a(cbi.X180_Y90, cv.UP, e);
		a(cbi.X180_Y270, cv.DOWN, e);
		a(cbi.X270_Y0, cv.EAST, e);
		a(cbi.X270_Y90, cv.EAST, e);
		a(cbi.X270_Y90, cv.NORTH, e);
		a(cbi.X270_Y90, cv.SOUTH, e);
		a(cbi.X270_Y180, cv.EAST, e);
		a(cbi.X270_Y270, cv.EAST, e);
		a(cbi.X0_Y180, cv.DOWN, f);
		a(cbi.X0_Y180, cv.UP, f);
		a(cbi.X90_Y0, cv.NORTH, f);
		a(cbi.X90_Y0, cv.UP, f);
		a(cbi.X90_Y90, cv.UP, f);
		a(cbi.X90_Y180, cv.SOUTH, f);
		a(cbi.X90_Y180, cv.UP, f);
		a(cbi.X90_Y270, cv.UP, f);
		a(cbi.X180_Y0, cv.EAST, f);
		a(cbi.X180_Y0, cv.NORTH, f);
		a(cbi.X180_Y0, cv.SOUTH, f);
		a(cbi.X180_Y0, cv.WEST, f);
		a(cbi.X180_Y90, cv.EAST, f);
		a(cbi.X180_Y90, cv.NORTH, f);
		a(cbi.X180_Y90, cv.SOUTH, f);
		a(cbi.X180_Y90, cv.WEST, f);
		a(cbi.X180_Y180, cv.DOWN, f);
		a(cbi.X180_Y180, cv.EAST, f);
		a(cbi.X180_Y180, cv.NORTH, f);
		a(cbi.X180_Y180, cv.SOUTH, f);
		a(cbi.X180_Y180, cv.UP, f);
		a(cbi.X180_Y180, cv.WEST, f);
		a(cbi.X180_Y270, cv.EAST, f);
		a(cbi.X180_Y270, cv.NORTH, f);
		a(cbi.X180_Y270, cv.SOUTH, f);
		a(cbi.X180_Y270, cv.WEST, f);
		a(cbi.X270_Y0, cv.DOWN, f);
		a(cbi.X270_Y0, cv.NORTH, f);
		a(cbi.X270_Y90, cv.DOWN, f);
		a(cbi.X270_Y180, cv.DOWN, f);
		a(cbi.X270_Y180, cv.SOUTH, f);
		a(cbi.X270_Y270, cv.DOWN, f);
		a(cbi.X0_Y90, cv.UP, g);
		a(cbi.X0_Y270, cv.DOWN, g);
		a(cbi.X90_Y0, cv.EAST, g);
		a(cbi.X90_Y90, cv.EAST, g);
		a(cbi.X90_Y90, cv.NORTH, g);
		a(cbi.X90_Y90, cv.SOUTH, g);
		a(cbi.X90_Y180, cv.EAST, g);
		a(cbi.X90_Y270, cv.EAST, g);
		a(cbi.X270_Y0, cv.WEST, g);
		a(cbi.X180_Y90, cv.DOWN, g);
		a(cbi.X180_Y270, cv.UP, g);
		a(cbi.X270_Y90, cv.WEST, g);
		a(cbi.X270_Y180, cv.WEST, g);
		a(cbi.X270_Y270, cv.NORTH, g);
		a(cbi.X270_Y270, cv.SOUTH, g);
		a(cbi.X270_Y270, cv.WEST, g);
	}

	abstract static class a {
		private a() {
		}

		public brh a(brh brh) {
			float float3 = brh.a(brh.c(0));
			float float4 = brh.b(brh.c(0));
			float float5 = brh.a(brh.c(2));
			float float6 = brh.b(brh.c(2));
			return this.a(float3, float4, float5, float6);
		}

		abstract brh a(float float1, float float2, float float3, float float4);
	}
}
