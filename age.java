public class age extends afh {
	public age() {
		this.d(1);
		this.e(238);
		this.a(aej.i);
	}

	@Override
	public boolean a(afj afj, ajs ajs, atl atl, co co, sw sw) {
		if (!ajs.E) {
			afj.a(1, sw);
		}

		alu alu7 = atl.v();
		return atl.a() != azs.j && alu7 != alv.G && alu7 != alv.H && alu7 != alv.bn && alu7 != alv.bS && alu7 != alv.L ? super.a(afj, ajs, atl, co, sw) : true;
	}

	@Override
	public boolean a(atl atl) {
		alu alu3 = atl.v();
		return alu3 == alv.G || alu3 == alv.af || alu3 == alv.bS;
	}

	@Override
	public float a(afj afj, atl atl) {
		alu alu4 = atl.v();
		if (alu4 == alv.G || atl.a() == azs.j) {
			return 15.0F;
		} else {
			return alu4 == alv.L ? 5.0F : super.a(afj, atl);
		}
	}
}
