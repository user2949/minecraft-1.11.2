import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ly extends aay implements acr {
	private static final Logger bR = LogManager.getLogger();
	private String bS = "en_US";
	public mi a;
	public final MinecraftServer b;
	public final lz c;
	public double d;
	public double e;
	private final List<Integer> bT = Lists.newLinkedList();
	private final nv bU;
	private float bV = Float.MIN_VALUE;
	private int bW = Integer.MIN_VALUE;
	private int bX = Integer.MIN_VALUE;
	private int bY = Integer.MIN_VALUE;
	private int bZ = Integer.MIN_VALUE;
	private int ca = Integer.MIN_VALUE;
	private float cb = -1.0E8F;
	private int cc = -99999999;
	private boolean cd = true;
	private int ce = -99999999;
	private int cf = 60;
	private aay.b cg;
	private boolean ch = true;
	private long ci = System.currentTimeMillis();
	private sn cj;
	private boolean ck;
	private int cl;
	public boolean f;
	public int g;
	public boolean h;

	public ly(MinecraftServer minecraftServer, lw lw, GameProfile gameProfile, lz lz) {
		super(lw, gameProfile);
		lz.b = this;
		this.c = lz;
		co co6 = lw.R();
		if (lw.s.m() && lw.T().q() != ajq.ADVENTURE) {
			int integer7 = Math.max(0, minecraftServer.a(lw));
			int integer8 = ot.c(lw.aj().b((double)co6.p(), (double)co6.r()));
			if (integer8 < integer7) {
				integer7 = integer8;
			}

			if (integer8 <= 1) {
				integer7 = 1;
			}

			co6 = lw.q(co6.a(this.S.nextInt(integer7 * 2 + 1) - integer7, 0, this.S.nextInt(integer7 * 2 + 1) - integer7));
		}

		this.b = minecraftServer;
		this.bU = minecraftServer.am().a((aay)this);
		this.P = 0.0F;
		this.a(co6, 0.0F, 0.0F);

		while (!lw.a(this, this.bo()).isEmpty() && this.q < 255.0) {
			this.b(this.p, this.q + 1.0, this.r);
		}
	}

	@Override
	public void a(du du) {
		super.a(du);
		if (du.b("playerGameType", 99)) {
			if (this.B_().au()) {
				this.c.a(this.B_().n());
			} else {
				this.c.a(ajq.a(du.h("playerGameType")));
			}
		}
	}

	public static void a(ph ph) {
		ph.a(pf.PLAYER, new pj() {
			@Override
			public du a(pg pg, du du, int integer) {
				if (du.b("RootVehicle", 10)) {
					du du5 = du.o("RootVehicle");
					if (du5.b("Entity", 10)) {
						du5.a("Entity", pg.a(pf.ENTITY, du5.o("Entity"), integer));
					}
				}

				return du;
			}
		});
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("playerGameType", this.c.b().a());
		sn sn3 = this.bz();
		sn sn4 = this.bB();
		if (sn4 != null && sn3 != this & sn3.b(ly.class).size() == 1) {
			du du5 = new du();
			du du6 = new du();
			sn3.d(du6);
			du5.a("Attach", sn4.be());
			du5.a("Entity", du6);
			du.a("RootVehicle", du5);
		}
	}

	@Override
	public void a(int integer) {
		super.a(integer);
		this.ce = -1;
	}

	@Override
	public void b(int integer) {
		super.b(integer);
		this.ce = -1;
	}

	public void j_() {
		this.bu.a((acr)this);
	}

	@Override
	public void j() {
		super.j();
		this.a.a(new hf(this.bZ(), hf.a.ENTER_COMBAT));
	}

	@Override
	public void k() {
		super.k();
		this.a.a(new hf(this.bZ(), hf.a.END_COMBAT));
	}

	@Override
	protected afi l() {
		return new agd(this);
	}

	@Override
	public void A_() {
		this.c.a();
		this.cf--;
		if (this.V > 0) {
			this.V--;
		}

		this.bu.b();
		if (!this.l.E && !this.bu.a((aay)this)) {
			this.q();
			this.bu = this.bt;
		}

		while (!this.bT.isEmpty()) {
			int integer2 = Math.min(this.bT.size(), Integer.MAX_VALUE);
			int[] arr3 = new int[integer2];
			Iterator<Integer> iterator4 = this.bT.iterator();
			int integer5 = 0;

			while (iterator4.hasNext() && integer5 < integer2) {
				arr3[integer5++] = (Integer)iterator4.next();
				iterator4.remove();
			}

			this.a.a(new hj(arr3));
		}

		sn sn2 = this.G();
		if (sn2 != this) {
			if (sn2.au()) {
				this.a(sn2.p, sn2.q, sn2.r, sn2.v, sn2.w);
				this.b.am().d(this);
				if (this.aM()) {
					this.e(this);
				}
			} else {
				this.e(this);
			}
		}
	}

	public void k_() {
		try {
			super.A_();

			for (int integer2 = 0; integer2 < this.bs.v_(); integer2++) {
				afj afj3 = this.bs.a(integer2);
				if (!afj3.b() && afj3.c().f()) {
					fm<?> fm4 = ((aei)afj3.c()).a(afj3, this.l, this);
					if (fm4 != null) {
						this.a.a(fm4);
					}
				}
			}

			if (this.bU() != this.cb || this.cc != this.bv.a() || this.bv.e() == 0.0F != this.cd) {
				this.a.a(new hx(this.bU(), this.bv.a(), this.bv.e()));
				this.cb = this.bU();
				this.cc = this.bv.a();
				this.cd = this.bv.e() == 0.0F;
			}

			if (this.bU() + this.cv() != this.bV) {
				this.bV = this.bU() + this.cv();
				this.a(bei.g, ot.f(this.bV));
			}

			if (this.bv.a() != this.bW) {
				this.bW = this.bv.a();
				this.a(bei.h, ot.f((float)this.bW));
			}

			if (this.aR() != this.bX) {
				this.bX = this.aR();
				this.a(bei.i, ot.f((float)this.bX));
			}

			if (this.bY() != this.bY) {
				this.bY = this.bY();
				this.a(bei.j, ot.f((float)this.bY));
			}

			if (this.bM != this.ca) {
				this.ca = this.bM;
				this.a(bei.k, ot.f((float)this.ca));
			}

			if (this.bL != this.bZ) {
				this.bZ = this.bL;
				this.a(bei.l, ot.f((float)this.bZ));
			}

			if (this.bM != this.ce) {
				this.ce = this.bM;
				this.a.a(new hw(this.bN, this.bM, this.bL));
			}

			if (this.T % 100 == 0 && !this.E().a(nr.L)) {
				this.o();
			}
		} catch (Throwable var4) {
			b b3 = b.a(var4, "Ticking player");
			c c4 = b3.a("Player being ticked");
			this.a(c4);
			throw new f(b3);
		}
	}

	private void a(bei bei, int integer) {
		for (bdy bdy6 : this.de().a(bei)) {
			bea bea7 = this.de().c(this.h_(), bdy6);
			bea7.c(integer);
		}
	}

	@Override
	protected void o() {
		akf akf2 = this.l.b(new co(ot.c(this.p), 0, ot.c(this.r)));
		String string3 = akf2.l();
		oc oc4 = this.E().b(nr.L);
		if (oc4 == null) {
			oc4 = this.E().a(nr.L, new oc());
		}

		oc4.add(string3);
		if (this.E().b(nr.L) && oc4.size() >= akf.i.size()) {
			Set<akf> set5 = Sets.newHashSet(akf.i);

			for (String string7 : oc4) {
				Iterator<akf> iterator8 = set5.iterator();

				while (iterator8.hasNext()) {
					akf akf9 = (akf)iterator8.next();
					if (akf9.l().equals(string7)) {
						iterator8.remove();
					}
				}

				if (set5.isEmpty()) {
					break;
				}
			}

			if (set5.isEmpty()) {
				this.b(nr.L);
			}
		}
	}

	@Override
	public void a(ry ry) {
		boolean boolean3 = this.l.U().b("showDeathMessages");
		this.a.a(new hf(this.bZ(), hf.a.ENTITY_DIED, boolean3));
		if (boolean3) {
			bee bee4 = this.aQ();
			if (bee4 == null || bee4.j() == bee.b.ALWAYS) {
				this.b.am().a(this.bZ().b());
			} else if (bee4.j() == bee.b.HIDE_FOR_OTHER_TEAMS) {
				this.b.am().a(this, this.bZ().b());
			} else if (bee4.j() == bee.b.HIDE_FOR_OWN_TEAM) {
				this.b.am().b(this, this.bZ().b());
			}
		}

		if (!this.l.U().b("keepInventory") && !this.y()) {
			this.cN();
			this.bs.o();
		}

		for (bdy bdy6 : this.l.ad().a(bei.d)) {
			bea bea7 = this.de().c(this.h_(), bdy6);
			bea7.a();
		}

		sw sw5 = this.ca();
		if (sw5 != null) {
			sp.a a6 = (sp.a)sp.c.get(sp.a(sw5));
			if (a6 != null) {
				this.b(a6.e);
			}

			sw5.b(this, this.bb);
		}

		this.b(oa.A);
		this.a(oa.h);
		this.X();
		this.b(0, false);
		this.bZ().g();
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else {
			boolean boolean4 = this.b.aa() && this.dl() && "fall".equals(ry.u);
			if (!boolean4 && this.cf > 0 && ry != ry.m) {
				return false;
			} else {
				if (ry instanceof rz) {
					sn sn5 = ry.j();
					if (sn5 instanceof aay && !this.a((aay)sn5)) {
						return false;
					}

					if (sn5 instanceof abb) {
						abb abb6 = (abb)sn5;
						if (abb6.e instanceof aay && !this.a((aay)abb6.e)) {
							return false;
						}
					}
				}

				return super.a(ry, float2);
			}
		}
	}

	@Override
	public boolean a(aay aay) {
		return !this.dl() ? false : super.a(aay);
	}

	private boolean dl() {
		return this.b.ag();
	}

	@Nullable
	@Override
	public sn c(int integer) {
		this.ck = true;
		if (this.am == 1 && integer == 1) {
			this.l.e(this);
			if (!this.h) {
				this.h = true;
				if (this.a(nr.D)) {
					this.a.a(new gu(4, 0.0F));
				} else {
					this.b(nr.D);
					this.a.a(new gu(4, 1.0F));
				}
			}

			return this;
		} else {
			if (this.am == 0 && integer == 1) {
				this.b(nr.C);
				integer = 1;
			} else {
				this.b(nr.y);
			}

			this.b.am().a(this, integer);
			this.a.a(new gx(1032, co.a, 0, false));
			this.ce = -1;
			this.cb = -1.0F;
			this.cc = -1;
			return this;
		}
	}

	@Override
	public boolean a(ly ly) {
		if (ly.y()) {
			return this.G() == this;
		} else {
			return this.y() ? false : super.a(ly);
		}
	}

	private void a(asc asc) {
		if (asc != null) {
			fz fz3 = asc.c();
			if (fz3 != null) {
				this.a.a(fz3);
			}
		}
	}

	@Override
	public void a(sn sn, int integer) {
		super.a(sn, integer);
		this.bu.b();
	}

	@Override
	public aay.a a(co co) {
		aay.a a3 = super.a(co);
		if (a3 == aay.a.OK) {
			this.b(oa.ab);
			fm<?> fm4 = new hi(this, co);
			this.x().v().a(this, fm4);
			this.a.a(this.p, this.q, this.r, this.v, this.w);
			this.a.a(fm4);
		}

		return a3;
	}

	@Override
	public void a(boolean boolean1, boolean boolean2, boolean boolean3) {
		if (this.cr()) {
			this.x().v().b(this, new fw(this, 2));
		}

		super.a(boolean1, boolean2, boolean3);
		if (this.a != null) {
			this.a.a(this.p, this.q, this.r, this.v, this.w);
		}
	}

	@Override
	public boolean a(sn sn, boolean boolean2) {
		sn sn4 = this.bB();
		if (!super.a(sn, boolean2)) {
			return false;
		} else {
			sn sn5 = this.bB();
			if (sn5 != sn4 && this.a != null) {
				this.a.a(this.p, this.q, this.r, this.v, this.w);
			}

			return true;
		}
	}

	@Override
	public void p() {
		sn sn2 = this.bB();
		super.p();
		sn sn3 = this.bB();
		if (sn3 != sn2 && this.a != null) {
			this.a.a(this.p, this.q, this.r, this.v, this.w);
		}
	}

	@Override
	public boolean b(ry ry) {
		return super.b(ry) || this.K();
	}

	@Override
	protected void a(double double1, boolean boolean2, atl atl, co co) {
	}

	@Override
	protected void b(co co) {
		if (!this.y()) {
			super.b(co);
		}
	}

	public void a(double double1, boolean boolean2) {
		int integer5 = ot.c(this.p);
		int integer6 = ot.c(this.q - 0.2F);
		int integer7 = ot.c(this.r);
		co co8 = new co(integer5, integer6, integer7);
		atl atl9 = this.l.o(co8);
		if (atl9.a() == azs.a) {
			co co10 = co8.b();
			atl atl11 = this.l.o(co10);
			alu alu12 = atl11.v();
			if (alu12 instanceof anl || alu12 instanceof arq || alu12 instanceof anm) {
				co8 = co10;
				atl9 = atl11;
			}
		}

		super.a(double1, boolean2, atl9, co8);
	}

	@Override
	public void a(asv asv) {
		asv.a(this);
		this.a.a(new hd(asv.w()));
	}

	private void dm() {
		this.cl = this.cl % 100 + 1;
	}

	@Override
	public void a(rj rj) {
		if (rj instanceof rq && ((rq)rj).b() != null && this.y()) {
			this.a(new fi("container.spectatorCantOpen").a(new fg().a(a.RED)), true);
		} else {
			this.dm();
			this.a.a(new gj(this.cl, rj.l(), rj.i_()));
			this.bu = rj.a(this.bs, this);
			this.bu.d = this.cl;
			this.bu.a((acr)this);
		}
	}

	@Override
	public void a(rc rc) {
		if (rc instanceof rq && ((rq)rc).b() != null && this.y()) {
			this.a(new fi("container.spectatorCantOpen").a(new fg().a(a.RED)), true);
		} else {
			if (this.bu != this.bt) {
				this.q();
			}

			if (rc instanceof ro) {
				ro ro3 = (ro)rc;
				if (ro3.z_() && !this.a(ro3.j()) && !this.y()) {
					this.a.a(new gf(new fi("container.isLocked", rc.i_()), (byte)2));
					this.a.a(new ig(nn.Y, no.BLOCKS, this.p, this.q, this.r, 1.0F, 1.0F));
					return;
				}
			}

			this.dm();
			if (rc instanceof rj) {
				this.a.a(new gj(this.cl, ((rj)rc).l(), rc.i_(), rc.v_()));
				this.bu = ((rj)rc).a(this.bs, this);
			} else {
				this.a.a(new gj(this.cl, "minecraft:container", rc.i_(), rc.v_()));
				this.bu = new acp(this.bs, rc, this);
			}

			this.bu.d = this.cl;
			this.bu.a((acr)this);
		}
	}

	@Override
	public void a(ajd ajd) {
		this.dm();
		this.bu = new ade(this.bs, ajd, this.l);
		this.bu.d = this.cl;
		this.bu.a((acr)this);
		rc rc3 = ((ade)this.bu).e();
		fb fb4 = ajd.i_();
		this.a.a(new gj(this.cl, "minecraft:villager", fb4, rc3.v_()));
		ajf ajf5 = ajd.b_(this);
		if (ajf5 != null) {
			et et6 = new et(Unpooled.buffer());
			et6.writeInt(this.cl);
			ajf5.a(et6);
			this.a.a(new go("MC|TrList", et6));
		}
	}

	@Override
	public void a(xm xm, rc rc) {
		if (this.bu != this.bt) {
			this.q();
		}

		this.dm();
		this.a.a(new gj(this.cl, "EntityHorse", rc.i_(), rc.v_(), xm.O()));
		this.bu = new adb(this.bs, rc, xm, this);
		this.bu.d = this.cl;
		this.bu.a((acr)this);
	}

	@Override
	public void a(afj afj, ri ri) {
		afh afh4 = afj.c();
		if (afh4 == afl.bY) {
			et et5 = new et(Unpooled.buffer());
			et5.a(ri);
			this.a.a(new go("MC|BOpen", et5));
		}
	}

	@Override
	public void a(asf asf) {
		asf.d(true);
		this.a((asc)asf);
	}

	@Override
	public void a(acl acl, int integer, afj afj) {
		if (!(acl.a(integer) instanceof adi)) {
			if (!this.f) {
				this.a.a(new gm(acl.d, integer, afj));
			}
		}
	}

	public void a(acl acl) {
		this.a(acl, acl.a());
	}

	@Override
	public void a(acl acl, dd<afj> dd) {
		this.a.a(new gk(acl.d, dd));
		this.a.a(new gm(-1, -1, this.bs.p()));
	}

	@Override
	public void a(acl acl, int integer2, int integer3) {
		this.a.a(new gl(acl.d, integer2, integer3));
	}

	@Override
	public void a(acl acl, rc rc) {
		for (int integer4 = 0; integer4 < rc.h(); integer4++) {
			this.a.a(new gl(acl.d, integer4, rc.c_(integer4)));
		}
	}

	@Override
	public void q() {
		this.a.a(new gi(this.bu.d));
		this.s();
	}

	@Override
	public void r() {
		if (!this.f) {
			this.a.a(new gm(-1, -1, this.bs.p()));
		}
	}

	public void s() {
		this.bu.b((aay)this);
		this.bu = this.bt;
	}

	public void a(float float1, float float2, boolean boolean3, boolean boolean4) {
		if (this.aK()) {
			if (float1 >= -1.0F && float1 <= 1.0F) {
				this.be = float1;
			}

			if (float2 >= -1.0F && float2 <= 1.0F) {
				this.bf = float2;
			}

			this.bd = boolean3;
			this.e(boolean4);
		}
	}

	@Override
	public boolean a(nq nq) {
		return this.bU.a(nq);
	}

	@Override
	public void a(nw nw, int integer) {
		if (nw != null) {
			this.bU.b(this, nw, integer);

			for (bdy bdy5 : this.de().a(nw.k())) {
				this.de().c(this.h_(), bdy5).a(integer);
			}

			if (this.bU.e()) {
				this.bU.a(this);
			}
		}
	}

	@Override
	public void a(nw nw) {
		if (nw != null) {
			this.bU.a(this, nw, 0);

			for (bdy bdy4 : this.de().a(nw.k())) {
				this.de().c(this.h_(), bdy4).c(0);
			}

			if (this.bU.e()) {
				this.bU.a(this);
			}
		}
	}

	public void t() {
		this.az();
		if (this.bG) {
			this.a(true, false, false);
		}
	}

	public void u() {
		this.cb = -1.0E8F;
	}

	@Override
	public void a(fb fb, boolean boolean2) {
		this.a.a(new gf(fb, (byte)(boolean2 ? 2 : 0)));
	}

	@Override
	protected void v() {
		if (!this.bn.b() && this.cy()) {
			this.a.a(new gr(this, (byte)9));
			super.v();
		}
	}

	@Override
	public void a(aay aay, boolean boolean2) {
		super.a(aay, boolean2);
		this.ce = -1;
		this.cb = -1.0F;
		this.cc = -1;
		this.bT.addAll(((ly)aay).bT);
	}

	@Override
	protected void a(sh sh) {
		super.a(sh);
		this.a.a(new il(this.O(), sh));
	}

	@Override
	protected void a(sh sh, boolean boolean2) {
		super.a(sh, boolean2);
		this.a.a(new il(this.O(), sh));
	}

	@Override
	protected void b(sh sh) {
		super.b(sh);
		this.a.a(new hk(this.O(), sh.a()));
	}

	@Override
	public void a(double double1, double double2, double double3) {
		this.a.a(double1, double2, double3, this.v, this.w);
	}

	@Override
	public void a(sn sn) {
		this.x().v().b(this, new fw(sn, 4));
	}

	@Override
	public void b(sn sn) {
		this.x().v().b(this, new fw(sn, 5));
	}

	@Override
	public void w() {
		if (this.a != null) {
			this.a.a(new he(this.bK));
			this.F();
		}
	}

	public lw x() {
		return (lw)this.l;
	}

	@Override
	public void a(ajq ajq) {
		this.c.a(ajq);
		this.a.a(new gu(3, (float)ajq.a()));
		if (ajq == ajq.SPECTATOR) {
			this.p();
		} else {
			this.e(this);
		}

		this.w();
		this.cw();
	}

	@Override
	public boolean y() {
		return this.c.b() == ajq.SPECTATOR;
	}

	@Override
	public boolean z() {
		return this.c.b() == ajq.CREATIVE;
	}

	@Override
	public void a(fb fb) {
		this.a.a(new gf(fb));
	}

	@Override
	public boolean a(int integer, String string) {
		if ("seed".equals(string) && !this.b.aa()) {
			return true;
		} else if (!"tell".equals(string) && !"help".equals(string) && !"me".equals(string) && !"trigger".equals(string)) {
			if (this.b.am().h(this.cS())) {
				mv mv4 = this.b.am().m().b(this.cS());
				return mv4 != null ? mv4.a() >= integer : this.b.q() >= integer;
			} else {
				return false;
			}
		} else {
			return true;
		}
	}

	public String A() {
		String string2 = this.a.a.b().toString();
		string2 = string2.substring(string2.indexOf("/") + 1);
		return string2.substring(0, string2.indexOf(":"));
	}

	public void a(ir ir) {
		this.bS = ir.a();
		this.cg = ir.c();
		this.ch = ir.d();
		this.R().b(bq, (byte)ir.e());
		this.R().b(br, (byte)(ir.f() == sv.LEFT ? 0 : 1));
	}

	public aay.b C() {
		return this.cg;
	}

	public void a(String string1, String string2) {
		this.a.a(new hl(string1, string2));
	}

	@Override
	public co c() {
		return new co(this.p, this.q + 0.5, this.r);
	}

	public void D() {
		this.ci = MinecraftServer.aw();
	}

	public nv E() {
		return this.bU;
	}

	@Override
	public void c(sn sn) {
		if (sn instanceof aay) {
			this.a.a(new hj(sn.O()));
		} else {
			this.bT.add(sn.O());
		}
	}

	public void d(sn sn) {
		this.bT.remove(sn.O());
	}

	@Override
	protected void F() {
		if (this.y()) {
			this.bQ();
			this.h(true);
		} else {
			super.F();
		}

		this.x().v().a(this);
	}

	public sn G() {
		return (sn)(this.cj == null ? this : this.cj);
	}

	public void e(sn sn) {
		sn sn3 = this.G();
		this.cj = (sn)(sn == null ? this : sn);
		if (sn3 != this.cj) {
			this.a.a(new hp(this.cj));
			this.a(this.cj.p, this.cj.q, this.cj.r);
		}
	}

	@Override
	protected void H() {
		if (this.aj > 0 && !this.ck) {
			this.aj--;
		}
	}

	@Override
	public void f(sn sn) {
		if (this.c.b() == ajq.SPECTATOR) {
			this.e(sn);
		} else {
			super.f(sn);
		}
	}

	public long I() {
		return this.ci;
	}

	@Nullable
	public fb J() {
		return null;
	}

	@Override
	public void a(ri ri) {
		super.a(ri);
		this.dh();
	}

	public boolean K() {
		return this.ck;
	}

	public void L() {
		this.ck = false;
	}

	public void M() {
		this.b(7, true);
	}

	public void N() {
		this.b(7, true);
		this.b(7, false);
	}
}
