public class bgw extends bho {
	private final bjy a;
	private axu f = axu.e();
	private String g;
	private String h;
	private String i;
	private bgw.a r;
	private bfm s;
	private bfm t;
	private bfm u;

	public bgw(bjy bjy, String string) {
		this.a = bjy;
		this.a(string);
	}

	public String a() {
		return this.f.toString();
	}

	public void a(String string) {
		this.f = axu.a(string);
	}

	@Override
	public void b() {
		this.n.clear();
		this.g = cah.a("createWorld.customize.flat.title");
		this.h = cah.a("createWorld.customize.flat.tile");
		this.i = cah.a("createWorld.customize.flat.height");
		this.r = new bgw.a();
		this.s = this.b(new bfm(2, this.l / 2 - 154, this.m - 52, 100, 20, cah.a("createWorld.customize.flat.addLayer") + " (NYI)"));
		this.t = this.b(new bfm(3, this.l / 2 - 50, this.m - 52, 100, 20, cah.a("createWorld.customize.flat.editLayer") + " (NYI)"));
		this.u = this.b(new bfm(4, this.l / 2 - 155, this.m - 52, 150, 20, cah.a("createWorld.customize.flat.removeLayer")));
		this.n.add(new bfm(0, this.l / 2 - 155, this.m - 28, 150, 20, cah.a("gui.done")));
		this.n.add(new bfm(5, this.l / 2 + 5, this.m - 52, 150, 20, cah.a("createWorld.customize.presets")));
		this.n.add(new bfm(1, this.l / 2 + 5, this.m - 28, 150, 20, cah.a("gui.cancel")));
		this.s.m = false;
		this.t.m = false;
		this.f.d();
		this.f();
	}

	@Override
	public void k() {
		super.k();
		this.r.p();
	}

	@Override
	protected void a(bfm bfm) {
		int integer3 = this.f.c().size() - this.r.u - 1;
		if (bfm.k == 1) {
			this.j.a(this.a);
		} else if (bfm.k == 0) {
			this.a.a = this.a();
			this.j.a(this.a);
		} else if (bfm.k == 5) {
			this.j.a(new bhl(this));
		} else if (bfm.k == 4 && this.g()) {
			this.f.c().remove(integer3);
			this.r.u = Math.min(this.r.u, this.f.c().size() - 1);
		}

		this.f.d();
		this.f();
	}

	public void f() {
		boolean boolean2 = this.g();
		this.u.l = boolean2;
		this.t.l = boolean2;
		this.t.l = false;
		this.s.l = false;
	}

	private boolean g() {
		return this.r.u > -1 && this.r.u < this.f.c().size();
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.r.a(integer1, integer2, float3);
		this.a(this.q, this.g, this.l / 2, 8, 16777215);
		int integer5 = this.l / 2 - 92 - 16;
		this.c(this.q, this.h, integer5, 32, 16777215);
		this.c(this.q, this.i, integer5 + 2 + 213 - this.q.a(this.i), 32, 16777215);
		super.a(integer1, integer2, float3);
	}

	class a extends bgd {
		public int u = -1;

		public a() {
			super(bgw.this.j, bgw.this.l, bgw.this.m, 43, bgw.this.m - 60, 24);
		}

		private void a(int integer1, int integer2, afj afj) {
			this.e(integer1 + 1, integer2 + 1);
			bqg.D();
			if (!afj.b()) {
				beq.c();
				bgw.this.k.a(afj, integer1 + 2, integer2 + 2);
				beq.a();
			}

			bqg.E();
		}

		private void e(int integer1, int integer2) {
			this.d(integer1, integer2, 0, 0);
		}

		private void d(int integer1, int integer2, int integer3, int integer4) {
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			this.a.N().a(bfi.c);
			float float6 = 0.0078125F;
			float float7 = 0.0078125F;
			int integer8 = 18;
			int integer9 = 18;
			bqs bqs10 = bqs.a();
			bpy bpy11 = bqs10.c();
			bpy11.a(7, bzh.g);
			bpy11.b((double)(integer1 + 0), (double)(integer2 + 18), (double)bgw.this.e)
				.a((double)((float)(integer3 + 0) * 0.0078125F), (double)((float)(integer4 + 18) * 0.0078125F))
				.d();
			bpy11.b((double)(integer1 + 18), (double)(integer2 + 18), (double)bgw.this.e)
				.a((double)((float)(integer3 + 18) * 0.0078125F), (double)((float)(integer4 + 18) * 0.0078125F))
				.d();
			bpy11.b((double)(integer1 + 18), (double)(integer2 + 0), (double)bgw.this.e)
				.a((double)((float)(integer3 + 18) * 0.0078125F), (double)((float)(integer4 + 0) * 0.0078125F))
				.d();
			bpy11.b((double)(integer1 + 0), (double)(integer2 + 0), (double)bgw.this.e)
				.a((double)((float)(integer3 + 0) * 0.0078125F), (double)((float)(integer4 + 0) * 0.0078125F))
				.d();
			bqs10.b();
		}

		@Override
		protected int b() {
			return bgw.this.f.c().size();
		}

		@Override
		protected void a(int integer1, boolean boolean2, int integer3, int integer4) {
			this.u = integer1;
			bgw.this.f();
		}

		@Override
		protected boolean a(int integer) {
			return integer == this.u;
		}

		@Override
		protected void a() {
		}

		@Override
		protected void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
			axv axv8 = (axv)bgw.this.f.c().get(bgw.this.f.c().size() - integer1 - 1);
			atl atl9 = axv8.c();
			alu alu10 = atl9.v();
			afh afh11 = afh.a(alu10);
			if (afh11 == afl.a) {
				if (alu10 == alv.j || alu10 == alv.i) {
					afh11 = afl.aA;
				} else if (alu10 == alv.l || alu10 == alv.k) {
					afh11 = afl.aB;
				}
			}

			afj afj12 = new afj(afh11, 1, afh11.l() ? alu10.e(atl9) : 0);
			String string13 = afh11.b(afj12);
			this.a(integer2, integer3, afj12);
			bgw.this.q.a(string13, integer2 + 18 + 5, integer3 + 3, 16777215);
			String string14;
			if (integer1 == 0) {
				string14 = cah.a("createWorld.customize.flat.layer.top", axv8.b());
			} else if (integer1 == bgw.this.f.c().size() - 1) {
				string14 = cah.a("createWorld.customize.flat.layer.bottom", axv8.b());
			} else {
				string14 = cah.a("createWorld.customize.flat.layer", axv8.b());
			}

			bgw.this.q.a(string14, integer2 + 2 + 213 - bgw.this.q.a(string14), integer3 + 3, 16777215);
		}

		@Override
		protected int d() {
			return this.b - 70;
		}
	}
}
