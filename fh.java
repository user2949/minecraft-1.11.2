public class fh extends ez {
	private final String b;

	public fh(String string) {
		this.b = string;
	}

	public String g() {
		return this.b;
	}

	@Override
	public String e() {
		return this.b;
	}

	public fh f() {
		fh fh2 = new fh(this.b);
		fh2.a(this.b().m());

		for (fb fb4 : this.a()) {
			fh2.a(fb4.f());
		}

		return fh2;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (!(object instanceof fh)) {
			return false;
		} else {
			fh fh3 = (fh)object;
			return this.b.equals(fh3.g()) && super.equals(object);
		}
	}

	@Override
	public String toString() {
		return "TextComponent{text='" + this.b + '\'' + ", siblings=" + this.a + ", style=" + this.b() + '}';
	}
}
