import io.netty.buffer.Unpooled;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bii extends big {
	private static final Logger u = LogManager.getLogger();
	private static final kq v = new kq("textures/gui/container/beacon.png");
	private final rc w;
	private bii.b x;
	private boolean y;

	public bii(aax aax, rc rc) {
		super(new acn(aax, rc));
		this.w = rc;
		this.f = 230;
		this.g = 219;
	}

	@Override
	public void b() {
		super.b();
		this.x = new bii.b(-1, this.i + 164, this.r + 107);
		this.n.add(this.x);
		this.n.add(new bii.a(-2, this.i + 190, this.r + 107));
		this.y = true;
		this.x.l = false;
	}

	@Override
	public void e() {
		super.e();
		int integer2 = this.w.c_(0);
		sg sg3 = sg.a(this.w.c_(1));
		sg sg4 = sg.a(this.w.c_(2));
		if (this.y && integer2 >= 0) {
			this.y = false;
			int integer5 = 100;

			for (int integer6 = 0; integer6 <= 2; integer6++) {
				int integer7 = asb.a[integer6].length;
				int integer8 = integer7 * 22 + (integer7 - 1) * 2;

				for (int integer9 = 0; integer9 < integer7; integer9++) {
					sg sg10 = asb.a[integer6][integer9];
					bii.c c11 = new bii.c(integer5++, this.i + 76 + integer9 * 24 - integer8 / 2, this.r + 22 + integer6 * 25, sg10, integer6);
					this.n.add(c11);
					if (integer6 >= integer2) {
						c11.l = false;
					} else if (sg10 == sg3) {
						c11.b(true);
					}
				}
			}

			int integer6 = 3;
			int integer7 = asb.a[3].length + 1;
			int integer8 = integer7 * 22 + (integer7 - 1) * 2;

			for (int integer9x = 0; integer9x < integer7 - 1; integer9x++) {
				sg sg10 = asb.a[3][integer9x];
				bii.c c11 = new bii.c(integer5++, this.i + 167 + integer9x * 24 - integer8 / 2, this.r + 47, sg10, 3);
				this.n.add(c11);
				if (3 >= integer2) {
					c11.l = false;
				} else if (sg10 == sg4) {
					c11.b(true);
				}
			}

			if (sg3 != null) {
				bii.c c9 = new bii.c(integer5++, this.i + 167 + (integer7 - 1) * 24 - integer8 / 2, this.r + 47, sg3, 3);
				this.n.add(c9);
				if (3 >= integer2) {
					c9.l = false;
				} else if (sg3 == sg4) {
					c9.b(true);
				}
			}
		}

		this.x.l = !this.w.a(0).b() && sg3 != null;
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.k == -2) {
			this.j.h.d.a(new iv(this.j.h.bu.d));
			this.j.a(null);
		} else if (bfm.k == -1) {
			String string3 = "MC|Beacon";
			et et4 = new et(Unpooled.buffer());
			et4.writeInt(this.w.c_(1));
			et4.writeInt(this.w.c_(2));
			this.j.v().a(new iw("MC|Beacon", et4));
			this.j.h.d.a(new iv(this.j.h.bu.d));
			this.j.a(null);
		} else if (bfm instanceof bii.c) {
			bii.c c3 = (bii.c)bfm;
			if (c3.c()) {
				return;
			}

			int integer4 = sg.a(c3.p);
			if (c3.q < 3) {
				this.w.b(1, integer4);
			} else {
				this.w.b(2, integer4);
			}

			this.n.clear();
			this.b();
			this.e();
		}
	}

	@Override
	protected void b(int integer1, int integer2) {
		beq.a();
		this.a(this.q, cah.a("tile.beacon.primary"), 62, 10, 14737632);
		this.a(this.q, cah.a("tile.beacon.secondary"), 169, 10, 14737632);

		for (bfm bfm5 : this.n) {
			if (bfm5.a()) {
				bfm5.b(integer1 - this.i, integer2 - this.r);
				break;
			}
		}

		beq.c();
	}

	@Override
	protected void a(float float1, int integer2, int integer3) {
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.j.N().a(v);
		int integer5 = (this.l - this.f) / 2;
		int integer6 = (this.m - this.g) / 2;
		this.b(integer5, integer6, 0, 0, this.f, this.g);
		this.k.a = 100.0F;
		this.k.b(new afj(afl.bZ), integer5 + 42, integer6 + 109);
		this.k.b(new afj(afl.l), integer5 + 42 + 22, integer6 + 109);
		this.k.b(new afj(afl.n), integer5 + 42 + 44, integer6 + 109);
		this.k.b(new afj(afl.m), integer5 + 42 + 66, integer6 + 109);
		this.k.a = 0.0F;
	}

	class a extends bii.d {
		public a(int integer2, int integer3, int integer4) {
			super(integer2, integer3, integer4, bii.v, 112, 220);
		}

		@Override
		public void b(int integer1, int integer2) {
			bii.this.a(cah.a("gui.cancel"), integer1, integer2);
		}
	}

	class b extends bii.d {
		public b(int integer2, int integer3, int integer4) {
			super(integer2, integer3, integer4, bii.v, 90, 220);
		}

		@Override
		public void b(int integer1, int integer2) {
			bii.this.a(cah.a("gui.done"), integer1, integer2);
		}
	}

	class c extends bii.d {
		private final sg p;
		private final int q;

		public c(int integer2, int integer3, int integer4, sg sg, int integer6) {
			super(integer2, integer3, integer4, big.a, sg.d() % 8 * 18, 198 + sg.d() / 8 * 18);
			this.p = sg;
			this.q = integer6;
		}

		@Override
		public void b(int integer1, int integer2) {
			String string4 = cah.a(this.p.a());
			if (this.q >= 3 && this.p != si.j) {
				string4 = string4 + " II";
			}

			bii.this.a(string4, integer1, integer2);
		}
	}

	static class d extends bfm {
		private final kq o;
		private final int p;
		private final int q;
		private boolean r;

		protected d(int integer1, int integer2, int integer3, kq kq, int integer5, int integer6) {
			super(integer1, integer2, integer3, 22, 22, "");
			this.o = kq;
			this.p = integer5;
			this.q = integer6;
		}

		@Override
		public void a(bes bes, int integer2, int integer3) {
			if (this.m) {
				bes.N().a(bii.v);
				bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
				this.n = integer2 >= this.h && integer3 >= this.i && integer2 < this.h + this.f && integer3 < this.i + this.g;
				int integer5 = 219;
				int integer6 = 0;
				if (!this.l) {
					integer6 += this.f * 2;
				} else if (this.r) {
					integer6 += this.f * 1;
				} else if (this.n) {
					integer6 += this.f * 3;
				}

				this.b(this.h, this.i, integer6, 219, this.f, this.g);
				if (!bii.v.equals(this.o)) {
					bes.N().a(this.o);
				}

				this.b(this.h + 2, this.i + 2, this.p, this.q, 18, 18);
			}
		}

		public boolean c() {
			return this.r;
		}

		public void b(boolean boolean1) {
			this.r = boolean1;
		}
	}
}
