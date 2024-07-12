import com.google.common.collect.Maps;
import java.util.Map;

public abstract class bwz<T extends blv> implements bxp<sw> {
	protected static final kq b = new kq("textures/misc/enchanted_item_glint.png");
	protected T c;
	protected T d;
	private final bvl<?> a;
	private float e = 1.0F;
	private float f = 1.0F;
	private float g = 1.0F;
	private float h = 1.0F;
	private boolean i;
	private static final Map<String, kq> j = Maps.newHashMap();

	public bwz(bvl<?> bvl) {
		this.a = bvl;
		this.L_();
	}

	@Override
	public void a(sw sw, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		this.a(sw, float2, float3, float4, float5, float6, float7, float8, ss.CHEST);
		this.a(sw, float2, float3, float4, float5, float6, float7, float8, ss.LEGS);
		this.a(sw, float2, float3, float4, float5, float6, float7, float8, ss.FEET);
		this.a(sw, float2, float3, float4, float5, float6, float7, float8, ss.HEAD);
	}

	@Override
	public boolean a() {
		return false;
	}

	private void a(sw sw, float float2, float float3, float float4, float float5, float float6, float float7, float float8, ss ss) {
		afj afj11 = sw.b(ss);
		if (afj11.c() instanceof adp) {
			adp adp12 = (adp)afj11.c();
			if (adp12.D_() == ss) {
				T blv13 = this.a(ss);
				blv13.a(this.a.b());
				blv13.a(sw, float2, float3, float4);
				this.a(blv13, ss);
				boolean boolean14 = this.b(ss);
				this.a.a(this.a(adp12, boolean14));
				switch (adp12.d()) {
					case LEATHER:
						int integer15 = adp12.c(afj11);
						float float16 = (float)(integer15 >> 16 & 0xFF) / 255.0F;
						float float17 = (float)(integer15 >> 8 & 0xFF) / 255.0F;
						float float18 = (float)(integer15 & 0xFF) / 255.0F;
						bqg.c(this.f * float16, this.g * float17, this.h * float18, this.e);
						blv13.a(sw, float2, float3, float5, float6, float7, float8);
						this.a.a(this.a(adp12, boolean14, "overlay"));
					case CHAIN:
					case IRON:
					case GOLD:
					case DIAMOND:
						bqg.c(this.f, this.g, this.h, this.e);
						blv13.a(sw, float2, float3, float5, float6, float7, float8);
					default:
						if (!this.i && afj11.x()) {
							a(this.a, sw, blv13, float2, float3, float4, float5, float6, float7, float8);
						}
				}
			}
		}
	}

	public T a(ss ss) {
		return this.b(ss) ? this.c : this.d;
	}

	private boolean b(ss ss) {
		return ss == ss.LEGS;
	}

	public static void a(bvl<?> bvl, sw sw, blv blv, float float4, float float5, float float6, float float7, float float8, float float9, float float10) {
		float float11 = (float)sw.T + float6;
		bvl.a(b);
		bes.z().o.d(true);
		bqg.m();
		bqg.c(514);
		bqg.a(false);
		float float12 = 0.5F;
		bqg.c(0.5F, 0.5F, 0.5F, 1.0F);

		for (int integer13 = 0; integer13 < 2; integer13++) {
			bqg.g();
			bqg.a(bqg.r.SRC_COLOR, bqg.l.ONE);
			float float14 = 0.76F;
			bqg.c(0.38F, 0.19F, 0.608F, 1.0F);
			bqg.n(5890);
			bqg.F();
			float float15 = 0.33333334F;
			bqg.b(0.33333334F, 0.33333334F, 0.33333334F);
			bqg.b(30.0F - (float)integer13 * 60.0F, 0.0F, 0.0F, 1.0F);
			bqg.c(0.0F, float11 * (0.001F + (float)integer13 * 0.003F) * 20.0F, 0.0F);
			bqg.n(5888);
			blv.a(sw, float4, float5, float7, float8, float9, float10);
			bqg.a(bqg.r.ONE, bqg.l.ZERO);
		}

		bqg.n(5890);
		bqg.F();
		bqg.n(5888);
		bqg.f();
		bqg.a(true);
		bqg.c(515);
		bqg.l();
		bes.z().o.d(false);
	}

	private kq a(adp adp, boolean boolean2) {
		return this.a(adp, boolean2, null);
	}

	private kq a(adp adp, boolean boolean2, String string) {
		String string5 = String.format("textures/models/armor/%s_layer_%d%s.png", adp.d().d(), boolean2 ? 2 : 1, string == null ? "" : String.format("_%s", string));
		kq kq6 = (kq)j.get(string5);
		if (kq6 == null) {
			kq6 = new kq(string5);
			j.put(string5, kq6);
		}

		return kq6;
	}

	protected abstract void L_();

	protected abstract void a(T blv, ss ss);
}
