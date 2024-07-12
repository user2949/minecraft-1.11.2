public class di {
	protected final float a;
	protected final float b;
	protected final float c;

	public di(float float1, float float2, float float3) {
		this.a = float1;
		this.b = float2;
		this.c = float3;
	}

	public di(ea ea) {
		this.a = ea.f(0);
		this.b = ea.f(1);
		this.c = ea.f(2);
	}

	public ea a() {
		ea ea2 = new ea();
		ea2.a(new dx(this.a));
		ea2.a(new dx(this.b));
		ea2.a(new dx(this.c));
		return ea2;
	}

	public boolean equals(Object object) {
		if (!(object instanceof di)) {
			return false;
		} else {
			di di3 = (di)object;
			return this.a == di3.a && this.b == di3.b && this.c == di3.c;
		}
	}

	public float b() {
		return this.a;
	}

	public float c() {
		return this.b;
	}

	public float d() {
		return this.c;
	}
}
