import java.io.IOException;

public class iz implements fm<im> {
	protected double a;
	protected double b;
	protected double c;
	protected float d;
	protected float e;
	protected boolean f;
	protected boolean g;
	protected boolean h;

	public iz() {
	}

	public iz(boolean boolean1) {
		this.f = boolean1;
	}

	public void a(im im) {
		im.a(this);
	}

	@Override
	public void a(et et) throws IOException {
		this.f = et.readUnsignedByte() != 0;
	}

	@Override
	public void b(et et) throws IOException {
		et.writeByte(this.f ? 1 : 0);
	}

	public double a(double double1) {
		return this.g ? this.a : double1;
	}

	public double b(double double1) {
		return this.g ? this.b : double1;
	}

	public double c(double double1) {
		return this.g ? this.c : double1;
	}

	public float a(float float1) {
		return this.h ? this.d : float1;
	}

	public float b(float float1) {
		return this.h ? this.e : float1;
	}

	public boolean a() {
		return this.f;
	}

	public static class a extends iz {
		public a() {
			this.g = true;
		}

		public a(double double1, double double2, double double3, boolean boolean4) {
			this.a = double1;
			this.b = double2;
			this.c = double3;
			this.f = boolean4;
			this.g = true;
		}

		@Override
		public void a(et et) throws IOException {
			this.a = et.readDouble();
			this.b = et.readDouble();
			this.c = et.readDouble();
			super.a(et);
		}

		@Override
		public void b(et et) throws IOException {
			et.writeDouble(this.a);
			et.writeDouble(this.b);
			et.writeDouble(this.c);
			super.b(et);
		}
	}

	public static class b extends iz {
		public b() {
			this.g = true;
			this.h = true;
		}

		public b(double double1, double double2, double double3, float float4, float float5, boolean boolean6) {
			this.a = double1;
			this.b = double2;
			this.c = double3;
			this.d = float4;
			this.e = float5;
			this.f = boolean6;
			this.h = true;
			this.g = true;
		}

		@Override
		public void a(et et) throws IOException {
			this.a = et.readDouble();
			this.b = et.readDouble();
			this.c = et.readDouble();
			this.d = et.readFloat();
			this.e = et.readFloat();
			super.a(et);
		}

		@Override
		public void b(et et) throws IOException {
			et.writeDouble(this.a);
			et.writeDouble(this.b);
			et.writeDouble(this.c);
			et.writeFloat(this.d);
			et.writeFloat(this.e);
			super.b(et);
		}
	}

	public static class c extends iz {
		public c() {
			this.h = true;
		}

		public c(float float1, float float2, boolean boolean3) {
			this.d = float1;
			this.e = float2;
			this.f = boolean3;
			this.h = true;
		}

		@Override
		public void a(et et) throws IOException {
			this.d = et.readFloat();
			this.e = et.readFloat();
			super.a(et);
		}

		@Override
		public void b(et et) throws IOException {
			et.writeFloat(this.d);
			et.writeFloat(this.e);
			super.b(et);
		}
	}
}
