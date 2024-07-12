public class bws extends bvq<aam> {
	private static final kq a = new kq("textures/entity/witch.png");

	public bws(bur bur) {
		super(bur, new bmy(0.0F), 0.5F);
		this.a(new bxx(this));
	}

	public bmy b() {
		return (bmy)super.b();
	}

	public void a(aam aam, double double2, double double3, double double4, float float5, float float6) {
		((bmy)this.f).g = !aam.cg().b();
		super.a(aam, double2, double3, double4, float5, float6);
	}

	protected kq a(aam aam) {
		return a;
	}

	@Override
	public void M_() {
		bqg.c(0.0F, 0.1875F, 0.0F);
	}

	protected void a(aam aam, float float2) {
		float float4 = 0.9375F;
		bqg.b(0.9375F, 0.9375F, 0.9375F);
	}
}
