import javax.annotation.Nullable;

public abstract class avf {
	public static final float[] a = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
	protected ajs b;
	private ajx h;
	private String i;
	protected akj c;
	protected boolean d;
	protected boolean e;
	protected boolean f;
	protected final float[] g = new float[16];
	private final float[] j = new float[4];

	public final void a(ajs ajs) {
		this.b = ajs;
		this.h = ajs.T().t();
		this.i = ajs.T().A();
		this.b();
		this.a();
	}

	protected void a() {
		float float2 = 0.0F;

		for (int integer3 = 0; integer3 <= 15; integer3++) {
			float float4 = 1.0F - (float)integer3 / 15.0F;
			this.g[integer3] = (1.0F - float4) / (float4 * 3.0F + 1.0F) * 1.0F + 0.0F;
		}
	}

	protected void b() {
		this.f = true;
		ajx ajx2 = this.b.T().t();
		if (ajx2 == ajx.c) {
			axu axu3 = axu.a(this.b.T().A());
			this.c = new ako(akf.a(axu3.a(), akk.b));
		} else if (ajx2 == ajx.g) {
			this.c = new ako(akk.c);
		} else {
			this.c = new akj(this.b.T());
		}
	}

	public aui c() {
		if (this.h == ajx.c) {
			return new avs(this.b, this.b.O(), this.b.T().r(), this.i);
		} else if (this.h == ajx.g) {
			return new avr(this.b);
		} else {
			return this.h == ajx.f ? new avx(this.b, this.b.O(), this.b.T().r(), this.i) : new avx(this.b, this.b.O(), this.b.T().r(), this.i);
		}
	}

	public boolean a(int integer1, int integer2) {
		co co4 = new co(integer1, 0, integer2);
		return this.b.b(co4).i() ? true : this.b.c(co4).v() == alv.c;
	}

	public float a(long long1, float float2) {
		int integer5 = (int)(long1 % 24000L);
		float float6 = ((float)integer5 + float2) / 24000.0F - 0.25F;
		if (float6 < 0.0F) {
			float6++;
		}

		if (float6 > 1.0F) {
			float6--;
		}

		float var7 = 1.0F - (float)((Math.cos((double)float6 * Math.PI) + 1.0) / 2.0);
		return float6 + (var7 - float6) / 3.0F;
	}

	public int a(long long1) {
		return (int)(long1 / 24000L % 8L + 8L) % 8;
	}

	public boolean d() {
		return true;
	}

	@Nullable
	public float[] a(float float1, float float2) {
		float float4 = 0.4F;
		float float5 = ot.b(float1 * (float) (Math.PI * 2)) - 0.0F;
		float float6 = -0.0F;
		if (float5 >= -0.4F && float5 <= 0.4F) {
			float float7 = (float5 - -0.0F) / 0.4F * 0.5F + 0.5F;
			float float8 = 1.0F - (1.0F - ot.a(float7 * (float) Math.PI)) * 0.99F;
			float8 *= float8;
			this.j[0] = float7 * 0.3F + 0.7F;
			this.j[1] = float7 * float7 * 0.7F + 0.2F;
			this.j[2] = float7 * float7 * 0.0F + 0.2F;
			this.j[3] = float8;
			return this.j;
		} else {
			return null;
		}
	}

	public bdw b(float float1, float float2) {
		float float4 = ot.b(float1 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
		float4 = ot.a(float4, 0.0F, 1.0F);
		float float5 = 0.7529412F;
		float float6 = 0.84705883F;
		float float7 = 1.0F;
		float5 *= float4 * 0.94F + 0.06F;
		float6 *= float4 * 0.94F + 0.06F;
		float7 *= float4 * 0.91F + 0.09F;
		return new bdw((double)float5, (double)float6, (double)float7);
	}

	public boolean e() {
		return true;
	}

	public float f() {
		return 128.0F;
	}

	public boolean g() {
		return true;
	}

	@Nullable
	public co h() {
		return null;
	}

	public int i() {
		return this.h == ajx.c ? 4 : this.b.K() + 1;
	}

	public double j() {
		return this.h == ajx.c ? 1.0 : 0.03125;
	}

	public boolean b(int integer1, int integer2) {
		return false;
	}

	public akj k() {
		return this.c;
	}

	public boolean l() {
		return this.d;
	}

	public boolean m() {
		return this.f;
	}

	public boolean n() {
		return this.e;
	}

	public float[] o() {
		return this.g;
	}

	public auf p() {
		return new auf();
	}

	public void a(ly ly) {
	}

	public void b(ly ly) {
	}

	public abstract avg q();

	public void r() {
	}

	public void s() {
	}

	public boolean c(int integer1, int integer2) {
		return true;
	}
}
