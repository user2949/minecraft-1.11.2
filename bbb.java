public class bbb {
	public final int a;
	public final int b;
	public final int c;
	private final int n;
	public int d = -1;
	public float e;
	public float f;
	public float g;
	public bbb h;
	public boolean i;
	public float j;
	public float k;
	public float l;
	public bba m = bba.BLOCKED;

	public bbb(int integer1, int integer2, int integer3) {
		this.a = integer1;
		this.b = integer2;
		this.c = integer3;
		this.n = b(integer1, integer2, integer3);
	}

	public bbb a(int integer1, int integer2, int integer3) {
		bbb bbb5 = new bbb(integer1, integer2, integer3);
		bbb5.d = this.d;
		bbb5.e = this.e;
		bbb5.f = this.f;
		bbb5.g = this.g;
		bbb5.h = this.h;
		bbb5.i = this.i;
		bbb5.j = this.j;
		bbb5.k = this.k;
		bbb5.l = this.l;
		bbb5.m = this.m;
		return bbb5;
	}

	public static int b(int integer1, int integer2, int integer3) {
		return integer2 & 0xFF | (integer1 & 32767) << 8 | (integer3 & 32767) << 24 | (integer1 < 0 ? Integer.MIN_VALUE : 0) | (integer3 < 0 ? 32768 : 0);
	}

	public float a(bbb bbb) {
		float float3 = (float)(bbb.a - this.a);
		float float4 = (float)(bbb.b - this.b);
		float float5 = (float)(bbb.c - this.c);
		return ot.c(float3 * float3 + float4 * float4 + float5 * float5);
	}

	public float b(bbb bbb) {
		float float3 = (float)(bbb.a - this.a);
		float float4 = (float)(bbb.b - this.b);
		float float5 = (float)(bbb.c - this.c);
		return float3 * float3 + float4 * float4 + float5 * float5;
	}

	public float c(bbb bbb) {
		float float3 = (float)Math.abs(bbb.a - this.a);
		float float4 = (float)Math.abs(bbb.b - this.b);
		float float5 = (float)Math.abs(bbb.c - this.c);
		return float3 + float4 + float5;
	}

	public boolean equals(Object object) {
		if (!(object instanceof bbb)) {
			return false;
		} else {
			bbb bbb3 = (bbb)object;
			return this.n == bbb3.n && this.a == bbb3.a && this.b == bbb3.b && this.c == bbb3.c;
		}
	}

	public int hashCode() {
		return this.n;
	}

	public boolean a() {
		return this.d >= 0;
	}

	public String toString() {
		return this.a + ", " + this.b + ", " + this.c;
	}

	public static bbb b(et et) {
		bbb bbb2 = new bbb(et.readInt(), et.readInt(), et.readInt());
		bbb2.j = et.readFloat();
		bbb2.k = et.readFloat();
		bbb2.l = et.readFloat();
		bbb2.i = et.readBoolean();
		bbb2.m = bba.values()[et.readInt()];
		bbb2.g = et.readFloat();
		return bbb2;
	}
}
