public class bxl implements bxp<sw> {
	protected final bvl<?> b;

	public bxl(bvl<?> bvl) {
		this.b = bvl;
	}

	@Override
	public void a(sw sw, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		boolean boolean10 = sw.cx() == sv.RIGHT;
		afj afj11 = boolean10 ? sw.ch() : sw.cg();
		afj afj12 = boolean10 ? sw.cg() : sw.ch();
		if (!afj11.b() || !afj12.b()) {
			bqg.G();
			if (this.b.b().q) {
				float float13 = 0.5F;
				bqg.c(0.0F, 0.75F, 0.0F);
				bqg.b(0.5F, 0.5F, 0.5F);
			}

			this.a(sw, afj12, brq.b.THIRD_PERSON_RIGHT_HAND, sv.RIGHT);
			this.a(sw, afj11, brq.b.THIRD_PERSON_LEFT_HAND, sv.LEFT);
			bqg.H();
		}
	}

	private void a(sw sw, afj afj, brq.b b, sv sv) {
		if (!afj.b()) {
			bqg.G();
			this.a(sv);
			if (sw.aM()) {
				bqg.c(0.0F, 0.2F, 0.0F);
			}

			bqg.b(-90.0F, 1.0F, 0.0F, 0.0F);
			bqg.b(180.0F, 0.0F, 1.0F, 0.0F);
			boolean boolean6 = sv == sv.LEFT;
			bqg.c((float)(boolean6 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
			bes.z().ae().a(sw, afj, b, boolean6);
			bqg.H();
		}
	}

	protected void a(sv sv) {
		((bln)this.b.b()).a(0.0625F, sv);
	}

	@Override
	public boolean a() {
		return false;
	}
}
