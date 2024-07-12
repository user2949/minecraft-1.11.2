import javax.annotation.Nullable;

public class bgz extends bho {
	private int a;
	private final fb f;

	public bgz(@Nullable fb fb) {
		this.f = fb;
	}

	@Override
	public void b() {
		this.n.clear();
		this.a = 0;
		if (this.j.f.T().s()) {
			this.n.add(new bfm(0, this.l / 2 - 100, this.m / 4 + 72, cah.a("deathScreen.spectate")));
			this.n.add(new bfm(1, this.l / 2 - 100, this.m / 4 + 96, cah.a("deathScreen." + (this.j.D() ? "deleteWorld" : "leaveServer"))));
		} else {
			this.n.add(new bfm(0, this.l / 2 - 100, this.m / 4 + 72, cah.a("deathScreen.respawn")));
			this.n.add(new bfm(1, this.l / 2 - 100, this.m / 4 + 96, cah.a("deathScreen.titleScreen")));
			if (this.j.K() == null) {
				((bfm)this.n.get(1)).l = false;
			}
		}

		for (bfm bfm3 : this.n) {
			bfm3.l = false;
		}
	}

	@Override
	protected void a(char character, int integer) {
	}

	@Override
	protected void a(bfm bfm) {
		switch (bfm.k) {
			case 0:
				this.j.h.cQ();
				this.j.a(null);
				break;
			case 1:
				if (this.j.f.T().s()) {
					this.j.a(new bhv());
				} else {
					bgu bgu3 = new bgu(this, cah.a("deathScreen.quit.confirm"), "", cah.a("deathScreen.titleScreen"), cah.a("deathScreen.respawn"), 0);
					this.j.a(bgu3);
					bgu3.b(20);
				}
		}
	}

	@Override
	public void a(boolean boolean1, int integer) {
		if (boolean1) {
			if (this.j.f != null) {
				this.j.f.M();
			}

			this.j.a(null);
			this.j.a(new bhv());
		} else {
			this.j.h.cQ();
			this.j.a(null);
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		boolean boolean5 = this.j.f.T().s();
		this.a(0, 0, this.l, this.m, 1615855616, -1602211792);
		bqg.G();
		bqg.b(2.0F, 2.0F, 2.0F);
		this.a(this.q, cah.a(boolean5 ? "deathScreen.title.hardcore" : "deathScreen.title"), this.l / 2 / 2, 30, 16777215);
		bqg.H();
		if (this.f != null) {
			this.a(this.q, this.f.d(), this.l / 2, 85, 16777215);
		}

		this.a(this.q, cah.a("deathScreen.score") + ": " + a.YELLOW + this.j.h.cM(), this.l / 2, 100, 16777215);
		if (this.f != null && integer2 > 85 && integer2 < 85 + this.q.a) {
			fb fb6 = this.b(integer1);
			if (fb6 != null && fb6.b().i() != null) {
				this.a(fb6, integer1, integer2);
			}
		}

		super.a(integer1, integer2, float3);
	}

	@Nullable
	public fb b(int integer) {
		if (this.f == null) {
			return null;
		} else {
			int integer3 = this.j.k.a(this.f.d());
			int integer4 = this.l / 2 - integer3 / 2;
			int integer5 = this.l / 2 + integer3 / 2;
			int integer6 = integer4;
			if (integer >= integer4 && integer <= integer5) {
				for (fb fb8 : this.f) {
					integer6 += this.j.k.a(bfo.a(fb8.e(), false));
					if (integer6 > integer) {
						return fb8;
					}
				}

				return null;
			} else {
				return null;
			}
		}
	}

	@Override
	public boolean d() {
		return false;
	}

	@Override
	public void e() {
		super.e();
		this.a++;
		if (this.a == 20) {
			for (bfm bfm3 : this.n) {
				bfm3.l = true;
			}
		}
	}
}
