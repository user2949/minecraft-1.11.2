import java.util.List;
import java.util.Random;

public enum avj {
	START {
		@Override
		public void a(lw lw, avk avk, List<ya> list, int integer, co co) {
			co co7 = new co(0, 128, 0);

			for (ya ya9 : list) {
				ya9.a(co7);
			}

			avk.a(PREPARING_TO_SUMMON_PILLARS);
		}
	},
	PREPARING_TO_SUMMON_PILLARS {
		@Override
		public void a(lw lw, avk avk, List<ya> list, int integer, co co) {
			if (integer < 100) {
				if (integer == 0 || integer == 50 || integer == 51 || integer == 52 || integer >= 95) {
					lw.b(3001, new co(0, 128, 0), 0);
				}
			} else {
				avk.a(SUMMONING_PILLARS);
			}
		}
	},
	SUMMONING_PILLARS {
		@Override
		public void a(lw lw, avk avk, List<ya> list, int integer, co co) {
			int integer7 = 40;
			boolean boolean8 = integer % 40 == 0;
			boolean boolean9 = integer % 40 == 39;
			if (boolean8 || boolean9) {
				axl.a[] arr10 = alg.a(lw);
				int integer11 = integer / 40;
				if (integer11 < arr10.length) {
					axl.a a12 = arr10[integer11];
					if (boolean8) {
						for (ya ya14 : list) {
							ya14.a(new co(a12.a(), a12.d() + 1, a12.b()));
						}
					} else {
						int integer13 = 10;

						for (co.a a15 : co.b(new co(a12.a() - 10, a12.d() - 10, a12.b() - 10), new co(a12.a() + 10, a12.d() + 10, a12.b() + 10))) {
							lw.g(a15);
						}

						lw.a(null, (double)((float)a12.a() + 0.5F), (double)a12.d(), (double)((float)a12.b() + 0.5F), 5.0F, true);
						axl axl14 = new axl();
						axl14.a(a12);
						axl14.a(true);
						axl14.a(new co(0, 128, 0));
						axl14.b(lw, new Random(), new co(a12.a(), 45, a12.b()));
					}
				} else if (boolean8) {
					avk.a(SUMMONING_DRAGON);
				}
			}
		}
	},
	SUMMONING_DRAGON {
		@Override
		public void a(lw lw, avk avk, List<ya> list, int integer, co co) {
			if (integer >= 100) {
				avk.a(END);
				avk.f();

				for (ya ya8 : list) {
					ya8.a(null);
					lw.a(ya8, ya8.p, ya8.q, ya8.r, 6.0F, false);
					ya8.T();
				}
			} else if (integer >= 80) {
				lw.b(3001, new co(0, 128, 0), 0);
			} else if (integer == 0) {
				for (ya ya8 : list) {
					ya8.a(new co(0, 128, 0));
				}
			} else if (integer < 5) {
				lw.b(3001, new co(0, 128, 0), 0);
			}
		}
	},
	END {
		@Override
		public void a(lw lw, avk avk, List<ya> list, int integer, co co) {
		}
	};

	private avj() {
	}

	public abstract void a(lw lw, avk avk, List<ya> list, int integer, co co);
}
