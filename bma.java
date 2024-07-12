public class bma {
	public bms[] a;
	public int b;
	private boolean c;

	public bma(bms[] arr) {
		this.a = arr;
		this.b = arr.length;
	}

	public bma(bms[] arr, int integer2, int integer3, int integer4, int integer5, float float6, float float7) {
		this(arr);
		float float9 = 0.0F / float6;
		float float10 = 0.0F / float7;
		arr[0] = arr[0].a((float)integer4 / float6 - float9, (float)integer3 / float7 + float10);
		arr[1] = arr[1].a((float)integer2 / float6 + float9, (float)integer3 / float7 + float10);
		arr[2] = arr[2].a((float)integer2 / float6 + float9, (float)integer5 / float7 - float10);
		arr[3] = arr[3].a((float)integer4 / float6 - float9, (float)integer5 / float7 - float10);
	}

	public void a() {
		bms[] arr2 = new bms[this.a.length];

		for (int integer3 = 0; integer3 < this.a.length; integer3++) {
			arr2[integer3] = this.a[this.a.length - integer3 - 1];
		}

		this.a = arr2;
	}

	public void a(bpy bpy, float float2) {
		bdw bdw4 = this.a[1].a.a(this.a[0].a);
		bdw bdw5 = this.a[1].a.a(this.a[2].a);
		bdw bdw6 = bdw5.c(bdw4).a();
		float float7 = (float)bdw6.b;
		float float8 = (float)bdw6.c;
		float float9 = (float)bdw6.d;
		if (this.c) {
			float7 = -float7;
			float8 = -float8;
			float9 = -float9;
		}

		bpy.a(7, bzh.c);

		for (int integer10 = 0; integer10 < 4; integer10++) {
			bms bms11 = this.a[integer10];
			bpy.b(bms11.a.b * (double)float2, bms11.a.c * (double)float2, bms11.a.d * (double)float2).a((double)bms11.b, (double)bms11.c).c(float7, float8, float9).d();
		}

		bqs.a().b();
	}
}
