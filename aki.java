import java.util.Random;

public class aki {
	protected boolean a;
	protected co b;
	protected avq c;
	protected awn d = new awg(4);
	protected awn e = new axj(alv.m, 7);
	protected awn f = new axj(alv.n, 6);
	protected awn g;
	protected awn h;
	protected awn i;
	protected awn j;
	protected awn k;
	protected awn l;
	protected awn m;
	protected awn n;
	protected awn o;
	protected awn p;
	protected awn q;
	protected awo r = new awo(alv.N, ano.a.DANDELION);
	protected awn s = new awe(alv.P);
	protected awn t = new awe(alv.Q);
	protected awn u = new awu();
	protected awn v = new axh();
	protected awn w = new awf();
	protected awn x = new axs();
	protected int y;
	protected int z;
	protected float A = 0.1F;
	protected int B = 2;
	protected int C = 1;
	protected int D;
	protected int E;
	protected int F;
	protected int G;
	protected int H = 1;
	protected int I = 3;
	protected int J = 1;
	protected int K;
	public boolean L = true;

	public void a(ajs ajs, Random random, akf akf, co co) {
		if (this.a) {
			throw new RuntimeException("Already decorating");
		} else {
			this.c = avq.a.a(ajs.T().A()).b();
			this.b = co;
			this.g = new axe(alv.d.t(), this.c.J);
			this.h = new axe(alv.n.t(), this.c.N);
			this.i = new axe(alv.b.t().a(arc.a, arc.a.GRANITE), this.c.R);
			this.j = new axe(alv.b.t().a(arc.a, arc.a.DIORITE), this.c.V);
			this.k = new axe(alv.b.t().a(arc.a, arc.a.ANDESITE), this.c.Z);
			this.l = new axe(alv.q.t(), this.c.ad);
			this.m = new axe(alv.p.t(), this.c.ah);
			this.n = new axe(alv.o.t(), this.c.al);
			this.o = new axe(alv.aC.t(), this.c.ap);
			this.p = new axe(alv.ag.t(), this.c.at);
			this.q = new axe(alv.x.t(), this.c.ax);
			this.a(akf, ajs, random);
			this.a = false;
		}
	}

	protected void a(akf akf, ajs ajs, Random random) {
		this.a(ajs, random);

		for (int integer5 = 0; integer5 < this.I; integer5++) {
			int integer6 = random.nextInt(16) + 8;
			int integer7 = random.nextInt(16) + 8;
			this.e.b(ajs, random, ajs.q(this.b.a(integer6, 0, integer7)));
		}

		for (int integer5 = 0; integer5 < this.J; integer5++) {
			int integer6 = random.nextInt(16) + 8;
			int integer7 = random.nextInt(16) + 8;
			this.d.b(ajs, random, ajs.q(this.b.a(integer6, 0, integer7)));
		}

		for (int integer5 = 0; integer5 < this.H; integer5++) {
			int integer6 = random.nextInt(16) + 8;
			int integer7 = random.nextInt(16) + 8;
			this.f.b(ajs, random, ajs.q(this.b.a(integer6, 0, integer7)));
		}

		int integer5 = this.z;
		if (random.nextFloat() < this.A) {
			integer5++;
		}

		for (int integer6 = 0; integer6 < integer5; integer6++) {
			int integer7 = random.nextInt(16) + 8;
			int integer8 = random.nextInt(16) + 8;
			avz avz9 = akf.a(random);
			avz9.e();
			co co10 = ajs.l(this.b.a(integer7, 0, integer8));
			if (avz9.b(ajs, random, co10)) {
				avz9.a(ajs, random, co10);
			}
		}

		for (int integer6x = 0; integer6x < this.K; integer6x++) {
			int integer7 = random.nextInt(16) + 8;
			int integer8 = random.nextInt(16) + 8;
			this.u.b(ajs, random, ajs.l(this.b.a(integer7, 0, integer8)));
		}

		for (int integer6x = 0; integer6x < this.B; integer6x++) {
			int integer7 = random.nextInt(16) + 8;
			int integer8 = random.nextInt(16) + 8;
			int integer9 = ajs.l(this.b.a(integer7, 0, integer8)).q() + 32;
			if (integer9 > 0) {
				int integer10 = random.nextInt(integer9);
				co co11 = this.b.a(integer7, integer10, integer8);
				ano.a a12 = akf.a(random, co11);
				ano ano13 = a12.a().a();
				if (ano13.t().a() != azs.a) {
					this.r.a(ano13, a12);
					this.r.b(ajs, random, co11);
				}
			}
		}

		for (int integer6xx = 0; integer6xx < this.C; integer6xx++) {
			int integer7 = random.nextInt(16) + 8;
			int integer8 = random.nextInt(16) + 8;
			int integer9 = ajs.l(this.b.a(integer7, 0, integer8)).q() * 2;
			if (integer9 > 0) {
				int integer10 = random.nextInt(integer9);
				akf.b(random).b(ajs, random, this.b.a(integer7, integer10, integer8));
			}
		}

		for (int integer6xxx = 0; integer6xxx < this.D; integer6xxx++) {
			int integer7 = random.nextInt(16) + 8;
			int integer8 = random.nextInt(16) + 8;
			int integer9 = ajs.l(this.b.a(integer7, 0, integer8)).q() * 2;
			if (integer9 > 0) {
				int integer10 = random.nextInt(integer9);
				new awh().b(ajs, random, this.b.a(integer7, integer10, integer8));
			}
		}

		for (int integer6xxxx = 0; integer6xxxx < this.y; integer6xxxx++) {
			int integer7 = random.nextInt(16) + 8;
			int integer8 = random.nextInt(16) + 8;
			int integer9 = ajs.l(this.b.a(integer7, 0, integer8)).q() * 2;
			if (integer9 > 0) {
				int integer10 = random.nextInt(integer9);
				co co11 = this.b.a(integer7, integer10, integer8);

				while (co11.q() > 0) {
					co co12 = co11.b();
					if (!ajs.d(co12)) {
						break;
					}

					co11 = co12;
				}

				this.x.b(ajs, random, co11);
			}
		}

		for (int integer6xxxxx = 0; integer6xxxxx < this.E; integer6xxxxx++) {
			if (random.nextInt(4) == 0) {
				int integer7 = random.nextInt(16) + 8;
				int integer8 = random.nextInt(16) + 8;
				co co9 = ajs.l(this.b.a(integer7, 0, integer8));
				this.s.b(ajs, random, co9);
			}

			if (random.nextInt(8) == 0) {
				int integer7 = random.nextInt(16) + 8;
				int integer8 = random.nextInt(16) + 8;
				int integer9 = ajs.l(this.b.a(integer7, 0, integer8)).q() * 2;
				if (integer9 > 0) {
					int integer10 = random.nextInt(integer9);
					co co11 = this.b.a(integer7, integer10, integer8);
					this.t.b(ajs, random, co11);
				}
			}
		}

		if (random.nextInt(4) == 0) {
			int integer6xxxxx = random.nextInt(16) + 8;
			int integer7 = random.nextInt(16) + 8;
			int integer8 = ajs.l(this.b.a(integer6xxxxx, 0, integer7)).q() * 2;
			if (integer8 > 0) {
				int integer9 = random.nextInt(integer8);
				this.s.b(ajs, random, this.b.a(integer6xxxxx, integer9, integer7));
			}
		}

		if (random.nextInt(8) == 0) {
			int integer6xxxxx = random.nextInt(16) + 8;
			int integer7 = random.nextInt(16) + 8;
			int integer8 = ajs.l(this.b.a(integer6xxxxx, 0, integer7)).q() * 2;
			if (integer8 > 0) {
				int integer9 = random.nextInt(integer8);
				this.t.b(ajs, random, this.b.a(integer6xxxxx, integer9, integer7));
			}
		}

		for (int integer6xxxxx = 0; integer6xxxxx < this.F; integer6xxxxx++) {
			int integer7 = random.nextInt(16) + 8;
			int integer8 = random.nextInt(16) + 8;
			int integer9 = ajs.l(this.b.a(integer7, 0, integer8)).q() * 2;
			if (integer9 > 0) {
				int integer10 = random.nextInt(integer9);
				this.v.b(ajs, random, this.b.a(integer7, integer10, integer8));
			}
		}

		for (int integer6xxxxxx = 0; integer6xxxxxx < 10; integer6xxxxxx++) {
			int integer7 = random.nextInt(16) + 8;
			int integer8 = random.nextInt(16) + 8;
			int integer9 = ajs.l(this.b.a(integer7, 0, integer8)).q() * 2;
			if (integer9 > 0) {
				int integer10 = random.nextInt(integer9);
				this.v.b(ajs, random, this.b.a(integer7, integer10, integer8));
			}
		}

		if (random.nextInt(32) == 0) {
			int integer6xxxxxxx = random.nextInt(16) + 8;
			int integer7 = random.nextInt(16) + 8;
			int integer8 = ajs.l(this.b.a(integer6xxxxxxx, 0, integer7)).q() * 2;
			if (integer8 > 0) {
				int integer9 = random.nextInt(integer8);
				new axg().b(ajs, random, this.b.a(integer6xxxxxxx, integer9, integer7));
			}
		}

		for (int integer6xxxxxxx = 0; integer6xxxxxxx < this.G; integer6xxxxxxx++) {
			int integer7 = random.nextInt(16) + 8;
			int integer8 = random.nextInt(16) + 8;
			int integer9 = ajs.l(this.b.a(integer7, 0, integer8)).q() * 2;
			if (integer9 > 0) {
				int integer10 = random.nextInt(integer9);
				this.w.b(ajs, random, this.b.a(integer7, integer10, integer8));
			}
		}

		if (this.L) {
			for (int integer6xxxxxxxx = 0; integer6xxxxxxxx < 50; integer6xxxxxxxx++) {
				int integer7 = random.nextInt(16) + 8;
				int integer8 = random.nextInt(16) + 8;
				int integer9 = random.nextInt(248) + 8;
				if (integer9 > 0) {
					int integer10 = random.nextInt(integer9);
					co co11 = this.b.a(integer7, integer10, integer8);
					new axm(alv.i).b(ajs, random, co11);
				}
			}

			for (int integer6xxxxxxxxx = 0; integer6xxxxxxxxx < 20; integer6xxxxxxxxx++) {
				int integer7 = random.nextInt(16) + 8;
				int integer8 = random.nextInt(16) + 8;
				int integer9 = random.nextInt(random.nextInt(random.nextInt(240) + 8) + 8);
				co co10 = this.b.a(integer7, integer9, integer8);
				new axm(alv.k).b(ajs, random, co10);
			}
		}
	}

	protected void a(ajs ajs, Random random) {
		this.a(ajs, random, this.c.K, this.g, this.c.L, this.c.M);
		this.a(ajs, random, this.c.O, this.h, this.c.P, this.c.Q);
		this.a(ajs, random, this.c.W, this.j, this.c.X, this.c.Y);
		this.a(ajs, random, this.c.S, this.i, this.c.T, this.c.U);
		this.a(ajs, random, this.c.aa, this.k, this.c.ab, this.c.ac);
		this.a(ajs, random, this.c.ae, this.l, this.c.af, this.c.ag);
		this.a(ajs, random, this.c.ai, this.m, this.c.aj, this.c.ak);
		this.a(ajs, random, this.c.am, this.n, this.c.an, this.c.ao);
		this.a(ajs, random, this.c.aq, this.o, this.c.ar, this.c.as);
		this.a(ajs, random, this.c.au, this.p, this.c.av, this.c.aw);
		this.b(ajs, random, this.c.ay, this.q, this.c.az, this.c.aA);
	}

	protected void a(ajs ajs, Random random, int integer3, awn awn, int integer5, int integer6) {
		if (integer6 < integer5) {
			int integer8 = integer5;
			integer5 = integer6;
			integer6 = integer8;
		} else if (integer6 == integer5) {
			if (integer5 < 255) {
				integer6++;
			} else {
				integer5--;
			}
		}

		for (int integer8 = 0; integer8 < integer3; integer8++) {
			co co9 = this.b.a(random.nextInt(16), random.nextInt(integer6 - integer5) + integer5, random.nextInt(16));
			awn.b(ajs, random, co9);
		}
	}

	protected void b(ajs ajs, Random random, int integer3, awn awn, int integer5, int integer6) {
		for (int integer8 = 0; integer8 < integer3; integer8++) {
			co co9 = this.b.a(random.nextInt(16), random.nextInt(integer6) + random.nextInt(integer6) + integer5 - integer6, random.nextInt(16));
			awn.b(ajs, random, co9);
		}
	}
}
