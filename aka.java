import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Random;

public class aka {
	private final lw a;
	private final Random b;
	private final Long2ObjectMap<aka.a> c = new Long2ObjectOpenHashMap(4096);

	public aka(lw lw) {
		this.a = lw;
		this.b = new Random(lw.O());
	}

	public void a(sn sn, float float2) {
		if (this.a.s.q().a() != 1) {
			if (!this.b(sn, float2)) {
				this.a(sn);
				this.b(sn, float2);
			}
		} else {
			int integer4 = ot.c(sn.p);
			int integer5 = ot.c(sn.q) - 1;
			int integer6 = ot.c(sn.r);
			int integer7 = 1;
			int integer8 = 0;

			for (int integer9 = -2; integer9 <= 2; integer9++) {
				for (int integer10 = -2; integer10 <= 2; integer10++) {
					for (int integer11 = -1; integer11 < 3; integer11++) {
						int integer12 = integer4 + integer10 * 1 + integer9 * 0;
						int integer13 = integer5 + integer11;
						int integer14 = integer6 + integer10 * 0 - integer9 * 1;
						boolean boolean15 = integer11 < 0;
						this.a.a(new co(integer12, integer13, integer14), boolean15 ? alv.Z.t() : alv.a.t());
					}
				}
			}

			sn.b((double)integer4, (double)integer5, (double)integer6, sn.v, 0.0F);
			sn.s = 0.0;
			sn.t = 0.0;
			sn.u = 0.0;
		}
	}

	public boolean b(sn sn, float float2) {
		int integer4 = 128;
		double double5 = -1.0;
		int integer7 = ot.c(sn.p);
		int integer8 = ot.c(sn.r);
		boolean boolean9 = true;
		co co10 = co.a;
		long long11 = ajl.a(integer7, integer8);
		if (this.c.containsKey(long11)) {
			aka.a a13 = (aka.a)this.c.get(long11);
			double5 = 0.0;
			co10 = a13;
			a13.b = this.a.P();
			boolean9 = false;
		} else {
			co co13 = new co(sn);

			for (int integer14 = -128; integer14 <= 128; integer14++) {
				for (int integer15 = -128; integer15 <= 128; integer15++) {
					co co16 = co13.a(integer14, this.a.Z() - 1 - co13.q(), integer15);

					while (co16.q() >= 0) {
						co co17 = co16.b();
						if (this.a.o(co16).v() == alv.aY) {
							for (co17 = co16.b(); this.a.o(co17).v() == alv.aY; co17 = co17.b()) {
								co16 = co17;
							}

							double double18 = co16.n(co13);
							if (double5 < 0.0 || double18 < double5) {
								double5 = double18;
								co10 = co16;
							}
						}

						co16 = co17;
					}
				}
			}
		}

		if (double5 >= 0.0) {
			if (boolean9) {
				this.c.put(long11, new aka.a(co10, this.a.P()));
			}

			double double13 = (double)co10.p() + 0.5;
			double double17 = (double)co10.r() + 0.5;
			atp.b b19 = alv.aY.c(this.a, co10);
			boolean boolean20 = b19.b().e().c() == cv.b.NEGATIVE;
			double double21 = b19.b().k() == cv.a.X ? (double)b19.a().r() : (double)b19.a().p();
			double double15 = (double)(b19.a().q() + 1) - sn.ba().c * (double)b19.e();
			if (boolean20) {
				double21++;
			}

			if (b19.b().k() == cv.a.X) {
				double17 = double21 + (1.0 - sn.ba().b) * (double)b19.d() * (double)b19.b().e().c().a();
			} else {
				double13 = double21 + (1.0 - sn.ba().b) * (double)b19.d() * (double)b19.b().e().c().a();
			}

			float float23 = 0.0F;
			float float24 = 0.0F;
			float float25 = 0.0F;
			float float26 = 0.0F;
			if (b19.b().d() == sn.bb()) {
				float23 = 1.0F;
				float24 = 1.0F;
			} else if (b19.b().d() == sn.bb().d()) {
				float23 = -1.0F;
				float24 = -1.0F;
			} else if (b19.b().d() == sn.bb().e()) {
				float25 = 1.0F;
				float26 = -1.0F;
			} else {
				float25 = -1.0F;
				float26 = 1.0F;
			}

			double double27 = sn.s;
			double double29 = sn.u;
			sn.s = double27 * (double)float23 + double29 * (double)float26;
			sn.u = double27 * (double)float25 + double29 * (double)float24;
			sn.v = float2 - (float)(sn.bb().d().b() * 90) + (float)(b19.b().b() * 90);
			if (sn instanceof ly) {
				((ly)sn).a.a(double13, double15, double17, sn.v, sn.w);
			} else {
				sn.b(double13, double15, double17, sn.v, sn.w);
			}

			return true;
		} else {
			return false;
		}
	}

	public boolean a(sn sn) {
		int integer3 = 16;
		double double4 = -1.0;
		int integer6 = ot.c(sn.p);
		int integer7 = ot.c(sn.q);
		int integer8 = ot.c(sn.r);
		int integer9 = integer6;
		int integer10 = integer7;
		int integer11 = integer8;
		int integer12 = 0;
		int integer13 = this.b.nextInt(4);
		co.a a14 = new co.a();

		for (int integer15 = integer6 - 16; integer15 <= integer6 + 16; integer15++) {
			double double16 = (double)integer15 + 0.5 - sn.p;

			for (int integer18 = integer8 - 16; integer18 <= integer8 + 16; integer18++) {
				double double19 = (double)integer18 + 0.5 - sn.r;

				label296:
				for (int integer21 = this.a.Z() - 1; integer21 >= 0; integer21--) {
					if (this.a.d(a14.c(integer15, integer21, integer18))) {
						while (integer21 > 0 && this.a.d(a14.c(integer15, integer21 - 1, integer18))) {
							integer21--;
						}

						for (int integer22 = integer13; integer22 < integer13 + 4; integer22++) {
							int integer23 = integer22 % 2;
							int integer24 = 1 - integer23;
							if (integer22 % 4 >= 2) {
								integer23 = -integer23;
								integer24 = -integer24;
							}

							for (int integer25 = 0; integer25 < 3; integer25++) {
								for (int integer26 = 0; integer26 < 4; integer26++) {
									for (int integer27 = -1; integer27 < 4; integer27++) {
										int integer28 = integer15 + (integer26 - 1) * integer23 + integer25 * integer24;
										int integer29 = integer21 + integer27;
										int integer30 = integer18 + (integer26 - 1) * integer24 - integer25 * integer23;
										a14.c(integer28, integer29, integer30);
										if (integer27 < 0 && !this.a.o(a14).a().a() || integer27 >= 0 && !this.a.d(a14)) {
											continue label296;
										}
									}
								}
							}

							double double25 = (double)integer21 + 0.5 - sn.q;
							double double27 = double16 * double16 + double25 * double25 + double19 * double19;
							if (double4 < 0.0 || double27 < double4) {
								double4 = double27;
								integer9 = integer15;
								integer10 = integer21;
								integer11 = integer18;
								integer12 = integer22 % 4;
							}
						}
					}
				}
			}
		}

		if (double4 < 0.0) {
			for (int integer15 = integer6 - 16; integer15 <= integer6 + 16; integer15++) {
				double double16 = (double)integer15 + 0.5 - sn.p;

				for (int integer18 = integer8 - 16; integer18 <= integer8 + 16; integer18++) {
					double double19 = (double)integer18 + 0.5 - sn.r;

					label233:
					for (int integer21x = this.a.Z() - 1; integer21x >= 0; integer21x--) {
						if (this.a.d(a14.c(integer15, integer21x, integer18))) {
							while (integer21x > 0 && this.a.d(a14.c(integer15, integer21x - 1, integer18))) {
								integer21x--;
							}

							for (int integer22 = integer13; integer22 < integer13 + 2; integer22++) {
								int integer23x = integer22 % 2;
								int integer24x = 1 - integer23x;

								for (int integer25 = 0; integer25 < 4; integer25++) {
									for (int integer26 = -1; integer26 < 4; integer26++) {
										int integer27x = integer15 + (integer25 - 1) * integer23x;
										int integer28 = integer21x + integer26;
										int integer29 = integer18 + (integer25 - 1) * integer24x;
										a14.c(integer27x, integer28, integer29);
										if (integer26 < 0 && !this.a.o(a14).a().a() || integer26 >= 0 && !this.a.d(a14)) {
											continue label233;
										}
									}
								}

								double double25 = (double)integer21x + 0.5 - sn.q;
								double double27 = double16 * double16 + double25 * double25 + double19 * double19;
								if (double4 < 0.0 || double27 < double4) {
									double4 = double27;
									integer9 = integer15;
									integer10 = integer21x;
									integer11 = integer18;
									integer12 = integer22 % 2;
								}
							}
						}
					}
				}
			}
		}

		int integer16 = integer9;
		int integer17 = integer10;
		int integer18 = integer11;
		int integer19 = integer12 % 2;
		int integer20 = 1 - integer19;
		if (integer12 % 4 >= 2) {
			integer19 = -integer19;
			integer20 = -integer20;
		}

		if (double4 < 0.0) {
			integer10 = ot.a(integer10, 70, this.a.Z() - 10);
			integer17 = integer10;

			for (int integer21xx = -1; integer21xx <= 1; integer21xx++) {
				for (int integer22 = 1; integer22 < 3; integer22++) {
					for (int integer23x = -1; integer23x < 3; integer23x++) {
						int integer24x = integer16 + (integer22 - 1) * integer19 + integer21xx * integer20;
						int integer25 = integer17 + integer23x;
						int integer26x = integer18 + (integer22 - 1) * integer20 - integer21xx * integer19;
						boolean boolean27 = integer23x < 0;
						this.a.a(new co(integer24x, integer25, integer26x), boolean27 ? alv.Z.t() : alv.a.t());
					}
				}
			}
		}

		atl atl21 = alv.aY.t().a(apo.a, integer19 == 0 ? cv.a.Z : cv.a.X);

		for (int integer22 = 0; integer22 < 4; integer22++) {
			for (int integer23x = 0; integer23x < 4; integer23x++) {
				for (int integer24x = -1; integer24x < 4; integer24x++) {
					int integer25 = integer16 + (integer23x - 1) * integer19;
					int integer26x = integer17 + integer24x;
					int integer27x = integer18 + (integer23x - 1) * integer20;
					boolean boolean28 = integer23x == 0 || integer23x == 3 || integer24x == -1 || integer24x == 3;
					this.a.a(new co(integer25, integer26x, integer27x), boolean28 ? alv.Z.t() : atl21, 2);
				}
			}

			for (int integer23x = 0; integer23x < 4; integer23x++) {
				for (int integer24x = -1; integer24x < 4; integer24x++) {
					int integer25 = integer16 + (integer23x - 1) * integer19;
					int integer26x = integer17 + integer24x;
					int integer27x = integer18 + (integer23x - 1) * integer20;
					co co28 = new co(integer25, integer26x, integer27x);
					this.a.b(co28, this.a.o(co28).v(), false);
				}
			}
		}

		return true;
	}

	public void a(long long1) {
		if (long1 % 100L == 0L) {
			long long4 = long1 - 300L;
			ObjectIterator<aka.a> objectIterator6 = this.c.values().iterator();

			while (objectIterator6.hasNext()) {
				aka.a a7 = (aka.a)objectIterator6.next();
				if (a7 == null || a7.b < long4) {
					objectIterator6.remove();
				}
			}
		}
	}

	public class a extends co {
		public long b;

		public a(co co, long long3) {
			super(co.p(), co.q(), co.r());
			this.b = long3;
		}
	}
}
