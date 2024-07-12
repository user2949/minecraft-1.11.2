import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;

public class alu {
	private static final kq a = new kq("air");
	public static final ct<kq, alu> h = new ct<>(a);
	public static final cy<atl> i = new cy<>();
	public static final bdt j = new bdt(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
	@Nullable
	public static final bdt k = null;
	private aej b;
	protected boolean l;
	protected int m;
	protected boolean n;
	protected int o;
	protected boolean p;
	protected float q;
	protected float r;
	protected boolean s = true;
	protected boolean t;
	protected boolean u;
	protected aqu v = aqu.d;
	public float w = 1.0F;
	protected final azs x;
	protected final azt y;
	public float z = 0.6F;
	protected final atm A;
	private atl c;
	private String d;

	public static int a(alu alu) {
		return h.a(alu);
	}

	public static int j(atl atl) {
		alu alu2 = atl.v();
		return a(alu2) + (alu2.e(atl) << 12);
	}

	public static alu b(int integer) {
		return h.a(integer);
	}

	public static atl c(int integer) {
		int integer2 = integer & 4095;
		int integer3 = integer >> 12 & 15;
		return b(integer2).a(integer3);
	}

	public static alu a(@Nullable afh afh) {
		return afh instanceof adv ? ((adv)afh).d() : alv.a;
	}

	@Nullable
	public static alu b(String string) {
		kq kq2 = new kq(string);
		if (h.d(kq2)) {
			return h.c(kq2);
		} else {
			try {
				return h.a(Integer.parseInt(string));
			} catch (NumberFormatException var3) {
				return null;
			}
		}
	}

	@Deprecated
	public boolean k(atl atl) {
		return atl.a().k() && atl.h();
	}

	@Deprecated
	public boolean l(atl atl) {
		return this.l;
	}

	@Deprecated
	public boolean a(atl atl, sn sn) {
		return true;
	}

	@Deprecated
	public int m(atl atl) {
		return this.m;
	}

	@Deprecated
	public boolean n(atl atl) {
		return this.n;
	}

	@Deprecated
	public int o(atl atl) {
		return this.o;
	}

	@Deprecated
	public boolean p(atl atl) {
		return this.p;
	}

	@Deprecated
	public azs q(atl atl) {
		return this.x;
	}

	@Deprecated
	public azt r(atl atl) {
		return this.y;
	}

	@Deprecated
	public atl a(int integer) {
		return this.t();
	}

	public int e(atl atl) {
		if (atl.t().isEmpty()) {
			return 0;
		} else {
			throw new IllegalArgumentException("Don't know how to convert " + atl + " back into data...");
		}
	}

	@Deprecated
	public atl c(atl atl, ajw ajw, co co) {
		return atl;
	}

	@Deprecated
	public atl a(atl atl, aqi aqi) {
		return atl;
	}

	@Deprecated
	public atl a(atl atl, aou aou) {
		return atl;
	}

	public alu(azs azs, azt azt) {
		this.x = azs;
		this.y = azt;
		this.A = this.b();
		this.y(this.A.b());
		this.l = this.t().q();
		this.m = this.l ? 255 : 0;
		this.n = !azs.b();
	}

	protected alu(azs azs) {
		this(azs, azs.r());
	}

	protected alu a(aqu aqu) {
		this.v = aqu;
		return this;
	}

	protected alu d(int integer) {
		this.m = integer;
		return this;
	}

	protected alu a(float float1) {
		this.o = (int)(15.0F * float1);
		return this;
	}

	protected alu b(float float1) {
		this.r = float1 * 3.0F;
		return this;
	}

	@Deprecated
	public boolean s(atl atl) {
		return atl.a().c() && atl.h();
	}

	@Deprecated
	public boolean t(atl atl) {
		return atl.a().k() && atl.h() && !atl.n();
	}

	@Deprecated
	public boolean u(atl atl) {
		return this.x.c() && this.t().h();
	}

	@Deprecated
	public boolean c(atl atl) {
		return true;
	}

	@Deprecated
	public boolean v(atl atl) {
		return false;
	}

	public boolean b(ajw ajw, co co) {
		return !this.x.c();
	}

	@Deprecated
	public aqf a(atl atl) {
		return aqf.MODEL;
	}

	public boolean a(ajw ajw, co co) {
		return false;
	}

	protected alu c(float float1) {
		this.q = float1;
		if (this.r < float1 * 5.0F) {
			this.r = float1 * 5.0F;
		}

		return this;
	}

	protected alu j() {
		this.c(-1.0F);
		return this;
	}

	@Deprecated
	public float a(atl atl, ajs ajs, co co) {
		return this.q;
	}

	protected alu a(boolean boolean1) {
		this.t = boolean1;
		return this;
	}

	public boolean k() {
		return this.t;
	}

	public boolean l() {
		return this.u;
	}

	@Deprecated
	public bdt b(atl atl, ajw ajw, co co) {
		return j;
	}

	@Deprecated
	public int d(atl atl, ajw ajw, co co) {
		int integer5 = ajw.b(co, atl.d());
		if (integer5 == 0 && atl.v() instanceof aob) {
			co = co.b();
			atl = ajw.o(co);
			return ajw.b(co, atl.d());
		} else {
			return integer5;
		}
	}

	@Deprecated
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		bdt bdt6 = atl.d(ajw, co);
		switch (cv) {
			case DOWN:
				if (bdt6.b > 0.0) {
					return true;
				}
				break;
			case UP:
				if (bdt6.e < 1.0) {
					return true;
				}
				break;
			case NORTH:
				if (bdt6.c > 0.0) {
					return true;
				}
				break;
			case SOUTH:
				if (bdt6.f < 1.0) {
					return true;
				}
				break;
			case WEST:
				if (bdt6.a > 0.0) {
					return true;
				}
				break;
			case EAST:
				if (bdt6.d < 1.0) {
					return true;
				}
		}

		return !ajw.o(co.a(cv)).q();
	}

	public boolean a(ajw ajw, co co, cv cv) {
		return ajw.o(co).a().a();
	}

	@Deprecated
	public bdt b(atl atl, ajs ajs, co co) {
		return atl.d(ajs, co).a(co);
	}

	@Deprecated
	public void a(atl atl, ajs ajs, co co, bdt bdt, List<bdt> list, @Nullable sn sn, boolean boolean7) {
		a(co, bdt, list, atl.c((ajw)ajs, co));
	}

	protected static void a(co co, bdt bdt2, List<bdt> list, @Nullable bdt bdt4) {
		if (bdt4 != k) {
			bdt bdt5 = bdt4.a(co);
			if (bdt2.c(bdt5)) {
				list.add(bdt5);
			}
		}
	}

	@Deprecated
	@Nullable
	public bdt a(atl atl, ajw ajw, co co) {
		return atl.d(ajw, co);
	}

	@Deprecated
	public boolean b(atl atl) {
		return true;
	}

	public boolean a(atl atl, boolean boolean2) {
		return this.m();
	}

	public boolean m() {
		return true;
	}

	public void a(ajs ajs, co co, atl atl, Random random) {
		this.b(ajs, co, atl, random);
	}

	public void b(ajs ajs, co co, atl atl, Random random) {
	}

	public void a(atl atl, ajs ajs, co co, Random random) {
	}

	public void d(ajs ajs, co co, atl atl) {
	}

	@Deprecated
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
	}

	public int a(ajs ajs) {
		return 10;
	}

	public void c(ajs ajs, co co, atl atl) {
	}

	public void b(ajs ajs, co co, atl atl) {
	}

	public int a(Random random) {
		return 1;
	}

	public afh a(atl atl, Random random, int integer) {
		return afh.a(this);
	}

	@Deprecated
	public float a(atl atl, aay aay, ajs ajs, co co) {
		float float6 = atl.b(ajs, co);
		if (float6 < 0.0F) {
			return 0.0F;
		} else {
			return !aay.b(atl) ? aay.a(atl) / float6 / 100.0F : aay.a(atl) / float6 / 30.0F;
		}
	}

	public final void b(ajs ajs, co co, atl atl, int integer) {
		this.a(ajs, co, atl, 1.0F, integer);
	}

	public void a(ajs ajs, co co, atl atl, float float4, int integer) {
		if (!ajs.E) {
			int integer7 = this.a(integer, ajs.r);

			for (int integer8 = 0; integer8 < integer7; integer8++) {
				if (!(ajs.r.nextFloat() > float4)) {
					afh afh9 = this.a(atl, ajs.r, integer);
					if (afh9 != afl.a) {
						a(ajs, co, new afj(afh9, 1, this.d(atl)));
					}
				}
			}
		}
	}

	public static void a(ajs ajs, co co, afj afj) {
		if (!ajs.E && !afj.b() && ajs.U().b("doTileDrops")) {
			float float4 = 0.5F;
			double double5 = (double)(ajs.r.nextFloat() * 0.5F) + 0.25;
			double double7 = (double)(ajs.r.nextFloat() * 0.5F) + 0.25;
			double double9 = (double)(ajs.r.nextFloat() * 0.5F) + 0.25;
			zj zj11 = new zj(ajs, (double)co.p() + double5, (double)co.q() + double7, (double)co.r() + double9, afj);
			zj11.q();
			ajs.a(zj11);
		}
	}

	protected void b(ajs ajs, co co, int integer) {
		if (!ajs.E && ajs.U().b("doTileDrops")) {
			while (integer > 0) {
				int integer5 = st.a(integer);
				integer -= integer5;
				ajs.a(new st(ajs, (double)co.p() + 0.5, (double)co.q() + 0.5, (double)co.r() + 0.5, integer5));
			}
		}
	}

	public int d(atl atl) {
		return 0;
	}

	public float a(sn sn) {
		return this.r / 5.0F;
	}

	@Deprecated
	@Nullable
	public bdu a(atl atl, ajs ajs, co co, bdw bdw4, bdw bdw5) {
		return this.a(co, bdw4, bdw5, atl.d(ajs, co));
	}

	@Nullable
	protected bdu a(co co, bdw bdw2, bdw bdw3, bdt bdt) {
		bdw bdw6 = bdw2.a((double)co.p(), (double)co.q(), (double)co.r());
		bdw bdw7 = bdw3.a((double)co.p(), (double)co.q(), (double)co.r());
		bdu bdu8 = bdt.b(bdw6, bdw7);
		return bdu8 == null ? null : new bdu(bdu8.c.b((double)co.p(), (double)co.q(), (double)co.r()), bdu8.b, co);
	}

	public void a(ajs ajs, co co, ajn ajn) {
	}

	public ajk f() {
		return ajk.SOLID;
	}

	public boolean b(ajs ajs, co co, cv cv) {
		return this.a(ajs, co);
	}

	public boolean a(ajs ajs, co co) {
		return ajs.o(co).v().x.j();
	}

	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		return false;
	}

	public void a(ajs ajs, co co, sn sn) {
	}

	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return this.a(integer);
	}

	public void a(ajs ajs, co co, aay aay) {
	}

	public bdw a(ajs ajs, co co, sn sn, bdw bdw) {
		return bdw;
	}

	@Deprecated
	public int b(atl atl, ajw ajw, co co, cv cv) {
		return 0;
	}

	@Deprecated
	public boolean g(atl atl) {
		return false;
	}

	public void a(ajs ajs, co co, atl atl, sn sn) {
	}

	@Deprecated
	public int c(atl atl, ajw ajw, co co, cv cv) {
		return 0;
	}

	public void a(ajs ajs, aay aay, co co, atl atl, @Nullable asc asc, afj afj) {
		aay.b(oa.a(this));
		aay.a(0.005F);
		if (this.n() && aik.a(aim.t, afj) > 0) {
			afj afj8 = this.w(atl);
			a(ajs, co, afj8);
		} else {
			int integer8 = aik.a(aim.v, afj);
			this.b(ajs, co, atl, integer8);
		}
	}

	protected boolean n() {
		return this.t().h() && !this.u;
	}

	protected afj w(atl atl) {
		afh afh3 = afh.a(this);
		int integer4 = 0;
		if (afh3.l()) {
			integer4 = this.e(atl);
		}

		return new afj(afh3, 1, integer4);
	}

	public int a(int integer, Random random) {
		return this.a(random);
	}

	public void a(ajs ajs, co co, atl atl, sw sw, afj afj) {
	}

	public boolean d() {
		return !this.x.a() && !this.x.d();
	}

	public alu c(String string) {
		this.d = string;
		return this;
	}

	public String c() {
		return dp.a(this.a() + ".name");
	}

	public String a() {
		return "tile." + this.d;
	}

	@Deprecated
	public boolean a(atl atl, ajs ajs, co co, int integer4, int integer5) {
		return false;
	}

	public boolean o() {
		return this.s;
	}

	protected alu p() {
		this.s = false;
		return this;
	}

	@Deprecated
	public azv h(atl atl) {
		return this.x.m();
	}

	@Deprecated
	public float f(atl atl) {
		return atl.l() ? 0.2F : 1.0F;
	}

	public void a(ajs ajs, co co, sn sn, float float4) {
		sn.e(float4, 1.0F);
	}

	public void a(ajs ajs, sn sn) {
		sn.t = 0.0;
	}

	public afj a(ajs ajs, co co, atl atl) {
		return new afj(afh.a(this), 1, this.d(atl));
	}

	public void a(afh afh, aej aej, dd<afj> dd) {
		dd.add(new afj(afh));
	}

	public aej q() {
		return this.b;
	}

	public alu a(aej aej) {
		this.b = aej;
		return this;
	}

	public void a(ajs ajs, co co, atl atl, aay aay) {
	}

	public void h(ajs ajs, co co) {
	}

	public boolean r() {
		return true;
	}

	public boolean a(ajn ajn) {
		return true;
	}

	public boolean b(alu alu) {
		return this == alu;
	}

	public static boolean a(alu alu1, alu alu2) {
		if (alu1 == null || alu2 == null) {
			return false;
		} else {
			return alu1 == alu2 ? true : alu1.b(alu2);
		}
	}

	@Deprecated
	public boolean x(atl atl) {
		return false;
	}

	@Deprecated
	public int c(atl atl, ajs ajs, co co) {
		return 0;
	}

	protected atm b() {
		return new atm(this);
	}

	public atm s() {
		return this.A;
	}

	protected final void y(atl atl) {
		this.c = atl;
	}

	public final atl t() {
		return this.c;
	}

	public alu.a u() {
		return alu.a.NONE;
	}

	@Deprecated
	public bdw e(atl atl, ajw ajw, co co) {
		alu.a a5 = this.u();
		if (a5 == alu.a.NONE) {
			return bdw.a;
		} else {
			long long6 = ot.c(co.p(), 0, co.r());
			return new bdw(
				((double)((float)(long6 >> 16 & 15L) / 15.0F) - 0.5) * 0.5,
				a5 == alu.a.XYZ ? ((double)((float)(long6 >> 20 & 15L) / 15.0F) - 1.0) * 0.2 : 0.0,
				((double)((float)(long6 >> 24 & 15L) / 15.0F) - 0.5) * 0.5
			);
		}
	}

	public aqu v() {
		return this.v;
	}

	public String toString() {
		return "Block{" + h.b(this) + "}";
	}

	public void a(afj afj, aay aay, List<String> list, boolean boolean4) {
	}

	public static void w() {
		a(0, a, new alk().c("air"));
		a(1, "stone", new arc().c(1.5F).b(10.0F).a(aqu.d).c("stone"));
		a(2, "grass", new anx().c(0.6F).a(aqu.c).c("grass"));
		a(3, "dirt", new amv().c(0.5F).a(aqu.b).c("dirt"));
		alu alu1 = new alu(azs.e).c(2.0F).b(10.0F).a(aqu.d).c("stonebrick").a(aej.b);
		a(4, "cobblestone", alu1);
		alu alu2 = new apn().c(2.0F).b(5.0F).a(aqu.a).c("wood");
		a(5, "planks", alu2);
		a(6, "sapling", new aql().c(0.0F).a(aqu.c).c("sapling"));
		a(7, "bedrock", new apf(azs.e).j().b(6000000.0F).a(aqu.d).c("bedrock").p().a(aej.b));
		a(8, "flowing_water", new anb(azs.h).c(100.0F).d(3).c("water").p());
		a(9, "water", new ara(azs.h).c(100.0F).d(3).c("water").p());
		a(10, "flowing_lava", new anb(azs.i).c(100.0F).a(1.0F).c("lava").p());
		a(11, "lava", new ara(azs.i).c(100.0F).a(1.0F).c("lava").p());
		a(12, "sand", new aqj().c(0.5F).a(aqu.h).c("sand"));
		a(13, "gravel", new anz().c(0.6F).a(aqu.b).c("gravel"));
		a(14, "gold_ore", new apl().c(3.0F).b(5.0F).a(aqu.d).c("oreGold"));
		a(15, "iron_ore", new apl().c(3.0F).b(5.0F).a(aqu.d).c("oreIron"));
		a(16, "coal_ore", new apl().c(3.0F).b(5.0F).a(aqu.d).c("oreCoal"));
		a(17, "log", new apk().c("log"));
		a(18, "leaves", new apj().c("leaves"));
		a(19, "sponge", new aqv().c(0.6F).a(aqu.c).c("sponge"));
		a(20, "glass", new anv(azs.s, false).c(0.3F).a(aqu.f).c("glass"));
		a(21, "lapis_ore", new apl().c(3.0F).b(5.0F).a(aqu.d).c("oreLapis"));
		a(22, "lapis_block", new alu(azs.f, azt.H).c(3.0F).b(5.0F).a(aqu.d).c("blockLapis").a(aej.b));
		a(23, "dispenser", new amw().c(3.5F).a(aqu.d).c("dispenser"));
		alu alu3 = new aqk().a(aqu.d).c(0.8F).c("sandStone");
		a(24, "sandstone", alu3);
		a(25, "noteblock", new apg().a(aqu.a).c(0.8F).c("musicBlock"));
		a(26, "bed", new als().a(aqu.a).c(0.2F).c("bed").p());
		a(27, "golden_rail", new apr().c(0.7F).a(aqu.e).c("goldenRail"));
		a(28, "detector_rail", new ams().c(0.7F).a(aqu.e).c("detectorRail"));
		a(29, "sticky_piston", new atc(true).c("pistonStickyBase"));
		a(30, "web", new art().d(1).c(4.0F).c("web"));
		a(31, "tallgrass", new ari().c(0.0F).a(aqu.c).c("tallgrass"));
		a(32, "deadbush", new amr().c(0.0F).a(aqu.c).c("deadbush"));
		a(33, "piston", new atc(false).c("pistonBase"));
		a(34, "piston_head", new atd().c("pistonBase"));
		a(35, "wool", new aml(azs.n).c(0.8F).a(aqu.g).c("cloth"));
		a(36, "piston_extension", new ate());
		a(37, "yellow_flower", new ary().c(0.0F).a(aqu.c).c("flower1"));
		a(38, "red_flower", new apy().c(0.0F).a(aqu.c).c("flower2"));
		alu alu4 = new aox().c(0.0F).a(aqu.c).a(0.125F).c("mushroom");
		a(39, "brown_mushroom", alu4);
		alu alu5 = new aox().c(0.0F).a(aqu.c).c("mushroom");
		a(40, "red_mushroom", alu5);
		a(41, "gold_block", new alu(azs.f, azt.F).c(3.0F).b(10.0F).a(aqu.e).c("blockGold").a(aej.b));
		a(42, "iron_block", new alu(azs.f, azt.h).c(5.0F).b(10.0F).a(aqu.e).c("blockIron").a(aej.b));
		a(43, "double_stone_slab", new ans().c(2.0F).b(10.0F).a(aqu.d).c("stoneSlab"));
		a(44, "stone_slab", new aoc().c(2.0F).b(10.0F).a(aqu.d).c("stoneSlab"));
		alu alu6 = new alu(azs.e, azt.D).c(2.0F).b(10.0F).a(aqu.d).c("brick").a(aej.b);
		a(45, "brick_block", alu6);
		a(46, "tnt", new ark().c(0.0F).a(aqu.c).c("tnt"));
		a(47, "bookshelf", new aly().c(1.5F).a(aqu.a).c("bookshelf"));
		a(48, "mossy_cobblestone", new alu(azs.e).c(2.0F).b(10.0F).a(aqu.d).c("stoneMoss").a(aej.b));
		a(49, "obsidian", new api().c(50.0F).b(2000.0F).a(aqu.d).c("obsidian"));
		a(50, "torch", new arl().c(0.0F).a(0.9375F).a(aqu.a).c("torch"));
		a(51, "fire", new ann().c(0.0F).a(1.0F).a(aqu.g).c("fire").p());
		a(52, "mob_spawner", new aov().c(5.0F).a(aqu.e).c("mobSpawner").p());
		a(53, "oak_stairs", new aqy(alu2.t().a(apn.a, apn.a.OAK)).c("stairsWood"));
		a(54, "chest", new amg(amg.a.BASIC).c(2.5F).a(aqu.a).c("chest"));
		a(55, "redstone_wire", new aqb().c(0.0F).a(aqu.d).c("redstoneDust").p());
		a(56, "diamond_ore", new apl().c(3.0F).b(5.0F).a(aqu.d).c("oreDiamond"));
		a(57, "diamond_block", new alu(azs.f, azt.G).c(5.0F).b(10.0F).a(aqu.e).c("blockDiamond").a(aej.b));
		a(58, "crafting_table", new amo().c(2.5F).a(aqu.a).c("workbench"));
		a(59, "wheat", new amp().c("crops"));
		alu alu7 = new ank().c(0.6F).a(aqu.b).c("farmland");
		a(60, "farmland", alu7);
		a(61, "furnace", new anu(false).c(3.5F).a(aqu.d).c("furnace").a(aej.c));
		a(62, "lit_furnace", new anu(true).c(3.5F).a(aqu.d).a(0.875F).c("furnace"));
		a(63, "standing_sign", new aqz().c(1.0F).a(aqu.a).c("sign").p());
		a(64, "wooden_door", new amx(azs.d).c(3.0F).a(aqu.a).c("doorOak").p());
		a(65, "ladder", new aom().c(0.4F).a(aqu.j).c("ladder"));
		a(66, "rail", new apx().c(0.7F).a(aqu.e).c("rail"));
		a(67, "stone_stairs", new aqy(alu1.t()).c("stairsStone"));
		a(68, "wall_sign", new arr().c(1.0F).a(aqu.a).c("sign").p());
		a(69, "lever", new aop().c(0.5F).a(aqu.a).c("lever"));
		a(70, "stone_pressure_plate", new aps(azs.e, aps.a.MOBS).c(0.5F).a(aqu.d).c("pressurePlateStone"));
		a(71, "iron_door", new amx(azs.f).c(5.0F).a(aqu.e).c("doorIron").p());
		a(72, "wooden_pressure_plate", new aps(azs.d, aps.a.EVERYTHING).c(0.5F).a(aqu.a).c("pressurePlateWood"));
		a(73, "redstone_ore", new aqa(false).c(3.0F).b(5.0F).a(aqu.d).c("oreRedstone").a(aej.b));
		a(74, "lit_redstone_ore", new aqa(true).a(0.625F).c(3.0F).b(5.0F).a(aqu.d).c("oreRedstone"));
		a(75, "unlit_redstone_torch", new aqd(false).c(0.0F).a(aqu.a).c("notGate"));
		a(76, "redstone_torch", new aqd(true).c(0.0F).a(0.5F).a(aqu.a).c("notGate").a(aej.d));
		a(77, "stone_button", new are().c(0.5F).a(aqu.d).c("button"));
		a(78, "snow_layer", new aqs().c(0.1F).a(aqu.i).c("snow").d(0));
		a(79, "ice", new aok().c(0.5F).d(3).a(aqu.f).c("ice"));
		a(80, "snow", new aqr().c(0.2F).a(aqu.i).c("snow"));
		a(81, "cactus", new amc().c(0.4F).a(aqu.g).c("cactus"));
		a(82, "clay", new amj().c(0.6F).a(aqu.b).c("clay"));
		a(83, "reeds", new aqe().c(0.0F).a(aqu.c).c("reeds").p());
		a(84, "jukebox", new aol().c(2.0F).b(10.0F).a(aqu.d).c("jukebox"));
		a(85, "fence", new anl(azs.d, apn.a.OAK.c()).c(2.0F).b(5.0F).a(aqu.a).c("fence"));
		alu alu8 = new apu().c(1.0F).a(aqu.a).c("pumpkin");
		a(86, "pumpkin", alu8);
		a(87, "netherrack", new apb().c(0.4F).a(aqu.d).c("hellrock"));
		a(88, "soul_sand", new aqt().c(0.5F).a(aqu.h).c("hellsand"));
		a(89, "glowstone", new anw(azs.s).c(0.3F).a(aqu.f).a(1.0F).c("lightgem"));
		a(90, "portal", new apo().c(-1.0F).a(aqu.f).a(0.75F).c("portal"));
		a(91, "lit_pumpkin", new apu().c(1.0F).a(aqu.a).a(1.0F).c("litpumpkin"));
		a(92, "cake", new amd().c(0.5F).a(aqu.g).c("cake").p());
		a(93, "unpowered_repeater", new aqg(false).c(0.0F).a(aqu.a).c("diode").p());
		a(94, "powered_repeater", new aqg(true).c(0.0F).a(aqu.a).c("diode").p());
		a(95, "stained_glass", new aqw(azs.s).c(0.3F).a(aqu.f).c("stainedGlass"));
		a(96, "trapdoor", new arm(azs.d).c(3.0F).a(aqu.a).c("trapdoor").p());
		a(97, "monster_egg", new aow().c(0.75F).c("monsterStoneEgg"));
		alu alu9 = new ard().c(1.5F).b(10.0F).a(aqu.d).c("stonebricksmooth");
		a(98, "stonebrick", alu9);
		a(99, "brown_mushroom_block", new aoj(azs.d, azt.l, alu4).c(0.2F).a(aqu.a).c("mushroom"));
		a(100, "red_mushroom_block", new aoj(azs.d, azt.D, alu5).c(0.2F).a(aqu.a).c("mushroom"));
		a(101, "iron_bars", new arj(azs.f, true).c(5.0F).b(10.0F).a(aqu.e).c("fenceIron"));
		a(102, "glass_pane", new arj(azs.s, false).c(0.3F).a(aqu.f).c("thinGlass"));
		alu alu10 = new aot().c(1.0F).a(aqu.a).c("melon");
		a(103, "melon_block", alu10);
		a(104, "pumpkin_stem", new arb(alu8).c(0.0F).a(aqu.a).c("pumpkinStem"));
		a(105, "melon_stem", new arb(alu10).c(0.0F).a(aqu.a).c("pumpkinStem"));
		a(106, "vine", new arp().c(0.2F).a(aqu.c).c("vine"));
		a(107, "fence_gate", new anm(apn.a.OAK).c(2.0F).b(5.0F).a(aqu.a).c("fenceGate"));
		a(108, "brick_stairs", new aqy(alu6.t()).c("stairsBrick"));
		a(109, "stone_brick_stairs", new aqy(alu9.t().a(ard.a, ard.a.DEFAULT)).c("stairsStoneBrickSmooth"));
		a(110, "mycelium", new aoy().c(0.6F).a(aqu.c).c("mycel"));
		a(111, "waterlily", new ars().c(0.0F).a(aqu.c).c("waterlily"));
		alu alu11 = new aoz().c(2.0F).b(10.0F).a(aqu.d).c("netherBrick").a(aej.b);
		a(112, "nether_brick", alu11);
		a(113, "nether_brick_fence", new anl(azs.e, azt.K).c(2.0F).b(10.0F).a(aqu.d).c("netherFence"));
		a(114, "nether_brick_stairs", new aqy(alu11.t()).c("stairsNetherBrick"));
		a(115, "nether_wart", new apa().c("netherStalk"));
		a(116, "enchanting_table", new anc().c(5.0F).b(2000.0F).c("enchantmentTable"));
		a(117, "brewing_stand", new alz().c(0.5F).a(0.125F).c("brewingStand"));
		a(118, "cauldron", new amf().c(2.0F).c("cauldron"));
		a(119, "end_portal", new ane(azs.E).c(-1.0F).b(6000000.0F));
		a(120, "end_portal_frame", new anf().a(aqu.f).a(0.125F).c(-1.0F).c("endPortalFrame").b(6000000.0F).a(aej.c));
		a(121, "end_stone", new alu(azs.e, azt.d).c(3.0F).b(15.0F).a(aqu.d).c("whiteStone").a(aej.b));
		a(122, "dragon_egg", new amz().c(3.0F).b(15.0F).a(aqu.d).a(0.125F).c("dragonEgg"));
		a(123, "redstone_lamp", new aqc(false).c(0.3F).a(aqu.f).c("redstoneLight").a(aej.d));
		a(124, "lit_redstone_lamp", new aqc(true).c(0.3F).a(aqu.f).c("redstoneLight"));
		a(125, "double_wooden_slab", new ant().c(2.0F).b(5.0F).a(aqu.a).c("woodSlab"));
		a(126, "wooden_slab", new aoe().c(2.0F).b(5.0F).a(aqu.a).c("woodSlab"));
		a(127, "cocoa", new amk().c(0.2F).b(5.0F).a(aqu.a).c("cocoa"));
		a(128, "sandstone_stairs", new aqy(alu3.t().a(aqk.a, aqk.a.SMOOTH)).c("stairsSandStone"));
		a(129, "emerald_ore", new apl().c(3.0F).b(5.0F).a(aqu.d).c("oreEmerald"));
		a(130, "ender_chest", new anh().c(22.5F).b(1000.0F).a(aqu.d).c("enderChest").a(0.5F));
		a(131, "tripwire_hook", new aro().c("tripWireSource"));
		a(132, "tripwire", new arn().c("tripWire"));
		a(133, "emerald_block", new alu(azs.f, azt.I).c(5.0F).b(10.0F).a(aqu.e).c("blockEmerald").a(aej.b));
		a(134, "spruce_stairs", new aqy(alu2.t().a(apn.a, apn.a.SPRUCE)).c("stairsWoodSpruce"));
		a(135, "birch_stairs", new aqy(alu2.t().a(apn.a, apn.a.BIRCH)).c("stairsWoodBirch"));
		a(136, "jungle_stairs", new aqy(alu2.t().a(apn.a, apn.a.JUNGLE)).c("stairsWoodJungle"));
		a(137, "command_block", new amm(azt.B).j().b(6000000.0F).c("commandBlock"));
		a(138, "beacon", new alr().c("beacon").a(1.0F));
		a(139, "cobblestone_wall", new arq(alu1).c("cobbleWall"));
		a(140, "flower_pot", new anp().c(0.0F).a(aqu.d).c("flowerPot"));
		a(141, "carrots", new ame().c("carrots"));
		a(142, "potatoes", new app().c("potatoes"));
		a(143, "wooden_button", new arv().c(0.5F).a(aqu.a).c("button"));
		a(144, "skull", new aqp().c(1.0F).a(aqu.d).c("skull"));
		a(145, "anvil", new all().c(5.0F).a(aqu.k).b(2000.0F).c("anvil"));
		a(146, "trapped_chest", new amg(amg.a.TRAP).c(2.5F).a(aqu.a).c("chestTrap"));
		a(147, "light_weighted_pressure_plate", new aru(azs.f, 15, azt.F).c(0.5F).a(aqu.a).c("weightedPlate_light"));
		a(148, "heavy_weighted_pressure_plate", new aru(azs.f, 150).c(0.5F).a(aqu.a).c("weightedPlate_heavy"));
		a(149, "unpowered_comparator", new amn(false).c(0.0F).a(aqu.a).c("comparator").p());
		a(150, "powered_comparator", new amn(true).c(0.0F).a(0.625F).a(aqu.a).c("comparator").p());
		a(151, "daylight_detector", new amq(false));
		a(152, "redstone_block", new apq(azs.f, azt.f).c(5.0F).b(10.0F).a(aqu.e).c("blockRedstone").a(aej.d));
		a(153, "quartz_ore", new apl(azt.K).c(3.0F).b(5.0F).a(aqu.d).c("netherquartz"));
		a(154, "hopper", new aoh().c(3.0F).b(8.0F).a(aqu.e).c("hopper"));
		alu alu12 = new apw().a(aqu.d).c(0.8F).c("quartzBlock");
		a(155, "quartz_block", alu12);
		a(156, "quartz_stairs", new aqy(alu12.t().a(apw.a, apw.a.DEFAULT)).c("stairsQuartz"));
		a(157, "activator_rail", new apr().c(0.7F).a(aqu.e).c("activatorRail"));
		a(158, "dropper", new ana().c(3.5F).a(aqu.d).c("dropper"));
		a(159, "stained_hardened_clay", new aml(azs.e).c(1.25F).b(7.0F).a(aqu.d).c("clayHardenedStained"));
		a(160, "stained_glass_pane", new aqx().c(0.3F).a(aqu.f).c("thinStainedGlass"));
		a(161, "leaves2", new apc().c("leaves"));
		a(162, "log2", new apd().c("log"));
		a(163, "acacia_stairs", new aqy(alu2.t().a(apn.a, apn.a.ACACIA)).c("stairsWoodAcacia"));
		a(164, "dark_oak_stairs", new aqy(alu2.t().a(apn.a, apn.a.DARK_OAK)).c("stairsWoodDarkOak"));
		a(165, "slime", new aqq().c("slime").a(aqu.l));
		a(166, "barrier", new aln().c("barrier"));
		a(167, "iron_trapdoor", new arm(azs.f).c(5.0F).a(aqu.e).c("ironTrapdoor").p());
		a(168, "prismarine", new apt().c(1.5F).b(10.0F).a(aqu.d).c("prismarine"));
		a(169, "sea_lantern", new aqm(azs.s).c(0.3F).a(aqu.f).a(1.0F).c("seaLantern"));
		a(170, "hay_block", new aog().c(0.5F).a(aqu.c).c("hayBlock").a(aej.b));
		a(171, "carpet", new arx().c(0.1F).a(aqu.g).c("woolCarpet").d(0));
		a(172, "hardened_clay", new aof().c(1.25F).b(7.0F).a(aqu.d).c("clayHardened"));
		a(173, "coal_block", new alu(azs.e, azt.E).c(5.0F).b(10.0F).a(aqu.d).c("blockCoal").a(aej.b));
		a(174, "packed_ice", new apm().c(0.5F).a(aqu.f).c("icePacked"));
		a(175, "double_plant", new amy());
		a(176, "standing_banner", new alm.a().c(1.0F).a(aqu.a).c("banner").p());
		a(177, "wall_banner", new alm.b().c(1.0F).a(aqu.a).c("banner").p());
		a(178, "daylight_detector_inverted", new amq(true));
		alu alu13 = new apz().a(aqu.d).c(0.8F).c("redSandStone");
		a(179, "red_sandstone", alu13);
		a(180, "red_sandstone_stairs", new aqy(alu13.t().a(apz.a, apz.a.SMOOTH)).c("stairsRedSandStone"));
		a(181, "double_stone_slab2", new anr().c(2.0F).b(10.0F).a(aqu.d).c("stoneSlab2"));
		a(182, "stone_slab2", new aoa().c(2.0F).b(10.0F).a(aqu.d).c("stoneSlab2"));
		a(183, "spruce_fence_gate", new anm(apn.a.SPRUCE).c(2.0F).b(5.0F).a(aqu.a).c("spruceFenceGate"));
		a(184, "birch_fence_gate", new anm(apn.a.BIRCH).c(2.0F).b(5.0F).a(aqu.a).c("birchFenceGate"));
		a(185, "jungle_fence_gate", new anm(apn.a.JUNGLE).c(2.0F).b(5.0F).a(aqu.a).c("jungleFenceGate"));
		a(186, "dark_oak_fence_gate", new anm(apn.a.DARK_OAK).c(2.0F).b(5.0F).a(aqu.a).c("darkOakFenceGate"));
		a(187, "acacia_fence_gate", new anm(apn.a.ACACIA).c(2.0F).b(5.0F).a(aqu.a).c("acaciaFenceGate"));
		a(188, "spruce_fence", new anl(azs.d, apn.a.SPRUCE.c()).c(2.0F).b(5.0F).a(aqu.a).c("spruceFence"));
		a(189, "birch_fence", new anl(azs.d, apn.a.BIRCH.c()).c(2.0F).b(5.0F).a(aqu.a).c("birchFence"));
		a(190, "jungle_fence", new anl(azs.d, apn.a.JUNGLE.c()).c(2.0F).b(5.0F).a(aqu.a).c("jungleFence"));
		a(191, "dark_oak_fence", new anl(azs.d, apn.a.DARK_OAK.c()).c(2.0F).b(5.0F).a(aqu.a).c("darkOakFence"));
		a(192, "acacia_fence", new anl(azs.d, apn.a.ACACIA.c()).c(2.0F).b(5.0F).a(aqu.a).c("acaciaFence"));
		a(193, "spruce_door", new amx(azs.d).c(3.0F).a(aqu.a).c("doorSpruce").p());
		a(194, "birch_door", new amx(azs.d).c(3.0F).a(aqu.a).c("doorBirch").p());
		a(195, "jungle_door", new amx(azs.d).c(3.0F).a(aqu.a).c("doorJungle").p());
		a(196, "acacia_door", new amx(azs.d).c(3.0F).a(aqu.a).c("doorAcacia").p());
		a(197, "dark_oak_door", new amx(azs.d).c(3.0F).a(aqu.a).c("doorDarkOak").p());
		a(198, "end_rod", new ang().c(0.0F).a(0.9375F).a(aqu.a).c("endRod"));
		a(199, "chorus_plant", new ami().c(0.4F).a(aqu.a).c("chorusPlant"));
		a(200, "chorus_flower", new amh().c(0.4F).a(aqu.a).c("chorusFlower"));
		alu alu14 = new alu(azs.e, azt.r).c(1.5F).b(10.0F).a(aqu.d).a(aej.b).c("purpurBlock");
		a(201, "purpur_block", alu14);
		a(202, "purpur_pillar", new aqh(azs.e, azt.r).c(1.5F).b(10.0F).a(aqu.d).a(aej.b).c("purpurPillar"));
		a(203, "purpur_stairs", new aqy(alu14.t()).c("stairsPurpur"));
		a(204, "purpur_double_slab", new apv.a().c(2.0F).b(10.0F).a(aqu.d).c("purpurSlab"));
		a(205, "purpur_slab", new apv.b().c(2.0F).b(10.0F).a(aqu.d).c("purpurSlab"));
		a(206, "end_bricks", new alu(azs.e, azt.d).a(aqu.d).c(0.8F).a(aej.b).c("endBricks"));
		a(207, "beetroots", new alt().c("beetroots"));
		alu alu15 = new any().c(0.65F).a(aqu.c).c("grassPath").p();
		a(208, "grass_path", alu15);
		a(209, "end_gateway", new and(azs.E).c(-1.0F).b(6000000.0F));
		a(210, "repeating_command_block", new amm(azt.z).j().b(6000000.0F).c("repeatingCommandBlock"));
		a(211, "chain_command_block", new amm(azt.C).j().b(6000000.0F).c("chainCommandBlock"));
		a(212, "frosted_ice", new anq().c(0.5F).d(3).a(aqu.f).c("frostedIce"));
		a(213, "magma", new aos().c(0.5F).a(aqu.d).c("magma"));
		a(214, "nether_wart_block", new alu(azs.b, azt.D).a(aej.b).c(1.0F).a(aqu.a).c("netherWartBlock"));
		a(215, "red_nether_brick", new aoz().c(2.0F).b(10.0F).a(aqu.d).c("redNetherBrick").a(aej.b));
		a(216, "bone_block", new alw().c("boneBlock"));
		a(217, "structure_void", new arh().c("structureVoid"));
		a(218, "observer", new aph().c(3.0F).c("observer"));
		a(219, "white_shulker_box", new aqn(aem.WHITE).c(2.0F).a(aqu.d).c("shulkerBoxWhite"));
		a(220, "orange_shulker_box", new aqn(aem.ORANGE).c(2.0F).a(aqu.d).c("shulkerBoxOrange"));
		a(221, "magenta_shulker_box", new aqn(aem.MAGENTA).c(2.0F).a(aqu.d).c("shulkerBoxMagenta"));
		a(222, "light_blue_shulker_box", new aqn(aem.LIGHT_BLUE).c(2.0F).a(aqu.d).c("shulkerBoxLightBlue"));
		a(223, "yellow_shulker_box", new aqn(aem.YELLOW).c(2.0F).a(aqu.d).c("shulkerBoxYellow"));
		a(224, "lime_shulker_box", new aqn(aem.LIME).c(2.0F).a(aqu.d).c("shulkerBoxLime"));
		a(225, "pink_shulker_box", new aqn(aem.PINK).c(2.0F).a(aqu.d).c("shulkerBoxPink"));
		a(226, "gray_shulker_box", new aqn(aem.GRAY).c(2.0F).a(aqu.d).c("shulkerBoxGray"));
		a(227, "silver_shulker_box", new aqn(aem.SILVER).c(2.0F).a(aqu.d).c("shulkerBoxSilver"));
		a(228, "cyan_shulker_box", new aqn(aem.CYAN).c(2.0F).a(aqu.d).c("shulkerBoxCyan"));
		a(229, "purple_shulker_box", new aqn(aem.PURPLE).c(2.0F).a(aqu.d).c("shulkerBoxPurple"));
		a(230, "blue_shulker_box", new aqn(aem.BLUE).c(2.0F).a(aqu.d).c("shulkerBoxBlue"));
		a(231, "brown_shulker_box", new aqn(aem.BROWN).c(2.0F).a(aqu.d).c("shulkerBoxBrown"));
		a(232, "green_shulker_box", new aqn(aem.GREEN).c(2.0F).a(aqu.d).c("shulkerBoxGreen"));
		a(233, "red_shulker_box", new aqn(aem.RED).c(2.0F).a(aqu.d).c("shulkerBoxRed"));
		a(234, "black_shulker_box", new aqn(aem.BLACK).c(2.0F).a(aqu.d).c("shulkerBoxBlack"));
		a(255, "structure_block", new arg().j().b(6000000.0F).c("structureBlock"));
		h.a();

		for (alu alu17 : h) {
			if (alu17.x == azs.a) {
				alu17.p = false;
			} else {
				boolean boolean18 = false;
				boolean boolean19 = alu17 instanceof aqy;
				boolean boolean20 = alu17 instanceof aob;
				boolean boolean21 = alu17 == alu7 || alu17 == alu15;
				boolean boolean22 = alu17.n;
				boolean boolean23 = alu17.m == 0;
				if (boolean19 || boolean20 || boolean21 || boolean22 || boolean23) {
					boolean18 = true;
				}

				alu17.p = boolean18;
			}
		}

		Set<alu> set16 = Sets.newHashSet(new alu[]{h.c(new kq("tripwire"))});

		for (alu alu18 : h) {
			if (set16.contains(alu18)) {
				for (int integer19 = 0; integer19 < 15; integer19++) {
					int integer20 = h.a(alu18) << 4 | integer19;
					i.a(alu18.a(integer19), integer20);
				}
			} else {
				UnmodifiableIterator var26 = alu18.s().a().iterator();

				while (var26.hasNext()) {
					atl atl20 = (atl)var26.next();
					int integer21 = h.a(alu18) << 4 | alu18.e(atl20);
					i.a(atl20, integer21);
				}
			}
		}
	}

	private static void a(int integer, kq kq, alu alu) {
		h.a(integer, kq, alu);
	}

	private static void a(int integer, String string, alu alu) {
		a(integer, new kq(string), alu);
	}

	public static enum a {
		NONE,
		XZ,
		XYZ;
	}
}
