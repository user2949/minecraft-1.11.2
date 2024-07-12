import com.google.common.collect.Sets;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;

public class bnq extends ajs {
	private final bno b;
	private bnm c;
	private final Set<sn> I = Sets.newHashSet();
	private final Set<sn> J = Sets.newHashSet();
	private final bes K = bes.z();
	private final Set<ajl> L = Sets.newHashSet();
	private int M = this.r.nextInt(12000);
	protected Set<ajl> a = Sets.newHashSet();

	public bnq(bno bno, ajv ajv, int integer, rg rg, ou ou) {
		super(new bcb(), new bbv(ajv, "MpServer"), avg.a(integer).d(), ou, true);
		this.b = bno;
		this.T().a(rg);
		this.A(new co(8, 64, 8));
		this.s.a(this);
		this.v = this.n();
		this.z = new bcd();
		this.H();
		this.I();
	}

	@Override
	public void d() {
		super.d();
		this.a(this.P() + 1L);
		if (this.U().b("doDaylightCycle")) {
			this.b(this.Q() + 1L);
		}

		this.C.a("reEntryProcessing");

		for (int integer2 = 0; integer2 < 10 && !this.J.isEmpty(); integer2++) {
			sn sn3 = (sn)this.J.iterator().next();
			this.J.remove(sn3);
			if (!this.e.contains(sn3)) {
				this.a(sn3);
			}
		}

		this.C.c("chunkCache");
		this.c.d();
		this.C.c("blocks");
		this.j();
		this.C.b();
	}

	public void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
	}

	@Override
	protected auj n() {
		this.c = new bnm(this);
		return this.c;
	}

	@Override
	protected boolean a(int integer1, int integer2, boolean boolean3) {
		return boolean3 || !this.f().c(integer1, integer2).f();
	}

	protected void a() {
		this.a.clear();
		int integer2 = this.K.u.d;
		this.C.a("buildList");
		int integer3 = ot.c(this.K.h.p / 16.0);
		int integer4 = ot.c(this.K.h.r / 16.0);

		for (int integer5 = -integer2; integer5 <= integer2; integer5++) {
			for (int integer6 = -integer2; integer6 <= integer2; integer6++) {
				this.a.add(new ajl(integer5 + integer3, integer6 + integer4));
			}
		}

		this.C.b();
	}

	@Override
	protected void j() {
		this.a();
		if (this.M > 0) {
			this.M--;
		}

		this.L.retainAll(this.a);
		if (this.L.size() == this.a.size()) {
			this.L.clear();
		}

		int integer2 = 0;

		for (ajl ajl4 : this.a) {
			if (!this.L.contains(ajl4)) {
				int integer5 = ajl4.a * 16;
				int integer6 = ajl4.b * 16;
				this.C.a("getChunk");
				auo auo7 = this.a(ajl4.a, ajl4.b);
				this.a(integer5, integer6, auo7);
				this.C.b();
				this.L.add(ajl4);
				if (++integer2 >= 10) {
					return;
				}
			}
		}
	}

	public void b(int integer1, int integer2, boolean boolean3) {
		if (boolean3) {
			this.c.d(integer1, integer2);
		} else {
			this.c.b(integer1, integer2);
			this.b(integer1 * 16, 0, integer2 * 16, integer1 * 16 + 15, 256, integer2 * 16 + 15);
		}
	}

	@Override
	public boolean a(sn sn) {
		boolean boolean3 = super.a(sn);
		this.I.add(sn);
		if (boolean3) {
			if (sn instanceof aby) {
				this.K.U().a(new cbw((aby)sn));
			}
		} else {
			this.J.add(sn);
		}

		return boolean3;
	}

	@Override
	public void e(sn sn) {
		super.e(sn);
		this.I.remove(sn);
	}

	@Override
	protected void b(sn sn) {
		super.b(sn);
		if (this.J.contains(sn)) {
			this.J.remove(sn);
		}
	}

	@Override
	protected void c(sn sn) {
		super.c(sn);
		if (this.I.contains(sn)) {
			if (sn.au()) {
				this.J.add(sn);
			} else {
				this.I.remove(sn);
			}
		}
	}

	public void a(int integer, sn sn) {
		sn sn4 = this.a(integer);
		if (sn4 != null) {
			this.e(sn4);
		}

		this.I.add(sn);
		sn.h(integer);
		if (!this.a(sn)) {
			this.J.add(sn);
		}

		this.k.a(integer, sn);
	}

	@Nullable
	@Override
	public sn a(int integer) {
		return (sn)(integer == this.K.h.O() ? this.K.h : super.a(integer));
	}

	public sn e(int integer) {
		sn sn3 = this.k.d(integer);
		if (sn3 != null) {
			this.I.remove(sn3);
			this.e(sn3);
		}

		return sn3;
	}

	@Deprecated
	public boolean b(co co, atl atl) {
		int integer4 = co.p();
		int integer5 = co.q();
		int integer6 = co.r();
		this.a(integer4, integer5, integer6, integer4, integer5, integer6);
		return super.a(co, atl, 3);
	}

	@Override
	public void M() {
		this.b.a().a(new fh("Quitting"));
	}

	@Override
	protected void t() {
	}

	@Override
	protected void a(int integer1, int integer2, auo auo) {
		super.a(integer1, integer2, auo);
		if (this.M == 0) {
			this.l = this.l * 3 + 1013904223;
			int integer5 = this.l >> 2;
			int integer6 = integer5 & 15;
			int integer7 = integer5 >> 8 & 15;
			int integer8 = integer5 >> 16 & 0xFF;
			co co9 = new co(integer6 + integer1, integer8, integer7 + integer2);
			atl atl10 = auo.a(co9);
			integer6 += integer1;
			integer7 += integer2;
			if (atl10.a() == azs.a
				&& this.j(co9) <= this.r.nextInt(8)
				&& this.b(ajy.SKY, co9) <= 0
				&& this.K.h != null
				&& this.K.h.d((double)integer6 + 0.5, (double)integer8 + 0.5, (double)integer7 + 0.5) > 4.0) {
				this.a((double)integer6 + 0.5, (double)integer8 + 0.5, (double)integer7 + 0.5, nn.a, no.AMBIENT, 0.7F, 0.8F + this.r.nextFloat() * 0.2F, false);
				this.M = this.r.nextInt(12000) + 6000;
			}
		}
	}

	public void b(int integer1, int integer2, int integer3) {
		int integer5 = 32;
		Random random6 = new Random();
		afj afj7 = this.K.h.cg();
		boolean boolean8 = this.K.c.l() == ajq.CREATIVE && !afj7.b() && afj7.c() == afh.a(alv.cv);
		co.a a9 = new co.a();

		for (int integer10 = 0; integer10 < 667; integer10++) {
			this.a(integer1, integer2, integer3, 16, random6, boolean8, a9);
			this.a(integer1, integer2, integer3, 32, random6, boolean8, a9);
		}
	}

	public void a(int integer1, int integer2, int integer3, int integer4, Random random, boolean boolean6, co.a a) {
		int integer9 = integer1 + this.r.nextInt(integer4) - this.r.nextInt(integer4);
		int integer10 = integer2 + this.r.nextInt(integer4) - this.r.nextInt(integer4);
		int integer11 = integer3 + this.r.nextInt(integer4) - this.r.nextInt(integer4);
		a.c(integer9, integer10, integer11);
		atl atl12 = this.o(a);
		atl12.v().a(atl12, this, a, random);
		if (boolean6 && atl12.v() == alv.cv) {
			this.a(de.BARRIER, (double)((float)integer9 + 0.5F), (double)((float)integer10 + 0.5F), (double)((float)integer11 + 0.5F), 0.0, 0.0, 0.0, new int[0]);
		}
	}

	public void c() {
		this.e.removeAll(this.f);

		for (int integer2 = 0; integer2 < this.f.size(); integer2++) {
			sn sn3 = (sn)this.f.get(integer2);
			int integer4 = sn3.ab;
			int integer5 = sn3.ad;
			if (sn3.aa && this.a(integer4, integer5, true)) {
				this.a(integer4, integer5).b(sn3);
			}
		}

		for (int integer2x = 0; integer2x < this.f.size(); integer2x++) {
			this.c((sn)this.f.get(integer2x));
		}

		this.f.clear();

		for (int integer2x = 0; integer2x < this.e.size(); integer2x++) {
			sn sn3 = (sn)this.e.get(integer2x);
			sn sn4 = sn3.bB();
			if (sn4 != null) {
				if (!sn4.F && sn4.w(sn3)) {
					continue;
				}

				sn3.p();
			}

			if (sn3.F) {
				int integer5 = sn3.ab;
				int integer6 = sn3.ad;
				if (sn3.aa && this.a(integer5, integer6, true)) {
					this.a(integer5, integer6).b(sn3);
				}

				this.e.remove(integer2x--);
				this.c(sn3);
			}
		}
	}

	@Override
	public c a(b b) {
		c c3 = super.a(b);
		c3.a("Forced entities", new d<String>() {
			public String call() {
				return bnq.this.I.size() + " total; " + bnq.this.I;
			}
		});
		c3.a("Retry entities", new d<String>() {
			public String call() {
				return bnq.this.J.size() + " total; " + bnq.this.J;
			}
		});
		c3.a("Server brand", new d<String>() {
			public String call() throws Exception {
				return bnq.this.K.h.D();
			}
		});
		c3.a("Server type", new d<String>() {
			public String call() throws Exception {
				return bnq.this.K.F() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server";
			}
		});
		return c3;
	}

	@Override
	public void a(@Nullable aay aay, double double2, double double3, double double4, nm nm, no no, float float7, float float8) {
		if (aay == this.K.h) {
			this.a(double2, double3, double4, nm, no, float7, float8, false);
		}
	}

	public void a(co co, nm nm, no no, float float4, float float5, boolean boolean6) {
		this.a((double)co.p() + 0.5, (double)co.q() + 0.5, (double)co.r() + 0.5, nm, no, float4, float5, boolean6);
	}

	@Override
	public void a(double double1, double double2, double double3, nm nm, no no, float float6, float float7, boolean boolean8) {
		double double13 = this.K.aa().d(double1, double2, double3);
		cby cby15 = new cby(nm, no, float6, float7, (float)double1, (float)double2, (float)double3);
		if (boolean8 && double13 > 100.0) {
			double double16 = Math.sqrt(double13) / 40.0;
			this.K.U().a(cby15, (int)(double16 * 20.0));
		} else {
			this.K.U().a(cby15);
		}
	}

	@Override
	public void a(double double1, double double2, double double3, double double4, double double5, double double6, @Nullable du du) {
		this.K.j.a(new boj.c(this, double1, double2, double3, double4, double5, double6, this.K.j, du));
	}

	@Override
	public void a(fm<?> fm) {
		this.b.a(fm);
	}

	public void a(bec bec) {
		this.D = bec;
	}

	@Override
	public void b(long long1) {
		if (long1 < 0L) {
			long1 = -long1;
			this.U().a("doDaylightCycle", "false");
		} else {
			this.U().a("doDaylightCycle", "true");
		}

		super.b(long1);
	}

	public bnm z() {
		return (bnm)super.z();
	}
}
