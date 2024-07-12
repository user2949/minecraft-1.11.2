import com.google.common.collect.Lists;
import java.util.List;

public class ahd implements aho {
	@Override
	public boolean a(acs acs, ajs ajs) {
		afj afj4 = afj.a;
		List<afj> list5 = Lists.newArrayList();

		for (int integer6 = 0; integer6 < acs.v_(); integer6++) {
			afj afj7 = acs.a(integer6);
			if (!afj7.b()) {
				if (afj7.c() instanceof adp) {
					adp adp8 = (adp)afj7.c();
					if (adp8.d() != adp.a.LEATHER || !afj4.b()) {
						return false;
					}

					afj4 = afj7;
				} else {
					if (afj7.c() != afl.be) {
						return false;
					}

					list5.add(afj7);
				}
			}
		}

		return !afj4.b() && !list5.isEmpty();
	}

	@Override
	public afj a(acs acs) {
		afj afj3 = afj.a;
		int[] arr4 = new int[3];
		int integer5 = 0;
		int integer6 = 0;
		adp adp7 = null;

		for (int integer8 = 0; integer8 < acs.v_(); integer8++) {
			afj afj9 = acs.a(integer8);
			if (!afj9.b()) {
				if (afj9.c() instanceof adp) {
					adp7 = (adp)afj9.c();
					if (adp7.d() != adp.a.LEATHER || !afj3.b()) {
						return afj.a;
					}

					afj3 = afj9.l();
					afj3.e(1);
					if (adp7.e_(afj9)) {
						int integer10 = adp7.c(afj3);
						float float11 = (float)(integer10 >> 16 & 0xFF) / 255.0F;
						float float12 = (float)(integer10 >> 8 & 0xFF) / 255.0F;
						float float13 = (float)(integer10 & 0xFF) / 255.0F;
						integer5 = (int)((float)integer5 + Math.max(float11, Math.max(float12, float13)) * 255.0F);
						arr4[0] = (int)((float)arr4[0] + float11 * 255.0F);
						arr4[1] = (int)((float)arr4[1] + float12 * 255.0F);
						arr4[2] = (int)((float)arr4[2] + float13 * 255.0F);
						integer6++;
					}
				} else {
					if (afj9.c() != afl.be) {
						return afj.a;
					}

					float[] arr10 = xf.a(aem.a(afj9.j()));
					int integer11 = (int)(arr10[0] * 255.0F);
					int integer12 = (int)(arr10[1] * 255.0F);
					int integer13 = (int)(arr10[2] * 255.0F);
					integer5 += Math.max(integer11, Math.max(integer12, integer13));
					arr4[0] += integer11;
					arr4[1] += integer12;
					arr4[2] += integer13;
					integer6++;
				}
			}
		}

		if (adp7 == null) {
			return afj.a;
		} else {
			int integer8x = arr4[0] / integer6;
			int integer9 = arr4[1] / integer6;
			int integer10 = arr4[2] / integer6;
			float float11 = (float)integer5 / (float)integer6;
			float float12 = (float)Math.max(integer8x, Math.max(integer9, integer10));
			integer8x = (int)((float)integer8x * float11 / float12);
			integer9 = (int)((float)integer9 * float11 / float12);
			integer10 = (int)((float)integer10 * float11 / float12);
			int var25 = (integer8x << 8) + integer9;
			var25 = (var25 << 8) + integer10;
			adp7.a(afj3, var25);
			return afj3;
		}
	}

	@Override
	public int a() {
		return 10;
	}

	@Override
	public afj b() {
		return afj.a;
	}

	@Override
	public dd<afj> b(acs acs) {
		dd<afj> dd3 = dd.a(acs.v_(), afj.a);

		for (int integer4 = 0; integer4 < dd3.size(); integer4++) {
			afj afj5 = acs.a(integer4);
			if (afj5.c().s()) {
				dd3.set(integer4, new afj(afj5.c().r()));
			}
		}

		return dd3;
	}
}
