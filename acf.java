public class acf extends aby {
	private final aji a = new aji() {
		@Override
		public void a(int integer) {
			acf.this.l.a(acf.this, (byte)integer);
		}

		@Override
		public ajs a() {
			return acf.this.l;
		}

		@Override
		public co b() {
			return new co(acf.this);
		}
	};

	public acf(ajs ajs) {
		super(ajs);
	}

	public acf(ajs ajs, double double2, double double3, double double4) {
		super(ajs, double2, double3, double4);
	}

	public static void a(ph ph) {
		a(ph, acf.class);
		ph.a(pf.ENTITY, new pj() {
			@Override
			public du a(pg pg, du du, int integer) {
				String string5 = du.l("id");
				if (sp.a(acf.class).equals(new kq(string5))) {
					du.a("id", asc.a(asr.class).toString());
					pg.a(pf.BLOCK_ENTITY, du, integer);
					du.a("id", string5);
				}

				return du;
			}
		});
	}

	@Override
	public aby.a v() {
		return aby.a.SPAWNER;
	}

	@Override
	public atl x() {
		return alv.ac.t();
	}

	@Override
	protected void a(du du) {
		super.a(du);
		this.a.a(du);
	}

	@Override
	protected void b(du du) {
		super.b(du);
		this.a.b(du);
	}

	@Override
	public void a(byte byte1) {
		this.a.b(byte1);
	}

	@Override
	public void A_() {
		super.A_();
		this.a.c();
	}
}
