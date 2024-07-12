public class bfu extends ra {
	protected float h;
	protected long i;

	public bfu(gc gc) {
		super(gc.a(), gc.c(), gc.e(), gc.f());
		this.h = gc.d();
		this.b = gc.d();
		this.i = bes.I();
		this.a(gc.g());
		this.b(gc.h());
		this.c(gc.i());
	}

	@Override
	public void a(float float1) {
		this.b = this.f();
		this.h = float1;
		this.i = bes.I();
	}

	@Override
	public float f() {
		long long2 = bes.I() - this.i;
		float float4 = ot.a((float)long2 / 100.0F, 0.0F, 1.0F);
		return this.b + (this.h - this.b) * float4;
	}

	public void a(gc gc) {
		switch (gc.b()) {
			case UPDATE_NAME:
				this.a(gc.c());
				break;
			case UPDATE_PCT:
				this.a(gc.d());
				break;
			case UPDATE_STYLE:
				this.a(gc.e());
				this.a(gc.f());
				break;
			case UPDATE_PROPERTIES:
				this.a(gc.g());
				this.b(gc.h());
		}
	}
}
