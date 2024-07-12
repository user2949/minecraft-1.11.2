public class acw extends adl {
	public acw(rc rc, int integer2, int integer3, int integer4) {
		super(rc, integer2, integer3, integer4);
	}

	@Override
	public boolean a(afj afj) {
		return asn.c(afj) || d_(afj);
	}

	@Override
	public int b(afj afj) {
		return d_(afj) ? 1 : super.b(afj);
	}

	public static boolean d_(afj afj) {
		return afj.c() == afl.az;
	}
}
