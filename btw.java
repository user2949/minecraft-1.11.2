import com.google.common.collect.Maps;
import java.util.Map;

public class btw implements btt.a {
	private final bes a;
	private final Map<Integer, bbd> b = Maps.newHashMap();
	private final Map<Integer, Float> c = Maps.newHashMap();
	private final Map<Integer, Long> d = Maps.newHashMap();
	private aay e;
	private double f;
	private double g;
	private double h;

	public btw(bes bes) {
		this.a = bes;
	}

	public void a(int integer, bbd bbd, float float3) {
		this.b.put(integer, bbd);
		this.d.put(integer, System.currentTimeMillis());
		this.c.put(integer, float3);
	}

	@Override
	public void a(float float1, long long2) {
		if (this.b.size() != 0) {
			long long5 = System.currentTimeMillis();
			this.e = this.a.h;
			this.f = this.e.M + (this.e.p - this.e.M) * (double)float1;
			this.g = this.e.N + (this.e.q - this.e.N) * (double)float1;
			this.h = this.e.O + (this.e.r - this.e.O) * (double)float1;
			bqg.G();
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
			bqg.c(0.0F, 1.0F, 0.0F, 0.75F);
			bqg.z();
			bqg.d(6.0F);

			for (Integer integer8 : this.b.keySet()) {
				bbd bbd9 = (bbd)this.b.get(integer8);
				float float10 = (Float)this.c.get(integer8);
				this.a(float1, bbd9);
				bbb bbb11 = bbd9.i();
				if (!(this.a(bbb11) > 40.0F)) {
					bqm.b(
						new bdt(
								(double)((float)bbb11.a + 0.25F),
								(double)((float)bbb11.b + 0.25F),
								(double)bbb11.c + 0.25,
								(double)((float)bbb11.a + 0.75F),
								(double)((float)bbb11.b + 0.75F),
								(double)((float)bbb11.c + 0.75F)
							)
							.d(-this.f, -this.g, -this.h),
						0.0F,
						1.0F,
						0.0F,
						0.5F
					);

					for (int integer12 = 0; integer12 < bbd9.d(); integer12++) {
						bbb bbb13 = bbd9.a(integer12);
						if (!(this.a(bbb13) > 40.0F)) {
							float float14 = integer12 == bbd9.e() ? 1.0F : 0.0F;
							float float15 = integer12 == bbd9.e() ? 0.0F : 1.0F;
							bqm.b(
								new bdt(
										(double)((float)bbb13.a + 0.5F - float10),
										(double)((float)bbb13.b + 0.01F * (float)integer12),
										(double)((float)bbb13.c + 0.5F - float10),
										(double)((float)bbb13.a + 0.5F + float10),
										(double)((float)bbb13.b + 0.25F + 0.01F * (float)integer12),
										(double)((float)bbb13.c + 0.5F + float10)
									)
									.d(-this.f, -this.g, -this.h),
								float14,
								0.0F,
								float15,
								0.5F
							);
						}
					}
				}
			}

			for (Integer integer8x : this.b.keySet()) {
				bbd bbd9 = (bbd)this.b.get(integer8x);

				for (bbb bbb13 : bbd9.h()) {
					if (!(this.a(bbb13) > 40.0F)) {
						btt.a(String.format("%s", bbb13.m), (double)bbb13.a + 0.5, (double)bbb13.b + 0.75, (double)bbb13.c + 0.5, float1, -65536);
						btt.a(String.format("%.2f", bbb13.l), (double)bbb13.a + 0.5, (double)bbb13.b + 0.25, (double)bbb13.c + 0.5, float1, -65536);
					}
				}

				for (bbb bbb13x : bbd9.g()) {
					if (!(this.a(bbb13x) > 40.0F)) {
						btt.a(String.format("%s", bbb13x.m), (double)bbb13x.a + 0.5, (double)bbb13x.b + 0.75, (double)bbb13x.c + 0.5, float1, -16776961);
						btt.a(String.format("%.2f", bbb13x.l), (double)bbb13x.a + 0.5, (double)bbb13x.b + 0.25, (double)bbb13x.c + 0.5, float1, -16776961);
					}
				}

				for (int integer10 = 0; integer10 < bbd9.d(); integer10++) {
					bbb bbb11 = bbd9.a(integer10);
					if (!(this.a(bbb11) > 40.0F)) {
						btt.a(String.format("%s", bbb11.m), (double)bbb11.a + 0.5, (double)bbb11.b + 0.75, (double)bbb11.c + 0.5, float1, -1);
						btt.a(String.format("%.2f", bbb11.l), (double)bbb11.a + 0.5, (double)bbb11.b + 0.25, (double)bbb11.c + 0.5, float1, -1);
					}
				}
			}

			for (Integer integer10x : (Integer[])this.d.keySet().toArray(new Integer[0])) {
				if (long5 - (Long)this.d.get(integer10x) > 20000L) {
					this.b.remove(integer10x);
					this.d.remove(integer10x);
				}
			}

			bqg.y();
			bqg.l();
			bqg.H();
		}
	}

	public void a(float float1, bbd bbd) {
		bqs bqs4 = bqs.a();
		bpy bpy5 = bqs4.c();
		bpy5.a(3, bzh.f);

		for (int integer6 = 0; integer6 < bbd.d(); integer6++) {
			bbb bbb7 = bbd.a(integer6);
			if (!(this.a(bbb7) > 40.0F)) {
				float float8 = (float)integer6 / (float)bbd.d() * 0.33F;
				int integer9 = integer6 == 0 ? 0 : ot.c(float8, 0.9F, 0.9F);
				int integer10 = integer9 >> 16 & 0xFF;
				int integer11 = integer9 >> 8 & 0xFF;
				int integer12 = integer9 & 0xFF;
				bpy5.b((double)bbb7.a - this.f + 0.5, (double)bbb7.b - this.g + 0.5, (double)bbb7.c - this.h + 0.5).b(integer10, integer11, integer12, 255).d();
			}
		}

		bqs4.b();
	}

	private float a(bbb bbb) {
		return (float)(Math.abs((double)bbb.a - this.e.p) + Math.abs((double)bbb.b - this.e.q) + Math.abs((double)bbb.c - this.e.r));
	}
}
