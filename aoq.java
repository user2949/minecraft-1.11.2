import java.util.Random;
import javax.annotation.Nullable;

public abstract class aoq extends alu {
	public static final aua b = aua.a("level", 0, 15);

	protected aoq(azs azs) {
		super(azs);
		this.y(this.A.b().a(b, 0));
		this.a(true);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return j;
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		return k;
	}

	@Override
	public boolean b(ajw ajw, co co) {
		return this.x != azs.i;
	}

	public static float e(int integer) {
		if (integer >= 8) {
			integer = 0;
		}

		return (float)(integer + 1) / 9.0F;
	}

	protected int i(atl atl) {
		return atl.a() == this.x ? (Integer)atl.c(b) : -1;
	}

	protected int z(atl atl) {
		int integer3 = this.i(atl);
		return integer3 >= 8 ? 0 : integer3;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean a(atl atl, boolean boolean2) {
		return boolean2 && (Integer)atl.c(b) == 0;
	}

	@Override
	public boolean a(ajw ajw, co co, cv cv) {
		azs azs5 = ajw.o(co).a();
		if (azs5 == this.x) {
			return false;
		} else if (cv == cv.UP) {
			return true;
		} else {
			return azs5 == azs.w ? false : super.a(ajw, co, cv);
		}
	}

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		if (ajw.o(co.a(cv)).a() == this.x) {
			return false;
		} else {
			return cv == cv.UP ? true : super.a(atl, ajw, co, cv);
		}
	}

	public boolean c(ajw ajw, co co) {
		for (int integer4 = -1; integer4 <= 1; integer4++) {
			for (int integer5 = -1; integer5 <= 1; integer5++) {
				atl atl6 = ajw.o(co.a(integer4, 0, integer5));
				if (atl6.a() != this.x && !atl6.b()) {
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public aqf a(atl atl) {
		return aqf.LIQUID;
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.a;
	}

	@Override
	public int a(Random random) {
		return 0;
	}

	protected bdw a(ajw ajw, co co, atl atl) {
		double double5 = 0.0;
		double double7 = 0.0;
		double double9 = 0.0;
		int integer11 = this.z(atl);
		co.b b12 = co.b.s();

		for (cv cv14 : cv.c.HORIZONTAL) {
			b12.j(co).d(cv14);
			int integer15 = this.z(ajw.o(b12));
			if (integer15 < 0) {
				if (!ajw.o(b12).a().c()) {
					integer15 = this.z(ajw.o(b12.b()));
					if (integer15 >= 0) {
						int integer16 = integer15 - (integer11 - 8);
						double5 += (double)(cv14.g() * integer16);
						double7 += (double)(cv14.h() * integer16);
						double9 += (double)(cv14.i() * integer16);
					}
				}
			} else if (integer15 >= 0) {
				int integer16 = integer15 - integer11;
				double5 += (double)(cv14.g() * integer16);
				double7 += (double)(cv14.h() * integer16);
				double9 += (double)(cv14.i() * integer16);
			}
		}

		bdw bdw13 = new bdw(double5, double7, double9);
		if ((Integer)atl.c(b) >= 8) {
			for (cv cv15 : cv.c.HORIZONTAL) {
				b12.j(co).d(cv15);
				if (this.a(ajw, b12, cv15) || this.a(ajw, b12.a(), cv15)) {
					bdw13 = bdw13.a().b(0.0, -6.0, 0.0);
					break;
				}
			}
		}

		b12.t();
		return bdw13.a();
	}

	@Override
	public bdw a(ajs ajs, co co, sn sn, bdw bdw) {
		return bdw.e(this.a(ajs, co, ajs.o(co)));
	}

	@Override
	public int a(ajs ajs) {
		if (this.x == azs.h) {
			return 5;
		} else if (this.x == azs.i) {
			return ajs.s.n() ? 10 : 30;
		} else {
			return 0;
		}
	}

	@Override
	public int d(atl atl, ajw ajw, co co) {
		int integer5 = ajw.b(co, 0);
		int integer6 = ajw.b(co.a(), 0);
		int integer7 = integer5 & 0xFF;
		int integer8 = integer6 & 0xFF;
		int integer9 = integer5 >> 16 & 0xFF;
		int integer10 = integer6 >> 16 & 0xFF;
		return (integer7 > integer8 ? integer7 : integer8) | (integer9 > integer10 ? integer9 : integer10) << 16;
	}

	@Override
	public ajk f() {
		return this.x == azs.h ? ajk.TRANSLUCENT : ajk.SOLID;
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		double double6 = (double)co.p();
		double double8 = (double)co.q();
		double double10 = (double)co.r();
		if (this.x == azs.h) {
			int integer12 = (Integer)atl.c(b);
			if (integer12 > 0 && integer12 < 8) {
				if (random.nextInt(64) == 0) {
					ajs.a(double6 + 0.5, double8 + 0.5, double10 + 0.5, nn.hq, no.BLOCKS, random.nextFloat() * 0.25F + 0.75F, random.nextFloat() + 0.5F, false);
				}
			} else if (random.nextInt(10) == 0) {
				ajs.a(de.SUSPENDED, double6 + (double)random.nextFloat(), double8 + (double)random.nextFloat(), double10 + (double)random.nextFloat(), 0.0, 0.0, 0.0);
			}
		}

		if (this.x == azs.i && ajs.o(co.a()).a() == azs.a && !ajs.o(co.a()).q()) {
			if (random.nextInt(100) == 0) {
				double double12 = double6 + (double)random.nextFloat();
				double double14 = double8 + atl.d(ajs, co).e;
				double double16 = double10 + (double)random.nextFloat();
				ajs.a(de.LAVA, double12, double14, double16, 0.0, 0.0, 0.0);
				ajs.a(double12, double14, double16, nn.ds, no.BLOCKS, 0.2F + random.nextFloat() * 0.2F, 0.9F + random.nextFloat() * 0.15F, false);
			}

			if (random.nextInt(200) == 0) {
				ajs.a(double6, double8, double10, nn.dq, no.BLOCKS, 0.2F + random.nextFloat() * 0.2F, 0.9F + random.nextFloat() * 0.15F, false);
			}
		}

		if (random.nextInt(10) == 0 && ajs.o(co.b()).r()) {
			azs azs12 = ajs.o(co.c(2)).a();
			if (!azs12.c() && !azs12.d()) {
				double double13 = double6 + (double)random.nextFloat();
				double double15 = double8 - 1.05;
				double double17 = double10 + (double)random.nextFloat();
				if (this.x == azs.h) {
					ajs.a(de.DRIP_WATER, double13, double15, double17, 0.0, 0.0, 0.0);
				} else {
					ajs.a(de.DRIP_LAVA, double13, double15, double17, 0.0, 0.0, 0.0);
				}
			}
		}
	}

	public static float a(ajw ajw, co co, azs azs, atl atl) {
		bdw bdw5 = a(azs).a(ajw, co, atl);
		return bdw5.b == 0.0 && bdw5.d == 0.0 ? -1000.0F : (float)ot.c(bdw5.d, bdw5.b) - (float) (Math.PI / 2);
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		this.e(ajs, co, atl);
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		this.e(ajs, co3, atl);
	}

	public boolean e(ajs ajs, co co, atl atl) {
		if (this.x == azs.i) {
			boolean boolean5 = false;

			for (cv cv9 : cv.values()) {
				if (cv9 != cv.DOWN && ajs.o(co.a(cv9)).a() == azs.h) {
					boolean5 = true;
					break;
				}
			}

			if (boolean5) {
				Integer integer6 = atl.c(b);
				if (integer6 == 0) {
					ajs.a(co, alv.Z.t());
					this.b(ajs, co);
					return true;
				}

				if (integer6 <= 4) {
					ajs.a(co, alv.e.t());
					this.b(ajs, co);
					return true;
				}
			}
		}

		return false;
	}

	protected void b(ajs ajs, co co) {
		double double4 = (double)co.p();
		double double6 = (double)co.q();
		double double8 = (double)co.r();
		ajs.a(null, co, nn.dr, no.BLOCKS, 0.5F, 2.6F + (ajs.r.nextFloat() - ajs.r.nextFloat()) * 0.8F);

		for (int integer10 = 0; integer10 < 8; integer10++) {
			ajs.a(de.SMOKE_LARGE, double4 + Math.random(), double6 + 1.2, double8 + Math.random(), 0.0, 0.0, 0.0);
		}
	}

	@Override
	public atl a(int integer) {
		return this.t().a(b, integer);
	}

	@Override
	public int e(atl atl) {
		return (Integer)atl.c(b);
	}

	@Override
	protected atm b() {
		return new atm(this, b);
	}

	public static anb a(azs azs) {
		if (azs == azs.h) {
			return alv.i;
		} else if (azs == azs.i) {
			return alv.k;
		} else {
			throw new IllegalArgumentException("Invalid material");
		}
	}

	public static ara b(azs azs) {
		if (azs == azs.h) {
			return alv.j;
		} else if (azs == azs.i) {
			return alv.l;
		} else {
			throw new IllegalArgumentException("Invalid material");
		}
	}

	public static float f(atl atl, ajw ajw, co co) {
		int integer4 = (Integer)atl.c(b);
		return (integer4 & 7) == 0 && ajw.o(co.a()).a() == azs.h ? 1.0F : 1.0F - e(integer4);
	}

	public static float g(atl atl, ajw ajw, co co) {
		return (float)co.q() + f(atl, ajw, co);
	}
}
