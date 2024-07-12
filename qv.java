public abstract class qv implements pj {
	private final kq a;

	public qv(Class<?> class1) {
		if (sn.class.isAssignableFrom(class1)) {
			this.a = sp.a((Class<? extends sn>)class1);
		} else if (asc.class.isAssignableFrom(class1)) {
			this.a = asc.a((Class<? extends asc>)class1);
		} else {
			this.a = null;
		}
	}

	@Override
	public du a(pg pg, du du, int integer) {
		if (new kq(du.l("id")).equals(this.a)) {
			du = this.b(pg, du, integer);
		}

		return du;
	}

	abstract du b(pg pg, du du, int integer);
}
