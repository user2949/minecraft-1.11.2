public class ff extends ez {
	private final String b;

	public ff(String string) {
		this.b = string;
	}

	public String g() {
		return this.b;
	}

	@Override
	public String e() {
		return this.b;
	}

	public ff f() {
		ff ff2 = new ff(this.b);
		ff2.a(this.b().m());

		for (fb fb4 : this.a()) {
			ff2.a(fb4.f());
		}

		return ff2;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (!(object instanceof ff)) {
			return false;
		} else {
			ff ff3 = (ff)object;
			return this.b.equals(ff3.b) && super.equals(object);
		}
	}

	@Override
	public String toString() {
		return "SelectorComponent{pattern='" + this.b + '\'' + ", siblings=" + this.a + ", style=" + this.b() + '}';
	}
}
