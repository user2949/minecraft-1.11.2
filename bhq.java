public class bhq extends bho {
	private final bho a;
	private String f;

	public bhq(bho bho) {
		this.a = bho;
	}

	@Override
	public void b() {
		int integer2 = 0;
		this.f = cah.a("options.skinCustomisation.title");

		for (aaz aaz6 : aaz.values()) {
			this.n.add(new bhq.a(aaz6.b(), this.l / 2 - 155 + integer2 % 2 * 160, this.m / 6 + 24 * (integer2 >> 1), 150, 20, aaz6));
			integer2++;
		}

		this.n.add(new bfz(199, this.l / 2 - 155 + integer2 % 2 * 160, this.m / 6 + 24 * (integer2 >> 1), beu.a.MAIN_HAND, this.j.u.c(beu.a.MAIN_HAND)));
		if (++integer2 % 2 == 1) {
			integer2++;
		}

		this.n.add(new bfm(200, this.l / 2 - 100, this.m / 6 + 24 * (integer2 >> 1), cah.a("gui.done")));
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
			if (bfm.k == 200) {
				this.j.u.b();
				this.j.a(this.a);
			} else if (bfm.k == 199) {
				this.j.u.a(beu.a.MAIN_HAND, 1);
				bfm.j = this.j.u.c(beu.a.MAIN_HAND);
				this.j.u.c();
			} else if (bfm instanceof bhq.a) {
				aaz aaz3 = ((bhq.a)bfm).p;
				this.j.u.a(aaz3);
				bfm.j = this.a(aaz3);
			}
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.a(this.q, this.f, this.l / 2, 20, 16777215);
		super.a(integer1, integer2, float3);
	}

	private String a(aaz aaz) {
		String string3;
		if (this.j.u.d().contains(aaz)) {
			string3 = cah.a("options.on");
		} else {
			string3 = cah.a("options.off");
		}

		return aaz.d().d() + ": " + string3;
	}

	class a extends bfm {
		private final aaz p;

		private a(int integer2, int integer3, int integer4, int integer5, int integer6, aaz aaz) {
			super(integer2, integer3, integer4, integer5, integer6, bhq.this.a(aaz));
			this.p = aaz;
		}
	}
}
