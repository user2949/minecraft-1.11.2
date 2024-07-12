import java.nio.FloatBuffer;

public class btm extends bto {
	private static final btm e = new btm();
	private final FloatBuffer f = ber.h(16);
	private final FloatBuffer g = ber.h(16);
	private final FloatBuffer h = ber.h(16);

	public static bto a() {
		e.b();
		return e;
	}

	private void a(float[] arr) {
		float float3 = ot.c(arr[0] * arr[0] + arr[1] * arr[1] + arr[2] * arr[2]);
		arr[0] /= float3;
		arr[1] /= float3;
		arr[2] /= float3;
		arr[3] /= float3;
	}

	public void b() {
		this.f.clear();
		this.g.clear();
		this.h.clear();
		bqg.c(2983, this.f);
		bqg.c(2982, this.g);
		float[] arr2 = this.b;
		float[] arr3 = this.c;
		this.f.flip().limit(16);
		this.f.get(arr2);
		this.g.flip().limit(16);
		this.g.get(arr3);
		this.d[0] = arr3[0] * arr2[0] + arr3[1] * arr2[4] + arr3[2] * arr2[8] + arr3[3] * arr2[12];
		this.d[1] = arr3[0] * arr2[1] + arr3[1] * arr2[5] + arr3[2] * arr2[9] + arr3[3] * arr2[13];
		this.d[2] = arr3[0] * arr2[2] + arr3[1] * arr2[6] + arr3[2] * arr2[10] + arr3[3] * arr2[14];
		this.d[3] = arr3[0] * arr2[3] + arr3[1] * arr2[7] + arr3[2] * arr2[11] + arr3[3] * arr2[15];
		this.d[4] = arr3[4] * arr2[0] + arr3[5] * arr2[4] + arr3[6] * arr2[8] + arr3[7] * arr2[12];
		this.d[5] = arr3[4] * arr2[1] + arr3[5] * arr2[5] + arr3[6] * arr2[9] + arr3[7] * arr2[13];
		this.d[6] = arr3[4] * arr2[2] + arr3[5] * arr2[6] + arr3[6] * arr2[10] + arr3[7] * arr2[14];
		this.d[7] = arr3[4] * arr2[3] + arr3[5] * arr2[7] + arr3[6] * arr2[11] + arr3[7] * arr2[15];
		this.d[8] = arr3[8] * arr2[0] + arr3[9] * arr2[4] + arr3[10] * arr2[8] + arr3[11] * arr2[12];
		this.d[9] = arr3[8] * arr2[1] + arr3[9] * arr2[5] + arr3[10] * arr2[9] + arr3[11] * arr2[13];
		this.d[10] = arr3[8] * arr2[2] + arr3[9] * arr2[6] + arr3[10] * arr2[10] + arr3[11] * arr2[14];
		this.d[11] = arr3[8] * arr2[3] + arr3[9] * arr2[7] + arr3[10] * arr2[11] + arr3[11] * arr2[15];
		this.d[12] = arr3[12] * arr2[0] + arr3[13] * arr2[4] + arr3[14] * arr2[8] + arr3[15] * arr2[12];
		this.d[13] = arr3[12] * arr2[1] + arr3[13] * arr2[5] + arr3[14] * arr2[9] + arr3[15] * arr2[13];
		this.d[14] = arr3[12] * arr2[2] + arr3[13] * arr2[6] + arr3[14] * arr2[10] + arr3[15] * arr2[14];
		this.d[15] = arr3[12] * arr2[3] + arr3[13] * arr2[7] + arr3[14] * arr2[11] + arr3[15] * arr2[15];
		float[] arr4 = this.a[0];
		arr4[0] = this.d[3] - this.d[0];
		arr4[1] = this.d[7] - this.d[4];
		arr4[2] = this.d[11] - this.d[8];
		arr4[3] = this.d[15] - this.d[12];
		this.a(arr4);
		float[] arr5 = this.a[1];
		arr5[0] = this.d[3] + this.d[0];
		arr5[1] = this.d[7] + this.d[4];
		arr5[2] = this.d[11] + this.d[8];
		arr5[3] = this.d[15] + this.d[12];
		this.a(arr5);
		float[] arr6 = this.a[2];
		arr6[0] = this.d[3] + this.d[1];
		arr6[1] = this.d[7] + this.d[5];
		arr6[2] = this.d[11] + this.d[9];
		arr6[3] = this.d[15] + this.d[13];
		this.a(arr6);
		float[] arr7 = this.a[3];
		arr7[0] = this.d[3] - this.d[1];
		arr7[1] = this.d[7] - this.d[5];
		arr7[2] = this.d[11] - this.d[9];
		arr7[3] = this.d[15] - this.d[13];
		this.a(arr7);
		float[] arr8 = this.a[4];
		arr8[0] = this.d[3] - this.d[2];
		arr8[1] = this.d[7] - this.d[6];
		arr8[2] = this.d[11] - this.d[10];
		arr8[3] = this.d[15] - this.d[14];
		this.a(arr8);
		float[] arr9 = this.a[5];
		arr9[0] = this.d[3] + this.d[2];
		arr9[1] = this.d[7] + this.d[6];
		arr9[2] = this.d[11] + this.d[10];
		arr9[3] = this.d[15] + this.d[14];
		this.a(arr9);
	}
}
