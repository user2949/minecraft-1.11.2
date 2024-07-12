import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class auo {
	private static final Logger e = LogManager.getLogger();
	public static final aup a = null;
	private final aup[] f = new aup[16];
	private final byte[] g = new byte[256];
	private final int[] h = new int[256];
	private final boolean[] i = new boolean[256];
	private boolean j;
	private final ajs k;
	private final int[] l;
	public final int b;
	public final int c;
	private boolean m;
	private final Map<co, asc> n = Maps.newHashMap();
	private final of<sn>[] o;
	private boolean p;
	private boolean q;
	private boolean r;
	private boolean s;
	private boolean t;
	private long u;
	private int v;
	private long w;
	private int x = 4096;
	private final ConcurrentLinkedQueue<co> y = Queues.newConcurrentLinkedQueue();
	public boolean d;

	public auo(ajs ajs, int integer2, int integer3) {
		this.o = new of[16];
		this.k = ajs;
		this.b = integer2;
		this.c = integer3;
		this.l = new int[256];

		for (int integer5 = 0; integer5 < this.o.length; integer5++) {
			this.o[integer5] = new of<>(sn.class);
		}

		Arrays.fill(this.h, -999);
		Arrays.fill(this.g, (byte)-1);
	}

	public auo(ajs ajs, avp avp, int integer3, int integer4) {
		this(ajs, integer3, integer4);
		int integer6 = 256;
		boolean boolean7 = ajs.s.m();

		for (int integer8 = 0; integer8 < 16; integer8++) {
			for (int integer9 = 0; integer9 < 16; integer9++) {
				for (int integer10 = 0; integer10 < 256; integer10++) {
					atl atl11 = avp.a(integer8, integer10, integer9);
					if (atl11.a() != azs.a) {
						int integer12 = integer10 >> 4;
						if (this.f[integer12] == a) {
							this.f[integer12] = new aup(integer12 << 4, boolean7);
						}

						this.f[integer12].a(integer8, integer10 & 15, integer9, atl11);
					}
				}
			}
		}
	}

	public boolean a(int integer1, int integer2) {
		return integer1 == this.b && integer2 == this.c;
	}

	public int e(co co) {
		return this.b(co.p() & 15, co.r() & 15);
	}

	public int b(int integer1, int integer2) {
		return this.l[integer2 << 4 | integer1];
	}

	@Nullable
	private aup y() {
		for (int integer2 = this.f.length - 1; integer2 >= 0; integer2--) {
			if (this.f[integer2] != a) {
				return this.f[integer2];
			}
		}

		return null;
	}

	public int g() {
		aup aup2 = this.y();
		return aup2 == null ? 0 : aup2.d();
	}

	public aup[] h() {
		return this.f;
	}

	protected void a() {
		int integer2 = this.g();
		this.v = Integer.MAX_VALUE;

		for (int integer3 = 0; integer3 < 16; integer3++) {
			for (int integer4 = 0; integer4 < 16; integer4++) {
				this.h[integer3 + (integer4 << 4)] = -999;

				for (int integer5 = integer2 + 16; integer5 > 0; integer5--) {
					atl atl6 = this.a(integer3, integer5 - 1, integer4);
					if (atl6.c() != 0) {
						this.l[integer4 << 4 | integer3] = integer5;
						if (integer5 < this.v) {
							this.v = integer5;
						}
						break;
					}
				}
			}
		}

		this.s = true;
	}

	public void b() {
		int integer2 = this.g();
		this.v = Integer.MAX_VALUE;

		for (int integer3 = 0; integer3 < 16; integer3++) {
			for (int integer4 = 0; integer4 < 16; integer4++) {
				this.h[integer3 + (integer4 << 4)] = -999;

				for (int integer5 = integer2 + 16; integer5 > 0; integer5--) {
					if (this.d(integer3, integer5 - 1, integer4) != 0) {
						this.l[integer4 << 4 | integer3] = integer5;
						if (integer5 < this.v) {
							this.v = integer5;
						}
						break;
					}
				}

				if (this.k.s.m()) {
					int integer5x = 15;
					int integer6 = integer2 + 16 - 1;

					while (true) {
						int integer7 = this.d(integer3, integer6, integer4);
						if (integer7 == 0 && integer5x != 15) {
							integer7 = 1;
						}

						integer5x -= integer7;
						if (integer5x > 0) {
							aup aup8 = this.f[integer6 >> 4];
							if (aup8 != a) {
								aup8.a(integer3, integer6 & 15, integer4, integer5x);
								this.k.m(new co((this.b << 4) + integer3, integer6, (this.c << 4) + integer4));
							}
						}

						if (--integer6 <= 0 || integer5x <= 0) {
							break;
						}
					}
				}
			}
		}

		this.s = true;
	}

	private void d(int integer1, int integer2) {
		this.i[integer1 + integer2 * 16] = true;
		this.m = true;
	}

	private void h(boolean boolean1) {
		this.k.C.a("recheckGaps");
		if (this.k.a(new co(this.b * 16 + 8, 0, this.c * 16 + 8), 16)) {
			for (int integer3 = 0; integer3 < 16; integer3++) {
				for (int integer4 = 0; integer4 < 16; integer4++) {
					if (this.i[integer3 + integer4 * 16]) {
						this.i[integer3 + integer4 * 16] = false;
						int integer5 = this.b(integer3, integer4);
						int integer6 = this.b * 16 + integer3;
						int integer7 = this.c * 16 + integer4;
						int integer8 = Integer.MAX_VALUE;

						for (cv cv10 : cv.c.HORIZONTAL) {
							integer8 = Math.min(integer8, this.k.d(integer6 + cv10.g(), integer7 + cv10.i()));
						}

						this.b(integer6, integer7, integer8);

						for (cv cv10 : cv.c.HORIZONTAL) {
							this.b(integer6 + cv10.g(), integer7 + cv10.i(), integer5);
						}

						if (boolean1) {
							this.k.C.b();
							return;
						}
					}
				}
			}

			this.m = false;
		}

		this.k.C.b();
	}

	private void b(int integer1, int integer2, int integer3) {
		int integer5 = this.k.l(new co(integer1, 0, integer2)).q();
		if (integer5 > integer3) {
			this.a(integer1, integer2, integer3, integer5 + 1);
		} else if (integer5 < integer3) {
			this.a(integer1, integer2, integer5, integer3 + 1);
		}
	}

	private void a(int integer1, int integer2, int integer3, int integer4) {
		if (integer4 > integer3 && this.k.a(new co(integer1, 0, integer2), 16)) {
			for (int integer6 = integer3; integer6 < integer4; integer6++) {
				this.k.c(ajy.SKY, new co(integer1, integer6, integer2));
			}

			this.s = true;
		}
	}

	private void c(int integer1, int integer2, int integer3) {
		int integer5 = this.l[integer3 << 4 | integer1] & 0xFF;
		int integer6 = integer5;
		if (integer2 > integer5) {
			integer6 = integer2;
		}

		while (integer6 > 0 && this.d(integer1, integer6 - 1, integer3) == 0) {
			integer6--;
		}

		if (integer6 != integer5) {
			this.k.a(integer1 + this.b * 16, integer3 + this.c * 16, integer6, integer5);
			this.l[integer3 << 4 | integer1] = integer6;
			int integer7 = this.b * 16 + integer1;
			int integer8 = this.c * 16 + integer3;
			if (this.k.s.m()) {
				if (integer6 < integer5) {
					for (int integer9 = integer6; integer9 < integer5; integer9++) {
						aup aup10 = this.f[integer9 >> 4];
						if (aup10 != a) {
							aup10.a(integer1, integer9 & 15, integer3, 15);
							this.k.m(new co((this.b << 4) + integer1, integer9, (this.c << 4) + integer3));
						}
					}
				} else {
					for (int integer9x = integer5; integer9x < integer6; integer9x++) {
						aup aup10 = this.f[integer9x >> 4];
						if (aup10 != a) {
							aup10.a(integer1, integer9x & 15, integer3, 0);
							this.k.m(new co((this.b << 4) + integer1, integer9x, (this.c << 4) + integer3));
						}
					}
				}

				int integer9xx = 15;

				while (integer6 > 0 && integer9xx > 0) {
					int integer10 = this.d(integer1, --integer6, integer3);
					if (integer10 == 0) {
						integer10 = 1;
					}

					integer9xx -= integer10;
					if (integer9xx < 0) {
						integer9xx = 0;
					}

					aup aup11 = this.f[integer6 >> 4];
					if (aup11 != a) {
						aup11.a(integer1, integer6 & 15, integer3, integer9xx);
					}
				}
			}

			int integer9xx = this.l[integer3 << 4 | integer1];
			int integer10x = integer5;
			int integer11 = integer9xx;
			if (integer9xx < integer5) {
				integer10x = integer9xx;
				integer11 = integer5;
			}

			if (integer9xx < this.v) {
				this.v = integer9xx;
			}

			if (this.k.s.m()) {
				for (cv cv13 : cv.c.HORIZONTAL) {
					this.a(integer7 + cv13.g(), integer8 + cv13.i(), integer10x, integer11);
				}

				this.a(integer7, integer8, integer10x, integer11);
			}

			this.s = true;
		}
	}

	public int b(co co) {
		return this.a(co).c();
	}

	private int d(int integer1, int integer2, int integer3) {
		return this.a(integer1, integer2, integer3).c();
	}

	public atl a(co co) {
		return this.a(co.p(), co.q(), co.r());
	}

	public atl a(int integer1, int integer2, int integer3) {
		if (this.k.L() == ajx.g) {
			atl atl5 = null;
			if (integer2 == 60) {
				atl5 = alv.cv.t();
			}

			if (integer2 == 70) {
				atl5 = avr.c(integer1, integer3);
			}

			return atl5 == null ? alv.a.t() : atl5;
		} else {
			try {
				if (integer2 >= 0 && integer2 >> 4 < this.f.length) {
					aup aup5 = this.f[integer2 >> 4];
					if (aup5 != a) {
						return aup5.a(integer1 & 15, integer2 & 15, integer3 & 15);
					}
				}

				return alv.a.t();
			} catch (Throwable var7) {
				b b6 = b.a(var7, "Getting block state");
				c c7 = b6.a("Block being got");
				c7.a("Location", new d<String>() {
					public String call() throws Exception {
						return c.a(integer1, integer2, integer3);
					}
				});
				throw new f(b6);
			}
		}
	}

	@Nullable
	public atl a(co co, atl atl) {
		int integer4 = co.p() & 15;
		int integer5 = co.q();
		int integer6 = co.r() & 15;
		int integer7 = integer6 << 4 | integer4;
		if (integer5 >= this.h[integer7] - 1) {
			this.h[integer7] = -999;
		}

		int integer8 = this.l[integer7];
		atl atl9 = this.a(co);
		if (atl9 == atl) {
			return null;
		} else {
			alu alu10 = atl.v();
			alu alu11 = atl9.v();
			aup aup12 = this.f[integer5 >> 4];
			boolean boolean13 = false;
			if (aup12 == a) {
				if (alu10 == alv.a) {
					return null;
				}

				aup12 = new aup(integer5 >> 4 << 4, this.k.s.m());
				this.f[integer5 >> 4] = aup12;
				boolean13 = integer5 >= integer8;
			}

			aup12.a(integer4, integer5 & 15, integer6, atl);
			if (alu11 != alu10) {
				if (!this.k.E) {
					alu11.b(this.k, co, atl9);
				} else if (alu11 instanceof ani) {
					this.k.s(co);
				}
			}

			if (aup12.a(integer4, integer5 & 15, integer6).v() != alu10) {
				return null;
			} else {
				if (boolean13) {
					this.b();
				} else {
					int integer14 = atl.c();
					int integer15 = atl9.c();
					if (integer14 > 0) {
						if (integer5 >= integer8) {
							this.c(integer4, integer5 + 1, integer6);
						}
					} else if (integer5 == integer8 - 1) {
						this.c(integer4, integer5, integer6);
					}

					if (integer14 != integer15 && (integer14 < integer15 || this.a(ajy.SKY, co) > 0 || this.a(ajy.BLOCK, co) > 0)) {
						this.d(integer4, integer6);
					}
				}

				if (alu11 instanceof ani) {
					asc asc14 = this.a(co, auo.a.CHECK);
					if (asc14 != null) {
						asc14.B();
					}
				}

				if (!this.k.E && alu11 != alu10) {
					alu10.c(this.k, co, atl);
				}

				if (alu10 instanceof ani) {
					asc asc14 = this.a(co, auo.a.CHECK);
					if (asc14 == null) {
						asc14 = ((ani)alu10).a(this.k, alu10.e(atl));
						this.k.a(co, asc14);
					}

					if (asc14 != null) {
						asc14.B();
					}
				}

				this.s = true;
				return atl9;
			}
		}
	}

	public int a(ajy ajy, co co) {
		int integer4 = co.p() & 15;
		int integer5 = co.q();
		int integer6 = co.r() & 15;
		aup aup7 = this.f[integer5 >> 4];
		if (aup7 == a) {
			return this.c(co) ? ajy.c : 0;
		} else if (ajy == ajy.SKY) {
			return !this.k.s.m() ? 0 : aup7.b(integer4, integer5 & 15, integer6);
		} else {
			return ajy == ajy.BLOCK ? aup7.c(integer4, integer5 & 15, integer6) : ajy.c;
		}
	}

	public void a(ajy ajy, co co, int integer) {
		int integer5 = co.p() & 15;
		int integer6 = co.q();
		int integer7 = co.r() & 15;
		aup aup8 = this.f[integer6 >> 4];
		if (aup8 == a) {
			aup8 = new aup(integer6 >> 4 << 4, this.k.s.m());
			this.f[integer6 >> 4] = aup8;
			this.b();
		}

		this.s = true;
		if (ajy == ajy.SKY) {
			if (this.k.s.m()) {
				aup8.a(integer5, integer6 & 15, integer7, integer);
			}
		} else if (ajy == ajy.BLOCK) {
			aup8.b(integer5, integer6 & 15, integer7, integer);
		}
	}

	public int a(co co, int integer) {
		int integer4 = co.p() & 15;
		int integer5 = co.q();
		int integer6 = co.r() & 15;
		aup aup7 = this.f[integer5 >> 4];
		if (aup7 == a) {
			return this.k.s.m() && integer < ajy.SKY.c ? ajy.SKY.c - integer : 0;
		} else {
			int integer8 = !this.k.s.m() ? 0 : aup7.b(integer4, integer5 & 15, integer6);
			integer8 -= integer;
			int integer9 = aup7.c(integer4, integer5 & 15, integer6);
			if (integer9 > integer8) {
				integer8 = integer9;
			}

			return integer8;
		}
	}

	public void a(sn sn) {
		this.t = true;
		int integer3 = ot.c(sn.p / 16.0);
		int integer4 = ot.c(sn.r / 16.0);
		if (integer3 != this.b || integer4 != this.c) {
			e.warn("Wrong location! ({}, {}) should be ({}, {}), {}", new Object[]{integer3, integer4, this.b, this.c, sn});
			sn.T();
		}

		int integer5 = ot.c(sn.q / 16.0);
		if (integer5 < 0) {
			integer5 = 0;
		}

		if (integer5 >= this.o.length) {
			integer5 = this.o.length - 1;
		}

		sn.aa = true;
		sn.ab = this.b;
		sn.ac = integer5;
		sn.ad = this.c;
		this.o[integer5].add(sn);
	}

	public void b(sn sn) {
		this.a(sn, sn.ac);
	}

	public void a(sn sn, int integer) {
		if (integer < 0) {
			integer = 0;
		}

		if (integer >= this.o.length) {
			integer = this.o.length - 1;
		}

		this.o[integer].remove(sn);
	}

	public boolean c(co co) {
		int integer3 = co.p() & 15;
		int integer4 = co.q();
		int integer5 = co.r() & 15;
		return integer4 >= this.l[integer5 << 4 | integer3];
	}

	@Nullable
	private asc g(co co) {
		atl atl3 = this.a(co);
		alu alu4 = atl3.v();
		return !alu4.l() ? null : ((ani)alu4).a(this.k, atl3.v().e(atl3));
	}

	@Nullable
	public asc a(co co, auo.a a) {
		asc asc4 = (asc)this.n.get(co);
		if (asc4 == null) {
			if (a == auo.a.IMMEDIATE) {
				asc4 = this.g(co);
				this.k.a(co, asc4);
			} else if (a == auo.a.QUEUED) {
				this.y.add(co);
			}
		} else if (asc4.y()) {
			this.n.remove(co);
			return null;
		}

		return asc4;
	}

	public void a(asc asc) {
		this.a(asc.w(), asc);
		if (this.j) {
			this.k.a(asc);
		}
	}

	public void a(co co, asc asc) {
		asc.a(this.k);
		asc.a(co);
		if (this.a(co).v() instanceof ani) {
			if (this.n.containsKey(co)) {
				((asc)this.n.get(co)).z();
			}

			asc.A();
			this.n.put(co, asc);
		}
	}

	public void d(co co) {
		if (this.j) {
			asc asc3 = (asc)this.n.remove(co);
			if (asc3 != null) {
				asc3.z();
			}
		}
	}

	public void c() {
		this.j = true;
		this.k.b(this.n.values());

		for (of<sn> of5 : this.o) {
			this.k.a(of5);
		}
	}

	public void d() {
		this.j = false;

		for (asc asc3 : this.n.values()) {
			this.k.b(asc3);
		}

		for (of<sn> of5 : this.o) {
			this.k.c(of5);
		}
	}

	public void e() {
		this.s = true;
	}

	public void a(@Nullable sn sn, bdt bdt, List<sn> list, Predicate<? super sn> predicate) {
		int integer6 = ot.c((bdt.b - 2.0) / 16.0);
		int integer7 = ot.c((bdt.e + 2.0) / 16.0);
		integer6 = ot.a(integer6, 0, this.o.length - 1);
		integer7 = ot.a(integer7, 0, this.o.length - 1);

		for (int integer8 = integer6; integer8 <= integer7; integer8++) {
			if (!this.o[integer8].isEmpty()) {
				for (sn sn10 : this.o[integer8]) {
					if (sn10.bo().c(bdt) && sn10 != sn) {
						if (predicate == null || predicate.apply(sn10)) {
							list.add(sn10);
						}

						sn[] arr11 = sn10.aT();
						if (arr11 != null) {
							for (sn sn15 : arr11) {
								if (sn15 != sn && sn15.bo().c(bdt) && (predicate == null || predicate.apply(sn15))) {
									list.add(sn15);
								}
							}
						}
					}
				}
			}
		}
	}

	public <T extends sn> void a(Class<? extends T> class1, bdt bdt, List<T> list, Predicate<? super T> predicate) {
		int integer6 = ot.c((bdt.b - 2.0) / 16.0);
		int integer7 = ot.c((bdt.e + 2.0) / 16.0);
		integer6 = ot.a(integer6, 0, this.o.length - 1);
		integer7 = ot.a(integer7, 0, this.o.length - 1);

		for (int integer8 = integer6; integer8 <= integer7; integer8++) {
			for (T sn10 : this.o[integer8].c(class1)) {
				if (sn10.bo().c(bdt) && (predicate == null || predicate.apply(sn10))) {
					list.add(sn10);
				}
			}
		}
	}

	public boolean a(boolean boolean1) {
		if (boolean1) {
			if (this.t && this.k.P() != this.u || this.s) {
				return true;
			}
		} else if (this.t && this.k.P() >= this.u + 600L) {
			return true;
		}

		return this.s;
	}

	public Random a(long long1) {
		return new Random(
			this.k.O() + (long)(this.b * this.b * 4987142) + (long)(this.b * 5947611) + (long)(this.c * this.c) * 4392871L + (long)(this.c * 389711) ^ long1
		);
	}

	public boolean f() {
		return false;
	}

	public void a(auj auj, aui aui) {
		auo auo4 = auj.a(this.b, this.c - 1);
		auo auo5 = auj.a(this.b + 1, this.c);
		auo auo6 = auj.a(this.b, this.c + 1);
		auo auo7 = auj.a(this.b - 1, this.c);
		if (auo5 != null && auo6 != null && auj.a(this.b + 1, this.c + 1) != null) {
			this.a(aui);
		}

		if (auo7 != null && auo6 != null && auj.a(this.b - 1, this.c + 1) != null) {
			auo7.a(aui);
		}

		if (auo4 != null && auo5 != null && auj.a(this.b + 1, this.c - 1) != null) {
			auo4.a(aui);
		}

		if (auo4 != null && auo7 != null) {
			auo auo8 = auj.a(this.b - 1, this.c - 1);
			if (auo8 != null) {
				auo8.a(aui);
			}
		}
	}

	protected void a(aui aui) {
		if (this.u()) {
			if (aui.a(this, this.b, this.c)) {
				this.e();
			}
		} else {
			this.o();
			aui.b(this.b, this.c);
			this.e();
		}
	}

	public co f(co co) {
		int integer3 = co.p() & 15;
		int integer4 = co.r() & 15;
		int integer5 = integer3 | integer4 << 4;
		co co6 = new co(co.p(), this.h[integer5], co.r());
		if (co6.q() == -999) {
			int integer7 = this.g() + 15;
			co6 = new co(co.p(), integer7, co.r());
			int integer8 = -1;

			while (co6.q() > 0 && integer8 == -1) {
				atl atl9 = this.a(co6);
				azs azs10 = atl9.a();
				if (!azs10.c() && !azs10.d()) {
					co6 = co6.b();
				} else {
					integer8 = co6.q() + 1;
				}
			}

			this.h[integer5] = integer8;
		}

		return new co(co.p(), this.h[integer5], co.r());
	}

	public void b(boolean boolean1) {
		if (this.m && this.k.s.m() && !boolean1) {
			this.h(this.k.E);
		}

		this.r = true;
		if (!this.q && this.p) {
			this.o();
		}

		while (!this.y.isEmpty()) {
			co co3 = (co)this.y.poll();
			if (this.a(co3, auo.a.CHECK) == null && this.a(co3).v().l()) {
				asc asc4 = this.g(co3);
				this.k.a(co3, asc4);
				this.k.b(co3, co3);
			}
		}
	}

	public boolean i() {
		return this.r && this.p && this.q;
	}

	public boolean j() {
		return this.r;
	}

	public ajl k() {
		return new ajl(this.b, this.c);
	}

	public boolean c(int integer1, int integer2) {
		if (integer1 < 0) {
			integer1 = 0;
		}

		if (integer2 >= 256) {
			integer2 = 255;
		}

		for (int integer4 = integer1; integer4 <= integer2; integer4 += 16) {
			aup aup5 = this.f[integer4 >> 4];
			if (aup5 != a && !aup5.a()) {
				return false;
			}
		}

		return true;
	}

	public void a(aup[] arr) {
		if (this.f.length != arr.length) {
			e.warn("Could not set level chunk sections, array length is {} instead of {}", new Object[]{arr.length, this.f.length});
		} else {
			System.arraycopy(arr, 0, this.f, 0, this.f.length);
		}
	}

	public void a(et et, int integer, boolean boolean3) {
		boolean boolean5 = this.k.s.m();

		for (int integer6 = 0; integer6 < this.f.length; integer6++) {
			aup aup7 = this.f[integer6];
			if ((integer & 1 << integer6) == 0) {
				if (boolean3 && aup7 != a) {
					this.f[integer6] = a;
				}
			} else {
				if (aup7 == a) {
					aup7 = new aup(integer6 << 4, boolean5);
					this.f[integer6] = aup7;
				}

				aup7.g().a(et);
				et.readBytes(aup7.h().a());
				if (boolean5) {
					et.readBytes(aup7.i().a());
				}
			}
		}

		if (boolean3) {
			et.readBytes(this.g);
		}

		for (int integer6x = 0; integer6x < this.f.length; integer6x++) {
			if (this.f[integer6x] != a && (integer & 1 << integer6x) != 0) {
				this.f[integer6x].e();
			}
		}

		this.q = true;
		this.p = true;
		this.a();

		for (asc asc7 : this.n.values()) {
			asc7.B();
		}
	}

	public akf a(co co, akj akj) {
		int integer4 = co.p() & 15;
		int integer5 = co.r() & 15;
		int integer6 = this.g[integer5 << 4 | integer4] & 255;
		if (integer6 == 255) {
			akf akf7 = akj.a(co, akk.c);
			integer6 = akf.a(akf7);
			this.g[integer5 << 4 | integer4] = (byte)(integer6 & 0xFF);
		}

		akf akf7 = akf.b(integer6);
		return akf7 == null ? akk.c : akf7;
	}

	public byte[] l() {
		return this.g;
	}

	public void a(byte[] arr) {
		if (this.g.length != arr.length) {
			e.warn("Could not set level chunk biomes, array length is {} instead of {}", new Object[]{arr.length, this.g.length});
		} else {
			System.arraycopy(arr, 0, this.g, 0, this.g.length);
		}
	}

	public void m() {
		this.x = 0;
	}

	public void n() {
		if (this.x < 4096) {
			co co2 = new co(this.b << 4, 0, this.c << 4);

			for (int integer3 = 0; integer3 < 8; integer3++) {
				if (this.x >= 4096) {
					return;
				}

				int integer4 = this.x % 16;
				int integer5 = this.x / 16 % 16;
				int integer6 = this.x / 256;
				this.x++;

				for (int integer7 = 0; integer7 < 16; integer7++) {
					co co8 = co2.a(integer5, (integer4 << 4) + integer7, integer6);
					boolean boolean9 = integer7 == 0 || integer7 == 15 || integer5 == 0 || integer5 == 15 || integer6 == 0 || integer6 == 15;
					if (this.f[integer4] == a && boolean9 || this.f[integer4] != a && this.f[integer4].a(integer5, integer7, integer6).a() == azs.a) {
						for (cv cv13 : cv.values()) {
							co co14 = co8.a(cv13);
							if (this.k.o(co14).d() > 0) {
								this.k.w(co14);
							}
						}

						this.k.w(co8);
					}
				}
			}
		}
	}

	public void o() {
		this.p = true;
		this.q = true;
		co co2 = new co(this.b << 4, 0, this.c << 4);
		if (this.k.s.m()) {
			if (this.k.a(co2.a(-1, 0, -1), co2.a(16, this.k.K(), 16))) {
				label44:
				for (int integer3 = 0; integer3 < 16; integer3++) {
					for (int integer4 = 0; integer4 < 16; integer4++) {
						if (!this.e(integer3, integer4)) {
							this.q = false;
							break label44;
						}
					}
				}

				if (this.q) {
					for (cv cv4 : cv.c.HORIZONTAL) {
						int integer5 = cv4.c() == cv.b.POSITIVE ? 16 : 1;
						this.k.f(co2.a(cv4, integer5)).a(cv4.d());
					}

					this.z();
				}
			} else {
				this.q = false;
			}
		}
	}

	private void z() {
		for (int integer2 = 0; integer2 < this.i.length; integer2++) {
			this.i[integer2] = true;
		}

		this.h(false);
	}

	private void a(cv cv) {
		if (this.p) {
			if (cv == cv.EAST) {
				for (int integer3 = 0; integer3 < 16; integer3++) {
					this.e(15, integer3);
				}
			} else if (cv == cv.WEST) {
				for (int integer3 = 0; integer3 < 16; integer3++) {
					this.e(0, integer3);
				}
			} else if (cv == cv.SOUTH) {
				for (int integer3 = 0; integer3 < 16; integer3++) {
					this.e(integer3, 15);
				}
			} else if (cv == cv.NORTH) {
				for (int integer3 = 0; integer3 < 16; integer3++) {
					this.e(integer3, 0);
				}
			}
		}
	}

	private boolean e(int integer1, int integer2) {
		int integer4 = this.g();
		boolean boolean5 = false;
		boolean boolean6 = false;
		co.a a7 = new co.a((this.b << 4) + integer1, 0, (this.c << 4) + integer2);

		for (int integer8 = integer4 + 16 - 1; integer8 > this.k.K() || integer8 > 0 && !boolean6; integer8--) {
			a7.c(a7.p(), integer8, a7.r());
			int integer9 = this.b(a7);
			if (integer9 == 255 && a7.q() < this.k.K()) {
				boolean6 = true;
			}

			if (!boolean5 && integer9 > 0) {
				boolean5 = true;
			} else if (boolean5 && integer9 == 0 && !this.k.w(a7)) {
				return false;
			}
		}

		for (int integer8 = a7.q(); integer8 > 0; integer8--) {
			a7.c(a7.p(), integer8, a7.r());
			if (this.a(a7).d() > 0) {
				this.k.w(a7);
			}
		}

		return true;
	}

	public boolean p() {
		return this.j;
	}

	public void c(boolean boolean1) {
		this.j = boolean1;
	}

	public ajs q() {
		return this.k;
	}

	public int[] r() {
		return this.l;
	}

	public void a(int[] arr) {
		if (this.l.length != arr.length) {
			e.warn("Could not set level chunk heightmap, array length is {} instead of {}", new Object[]{arr.length, this.l.length});
		} else {
			System.arraycopy(arr, 0, this.l, 0, this.l.length);
		}
	}

	public Map<co, asc> s() {
		return this.n;
	}

	public of<sn>[] t() {
		return this.o;
	}

	public boolean u() {
		return this.p;
	}

	public void d(boolean boolean1) {
		this.p = boolean1;
	}

	public boolean v() {
		return this.q;
	}

	public void e(boolean boolean1) {
		this.q = boolean1;
	}

	public void f(boolean boolean1) {
		this.s = boolean1;
	}

	public void g(boolean boolean1) {
		this.t = boolean1;
	}

	public void b(long long1) {
		this.u = long1;
	}

	public int w() {
		return this.v;
	}

	public long x() {
		return this.w;
	}

	public void c(long long1) {
		this.w = long1;
	}

	public static enum a {
		IMMEDIATE,
		QUEUED,
		CHECK;
	}
}
