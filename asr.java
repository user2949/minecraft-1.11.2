import javax.annotation.Nullable;

public class asr extends asc implements lf {
	private final aji a = new aji() {
		@Override
		public void a(int integer) {
			asr.this.b.c(asr.this.c, alv.ac, integer, 0);
		}

		@Override
		public ajs a() {
			return asr.this.b;
		}

		@Override
		public co b() {
			return asr.this.c;
		}

		@Override
		public void a(akc akc) {
			super.a(akc);
			if (this.a() != null) {
				atl atl3 = this.a().o(this.b());
				this.a().a(asr.this.c, atl3, atl3, 4);
			}
		}
	};

	public static void a(ph ph) {
		ph.a(pf.BLOCK_ENTITY, new pj() {
			@Override
			public du a(pg pg, du du, int integer) {
				if (asc.a(asr.class).equals(new kq(du.l("id")))) {
					if (du.b("SpawnPotentials", 9)) {
						ea ea5 = du.c("SpawnPotentials", 10);

						for (int integer6 = 0; integer6 < ea5.c(); integer6++) {
							du du7 = ea5.b(integer6);
							du7.a("Entity", pg.a(pf.ENTITY, du7.o("Entity"), integer));
						}
					}

					du.a("SpawnData", pg.a(pf.ENTITY, du.o("SpawnData"), integer));
				}

				return du;
			}
		});
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.a.a(du);
	}

	@Override
	public du b(du du) {
		super.b(du);
		this.a.b(du);
		return du;
	}

	@Override
	public void F_() {
		this.a.c();
	}

	@Nullable
	@Override
	public fz c() {
		return new fz(this.c, 1, this.d());
	}

	@Override
	public du d() {
		du du2 = this.b(new du());
		du2.q("SpawnPotentials");
		return du2;
	}

	@Override
	public boolean c(int integer1, int integer2) {
		return this.a.b(integer1) ? true : super.c(integer1, integer2);
	}

	@Override
	public boolean C() {
		return true;
	}

	public aji a() {
		return this.a;
	}
}
