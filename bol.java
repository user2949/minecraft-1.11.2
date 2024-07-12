public class bol extends bou {
	private static final kq a = new kq("textures/particle/footprint.png");
	private int b;
	private final int L;
	private final bza M;

	protected bol(bza bza, ajs ajs, double double3, double double4, double double5) {
		super(ajs, double3, double4, double5, 0.0, 0.0, 0.0);
		this.M = bza;
		this.j = 0.0;
		this.k = 0.0;
		this.l = 0.0;
		this.L = 200;
	}

	@Override
	public void a(bpy bpy, sn sn, float float3, float float4, float float5, float float6, float float7, float float8) {
		float float10 = ((float)this.b + float3) / (float)this.L;
		float10 *= float10;
		float float11 = 2.0F - float10 * 2.0F;
		if (float11 > 1.0F) {
			float11 = 1.0F;
		}

		float11 *= 0.2F;
		bqg.g();
		float float12 = 0.125F;
		float float13 = (float)(this.g - H);
		float float14 = (float)(this.h - I);
		float float15 = (float)(this.i - J);
		float float16 = this.c.n(new co(this.g, this.h, this.i));
		this.M.a(a);
		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA);
		bpy.a(7, bzh.i);
		bpy.b((double)(float13 - 0.125F), (double)float14, (double)(float15 + 0.125F)).a(0.0, 1.0).a(float16, float16, float16, float11).d();
		bpy.b((double)(float13 + 0.125F), (double)float14, (double)(float15 + 0.125F)).a(1.0, 1.0).a(float16, float16, float16, float11).d();
		bpy.b((double)(float13 + 0.125F), (double)float14, (double)(float15 - 0.125F)).a(1.0, 0.0).a(float16, float16, float16, float11).d();
		bpy.b((double)(float13 - 0.125F), (double)float14, (double)(float15 - 0.125F)).a(0.0, 0.0).a(float16, float16, float16, float11).d();
		bqs.a().b();
		bqg.l();
		bqg.f();
	}

	@Override
	public void a() {
		this.b++;
		if (this.b == this.L) {
			this.i();
		}
	}

	@Override
	public int b() {
		return 3;
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bol(bes.z().N(), ajs, double3, double4, double5);
		}
	}
}
