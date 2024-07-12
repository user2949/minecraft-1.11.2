import com.google.common.collect.Lists;
import java.util.List;

public class atg {
	private final ajs a;
	private final co b;
	private final co c;
	private final cv d;
	private final List<co> e = Lists.newArrayList();
	private final List<co> f = Lists.newArrayList();

	public atg(ajs ajs, co co, cv cv, boolean boolean4) {
		this.a = ajs;
		this.b = co;
		if (boolean4) {
			this.d = cv;
			this.c = co.a(cv);
		} else {
			this.d = cv.d();
			this.c = co.a(cv, 2);
		}
	}

	public boolean a() {
		this.e.clear();
		this.f.clear();
		atl atl2 = this.a.o(this.c);
		if (!atc.a(atl2, this.a, this.c, this.d, false)) {
			if (atl2.p() == azv.DESTROY) {
				this.f.add(this.c);
				return true;
			} else {
				return false;
			}
		} else if (!this.a(this.c)) {
			return false;
		} else {
			for (int integer3 = 0; integer3 < this.e.size(); integer3++) {
				co co4 = (co)this.e.get(integer3);
				if (this.a.o(co4).v() == alv.cE && !this.b(co4)) {
					return false;
				}
			}

			return true;
		}
	}

	private boolean a(co co) {
		atl atl3 = this.a.o(co);
		alu alu4 = atl3.v();
		if (atl3.a() == azs.a) {
			return true;
		} else if (!atc.a(atl3, this.a, co, this.d, false)) {
			return true;
		} else if (co.equals(this.b)) {
			return true;
		} else if (this.e.contains(co)) {
			return true;
		} else {
			int integer5 = 1;
			if (integer5 + this.e.size() > 12) {
				return false;
			} else {
				while (alu4 == alv.cE) {
					co co6 = co.a(this.d.d(), integer5);
					atl3 = this.a.o(co6);
					alu4 = atl3.v();
					if (atl3.a() == azs.a || !atc.a(atl3, this.a, co6, this.d, false) || co6.equals(this.b)) {
						break;
					}

					if (++integer5 + this.e.size() > 12) {
						return false;
					}
				}

				int integer6 = 0;

				for (int integer7 = integer5 - 1; integer7 >= 0; integer7--) {
					this.e.add(co.a(this.d.d(), integer7));
					integer6++;
				}

				int integer7 = 1;

				while (true) {
					co co8 = co.a(this.d, integer7);
					int integer9 = this.e.indexOf(co8);
					if (integer9 > -1) {
						this.a(integer6, integer9);

						for (int integer10 = 0; integer10 <= integer9 + integer6; integer10++) {
							co co11 = (co)this.e.get(integer10);
							if (this.a.o(co11).v() == alv.cE && !this.b(co11)) {
								return false;
							}
						}

						return true;
					}

					atl3 = this.a.o(co8);
					if (atl3.a() == azs.a) {
						return true;
					}

					if (!atc.a(atl3, this.a, co8, this.d, true) || co8.equals(this.b)) {
						return false;
					}

					if (atl3.p() == azv.DESTROY) {
						this.f.add(co8);
						return true;
					}

					if (this.e.size() >= 12) {
						return false;
					}

					this.e.add(co8);
					integer6++;
					integer7++;
				}
			}
		}
	}

	private void a(int integer1, int integer2) {
		List<co> list4 = Lists.newArrayList();
		List<co> list5 = Lists.newArrayList();
		List<co> list6 = Lists.newArrayList();
		list4.addAll(this.e.subList(0, integer2));
		list5.addAll(this.e.subList(this.e.size() - integer1, this.e.size()));
		list6.addAll(this.e.subList(integer2, this.e.size() - integer1));
		this.e.clear();
		this.e.addAll(list4);
		this.e.addAll(list5);
		this.e.addAll(list6);
	}

	private boolean b(co co) {
		for (cv cv6 : cv.values()) {
			if (cv6.k() != this.d.k() && !this.a(co.a(cv6))) {
				return false;
			}
		}

		return true;
	}

	public List<co> c() {
		return this.e;
	}

	public List<co> d() {
		return this.f;
	}
}
