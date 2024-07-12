import org.lwjgl.input.Mouse;

public abstract class bgd {
	protected final bes a;
	protected int b;
	protected int c;
	protected int d;
	protected int e;
	protected int f;
	protected int g;
	protected final int h;
	private int u;
	private int v;
	protected int i;
	protected int j;
	protected boolean k = true;
	protected int l = -2;
	protected float m;
	protected float n;
	protected int o = -1;
	protected long p;
	protected boolean q = true;
	protected boolean r = true;
	protected boolean s;
	protected int t;
	private boolean w = true;

	public bgd(bes bes, int integer2, int integer3, int integer4, int integer5, int integer6) {
		this.a = bes;
		this.b = integer2;
		this.c = integer3;
		this.d = integer4;
		this.e = integer5;
		this.h = integer6;
		this.g = 0;
		this.f = integer2;
	}

	public void a(int integer1, int integer2, int integer3, int integer4) {
		this.b = integer1;
		this.c = integer2;
		this.d = integer3;
		this.e = integer4;
		this.g = 0;
		this.f = integer1;
	}

	public void b(boolean boolean1) {
		this.r = boolean1;
	}

	protected void a(boolean boolean1, int integer) {
		this.s = boolean1;
		this.t = integer;
		if (!boolean1) {
			this.t = 0;
		}
	}

	protected abstract int b();

	protected abstract void a(int integer1, boolean boolean2, int integer3, int integer4);

	protected abstract boolean a(int integer);

	protected int k() {
		return this.b() * this.h + this.t;
	}

	protected abstract void a();

	protected void a(int integer1, int integer2, int integer3) {
	}

	protected abstract void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6);

	protected void a(int integer1, int integer2, bqs bqs) {
	}

	protected void a(int integer1, int integer2) {
	}

	protected void b(int integer1, int integer2) {
	}

	public int c(int integer1, int integer2) {
		int integer4 = this.g + this.b / 2 - this.c() / 2;
		int integer5 = this.g + this.b / 2 + this.c() / 2;
		int integer6 = integer2 - this.d - this.t + (int)this.n - 4;
		int integer7 = integer6 / this.h;
		return integer1 < this.d() && integer1 >= integer4 && integer1 <= integer5 && integer7 >= 0 && integer6 >= 0 && integer7 < this.b() ? integer7 : -1;
	}

	public void d(int integer1, int integer2) {
		this.u = integer1;
		this.v = integer2;
	}

	protected void l() {
		this.n = ot.a(this.n, 0.0F, (float)this.m());
	}

	public int m() {
		return Math.max(0, this.k() - (this.e - this.d - 4));
	}

	public int n() {
		return (int)this.n;
	}

	public boolean g(int integer) {
		return integer >= this.d && integer <= this.e && this.i >= this.g && this.i <= this.f;
	}

	public void h(int integer) {
		this.n += (float)integer;
		this.l();
		this.l = -2;
	}

	public void a(bfm bfm) {
		if (bfm.l) {
			if (bfm.k == this.u) {
				this.n = this.n - (float)(this.h * 2 / 3);
				this.l = -2;
				this.l();
			} else if (bfm.k == this.v) {
				this.n = this.n + (float)(this.h * 2 / 3);
				this.l = -2;
				this.l();
			}
		}
	}

	public void a(int integer1, int integer2, float float3) {
		if (this.q) {
			this.i = integer1;
			this.j = integer2;
			this.a();
			int integer5 = this.d();
			int integer6 = integer5 + 6;
			this.l();
			bqg.g();
			bqg.p();
			bqs bqs7 = bqs.a();
			bpy bpy8 = bqs7.c();
			this.a.N().a(bfi.b);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			float float9 = 32.0F;
			bpy8.a(7, bzh.i);
			bpy8.b((double)this.g, (double)this.e, 0.0).a((double)((float)this.g / 32.0F), (double)((float)(this.e + (int)this.n) / 32.0F)).b(32, 32, 32, 255).d();
			bpy8.b((double)this.f, (double)this.e, 0.0).a((double)((float)this.f / 32.0F), (double)((float)(this.e + (int)this.n) / 32.0F)).b(32, 32, 32, 255).d();
			bpy8.b((double)this.f, (double)this.d, 0.0).a((double)((float)this.f / 32.0F), (double)((float)(this.d + (int)this.n) / 32.0F)).b(32, 32, 32, 255).d();
			bpy8.b((double)this.g, (double)this.d, 0.0).a((double)((float)this.g / 32.0F), (double)((float)(this.d + (int)this.n) / 32.0F)).b(32, 32, 32, 255).d();
			bqs7.b();
			int integer10 = this.g + this.b / 2 - this.c() / 2 + 2;
			int integer11 = this.d + 4 - (int)this.n;
			if (this.s) {
				this.a(integer10, integer11, bqs7);
			}

			this.b(integer10, integer11, integer1, integer2);
			bqg.j();
			this.c(0, this.d, 255, 255);
			this.c(this.e, this.c, 255, 255);
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ZERO, bqg.l.ONE);
			bqg.d();
			bqg.j(7425);
			bqg.z();
			int integer12 = 4;
			bpy8.a(7, bzh.i);
			bpy8.b((double)this.g, (double)(this.d + 4), 0.0).a(0.0, 1.0).b(0, 0, 0, 0).d();
			bpy8.b((double)this.f, (double)(this.d + 4), 0.0).a(1.0, 1.0).b(0, 0, 0, 0).d();
			bpy8.b((double)this.f, (double)this.d, 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
			bpy8.b((double)this.g, (double)this.d, 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
			bqs7.b();
			bpy8.a(7, bzh.i);
			bpy8.b((double)this.g, (double)this.e, 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
			bpy8.b((double)this.f, (double)this.e, 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
			bpy8.b((double)this.f, (double)(this.e - 4), 0.0).a(1.0, 0.0).b(0, 0, 0, 0).d();
			bpy8.b((double)this.g, (double)(this.e - 4), 0.0).a(0.0, 0.0).b(0, 0, 0, 0).d();
			bqs7.b();
			int integer13 = this.m();
			if (integer13 > 0) {
				int integer14 = (this.e - this.d) * (this.e - this.d) / this.k();
				integer14 = ot.a(integer14, 32, this.e - this.d - 8);
				int integer15 = (int)this.n * (this.e - this.d - integer14) / integer13 + this.d;
				if (integer15 < this.d) {
					integer15 = this.d;
				}

				bpy8.a(7, bzh.i);
				bpy8.b((double)integer5, (double)this.e, 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
				bpy8.b((double)integer6, (double)this.e, 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
				bpy8.b((double)integer6, (double)this.d, 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
				bpy8.b((double)integer5, (double)this.d, 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
				bqs7.b();
				bpy8.a(7, bzh.i);
				bpy8.b((double)integer5, (double)(integer15 + integer14), 0.0).a(0.0, 1.0).b(128, 128, 128, 255).d();
				bpy8.b((double)integer6, (double)(integer15 + integer14), 0.0).a(1.0, 1.0).b(128, 128, 128, 255).d();
				bpy8.b((double)integer6, (double)integer15, 0.0).a(1.0, 0.0).b(128, 128, 128, 255).d();
				bpy8.b((double)integer5, (double)integer15, 0.0).a(0.0, 0.0).b(128, 128, 128, 255).d();
				bqs7.b();
				bpy8.a(7, bzh.i);
				bpy8.b((double)integer5, (double)(integer15 + integer14 - 1), 0.0).a(0.0, 1.0).b(192, 192, 192, 255).d();
				bpy8.b((double)(integer6 - 1), (double)(integer15 + integer14 - 1), 0.0).a(1.0, 1.0).b(192, 192, 192, 255).d();
				bpy8.b((double)(integer6 - 1), (double)integer15, 0.0).a(1.0, 0.0).b(192, 192, 192, 255).d();
				bpy8.b((double)integer5, (double)integer15, 0.0).a(0.0, 0.0).b(192, 192, 192, 255).d();
				bqs7.b();
			}

			this.b(integer1, integer2);
			bqg.y();
			bqg.j(7424);
			bqg.e();
			bqg.l();
		}
	}

	public void p() {
		if (this.g(this.j)) {
			if (Mouse.getEventButton() == 0 && Mouse.getEventButtonState() && this.j >= this.d && this.j <= this.e) {
				int integer2 = (this.b - this.c()) / 2;
				int integer3 = (this.b + this.c()) / 2;
				int integer4 = this.j - this.d - this.t + (int)this.n - 4;
				int integer5 = integer4 / this.h;
				if (integer5 < this.b() && this.i >= integer2 && this.i <= integer3 && integer5 >= 0 && integer4 >= 0) {
					this.a(integer5, false, this.i, this.j);
					this.o = integer5;
				} else if (this.i >= integer2 && this.i <= integer3 && integer4 < 0) {
					this.a(this.i - integer2, this.j - this.d + (int)this.n - 4);
				}
			}

			if (!Mouse.isButtonDown(0) || !this.q()) {
				this.l = -1;
			} else if (this.l == -1) {
				boolean boolean2 = true;
				if (this.j >= this.d && this.j <= this.e) {
					int integer3 = (this.b - this.c()) / 2;
					int integer4 = (this.b + this.c()) / 2;
					int integer5 = this.j - this.d - this.t + (int)this.n - 4;
					int integer6 = integer5 / this.h;
					if (integer6 < this.b() && this.i >= integer3 && this.i <= integer4 && integer6 >= 0 && integer5 >= 0) {
						boolean boolean7 = integer6 == this.o && bes.I() - this.p < 250L;
						this.a(integer6, boolean7, this.i, this.j);
						this.o = integer6;
						this.p = bes.I();
					} else if (this.i >= integer3 && this.i <= integer4 && integer5 < 0) {
						this.a(this.i - integer3, this.j - this.d + (int)this.n - 4);
						boolean2 = false;
					}

					int integer7 = this.d();
					int integer8 = integer7 + 6;
					if (this.i >= integer7 && this.i <= integer8) {
						this.m = -1.0F;
						int integer9 = this.m();
						if (integer9 < 1) {
							integer9 = 1;
						}

						int integer10 = (int)((float)((this.e - this.d) * (this.e - this.d)) / (float)this.k());
						integer10 = ot.a(integer10, 32, this.e - this.d - 8);
						this.m = this.m / ((float)(this.e - this.d - integer10) / (float)integer9);
					} else {
						this.m = 1.0F;
					}

					if (boolean2) {
						this.l = this.j;
					} else {
						this.l = -2;
					}
				} else {
					this.l = -2;
				}
			} else if (this.l >= 0) {
				this.n = this.n - (float)(this.j - this.l) * this.m;
				this.l = this.j;
			}

			int integer2 = Mouse.getEventDWheel();
			if (integer2 != 0) {
				if (integer2 > 0) {
					integer2 = -1;
				} else if (integer2 < 0) {
					integer2 = 1;
				}

				this.n = this.n + (float)(integer2 * this.h / 2);
			}
		}
	}

	public void d(boolean boolean1) {
		this.w = boolean1;
	}

	public boolean q() {
		return this.w;
	}

	public int c() {
		return 220;
	}

	protected void b(int integer1, int integer2, int integer3, int integer4) {
		int integer6 = this.b();
		bqs bqs7 = bqs.a();
		bpy bpy8 = bqs7.c();

		for (int integer9 = 0; integer9 < integer6; integer9++) {
			int integer10 = integer2 + integer9 * this.h + this.t;
			int integer11 = this.h - 4;
			if (integer10 > this.e || integer10 + integer11 < this.d) {
				this.a(integer9, integer1, integer10);
			}

			if (this.r && this.a(integer9)) {
				int integer12 = this.g + (this.b / 2 - this.c() / 2);
				int integer13 = this.g + this.b / 2 + this.c() / 2;
				bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
				bqg.z();
				bpy8.a(7, bzh.i);
				bpy8.b((double)integer12, (double)(integer10 + integer11 + 2), 0.0).a(0.0, 1.0).b(128, 128, 128, 255).d();
				bpy8.b((double)integer13, (double)(integer10 + integer11 + 2), 0.0).a(1.0, 1.0).b(128, 128, 128, 255).d();
				bpy8.b((double)integer13, (double)(integer10 - 2), 0.0).a(1.0, 0.0).b(128, 128, 128, 255).d();
				bpy8.b((double)integer12, (double)(integer10 - 2), 0.0).a(0.0, 0.0).b(128, 128, 128, 255).d();
				bpy8.b((double)(integer12 + 1), (double)(integer10 + integer11 + 1), 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
				bpy8.b((double)(integer13 - 1), (double)(integer10 + integer11 + 1), 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
				bpy8.b((double)(integer13 - 1), (double)(integer10 - 1), 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
				bpy8.b((double)(integer12 + 1), (double)(integer10 - 1), 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
				bqs7.b();
				bqg.y();
			}

			this.a(integer9, integer1, integer10, integer11, integer3, integer4);
		}
	}

	protected int d() {
		return this.b / 2 + 124;
	}

	protected void c(int integer1, int integer2, int integer3, int integer4) {
		bqs bqs6 = bqs.a();
		bpy bpy7 = bqs6.c();
		this.a.N().a(bfi.b);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		float float8 = 32.0F;
		bpy7.a(7, bzh.i);
		bpy7.b((double)this.g, (double)integer2, 0.0).a(0.0, (double)((float)integer2 / 32.0F)).b(64, 64, 64, integer4).d();
		bpy7.b((double)(this.g + this.b), (double)integer2, 0.0).a((double)((float)this.b / 32.0F), (double)((float)integer2 / 32.0F)).b(64, 64, 64, integer4).d();
		bpy7.b((double)(this.g + this.b), (double)integer1, 0.0).a((double)((float)this.b / 32.0F), (double)((float)integer1 / 32.0F)).b(64, 64, 64, integer3).d();
		bpy7.b((double)this.g, (double)integer1, 0.0).a(0.0, (double)((float)integer1 / 32.0F)).b(64, 64, 64, integer3).d();
		bqs6.b();
	}

	public void i(int integer) {
		this.g = integer;
		this.f = integer + this.b;
	}

	public int r() {
		return this.h;
	}
}
