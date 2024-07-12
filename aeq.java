import javax.annotation.Nullable;

public class aeq extends afh {
	public aeq() {
		this.k = 1;
		this.e(432);
		this.a(aej.e);
		this.a(new kq("broken"), new afk() {
			@Override
			public float a(afj afj, @Nullable ajs ajs, @Nullable sw sw) {
				return aeq.d(afj) ? 0.0F : 1.0F;
			}
		});
		amw.c.a(this, adp.b);
	}

	public static boolean d(afj afj) {
		return afj.i() < afj.k() - 1;
	}

	@Override
	public boolean a(afj afj1, afj afj2) {
		return afj2.c() == afl.aN;
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = aay.b(ri);
		ss ss6 = sx.d(afj5);
		afj afj7 = aay.b(ss6);
		if (afj7.b()) {
			aay.a(ss6, afj5.l());
			afj5.e(0);
			return new rl<>(rk.SUCCESS, afj5);
		} else {
			return new rl<>(rk.FAIL, afj5);
		}
	}
}
