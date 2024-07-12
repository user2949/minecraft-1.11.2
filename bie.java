public class bie extends bho {
	private static final beu.a[] h = new beu.a[]{beu.a.INVERT_MOUSE, beu.a.SENSITIVITY, beu.a.TOUCHSCREEN, beu.a.AUTO_JUMP};
	private final bho i;
	protected String a = "Controls";
	private final beu r;
	public bep f;
	public long g;
	private bid s;
	private bfm t;

	public bie(bho bho, beu beu) {
		this.i = bho;
		this.r = beu;
	}

	@Override
	public void b() {
		this.s = new bid(this, this.j);
		this.n.add(new bfm(200, this.l / 2 - 155 + 160, this.m - 29, 150, 20, cah.a("gui.done")));
		this.t = this.b(new bfm(201, this.l / 2 - 155, this.m - 29, 150, 20, cah.a("controls.resetAll")));
		this.a = cah.a("controls.title");
		int integer2 = 0;

		for (beu.a a6 : h) {
			if (a6.a()) {
				this.n.add(new bge(a6.c(), this.l / 2 - 155 + integer2 % 2 * 160, 18 + 24 * (integer2 >> 1), a6));
			} else {
				this.n.add(new bfz(a6.c(), this.l / 2 - 155 + integer2 % 2 * 160, 18 + 24 * (integer2 >> 1), a6, this.r.c(a6)));
			}

			integer2++;
		}
	}

	@Override
	public void k() {
		super.k();
		this.s.p();
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.k == 200) {
			this.j.a(this.i);
		} else if (bfm.k == 201) {
			for (bep bep6 : this.j.u.ao) {
				bep6.b(bep6.i());
			}

			bep.c();
		} else if (bfm.k < 100 && bfm instanceof bfz) {
			this.r.a(((bfz)bfm).c(), 1);
			bfm.j = this.r.c(beu.a.a(bfm.k));
		}
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		if (this.f != null) {
			this.r.a(this.f, -100 + integer3);
			this.f = null;
			bep.c();
		} else if (integer3 != 0 || !this.s.b(integer1, integer2, integer3)) {
			super.a(integer1, integer2, integer3);
		}
	}

	@Override
	protected void b(int integer1, int integer2, int integer3) {
		if (integer3 != 0 || !this.s.c(integer1, integer2, integer3)) {
			super.b(integer1, integer2, integer3);
		}
	}

	@Override
	protected void a(char character, int integer) {
		if (this.f != null) {
			if (integer == 1) {
				this.r.a(this.f, 0);
			} else if (integer != 0) {
				this.r.a(this.f, integer);
			} else if (character > 0) {
				this.r.a(this.f, character + 256);
			}

			this.f = null;
			this.g = bes.I();
			bep.c();
		} else {
			super.a(character, integer);
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.s.a(integer1, integer2, float3);
		this.a(this.q, this.a, this.l / 2, 8, 16777215);
		boolean boolean5 = false;

		for (bep bep9 : this.r.ao) {
			if (bep9.j() != bep9.i()) {
				boolean5 = true;
				break;
			}
		}

		this.t.l = boolean5;
		super.a(integer1, integer2, float3);
	}
}
