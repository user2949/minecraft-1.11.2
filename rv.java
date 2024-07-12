import javax.annotation.Nullable;

public class rv {
	private final ry a;
	private final int b;
	private final float c;
	private final float d;
	private final String e;
	private final float f;

	public rv(ry ry, int integer, float float3, float float4, String string, float float6) {
		this.a = ry;
		this.b = integer;
		this.c = float4;
		this.d = float3;
		this.e = string;
		this.f = float6;
	}

	public ry a() {
		return this.a;
	}

	public float c() {
		return this.c;
	}

	public boolean f() {
		return this.a.j() instanceof sw;
	}

	@Nullable
	public String g() {
		return this.e;
	}

	@Nullable
	public fb h() {
		return this.a().j() == null ? null : this.a().j().i_();
	}

	public float j() {
		return this.a == ry.m ? Float.MAX_VALUE : this.f;
	}
}
