import javax.annotation.Nullable;

public abstract class yd implements yl {
	protected final yb a;

	public yd(yb yb) {
		this.a = yb;
	}

	@Override
	public boolean a() {
		return false;
	}

	@Override
	public void b() {
	}

	@Override
	public void c() {
	}

	@Override
	public void a(ya ya, co co, ry ry, @Nullable aay aay) {
	}

	@Override
	public void d() {
	}

	@Override
	public void e() {
	}

	@Override
	public float f() {
		return 0.6F;
	}

	@Nullable
	@Override
	public bdw g() {
		return null;
	}

	@Override
	public float a(xz xz, ry ry, float float3) {
		return float3;
	}

	@Override
	public float h() {
		float float2 = ot.a(this.a.s * this.a.s + this.a.u * this.a.u) + 1.0F;
		float float3 = Math.min(float2, 40.0F);
		return 0.7F / float3 / float2;
	}
}
