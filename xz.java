public class xz extends sn {
	public final xy a;
	public final String b;

	public xz(xy xy, String string, float float3, float float4) {
		super(xy.a());
		this.a(float3, float4);
		this.a = xy;
		this.b = string;
	}

	@Override
	protected void i() {
	}

	@Override
	protected void a(du du) {
	}

	@Override
	protected void b(du du) {
	}

	@Override
	public boolean aq() {
		return true;
	}

	@Override
	public boolean a(ry ry, float float2) {
		return this.b(ry) ? false : this.a.a(this, ry, float2);
	}

	@Override
	public boolean s(sn sn) {
		return this == sn || this.a == sn;
	}
}
