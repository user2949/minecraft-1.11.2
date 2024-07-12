import com.mojang.authlib.GameProfile;
import org.apache.commons.lang3.StringUtils;

public class bqc {
	private static final asu[] b = new asu[16];
	public static bqc a;
	private final ase c = new ase(amg.a.BASIC);
	private final ase d = new ase(amg.a.TRAP);
	private final asl e = new asl();
	private final arz f = new arz();
	private final asw g = new asw();
	private final bmf h = new bmf();

	public void a(afj afj) {
		afh afh3 = afj.c();
		if (afh3 == afl.cP) {
			this.f.a(afj, false);
			bsk.a.a(this.f, 0.0, 0.0, 0.0, 0.0F);
		} else if (afh3 == afl.cR) {
			if (afj.d("BlockEntityTag") != null) {
				this.f.a(afj, true);
				bes.z().N().a(bqw.b.a(this.f.k(), this.f.h(), this.f.j()));
			} else {
				bes.z().N().a(bqw.c);
			}

			bqg.G();
			bqg.b(1.0F, -1.0F, -1.0F);
			this.h.a();
			bqg.H();
		} else if (afh3 == afl.ci) {
			GameProfile gameProfile4 = null;
			if (afj.o()) {
				du du5 = afj.p();
				if (du5.b("SkullOwner", 10)) {
					gameProfile4 = ee.a(du5.o("SkullOwner"));
				} else if (du5.b("SkullOwner", 8) && !StringUtils.isBlank(du5.l("SkullOwner"))) {
					GameProfile var5 = new GameProfile(null, du5.l("SkullOwner"));
					gameProfile4 = asw.b(var5);
					du5.q("SkullOwner");
					du5.a("SkullOwner", ee.a(new du(), gameProfile4));
				}
			}

			if (bst.a != null) {
				bqg.G();
				bqg.r();
				bst.a.a(0.0F, 0.0F, 0.0F, cv.UP, 180.0F, afj.j(), gameProfile4, -1, 0.0F);
				bqg.q();
				bqg.H();
			}
		} else if (afh3 == afh.a(alv.bQ)) {
			bsk.a.a(this.e, 0.0, 0.0, 0.0, 0.0F);
		} else if (afh3 == afh.a(alv.cg)) {
			bsk.a.a(this.d, 0.0, 0.0, 0.0, 0.0F);
		} else if (alu.a(afh3) instanceof aqn) {
			bsk.a.a(b[aqn.b(afh3).a()], 0.0, 0.0, 0.0, 0.0F);
		} else {
			bsk.a.a(this.c, 0.0, 0.0, 0.0, 0.0F);
		}
	}

	static {
		for (aem aem4 : aem.values()) {
			b[aem4.a()] = new asu(aem4);
		}

		a = new bqc();
	}
}
