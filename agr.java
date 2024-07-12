import com.google.common.collect.Multimap;

public class agr extends afh {
	private final float a;
	private final afh.a b;

	public agr(afh.a a) {
		this.b = a;
		this.k = 1;
		this.e(a.a());
		this.a(aej.j);
		this.a = 3.0F + a.c();
	}

	public float g() {
		return this.b.c();
	}

	@Override
	public float a(afj afj, atl atl) {
		alu alu4 = atl.v();
		if (alu4 == alv.G) {
			return 15.0F;
		} else {
			azs azs5 = atl.a();
			return azs5 != azs.k && azs5 != azs.l && azs5 != azs.v && azs5 != azs.j && azs5 != azs.C ? 1.0F : 1.5F;
		}
	}

	@Override
	public boolean a(afj afj, sw sw2, sw sw3) {
		afj.a(1, sw3);
		return true;
	}

	@Override
	public boolean a(afj afj, ajs ajs, atl atl, co co, sw sw) {
		if ((double)atl.b(ajs, co) != 0.0) {
			afj.a(2, sw);
		}

		return true;
	}

	@Override
	public boolean C_() {
		return true;
	}

	@Override
	public boolean a(atl atl) {
		return atl.v() == alv.G;
	}

	@Override
	public int c() {
		return this.b.e();
	}

	public String h() {
		return this.b.toString();
	}

	@Override
	public boolean a(afj afj1, afj afj2) {
		return this.b.f() == afj2.c() ? true : super.a(afj1, afj2);
	}

	@Override
	public Multimap<String, tl> a(ss ss) {
		Multimap<String, tl> multimap3 = super.a(ss);
		if (ss == ss.MAINHAND) {
			multimap3.put(aad.e.a(), new tl(h, "Weapon modifier", (double)this.a, 0));
			multimap3.put(aad.f.a(), new tl(i, "Weapon modifier", -2.4F, 0));
		}

		return multimap3;
	}
}
