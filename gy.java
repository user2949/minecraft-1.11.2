import java.io.IOException;

public class gy implements fm<fp> {
	private de a;
	private float b;
	private float c;
	private float d;
	private float e;
	private float f;
	private float g;
	private float h;
	private int i;
	private boolean j;
	private int[] k;

	public gy() {
	}

	public gy(de de, boolean boolean2, float float3, float float4, float float5, float float6, float float7, float float8, float float9, int integer, int... arr) {
		this.a = de;
		this.j = boolean2;
		this.b = float3;
		this.c = float4;
		this.d = float5;
		this.e = float6;
		this.f = float7;
		this.g = float8;
		this.h = float9;
		this.i = integer;
		this.k = arr;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = de.a(et.readInt());
		if (this.a == null) {
			this.a = de.BARRIER;
		}

		this.j = et.readBoolean();
		this.b = et.readFloat();
		this.c = et.readFloat();
		this.d = et.readFloat();
		this.e = et.readFloat();
		this.f = et.readFloat();
		this.g = et.readFloat();
		this.h = et.readFloat();
		this.i = et.readInt();
		int integer3 = this.a.d();
		this.k = new int[integer3];

		for (int integer4 = 0; integer4 < integer3; integer4++) {
			this.k[integer4] = et.g();
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.writeInt(this.a.c());
		et.writeBoolean(this.j);
		et.writeFloat(this.b);
		et.writeFloat(this.c);
		et.writeFloat(this.d);
		et.writeFloat(this.e);
		et.writeFloat(this.f);
		et.writeFloat(this.g);
		et.writeFloat(this.h);
		et.writeInt(this.i);
		int integer3 = this.a.d();

		for (int integer4 = 0; integer4 < integer3; integer4++) {
			et.d(this.k[integer4]);
		}
	}

	public de a() {
		return this.a;
	}

	public boolean b() {
		return this.j;
	}

	public double c() {
		return (double)this.b;
	}

	public double d() {
		return (double)this.c;
	}

	public double e() {
		return (double)this.d;
	}

	public float f() {
		return this.e;
	}

	public float g() {
		return this.f;
	}

	public float h() {
		return this.g;
	}

	public float i() {
		return this.h;
	}

	public int j() {
		return this.i;
	}

	public int[] k() {
		return this.k;
	}

	public void a(fp fp) {
		fp.a(this);
	}
}
