import com.google.common.collect.Lists;
import java.util.List;

public class ahi implements aho {
	private afj a;

	public ahi() {
		this.a = afj.a;
	}

	@Override
	public boolean a(acs acs, ajs ajs) {
		this.a = afj.a;
		int integer4 = 0;
		int integer5 = 0;
		int integer6 = 0;
		int integer7 = 0;
		int integer8 = 0;
		int integer9 = 0;

		for (int integer10 = 0; integer10 < acs.v_(); integer10++) {
			afj afj11 = acs.a(integer10);
			if (!afj11.b()) {
				if (afj11.c() == afl.K) {
					integer5++;
				} else if (afj11.c() == afl.cn) {
					integer7++;
				} else if (afj11.c() == afl.be) {
					integer6++;
				} else if (afj11.c() == afl.aS) {
					integer4++;
				} else if (afj11.c() == afl.bb) {
					integer8++;
				} else if (afj11.c() == afl.l) {
					integer8++;
				} else if (afj11.c() == afl.bW) {
					integer9++;
				} else if (afj11.c() == afl.J) {
					integer9++;
				} else if (afj11.c() == afl.bF) {
					integer9++;
				} else {
					if (afj11.c() != afl.ci) {
						return false;
					}

					integer9++;
				}
			}
		}

		integer8 += integer6 + integer9;
		if (integer5 > 3 || integer4 > 1) {
			return false;
		} else if (integer5 >= 1 && integer4 == 1 && integer8 == 0) {
			this.a = new afj(afl.cm, 3);
			du du10 = new du();
			if (integer7 > 0) {
				ea ea11 = new ea();

				for (int integer12 = 0; integer12 < acs.v_(); integer12++) {
					afj afj13 = acs.a(integer12);
					if (afj13.c() == afl.cn && afj13.o() && afj13.p().b("Explosion", 10)) {
						ea11.a(afj13.p().o("Explosion"));
					}
				}

				du10.a("Explosions", ea11);
			}

			du10.a("Flight", (byte)integer5);
			du du11 = new du();
			du11.a("Fireworks", du10);
			this.a.b(du11);
			return true;
		} else if (integer5 == 1 && integer4 == 0 && integer7 == 0 && integer6 > 0 && integer9 <= 1) {
			this.a = new afj(afl.cn);
			du du10 = new du();
			du du11 = new du();
			byte byte12 = 0;
			List<Integer> list13 = Lists.newArrayList();

			for (int integer14 = 0; integer14 < acs.v_(); integer14++) {
				afj afj15 = acs.a(integer14);
				if (!afj15.b()) {
					if (afj15.c() == afl.be) {
						list13.add(aen.a[afj15.j() & 15]);
					} else if (afj15.c() == afl.bb) {
						du11.a("Flicker", true);
					} else if (afj15.c() == afl.l) {
						du11.a("Trail", true);
					} else if (afj15.c() == afl.bW) {
						byte12 = 1;
					} else if (afj15.c() == afl.J) {
						byte12 = 4;
					} else if (afj15.c() == afl.bF) {
						byte12 = 2;
					} else if (afj15.c() == afl.ci) {
						byte12 = 3;
					}
				}
			}

			int[] arr14 = new int[list13.size()];

			for (int integer15 = 0; integer15 < arr14.length; integer15++) {
				arr14[integer15] = (Integer)list13.get(integer15);
			}

			du11.a("Colors", arr14);
			du11.a("Type", byte12);
			du10.a("Explosion", du11);
			this.a.b(du10);
			return true;
		} else if (integer5 == 0 && integer4 == 0 && integer7 == 1 && integer6 > 0 && integer6 == integer8) {
			List<Integer> list10 = Lists.newArrayList();

			for (int integer11 = 0; integer11 < acs.v_(); integer11++) {
				afj afj12 = acs.a(integer11);
				if (!afj12.b()) {
					if (afj12.c() == afl.be) {
						list10.add(aen.a[afj12.j() & 15]);
					} else if (afj12.c() == afl.cn) {
						this.a = afj12.l();
						this.a.e(1);
					}
				}
			}

			int[] arr11 = new int[list10.size()];

			for (int integer12x = 0; integer12x < arr11.length; integer12x++) {
				arr11[integer12x] = (Integer)list10.get(integer12x);
			}

			if (!this.a.b() && this.a.o()) {
				du du12 = this.a.p().o("Explosion");
				if (du12 == null) {
					return false;
				} else {
					du12.a("FadeColors", arr11);
					return true;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public afj a(acs acs) {
		return this.a.l();
	}

	@Override
	public int a() {
		return 10;
	}

	@Override
	public afj b() {
		return this.a;
	}

	@Override
	public dd<afj> b(acs acs) {
		dd<afj> dd3 = dd.a(acs.v_(), afj.a);

		for (int integer4 = 0; integer4 < dd3.size(); integer4++) {
			afj afj5 = acs.a(integer4);
			if (afj5.c().s()) {
				dd3.set(integer4, new afj(afj5.c().r()));
			}
		}

		return dd3;
	}
}
