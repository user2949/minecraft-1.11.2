public class bng {
	private final bms[] h;
	private final bma[] i;
	public final float a;
	public final float b;
	public final float c;
	public final float d;
	public final float e;
	public final float f;
	public String g;

	public bng(bni bni, int integer2, int integer3, float float4, float float5, float float6, int integer7, int integer8, int integer9, float float10) {
		this(bni, integer2, integer3, float4, float5, float6, integer7, integer8, integer9, float10, bni.i);
	}

	public bng(
		bni bni, int integer2, int integer3, float float4, float float5, float float6, int integer7, int integer8, int integer9, float float10, boolean boolean11
	) {
		this.a = float4;
		this.b = float5;
		this.c = float6;
		this.d = float4 + (float)integer7;
		this.e = float5 + (float)integer8;
		this.f = float6 + (float)integer9;
		this.h = new bms[8];
		this.i = new bma[6];
		float float13 = float4 + (float)integer7;
		float float14 = float5 + (float)integer8;
		float float15 = float6 + (float)integer9;
		float4 -= float10;
		float5 -= float10;
		float6 -= float10;
		float13 += float10;
		float14 += float10;
		float15 += float10;
		if (boolean11) {
			float float16 = float13;
			float13 = float4;
			float4 = float16;
		}

		bms bms16 = new bms(float4, float5, float6, 0.0F, 0.0F);
		bms bms17 = new bms(float13, float5, float6, 0.0F, 8.0F);
		bms bms18 = new bms(float13, float14, float6, 8.0F, 8.0F);
		bms bms19 = new bms(float4, float14, float6, 8.0F, 0.0F);
		bms bms20 = new bms(float4, float5, float15, 0.0F, 0.0F);
		bms bms21 = new bms(float13, float5, float15, 0.0F, 8.0F);
		bms bms22 = new bms(float13, float14, float15, 8.0F, 8.0F);
		bms bms23 = new bms(float4, float14, float15, 8.0F, 0.0F);
		this.h[0] = bms16;
		this.h[1] = bms17;
		this.h[2] = bms18;
		this.h[3] = bms19;
		this.h[4] = bms20;
		this.h[5] = bms21;
		this.h[6] = bms22;
		this.h[7] = bms23;
		this.i[0] = new bma(
			new bms[]{bms21, bms17, bms18, bms22},
			integer2 + integer9 + integer7,
			integer3 + integer9,
			integer2 + integer9 + integer7 + integer9,
			integer3 + integer9 + integer8,
			bni.a,
			bni.b
		);
		this.i[1] = new bma(new bms[]{bms16, bms20, bms23, bms19}, integer2, integer3 + integer9, integer2 + integer9, integer3 + integer9 + integer8, bni.a, bni.b);
		this.i[2] = new bma(new bms[]{bms21, bms20, bms16, bms17}, integer2 + integer9, integer3, integer2 + integer9 + integer7, integer3 + integer9, bni.a, bni.b);
		this.i[3] = new bma(
			new bms[]{bms18, bms19, bms23, bms22},
			integer2 + integer9 + integer7,
			integer3 + integer9,
			integer2 + integer9 + integer7 + integer7,
			integer3,
			bni.a,
			bni.b
		);
		this.i[4] = new bma(
			new bms[]{bms17, bms16, bms19, bms18},
			integer2 + integer9,
			integer3 + integer9,
			integer2 + integer9 + integer7,
			integer3 + integer9 + integer8,
			bni.a,
			bni.b
		);
		this.i[5] = new bma(
			new bms[]{bms20, bms21, bms22, bms23},
			integer2 + integer9 + integer7 + integer9,
			integer3 + integer9,
			integer2 + integer9 + integer7 + integer9 + integer7,
			integer3 + integer9 + integer8,
			bni.a,
			bni.b
		);
		if (boolean11) {
			for (bma bma27 : this.i) {
				bma27.a();
			}
		}
	}

	public void a(bpy bpy, float float2) {
		for (bma bma7 : this.i) {
			bma7.a(bpy, float2);
		}
	}

	public bng a(String string) {
		this.g = string;
		return this;
	}
}
