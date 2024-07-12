import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class ayd {
	public static void a() {
		ayo.a(ayd.a.class, "MSCorridor");
		ayo.a(ayd.b.class, "MSCrossing");
		ayo.a(ayd.d.class, "MSRoom");
		ayo.a(ayd.e.class, "MSStairs");
	}

	private static ayd.c a(List<ayq> list, Random random, int integer3, int integer4, int integer5, @Nullable cv cv, int integer7, ayc.a a) {
		int integer9 = random.nextInt(100);
		if (integer9 >= 80) {
			axz axz10 = ayd.b.a(list, random, integer3, integer4, integer5, cv);
			if (axz10 != null) {
				return new ayd.b(integer7, random, axz10, cv, a);
			}
		} else if (integer9 >= 70) {
			axz axz10 = ayd.e.a(list, random, integer3, integer4, integer5, cv);
			if (axz10 != null) {
				return new ayd.e(integer7, random, axz10, cv, a);
			}
		} else {
			axz axz10 = ayd.a.a(list, random, integer3, integer4, integer5, cv);
			if (axz10 != null) {
				return new ayd.a(integer7, random, axz10, cv, a);
			}
		}

		return null;
	}

	private static ayd.c b(ayq ayq, List<ayq> list, Random random, int integer4, int integer5, int integer6, cv cv, int integer8) {
		if (integer8 > 8) {
			return null;
		} else if (Math.abs(integer4 - ayq.d().a) <= 80 && Math.abs(integer6 - ayq.d().c) <= 80) {
			ayc.a a9 = ((ayd.c)ayq).a;
			ayd.c c10 = a(list, random, integer4, integer5, integer6, cv, integer8 + 1, a9);
			if (c10 != null) {
				list.add(c10);
				c10.a(ayq, list, random);
			}

			return c10;
		} else {
			return null;
		}
	}

	public static class a extends ayd.c {
		private boolean b;
		private boolean c;
		private boolean d;
		private int e;

		public a() {
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("hr", this.b);
			du.a("sc", this.c);
			du.a("hps", this.d);
			du.a("Num", this.e);
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.b = du.p("hr");
			this.c = du.p("sc");
			this.d = du.p("hps");
			this.e = du.h("Num");
		}

		public a(int integer, Random random, axz axz, cv cv, ayc.a a) {
			super(integer, a);
			this.a(cv);
			this.l = axz;
			this.b = random.nextInt(3) == 0;
			this.c = !this.b && random.nextInt(23) == 0;
			if (this.f().k() == cv.a.Z) {
				this.e = axz.e() / 5;
			} else {
				this.e = axz.c() / 5;
			}
		}

		public static axz a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv) {
			axz axz7 = new axz(integer3, integer4, integer5, integer3, integer4 + 2, integer5);

			int integer8;
			for (integer8 = random.nextInt(3) + 2; integer8 > 0; integer8--) {
				int integer9 = integer8 * 5;
				switch (cv) {
					case NORTH:
					default:
						axz7.d = integer3 + 2;
						axz7.c = integer5 - (integer9 - 1);
						break;
					case SOUTH:
						axz7.d = integer3 + 2;
						axz7.f = integer5 + (integer9 - 1);
						break;
					case WEST:
						axz7.a = integer3 - (integer9 - 1);
						axz7.f = integer5 + 2;
						break;
					case EAST:
						axz7.d = integer3 + (integer9 - 1);
						axz7.f = integer5 + 2;
				}

				if (ayq.a(list, axz7) == null) {
					break;
				}
			}

			return integer8 > 0 ? axz7 : null;
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			int integer5 = this.e();
			int integer6 = random.nextInt(4);
			cv cv7 = this.f();
			if (cv7 != null) {
				switch (cv7) {
					case NORTH:
					default:
						if (integer6 <= 1) {
							ayd.b(ayq, list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.c - 1, cv7, integer5);
						} else if (integer6 == 2) {
							ayd.b(ayq, list, random, this.l.a - 1, this.l.b - 1 + random.nextInt(3), this.l.c, cv.WEST, integer5);
						} else {
							ayd.b(ayq, list, random, this.l.d + 1, this.l.b - 1 + random.nextInt(3), this.l.c, cv.EAST, integer5);
						}
						break;
					case SOUTH:
						if (integer6 <= 1) {
							ayd.b(ayq, list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.f + 1, cv7, integer5);
						} else if (integer6 == 2) {
							ayd.b(ayq, list, random, this.l.a - 1, this.l.b - 1 + random.nextInt(3), this.l.f - 3, cv.WEST, integer5);
						} else {
							ayd.b(ayq, list, random, this.l.d + 1, this.l.b - 1 + random.nextInt(3), this.l.f - 3, cv.EAST, integer5);
						}
						break;
					case WEST:
						if (integer6 <= 1) {
							ayd.b(ayq, list, random, this.l.a - 1, this.l.b - 1 + random.nextInt(3), this.l.c, cv7, integer5);
						} else if (integer6 == 2) {
							ayd.b(ayq, list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.c - 1, cv.NORTH, integer5);
						} else {
							ayd.b(ayq, list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.f + 1, cv.SOUTH, integer5);
						}
						break;
					case EAST:
						if (integer6 <= 1) {
							ayd.b(ayq, list, random, this.l.d + 1, this.l.b - 1 + random.nextInt(3), this.l.c, cv7, integer5);
						} else if (integer6 == 2) {
							ayd.b(ayq, list, random, this.l.d - 3, this.l.b - 1 + random.nextInt(3), this.l.c - 1, cv.NORTH, integer5);
						} else {
							ayd.b(ayq, list, random, this.l.d - 3, this.l.b - 1 + random.nextInt(3), this.l.f + 1, cv.SOUTH, integer5);
						}
				}
			}

			if (integer5 < 8) {
				if (cv7 != cv.NORTH && cv7 != cv.SOUTH) {
					for (int integer8 = this.l.a + 3; integer8 + 3 <= this.l.d; integer8 += 5) {
						int integer9 = random.nextInt(5);
						if (integer9 == 0) {
							ayd.b(ayq, list, random, integer8, this.l.b, this.l.c - 1, cv.NORTH, integer5 + 1);
						} else if (integer9 == 1) {
							ayd.b(ayq, list, random, integer8, this.l.b, this.l.f + 1, cv.SOUTH, integer5 + 1);
						}
					}
				} else {
					for (int integer8x = this.l.c + 3; integer8x + 3 <= this.l.f; integer8x += 5) {
						int integer9 = random.nextInt(5);
						if (integer9 == 0) {
							ayd.b(ayq, list, random, this.l.a - 1, this.l.b, integer8x, cv.WEST, integer5 + 1);
						} else if (integer9 == 1) {
							ayd.b(ayq, list, random, this.l.d + 1, this.l.b, integer8x, cv.EAST, integer5 + 1);
						}
					}
				}
			}
		}

		@Override
		protected boolean a(ajs ajs, axz axz, Random random, int integer4, int integer5, int integer6, kq kq) {
			co co9 = new co(this.a(integer4, integer6), this.d(integer5), this.b(integer4, integer6));
			if (axz.b(co9) && ajs.o(co9).a() == azs.a && ajs.o(co9.b()).a() != azs.a) {
				atl atl10 = alv.av.t().a(apx.d, random.nextBoolean() ? alq.b.NORTH_SOUTH : alq.b.EAST_WEST);
				this.a(ajs, atl10, integer4, integer5, integer6, axz);
				abz abz11 = new abz(ajs, (double)((float)co9.p() + 0.5F), (double)((float)co9.q() + 0.5F), (double)((float)co9.r() + 0.5F));
				abz11.a(kq, random.nextLong());
				ajs.a(abz11);
				return true;
			} else {
				return false;
			}
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.a(ajs, axz)) {
				return false;
			} else {
				int integer5 = 0;
				int integer6 = 2;
				int integer7 = 0;
				int integer8 = 2;
				int integer9 = this.e * 5 - 1;
				atl atl10 = this.G_();
				this.a(ajs, axz, 0, 0, 0, 2, 1, integer9, alv.a.t(), alv.a.t(), false);
				this.a(ajs, axz, random, 0.8F, 0, 2, 0, 2, 2, integer9, alv.a.t(), alv.a.t(), false, 0);
				if (this.c) {
					this.a(ajs, axz, random, 0.6F, 0, 0, 0, 2, 1, integer9, alv.G.t(), alv.a.t(), false, 8);
				}

				for (int integer11 = 0; integer11 < this.e; integer11++) {
					int integer12 = 2 + integer11 * 5;
					this.a(ajs, axz, 0, 0, integer12, 2, 2, random);
					this.a(ajs, axz, random, 0.1F, 0, 2, integer12 - 1);
					this.a(ajs, axz, random, 0.1F, 2, 2, integer12 - 1);
					this.a(ajs, axz, random, 0.1F, 0, 2, integer12 + 1);
					this.a(ajs, axz, random, 0.1F, 2, 2, integer12 + 1);
					this.a(ajs, axz, random, 0.05F, 0, 2, integer12 - 2);
					this.a(ajs, axz, random, 0.05F, 2, 2, integer12 - 2);
					this.a(ajs, axz, random, 0.05F, 0, 2, integer12 + 2);
					this.a(ajs, axz, random, 0.05F, 2, 2, integer12 + 2);
					if (random.nextInt(100) == 0) {
						this.a(ajs, axz, random, 2, 0, integer12 - 1, bcf.f);
					}

					if (random.nextInt(100) == 0) {
						this.a(ajs, axz, random, 0, 0, integer12 + 1, bcf.f);
					}

					if (this.c && !this.d) {
						int integer13 = this.d(0);
						int integer14 = integer12 - 1 + random.nextInt(3);
						int integer15 = this.a(1, integer14);
						int integer16 = this.b(1, integer14);
						co co17 = new co(integer15, integer13, integer16);
						if (axz.b(co17) && this.b(ajs, 1, 0, integer14, axz) < 8) {
							this.d = true;
							ajs.a(co17, alv.ac.t(), 2);
							asc asc18 = ajs.r(co17);
							if (asc18 instanceof asr) {
								((asr)asc18).a().a(sp.a(zo.class));
							}
						}
					}
				}

				for (int integer11 = 0; integer11 <= 2; integer11++) {
					for (int integer12x = 0; integer12x <= integer9; integer12x++) {
						int integer13 = -1;
						atl atl14 = this.a(ajs, integer11, -1, integer12x, axz);
						if (atl14.a() == azs.a && this.b(ajs, integer11, -1, integer12x, axz) < 8) {
							int integer15 = -1;
							this.a(ajs, atl10, integer11, -1, integer12x, axz);
						}
					}
				}

				if (this.b) {
					atl atl11 = alv.av.t().a(apx.d, alq.b.NORTH_SOUTH);

					for (int integer12xx = 0; integer12xx <= integer9; integer12xx++) {
						atl atl13 = this.a(ajs, 1, -1, integer12xx, axz);
						if (atl13.a() != azs.a && atl13.b()) {
							float float14 = this.b(ajs, 1, 0, integer12xx, axz) > 8 ? 0.9F : 0.7F;
							this.a(ajs, axz, random, float14, 1, 0, integer12xx, atl11);
						}
					}
				}

				return true;
			}
		}

		private void a(ajs ajs, axz axz, int integer3, int integer4, int integer5, int integer6, int integer7, Random random) {
			if (this.a(ajs, axz, integer3, integer7, integer6, integer5)) {
				atl atl10 = this.G_();
				atl atl11 = this.b();
				atl atl12 = alv.a.t();
				this.a(ajs, axz, integer3, integer4, integer5, integer3, integer6 - 1, integer5, atl11, atl12, false);
				this.a(ajs, axz, integer7, integer4, integer5, integer7, integer6 - 1, integer5, atl11, atl12, false);
				if (random.nextInt(4) == 0) {
					this.a(ajs, axz, integer3, integer6, integer5, integer3, integer6, integer5, atl10, atl12, false);
					this.a(ajs, axz, integer7, integer6, integer5, integer7, integer6, integer5, atl10, atl12, false);
				} else {
					this.a(ajs, axz, integer3, integer6, integer5, integer7, integer6, integer5, atl10, atl12, false);
					this.a(ajs, axz, random, 0.05F, integer3 + 1, integer6, integer5 - 1, alv.aa.t().a(arl.a, cv.NORTH));
					this.a(ajs, axz, random, 0.05F, integer3 + 1, integer6, integer5 + 1, alv.aa.t().a(arl.a, cv.SOUTH));
				}
			}
		}

		private void a(ajs ajs, axz axz, Random random, float float4, int integer5, int integer6, int integer7) {
			if (this.b(ajs, integer5, integer6, integer7, axz) < 8) {
				this.a(ajs, axz, random, float4, integer5, integer6, integer7, alv.G.t());
			}
		}
	}

	public static class b extends ayd.c {
		private cv b;
		private boolean c;

		public b() {
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("tf", this.c);
			du.a("D", this.b.b());
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.c = du.p("tf");
			this.b = cv.b(du.h("D"));
		}

		public b(int integer, Random random, axz axz, @Nullable cv cv, ayc.a a) {
			super(integer, a);
			this.b = cv;
			this.l = axz;
			this.c = axz.d() > 3;
		}

		public static axz a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv) {
			axz axz7 = new axz(integer3, integer4, integer5, integer3, integer4 + 2, integer5);
			if (random.nextInt(4) == 0) {
				axz7.e += 4;
			}

			switch (cv) {
				case NORTH:
				default:
					axz7.a = integer3 - 1;
					axz7.d = integer3 + 3;
					axz7.c = integer5 - 4;
					break;
				case SOUTH:
					axz7.a = integer3 - 1;
					axz7.d = integer3 + 3;
					axz7.f = integer5 + 3 + 1;
					break;
				case WEST:
					axz7.a = integer3 - 4;
					axz7.c = integer5 - 1;
					axz7.f = integer5 + 3;
					break;
				case EAST:
					axz7.d = integer3 + 3 + 1;
					axz7.c = integer5 - 1;
					axz7.f = integer5 + 3;
			}

			return ayq.a(list, axz7) != null ? null : axz7;
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			int integer5 = this.e();
			switch (this.b) {
				case NORTH:
				default:
					ayd.b(ayq, list, random, this.l.a + 1, this.l.b, this.l.c - 1, cv.NORTH, integer5);
					ayd.b(ayq, list, random, this.l.a - 1, this.l.b, this.l.c + 1, cv.WEST, integer5);
					ayd.b(ayq, list, random, this.l.d + 1, this.l.b, this.l.c + 1, cv.EAST, integer5);
					break;
				case SOUTH:
					ayd.b(ayq, list, random, this.l.a + 1, this.l.b, this.l.f + 1, cv.SOUTH, integer5);
					ayd.b(ayq, list, random, this.l.a - 1, this.l.b, this.l.c + 1, cv.WEST, integer5);
					ayd.b(ayq, list, random, this.l.d + 1, this.l.b, this.l.c + 1, cv.EAST, integer5);
					break;
				case WEST:
					ayd.b(ayq, list, random, this.l.a + 1, this.l.b, this.l.c - 1, cv.NORTH, integer5);
					ayd.b(ayq, list, random, this.l.a + 1, this.l.b, this.l.f + 1, cv.SOUTH, integer5);
					ayd.b(ayq, list, random, this.l.a - 1, this.l.b, this.l.c + 1, cv.WEST, integer5);
					break;
				case EAST:
					ayd.b(ayq, list, random, this.l.a + 1, this.l.b, this.l.c - 1, cv.NORTH, integer5);
					ayd.b(ayq, list, random, this.l.a + 1, this.l.b, this.l.f + 1, cv.SOUTH, integer5);
					ayd.b(ayq, list, random, this.l.d + 1, this.l.b, this.l.c + 1, cv.EAST, integer5);
			}

			if (this.c) {
				if (random.nextBoolean()) {
					ayd.b(ayq, list, random, this.l.a + 1, this.l.b + 3 + 1, this.l.c - 1, cv.NORTH, integer5);
				}

				if (random.nextBoolean()) {
					ayd.b(ayq, list, random, this.l.a - 1, this.l.b + 3 + 1, this.l.c + 1, cv.WEST, integer5);
				}

				if (random.nextBoolean()) {
					ayd.b(ayq, list, random, this.l.d + 1, this.l.b + 3 + 1, this.l.c + 1, cv.EAST, integer5);
				}

				if (random.nextBoolean()) {
					ayd.b(ayq, list, random, this.l.a + 1, this.l.b + 3 + 1, this.l.f + 1, cv.SOUTH, integer5);
				}
			}
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.a(ajs, axz)) {
				return false;
			} else {
				atl atl5 = this.G_();
				if (this.c) {
					this.a(ajs, axz, this.l.a + 1, this.l.b, this.l.c, this.l.d - 1, this.l.b + 3 - 1, this.l.f, alv.a.t(), alv.a.t(), false);
					this.a(ajs, axz, this.l.a, this.l.b, this.l.c + 1, this.l.d, this.l.b + 3 - 1, this.l.f - 1, alv.a.t(), alv.a.t(), false);
					this.a(ajs, axz, this.l.a + 1, this.l.e - 2, this.l.c, this.l.d - 1, this.l.e, this.l.f, alv.a.t(), alv.a.t(), false);
					this.a(ajs, axz, this.l.a, this.l.e - 2, this.l.c + 1, this.l.d, this.l.e, this.l.f - 1, alv.a.t(), alv.a.t(), false);
					this.a(ajs, axz, this.l.a + 1, this.l.b + 3, this.l.c + 1, this.l.d - 1, this.l.b + 3, this.l.f - 1, alv.a.t(), alv.a.t(), false);
				} else {
					this.a(ajs, axz, this.l.a + 1, this.l.b, this.l.c, this.l.d - 1, this.l.e, this.l.f, alv.a.t(), alv.a.t(), false);
					this.a(ajs, axz, this.l.a, this.l.b, this.l.c + 1, this.l.d, this.l.e, this.l.f - 1, alv.a.t(), alv.a.t(), false);
				}

				this.b(ajs, axz, this.l.a + 1, this.l.b, this.l.c + 1, this.l.e);
				this.b(ajs, axz, this.l.a + 1, this.l.b, this.l.f - 1, this.l.e);
				this.b(ajs, axz, this.l.d - 1, this.l.b, this.l.c + 1, this.l.e);
				this.b(ajs, axz, this.l.d - 1, this.l.b, this.l.f - 1, this.l.e);

				for (int integer6 = this.l.a; integer6 <= this.l.d; integer6++) {
					for (int integer7 = this.l.c; integer7 <= this.l.f; integer7++) {
						if (this.a(ajs, integer6, this.l.b - 1, integer7, axz).a() == azs.a && this.b(ajs, integer6, this.l.b - 1, integer7, axz) < 8) {
							this.a(ajs, atl5, integer6, this.l.b - 1, integer7, axz);
						}
					}
				}

				return true;
			}
		}

		private void b(ajs ajs, axz axz, int integer3, int integer4, int integer5, int integer6) {
			if (this.a(ajs, integer3, integer6 + 1, integer5, axz).a() != azs.a) {
				this.a(ajs, axz, integer3, integer4, integer5, integer3, integer6, integer5, this.G_(), alv.a.t(), false);
			}
		}
	}

	abstract static class c extends ayq {
		protected ayc.a a;

		public c() {
		}

		public c(int integer, ayc.a a) {
			super(integer);
			this.a = a;
		}

		@Override
		protected void a(du du) {
			du.a("MST", this.a.ordinal());
		}

		@Override
		protected void a(du du, ayz ayz) {
			this.a = ayc.a.a(du.h("MST"));
		}

		protected atl G_() {
			switch (this.a) {
				case NORMAL:
				default:
					return alv.f.t();
				case MESA:
					return alv.f.t().a(apn.a, apn.a.DARK_OAK);
			}
		}

		protected atl b() {
			switch (this.a) {
				case NORMAL:
				default:
					return alv.aO.t();
				case MESA:
					return alv.aS.t();
			}
		}

		protected boolean a(ajs ajs, axz axz, int integer3, int integer4, int integer5, int integer6) {
			for (int integer8 = integer3; integer8 <= integer4; integer8++) {
				if (this.a(ajs, integer8, integer5 + 1, integer6, axz).a() == azs.a) {
					return false;
				}
			}

			return true;
		}
	}

	public static class d extends ayd.c {
		private final List<axz> b = Lists.newLinkedList();

		public d() {
		}

		public d(int integer1, Random random, int integer3, int integer4, ayc.a a) {
			super(integer1, a);
			this.a = a;
			this.l = new axz(integer3, 50, integer4, integer3 + 7 + random.nextInt(6), 54 + random.nextInt(6), integer4 + 7 + random.nextInt(6));
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			int integer5 = this.e();
			int integer7 = this.l.d() - 3 - 1;
			if (integer7 <= 0) {
				integer7 = 1;
			}

			int integer6 = 0;

			while (integer6 < this.l.c()) {
				integer6 += random.nextInt(this.l.c());
				if (integer6 + 3 > this.l.c()) {
					break;
				}

				ayd.c c8 = ayd.b(ayq, list, random, this.l.a + integer6, this.l.b + random.nextInt(integer7) + 1, this.l.c - 1, cv.NORTH, integer5);
				if (c8 != null) {
					axz axz9 = c8.d();
					this.b.add(new axz(axz9.a, axz9.b, this.l.c, axz9.d, axz9.e, this.l.c + 1));
				}

				integer6 += 4;
			}

			integer6 = 0;

			while (integer6 < this.l.c()) {
				integer6 += random.nextInt(this.l.c());
				if (integer6 + 3 > this.l.c()) {
					break;
				}

				ayd.c c8 = ayd.b(ayq, list, random, this.l.a + integer6, this.l.b + random.nextInt(integer7) + 1, this.l.f + 1, cv.SOUTH, integer5);
				if (c8 != null) {
					axz axz9 = c8.d();
					this.b.add(new axz(axz9.a, axz9.b, this.l.f - 1, axz9.d, axz9.e, this.l.f));
				}

				integer6 += 4;
			}

			integer6 = 0;

			while (integer6 < this.l.e()) {
				integer6 += random.nextInt(this.l.e());
				if (integer6 + 3 > this.l.e()) {
					break;
				}

				ayd.c c8 = ayd.b(ayq, list, random, this.l.a - 1, this.l.b + random.nextInt(integer7) + 1, this.l.c + integer6, cv.WEST, integer5);
				if (c8 != null) {
					axz axz9 = c8.d();
					this.b.add(new axz(this.l.a, axz9.b, axz9.c, this.l.a + 1, axz9.e, axz9.f));
				}

				integer6 += 4;
			}

			integer6 = 0;

			while (integer6 < this.l.e()) {
				integer6 += random.nextInt(this.l.e());
				if (integer6 + 3 > this.l.e()) {
					break;
				}

				ayq ayq8 = ayd.b(ayq, list, random, this.l.d + 1, this.l.b + random.nextInt(integer7) + 1, this.l.c + integer6, cv.EAST, integer5);
				if (ayq8 != null) {
					axz axz9 = ayq8.d();
					this.b.add(new axz(this.l.d - 1, axz9.b, axz9.c, this.l.d, axz9.e, axz9.f));
				}

				integer6 += 4;
			}
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.a(ajs, axz)) {
				return false;
			} else {
				this.a(ajs, axz, this.l.a, this.l.b, this.l.c, this.l.d, this.l.b, this.l.f, alv.d.t(), alv.a.t(), true);
				this.a(ajs, axz, this.l.a, this.l.b + 1, this.l.c, this.l.d, Math.min(this.l.b + 3, this.l.e), this.l.f, alv.a.t(), alv.a.t(), false);

				for (axz axz6 : this.b) {
					this.a(ajs, axz, axz6.a, axz6.e - 2, axz6.c, axz6.d, axz6.e, axz6.f, alv.a.t(), alv.a.t(), false);
				}

				this.a(ajs, axz, this.l.a, this.l.b + 4, this.l.c, this.l.d, this.l.e, this.l.f, alv.a.t(), false);
				return true;
			}
		}

		@Override
		public void a(int integer1, int integer2, int integer3) {
			super.a(integer1, integer2, integer3);

			for (axz axz6 : this.b) {
				axz6.a(integer1, integer2, integer3);
			}
		}

		@Override
		protected void a(du du) {
			super.a(du);
			ea ea3 = new ea();

			for (axz axz5 : this.b) {
				ea3.a(axz5.g());
			}

			du.a("Entrances", ea3);
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			ea ea4 = du.c("Entrances", 11);

			for (int integer5 = 0; integer5 < ea4.c(); integer5++) {
				this.b.add(new axz(ea4.d(integer5)));
			}
		}
	}

	public static class e extends ayd.c {
		public e() {
		}

		public e(int integer, Random random, axz axz, cv cv, ayc.a a) {
			super(integer, a);
			this.a(cv);
			this.l = axz;
		}

		public static axz a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv) {
			axz axz7 = new axz(integer3, integer4 - 5, integer5, integer3, integer4 + 2, integer5);
			switch (cv) {
				case NORTH:
				default:
					axz7.d = integer3 + 2;
					axz7.c = integer5 - 8;
					break;
				case SOUTH:
					axz7.d = integer3 + 2;
					axz7.f = integer5 + 8;
					break;
				case WEST:
					axz7.a = integer3 - 8;
					axz7.f = integer5 + 2;
					break;
				case EAST:
					axz7.d = integer3 + 8;
					axz7.f = integer5 + 2;
			}

			return ayq.a(list, axz7) != null ? null : axz7;
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			int integer5 = this.e();
			cv cv6 = this.f();
			if (cv6 != null) {
				switch (cv6) {
					case NORTH:
					default:
						ayd.b(ayq, list, random, this.l.a, this.l.b, this.l.c - 1, cv.NORTH, integer5);
						break;
					case SOUTH:
						ayd.b(ayq, list, random, this.l.a, this.l.b, this.l.f + 1, cv.SOUTH, integer5);
						break;
					case WEST:
						ayd.b(ayq, list, random, this.l.a - 1, this.l.b, this.l.c, cv.WEST, integer5);
						break;
					case EAST:
						ayd.b(ayq, list, random, this.l.d + 1, this.l.b, this.l.c, cv.EAST, integer5);
				}
			}
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.a(ajs, axz)) {
				return false;
			} else {
				this.a(ajs, axz, 0, 5, 0, 2, 7, 1, alv.a.t(), alv.a.t(), false);
				this.a(ajs, axz, 0, 0, 7, 2, 2, 8, alv.a.t(), alv.a.t(), false);

				for (int integer5 = 0; integer5 < 5; integer5++) {
					this.a(ajs, axz, 0, 5 - integer5 - (integer5 < 4 ? 1 : 0), 2 + integer5, 2, 7 - integer5, 2 + integer5, alv.a.t(), alv.a.t(), false);
				}

				return true;
			}
		}
	}
}
