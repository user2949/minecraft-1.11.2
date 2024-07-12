public class bxg implements bxp<sw> {
	private static final kq b = new kq("textures/entity/elytra.png");
	protected final bvl<?> a;
	private final ble c = new ble();

	public bxg(bvl<?> bvl) {
		this.a = bvl;
	}

	@Override
	public void a(sw sw, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		afj afj10 = sw.b(ss.CHEST);
		if (afj10.c() == afl.cS) {
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			bqg.m();
			bqg.a(bqg.r.ONE, bqg.l.ZERO);
			if (sw instanceof bpp) {
				bpp bpp11 = (bpp)sw;
				if (bpp11.r() && bpp11.s() != null) {
					this.a.a(bpp11.s());
				} else if (bpp11.a() && bpp11.o() != null && bpp11.a(aaz.CAPE)) {
					this.a.a(bpp11.o());
				} else {
					this.a.a(b);
				}
			} else {
				this.a.a(b);
			}

			bqg.G();
			bqg.c(0.0F, 0.0F, 0.125F);
			this.c.a(float2, float3, float5, float6, float7, float8, sw);
			this.c.a(sw, float2, float3, float5, float6, float7, float8);
			if (afj10.x()) {
				bwz.a(this.a, sw, this.c, float2, float3, float4, float5, float6, float7, float8);
			}

			bqg.l();
			bqg.H();
		}
	}

	@Override
	public boolean a() {
		return false;
	}
}
