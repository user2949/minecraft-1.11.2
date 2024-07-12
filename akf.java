import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class akf {
	private static final Logger y = LogManager.getLogger();
	protected static final atl a = alv.b.t();
	protected static final atl b = alv.a.t();
	protected static final atl c = alv.h.t();
	protected static final atl d = alv.n.t();
	protected static final atl e = alv.cM.t();
	protected static final atl f = alv.A.t();
	protected static final atl g = alv.aI.t();
	protected static final atl h = alv.j.t();
	public static final Set<akf> i = Sets.newHashSet();
	public static final cy<akf> j = new cy<>();
	protected static final azj k = new azj(new Random(1234L), 1);
	protected static final azj l = new azj(new Random(2345L), 1);
	protected static final awj m = new awj();
	protected static final axq n = new axq(false);
	protected static final awa o = new awa(false);
	protected static final axo p = new axo();
	public static final dc<kq, akf> q = new dc<>();
	private final String z;
	private final float A;
	private final float B;
	private final float C;
	private final float D;
	private final int E;
	private final boolean F;
	private final boolean G;
	@Nullable
	private final String H;
	public atl r = alv.c.t();
	public atl s = alv.d.t();
	public aki t;
	protected List<akf.c> u = Lists.newArrayList();
	protected List<akf.c> v = Lists.newArrayList();
	protected List<akf.c> w = Lists.newArrayList();
	protected List<akf.c> x = Lists.newArrayList();

	public static int a(akf akf) {
		return q.a(akf);
	}

	@Nullable
	public static akf a(int integer) {
		return q.a(integer);
	}

	@Nullable
	public static akf b(akf akf) {
		return j.a(a(akf));
	}

	protected akf(akf.a a) {
		this.z = a.a;
		this.A = a.b;
		this.B = a.c;
		this.C = a.d;
		this.D = a.e;
		this.E = a.f;
		this.F = a.g;
		this.G = a.h;
		this.H = a.i;
		this.t = this.a();
		this.v.add(new akf.c(xf.class, 12, 4, 4));
		this.v.add(new akf.c(xc.class, 10, 4, 4));
		this.v.add(new akf.c(wx.class, 10, 4, 4));
		this.v.add(new akf.c(wy.class, 8, 4, 4));
		this.u.add(new akf.c(aai.class, 100, 4, 4));
		this.u.add(new akf.c(aao.class, 95, 4, 4));
		this.u.add(new akf.c(aap.class, 5, 1, 1));
		this.u.add(new akf.c(aag.class, 100, 4, 4));
		this.u.add(new akf.c(zp.class, 100, 4, 4));
		this.u.add(new akf.c(aah.class, 100, 4, 4));
		this.u.add(new akf.c(zr.class, 10, 1, 4));
		this.u.add(new akf.c(aam.class, 5, 1, 1));
		this.w.add(new akf.c(xh.class, 10, 4, 4));
		this.x.add(new akf.c(wu.class, 10, 8, 8));
	}

	protected aki a() {
		return new aki();
	}

	public boolean b() {
		return this.H != null;
	}

	public avz a(Random random) {
		return (avz)(random.nextInt(10) == 0 ? o : n);
	}

	public awn b(Random random) {
		return new axp(ari.a.GRASS);
	}

	public ano.a a(Random random, co co) {
		return random.nextInt(3) > 0 ? ano.a.DANDELION : ano.a.POPPY;
	}

	public int a(float float1) {
		float1 /= 3.0F;
		float1 = ot.a(float1, -1.0F, 1.0F);
		return ot.c(0.62222224F - float1 * 0.05F, 0.5F + float1 * 0.1F, 1.0F);
	}

	public List<akf.c> a(sy sy) {
		switch (sy) {
			case MONSTER:
				return this.u;
			case CREATURE:
				return this.v;
			case WATER_CREATURE:
				return this.w;
			case AMBIENT:
				return this.x;
			default:
				return Collections.emptyList();
		}
	}

	public boolean c() {
		return this.p();
	}

	public boolean d() {
		return this.p() ? false : this.G;
	}

	public boolean e() {
		return this.k() > 0.85F;
	}

	public float f() {
		return 0.1F;
	}

	public final float a(co co) {
		if (co.q() > 64) {
			float float3 = (float)(k.a((double)((float)co.p() / 8.0F), (double)((float)co.r() / 8.0F)) * 4.0);
			return this.n() - (float3 + (float)co.q() - 64.0F) * 0.05F / 30.0F;
		} else {
			return this.n();
		}
	}

	public void a(ajs ajs, Random random, co co) {
		this.t.a(ajs, random, this, co);
	}

	public int b(co co) {
		double double3 = (double)ot.a(this.a(co), 0.0F, 1.0F);
		double double5 = (double)ot.a(this.k(), 0.0F, 1.0F);
		return ajr.a(double3, double5);
	}

	public int c(co co) {
		double double3 = (double)ot.a(this.a(co), 0.0F, 1.0F);
		double double5 = (double)ot.a(this.k(), 0.0F, 1.0F);
		return ajo.a(double3, double5);
	}

	public void a(ajs ajs, Random random, avp avp, int integer4, int integer5, double double6) {
		this.b(ajs, random, avp, integer4, integer5, double6);
	}

	public final void b(ajs ajs, Random random, avp avp, int integer4, int integer5, double double6) {
		int integer9 = ajs.K();
		atl atl10 = this.r;
		atl atl11 = this.s;
		int integer12 = -1;
		int integer13 = (int)(double6 / 3.0 + 3.0 + random.nextDouble() * 0.25);
		int integer14 = integer4 & 15;
		int integer15 = integer5 & 15;
		co.a a16 = new co.a();

		for (int integer17 = 255; integer17 >= 0; integer17--) {
			if (integer17 <= random.nextInt(5)) {
				avp.a(integer15, integer17, integer14, c);
			} else {
				atl atl18 = avp.a(integer15, integer17, integer14);
				if (atl18.a() == azs.a) {
					integer12 = -1;
				} else if (atl18.v() == alv.b) {
					if (integer12 == -1) {
						if (integer13 <= 0) {
							atl10 = b;
							atl11 = a;
						} else if (integer17 >= integer9 - 4 && integer17 <= integer9 + 1) {
							atl10 = this.r;
							atl11 = this.s;
						}

						if (integer17 < integer9 && (atl10 == null || atl10.a() == azs.a)) {
							if (this.a(a16.c(integer4, integer17, integer5)) < 0.15F) {
								atl10 = g;
							} else {
								atl10 = h;
							}
						}

						integer12 = integer13;
						if (integer17 >= integer9 - 1) {
							avp.a(integer15, integer17, integer14, atl10);
						} else if (integer17 < integer9 - 7 - integer13) {
							atl10 = b;
							atl11 = a;
							avp.a(integer15, integer17, integer14, d);
						} else {
							avp.a(integer15, integer17, integer14, atl11);
						}
					} else if (integer12 > 0) {
						integer12--;
						avp.a(integer15, integer17, integer14, atl11);
						if (integer12 == 0 && atl11.v() == alv.m && integer13 > 1) {
							integer12 = random.nextInt(4) + Math.max(0, integer17 - 63);
							atl11 = atl11.c(aqj.a) == aqj.a.RED_SAND ? e : f;
						}
					}
				}
			}
		}
	}

	public Class<? extends akf> g() {
		return this.getClass();
	}

	public akf.b h() {
		if ((double)this.n() < 0.2) {
			return akf.b.COLD;
		} else {
			return (double)this.n() < 1.0 ? akf.b.MEDIUM : akf.b.WARM;
		}
	}

	@Nullable
	public static akf b(int integer) {
		return a(integer, null);
	}

	public static akf a(int integer, akf akf) {
		akf akf3 = a(integer);
		return akf3 == null ? akf : akf3;
	}

	public boolean i() {
		return false;
	}

	public final float j() {
		return this.A;
	}

	public final float k() {
		return this.D;
	}

	public final String l() {
		return this.z;
	}

	public final float m() {
		return this.B;
	}

	public final float n() {
		return this.C;
	}

	public final int o() {
		return this.E;
	}

	public final boolean p() {
		return this.F;
	}

	public static void q() {
		a(0, "ocean", new aky(new akf.a("Ocean").c(-1.0F).d(0.1F)));
		a(1, "plains", new akz(false, new akf.a("Plains").c(0.125F).d(0.05F).a(0.8F).b(0.4F)));
		a(2, "desert", new akm(new akf.a("Desert").c(0.125F).d(0.05F).a(2.0F).b(0.0F).a()));
		a(3, "extreme_hills", new akn(akn.a.NORMAL, new akf.a("Extreme Hills").c(1.0F).d(0.5F).a(0.2F).b(0.3F)));
		a(4, "forest", new akp(akp.a.NORMAL, new akf.a("Forest").a(0.7F).b(0.8F)));
		a(5, "taiga", new ale(ale.a.NORMAL, new akf.a("Taiga").c(0.2F).d(0.2F).a(0.25F).b(0.8F)));
		a(6, "swampland", new ald(new akf.a("Swampland").c(-0.2F).d(0.1F).a(0.8F).b(0.9F).a(14745518)));
		a(7, "river", new ala(new akf.a("River").c(-0.5F).d(0.0F)));
		a(8, "hell", new akq(new akf.a("Hell").a(2.0F).b(0.0F).a()));
		a(9, "sky", new alf(new akf.a("The End").a()));
		a(10, "frozen_ocean", new aky(new akf.a("FrozenOcean").c(-1.0F).d(0.1F).a(0.0F).b(0.5F).b()));
		a(11, "frozen_river", new ala(new akf.a("FrozenRiver").c(-0.5F).d(0.0F).a(0.0F).b(0.5F).b()));
		a(12, "ice_flats", new aks(false, new akf.a("Ice Plains").c(0.125F).d(0.05F).a(0.0F).b(0.5F).b()));
		a(13, "ice_mountains", new aks(false, new akf.a("Ice Mountains").c(0.45F).d(0.3F).a(0.0F).b(0.5F).b()));
		a(14, "mushroom_island", new akv(new akf.a("MushroomIsland").c(0.2F).d(0.3F).a(0.9F).b(1.0F)));
		a(15, "mushroom_island_shore", new akv(new akf.a("MushroomIslandShore").c(0.0F).d(0.025F).a(0.9F).b(1.0F)));
		a(16, "beaches", new ake(new akf.a("Beach").c(0.0F).d(0.025F).a(0.8F).b(0.4F)));
		a(17, "desert_hills", new akm(new akf.a("DesertHills").c(0.45F).d(0.3F).a(2.0F).b(0.0F).a()));
		a(18, "forest_hills", new akp(akp.a.NORMAL, new akf.a("ForestHills").c(0.45F).d(0.3F).a(0.7F).b(0.8F)));
		a(19, "taiga_hills", new ale(ale.a.NORMAL, new akf.a("TaigaHills").a(0.25F).b(0.8F).c(0.45F).d(0.3F)));
		a(20, "smaller_extreme_hills", new akn(akn.a.EXTRA_TREES, new akf.a("Extreme Hills Edge").c(0.8F).d(0.3F).a(0.2F).b(0.3F)));
		a(21, "jungle", new akt(false, new akf.a("Jungle").a(0.95F).b(0.9F)));
		a(22, "jungle_hills", new akt(false, new akf.a("JungleHills").c(0.45F).d(0.3F).a(0.95F).b(0.9F)));
		a(23, "jungle_edge", new akt(true, new akf.a("JungleEdge").a(0.95F).b(0.8F)));
		a(24, "deep_ocean", new aky(new akf.a("Deep Ocean").c(-1.8F).d(0.1F)));
		a(25, "stone_beach", new alc(new akf.a("Stone Beach").c(0.1F).d(0.8F).a(0.2F).b(0.3F)));
		a(26, "cold_beach", new ake(new akf.a("Cold Beach").c(0.0F).d(0.025F).a(0.05F).b(0.3F).b()));
		a(27, "birch_forest", new akp(akp.a.BIRCH, new akf.a("Birch Forest").a(0.6F).b(0.6F)));
		a(28, "birch_forest_hills", new akp(akp.a.BIRCH, new akf.a("Birch Forest Hills").c(0.45F).d(0.3F).a(0.6F).b(0.6F)));
		a(29, "roofed_forest", new akp(akp.a.ROOFED, new akf.a("Roofed Forest").a(0.7F).b(0.8F)));
		a(30, "taiga_cold", new ale(ale.a.NORMAL, new akf.a("Cold Taiga").c(0.2F).d(0.2F).a(-0.5F).b(0.4F).b()));
		a(31, "taiga_cold_hills", new ale(ale.a.NORMAL, new akf.a("Cold Taiga Hills").c(0.45F).d(0.3F).a(-0.5F).b(0.4F).b()));
		a(32, "redwood_taiga", new ale(ale.a.MEGA, new akf.a("Mega Taiga").a(0.3F).b(0.8F).c(0.2F).d(0.2F)));
		a(33, "redwood_taiga_hills", new ale(ale.a.MEGA, new akf.a("Mega Taiga Hills").c(0.45F).d(0.3F).a(0.3F).b(0.8F)));
		a(34, "extreme_hills_with_trees", new akn(akn.a.EXTRA_TREES, new akf.a("Extreme Hills+").c(1.0F).d(0.5F).a(0.2F).b(0.3F)));
		a(35, "savanna", new alb(new akf.a("Savanna").c(0.125F).d(0.05F).a(1.2F).b(0.0F).a()));
		a(36, "savanna_rock", new alb(new akf.a("Savanna Plateau").c(1.5F).d(0.025F).a(1.0F).b(0.0F).a()));
		a(37, "mesa", new aku(false, false, new akf.a("Mesa").a(2.0F).b(0.0F).a()));
		a(38, "mesa_rock", new aku(false, true, new akf.a("Mesa Plateau F").c(1.5F).d(0.025F).a(2.0F).b(0.0F).a()));
		a(39, "mesa_clear_rock", new aku(false, false, new akf.a("Mesa Plateau").c(1.5F).d(0.025F).a(2.0F).b(0.0F).a()));
		a(127, "void", new alh(new akf.a("The Void").a()));
		a(129, "mutated_plains", new akz(true, new akf.a("Sunflower Plains").a("plains").c(0.125F).d(0.05F).a(0.8F).b(0.4F)));
		a(130, "mutated_desert", new akm(new akf.a("Desert M").a("desert").c(0.225F).d(0.25F).a(2.0F).b(0.0F).a()));
		a(131, "mutated_extreme_hills", new akn(akn.a.MUTATED, new akf.a("Extreme Hills M").a("extreme_hills").c(1.0F).d(0.5F).a(0.2F).b(0.3F)));
		a(132, "mutated_forest", new akp(akp.a.FLOWER, new akf.a("Flower Forest").a("forest").d(0.4F).a(0.7F).b(0.8F)));
		a(133, "mutated_taiga", new ale(ale.a.NORMAL, new akf.a("Taiga M").a("taiga").c(0.3F).d(0.4F).a(0.25F).b(0.8F)));
		a(134, "mutated_swampland", new ald(new akf.a("Swampland M").a("swampland").c(-0.1F).d(0.3F).a(0.8F).b(0.9F).a(14745518)));
		a(140, "mutated_ice_flats", new aks(true, new akf.a("Ice Plains Spikes").a("ice_flats").c(0.425F).d(0.45000002F).a(0.0F).b(0.5F).b()));
		a(149, "mutated_jungle", new akt(false, new akf.a("Jungle M").a("jungle").c(0.2F).d(0.4F).a(0.95F).b(0.9F)));
		a(151, "mutated_jungle_edge", new akt(true, new akf.a("JungleEdge M").a("jungle_edge").c(0.2F).d(0.4F).a(0.95F).b(0.8F)));
		a(155, "mutated_birch_forest", new akw(new akf.a("Birch Forest M").a("birch_forest").c(0.2F).d(0.4F).a(0.6F).b(0.6F)));
		a(156, "mutated_birch_forest_hills", new akw(new akf.a("Birch Forest Hills M").a("birch_forest_hills").c(0.55F).d(0.5F).a(0.6F).b(0.6F)));
		a(157, "mutated_roofed_forest", new akp(akp.a.ROOFED, new akf.a("Roofed Forest M").a("roofed_forest").c(0.2F).d(0.4F).a(0.7F).b(0.8F)));
		a(158, "mutated_taiga_cold", new ale(ale.a.NORMAL, new akf.a("Cold Taiga M").a("taiga_cold").c(0.3F).d(0.4F).a(-0.5F).b(0.4F).b()));
		a(160, "mutated_redwood_taiga", new ale(ale.a.MEGA_SPRUCE, new akf.a("Mega Spruce Taiga").a("redwood_taiga").c(0.2F).d(0.2F).a(0.25F).b(0.8F)));
		a(
			161, "mutated_redwood_taiga_hills", new ale(ale.a.MEGA_SPRUCE, new akf.a("Redwood Taiga Hills M").a("redwood_taiga_hills").c(0.2F).d(0.2F).a(0.25F).b(0.8F))
		);
		a(
			162, "mutated_extreme_hills_with_trees", new akn(akn.a.MUTATED, new akf.a("Extreme Hills+ M").a("extreme_hills_with_trees").c(1.0F).d(0.5F).a(0.2F).b(0.3F))
		);
		a(163, "mutated_savanna", new akx(new akf.a("Savanna M").a("savanna").c(0.3625F).d(1.225F).a(1.1F).b(0.0F).a()));
		a(164, "mutated_savanna_rock", new akx(new akf.a("Savanna Plateau M").a("savanna_rock").c(1.05F).d(1.2125001F).a(1.0F).b(0.0F).a()));
		a(165, "mutated_mesa", new aku(true, false, new akf.a("Mesa (Bryce)").a("mesa").a(2.0F).b(0.0F).a()));
		a(166, "mutated_mesa_rock", new aku(false, true, new akf.a("Mesa Plateau F M").a("mesa_rock").c(0.45F).d(0.3F).a(2.0F).b(0.0F).a()));
		a(167, "mutated_mesa_clear_rock", new aku(false, false, new akf.a("Mesa Plateau M").a("mesa_clear_rock").c(0.45F).d(0.3F).a(2.0F).b(0.0F).a()));
		Collections.addAll(
			i,
			new akf[]{
				akk.a,
				akk.c,
				akk.d,
				akk.e,
				akk.f,
				akk.g,
				akk.h,
				akk.i,
				akk.m,
				akk.n,
				akk.o,
				akk.p,
				akk.q,
				akk.r,
				akk.s,
				akk.t,
				akk.u,
				akk.w,
				akk.x,
				akk.y,
				akk.z,
				akk.A,
				akk.B,
				akk.C,
				akk.D,
				akk.E,
				akk.F,
				akk.G,
				akk.H,
				akk.I,
				akk.J,
				akk.K,
				akk.L,
				akk.M,
				akk.N,
				akk.O
			}
		);
	}

	private static void a(int integer, String string, akf akf) {
		q.a(integer, new kq(string), akf);
		if (akf.b()) {
			j.a(akf, a(q.c(new kq(akf.H))));
		}
	}

	public static class a {
		private final String a;
		private float b = 0.1F;
		private float c = 0.2F;
		private float d = 0.5F;
		private float e = 0.5F;
		private int f = 16777215;
		private boolean g;
		private boolean h = true;
		@Nullable
		private String i;

		public a(String string) {
			this.a = string;
		}

		protected akf.a a(float float1) {
			if (float1 > 0.1F && float1 < 0.2F) {
				throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
			} else {
				this.d = float1;
				return this;
			}
		}

		protected akf.a b(float float1) {
			this.e = float1;
			return this;
		}

		protected akf.a c(float float1) {
			this.b = float1;
			return this;
		}

		protected akf.a d(float float1) {
			this.c = float1;
			return this;
		}

		protected akf.a a() {
			this.h = false;
			return this;
		}

		protected akf.a b() {
			this.g = true;
			return this;
		}

		protected akf.a a(int integer) {
			this.f = integer;
			return this;
		}

		protected akf.a a(String string) {
			this.i = string;
			return this;
		}
	}

	public static enum b {
		OCEAN,
		COLD,
		MEDIUM,
		WARM;
	}

	public static class c extends pb.a {
		public Class<? extends sx> b;
		public int c;
		public int d;

		public c(Class<? extends sx> class1, int integer2, int integer3, int integer4) {
			super(integer2);
			this.b = class1;
			this.c = integer3;
			this.d = integer4;
		}

		public String toString() {
			return this.b.getSimpleName() + "*(" + this.c + "-" + this.d + "):" + this.a;
		}
	}
}
