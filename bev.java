public class bev implements ov {
	private String a = "";
	private final bes b;
	private String c = "";
	private long d = bes.I();
	private boolean e;
	private final bfk f;
	private final bqr g;

	public bev(bes bes) {
		this.b = bes;
		this.f = new bfk(bes);
		this.g = new bqr(bes.d, bes.e, false);
		this.g.a(9728);
	}

	@Override
	public void b(String string) {
		this.e = false;
		this.d(string);
	}

	@Override
	public void a(String string) {
		this.e = true;
		this.d(string);
	}

	private void d(String string) {
		this.c = string;
		if (!this.b.C) {
			if (!this.e) {
				throw new bex();
			}
		} else {
			bqg.m(256);
			bqg.n(5889);
			bqg.F();
			if (cdb.j()) {
				int integer3 = this.f.e();
				bqg.a(0.0, (double)(this.f.a() * integer3), (double)(this.f.b() * integer3), 0.0, 100.0, 300.0);
			} else {
				bfk bfk3 = new bfk(this.b);
				bqg.a(0.0, bfk3.c(), bfk3.d(), 0.0, 100.0, 300.0);
			}

			bqg.n(5888);
			bqg.F();
			bqg.c(0.0F, 0.0F, -200.0F);
		}
	}

	@Override
	public void c(String string) {
		if (!this.b.C) {
			if (!this.e) {
				throw new bex();
			}
		} else {
			this.d = 0L;
			this.a = string;
			this.a(-1);
			this.d = 0L;
		}
	}

	@Override
	public void a(int integer) {
		if (!this.b.C) {
			if (!this.e) {
				throw new bex();
			}
		} else {
			long long3 = bes.I();
			if (long3 - this.d >= 100L) {
				this.d = long3;
				bfk bfk5 = new bfk(this.b);
				int integer6 = bfk5.e();
				int integer7 = bfk5.a();
				int integer8 = bfk5.b();
				if (cdb.j()) {
					this.g.f();
				} else {
					bqg.m(256);
				}

				this.g.a(false);
				bqg.n(5889);
				bqg.F();
				bqg.a(0.0, bfk5.c(), bfk5.d(), 0.0, 100.0, 300.0);
				bqg.n(5888);
				bqg.F();
				bqg.c(0.0F, 0.0F, -200.0F);
				if (!cdb.j()) {
					bqg.m(16640);
				}

				bqs bqs9 = bqs.a();
				bpy bpy10 = bqs9.c();
				this.b.N().a(bfi.b);
				float float11 = 32.0F;
				bpy10.a(7, bzh.i);
				bpy10.b(0.0, (double)integer8, 0.0).a(0.0, (double)((float)integer8 / 32.0F)).b(64, 64, 64, 255).d();
				bpy10.b((double)integer7, (double)integer8, 0.0).a((double)((float)integer7 / 32.0F), (double)((float)integer8 / 32.0F)).b(64, 64, 64, 255).d();
				bpy10.b((double)integer7, 0.0, 0.0).a((double)((float)integer7 / 32.0F), 0.0).b(64, 64, 64, 255).d();
				bpy10.b(0.0, 0.0, 0.0).a(0.0, 0.0).b(64, 64, 64, 255).d();
				bqs9.b();
				if (integer >= 0) {
					int integer12 = 100;
					int integer13 = 2;
					int integer14 = integer7 / 2 - 50;
					int integer15 = integer8 / 2 + 16;
					bqg.z();
					bpy10.a(7, bzh.f);
					bpy10.b((double)integer14, (double)integer15, 0.0).b(128, 128, 128, 255).d();
					bpy10.b((double)integer14, (double)(integer15 + 2), 0.0).b(128, 128, 128, 255).d();
					bpy10.b((double)(integer14 + 100), (double)(integer15 + 2), 0.0).b(128, 128, 128, 255).d();
					bpy10.b((double)(integer14 + 100), (double)integer15, 0.0).b(128, 128, 128, 255).d();
					bpy10.b((double)integer14, (double)integer15, 0.0).b(128, 255, 128, 255).d();
					bpy10.b((double)integer14, (double)(integer15 + 2), 0.0).b(128, 255, 128, 255).d();
					bpy10.b((double)(integer14 + integer), (double)(integer15 + 2), 0.0).b(128, 255, 128, 255).d();
					bpy10.b((double)(integer14 + integer), (double)integer15, 0.0).b(128, 255, 128, 255).d();
					bqs9.b();
					bqg.y();
				}

				bqg.m();
				bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
				this.b.k.a(this.c, (float)((integer7 - this.b.k.a(this.c)) / 2), (float)(integer8 / 2 - 4 - 16), 16777215);
				this.b.k.a(this.a, (float)((integer7 - this.b.k.a(this.a)) / 2), (float)(integer8 / 2 - 4 + 8), 16777215);
				this.g.e();
				if (cdb.j()) {
					this.g.c(integer7 * integer6, integer8 * integer6);
				}

				this.b.i();

				try {
					Thread.yield();
				} catch (Exception var15) {
				}
			}
		}
	}

	@Override
	public void a() {
	}
}
