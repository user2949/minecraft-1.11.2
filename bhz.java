import java.util.Random;
import org.lwjgl.input.Mouse;

public class bhz extends bho implements bib {
	private static final int y = nr.a * 24 - 112;
	private static final int z = nr.b * 24 - 112;
	private static final int A = nr.c * 24 - 77;
	private static final int B = nr.d * 24 - 77;
	private static final kq C = new kq("textures/gui/achievement/achievement_background.png");
	protected bho a;
	protected int f = 256;
	protected int g = 202;
	protected int h;
	protected int i;
	protected float r = 1.0F;
	protected double s;
	protected double t;
	protected double u;
	protected double v;
	protected double w;
	protected double x;
	private int D;
	private final ob E;
	private boolean F = true;

	public bhz(bho bho, ob ob) {
		this.a = bho;
		this.E = ob;
		int integer4 = 141;
		int integer5 = 141;
		this.w = (double)(nr.f.a * 24 - 70 - 12);
		this.s = this.w;
		this.u = this.w;
		this.x = (double)(nr.f.b * 24 - 70);
		this.t = this.x;
		this.v = this.x;
	}

	@Override
	public void b() {
		this.j.v().a(new iq(iq.a.REQUEST_STATS));
		this.n.clear();
		this.n.add(new bfz(1, this.l / 2 + 24, this.m / 2 + 74, 80, 20, cah.a("gui.done")));
	}

	@Override
	protected void a(bfm bfm) {
		if (!this.F) {
			if (bfm.k == 1) {
				this.j.a(this.a);
			}
		}
	}

	@Override
	protected void a(char character, int integer) {
		if (integer == this.j.u.Z.j()) {
			this.j.a(null);
			this.j.o();
		} else {
			super.a(character, integer);
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		if (this.F) {
			this.c();
			this.a(this.q, cah.a("multiplayer.downloadingStats"), this.l / 2, this.m / 2, 16777215);
			this.a(this.q, c_[(int)(bes.I() / 150L % (long)c_.length)], this.l / 2, this.m / 2 + this.q.a * 2, 16777215);
		} else {
			if (Mouse.isButtonDown(0)) {
				int integer5 = (this.l - this.f) / 2;
				int integer6 = (this.m - this.g) / 2;
				int integer7 = integer5 + 8;
				int integer8 = integer6 + 17;
				if ((this.D == 0 || this.D == 1) && integer1 >= integer7 && integer1 < integer7 + 224 && integer2 >= integer8 && integer2 < integer8 + 155) {
					if (this.D == 0) {
						this.D = 1;
					} else {
						this.u = this.u - (double)((float)(integer1 - this.h) * this.r);
						this.v = this.v - (double)((float)(integer2 - this.i) * this.r);
						this.s = this.u;
						this.t = this.v;
						this.w = this.u;
						this.x = this.v;
					}

					this.h = integer1;
					this.i = integer2;
				}
			} else {
				this.D = 0;
			}

			int integer5 = Mouse.getDWheel();
			float float6 = this.r;
			if (integer5 < 0) {
				this.r += 0.25F;
			} else if (integer5 > 0) {
				this.r -= 0.25F;
			}

			this.r = ot.a(this.r, 1.0F, 2.0F);
			if (this.r != float6) {
				float float7 = float6 * (float)this.f;
				float float8 = float6 * (float)this.g;
				float float9 = this.r * (float)this.f;
				float float10 = this.r * (float)this.g;
				this.u -= (double)((float9 - float7) * 0.5F);
				this.v -= (double)((float10 - float8) * 0.5F);
				this.s = this.u;
				this.t = this.v;
				this.w = this.u;
				this.x = this.v;
			}

			if (this.w < (double)y) {
				this.w = (double)y;
			}

			if (this.x < (double)z) {
				this.x = (double)z;
			}

			if (this.w >= (double)A) {
				this.w = (double)(A - 1);
			}

			if (this.x >= (double)B) {
				this.x = (double)(B - 1);
			}

			this.c();
			this.b(integer1, integer2, float3);
			bqg.g();
			bqg.j();
			this.f();
			bqg.f();
			bqg.k();
		}
	}

	@Override
	public void a() {
		if (this.F) {
			this.F = false;
		}
	}

	@Override
	public void e() {
		if (!this.F) {
			this.s = this.u;
			this.t = this.v;
			double double2 = this.w - this.u;
			double double4 = this.x - this.v;
			if (double2 * double2 + double4 * double4 < 4.0) {
				this.u += double2;
				this.v += double4;
			} else {
				this.u += double2 * 0.85;
				this.v += double4 * 0.85;
			}
		}
	}

	protected void f() {
		int integer2 = (this.l - this.f) / 2;
		int integer3 = (this.m - this.g) / 2;
		this.q.a(cah.a("gui.achievements"), integer2 + 15, integer3 + 5, 4210752);
	}

	protected void b(int integer1, int integer2, float float3) {
		int integer5 = ot.c(this.s + (this.u - this.s) * (double)float3);
		int integer6 = ot.c(this.t + (this.v - this.t) * (double)float3);
		if (integer5 < y) {
			integer5 = y;
		}

		if (integer6 < z) {
			integer6 = z;
		}

		if (integer5 >= A) {
			integer5 = A - 1;
		}

		if (integer6 >= B) {
			integer6 = B - 1;
		}

		int integer7 = (this.l - this.f) / 2;
		int integer8 = (this.m - this.g) / 2;
		int integer9 = integer7 + 16;
		int integer10 = integer8 + 17;
		this.e = 0.0F;
		bqg.c(518);
		bqg.G();
		bqg.c((float)integer9, (float)integer10, -200.0F);
		bqg.b(1.0F / this.r, 1.0F / this.r, 0.0F);
		bqg.y();
		bqg.g();
		bqg.D();
		bqg.h();
		int integer11 = integer5 + 288 >> 4;
		int integer12 = integer6 + 288 >> 4;
		int integer13 = (integer5 + 288) % 16;
		int integer14 = (integer6 + 288) % 16;
		int integer15 = 4;
		int integer16 = 8;
		int integer17 = 10;
		int integer18 = 22;
		int integer19 = 37;
		Random random20 = new Random();
		float float21 = 16.0F / this.r;
		float float22 = 16.0F / this.r;

		for (int integer23 = 0; (float)integer23 * float21 - (float)integer14 < 155.0F; integer23++) {
			float float24 = 0.6F - (float)(integer12 + integer23) / 25.0F * 0.3F;
			bqg.c(float24, float24, float24, 1.0F);

			for (int integer25 = 0; (float)integer25 * float22 - (float)integer13 < 224.0F; integer25++) {
				random20.setSeed((long)(this.j.K().b().hashCode() + integer11 + integer25 + (integer12 + integer23) * 16));
				int integer26 = random20.nextInt(1 + integer12 + integer23) + (integer12 + integer23) / 2;
				byz byz27 = this.a(alv.m);
				if (integer26 > 37 || integer12 + integer23 == 35) {
					alu alu28 = alv.h;
					byz27 = this.a(alu28);
				} else if (integer26 == 22) {
					if (random20.nextInt(2) == 0) {
						byz27 = this.a(alv.ag);
					} else {
						byz27 = this.a(alv.aC);
					}
				} else if (integer26 == 10) {
					byz27 = this.a(alv.p);
				} else if (integer26 == 8) {
					byz27 = this.a(alv.q);
				} else if (integer26 > 4) {
					byz27 = this.a(alv.b);
				} else if (integer26 > 0) {
					byz27 = this.a(alv.d);
				}

				this.j.N().a(byy.g);
				this.a(integer25 * 16 - integer13, integer23 * 16 - integer14, byz27, 16, 16);
			}
		}

		bqg.k();
		bqg.c(515);
		this.j.N().a(C);

		for (int integer23 = 0; integer23 < nr.e.size(); integer23++) {
			nq nq24 = (nq)nr.e.get(integer23);
			if (nq24.c != null) {
				int integer25 = nq24.a * 24 - integer5 + 11;
				int integer26 = nq24.b * 24 - integer6 + 11;
				int integer27 = nq24.c.a * 24 - integer5 + 11;
				int integer28 = nq24.c.b * 24 - integer6 + 11;
				boolean boolean29 = this.E.a(nq24);
				boolean boolean30 = this.E.b(nq24);
				int integer31 = this.E.c(nq24);
				if (integer31 <= 4) {
					int integer32 = -16777216;
					if (boolean29) {
						integer32 = -6250336;
					} else if (boolean30) {
						integer32 = -16711936;
					}

					this.a(integer25, integer27, integer26, integer32);
					this.b(integer27, integer26, integer28, integer32);
					if (integer25 > integer27) {
						this.b(integer25 - 11 - 7, integer26 - 5, 114, 234, 7, 11);
					} else if (integer25 < integer27) {
						this.b(integer25 + 11, integer26 - 5, 107, 234, 7, 11);
					} else if (integer26 > integer28) {
						this.b(integer25 - 5, integer26 - 11 - 7, 96, 234, 11, 7);
					} else if (integer26 < integer28) {
						this.b(integer25 - 5, integer26 + 11, 96, 241, 11, 7);
					}
				}
			}
		}

		nq nq23 = null;
		float float24 = (float)(integer1 - integer9) * this.r;
		float float25 = (float)(integer2 - integer10) * this.r;
		beq.c();
		bqg.g();
		bqg.D();
		bqg.h();

		for (int integer26 = 0; integer26 < nr.e.size(); integer26++) {
			nq nq27 = (nq)nr.e.get(integer26);
			int integer28 = nq27.a * 24 - integer5;
			int integer29 = nq27.b * 24 - integer6;
			if (integer28 >= -24 && integer29 >= -24 && (float)integer28 <= 224.0F * this.r && (float)integer29 <= 155.0F * this.r) {
				int integer30 = this.E.c(nq27);
				if (this.E.a(nq27)) {
					float float31 = 0.75F;
					bqg.c(0.75F, 0.75F, 0.75F, 1.0F);
				} else if (this.E.b(nq27)) {
					float float31 = 1.0F;
					bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
				} else if (integer30 < 3) {
					float float31 = 0.3F;
					bqg.c(0.3F, 0.3F, 0.3F, 1.0F);
				} else if (integer30 == 3) {
					float float31 = 0.2F;
					bqg.c(0.2F, 0.2F, 0.2F, 1.0F);
				} else {
					if (integer30 != 4) {
						continue;
					}

					float float31 = 0.1F;
					bqg.c(0.1F, 0.1F, 0.1F, 1.0F);
				}

				this.j.N().a(C);
				if (nq27.g()) {
					this.b(integer28 - 2, integer29 - 2, 26, 202, 26, 26);
				} else {
					this.b(integer28 - 2, integer29 - 2, 0, 202, 26, 26);
				}

				if (!this.E.b(nq27)) {
					float float31 = 0.1F;
					bqg.c(0.1F, 0.1F, 0.1F, 1.0F);
					this.k.a(false);
				}

				bqg.f();
				bqg.q();
				this.k.b(nq27.d, integer28 + 3, integer29 + 3);
				bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA);
				bqg.g();
				if (!this.E.b(nq27)) {
					this.k.a(true);
				}

				bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
				if (float24 >= (float)integer28 && float24 <= (float)(integer28 + 22) && float25 >= (float)integer29 && float25 <= (float)(integer29 + 22)) {
					nq23 = nq27;
				}
			}
		}

		bqg.j();
		bqg.m();
		bqg.H();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.j.N().a(C);
		this.b(integer7, integer8, 0, 0, this.f, this.g);
		this.e = 0.0F;
		bqg.c(515);
		bqg.j();
		bqg.y();
		super.a(integer1, integer2, float3);
		if (nq23 != null) {
			String string26 = nq23.e().c();
			String string27 = nq23.f();
			int integer28 = integer1 + 12;
			int integer29 = integer2 - 4;
			int integer30x = this.E.c(nq23);
			if (this.E.b(nq23)) {
				int integer31 = Math.max(this.q.a(string26), 120);
				int integer32x = this.q.b(string27, integer31);
				if (this.E.a(nq23)) {
					integer32x += 12;
				}

				this.a(integer28 - 3, integer29 - 3, integer28 + integer31 + 3, integer29 + integer32x + 3 + 12, -1073741824, -1073741824);
				this.q.a(string27, integer28, integer29 + 12, integer31, -6250336);
				if (this.E.a(nq23)) {
					this.q.a(cah.a("achievement.taken"), (float)integer28, (float)(integer29 + integer32x + 4), -7302913);
				}
			} else if (integer30x == 3) {
				string26 = cah.a("achievement.unknown");
				int integer31x = Math.max(this.q.a(string26), 120);
				String string32 = new fi("achievement.requires", nq23.c.e()).c();
				int integer33 = this.q.b(string32, integer31x);
				this.a(integer28 - 3, integer29 - 3, integer28 + integer31x + 3, integer29 + integer33 + 12 + 3, -1073741824, -1073741824);
				this.q.a(string32, integer28, integer29 + 12, integer31x, -9416624);
			} else if (integer30x < 3) {
				int integer31x = Math.max(this.q.a(string26), 120);
				String string32 = new fi("achievement.requires", nq23.c.e()).c();
				int integer33 = this.q.b(string32, integer31x);
				this.a(integer28 - 3, integer29 - 3, integer28 + integer31x + 3, integer29 + integer33 + 12 + 3, -1073741824, -1073741824);
				this.q.a(string32, integer28, integer29 + 12, integer31x, -9416624);
			} else {
				string26 = null;
			}

			if (string26 != null) {
				this.q.a(string26, (float)integer28, (float)integer29, this.E.b(nq23) ? (nq23.g() ? -128 : -1) : (nq23.g() ? -8355776 : -8355712));
			}
		}

		bqg.k();
		bqg.f();
		beq.a();
	}

	private byz a(alu alu) {
		return bes.z().ab().a().a(alu.t());
	}

	@Override
	public boolean d() {
		return !this.F;
	}
}
