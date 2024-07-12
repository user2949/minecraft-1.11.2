public class adg extends rr {
	private asl a;

	public adg() {
		super("container.enderchest", false, 27);
	}

	public void a(asl asl) {
		this.a = asl;
	}

	public void a(ea ea) {
		for (int integer3 = 0; integer3 < this.v_(); integer3++) {
			this.a(integer3, afj.a);
		}

		for (int integer3 = 0; integer3 < ea.c(); integer3++) {
			du du4 = ea.b(integer3);
			int integer5 = du4.f("Slot") & 255;
			if (integer5 >= 0 && integer5 < this.v_()) {
				this.a(integer5, new afj(du4));
			}
		}
	}

	public ea i() {
		ea ea2 = new ea();

		for (int integer3 = 0; integer3 < this.v_(); integer3++) {
			afj afj4 = this.a(integer3);
			if (!afj4.b()) {
				du du5 = new du();
				du5.a("Slot", (byte)integer3);
				afj4.a(du5);
				ea2.a(du5);
			}
		}

		return ea2;
	}

	@Override
	public boolean a(aay aay) {
		return this.a != null && !this.a.a(aay) ? false : super.a(aay);
	}

	@Override
	public void b(aay aay) {
		if (this.a != null) {
			this.a.a();
		}

		super.b(aay);
	}

	@Override
	public void c(aay aay) {
		if (this.a != null) {
			this.a.e();
		}

		super.c(aay);
		this.a = null;
	}
}
