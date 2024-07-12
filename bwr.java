public class bwr extends bvq<aaa> {
	private static final kq a = new kq("textures/entity/illager/vindicator.png");

	public bwr(bur bur) {
		super(bur, new bmx(0.0F), 0.5F);
		this.a(new bxl(this) {
			@Override
			public void a(sw sw, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
				if (((aal)sw).o()) {
					super.a(sw, float2, float3, float4, float5, float6, float7, float8);
				}
			}

			@Override
			protected void a(sv sv) {
				((blo)this.b.b()).a(sv).c(0.0625F);
			}
		});
	}

	public void a(aaa aaa, double double2, double double3, double double4, float float5, float float6) {
		super.a(aaa, double2, double3, double4, float5, float6);
	}

	protected kq a(aaa aaa) {
		return a;
	}

	protected void a(aaa aaa, float float2) {
		float float4 = 0.9375F;
		bqg.b(0.9375F, 0.9375F, 0.9375F);
	}
}
