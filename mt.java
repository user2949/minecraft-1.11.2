import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class mt {
	public static final File a = new File("banned-players.json");
	public static final File b = new File("banned-ips.json");
	public static final File c = new File("ops.json");
	public static final File d = new File("whitelist.json");
	private static final Logger f = LogManager.getLogger();
	private static final SimpleDateFormat g = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
	private final MinecraftServer h;
	private final List<ly> i = Lists.newArrayList();
	private final Map<UUID, ly> j = Maps.newHashMap();
	private final my k = new my(a);
	private final mq l = new mq(b);
	private final mu m = new mu(c);
	private final na n = new na(d);
	private final Map<UUID, nv> o = Maps.newHashMap();
	private bcc p;
	private boolean q;
	protected int e;
	private int r;
	private ajq s;
	private boolean t;
	private int u;

	public mt(MinecraftServer minecraftServer) {
		this.h = minecraftServer;
		this.k.a(false);
		this.l.a(false);
		this.e = 8;
	}

	public void a(er er, ly ly) {
		GameProfile gameProfile4 = ly.cS();
		mp mp5 = this.h.aB();
		GameProfile gameProfile6 = mp5.a(gameProfile4.getId());
		String string7 = gameProfile6 == null ? gameProfile4.getName() : gameProfile6.getName();
		mp5.a(gameProfile4);
		du du8 = this.a(ly);
		ly.a(this.h.a(ly.am));
		ly.c.a((lw)ly.l);
		String string9 = "local";
		if (er.b() != null) {
			string9 = er.b().toString();
		}

		f.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{ly.h_(), string9, ly.O(), ly.p, ly.q, ly.r});
		lw lw10 = this.h.a(ly.am);
		bbv bbv11 = lw10.T();
		this.a(ly, null, lw10);
		mi mi12 = new mi(this.h, er, ly);
		mi12.a(new gz(ly.O(), ly.c.b(), bbv11.s(), lw10.s.q().a(), lw10.ae(), this.p(), bbv11.t(), lw10.U().b("reducedDebugInfo")));
		mi12.a(new go("MC|Brand", new et(Unpooled.buffer()).a(this.c().getServerModName())));
		mi12.a(new gd(bbv11.x(), bbv11.y()));
		mi12.a(new he(ly.bK));
		mi12.a(new hq(ly.bs.d));
		this.f(ly);
		ly.E().d();
		ly.E().b(ly);
		this.a((ld)lw10.ad(), ly);
		this.h.aD();
		fi fi13;
		if (ly.h_().equalsIgnoreCase(string7)) {
			fi13 = new fi("multiplayer.player.joined", ly.i_());
		} else {
			fi13 = new fi("multiplayer.player.joined.renamed", ly.i_(), string7);
		}

		fi13.b().a(a.YELLOW);
		this.a(fi13);
		this.c(ly);
		mi12.a(ly.p, ly.q, ly.r, ly.v, ly.w);
		this.b(ly, lw10);
		if (!this.h.X().isEmpty()) {
			ly.a(this.h.X(), this.h.Y());
		}

		for (sh sh15 : ly.bS()) {
			mi12.a(new il(ly.O(), sh15));
		}

		if (du8 != null && du8.b("RootVehicle", 10)) {
			du du14 = du8.o("RootVehicle");
			sn sn15 = avd.a(du14.o("Entity"), lw10, true);
			if (sn15 != null) {
				UUID uUID16 = du14.a("Attach");
				if (sn15.be().equals(uUID16)) {
					ly.a(sn15, true);
				} else {
					for (sn sn18 : sn15.by()) {
						if (sn18.be().equals(uUID16)) {
							ly.a(sn18, true);
							break;
						}
					}
				}

				if (!ly.aK()) {
					f.warn("Couldn't reattach entity to player");
					lw10.f(sn15);

					for (sn sn18x : sn15.by()) {
						lw10.f(sn18x);
					}
				}
			}
		}

		ly.j_();
	}

	protected void a(ld ld, ly ly) {
		Set<bdy> set4 = Sets.newHashSet();

		for (bdz bdz6 : ld.g()) {
			ly.a.a(new ia(bdz6, 0));
		}

		for (int integer5 = 0; integer5 < 19; integer5++) {
			bdy bdy6 = ld.a(integer5);
			if (bdy6 != null && !set4.contains(bdy6)) {
				for (fm<?> fm9 : ld.d(bdy6)) {
					ly.a.a(fm9);
				}

				set4.add(bdy6);
			}
		}
	}

	public void a(lw[] arr) {
		this.p = arr[0].S().e();
		arr[0].aj().a(new aud() {
			@Override
			public void a(auf auf, double double2) {
				mt.this.a(new ho(auf, ho.a.SET_SIZE));
			}

			@Override
			public void a(auf auf, double double2, double double3, long long4) {
				mt.this.a(new ho(auf, ho.a.LERP_SIZE));
			}

			@Override
			public void a(auf auf, double double2, double double3) {
				mt.this.a(new ho(auf, ho.a.SET_CENTER));
			}

			@Override
			public void a(auf auf, int integer) {
				mt.this.a(new ho(auf, ho.a.SET_WARNING_TIME));
			}

			@Override
			public void b(auf auf, int integer) {
				mt.this.a(new ho(auf, ho.a.SET_WARNING_BLOCKS));
			}

			@Override
			public void b(auf auf, double double2) {
			}

			@Override
			public void c(auf auf, double double2) {
			}
		});
	}

	public void a(ly ly, lw lw) {
		lw lw4 = ly.x();
		if (lw != null) {
			lw.w().b(ly);
		}

		lw4.w().a(ly);
		lw4.r().c((int)ly.p >> 4, (int)ly.r >> 4);
	}

	public int d() {
		return mc.b(this.s());
	}

	@Nullable
	public du a(ly ly) {
		du du3 = this.h.d[0].T().h();
		du du4;
		if (ly.h_().equals(this.h.Q()) && du3 != null) {
			du4 = this.h.aJ().a(pf.PLAYER, du3);
			ly.f(du4);
			f.debug("loading single player");
		} else {
			du4 = this.p.b(ly);
		}

		return du4;
	}

	protected void b(ly ly) {
		this.p.a(ly);
		nv nv3 = (nv)this.o.get(ly.be());
		if (nv3 != null) {
			nv3.b();
		}
	}

	public void c(ly ly) {
		this.i.add(ly);
		this.j.put(ly.be(), ly);
		this.a(new hg(hg.a.ADD_PLAYER, ly));
		lw lw3 = this.h.a(ly.am);

		for (int integer4 = 0; integer4 < this.i.size(); integer4++) {
			ly.a.a(new hg(hg.a.ADD_PLAYER, (ly)this.i.get(integer4)));
		}

		lw3.a(ly);
		this.a(ly, null);
	}

	public void d(ly ly) {
		ly.x().w().c(ly);
	}

	public void e(ly ly) {
		lw lw3 = ly.x();
		ly.b(oa.f);
		this.b(ly);
		if (ly.aK()) {
			sn sn4 = ly.bz();
			if (sn4.b(ly.class).size() == 1) {
				f.debug("Removing player mount");
				ly.p();
				lw3.f(sn4);

				for (sn sn6 : sn4.by()) {
					lw3.f(sn6);
				}

				lw3.a(ly.ab, ly.ad).e();
			}
		}

		lw3.e(ly);
		lw3.w().b(ly);
		this.i.remove(ly);
		UUID uUID4 = ly.be();
		ly ly5 = (ly)this.j.get(uUID4);
		if (ly5 == ly) {
			this.j.remove(uUID4);
			this.o.remove(uUID4);
		}

		this.a(new hg(hg.a.REMOVE_PLAYER, ly));
	}

	public String a(SocketAddress socketAddress, GameProfile gameProfile) {
		if (this.k.a(gameProfile)) {
			mz mz4 = this.k.b(gameProfile);
			String string5 = "You are banned from this server!\nReason: " + mz4.d();
			if (mz4.c() != null) {
				string5 = string5 + "\nYour ban will be removed on " + g.format(mz4.c());
			}

			return string5;
		} else if (!this.e(gameProfile)) {
			return "You are not white-listed on this server!";
		} else if (this.l.a(socketAddress)) {
			mr mr4 = this.l.b(socketAddress);
			String string5 = "Your IP address is banned from this server!\nReason: " + mr4.d();
			if (mr4.c() != null) {
				string5 = string5 + "\nYour ban will be removed on " + g.format(mr4.c());
			}

			return string5;
		} else {
			return this.i.size() >= this.e && !this.f(gameProfile) ? "The server is full!" : null;
		}
	}

	public ly g(GameProfile gameProfile) {
		UUID uUID3 = aay.a(gameProfile);
		List<ly> list4 = Lists.newArrayList();

		for (int integer5 = 0; integer5 < this.i.size(); integer5++) {
			ly ly6 = (ly)this.i.get(integer5);
			if (ly6.be().equals(uUID3)) {
				list4.add(ly6);
			}
		}

		ly ly5 = (ly)this.j.get(gameProfile.getId());
		if (ly5 != null && !list4.contains(ly5)) {
			list4.add(ly5);
		}

		for (ly ly7 : list4) {
			ly7.a.c("You logged in from another location");
		}

		lz lz6;
		if (this.h.V()) {
			lz6 = new lr(this.h.a(0));
		} else {
			lz6 = new lz(this.h.a(0));
		}

		return new ly(this.h, this.h.a(0), gameProfile, lz6);
	}

	public ly a(ly ly, int integer, boolean boolean3) {
		ly.x().v().b(ly);
		ly.x().v().b((sn)ly);
		ly.x().w().b(ly);
		this.i.remove(ly);
		this.h.a(ly.am).f(ly);
		co co5 = ly.cW();
		boolean boolean6 = ly.cX();
		ly.am = integer;
		lz lz7;
		if (this.h.V()) {
			lz7 = new lr(this.h.a(ly.am));
		} else {
			lz7 = new lz(this.h.a(ly.am));
		}

		ly ly8 = new ly(this.h, this.h.a(ly.am), ly.cS(), lz7);
		ly8.a = ly.a;
		ly8.a((aay)ly, boolean3);
		ly8.h(ly.O());
		ly8.v(ly);
		ly8.a(ly.cx());

		for (String string10 : ly.P()) {
			ly8.a(string10);
		}

		lw lw9 = this.h.a(ly.am);
		this.a(ly8, ly, lw9);
		if (co5 != null) {
			co co10 = aay.a(this.h.a(ly.am), co5, boolean6);
			if (co10 != null) {
				ly8.b((double)((float)co10.p() + 0.5F), (double)((float)co10.q() + 0.1F), (double)((float)co10.r() + 0.5F), 0.0F, 0.0F);
				ly8.a(co5, boolean6);
			} else {
				ly8.a.a(new gu(0, 0.0F));
			}
		}

		lw9.r().c((int)ly8.p >> 4, (int)ly8.r >> 4);

		while (!lw9.a(ly8, ly8.bo()).isEmpty() && ly8.q < 256.0) {
			ly8.b(ly8.p, ly8.q + 1.0, ly8.r);
		}

		ly8.a.a(new hm(ly8.am, ly8.l.ae(), ly8.l.T().t(), ly8.c.b()));
		co co10 = lw9.R();
		ly8.a.a(ly8.p, ly8.q, ly8.r, ly8.v, ly8.w);
		ly8.a.a(new ic(co10));
		ly8.a.a(new hw(ly8.bN, ly8.bM, ly8.bL));
		this.b(ly8, lw9);
		this.f(ly8);
		lw9.w().a(ly8);
		lw9.a(ly8);
		this.i.add(ly8);
		this.j.put(ly8.be(), ly8);
		ly8.j_();
		ly8.c(ly8.bU());
		return ly8;
	}

	public void f(ly ly) {
		GameProfile gameProfile3 = ly.cS();
		int integer4 = this.h(gameProfile3) ? this.m.a(gameProfile3) : 0;
		integer4 = this.h.R() && this.h.d[0].T().u() ? 4 : integer4;
		integer4 = this.t ? 4 : integer4;
		this.b(ly, integer4);
	}

	public void a(ly ly, int integer) {
		int integer4 = ly.am;
		lw lw5 = this.h.a(ly.am);
		ly.am = integer;
		lw lw6 = this.h.a(ly.am);
		ly.a.a(new hm(ly.am, ly.l.ae(), ly.l.T().t(), ly.c.b()));
		this.f(ly);
		lw5.f(ly);
		ly.F = false;
		this.a(ly, integer4, lw5, lw6);
		this.a(ly, lw5);
		ly.a.a(ly.p, ly.q, ly.r, ly.v, ly.w);
		ly.c.a(lw6);
		ly.a.a(new he(ly.bK));
		this.b(ly, lw6);
		this.g(ly);

		for (sh sh8 : ly.bS()) {
			ly.a.a(new il(ly.O(), sh8));
		}
	}

	public void a(sn sn, int integer, lw lw3, lw lw4) {
		double double6 = sn.p;
		double double8 = sn.r;
		double double10 = 8.0;
		float float12 = sn.v;
		lw3.C.a("moving");
		if (sn.am == -1) {
			double6 = ot.a(double6 / 8.0, lw4.aj().b() + 16.0, lw4.aj().d() - 16.0);
			double8 = ot.a(double8 / 8.0, lw4.aj().c() + 16.0, lw4.aj().e() - 16.0);
			sn.b(double6, sn.q, double8, sn.v, sn.w);
			if (sn.au()) {
				lw3.a(sn, false);
			}
		} else if (sn.am == 0) {
			double6 = ot.a(double6 * 8.0, lw4.aj().b() + 16.0, lw4.aj().d() - 16.0);
			double8 = ot.a(double8 * 8.0, lw4.aj().c() + 16.0, lw4.aj().e() - 16.0);
			sn.b(double6, sn.q, double8, sn.v, sn.w);
			if (sn.au()) {
				lw3.a(sn, false);
			}
		} else {
			co co13;
			if (integer == 1) {
				co13 = lw4.R();
			} else {
				co13 = lw4.p();
			}

			double6 = (double)co13.p();
			sn.q = (double)co13.q();
			double8 = (double)co13.r();
			sn.b(double6, sn.q, double8, 90.0F, 0.0F);
			if (sn.au()) {
				lw3.a(sn, false);
			}
		}

		lw3.C.b();
		if (integer != 1) {
			lw3.C.a("placing");
			double6 = (double)ot.a((int)double6, -29999872, 29999872);
			double8 = (double)ot.a((int)double8, -29999872, 29999872);
			if (sn.au()) {
				sn.b(double6, sn.q, double8, sn.v, sn.w);
				lw4.x().a(sn, float12);
				lw4.a(sn);
				lw4.a(sn, false);
			}

			lw3.C.b();
		}

		sn.a(lw4);
	}

	public void e() {
		if (++this.u > 600) {
			this.a(new hg(hg.a.UPDATE_LATENCY, this.i));
			this.u = 0;
		}
	}

	public void a(fm<?> fm) {
		for (int integer3 = 0; integer3 < this.i.size(); integer3++) {
			((ly)this.i.get(integer3)).a.a(fm);
		}
	}

	public void a(fm<?> fm, int integer) {
		for (int integer4 = 0; integer4 < this.i.size(); integer4++) {
			ly ly5 = (ly)this.i.get(integer4);
			if (ly5.am == integer) {
				ly5.a.a(fm);
			}
		}
	}

	public void a(aay aay, fb fb) {
		bee bee4 = aay.aQ();
		if (bee4 != null) {
			for (String string7 : bee4.d()) {
				ly ly8 = this.a(string7);
				if (ly8 != null && ly8 != aay) {
					ly8.a(fb);
				}
			}
		}
	}

	public void b(aay aay, fb fb) {
		bee bee4 = aay.aQ();
		if (bee4 == null) {
			this.a(fb);
		} else {
			for (int integer5 = 0; integer5 < this.i.size(); integer5++) {
				ly ly6 = (ly)this.i.get(integer5);
				if (ly6.aQ() != bee4) {
					ly6.a(fb);
				}
			}
		}
	}

	public String b(boolean boolean1) {
		String string3 = "";
		List<ly> list4 = Lists.newArrayList(this.i);

		for (int integer5 = 0; integer5 < list4.size(); integer5++) {
			if (integer5 > 0) {
				string3 = string3 + ", ";
			}

			string3 = string3 + ((ly)list4.get(integer5)).h_();
			if (boolean1) {
				string3 = string3 + " (" + ((ly)list4.get(integer5)).bf() + ")";
			}
		}

		return string3;
	}

	public String[] f() {
		String[] arr2 = new String[this.i.size()];

		for (int integer3 = 0; integer3 < this.i.size(); integer3++) {
			arr2[integer3] = ((ly)this.i.get(integer3)).h_();
		}

		return arr2;
	}

	public GameProfile[] g() {
		GameProfile[] arr2 = new GameProfile[this.i.size()];

		for (int integer3 = 0; integer3 < this.i.size(); integer3++) {
			arr2[integer3] = ((ly)this.i.get(integer3)).cS();
		}

		return arr2;
	}

	public my h() {
		return this.k;
	}

	public mq i() {
		return this.l;
	}

	public void a(GameProfile gameProfile) {
		int integer3 = this.h.q();
		this.m.a(new mv(gameProfile, this.h.q(), this.m.b(gameProfile)));
		this.b(this.a(gameProfile.getId()), integer3);
	}

	public void b(GameProfile gameProfile) {
		this.m.c(gameProfile);
		this.b(this.a(gameProfile.getId()), 0);
	}

	private void b(ly ly, int integer) {
		if (ly != null && ly.a != null) {
			byte byte4;
			if (integer <= 0) {
				byte4 = 24;
			} else if (integer >= 4) {
				byte4 = 28;
			} else {
				byte4 = (byte)(24 + integer);
			}

			ly.a.a(new gr(ly, byte4));
		}
	}

	public boolean e(GameProfile gameProfile) {
		return !this.q || this.m.d(gameProfile) || this.n.d(gameProfile);
	}

	public boolean h(GameProfile gameProfile) {
		return this.m.d(gameProfile) || this.h.R() && this.h.d[0].T().u() && this.h.Q().equalsIgnoreCase(gameProfile.getName()) || this.t;
	}

	@Nullable
	public ly a(String string) {
		for (ly ly4 : this.i) {
			if (ly4.h_().equalsIgnoreCase(string)) {
				return ly4;
			}
		}

		return null;
	}

	public void a(@Nullable aay aay, double double2, double double3, double double4, double double5, int integer, fm<?> fm) {
		for (int integer13 = 0; integer13 < this.i.size(); integer13++) {
			ly ly14 = (ly)this.i.get(integer13);
			if (ly14 != aay && ly14.am == integer) {
				double double15 = double2 - ly14.p;
				double double17 = double3 - ly14.q;
				double double19 = double4 - ly14.r;
				if (double15 * double15 + double17 * double17 + double19 * double19 < double5 * double5) {
					ly14.a.a(fm);
				}
			}
		}
	}

	public void j() {
		for (int integer2 = 0; integer2 < this.i.size(); integer2++) {
			this.b((ly)this.i.get(integer2));
		}
	}

	public void d(GameProfile gameProfile) {
		this.n.a(new nb(gameProfile));
	}

	public void c(GameProfile gameProfile) {
		this.n.c(gameProfile);
	}

	public na k() {
		return this.n;
	}

	public String[] l() {
		return this.n.a();
	}

	public mu m() {
		return this.m;
	}

	public String[] n() {
		return this.m.a();
	}

	public void a() {
	}

	public void b(ly ly, lw lw) {
		auf auf4 = this.h.d[0].aj();
		ly.a.a(new ho(auf4, ho.a.INITIALIZE));
		ly.a.a(new id(lw.P(), lw.Q(), lw.U().b("doDaylightCycle")));
		co co5 = lw.R();
		ly.a.a(new ic(co5));
		if (lw.W()) {
			ly.a.a(new gu(1, 0.0F));
			ly.a.a(new gu(7, lw.j(1.0F)));
			ly.a.a(new gu(8, lw.h(1.0F)));
		}
	}

	public void g(ly ly) {
		ly.a(ly.bt);
		ly.u();
		ly.a.a(new hq(ly.bs.d));
	}

	public int o() {
		return this.i.size();
	}

	public int p() {
		return this.e;
	}

	public String[] q() {
		return this.h.d[0].S().e().f();
	}

	public void a(boolean boolean1) {
		this.q = boolean1;
	}

	public List<ly> b(String string) {
		List<ly> list3 = Lists.newArrayList();

		for (ly ly5 : this.i) {
			if (ly5.A().equals(string)) {
				list3.add(ly5);
			}
		}

		return list3;
	}

	public int s() {
		return this.r;
	}

	public MinecraftServer c() {
		return this.h;
	}

	public du t() {
		return null;
	}

	public void a(ajq ajq) {
		this.s = ajq;
	}

	private void a(ly ly1, ly ly2, ajs ajs) {
		if (ly2 != null) {
			ly1.c.a(ly2.c.b());
		} else if (this.s != null) {
			ly1.c.a(this.s);
		}

		ly1.c.b(ajs.T().q());
	}

	public void c(boolean boolean1) {
		this.t = boolean1;
	}

	public void u() {
		for (int integer2 = 0; integer2 < this.i.size(); integer2++) {
			((ly)this.i.get(integer2)).a.c("Server closed");
		}
	}

	public void a(fb fb, boolean boolean2) {
		this.h.a(fb);
		byte byte4 = (byte)(boolean2 ? 1 : 0);
		this.a(new gf(fb, byte4));
	}

	public void a(fb fb) {
		this.a(fb, true);
	}

	public nv a(aay aay) {
		UUID uUID3 = aay.be();
		nv nv4 = uUID3 == null ? null : (nv)this.o.get(uUID3);
		if (nv4 == null) {
			File file5 = new File(this.h.a(0).S().b(), "stats");
			File file6 = new File(file5, uUID3 + ".json");
			if (!file6.exists()) {
				File file7 = new File(file5, aay.h_() + ".json");
				if (file7.exists() && file7.isFile()) {
					file7.renameTo(file6);
				}
			}

			nv4 = new nv(this.h, file6);
			nv4.a();
			this.o.put(uUID3, nv4);
		}

		return nv4;
	}

	public void a(int integer) {
		this.r = integer;
		if (this.h.d != null) {
			for (lw lw6 : this.h.d) {
				if (lw6 != null) {
					lw6.w().a(integer);
					lw6.v().a(integer);
				}
			}
		}
	}

	public List<ly> v() {
		return this.i;
	}

	public ly a(UUID uUID) {
		return (ly)this.j.get(uUID);
	}

	public boolean f(GameProfile gameProfile) {
		return false;
	}
}
