import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class lw extends ajs implements qy {
	private static final Logger a = LogManager.getLogger();
	private final MinecraftServer I;
	private final lt J;
	private final mc K;
	private final Set<akd> L = Sets.newHashSet();
	private final TreeSet<akd> M = new TreeSet();
	private final Map<UUID, sn> N = Maps.newHashMap();
	public boolean b;
	private boolean O;
	private int P;
	private final aka Q;
	private final ajz R = new ajz();
	protected final wq c = new wq(this);
	private final lw.a[] S = new lw.a[]{new lw.a(), new lw.a()};
	private int T;
	private final List<akd> U = Lists.newArrayList();

	public lw(MinecraftServer minecraftServer, bbw bbw, bbv bbv, int integer, ou ou) {
		super(bbw, bbv, avg.a(integer).d(), ou, false);
		this.I = minecraftServer;
		this.J = new lt(this);
		this.K = new mc(this);
		this.s.a(this);
		this.v = this.n();
		this.Q = new aka(this);
		this.H();
		this.I();
		this.aj().a(minecraftServer.aE());
	}

	@Override
	public ajs b() {
		this.z = new bce(this.w);
		String string2 = wr.a(this.s);
		wr wr3 = (wr)this.z.a(wr.class, string2);
		if (wr3 == null) {
			this.A = new wr(this);
			this.z.a(string2, this.A);
		} else {
			this.A = wr3;
			this.A.a(this);
		}

		this.D = new ld(this.I);
		bed bed4 = (bed)this.z.a(bed.class, "scoreboard");
		if (bed4 == null) {
			bed4 = new bed();
			this.z.a("scoreboard", bed4);
		}

		bed4.a(this.D);
		((ld)this.D).a(new bbk(bed4));
		this.B = new bcn(new File(new File(this.w.b(), "data"), "loot_tables"));
		this.aj().c(this.x.B(), this.x.C());
		this.aj().c(this.x.H());
		this.aj().b(this.x.G());
		this.aj().c(this.x.I());
		this.aj().b(this.x.J());
		if (this.x.E() > 0L) {
			this.aj().a(this.x.D(), this.x.F(), this.x.E());
		} else {
			this.aj().a(this.x.D());
		}

		return this;
	}

	@Override
	public void d() {
		super.d();
		if (this.T().s() && this.ae() != rg.HARD) {
			this.T().a(rg.HARD);
		}

		this.s.k().b();
		if (this.g()) {
			if (this.U().b("doDaylightCycle")) {
				long long2 = this.x.f() + 24000L;
				this.x.c(long2 - long2 % 24000L);
			}

			this.f();
		}

		this.C.a("mobSpawner");
		if (this.U().b("doMobSpawning") && this.x.t() != ajx.g) {
			this.R.a(this, this.F, this.G, this.x.e() % 400L == 0L);
		}

		this.C.c("chunkSource");
		this.v.d();
		int integer2 = this.a(1.0F);
		if (integer2 != this.af()) {
			this.c(integer2);
		}

		this.x.b(this.x.e() + 1L);
		if (this.U().b("doDaylightCycle")) {
			this.x.c(this.x.f() + 1L);
		}

		this.C.c("tickPending");
		this.a(false);
		this.C.c("tickBlocks");
		this.j();
		this.C.c("chunkMap");
		this.K.c();
		this.C.c("village");
		this.A.a();
		this.c.a();
		this.C.c("portalForcer");
		this.Q.a(this.P());
		this.C.b();
		this.ao();
	}

	@Nullable
	public akf.c a(sy sy, co co) {
		List<akf.c> list4 = this.r().a(sy, co);
		return list4 != null && !list4.isEmpty() ? pb.a(this.r, list4) : null;
	}

	public boolean a(sy sy, akf.c c, co co) {
		List<akf.c> list5 = this.r().a(sy, co);
		return list5 != null && !list5.isEmpty() ? list5.contains(c) : false;
	}

	@Override
	public void e() {
		this.O = false;
		if (!this.i.isEmpty()) {
			int integer2 = 0;
			int integer3 = 0;

			for (aay aay5 : this.i) {
				if (aay5.y()) {
					integer2++;
				} else if (aay5.cr()) {
					integer3++;
				}
			}

			this.O = integer3 > 0 && integer3 >= this.i.size() - integer2;
		}
	}

	protected void f() {
		this.O = false;

		for (aay aay3 : this.i) {
			if (aay3.cr()) {
				aay3.a(false, false, true);
			}
		}

		if (this.U().b("doWeatherCycle")) {
			this.c();
		}
	}

	private void c() {
		this.x.g(0);
		this.x.b(false);
		this.x.f(0);
		this.x.a(false);
	}

	public boolean g() {
		if (this.O && !this.E) {
			for (aay aay3 : this.i) {
				if (!aay3.y() && !aay3.cU()) {
					return false;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@Override
	public void h() {
		if (this.x.c() <= 0) {
			this.x.b(this.K() + 1);
		}

		int integer2 = this.x.b();
		int integer3 = this.x.d();
		int integer4 = 0;

		while (this.c(new co(integer2, 0, integer3)).a() == azs.a) {
			integer2 += this.r.nextInt(8) - this.r.nextInt(8);
			integer3 += this.r.nextInt(8) - this.r.nextInt(8);
			if (++integer4 == 10000) {
				break;
			}
		}

		this.x.a(integer2);
		this.x.c(integer3);
	}

	@Override
	protected boolean a(int integer1, int integer2, boolean boolean3) {
		return this.r().d(integer1, integer2);
	}

	protected void i() {
		this.C.a("playerCheckLight");
		if (!this.i.isEmpty()) {
			int integer2 = this.r.nextInt(this.i.size());
			aay aay3 = (aay)this.i.get(integer2);
			int integer4 = ot.c(aay3.p) + this.r.nextInt(11) - 5;
			int integer5 = ot.c(aay3.q) + this.r.nextInt(11) - 5;
			int integer6 = ot.c(aay3.r) + this.r.nextInt(11) - 5;
			this.w(new co(integer4, integer5, integer6));
		}

		this.C.b();
	}

	@Override
	protected void j() {
		this.i();
		if (this.x.t() == ajx.g) {
			Iterator<auo> iterator2 = this.K.b();

			while (iterator2.hasNext()) {
				((auo)iterator2.next()).b(false);
			}
		} else {
			int integer2 = this.U().c("randomTickSpeed");
			boolean boolean3 = this.W();
			boolean boolean4 = this.V();
			this.C.a("pollingChunks");

			for (Iterator<auo> iterator5 = this.K.b(); iterator5.hasNext(); this.C.b()) {
				this.C.a("getChunk");
				auo auo6 = (auo)iterator5.next();
				int integer7 = auo6.b * 16;
				int integer8 = auo6.c * 16;
				this.C.c("checkNextLight");
				auo6.n();
				this.C.c("tickChunk");
				auo6.b(false);
				this.C.c("thunder");
				if (boolean3 && boolean4 && this.r.nextInt(100000) == 0) {
					this.l = this.l * 3 + 1013904223;
					int integer9 = this.l >> 2;
					co co10 = this.a(new co(integer7 + (integer9 & 15), 0, integer8 + (integer9 >> 8 & 15)));
					if (this.B(co10)) {
						rh rh11 = this.D(co10);
						if (this.U().b("doMobSpawning") && this.r.nextDouble() < (double)rh11.b() * 0.01) {
							xs xs12 = new xs(this);
							xs12.p(true);
							xs12.b_(0);
							xs12.b((double)co10.p(), (double)co10.q(), (double)co10.r());
							this.a(xs12);
							this.d(new zg(this, (double)co10.p(), (double)co10.q(), (double)co10.r(), true));
						} else {
							this.d(new zg(this, (double)co10.p(), (double)co10.q(), (double)co10.r(), false));
						}
					}
				}

				this.C.c("iceandsnow");
				if (this.r.nextInt(16) == 0) {
					this.l = this.l * 3 + 1013904223;
					int integer9 = this.l >> 2;
					co co10 = this.p(new co(integer7 + (integer9 & 15), 0, integer8 + (integer9 >> 8 & 15)));
					co co11 = co10.b();
					if (this.v(co11)) {
						this.a(co11, alv.aI.t());
					}

					if (boolean3 && this.f(co10, true)) {
						this.a(co10, alv.aH.t());
					}

					if (boolean3 && this.b(co11).d()) {
						this.o(co11).v().h(this, co11);
					}
				}

				this.C.c("tickBlocks");
				if (integer2 > 0) {
					for (aup aup12 : auo6.h()) {
						if (aup12 != auo.a && aup12.b()) {
							for (int integer13 = 0; integer13 < integer2; integer13++) {
								this.l = this.l * 3 + 1013904223;
								int integer14 = this.l >> 2;
								int integer15 = integer14 & 15;
								int integer16 = integer14 >> 8 & 15;
								int integer17 = integer14 >> 16 & 15;
								atl atl18 = aup12.a(integer15, integer17, integer16);
								alu alu19 = atl18.v();
								this.C.a("randomTick");
								if (alu19.k()) {
									alu19.a(this, new co(integer15 + integer7, integer17 + aup12.d(), integer16 + integer8), atl18, this.r);
								}

								this.C.b();
							}
						}
					}
				}
			}

			this.C.b();
		}
	}

	protected co a(co co) {
		co co3 = this.p(co);
		bdt bdt4 = new bdt(co3, new co(co3.p(), this.Y(), co3.r())).g(3.0);
		List<sw> list5 = this.a(sw.class, bdt4, new Predicate<sw>() {
			public boolean apply(@Nullable sw sw) {
				return sw != null && sw.au() && lw.this.h(sw.c());
			}
		});
		if (!list5.isEmpty()) {
			return ((sw)list5.get(this.r.nextInt(list5.size()))).c();
		} else {
			if (co3.q() == -1) {
				co3 = co3.b(2);
			}

			return co3;
		}
	}

	@Override
	public boolean a(co co, alu alu) {
		akd akd4 = new akd(co, alu);
		return this.U.contains(akd4);
	}

	@Override
	public boolean b(co co, alu alu) {
		akd akd4 = new akd(co, alu);
		return this.L.contains(akd4);
	}

	@Override
	public void a(co co, alu alu, int integer) {
		this.a(co, alu, integer, 0);
	}

	@Override
	public void a(co co, alu alu, int integer3, int integer4) {
		if (co instanceof co.a || co instanceof co.b) {
			co = new co(co);
			LogManager.getLogger().warn("Tried to assign a mutable BlockPos to tick data...", new Error(co.getClass().toString()));
		}

		azs azs6 = alu.t().a();
		if (this.d && azs6 != azs.a) {
			if (alu.r()) {
				if (this.a(co.a(-8, -8, -8), co.a(8, 8, 8))) {
					atl atl7 = this.o(co);
					if (atl7.a() != azs.a && atl7.v() == alu) {
						atl7.v().b(this, co, atl7, this.r);
					}
				}

				return;
			}

			integer3 = 1;
		}

		akd akd7 = new akd(co, alu);
		if (this.e(co)) {
			if (azs6 != azs.a) {
				akd7.a((long)integer3 + this.x.e());
				akd7.a(integer4);
			}

			if (!this.L.contains(akd7)) {
				this.L.add(akd7);
				this.M.add(akd7);
			}
		}
	}

	@Override
	public void b(co co, alu alu, int integer3, int integer4) {
		if (co instanceof co.a || co instanceof co.b) {
			co = new co(co);
			LogManager.getLogger().warn("Tried to assign a mutable BlockPos to tick data...", new Error(co.getClass().toString()));
		}

		akd akd6 = new akd(co, alu);
		akd6.a(integer4);
		azs azs7 = alu.t().a();
		if (azs7 != azs.a) {
			akd6.a((long)integer3 + this.x.e());
		}

		if (!this.L.contains(akd6)) {
			this.L.add(akd6);
			this.M.add(akd6);
		}
	}

	@Override
	public void k() {
		if (this.i.isEmpty()) {
			if (this.P++ >= 300) {
				return;
			}
		} else {
			this.m();
		}

		this.s.s();
		super.k();
	}

	@Override
	protected void l() {
		super.l();
		this.C.c("players");

		for (int integer2 = 0; integer2 < this.i.size(); integer2++) {
			sn sn3 = (sn)this.i.get(integer2);
			sn sn4 = sn3.bB();
			if (sn4 != null) {
				if (!sn4.F && sn4.w(sn3)) {
					continue;
				}

				sn3.p();
			}

			this.C.a("tick");
			if (!sn3.F) {
				try {
					this.h(sn3);
				} catch (Throwable var7) {
					b b6 = b.a(var7, "Ticking player");
					c c7 = b6.a("Player being ticked");
					sn3.a(c7);
					throw new f(b6);
				}
			}

			this.C.b();
			this.C.a("remove");
			if (sn3.F) {
				int integer5 = sn3.ab;
				int integer6 = sn3.ad;
				if (sn3.aa && this.a(integer5, integer6, true)) {
					this.a(integer5, integer6).b(sn3);
				}

				this.e.remove(sn3);
				this.c(sn3);
			}

			this.C.b();
		}
	}

	public void m() {
		this.P = 0;
	}

	@Override
	public boolean a(boolean boolean1) {
		if (this.x.t() == ajx.g) {
			return false;
		} else {
			int integer3 = this.M.size();
			if (integer3 != this.L.size()) {
				throw new IllegalStateException("TickNextTick list out of synch");
			} else {
				if (integer3 > 65536) {
					integer3 = 65536;
				}

				this.C.a("cleaning");

				for (int integer4 = 0; integer4 < integer3; integer4++) {
					akd akd5 = (akd)this.M.first();
					if (!boolean1 && akd5.b > this.x.e()) {
						break;
					}

					this.M.remove(akd5);
					this.L.remove(akd5);
					this.U.add(akd5);
				}

				this.C.b();
				this.C.a("ticking");
				Iterator<akd> iterator4 = this.U.iterator();

				while (iterator4.hasNext()) {
					akd akd5 = (akd)iterator4.next();
					iterator4.remove();
					int integer6 = 0;
					if (this.a(akd5.a.a(0, 0, 0), akd5.a.a(0, 0, 0))) {
						atl atl7 = this.o(akd5.a);
						if (atl7.a() != azs.a && alu.a(atl7.v(), akd5.a())) {
							try {
								atl7.v().b(this, akd5.a, atl7, this.r);
							} catch (Throwable var10) {
								b b9 = b.a(var10, "Exception while ticking a block");
								c c10 = b9.a("Block being ticked");
								c.a(c10, akd5.a, atl7);
								throw new f(b9);
							}
						}
					} else {
						this.a(akd5.a, akd5.a(), 0);
					}
				}

				this.C.b();
				this.U.clear();
				return !this.M.isEmpty();
			}
		}
	}

	@Nullable
	@Override
	public List<akd> a(auo auo, boolean boolean2) {
		ajl ajl4 = auo.k();
		int integer5 = (ajl4.a << 4) - 2;
		int integer6 = integer5 + 16 + 2;
		int integer7 = (ajl4.b << 4) - 2;
		int integer8 = integer7 + 16 + 2;
		return this.a(new axz(integer5, 0, integer7, integer6, 256, integer8), boolean2);
	}

	@Nullable
	@Override
	public List<akd> a(axz axz, boolean boolean2) {
		List<akd> list4 = null;

		for (int integer5 = 0; integer5 < 2; integer5++) {
			Iterator<akd> iterator6;
			if (integer5 == 0) {
				iterator6 = this.M.iterator();
			} else {
				iterator6 = this.U.iterator();
			}

			while (iterator6.hasNext()) {
				akd akd7 = (akd)iterator6.next();
				co co8 = akd7.a;
				if (co8.p() >= axz.a && co8.p() < axz.d && co8.r() >= axz.c && co8.r() < axz.f) {
					if (boolean2) {
						if (integer5 == 0) {
							this.L.remove(akd7);
						}

						iterator6.remove();
					}

					if (list4 == null) {
						list4 = Lists.newArrayList();
					}

					list4.add(akd7);
				}
			}
		}

		return list4;
	}

	@Override
	public void a(sn sn, boolean boolean2) {
		if (!this.am() && (sn instanceof ww || sn instanceof xj)) {
			sn.T();
		}

		if (!this.al() && sn instanceof aas) {
			sn.T();
		}

		super.a(sn, boolean2);
	}

	private boolean al() {
		return this.I.ae();
	}

	private boolean am() {
		return this.I.ad();
	}

	@Override
	protected auj n() {
		auw auw2 = this.w.a(this.s);
		return new lv(this, auw2, this.s.c());
	}

	@Override
	public boolean a(aay aay, co co) {
		return !this.I.a(this, co, aay) && this.aj().a(co);
	}

	@Override
	public void a(ajv ajv) {
		if (!this.x.v()) {
			try {
				this.b(ajv);
				if (this.x.t() == ajx.g) {
					this.an();
				}

				super.a(ajv);
			} catch (Throwable var6) {
				b b4 = b.a(var6, "Exception initializing level");

				try {
					this.a(b4);
				} catch (Throwable var5) {
				}

				throw new f(b4);
			}

			this.x.d(true);
		}
	}

	private void an() {
		this.x.f(false);
		this.x.c(true);
		this.x.b(false);
		this.x.a(false);
		this.x.i(1000000000);
		this.x.c(6000L);
		this.x.a(ajq.SPECTATOR);
		this.x.g(false);
		this.x.a(rg.PEACEFUL);
		this.x.e(true);
		this.U().a("doDaylightCycle", "false");
	}

	private void b(ajv ajv) {
		if (!this.s.e()) {
			this.x.a(co.a.b(this.s.i()));
		} else if (this.x.t() == ajx.g) {
			this.x.a(co.a.a());
		} else {
			this.y = true;
			akj akj3 = this.s.k();
			List<akf> list4 = akj3.a();
			Random random5 = new Random(this.O());
			co co6 = akj3.a(0, 0, 256, list4, random5);
			int integer7 = 8;
			int integer8 = this.s.i();
			int integer9 = 8;
			if (co6 != null) {
				integer7 = co6.p();
				integer9 = co6.r();
			} else {
				a.warn("Unable to find spawn biome");
			}

			int integer10 = 0;

			while (!this.s.a(integer7, integer9)) {
				integer7 += random5.nextInt(64) - random5.nextInt(64);
				integer9 += random5.nextInt(64) - random5.nextInt(64);
				if (++integer10 == 1000) {
					break;
				}
			}

			this.x.a(new co(integer7, integer8, integer9));
			this.y = false;
			if (ajv.c()) {
				this.o();
			}
		}
	}

	protected void o() {
		awd awd2 = new awd();

		for (int integer3 = 0; integer3 < 10; integer3++) {
			int integer4 = this.x.b() + this.r.nextInt(6) - this.r.nextInt(6);
			int integer5 = this.x.d() + this.r.nextInt(6) - this.r.nextInt(6);
			co co6 = this.q(new co(integer4, 0, integer5)).a();
			if (awd2.b(this, this.r, co6)) {
				break;
			}
		}
	}

	@Nullable
	public co p() {
		return this.s.h();
	}

	public void a(boolean boolean1, @Nullable ov ov) throws ajt {
		lv lv4 = this.r();
		if (lv4.e()) {
			if (ov != null) {
				ov.a("Saving level");
			}

			this.a();
			if (ov != null) {
				ov.c("Saving chunks");
			}

			lv4.a(boolean1);

			for (auo auo7 : Lists.newArrayList(lv4.a())) {
				if (auo7 != null && !this.K.a(auo7.b, auo7.c)) {
					lv4.a(auo7);
				}
			}
		}
	}

	public void q() {
		lv lv2 = this.r();
		if (lv2.e()) {
			lv2.c();
		}
	}

	protected void a() throws ajt {
		this.N();

		for (lw lw5 : this.I.d) {
			if (lw5 instanceof ls) {
				((ls)lw5).c();
			}
		}

		this.x.a(this.aj().h());
		this.x.d(this.aj().f());
		this.x.c(this.aj().g());
		this.x.e(this.aj().m());
		this.x.f(this.aj().n());
		this.x.j(this.aj().q());
		this.x.k(this.aj().p());
		this.x.b(this.aj().j());
		this.x.e(this.aj().i());
		this.w.a(this.x, this.I.am().t());
		this.z.a();
	}

	@Override
	public boolean a(sn sn) {
		return this.j(sn) ? super.a(sn) : false;
	}

	@Override
	public void a(Collection<sn> collection) {
		for (sn sn5 : Lists.newArrayList(collection)) {
			if (this.j(sn5)) {
				this.e.add(sn5);
				this.b(sn5);
			}
		}
	}

	private boolean j(sn sn) {
		if (sn.F) {
			a.warn("Tried to add entity {} but it was marked as removed already", new Object[]{sp.a(sn)});
			return false;
		} else {
			UUID uUID3 = sn.be();
			if (this.N.containsKey(uUID3)) {
				sn sn4 = (sn)this.N.get(uUID3);
				if (this.f.contains(sn4)) {
					this.f.remove(sn4);
				} else {
					if (!(sn instanceof aay)) {
						a.warn("Keeping entity {} that already exists with UUID {}", new Object[]{sp.a(sn4), uUID3.toString()});
						return false;
					}

					a.warn("Force-added player with duplicate UUID {}", new Object[]{uUID3.toString()});
				}

				this.f(sn4);
			}

			return true;
		}
	}

	@Override
	protected void b(sn sn) {
		super.b(sn);
		this.k.a(sn.O(), sn);
		this.N.put(sn.be(), sn);
		sn[] arr3 = sn.aT();
		if (arr3 != null) {
			for (sn sn7 : arr3) {
				this.k.a(sn7.O(), sn7);
			}
		}
	}

	@Override
	protected void c(sn sn) {
		super.c(sn);
		this.k.d(sn.O());
		this.N.remove(sn.be());
		sn[] arr3 = sn.aT();
		if (arr3 != null) {
			for (sn sn7 : arr3) {
				this.k.d(sn7.O());
			}
		}
	}

	@Override
	public boolean d(sn sn) {
		if (super.d(sn)) {
			this.I.am().a(null, sn.p, sn.q, sn.r, 512.0, this.s.q().a(), new fs(sn));
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void a(sn sn, byte byte2) {
		this.v().b(sn, new gr(sn, byte2));
	}

	public lv z() {
		return (lv)super.z();
	}

	@Override
	public ajn a(@Nullable sn sn, double double2, double double3, double double4, float float5, boolean boolean6, boolean boolean7) {
		ajn ajn12 = new ajn(this, sn, double2, double3, double4, float5, boolean6, boolean7);
		ajn12.a();
		ajn12.a(false);
		if (!boolean7) {
			ajn12.d();
		}

		for (aay aay14 : this.i) {
			if (aay14.d(double2, double3, double4) < 4096.0) {
				((ly)aay14).a.a(new gs(double2, double3, double4, float5, ajn12.e(), (bdw)ajn12.b().get(aay14)));
			}
		}

		return ajn12;
	}

	@Override
	public void c(co co, alu alu, int integer3, int integer4) {
		ajj ajj6 = new ajj(co, alu, integer3, integer4);

		for (ajj ajj8 : this.S[this.T]) {
			if (ajj8.equals(ajj6)) {
				return;
			}
		}

		this.S[this.T].add(ajj6);
	}

	private void ao() {
		while (!this.S[this.T].isEmpty()) {
			int integer2 = this.T;
			this.T ^= 1;

			for (ajj ajj4 : this.S[integer2]) {
				if (this.a(ajj4)) {
					this.I
						.am()
						.a(null, (double)ajj4.a().p(), (double)ajj4.a().q(), (double)ajj4.a().r(), 64.0, this.s.q().a(), new ga(ajj4.a(), ajj4.d(), ajj4.b(), ajj4.c()));
				}
			}

			this.S[integer2].clear();
		}
	}

	private boolean a(ajj ajj) {
		atl atl3 = this.o(ajj.a());
		return atl3.v() == ajj.d() ? atl3.a(this, ajj.a(), ajj.b(), ajj.c()) : false;
	}

	public void s() {
		this.w.a();
	}

	@Override
	protected void t() {
		boolean boolean2 = this.W();
		super.t();
		if (this.n != this.o) {
			this.I.am().a(new gu(7, this.o), this.s.q().a());
		}

		if (this.p != this.q) {
			this.I.am().a(new gu(8, this.q), this.s.q().a());
		}

		if (boolean2 != this.W()) {
			if (boolean2) {
				this.I.am().a(new gu(2, 0.0F));
			} else {
				this.I.am().a(new gu(1, 0.0F));
			}

			this.I.am().a(new gu(7, this.o));
			this.I.am().a(new gu(8, this.q));
		}
	}

	@Nullable
	@Override
	public MinecraftServer u() {
		return this.I;
	}

	public lt v() {
		return this.J;
	}

	public mc w() {
		return this.K;
	}

	public aka x() {
		return this.Q;
	}

	public ayz y() {
		return this.w.h();
	}

	public void a(de de, double double2, double double3, double double4, int integer, double double6, double double7, double double8, double double9, int... arr) {
		this.a(de, false, double2, double3, double4, integer, double6, double7, double8, double9, arr);
	}

	public void a(
		de de,
		boolean boolean2,
		double double3,
		double double4,
		double double5,
		int integer,
		double double7,
		double double8,
		double double9,
		double double10,
		int... arr
	) {
		gy gy20 = new gy(de, boolean2, (float)double3, (float)double4, (float)double5, (float)double7, (float)double8, (float)double9, (float)double10, integer, arr);

		for (int integer21 = 0; integer21 < this.i.size(); integer21++) {
			ly ly22 = (ly)this.i.get(integer21);
			this.a(ly22, boolean2, double3, double4, double5, gy20);
		}
	}

	public void a(
		ly ly,
		de de,
		boolean boolean3,
		double double4,
		double double5,
		double double6,
		int integer,
		double double8,
		double double9,
		double double10,
		double double11,
		int... arr
	) {
		fm<?> fm21 = new gy(
			de, boolean3, (float)double4, (float)double5, (float)double6, (float)double8, (float)double9, (float)double10, (float)double11, integer, arr
		);
		this.a(ly, boolean3, double4, double5, double6, fm21);
	}

	private void a(ly ly, boolean boolean2, double double3, double double4, double double5, fm<?> fm) {
		co co11 = ly.c();
		double double12 = co11.f(double3, double4, double5);
		if (double12 <= 1024.0 || boolean2 && double12 <= 262144.0) {
			ly.a.a(fm);
		}
	}

	@Nullable
	public sn a(UUID uUID) {
		return (sn)this.N.get(uUID);
	}

	@Override
	public ListenableFuture<Object> a(Runnable runnable) {
		return this.I.a(runnable);
	}

	@Override
	public boolean aF() {
		return this.I.aF();
	}

	@Nullable
	@Override
	public co a(String string, co co, boolean boolean3) {
		return this.r().a(this, string, co, boolean3);
	}

	static class a extends ArrayList<ajj> {
		private a() {
		}
	}
}
