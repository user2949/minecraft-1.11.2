import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;

public class afh {
	public static final dc<kq, afh> g = new dc<>();
	private static final Map<alu, afh> a = Maps.newHashMap();
	private static final afk b = new afk() {
		@Override
		public float a(afj afj, @Nullable ajs ajs, @Nullable sw sw) {
			return afj.h() ? 1.0F : 0.0F;
		}
	};
	private static final afk c = new afk() {
		@Override
		public float a(afj afj, @Nullable ajs ajs, @Nullable sw sw) {
			return ot.a((float)afj.i() / (float)afj.k(), 0.0F, 1.0F);
		}
	};
	private static final afk d = new afk() {
		@Override
		public float a(afj afj, @Nullable ajs ajs, @Nullable sw sw) {
			return sw != null && sw.cx() != sv.RIGHT ? 1.0F : 0.0F;
		}
	};
	private static final afk e = new afk() {
		@Override
		public float a(afj afj, @Nullable ajs ajs, @Nullable sw sw) {
			return sw instanceof aay ? ((aay)sw).di().a(afj.c(), 0.0F) : 0.0F;
		}
	};
	private final dh<kq, afk> f = new dj<>();
	protected static final UUID h = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
	protected static final UUID i = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
	private aej n;
	protected static Random j = new Random();
	protected int k = 64;
	private int o;
	protected boolean l;
	protected boolean m;
	private afh p;
	private String q;

	public static int a(afh afh) {
		return afh == null ? 0 : g.a(afh);
	}

	public static afh c(int integer) {
		return g.a(integer);
	}

	public static afh a(alu alu) {
		afh afh2 = (afh)a.get(alu);
		return afh2 == null ? afl.a : afh2;
	}

	@Nullable
	public static afh b(String string) {
		afh afh2 = g.c(new kq(string));
		if (afh2 == null) {
			try {
				return c(Integer.parseInt(string));
			} catch (NumberFormatException var3) {
			}
		}

		return afh2;
	}

	public afj i() {
		return new afj(this);
	}

	public final void a(kq kq, afk afk) {
		this.f.a(kq, afk);
	}

	@Nullable
	public afk a(kq kq) {
		return this.f.c(kq);
	}

	public boolean j() {
		return !this.f.c().isEmpty();
	}

	public boolean a(du du) {
		return false;
	}

	public afh() {
		this.a(new kq("lefthanded"), d);
		this.a(new kq("cooldown"), e);
	}

	public afh d(int integer) {
		this.k = integer;
		return this;
	}

	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		return rk.PASS;
	}

	public float a(afj afj, atl atl) {
		return 1.0F;
	}

	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		return new rl<>(rk.PASS, aay.b(ri));
	}

	public afj a(afj afj, ajs ajs, sw sw) {
		return afj;
	}

	public int k() {
		return this.k;
	}

	public int a(int integer) {
		return 0;
	}

	public boolean l() {
		return this.m;
	}

	protected afh a(boolean boolean1) {
		this.m = boolean1;
		return this;
	}

	public int m() {
		return this.o;
	}

	protected afh e(int integer) {
		this.o = integer;
		if (integer > 0) {
			this.a(new kq("damaged"), b);
			this.a(new kq("damage"), c);
		}

		return this;
	}

	public boolean n() {
		return this.o > 0 && (!this.m || this.k == 1);
	}

	public boolean a(afj afj, sw sw2, sw sw3) {
		return false;
	}

	public boolean a(afj afj, ajs ajs, atl atl, co co, sw sw) {
		return false;
	}

	public boolean a(atl atl) {
		return false;
	}

	public boolean a(afj afj, aay aay, sw sw, ri ri) {
		return false;
	}

	public afh o() {
		this.l = true;
		return this;
	}

	public boolean C_() {
		return this.l;
	}

	public boolean E_() {
		return false;
	}

	public afh c(String string) {
		this.q = string;
		return this;
	}

	public String j(afj afj) {
		return dp.a(this.a(afj));
	}

	public String a() {
		return "item." + this.q;
	}

	public String a(afj afj) {
		return "item." + this.q;
	}

	public afh b(afh afh) {
		this.p = afh;
		return this;
	}

	public boolean q() {
		return true;
	}

	@Nullable
	public afh r() {
		return this.p;
	}

	public boolean s() {
		return this.p != null;
	}

	public void a(afj afj, ajs ajs, sn sn, int integer, boolean boolean5) {
	}

	public void b(afj afj, ajs ajs, aay aay) {
	}

	public boolean f() {
		return false;
	}

	public agu f(afj afj) {
		return agu.NONE;
	}

	public int e(afj afj) {
		return 0;
	}

	public void a(afj afj, ajs ajs, sw sw, int integer) {
	}

	public void a(afj afj, aay aay, List<String> list, boolean boolean4) {
	}

	public String b(afj afj) {
		return dp.a(this.j(afj) + ".name").trim();
	}

	public boolean f_(afj afj) {
		return afj.x();
	}

	public afx g(afj afj) {
		return afj.x() ? afx.RARE : afx.COMMON;
	}

	public boolean g_(afj afj) {
		return this.k() == 1 && this.n();
	}

	protected bdu a(ajs ajs, aay aay, boolean boolean3) {
		float float5 = aay.w;
		float float6 = aay.v;
		double double7 = aay.p;
		double double9 = aay.q + (double)aay.bq();
		double double11 = aay.r;
		bdw bdw13 = new bdw(double7, double9, double11);
		float float14 = ot.b(-float6 * (float) (Math.PI / 180.0) - (float) Math.PI);
		float float15 = ot.a(-float6 * (float) (Math.PI / 180.0) - (float) Math.PI);
		float float16 = -ot.b(-float5 * (float) (Math.PI / 180.0));
		float float17 = ot.a(-float5 * (float) (Math.PI / 180.0));
		float float18 = float15 * float16;
		float float20 = float14 * float16;
		double double21 = 5.0;
		bdw bdw23 = bdw13.b((double)float18 * 5.0, (double)float17 * 5.0, (double)float20 * 5.0);
		return ajs.a(bdw13, bdw23, boolean3, !boolean3, false);
	}

	public int c() {
		return 0;
	}

	public void a(afh afh, aej aej, dd<afj> dd) {
		dd.add(new afj(afh));
	}

	@Nullable
	public aej b() {
		return this.n;
	}

	public afh a(aej aej) {
		this.n = aej;
		return this;
	}

	public boolean t() {
		return false;
	}

	public boolean a(afj afj1, afj afj2) {
		return false;
	}

	public Multimap<String, tl> a(ss ss) {
		return HashMultimap.create();
	}

	public static void u() {
		a(alv.a, new adn(alv.a));
		a(alv.b, new afs(alv.b, alv.b, new afs.a() {
			@Override
			public String a(afj afj) {
				return arc.a.a(afj.j()).d();
			}
		}).c("stone"));
		a(alv.c, new ags(alv.c, false));
		a(alv.d, new afs(alv.d, alv.d, new afs.a() {
			@Override
			public String a(afj afj) {
				return amv.a.a(afj.j()).c();
			}
		}).c("dirt"));
		b(alv.e);
		a(alv.f, new afs(alv.f, alv.f, new afs.a() {
			@Override
			public String a(afj afj) {
				return apn.a.a(afj.j()).d();
			}
		}).c("wood"));
		a(alv.g, new afs(alv.g, alv.g, new afs.a() {
			@Override
			public String a(afj afj) {
				return apn.a.a(afj.j()).d();
			}
		}).c("sapling"));
		b(alv.h);
		a(alv.m, new afs(alv.m, alv.m, new afs.a() {
			@Override
			public String a(afj afj) {
				return aqj.a.a(afj.j()).e();
			}
		}).c("sand"));
		b(alv.n);
		b(alv.o);
		b(alv.p);
		b(alv.q);
		a(alv.r, new afs(alv.r, alv.r, new afs.a() {
			@Override
			public String a(afj afj) {
				return apn.a.a(afj.j()).d();
			}
		}).c("log"));
		a(alv.s, new afs(alv.s, alv.s, new afs.a() {
			@Override
			public String a(afj afj) {
				return apn.a.a(afj.j() + 4).d();
			}
		}).c("log"));
		a(alv.t, new afn(alv.t).c("leaves"));
		a(alv.u, new afn(alv.u).c("leaves"));
		a(alv.v, new afs(alv.v, alv.v, new afs.a() {
			@Override
			public String a(afj afj) {
				return (afj.j() & 1) == 1 ? "wet" : "dry";
			}
		}).c("sponge"));
		b(alv.w);
		b(alv.x);
		b(alv.y);
		b(alv.z);
		a(alv.A, new afs(alv.A, alv.A, new afs.a() {
			@Override
			public String a(afj afj) {
				return aqk.a.a(afj.j()).c();
			}
		}).c("sandStone"));
		b(alv.B);
		b(alv.D);
		b(alv.E);
		a(alv.F, new afv(alv.F));
		b(alv.G);
		a(alv.H, new ags(alv.H, true).a(new String[]{"shrub", "grass", "fern"}));
		b(alv.I);
		a(alv.J, new afv(alv.J));
		a(alv.L, new aeo(alv.L).c("cloth"));
		a(alv.N, new afs(alv.N, alv.N, new afs.a() {
			@Override
			public String a(afj afj) {
				return ano.a.a(ano.b.YELLOW, afj.j()).d();
			}
		}).c("flower"));
		a(alv.O, new afs(alv.O, alv.O, new afs.a() {
			@Override
			public String a(afj afj) {
				return ano.a.a(ano.b.RED, afj.j()).d();
			}
		}).c("rose"));
		b(alv.P);
		b(alv.Q);
		b(alv.R);
		b(alv.S);
		a(alv.U, new agl(alv.U, alv.U, alv.T).c("stoneSlab"));
		b(alv.V);
		b(alv.W);
		b(alv.X);
		b(alv.Y);
		b(alv.Z);
		b(alv.aa);
		b(alv.cQ);
		b(alv.cR);
		b(alv.cS);
		b(alv.cT);
		b(alv.cU);
		b(alv.cV);
		a(alv.cX, new agl(alv.cX, alv.cX, alv.cW).c("purpurSlab"));
		b(alv.ac);
		b(alv.ad);
		b(alv.ae);
		b(alv.ag);
		b(alv.ah);
		b(alv.ai);
		b(alv.ak);
		b(alv.al);
		b(alv.au);
		b(alv.av);
		b(alv.aw);
		b(alv.ay);
		b(alv.az);
		b(alv.aB);
		b(alv.aC);
		b(alv.aF);
		b(alv.aG);
		a(alv.aH, new agm(alv.aH));
		b(alv.aI);
		b(alv.aJ);
		b(alv.aK);
		b(alv.aL);
		b(alv.aN);
		b(alv.aO);
		b(alv.aP);
		b(alv.aQ);
		b(alv.aR);
		b(alv.aS);
		b(alv.aT);
		b(alv.aU);
		b(alv.aV);
		b(alv.aW);
		b(alv.aX);
		b(alv.aZ);
		b(alv.bd);
		a(alv.be, new afs(alv.be, alv.be, new afs.a() {
			@Override
			public String a(afj afj) {
				return aow.a.a(afj.j()).c();
			}
		}).c("monsterStoneEgg"));
		a(alv.bf, new afs(alv.bf, alv.bf, new afs.a() {
			@Override
			public String a(afj afj) {
				return ard.a.a(afj.j()).c();
			}
		}).c("stonebricksmooth"));
		b(alv.bg);
		b(alv.bh);
		b(alv.bi);
		b(alv.bj);
		b(alv.bk);
		a(alv.bn, new ags(alv.bn, false));
		b(alv.bo);
		b(alv.bp);
		b(alv.bq);
		b(alv.br);
		b(alv.bs);
		b(alv.bt);
		b(alv.bu);
		b(alv.bv);
		b(alv.bw);
		a(alv.bx, new agv(alv.bx));
		b(alv.by);
		b(alv.bz);
		b(alv.bA);
		b(alv.bC);
		b(alv.bG);
		b(alv.bH);
		b(alv.cY);
		b(alv.bI);
		b(alv.bJ);
		a(alv.bM, new agl(alv.bM, alv.bM, alv.bL).c("woodSlab"));
		b(alv.bO);
		b(alv.bP);
		b(alv.bQ);
		b(alv.bR);
		b(alv.bT);
		b(alv.bU);
		b(alv.bV);
		b(alv.bW);
		b(alv.bX);
		b(alv.bY);
		a(alv.bZ, new afs(alv.bZ, alv.bZ, new afs.a() {
			@Override
			public String a(afj afj) {
				return arq.a.a(afj.j()).c();
			}
		}).c("cobbleWall"));
		b(alv.cd);
		a(alv.cf, new ado(alv.cf).c("anvil"));
		b(alv.cg);
		b(alv.ch);
		b(alv.ci);
		b(alv.cl);
		b(alv.cn);
		b(alv.co);
		b(alv.cp);
		a(alv.cq, new afs(alv.cq, alv.cq, new String[]{"default", "chiseled", "lines"}).c("quartzBlock"));
		b(alv.cr);
		b(alv.cs);
		b(alv.ct);
		a(alv.cu, new aeo(alv.cu).c("clayHardenedStained"));
		b(alv.cv);
		b(alv.cw);
		b(alv.cx);
		a(alv.cy, new aeo(alv.cy).c("woolCarpet"));
		b(alv.cz);
		b(alv.cA);
		b(alv.cB);
		b(alv.cC);
		b(alv.cD);
		b(alv.cE);
		b(alv.da);
		a(alv.cF, new afs(alv.cF, alv.cF, new afs.a() {
			@Override
			public String a(afj afj) {
				return amy.b.a(afj.j()).c();
			}
		}).c("doublePlant"));
		a(alv.cG, new aeo(alv.cG).c("stainedGlass"));
		a(alv.cH, new aeo(alv.cH).c("stainedGlassPane"));
		a(alv.cI, new afs(alv.cI, alv.cI, new afs.a() {
			@Override
			public String a(afj afj) {
				return apt.a.a(afj.j()).c();
			}
		}).c("prismarine"));
		b(alv.cJ);
		a(alv.cM, new afs(alv.cM, alv.cM, new afs.a() {
			@Override
			public String a(afj afj) {
				return apz.a.a(afj.j()).c();
			}
		}).c("redSandStone"));
		b(alv.cN);
		a(alv.cP, new agl(alv.cP, alv.cP, alv.cO).c("stoneSlab2"));
		b(alv.dc);
		b(alv.dd);
		b(alv.df);
		b(alv.dg);
		b(alv.dh);
		b(alv.di);
		b(alv.dj);
		b(alv.dk);
		a(alv.dl, new agh(alv.dl));
		a(alv.dm, new agh(alv.dm));
		a(alv.dn, new agh(alv.dn));
		a(alv.do, new agh(alv.do));
		a(alv.dp, new agh(alv.dp));
		a(alv.dq, new agh(alv.dq));
		a(alv.dr, new agh(alv.dr));
		a(alv.ds, new agh(alv.ds));
		a(alv.dt, new agh(alv.dt));
		a(alv.du, new agh(alv.du));
		a(alv.dv, new agh(alv.dv));
		a(alv.dw, new agh(alv.dw));
		a(alv.dx, new agh(alv.dx));
		a(alv.dy, new agh(alv.dy));
		a(alv.dz, new agh(alv.dz));
		a(alv.dA, new agh(alv.dA));
		b(alv.dB);
		a(256, "iron_shovel", new agg(afh.a.IRON).c("shovelIron"));
		a(257, "iron_pickaxe", new afu(afh.a.IRON).c("pickaxeIron"));
		a(258, "iron_axe", new ads(afh.a.IRON).c("hatchetIron"));
		a(259, "flint_and_steel", new afc().c("flintAndSteel"));
		a(260, "apple", new afd(4, 0.3F, false).c("apple"));
		a(261, "bow", new aea().c("bow"));
		a(262, "arrow", new adr().c("arrow"));
		a(263, "coal", new aeg().c("coal"));
		a(264, "diamond", new afh().c("diamond").a(aej.l));
		a(265, "iron_ingot", new afh().c("ingotIron").a(aej.l));
		a(266, "gold_ingot", new afh().c("ingotGold").a(aej.l));
		a(267, "iron_sword", new agr(afh.a.IRON).c("swordIron"));
		a(268, "wooden_sword", new agr(afh.a.WOOD).c("swordWood"));
		a(269, "wooden_shovel", new agg(afh.a.WOOD).c("shovelWood"));
		a(270, "wooden_pickaxe", new afu(afh.a.WOOD).c("pickaxeWood"));
		a(271, "wooden_axe", new ads(afh.a.WOOD).c("hatchetWood"));
		a(272, "stone_sword", new agr(afh.a.STONE).c("swordStone"));
		a(273, "stone_shovel", new agg(afh.a.STONE).c("shovelStone"));
		a(274, "stone_pickaxe", new afu(afh.a.STONE).c("pickaxeStone"));
		a(275, "stone_axe", new ads(afh.a.STONE).c("hatchetStone"));
		a(276, "diamond_sword", new agr(afh.a.DIAMOND).c("swordDiamond"));
		a(277, "diamond_shovel", new agg(afh.a.DIAMOND).c("shovelDiamond"));
		a(278, "diamond_pickaxe", new afu(afh.a.DIAMOND).c("pickaxeDiamond"));
		a(279, "diamond_axe", new ads(afh.a.DIAMOND).c("hatchetDiamond"));
		a(280, "stick", new afh().o().c("stick").a(aej.l));
		a(281, "bowl", new afh().c("bowl").a(aej.l));
		a(282, "mushroom_stew", new aeb(6).c("mushroomStew"));
		a(283, "golden_sword", new agr(afh.a.GOLD).c("swordGold"));
		a(284, "golden_shovel", new agg(afh.a.GOLD).c("shovelGold"));
		a(285, "golden_pickaxe", new afu(afh.a.GOLD).c("pickaxeGold"));
		a(286, "golden_axe", new ads(afh.a.GOLD).c("hatchetGold"));
		a(287, "string", new adw(alv.bS).c("string").a(aej.l));
		a(288, "feather", new afh().c("feather").a(aej.l));
		a(289, "gunpowder", new afh().c("sulphur").a(aej.l));
		a(290, "wooden_hoe", new afg(afh.a.WOOD).c("hoeWood"));
		a(291, "stone_hoe", new afg(afh.a.STONE).c("hoeStone"));
		a(292, "iron_hoe", new afg(afh.a.IRON).c("hoeIron"));
		a(293, "diamond_hoe", new afg(afh.a.DIAMOND).c("hoeDiamond"));
		a(294, "golden_hoe", new afg(afh.a.GOLD).c("hoeGold"));
		a(295, "wheat_seeds", new agc(alv.aj, alv.ak).c("seeds"));
		a(296, "wheat", new afh().c("wheat").a(aej.l));
		a(297, "bread", new afd(5, 0.6F, false).c("bread"));
		a(298, "leather_helmet", new adp(adp.a.LEATHER, 0, ss.HEAD).c("helmetCloth"));
		a(299, "leather_chestplate", new adp(adp.a.LEATHER, 0, ss.CHEST).c("chestplateCloth"));
		a(300, "leather_leggings", new adp(adp.a.LEATHER, 0, ss.LEGS).c("leggingsCloth"));
		a(301, "leather_boots", new adp(adp.a.LEATHER, 0, ss.FEET).c("bootsCloth"));
		a(302, "chainmail_helmet", new adp(adp.a.CHAIN, 1, ss.HEAD).c("helmetChain"));
		a(303, "chainmail_chestplate", new adp(adp.a.CHAIN, 1, ss.CHEST).c("chestplateChain"));
		a(304, "chainmail_leggings", new adp(adp.a.CHAIN, 1, ss.LEGS).c("leggingsChain"));
		a(305, "chainmail_boots", new adp(adp.a.CHAIN, 1, ss.FEET).c("bootsChain"));
		a(306, "iron_helmet", new adp(adp.a.IRON, 2, ss.HEAD).c("helmetIron"));
		a(307, "iron_chestplate", new adp(adp.a.IRON, 2, ss.CHEST).c("chestplateIron"));
		a(308, "iron_leggings", new adp(adp.a.IRON, 2, ss.LEGS).c("leggingsIron"));
		a(309, "iron_boots", new adp(adp.a.IRON, 2, ss.FEET).c("bootsIron"));
		a(310, "diamond_helmet", new adp(adp.a.DIAMOND, 3, ss.HEAD).c("helmetDiamond"));
		a(311, "diamond_chestplate", new adp(adp.a.DIAMOND, 3, ss.CHEST).c("chestplateDiamond"));
		a(312, "diamond_leggings", new adp(adp.a.DIAMOND, 3, ss.LEGS).c("leggingsDiamond"));
		a(313, "diamond_boots", new adp(adp.a.DIAMOND, 3, ss.FEET).c("bootsDiamond"));
		a(314, "golden_helmet", new adp(adp.a.GOLD, 4, ss.HEAD).c("helmetGold"));
		a(315, "golden_chestplate", new adp(adp.a.GOLD, 4, ss.CHEST).c("chestplateGold"));
		a(316, "golden_leggings", new adp(adp.a.GOLD, 4, ss.LEGS).c("leggingsGold"));
		a(317, "golden_boots", new adp(adp.a.GOLD, 4, ss.FEET).c("bootsGold"));
		a(318, "flint", new afh().c("flint").a(aej.l));
		a(319, "porkchop", new afd(3, 0.3F, true).c("porkchopRaw"));
		a(320, "cooked_porkchop", new afd(8, 0.8F, true).c("porkchopCooked"));
		a(321, "painting", new aff(zb.class).c("painting"));
		a(322, "golden_apple", new afe(4, 1.2F, false).h().c("appleGold"));
		a(323, "sign", new agi().c("sign"));
		a(324, "wooden_door", new ael(alv.ao).c("doorOak"));
		afh afh1 = new aec(alv.a).c("bucket").d(16);
		a(325, "bucket", afh1);
		a(326, "water_bucket", new aec(alv.i).c("bucketWater").b(afh1));
		a(327, "lava_bucket", new aec(alv.k).c("bucketLava").b(afh1));
		a(328, "minecart", new afr(aby.a.RIDEABLE).c("minecart"));
		a(329, "saddle", new aga().c("saddle"));
		a(330, "iron_door", new ael(alv.aA).c("doorIron"));
		a(331, "redstone", new afz().c("redstone"));
		a(332, "snowball", new agn().c("snowball"));
		a(333, "boat", new adx(abx.b.OAK));
		a(334, "leather", new afh().c("leather").a(aej.l));
		a(335, "milk_bucket", new afq().c("milk").b(afh1));
		a(336, "brick", new afh().c("brick").a(aej.l));
		a(337, "clay_ball", new afh().c("clay").a(aej.l));
		a(338, "reeds", new adw(alv.aM).c("reeds").a(aej.l));
		a(339, "paper", new afh().c("paper").a(aej.f));
		a(340, "book", new ady().c("book").a(aej.f));
		a(341, "slime_ball", new afh().c("slimeball").a(aej.f));
		a(342, "chest_minecart", new afr(aby.a.CHEST).c("minecartChest"));
		a(343, "furnace_minecart", new afr(aby.a.FURNACE).c("minecartFurnace"));
		a(344, "egg", new aep().c("egg"));
		a(345, "compass", new aeh().c("compass").a(aej.i));
		a(346, "fishing_rod", new afb().c("fishingRod"));
		a(347, "clock", new aef().c("clock").a(aej.i));
		a(348, "glowstone_dust", new afh().c("yellowDust").a(aej.l));
		a(349, "fish", new afa(false).c("fish").a(true));
		a(350, "cooked_fish", new afa(true).c("fish").a(true));
		a(351, "dye", new aen().c("dyePowder"));
		a(352, "bone", new afh().c("bone").o().a(aej.f));
		a(353, "sugar", new afh().c("sugar").a(aej.l));
		a(354, "cake", new adw(alv.ba).d(1).c("cake").a(aej.h));
		a(355, "bed", new adu().d(1).c("bed"));
		a(356, "repeater", new adw(alv.bb).c("diode").a(aej.d));
		a(357, "cookie", new afd(2, 0.1F, false).c("cookie"));
		a(358, "filled_map", new afp().c("map"));
		a(359, "shears", new age().c("shears"));
		a(360, "melon", new afd(2, 0.3F, false).c("melon"));
		a(361, "pumpkin_seeds", new agc(alv.bl, alv.ak).c("seeds_pumpkin"));
		a(362, "melon_seeds", new agc(alv.bm, alv.ak).c("seeds_melon"));
		a(363, "beef", new afd(3, 0.3F, true).c("beefRaw"));
		a(364, "cooked_beef", new afd(8, 0.8F, true).c("beefCooked"));
		a(365, "chicken", new afd(2, 0.3F, true).a(new sh(si.q, 600, 0), 0.3F).c("chickenRaw"));
		a(366, "cooked_chicken", new afd(6, 0.6F, true).c("chickenCooked"));
		a(367, "rotten_flesh", new afd(4, 0.1F, true).a(new sh(si.q, 600, 0), 0.8F).c("rottenFlesh"));
		a(368, "ender_pearl", new aev().c("enderPearl"));
		a(369, "blaze_rod", new afh().c("blazeRod").a(aej.l).o());
		a(370, "ghast_tear", new afh().c("ghastTear").a(aej.k));
		a(371, "gold_nugget", new afh().c("goldNugget").a(aej.l));
		a(372, "nether_wart", new agc(alv.bB, alv.aW).c("netherStalkSeeds"));
		a(373, "potion", new afw().c("potion"));
		afh afh2 = new adz().c("glassBottle");
		a(374, "glass_bottle", afh2);
		a(375, "spider_eye", new afd(2, 0.8F, false).a(new sh(si.s, 100, 0), 1.0F).c("spiderEye"));
		a(376, "fermented_spider_eye", new afh().c("fermentedSpiderEye").a(aej.k));
		a(377, "blaze_powder", new afh().c("blazePowder").a(aej.k));
		a(378, "magma_cream", new afh().c("magmaCream").a(aej.k));
		a(379, "brewing_stand", new adw(alv.bD).c("brewingStand").a(aej.k));
		a(380, "cauldron", new adw(alv.bE).c("cauldron").a(aej.k));
		a(381, "ender_eye", new aeu().c("eyeOfEnder"));
		a(382, "speckled_melon", new afh().c("speckledMelon").a(aej.k));
		a(383, "spawn_egg", new ago().c("monsterPlacer"));
		a(384, "experience_bottle", new aew().c("expBottle"));
		a(385, "fire_charge", new aex().c("fireball"));
		a(386, "writable_book", new agw().c("writingBook").a(aej.f));
		a(387, "written_book", new agx().c("writtenBook").d(16));
		a(388, "emerald", new afh().c("emerald").a(aej.l));
		a(389, "item_frame", new aff(yz.class).c("frame"));
		a(390, "flower_pot", new adw(alv.ca).c("flowerPot").a(aej.c));
		a(391, "carrot", new agb(3, 0.6F, alv.cb, alv.ak).c("carrots"));
		a(392, "potato", new agb(1, 0.3F, alv.cc, alv.ak).c("potato"));
		a(393, "baked_potato", new afd(5, 0.6F, false).c("potatoBaked"));
		a(394, "poisonous_potato", new afd(2, 0.3F, false).a(new sh(si.s, 100, 0), 0.6F).c("potatoPoisonous"));
		a(395, "map", new aer().c("emptyMap"));
		a(396, "golden_carrot", new afd(6, 1.2F, false).c("carrotGolden").a(aej.k));
		a(397, "skull", new agk().c("skull"));
		a(398, "carrot_on_a_stick", new aed().c("carrotOnAStick"));
		a(399, "nether_star", new agj().c("netherStar").a(aej.l));
		a(400, "pumpkin_pie", new afd(8, 0.3F, false).c("pumpkinPie").a(aej.h));
		a(401, "fireworks", new aez().c("fireworks"));
		a(402, "firework_charge", new aey().c("fireworksCharge").a(aej.f));
		a(403, "enchanted_book", new aes().d(1).c("enchantedBook"));
		a(404, "comparator", new adw(alv.cj).c("comparator").a(aej.d));
		a(405, "netherbrick", new afh().c("netherbrick").a(aej.l));
		a(406, "quartz", new afh().c("netherquartz").a(aej.l));
		a(407, "tnt_minecart", new afr(aby.a.TNT).c("minecartTnt"));
		a(408, "hopper_minecart", new afr(aby.a.HOPPER).c("minecartHopper"));
		a(409, "prismarine_shard", new afh().c("prismarineShard").a(aej.l));
		a(410, "prismarine_crystals", new afh().c("prismarineCrystals").a(aej.l));
		a(411, "rabbit", new afd(3, 0.3F, true).c("rabbitRaw"));
		a(412, "cooked_rabbit", new afd(5, 0.6F, true).c("rabbitCooked"));
		a(413, "rabbit_stew", new aeb(10).c("rabbitStew"));
		a(414, "rabbit_foot", new afh().c("rabbitFoot").a(aej.k));
		a(415, "rabbit_hide", new afh().c("rabbitHide").a(aej.l));
		a(416, "armor_stand", new adq().c("armorStand").d(16));
		a(417, "iron_horse_armor", new afh().c("horsearmormetal").d(1).a(aej.f));
		a(418, "golden_horse_armor", new afh().c("horsearmorgold").d(1).a(aej.f));
		a(419, "diamond_horse_armor", new afh().c("horsearmordiamond").d(1).a(aej.f));
		a(420, "lead", new afm().c("leash"));
		a(421, "name_tag", new aft().c("nameTag"));
		a(422, "command_block_minecart", new afr(aby.a.COMMAND_BLOCK).c("minecartCommandBlock").a(null));
		a(423, "mutton", new afd(2, 0.3F, true).c("muttonRaw"));
		a(424, "cooked_mutton", new afd(6, 0.8F, true).c("muttonCooked"));
		a(425, "banner", new adt().c("banner"));
		a(426, "end_crystal", new aet());
		a(427, "spruce_door", new ael(alv.ap).c("doorSpruce"));
		a(428, "birch_door", new ael(alv.aq).c("doorBirch"));
		a(429, "jungle_door", new ael(alv.ar).c("doorJungle"));
		a(430, "acacia_door", new ael(alv.as).c("doorAcacia"));
		a(431, "dark_oak_door", new ael(alv.at).c("doorDarkOak"));
		a(432, "chorus_fruit", new aee(4, 0.3F).h().c("chorusFruit").a(aej.l));
		a(433, "chorus_fruit_popped", new afh().c("chorusFruitPopped").a(aej.l));
		a(434, "beetroot", new afd(1, 0.6F, false).c("beetroot"));
		a(435, "beetroot_seeds", new agc(alv.cZ, alv.ak).c("beetroot_seeds"));
		a(436, "beetroot_soup", new aeb(6).c("beetroot_soup"));
		a(437, "dragon_breath", new afh().a(aej.k).c("dragon_breath").b(afh2));
		a(438, "splash_potion", new agq().c("splash_potion"));
		a(439, "spectral_arrow", new agp().c("spectral_arrow"));
		a(440, "tipped_arrow", new agt().c("tipped_arrow"));
		a(441, "lingering_potion", new afo().c("lingering_potion"));
		a(442, "shield", new agf().c("shield"));
		a(443, "elytra", new aeq().c("elytra"));
		a(444, "spruce_boat", new adx(abx.b.SPRUCE));
		a(445, "birch_boat", new adx(abx.b.BIRCH));
		a(446, "jungle_boat", new adx(abx.b.JUNGLE));
		a(447, "acacia_boat", new adx(abx.b.ACACIA));
		a(448, "dark_oak_boat", new adx(abx.b.DARK_OAK));
		a(449, "totem_of_undying", new afh().c("totem").d(1).a(aej.j));
		a(450, "shulker_shell", new afh().c("shulkerShell").a(aej.l));
		a(452, "iron_nugget", new afh().c("ironNugget").a(aej.l));
		a(2256, "record_13", new afy("13", nn.fa).c("record"));
		a(2257, "record_cat", new afy("cat", nn.fc).c("record"));
		a(2258, "record_blocks", new afy("blocks", nn.fb).c("record"));
		a(2259, "record_chirp", new afy("chirp", nn.fd).c("record"));
		a(2260, "record_far", new afy("far", nn.fe).c("record"));
		a(2261, "record_mall", new afy("mall", nn.ff).c("record"));
		a(2262, "record_mellohi", new afy("mellohi", nn.fg).c("record"));
		a(2263, "record_stal", new afy("stal", nn.fh).c("record"));
		a(2264, "record_strad", new afy("strad", nn.fi).c("record"));
		a(2265, "record_ward", new afy("ward", nn.fk).c("record"));
		a(2266, "record_11", new afy("11", nn.eZ).c("record"));
		a(2267, "record_wait", new afy("wait", nn.fj).c("record"));
	}

	private static void b(alu alu) {
		a(alu, new adv(alu));
	}

	protected static void a(alu alu, afh afh) {
		a(alu.a(alu), alu.h.b(alu), afh);
		a.put(alu, afh);
	}

	private static void a(int integer, String string, afh afh) {
		a(integer, new kq(string), afh);
	}

	private static void a(int integer, kq kq, afh afh) {
		g.a(integer, kq, afh);
	}

	public static enum a {
		WOOD(0, 59, 2.0F, 0.0F, 15),
		STONE(1, 131, 4.0F, 1.0F, 5),
		IRON(2, 250, 6.0F, 2.0F, 14),
		DIAMOND(3, 1561, 8.0F, 3.0F, 10),
		GOLD(0, 32, 12.0F, 0.0F, 22);

		private final int f;
		private final int g;
		private final float h;
		private final float i;
		private final int j;

		private a(int integer3, int integer4, float float5, float float6, int integer7) {
			this.f = integer3;
			this.g = integer4;
			this.h = float5;
			this.i = float6;
			this.j = integer7;
		}

		public int a() {
			return this.g;
		}

		public float b() {
			return this.h;
		}

		public float c() {
			return this.i;
		}

		public int d() {
			return this.f;
		}

		public int e() {
			return this.j;
		}

		public afh f() {
			if (this == WOOD) {
				return afh.a(alv.f);
			} else if (this == STONE) {
				return afh.a(alv.e);
			} else if (this == GOLD) {
				return afl.n;
			} else if (this == IRON) {
				return afl.m;
			} else {
				return this == DIAMOND ? afl.l : null;
			}
		}
	}
}
