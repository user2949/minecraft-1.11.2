import com.mojang.authlib.GameProfile;
import org.apache.commons.lang3.StringUtils;

public class bxe implements bxp<sw> {
	private final bni a;

	public bxe(bni bni) {
		this.a = bni;
	}

	@Override
	public void a(sw sw, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		afj afj10 = sw.b(ss.HEAD);
		if (!afj10.b()) {
			afh afh11 = afj10.c();
			bes bes12 = bes.z();
			bqg.G();
			if (sw.aM()) {
				bqg.c(0.0F, 0.2F, 0.0F);
			}

			boolean boolean13 = sw instanceof aat || sw instanceof aap;
			if (sw.l_() && !(sw instanceof aat)) {
				float float14 = 2.0F;
				float float15 = 1.4F;
				bqg.c(0.0F, 0.5F * float8, 0.0F);
				bqg.b(0.7F, 0.7F, 0.7F);
				bqg.c(0.0F, 16.0F * float8, 0.0F);
			}

			this.a.c(0.0625F);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			if (afh11 == afl.ci) {
				float float14 = 1.1875F;
				bqg.b(1.1875F, -1.1875F, -1.1875F);
				if (boolean13) {
					bqg.c(0.0F, 0.0625F, 0.0F);
				}

				GameProfile gameProfile15 = null;
				if (afj10.o()) {
					du du16 = afj10.p();
					if (du16.b("SkullOwner", 10)) {
						gameProfile15 = ee.a(du16.o("SkullOwner"));
					} else if (du16.b("SkullOwner", 8)) {
						String string17 = du16.l("SkullOwner");
						if (!StringUtils.isBlank(string17)) {
							gameProfile15 = asw.b(new GameProfile(null, string17));
							du16.a("SkullOwner", ee.a(new du(), gameProfile15));
						}
					}
				}

				bst.a.a(-0.5F, 0.0F, -0.5F, cv.UP, 180.0F, afj10.j(), gameProfile15, -1, float2);
			} else if (!(afh11 instanceof adp) || ((adp)afh11).D_() != ss.HEAD) {
				float float14x = 0.625F;
				bqg.c(0.0F, -0.25F, 0.0F);
				bqg.b(180.0F, 0.0F, 1.0F, 0.0F);
				bqg.b(0.625F, -0.625F, -0.625F);
				if (boolean13) {
					bqg.c(0.0F, 0.1875F, 0.0F);
				}

				bes12.ae().a(sw, afj10, brq.b.HEAD);
			}

			bqg.H();
		}
	}

	@Override
	public boolean a() {
		return false;
	}
}
