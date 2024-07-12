public class bhs extends bho {
	private final bho f;
	private final beu g;
	protected String a = "Options";
	private String h;

	public bhs(bho bho, beu beu) {
		this.f = bho;
		this.g = beu;
	}

	@Override
	public void b() {
		this.a = cah.a("options.sounds.title");
		this.h = cah.a("options.off");
		int integer2 = 0;
		this.n.add(new bhs.a(no.MASTER.ordinal(), this.l / 2 - 155 + integer2 % 2 * 160, this.m / 6 - 12 + 24 * (integer2 >> 1), no.MASTER, true));
		integer2 += 2;

		for (no no6 : no.values()) {
			if (no6 != no.MASTER) {
				this.n.add(new bhs.a(no6.ordinal(), this.l / 2 - 155 + integer2 % 2 * 160, this.m / 6 - 12 + 24 * (integer2 >> 1), no6, false));
				integer2++;
			}
		}

		this.n.add(new bfz(201, this.l / 2 - 75, this.m / 6 - 12 + 24 * (++integer2 >> 1), beu.a.SHOW_SUBTITLES, this.g.c(beu.a.SHOW_SUBTITLES)));
		this.n.add(new bfm(200, this.l / 2 - 100, this.m / 6 + 168, cah.a("gui.done")));
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
				this.j.a(this.f);
			} else if (bfm.k == 201) {
				this.j.u.a(beu.a.SHOW_SUBTITLES, 1);
				bfm.j = this.j.u.c(beu.a.SHOW_SUBTITLES);
				this.j.u.b();
			}
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.a(this.q, this.a, this.l / 2, 15, 16777215);
		super.a(integer1, integer2, float3);
	}

	protected String a(no no) {
		float float3 = this.g.a(no);
		return float3 == 0.0F ? this.h : (int)(float3 * 100.0F) + "%";
	}

	class a extends bfm {
		private final no r;
		private final String s;
		public float o = 1.0F;
		public boolean p;

		public a(int integer2, int integer3, int integer4, no no, boolean boolean6) {
			super(integer2, integer3, integer4, boolean6 ? 310 : 150, 20, "");
			this.r = no;
			this.s = cah.a("soundCategory." + no.a());
			this.j = this.s + ": " + bhs.this.a(no);
			this.o = bhs.this.g.a(no);
		}

		@Override
		protected int a(boolean boolean1) {
			return 0;
		}

		@Override
		protected void b(bes bes, int integer2, int integer3) {
			if (this.m) {
				if (this.p) {
					this.o = (float)(integer2 - (this.h + 4)) / (float)(this.f - 8);
					this.o = ot.a(this.o, 0.0F, 1.0F);
					bes.u.a(this.r, this.o);
					bes.u.b();
					this.j = this.s + ": " + bhs.this.a(this.r);
				}

				bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
				this.b(this.h + (int)(this.o * (float)(this.f - 8)), this.i, 0, 66, 4, 20);
				this.b(this.h + (int)(this.o * (float)(this.f - 8)) + 4, this.i, 196, 66, 4, 20);
			}
		}

		@Override
		public boolean c(bes bes, int integer2, int integer3) {
			if (super.c(bes, integer2, integer3)) {
				this.o = (float)(integer2 - (this.h + 4)) / (float)(this.f - 8);
				this.o = ot.a(this.o, 0.0F, 1.0F);
				bes.u.a(this.r, this.o);
				bes.u.b();
				this.j = this.s + ": " + bhs.this.a(this.r);
				this.p = true;
				return true;
			} else {
				return false;
			}
		}

		@Override
		public void a(ccs ccs) {
		}

		@Override
		public void a(int integer1, int integer2) {
			if (this.p) {
				bhs.this.j.U().a(cby.a(nn.hb, 1.0F));
			}

			this.p = false;
		}
	}
}
