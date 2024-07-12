import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class acl {
	public dd<afj> b = dd.a();
	public List<adl> c = Lists.newArrayList();
	public int d;
	private short a;
	private int f = -1;
	private int g;
	private final Set<adl> h = Sets.newHashSet();
	protected List<acr> e = Lists.newArrayList();
	private final Set<aay> i = Sets.newHashSet();

	protected adl a(adl adl) {
		adl.e = this.c.size();
		this.c.add(adl);
		this.b.add(afj.a);
		return adl;
	}

	public void a(acr acr) {
		if (this.e.contains(acr)) {
			throw new IllegalArgumentException("Listener already listening");
		} else {
			this.e.add(acr);
			acr.a(this, this.a());
			this.b();
		}
	}

	public void b(acr acr) {
		this.e.remove(acr);
	}

	public dd<afj> a() {
		dd<afj> dd2 = dd.a();

		for (int integer3 = 0; integer3 < this.c.size(); integer3++) {
			dd2.add(((adl)this.c.get(integer3)).d());
		}

		return dd2;
	}

	public void b() {
		for (int integer2 = 0; integer2 < this.c.size(); integer2++) {
			afj afj3 = ((adl)this.c.get(integer2)).d();
			afj afj4 = this.b.get(integer2);
			if (!afj.b(afj4, afj3)) {
				afj4 = afj3.b() ? afj.a : afj3.l();
				this.b.set(integer2, afj4);

				for (int integer5 = 0; integer5 < this.e.size(); integer5++) {
					((acr)this.e.get(integer5)).a(this, integer2, afj4);
				}
			}
		}
	}

	public boolean a(aay aay, int integer) {
		return false;
	}

	@Nullable
	public adl a(rc rc, int integer) {
		for (int integer4 = 0; integer4 < this.c.size(); integer4++) {
			adl adl5 = (adl)this.c.get(integer4);
			if (adl5.a(rc, integer)) {
				return adl5;
			}
		}

		return null;
	}

	public adl a(int integer) {
		return (adl)this.c.get(integer);
	}

	public afj b(aay aay, int integer) {
		adl adl4 = (adl)this.c.get(integer);
		return adl4 != null ? adl4.d() : afj.a;
	}

	public afj a(int integer1, int integer2, acq acq, aay aay) {
		afj afj6 = afj.a;
		aax aax7 = aay.bs;
		if (acq == acq.QUICK_CRAFT) {
			int integer8 = this.g;
			this.g = c(integer2);
			if ((integer8 != 1 || this.g != 2) && integer8 != this.g) {
				this.d();
			} else if (aax7.p().b()) {
				this.d();
			} else if (this.g == 0) {
				this.f = b(integer2);
				if (a(this.f, aay)) {
					this.g = 1;
					this.h.clear();
				} else {
					this.d();
				}
			} else if (this.g == 1) {
				adl adl9 = (adl)this.c.get(integer1);
				afj afj10 = aax7.p();
				if (adl9 != null && a(adl9, afj10, true) && adl9.a(afj10) && (this.f == 2 || afj10.E() > this.h.size()) && this.b(adl9)) {
					this.h.add(adl9);
				}
			} else if (this.g == 2) {
				if (!this.h.isEmpty()) {
					afj afj9 = aax7.p().l();
					int integer10 = aax7.p().E();

					for (adl adl12 : this.h) {
						afj afj13 = aax7.p();
						if (adl12 != null && a(adl12, afj13, true) && adl12.a(afj13) && (this.f == 2 || afj13.E() >= this.h.size()) && this.b(adl12)) {
							afj afj14 = afj9.l();
							int integer15 = adl12.e() ? adl12.d().E() : 0;
							a(this.h, this.f, afj14, integer15);
							int integer16 = Math.min(afj14.d(), adl12.b(afj14));
							if (afj14.E() > integer16) {
								afj14.e(integer16);
							}

							integer10 -= afj14.E() - integer15;
							adl12.d(afj14);
						}
					}

					afj9.e(integer10);
					aax7.e(afj9);
				}

				this.d();
			} else {
				this.d();
			}
		} else if (this.g != 0) {
			this.d();
		} else if ((acq == acq.PICKUP || acq == acq.QUICK_MOVE) && (integer2 == 0 || integer2 == 1)) {
			if (integer1 == -999) {
				if (!aax7.p().b()) {
					if (integer2 == 0) {
						aay.a(aax7.p(), true);
						aax7.e(afj.a);
					}

					if (integer2 == 1) {
						aay.a(aax7.p().a(1), true);
					}
				}
			} else if (acq == acq.QUICK_MOVE) {
				if (integer1 < 0) {
					return afj.a;
				}

				adl adl8 = (adl)this.c.get(integer1);
				if (adl8 != null && adl8.a(aay)) {
					afj afj9 = this.b(aay, integer1);
					if (!afj9.b()) {
						afh afh10 = afj9.c();
						afj6 = afj9.l();
						if (adl8.d().c() == afh10) {
							this.a(integer1, integer2, true, aay);
						}
					}
				}
			} else {
				if (integer1 < 0) {
					return afj.a;
				}

				adl adl8 = (adl)this.c.get(integer1);
				if (adl8 != null) {
					afj afj9 = adl8.d();
					afj afj10 = aax7.p();
					if (!afj9.b()) {
						afj6 = afj9.l();
					}

					if (afj9.b()) {
						if (!afj10.b() && adl8.a(afj10)) {
							int integer11 = integer2 == 0 ? afj10.E() : 1;
							if (integer11 > adl8.b(afj10)) {
								integer11 = adl8.b(afj10);
							}

							adl8.d(afj10.a(integer11));
						}
					} else if (adl8.a(aay)) {
						if (afj10.b()) {
							if (afj9.b()) {
								adl8.d(afj.a);
								aax7.e(afj.a);
							} else {
								int integer11 = integer2 == 0 ? afj9.E() : (afj9.E() + 1) / 2;
								aax7.e(adl8.a(integer11));
								if (afj9.b()) {
									adl8.d(afj.a);
								}

								adl8.a(aay, aax7.p());
							}
						} else if (adl8.a(afj10)) {
							if (afj9.c() == afj10.c() && afj9.j() == afj10.j() && afj.a(afj9, afj10)) {
								int integer11 = integer2 == 0 ? afj10.E() : 1;
								if (integer11 > adl8.b(afj10) - afj9.E()) {
									integer11 = adl8.b(afj10) - afj9.E();
								}

								if (integer11 > afj10.d() - afj9.E()) {
									integer11 = afj10.d() - afj9.E();
								}

								afj10.g(integer11);
								afj9.f(integer11);
							} else if (afj10.E() <= adl8.b(afj10)) {
								adl8.d(afj10);
								aax7.e(afj9);
							}
						} else if (afj9.c() == afj10.c() && afj10.d() > 1 && (!afj9.g() || afj9.j() == afj10.j()) && afj.a(afj9, afj10) && !afj9.b()) {
							int integer11x = afj9.E();
							if (integer11x + afj10.E() <= afj10.d()) {
								afj10.f(integer11x);
								afj9 = adl8.a(integer11x);
								if (afj9.b()) {
									adl8.d(afj.a);
								}

								adl8.a(aay, aax7.p());
							}
						}
					}

					adl8.f();
				}
			}
		} else if (acq == acq.SWAP && integer2 >= 0 && integer2 < 9) {
			adl adl8 = (adl)this.c.get(integer1);
			afj afj9x = aax7.a(integer2);
			afj afj10x = adl8.d();
			if (!afj9x.b() || !afj10x.b()) {
				if (afj9x.b()) {
					if (adl8.a(aay)) {
						aax7.a(integer2, afj10x);
						adl8.b(afj10x.E());
						adl8.d(afj.a);
						adl8.a(aay, afj10x);
					}
				} else if (afj10x.b()) {
					if (adl8.a(afj9x)) {
						int integer11x = adl8.b(afj9x);
						if (afj9x.E() > integer11x) {
							adl8.d(afj9x.a(integer11x));
						} else {
							adl8.d(afj9x);
							aax7.a(integer2, afj.a);
						}
					}
				} else if (adl8.a(aay) && adl8.a(afj9x)) {
					int integer11x = adl8.b(afj9x);
					if (afj9x.E() > integer11x) {
						adl8.d(afj9x.a(integer11x));
						adl8.a(aay, afj10x);
						if (!aax7.c(afj10x)) {
							aay.a(afj10x, true);
						}
					} else {
						adl8.d(afj9x);
						aax7.a(integer2, afj10x);
						adl8.a(aay, afj10x);
					}
				}
			}
		} else if (acq == acq.CLONE && aay.bK.d && aax7.p().b() && integer1 >= 0) {
			adl adl8 = (adl)this.c.get(integer1);
			if (adl8 != null && adl8.e()) {
				afj afj9x = adl8.d().l();
				afj9x.e(afj9x.d());
				aax7.e(afj9x);
			}
		} else if (acq == acq.THROW && aax7.p().b() && integer1 >= 0) {
			adl adl8 = (adl)this.c.get(integer1);
			if (adl8 != null && adl8.e() && adl8.a(aay)) {
				afj afj9x = adl8.a(integer2 == 0 ? 1 : adl8.d().E());
				adl8.a(aay, afj9x);
				aay.a(afj9x, true);
			}
		} else if (acq == acq.PICKUP_ALL && integer1 >= 0) {
			adl adl8 = (adl)this.c.get(integer1);
			afj afj9x = aax7.p();
			if (!afj9x.b() && (adl8 == null || !adl8.e() || !adl8.a(aay))) {
				int integer10 = integer2 == 0 ? 0 : this.c.size() - 1;
				int integer11x = integer2 == 0 ? 1 : -1;

				for (int integer12 = 0; integer12 < 2; integer12++) {
					for (int integer13 = integer10; integer13 >= 0 && integer13 < this.c.size() && afj9x.E() < afj9x.d(); integer13 += integer11x) {
						adl adl14 = (adl)this.c.get(integer13);
						if (adl14.e() && a(adl14, afj9x, true) && adl14.a(aay) && this.a(afj9x, adl14)) {
							afj afj15 = adl14.d();
							if (integer12 != 0 || afj15.E() != afj15.d()) {
								int integer16 = Math.min(afj9x.d() - afj9x.E(), afj15.E());
								afj afj17 = adl14.a(integer16);
								afj9x.f(integer16);
								if (afj17.b()) {
									adl14.d(afj.a);
								}

								adl14.a(aay, afj17);
							}
						}
					}
				}
			}

			this.b();
		}

		return afj6;
	}

	public boolean a(afj afj, adl adl) {
		return true;
	}

	protected void a(int integer1, int integer2, boolean boolean3, aay aay) {
		this.a(integer1, integer2, acq.QUICK_MOVE, aay);
	}

	public void b(aay aay) {
		aax aax3 = aay.bs;
		if (!aax3.p().b()) {
			aay.a(aax3.p(), false);
			aax3.e(afj.a);
		}
	}

	public void a(rc rc) {
		this.b();
	}

	public void a(int integer, afj afj) {
		this.a(integer).d(afj);
	}

	public void a(List<afj> list) {
		for (int integer3 = 0; integer3 < list.size(); integer3++) {
			this.a(integer3).d((afj)list.get(integer3));
		}
	}

	public void b(int integer1, int integer2) {
	}

	public short a(aax aax) {
		this.a++;
		return this.a;
	}

	public boolean c(aay aay) {
		return !this.i.contains(aay);
	}

	public void a(aay aay, boolean boolean2) {
		if (boolean2) {
			this.i.remove(aay);
		} else {
			this.i.add(aay);
		}
	}

	public abstract boolean a(aay aay);

	protected boolean a(afj afj, int integer2, int integer3, boolean boolean4) {
		boolean boolean6 = false;
		int integer7 = integer2;
		if (boolean4) {
			integer7 = integer3 - 1;
		}

		if (afj.e()) {
			while (!afj.b() && (boolean4 ? integer7 >= integer2 : integer7 < integer3)) {
				adl adl8 = (adl)this.c.get(integer7);
				afj afj9 = adl8.d();
				if (!afj9.b() && afj9.c() == afj.c() && (!afj.g() || afj.j() == afj9.j()) && afj.a(afj, afj9)) {
					int integer10 = afj9.E() + afj.E();
					if (integer10 <= afj.d()) {
						afj.e(0);
						afj9.e(integer10);
						adl8.f();
						boolean6 = true;
					} else if (afj9.E() < afj.d()) {
						afj.g(afj.d() - afj9.E());
						afj9.e(afj.d());
						adl8.f();
						boolean6 = true;
					}
				}

				if (boolean4) {
					integer7--;
				} else {
					integer7++;
				}
			}
		}

		if (!afj.b()) {
			if (boolean4) {
				integer7 = integer3 - 1;
			} else {
				integer7 = integer2;
			}

			while (boolean4 ? integer7 >= integer2 : integer7 < integer3) {
				adl adl8x = (adl)this.c.get(integer7);
				afj afj9x = adl8x.d();
				if (afj9x.b() && adl8x.a(afj)) {
					if (afj.E() > adl8x.a()) {
						adl8x.d(afj.a(adl8x.a()));
					} else {
						adl8x.d(afj.a(afj.E()));
					}

					adl8x.f();
					boolean6 = true;
					break;
				}

				if (boolean4) {
					integer7--;
				} else {
					integer7++;
				}
			}
		}

		return boolean6;
	}

	public static int b(int integer) {
		return integer >> 2 & 3;
	}

	public static int c(int integer) {
		return integer & 3;
	}

	public static int d(int integer1, int integer2) {
		return integer1 & 3 | (integer2 & 3) << 2;
	}

	public static boolean a(int integer, aay aay) {
		if (integer == 0) {
			return true;
		} else {
			return integer == 1 ? true : integer == 2 && aay.bK.d;
		}
	}

	protected void d() {
		this.g = 0;
		this.h.clear();
	}

	public static boolean a(@Nullable adl adl, afj afj, boolean boolean3) {
		boolean boolean4 = adl == null || !adl.e();
		return !boolean4 && afj.a(adl.d()) && afj.a(adl.d(), afj) ? adl.d().E() + (boolean3 ? 0 : afj.E()) <= afj.d() : boolean4;
	}

	public static void a(Set<adl> set, int integer2, afj afj, int integer4) {
		switch (integer2) {
			case 0:
				afj.e(ot.d((float)afj.E() / (float)set.size()));
				break;
			case 1:
				afj.e(1);
				break;
			case 2:
				afj.e(afj.c().k());
		}

		afj.f(integer4);
	}

	public boolean b(adl adl) {
		return true;
	}

	public static int a(@Nullable asc asc) {
		return asc instanceof rc ? b((rc)asc) : 0;
	}

	public static int b(@Nullable rc rc) {
		if (rc == null) {
			return 0;
		} else {
			int integer2 = 0;
			float float3 = 0.0F;

			for (int integer4 = 0; integer4 < rc.v_(); integer4++) {
				afj afj5 = rc.a(integer4);
				if (!afj5.b()) {
					float3 += (float)afj5.E() / (float)Math.min(rc.y_(), afj5.d());
					integer2++;
				}
			}

			float3 /= (float)rc.v_();
			return ot.d(float3 * 14.0F) + (integer2 > 0 ? 1 : 0);
		}
	}
}
