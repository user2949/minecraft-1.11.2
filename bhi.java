public class bhi extends bho {
	private static final beu.a[] f = new beu.a[]{beu.a.FOV};
	private final bho g;
	private final beu h;
	private bfm i;
	private bfx r;
	protected String a = "Options";

	public bhi(bho bho, beu beu) {
		this.g = bho;
		this.h = beu;
	}

	@Override
	public void b() {
		this.a = cah.a("options.title");
		int integer2 = 0;

		for (beu.a a6 : f) {
			if (a6.a()) {
				this.n.add(new bge(a6.c(), this.l / 2 - 155 + integer2 % 2 * 160, this.m / 6 - 12 + 24 * (integer2 >> 1), a6));
			} else {
				bfz bfz7 = new bfz(a6.c(), this.l / 2 - 155 + integer2 % 2 * 160, this.m / 6 - 12 + 24 * (integer2 >> 1), a6, this.h.c(a6));
				this.n.add(bfz7);
			}

			integer2++;
		}

		if (this.j.f != null) {
			rg rg3 = this.j.f.ae();
			this.i = new bfm(108, this.l / 2 - 155 + integer2 % 2 * 160, this.m / 6 - 12 + 24 * (integer2 >> 1), 150, 20, this.a(rg3));
			this.n.add(this.i);
			if (this.j.E() && !this.j.f.T().s()) {
				this.i.a(this.i.b() - 20);
				this.r = new bfx(109, this.i.h + this.i.b(), this.i.i);
				this.n.add(this.r);
				this.r.b(this.j.f.T().y());
				this.r.l = !this.r.c();
				this.i.l = !this.r.c();
			} else {
				this.i.l = false;
			}
		} else {
			this.n
				.add(
					new bfz(
						beu.a.REALMS_NOTIFICATIONS.c(),
						this.l / 2 - 155 + integer2 % 2 * 160,
						this.m / 6 - 12 + 24 * (integer2 >> 1),
						beu.a.REALMS_NOTIFICATIONS,
						this.h.c(beu.a.REALMS_NOTIFICATIONS)
					)
				);
		}

		this.n.add(new bfm(110, this.l / 2 - 155, this.m / 6 + 48 - 6, 150, 20, cah.a("options.skinCustomisation")));
		this.n.add(new bfm(106, this.l / 2 + 5, this.m / 6 + 48 - 6, 150, 20, cah.a("options.sounds")));
		this.n.add(new bfm(101, this.l / 2 - 155, this.m / 6 + 72 - 6, 150, 20, cah.a("options.video")));
		this.n.add(new bfm(100, this.l / 2 + 5, this.m / 6 + 72 - 6, 150, 20, cah.a("options.controls")));
		this.n.add(new bfm(102, this.l / 2 - 155, this.m / 6 + 96 - 6, 150, 20, cah.a("options.language")));
		this.n.add(new bfm(103, this.l / 2 + 5, this.m / 6 + 96 - 6, 150, 20, cah.a("options.chat.title")));
		this.n.add(new bfm(105, this.l / 2 - 155, this.m / 6 + 120 - 6, 150, 20, cah.a("options.resourcepack")));
		this.n.add(new bfm(104, this.l / 2 + 5, this.m / 6 + 120 - 6, 150, 20, cah.a("options.snooper.view")));
		this.n.add(new bfm(200, this.l / 2 - 100, this.m / 6 + 168, cah.a("gui.done")));
	}

	public String a(rg rg) {
		fb fb3 = new fh("");
		fb3.a(new fi("options.difficulty"));
		fb3.a(": ");
		fb3.a(new fi(rg.b()));
		return fb3.d();
	}

	@Override
	public void a(boolean boolean1, int integer) {
		this.j.a(this);
		if (integer == 109 && boolean1 && this.j.f != null) {
			this.j.f.T().e(true);
			this.r.b(true);
			this.r.l = false;
			this.i.l = false;
		}
	}

	@Override
	protected void a(char character, int integer) {
		if (integer == 1) {
			this.j.u.b();
		}

		super.a(character, integer);
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			if (bfm.k < 100 && bfm instanceof bfz) {
				beu.a a3 = ((bfz)bfm).c();
				this.h.a(a3, 1);
				bfm.j = this.h.c(beu.a.a(bfm.k));
			}

			if (bfm.k == 108) {
				this.j.f.T().a(rg.a(this.j.f.ae().a() + 1));
				this.i.j = this.a(this.j.f.ae());
			}

			if (bfm.k == 109) {
				this.j.a(new bgu(this, new fi("difficulty.lock.title").d(), new fi("difficulty.lock.question", new fi(this.j.f.T().x().b())).d(), 109));
			}

			if (bfm.k == 110) {
				this.j.u.b();
				this.j.a(new bhq(this));
			}

			if (bfm.k == 101) {
				this.j.u.b();
				this.j.a(new bhw(this, this.h));
			}

			if (bfm.k == 100) {
				this.j.u.b();
				this.j.a(new bie(this, this.h));
			}

			if (bfm.k == 102) {
				this.j.u.b();
				this.j.a(new bhg(this, this.h, this.j.Q()));
			}

			if (bfm.k == 103) {
				this.j.u.b();
				this.j.a(new bgq(this, this.h));
			}

			if (bfm.k == 104) {
				this.j.u.b();
				this.j.a(new bhr(this, this.h));
			}

			if (bfm.k == 200) {
				this.j.u.b();
				this.j.a(this.g);
			}

			if (bfm.k == 105) {
				this.j.u.b();
				this.j.a(new bjm(this));
			}

			if (bfm.k == 106) {
				this.j.u.b();
				this.j.a(new bhs(this, this.h));
			}
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.a(this.q, this.a, this.l / 2, 15, 16777215);
		super.a(integer1, integer2, float3);
	}
}
