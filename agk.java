import com.mojang.authlib.GameProfile;
import org.apache.commons.lang3.StringUtils;

public class agk extends afh {
	private static final String[] a = new String[]{"skeleton", "wither", "zombie", "char", "creeper", "dragon"};

	public agk() {
		this.a(aej.c);
		this.e(0);
		this.a(true);
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		if (cv == cv.DOWN) {
			return rk.FAIL;
		} else {
			atl atl10 = ajs.o(co);
			alu alu11 = atl10.v();
			boolean boolean12 = alu11.a((ajw)ajs, co);
			if (!boolean12) {
				if (!ajs.o(co).a().a()) {
					return rk.FAIL;
				}

				co = co.a(cv);
			}

			afj afj13 = aay.b(ri);
			if (!aay.a(co, cv, afj13) || !alv.ce.a(ajs, co)) {
				return rk.FAIL;
			} else if (ajs.E) {
				return rk.SUCCESS;
			} else {
				ajs.a(co, alv.ce.t().a(aqp.a, cv), 11);
				int integer14 = 0;
				if (cv == cv.UP) {
					integer14 = ot.c((double)(aay.v * 16.0F / 360.0F) + 0.5) & 15;
				}

				asc asc15 = ajs.r(co);
				if (asc15 instanceof asw) {
					asw asw16 = (asw)asc15;
					if (afj13.j() == 3) {
						GameProfile gameProfile17 = null;
						if (afj13.o()) {
							du du18 = afj13.p();
							if (du18.b("SkullOwner", 10)) {
								gameProfile17 = ee.a(du18.o("SkullOwner"));
							} else if (du18.b("SkullOwner", 8) && !StringUtils.isBlank(du18.l("SkullOwner"))) {
								gameProfile17 = new GameProfile(null, du18.l("SkullOwner"));
							}
						}

						asw16.a(gameProfile17);
					} else {
						asw16.a(afj13.j());
					}

					asw16.b(integer14);
					alv.ce.a(ajs, co, asw16);
				}

				afj13.g(1);
				return rk.SUCCESS;
			}
		}
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (int integer5 = 0; integer5 < a.length; integer5++) {
			dd.add(new afj(afh, 1, integer5));
		}
	}

	@Override
	public int a(int integer) {
		return integer;
	}

	@Override
	public String a(afj afj) {
		int integer3 = afj.j();
		if (integer3 < 0 || integer3 >= a.length) {
			integer3 = 0;
		}

		return super.a() + "." + a[integer3];
	}

	@Override
	public String b(afj afj) {
		if (afj.j() == 3 && afj.o()) {
			if (afj.p().b("SkullOwner", 8)) {
				return dp.a("item.skull.player.name", afj.p().l("SkullOwner"));
			}

			if (afj.p().b("SkullOwner", 10)) {
				du du3 = afj.p().o("SkullOwner");
				if (du3.b("Name", 8)) {
					return dp.a("item.skull.player.name", du3.l("Name"));
				}
			}
		}

		return super.b(afj);
	}

	@Override
	public boolean a(du du) {
		super.a(du);
		if (du.b("SkullOwner", 8) && !StringUtils.isBlank(du.l("SkullOwner"))) {
			GameProfile gameProfile3 = new GameProfile(null, du.l("SkullOwner"));
			gameProfile3 = asw.b(gameProfile3);
			du.a("SkullOwner", ee.a(new du(), gameProfile3));
			return true;
		} else {
			return false;
		}
	}
}
