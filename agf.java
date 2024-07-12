import java.util.List;
import javax.annotation.Nullable;

public class agf extends afh {
	public agf() {
		this.k = 1;
		this.a(aej.j);
		this.e(336);
		this.a(new kq("blocking"), new afk() {
			@Override
			public float a(afj afj, @Nullable ajs ajs, @Nullable sw sw) {
				return sw != null && sw.cy() && sw.cB() == afj ? 1.0F : 0.0F;
			}
		});
		amw.c.a(this, adp.b);
	}

	@Override
	public String b(afj afj) {
		if (afj.d("BlockEntityTag") != null) {
			aem aem3 = arz.d(afj);
			return dp.a("item.shield." + aem3.d() + ".name");
		} else {
			return dp.a("item.shield.name");
		}
	}

	@Override
	public void a(afj afj, aay aay, List<String> list, boolean boolean4) {
		adt.a(afj, list);
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		afj afj5 = new afj(afh, 1, 0);
		dd.add(afj5);
	}

	@Override
	public aej b() {
		return aej.j;
	}

	@Override
	public agu f(afj afj) {
		return agu.BLOCK;
	}

	@Override
	public int e(afj afj) {
		return 72000;
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = aay.b(ri);
		aay.c(ri);
		return new rl<>(rk.SUCCESS, afj5);
	}

	@Override
	public boolean a(afj afj1, afj afj2) {
		return afj2.c() == afh.a(alv.f) ? true : super.a(afj1, afj2);
	}
}
