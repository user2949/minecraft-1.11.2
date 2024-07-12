public class ana extends amw {
	private final cw e = new cs();

	@Override
	protected cw a(afj afj) {
		return this.e;
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new asj();
	}

	@Override
	protected void c(ajs ajs, co co) {
		cq cq4 = new cq(ajs, co);
		asi asi5 = cq4.g();
		if (asi5 != null) {
			int integer6 = asi5.o();
			if (integer6 < 0) {
				ajs.b(1001, co, 0);
			} else {
				afj afj7 = asi5.a(integer6);
				if (!afj7.b()) {
					cv cv8 = ajs.o(co).c(a);
					co co9 = co.a(cv8);
					rc rc10 = asp.b(ajs, (double)co9.p(), (double)co9.q(), (double)co9.r());
					afj afj11;
					if (rc10 == null) {
						afj11 = this.e.a(cq4, afj7);
					} else {
						afj11 = asp.a(asi5, rc10, afj7.l().a(1), cv8.d());
						if (afj11.b()) {
							afj11 = afj7.l();
							afj11.g(1);
						} else {
							afj11 = afj7.l();
						}
					}

					asi5.a(integer6, afj11);
				}
			}
		}
	}
}
