import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ma {
	private static final Logger c = LogManager.getLogger();
	private final sn d;
	private final int e;
	private int f;
	private final int g;
	private long h;
	private long i;
	private long j;
	private int k;
	private int l;
	private int m;
	private double n;
	private double o;
	private double p;
	public int a;
	private double q;
	private double r;
	private double s;
	private boolean t;
	private final boolean u;
	private int v;
	private List<sn> w = Collections.emptyList();
	private boolean x;
	private boolean y;
	public boolean b;
	private final Set<ly> z = Sets.newHashSet();

	public ma(sn sn, int integer2, int integer3, int integer4, boolean boolean5) {
		this.d = sn;
		this.e = integer2;
		this.f = integer3;
		this.g = integer4;
		this.u = boolean5;
		this.h = lt.a(sn.p);
		this.i = lt.a(sn.q);
		this.j = lt.a(sn.r);
		this.k = ot.d(sn.v * 256.0F / 360.0F);
		this.l = ot.d(sn.w * 256.0F / 360.0F);
		this.m = ot.d(sn.aU() * 256.0F / 360.0F);
		this.y = sn.z;
	}

	public boolean equals(Object object) {
		return object instanceof ma ? ((ma)object).d.O() == this.d.O() : false;
	}

	public int hashCode() {
		return this.d.O();
	}

	public void a(List<aay> list) {
		this.b = false;
		if (!this.t || this.d.d(this.q, this.r, this.s) > 16.0) {
			this.q = this.d.p;
			this.r = this.d.q;
			this.s = this.d.r;
			this.t = true;
			this.b = true;
			this.b(list);
		}

		List<sn> list3 = this.d.bx();
		if (!list3.equals(this.w)) {
			this.w = list3;
			this.a(new hz(this.d));
		}

		if (this.d instanceof yz && this.a % 10 == 0) {
			yz yz4 = (yz)this.d;
			afj afj5 = yz4.r();
			if (afj5.c() instanceof afp) {
				bbn bbn6 = afl.bl.a(afj5, this.d.l);

				for (aay aay8 : list) {
					ly ly9 = (ly)aay8;
					bbn6.a(ly9, afj5);
					fm<?> fm10 = afl.bl.a(afj5, this.d.l, ly9);
					if (fm10 != null) {
						ly9.a.a(fm10);
					}
				}
			}

			this.d();
		}

		if (this.a % this.g == 0 || this.d.ai || this.d.R().a()) {
			if (this.d.aK()) {
				int integer4 = ot.d(this.d.v * 256.0F / 360.0F);
				int integer5 = ot.d(this.d.w * 256.0F / 360.0F);
				boolean boolean6 = Math.abs(integer4 - this.k) >= 1 || Math.abs(integer5 - this.l) >= 1;
				if (boolean6) {
					this.a(new hb.c(this.d.O(), (byte)integer4, (byte)integer5, this.d.z));
					this.k = integer4;
					this.l = integer5;
				}

				this.h = lt.a(this.d.p);
				this.i = lt.a(this.d.q);
				this.j = lt.a(this.d.r);
				this.d();
				this.x = true;
			} else {
				this.v++;
				long long4 = lt.a(this.d.p);
				long long6 = lt.a(this.d.q);
				long long8 = lt.a(this.d.r);
				int integer10 = ot.d(this.d.v * 256.0F / 360.0F);
				int integer11 = ot.d(this.d.w * 256.0F / 360.0F);
				long long12 = long4 - this.h;
				long long14 = long6 - this.i;
				long long16 = long8 - this.j;
				fm<?> fm18 = null;
				boolean boolean19 = long12 * long12 + long14 * long14 + long16 * long16 >= 128L || this.a % 60 == 0;
				boolean boolean20 = Math.abs(integer10 - this.k) >= 1 || Math.abs(integer11 - this.l) >= 1;
				if (this.a > 0 || this.d instanceof abb) {
					if (long12 >= -32768L
						&& long12 < 32768L
						&& long14 >= -32768L
						&& long14 < 32768L
						&& long16 >= -32768L
						&& long16 < 32768L
						&& this.v <= 400
						&& !this.x
						&& this.y == this.d.z) {
						if ((!boolean19 || !boolean20) && !(this.d instanceof abb)) {
							if (boolean19) {
								fm18 = new hb.a(this.d.O(), long12, long14, long16, this.d.z);
							} else if (boolean20) {
								fm18 = new hb.c(this.d.O(), (byte)integer10, (byte)integer11, this.d.z);
							}
						} else {
							fm18 = new hb.b(this.d.O(), long12, long14, long16, (byte)integer10, (byte)integer11, this.d.z);
						}
					} else {
						this.y = this.d.z;
						this.v = 0;
						this.c();
						fm18 = new ij(this.d);
					}
				}

				boolean boolean21 = this.u;
				if (this.d instanceof sw && ((sw)this.d).cH()) {
					boolean21 = true;
				}

				if (boolean21 && this.a > 0) {
					double double22 = this.d.s - this.n;
					double double24 = this.d.t - this.o;
					double double26 = this.d.u - this.p;
					double double28 = 0.02;
					double double30 = double22 * double22 + double24 * double24 + double26 * double26;
					if (double30 > 4.0E-4 || double30 > 0.0 && this.d.s == 0.0 && this.d.t == 0.0 && this.d.u == 0.0) {
						this.n = this.d.s;
						this.o = this.d.t;
						this.p = this.d.u;
						this.a(new hu(this.d.O(), this.n, this.o, this.p));
					}
				}

				if (fm18 != null) {
					this.a(fm18);
				}

				this.d();
				if (boolean19) {
					this.h = long4;
					this.i = long6;
					this.j = long8;
				}

				if (boolean20) {
					this.k = integer10;
					this.l = integer11;
				}

				this.x = false;
			}

			int integer4 = ot.d(this.d.aU() * 256.0F / 360.0F);
			if (Math.abs(integer4 - this.m) >= 1) {
				this.a(new hn(this.d, (byte)integer4));
				this.m = integer4;
			}

			this.d.ai = false;
		}

		this.a++;
		if (this.d.D) {
			this.b(new hu(this.d));
			this.d.D = false;
		}
	}

	private void d() {
		kn kn2 = this.d.R();
		if (kn2.a()) {
			this.b(new hs(this.d.O(), kn2, false));
		}

		if (this.d instanceof sw) {
			tp tp3 = (tp)((sw)this.d).ce();
			Set<tk> set4 = tp3.b();
			if (!set4.isEmpty()) {
				this.b(new ik(this.d.O(), set4));
			}

			set4.clear();
		}
	}

	public void a(fm<?> fm) {
		for (ly ly4 : this.z) {
			ly4.a.a(fm);
		}
	}

	public void b(fm<?> fm) {
		this.a(fm);
		if (this.d instanceof ly) {
			((ly)this.d).a.a(fm);
		}
	}

	public void a() {
		for (ly ly3 : this.z) {
			this.d.c(ly3);
			ly3.c(this.d);
		}
	}

	public void a(ly ly) {
		if (this.z.contains(ly)) {
			this.d.c(ly);
			ly.c(this.d);
			this.z.remove(ly);
		}
	}

	public void b(ly ly) {
		if (ly != this.d) {
			if (this.c(ly)) {
				if (!this.z.contains(ly) && (this.e(ly) || this.d.k)) {
					this.z.add(ly);
					fm<?> fm3 = this.e();
					ly.a.a(fm3);
					if (!this.d.R().d()) {
						ly.a.a(new hs(this.d.O(), this.d.R(), true));
					}

					boolean boolean4 = this.u;
					if (this.d instanceof sw) {
						tp tp5 = (tp)((sw)this.d).ce();
						Collection<tk> collection6 = tp5.c();
						if (!collection6.isEmpty()) {
							ly.a.a(new ik(this.d.O(), collection6));
						}

						if (((sw)this.d).cH()) {
							boolean4 = true;
						}
					}

					this.n = this.d.s;
					this.o = this.d.t;
					this.p = this.d.u;
					if (boolean4 && !(fm3 instanceof ft)) {
						ly.a.a(new hu(this.d.O(), this.d.s, this.d.t, this.d.u));
					}

					if (this.d instanceof sw) {
						for (ss ss8 : ss.values()) {
							afj afj9 = ((sw)this.d).b(ss8);
							if (!afj9.b()) {
								ly.a.a(new hv(this.d.O(), ss8, afj9));
							}
						}
					}

					if (this.d instanceof aay) {
						aay aay5 = (aay)this.d;
						if (aay5.cr()) {
							ly.a.a(new hi(aay5, new co(this.d)));
						}
					}

					if (this.d instanceof sw) {
						sw sw5 = (sw)this.d;

						for (sh sh7 : sw5.bS()) {
							ly.a.a(new il(this.d.O(), sh7));
						}
					}

					if (!this.d.bx().isEmpty()) {
						ly.a.a(new hz(this.d));
					}

					if (this.d.aK()) {
						ly.a.a(new hz(this.d.bB()));
					}

					this.d.b(ly);
					ly.d(this.d);
				}
			} else if (this.z.contains(ly)) {
				this.z.remove(ly);
				this.d.c(ly);
				ly.c(this.d);
			}
		}
	}

	public boolean c(ly ly) {
		double double3 = ly.p - (double)this.h / 4096.0;
		double double5 = ly.r - (double)this.j / 4096.0;
		int integer7 = Math.min(this.e, this.f);
		return double3 >= (double)(-integer7) && double3 <= (double)integer7 && double5 >= (double)(-integer7) && double5 <= (double)integer7 && this.d.a(ly);
	}

	private boolean e(ly ly) {
		return ly.x().w().a(ly, this.d.ab, this.d.ad);
	}

	public void b(List<aay> list) {
		for (int integer3 = 0; integer3 < list.size(); integer3++) {
			this.b((ly)list.get(integer3));
		}
	}

	private fm<?> e() {
		if (this.d.F) {
			c.warn("Fetching addPacket for removed entity");
		}

		if (this.d instanceof ly) {
			return new fv((aay)this.d);
		} else if (this.d instanceof sm) {
			this.m = ot.d(this.d.aU() * 256.0F / 360.0F);
			return new ft((sw)this.d);
		} else if (this.d instanceof zb) {
			return new fu((zb)this.d);
		} else if (this.d instanceof zj) {
			return new fq(this.d, 2, 1);
		} else if (this.d instanceof aby) {
			aby aby2 = (aby)this.d;
			return new fq(this.d, 10, aby2.v().a());
		} else if (this.d instanceof abx) {
			return new fq(this.d, 1);
		} else if (this.d instanceof st) {
			return new fr((st)this.d);
		} else if (this.d instanceof zd) {
			sn sn2 = ((zd)this.d).l();
			return new fq(this.d, 90, sn2 == null ? this.d.O() : sn2.O());
		} else if (this.d instanceof abo) {
			sn sn2 = ((abo)this.d).e;
			return new fq(this.d, 91, 1 + (sn2 == null ? this.d.O() : sn2.O()));
		} else if (this.d instanceof abu) {
			sn sn2 = ((abb)this.d).e;
			return new fq(this.d, 60, 1 + (sn2 == null ? this.d.O() : sn2.O()));
		} else if (this.d instanceof abn) {
			return new fq(this.d, 61);
		} else if (this.d instanceof abi) {
			return new fq(this.d, 68);
		} else if (this.d instanceof abt) {
			return new fq(this.d, 73);
		} else if (this.d instanceof abs) {
			return new fq(this.d, 75);
		} else if (this.d instanceof abr) {
			return new fq(this.d, 65);
		} else if (this.d instanceof abe) {
			return new fq(this.d, 72);
		} else if (this.d instanceof abg) {
			return new fq(this.d, 76);
		} else if (this.d instanceof abf) {
			abf abf2 = (abf)this.d;
			fq fq3 = null;
			int integer4 = 63;
			if (this.d instanceof abm) {
				integer4 = 64;
			} else if (this.d instanceof abc) {
				integer4 = 93;
			} else if (this.d instanceof abv) {
				integer4 = 66;
			}

			if (abf2.a != null) {
				fq3 = new fq(this.d, integer4, ((abf)this.d).a.O());
			} else {
				fq3 = new fq(this.d, integer4, 0);
			}

			fq3.a((int)(abf2.b * 8000.0));
			fq3.b((int)(abf2.c * 8000.0));
			fq3.c((int)(abf2.d * 8000.0));
			return fq3;
		} else if (this.d instanceof abl) {
			fq fq2 = new fq(this.d, 67, 0);
			fq2.a((int)(this.d.s * 8000.0));
			fq2.b((int)(this.d.t * 8000.0));
			fq2.c((int)(this.d.u * 8000.0));
			return fq2;
		} else if (this.d instanceof abq) {
			return new fq(this.d, 62);
		} else if (this.d instanceof abd) {
			return new fq(this.d, 79);
		} else if (this.d instanceof zk) {
			return new fq(this.d, 50);
		} else if (this.d instanceof ya) {
			return new fq(this.d, 51);
		} else if (this.d instanceof zi) {
			zi zi2 = (zi)this.d;
			return new fq(this.d, 70, alu.j(zi2.l()));
		} else if (this.d instanceof yx) {
			return new fq(this.d, 78);
		} else if (this.d instanceof yz) {
			yz yz2 = (yz)this.d;
			return new fq(this.d, 71, yz2.b.b(), yz2.q());
		} else if (this.d instanceof za) {
			za za2 = (za)this.d;
			return new fq(this.d, 77, 0, za2.q());
		} else if (this.d instanceof sl) {
			return new fq(this.d, 3);
		} else {
			throw new IllegalArgumentException("Don't know how to add " + this.d.getClass() + "!");
		}
	}

	public void d(ly ly) {
		if (this.z.contains(ly)) {
			this.z.remove(ly);
			this.d.c(ly);
			ly.c(this.d);
		}
	}

	public sn b() {
		return this.d;
	}

	public void a(int integer) {
		this.f = integer;
	}

	public void c() {
		this.t = false;
	}
}
