import java.util.List;
import javax.annotation.Nullable;

public class bvh implements bzz {
	private static final kq b = new kq("textures/misc/enchanted_item_glint.png");
	private boolean c = true;
	public float a;
	private final bqj d;
	private final bza e;
	private final bfe f;

	public bvh(bza bza, cbl cbl, bfe bfe) {
		this.e = bza;
		this.d = new bqj(cbl);
		this.b();
		this.f = bfe;
	}

	public void a(boolean boolean1) {
		this.c = boolean1;
	}

	public bqj a() {
		return this.d;
	}

	protected void a(afh afh, int integer, String string) {
		this.d.a(afh, integer, new cbm(string, "inventory"));
	}

	protected void a(alu alu, int integer, String string) {
		this.a(afh.a(alu), integer, string);
	}

	private void a(alu alu, String string) {
		this.a(alu, 0, string);
	}

	private void a(afh afh, String string) {
		this.a(afh, 0, string);
	}

	private void a(cbh cbh, afj afj) {
		this.a(cbh, -1, afj);
	}

	private void a(cbh cbh, int integer) {
		this.a(cbh, integer, afj.a);
	}

	private void a(cbh cbh, int integer, afj afj) {
		bqs bqs5 = bqs.a();
		bpy bpy6 = bqs5.c();
		bpy6.a(7, bzh.b);

		for (cv cv10 : cv.values()) {
			this.a(bpy6, cbh.a(null, cv10, 0L), integer, afj);
		}

		this.a(bpy6, cbh.a(null, null, 0L), integer, afj);
		bqs5.b();
	}

	public void a(afj afj, cbh cbh) {
		if (!afj.b()) {
			bqg.G();
			bqg.c(-0.5F, -0.5F, -0.5F);
			if (cbh.c()) {
				bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
				bqg.D();
				bqc.a.a(afj);
			} else {
				this.a(cbh, afj);
				if (afj.u()) {
					this.a(cbh);
				}
			}

			bqg.H();
		}
	}

	private void a(cbh cbh) {
		bqg.a(false);
		bqg.c(514);
		bqg.g();
		bqg.a(bqg.r.SRC_COLOR, bqg.l.ONE);
		this.e.a(b);
		bqg.n(5890);
		bqg.G();
		bqg.b(8.0F, 8.0F, 8.0F);
		float float3 = (float)(bes.I() % 3000L) / 3000.0F / 8.0F;
		bqg.c(float3, 0.0F, 0.0F);
		bqg.b(-50.0F, 0.0F, 0.0F, 1.0F);
		this.a(cbh, -8372020);
		bqg.H();
		bqg.G();
		bqg.b(8.0F, 8.0F, 8.0F);
		float float4 = (float)(bes.I() % 4873L) / 4873.0F / 8.0F;
		bqg.c(-float4, 0.0F, 0.0F);
		bqg.b(10.0F, 0.0F, 0.0F, 1.0F);
		this.a(cbh, -8372020);
		bqg.H();
		bqg.n(5888);
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA);
		bqg.f();
		bqg.c(515);
		bqg.a(true);
		this.e.a(byy.g);
	}

	private void a(bpy bpy, brd brd) {
		dl dl4 = brd.e().n();
		bpy.b((float)dl4.p(), (float)dl4.q(), (float)dl4.r());
	}

	private void a(bpy bpy, brd brd, int integer) {
		bpy.a(brd.b());
		bpy.a(integer);
		this.a(bpy, brd);
	}

	private void a(bpy bpy, List<brd> list, int integer, afj afj) {
		boolean boolean6 = integer == -1 && !afj.b();
		int integer7 = 0;

		for (int integer8 = list.size(); integer7 < integer8; integer7++) {
			brd brd9 = (brd)list.get(integer7);
			int integer10 = integer;
			if (boolean6 && brd9.c()) {
				integer10 = this.f.a(afj, brd9.d());
				if (bqe.a) {
					integer10 = bzc.c(integer10);
				}

				integer10 |= -16777216;
			}

			this.a(bpy, brd9, integer10);
		}
	}

	public boolean a(afj afj) {
		cbh cbh3 = this.d.a(afj);
		return cbh3 == null ? false : cbh3.b();
	}

	public void a(afj afj, brq.b b) {
		if (!afj.b()) {
			cbh cbh4 = this.a(afj, null, null);
			this.a(afj, cbh4, b, false);
		}
	}

	public cbh a(afj afj, @Nullable ajs ajs, @Nullable sw sw) {
		cbh cbh5 = this.d.a(afj);
		afh afh6 = afj.c();
		if (afh6 != null && afh6.j()) {
			kq kq7 = cbh5.f().a(afj, ajs, sw);
			return kq7 == null ? cbh5 : this.d.a().a(new cbm(kq7, "inventory"));
		} else {
			return cbh5;
		}
	}

	public void a(afj afj, sw sw, brq.b b, boolean boolean4) {
		if (!afj.b() && sw != null) {
			cbh cbh6 = this.a(afj, sw.l, sw);
			this.a(afj, cbh6, b, boolean4);
		}
	}

	protected void a(afj afj, cbh cbh, brq.b b, boolean boolean4) {
		if (!afj.b()) {
			this.e.a(byy.g);
			this.e.b(byy.g).b(false, false);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			bqg.D();
			bqg.a(516, 0.1F);
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
			bqg.G();
			brq brq6 = cbh.e();
			brq.a(brq6.b(b), boolean4);
			if (this.a(brq6.b(b))) {
				bqg.a(bqg.i.FRONT);
			}

			this.a(afj, cbh);
			bqg.a(bqg.i.BACK);
			bqg.H();
			bqg.E();
			bqg.l();
			this.e.a(byy.g);
			this.e.b(byy.g).a();
		}
	}

	private boolean a(brp brp) {
		return brp.d.x < 0.0F ^ brp.d.y < 0.0F ^ brp.d.z < 0.0F;
	}

	public void a(afj afj, int integer2, int integer3) {
		this.a(afj, integer2, integer3, this.a(afj, null, null));
	}

	protected void a(afj afj, int integer2, int integer3, cbh cbh) {
		bqg.G();
		this.e.a(byy.g);
		this.e.b(byy.g).b(false, false);
		bqg.D();
		bqg.e();
		bqg.a(516, 0.1F);
		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.a(integer2, integer3, cbh.b());
		cbh.e().a(brq.b.GUI);
		this.a(afj, cbh);
		bqg.d();
		bqg.E();
		bqg.g();
		bqg.H();
		this.e.a(byy.g);
		this.e.b(byy.g).a();
	}

	private void a(int integer1, int integer2, boolean boolean3) {
		bqg.c((float)integer1, (float)integer2, 100.0F + this.a);
		bqg.c(8.0F, 8.0F, 0.0F);
		bqg.b(1.0F, -1.0F, 1.0F);
		bqg.b(16.0F, 16.0F, 16.0F);
		if (boolean3) {
			bqg.f();
		} else {
			bqg.g();
		}
	}

	public void b(afj afj, int integer2, int integer3) {
		this.a(bes.z().h, afj, integer2, integer3);
	}

	public void a(@Nullable sw sw, afj afj, int integer3, int integer4) {
		if (!afj.b()) {
			this.a += 50.0F;

			try {
				this.a(afj, integer3, integer4, this.a(afj, null, sw));
			} catch (Throwable var8) {
				b b7 = b.a(var8, "Rendering item");
				c c8 = b7.a("Item being rendered");
				c8.a("Item Type", new d<String>() {
					public String call() throws Exception {
						return String.valueOf(afj.c());
					}
				});
				c8.a("Item Aux", new d<String>() {
					public String call() throws Exception {
						return String.valueOf(afj.j());
					}
				});
				c8.a("Item NBT", new d<String>() {
					public String call() throws Exception {
						return String.valueOf(afj.p());
					}
				});
				c8.a("Item Foil", new d<String>() {
					public String call() throws Exception {
						return String.valueOf(afj.u());
					}
				});
				throw new f(b7);
			}

			this.a -= 50.0F;
		}
	}

	public void a(bfg bfg, afj afj, int integer3, int integer4) {
		this.a(bfg, afj, integer3, integer4, null);
	}

	public void a(bfg bfg, afj afj, int integer3, int integer4, @Nullable String string) {
		if (!afj.b()) {
			if (afj.E() != 1 || string != null) {
				String string7 = string == null ? String.valueOf(afj.E()) : string;
				bqg.g();
				bqg.j();
				bqg.l();
				bfg.a(string7, (float)(integer3 + 19 - 2 - bfg.a(string7)), (float)(integer4 + 6 + 3), 16777215);
				bqg.f();
				bqg.k();
			}

			if (afj.h()) {
				bqg.g();
				bqg.j();
				bqg.z();
				bqg.d();
				bqg.l();
				bqs bqs7 = bqs.a();
				bpy bpy8 = bqs7.c();
				float float9 = (float)afj.i();
				float float10 = (float)afj.k();
				float float11 = Math.max(0.0F, (float10 - float9) / float10);
				int integer12 = Math.round(13.0F - float9 * 13.0F / float10);
				int integer13 = ot.c(float11 / 3.0F, 1.0F, 1.0F);
				this.a(bpy8, integer3 + 2, integer4 + 13, 13, 2, 0, 0, 0, 255);
				this.a(bpy8, integer3 + 2, integer4 + 13, integer12, 1, integer13 >> 16 & 0xFF, integer13 >> 8 & 0xFF, integer13 & 0xFF, 255);
				bqg.m();
				bqg.e();
				bqg.y();
				bqg.f();
				bqg.k();
			}

			bps bps7 = bes.z().h;
			float float8 = bps7 == null ? 0.0F : bps7.di().a(afj.c(), bes.z().aj());
			if (float8 > 0.0F) {
				bqg.g();
				bqg.j();
				bqg.z();
				bqs bqs9 = bqs.a();
				bpy bpy10 = bqs9.c();
				this.a(bpy10, integer3, integer4 + ot.d(16.0F * (1.0F - float8)), 16, ot.f(16.0F * float8), 255, 255, 255, 127);
				bqg.y();
				bqg.f();
				bqg.k();
			}
		}
	}

	private void a(bpy bpy, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7, int integer8, int integer9) {
		bpy.a(7, bzh.f);
		bpy.b((double)(integer2 + 0), (double)(integer3 + 0), 0.0).b(integer6, integer7, integer8, integer9).d();
		bpy.b((double)(integer2 + 0), (double)(integer3 + integer5), 0.0).b(integer6, integer7, integer8, integer9).d();
		bpy.b((double)(integer2 + integer4), (double)(integer3 + integer5), 0.0).b(integer6, integer7, integer8, integer9).d();
		bpy.b((double)(integer2 + integer4), (double)(integer3 + 0), 0.0).b(integer6, integer7, integer8, integer9).d();
		bqs.a().b();
	}

	private void b() {
		this.a(alv.cf, "anvil_intact");
		this.a(alv.cf, 1, "anvil_slightly_damaged");
		this.a(alv.cf, 2, "anvil_very_damaged");
		this.a(alv.cy, aem.BLACK.a(), "black_carpet");
		this.a(alv.cy, aem.BLUE.a(), "blue_carpet");
		this.a(alv.cy, aem.BROWN.a(), "brown_carpet");
		this.a(alv.cy, aem.CYAN.a(), "cyan_carpet");
		this.a(alv.cy, aem.GRAY.a(), "gray_carpet");
		this.a(alv.cy, aem.GREEN.a(), "green_carpet");
		this.a(alv.cy, aem.LIGHT_BLUE.a(), "light_blue_carpet");
		this.a(alv.cy, aem.LIME.a(), "lime_carpet");
		this.a(alv.cy, aem.MAGENTA.a(), "magenta_carpet");
		this.a(alv.cy, aem.ORANGE.a(), "orange_carpet");
		this.a(alv.cy, aem.PINK.a(), "pink_carpet");
		this.a(alv.cy, aem.PURPLE.a(), "purple_carpet");
		this.a(alv.cy, aem.RED.a(), "red_carpet");
		this.a(alv.cy, aem.SILVER.a(), "silver_carpet");
		this.a(alv.cy, aem.WHITE.a(), "white_carpet");
		this.a(alv.cy, aem.YELLOW.a(), "yellow_carpet");
		this.a(alv.bZ, arq.a.MOSSY.a(), "mossy_cobblestone_wall");
		this.a(alv.bZ, arq.a.NORMAL.a(), "cobblestone_wall");
		this.a(alv.d, amv.a.COARSE_DIRT.a(), "coarse_dirt");
		this.a(alv.d, amv.a.DIRT.a(), "dirt");
		this.a(alv.d, amv.a.PODZOL.a(), "podzol");
		this.a(alv.cF, amy.b.FERN.a(), "double_fern");
		this.a(alv.cF, amy.b.GRASS.a(), "double_grass");
		this.a(alv.cF, amy.b.PAEONIA.a(), "paeonia");
		this.a(alv.cF, amy.b.ROSE.a(), "double_rose");
		this.a(alv.cF, amy.b.SUNFLOWER.a(), "sunflower");
		this.a(alv.cF, amy.b.SYRINGA.a(), "syringa");
		this.a(alv.t, apn.a.BIRCH.a(), "birch_leaves");
		this.a(alv.t, apn.a.JUNGLE.a(), "jungle_leaves");
		this.a(alv.t, apn.a.OAK.a(), "oak_leaves");
		this.a(alv.t, apn.a.SPRUCE.a(), "spruce_leaves");
		this.a(alv.u, apn.a.ACACIA.a() - 4, "acacia_leaves");
		this.a(alv.u, apn.a.DARK_OAK.a() - 4, "dark_oak_leaves");
		this.a(alv.r, apn.a.BIRCH.a(), "birch_log");
		this.a(alv.r, apn.a.JUNGLE.a(), "jungle_log");
		this.a(alv.r, apn.a.OAK.a(), "oak_log");
		this.a(alv.r, apn.a.SPRUCE.a(), "spruce_log");
		this.a(alv.s, apn.a.ACACIA.a() - 4, "acacia_log");
		this.a(alv.s, apn.a.DARK_OAK.a() - 4, "dark_oak_log");
		this.a(alv.be, aow.a.CHISELED_STONEBRICK.a(), "chiseled_brick_monster_egg");
		this.a(alv.be, aow.a.COBBLESTONE.a(), "cobblestone_monster_egg");
		this.a(alv.be, aow.a.CRACKED_STONEBRICK.a(), "cracked_brick_monster_egg");
		this.a(alv.be, aow.a.MOSSY_STONEBRICK.a(), "mossy_brick_monster_egg");
		this.a(alv.be, aow.a.STONE.a(), "stone_monster_egg");
		this.a(alv.be, aow.a.STONEBRICK.a(), "stone_brick_monster_egg");
		this.a(alv.f, apn.a.ACACIA.a(), "acacia_planks");
		this.a(alv.f, apn.a.BIRCH.a(), "birch_planks");
		this.a(alv.f, apn.a.DARK_OAK.a(), "dark_oak_planks");
		this.a(alv.f, apn.a.JUNGLE.a(), "jungle_planks");
		this.a(alv.f, apn.a.OAK.a(), "oak_planks");
		this.a(alv.f, apn.a.SPRUCE.a(), "spruce_planks");
		this.a(alv.cI, apt.a.BRICKS.a(), "prismarine_bricks");
		this.a(alv.cI, apt.a.DARK.a(), "dark_prismarine");
		this.a(alv.cI, apt.a.ROUGH.a(), "prismarine");
		this.a(alv.cq, apw.a.CHISELED.a(), "chiseled_quartz_block");
		this.a(alv.cq, apw.a.DEFAULT.a(), "quartz_block");
		this.a(alv.cq, apw.a.LINES_Y.a(), "quartz_column");
		this.a(alv.O, ano.a.ALLIUM.b(), "allium");
		this.a(alv.O, ano.a.BLUE_ORCHID.b(), "blue_orchid");
		this.a(alv.O, ano.a.HOUSTONIA.b(), "houstonia");
		this.a(alv.O, ano.a.ORANGE_TULIP.b(), "orange_tulip");
		this.a(alv.O, ano.a.OXEYE_DAISY.b(), "oxeye_daisy");
		this.a(alv.O, ano.a.PINK_TULIP.b(), "pink_tulip");
		this.a(alv.O, ano.a.POPPY.b(), "poppy");
		this.a(alv.O, ano.a.RED_TULIP.b(), "red_tulip");
		this.a(alv.O, ano.a.WHITE_TULIP.b(), "white_tulip");
		this.a(alv.m, aqj.a.RED_SAND.b(), "red_sand");
		this.a(alv.m, aqj.a.SAND.b(), "sand");
		this.a(alv.A, aqk.a.CHISELED.a(), "chiseled_sandstone");
		this.a(alv.A, aqk.a.DEFAULT.a(), "sandstone");
		this.a(alv.A, aqk.a.SMOOTH.a(), "smooth_sandstone");
		this.a(alv.cM, apz.a.CHISELED.a(), "chiseled_red_sandstone");
		this.a(alv.cM, apz.a.DEFAULT.a(), "red_sandstone");
		this.a(alv.cM, apz.a.SMOOTH.a(), "smooth_red_sandstone");
		this.a(alv.g, apn.a.ACACIA.a(), "acacia_sapling");
		this.a(alv.g, apn.a.BIRCH.a(), "birch_sapling");
		this.a(alv.g, apn.a.DARK_OAK.a(), "dark_oak_sapling");
		this.a(alv.g, apn.a.JUNGLE.a(), "jungle_sapling");
		this.a(alv.g, apn.a.OAK.a(), "oak_sapling");
		this.a(alv.g, apn.a.SPRUCE.a(), "spruce_sapling");
		this.a(alv.v, 0, "sponge");
		this.a(alv.v, 1, "sponge_wet");
		this.a(alv.cG, aem.BLACK.a(), "black_stained_glass");
		this.a(alv.cG, aem.BLUE.a(), "blue_stained_glass");
		this.a(alv.cG, aem.BROWN.a(), "brown_stained_glass");
		this.a(alv.cG, aem.CYAN.a(), "cyan_stained_glass");
		this.a(alv.cG, aem.GRAY.a(), "gray_stained_glass");
		this.a(alv.cG, aem.GREEN.a(), "green_stained_glass");
		this.a(alv.cG, aem.LIGHT_BLUE.a(), "light_blue_stained_glass");
		this.a(alv.cG, aem.LIME.a(), "lime_stained_glass");
		this.a(alv.cG, aem.MAGENTA.a(), "magenta_stained_glass");
		this.a(alv.cG, aem.ORANGE.a(), "orange_stained_glass");
		this.a(alv.cG, aem.PINK.a(), "pink_stained_glass");
		this.a(alv.cG, aem.PURPLE.a(), "purple_stained_glass");
		this.a(alv.cG, aem.RED.a(), "red_stained_glass");
		this.a(alv.cG, aem.SILVER.a(), "silver_stained_glass");
		this.a(alv.cG, aem.WHITE.a(), "white_stained_glass");
		this.a(alv.cG, aem.YELLOW.a(), "yellow_stained_glass");
		this.a(alv.cH, aem.BLACK.a(), "black_stained_glass_pane");
		this.a(alv.cH, aem.BLUE.a(), "blue_stained_glass_pane");
		this.a(alv.cH, aem.BROWN.a(), "brown_stained_glass_pane");
		this.a(alv.cH, aem.CYAN.a(), "cyan_stained_glass_pane");
		this.a(alv.cH, aem.GRAY.a(), "gray_stained_glass_pane");
		this.a(alv.cH, aem.GREEN.a(), "green_stained_glass_pane");
		this.a(alv.cH, aem.LIGHT_BLUE.a(), "light_blue_stained_glass_pane");
		this.a(alv.cH, aem.LIME.a(), "lime_stained_glass_pane");
		this.a(alv.cH, aem.MAGENTA.a(), "magenta_stained_glass_pane");
		this.a(alv.cH, aem.ORANGE.a(), "orange_stained_glass_pane");
		this.a(alv.cH, aem.PINK.a(), "pink_stained_glass_pane");
		this.a(alv.cH, aem.PURPLE.a(), "purple_stained_glass_pane");
		this.a(alv.cH, aem.RED.a(), "red_stained_glass_pane");
		this.a(alv.cH, aem.SILVER.a(), "silver_stained_glass_pane");
		this.a(alv.cH, aem.WHITE.a(), "white_stained_glass_pane");
		this.a(alv.cH, aem.YELLOW.a(), "yellow_stained_glass_pane");
		this.a(alv.cu, aem.BLACK.a(), "black_stained_hardened_clay");
		this.a(alv.cu, aem.BLUE.a(), "blue_stained_hardened_clay");
		this.a(alv.cu, aem.BROWN.a(), "brown_stained_hardened_clay");
		this.a(alv.cu, aem.CYAN.a(), "cyan_stained_hardened_clay");
		this.a(alv.cu, aem.GRAY.a(), "gray_stained_hardened_clay");
		this.a(alv.cu, aem.GREEN.a(), "green_stained_hardened_clay");
		this.a(alv.cu, aem.LIGHT_BLUE.a(), "light_blue_stained_hardened_clay");
		this.a(alv.cu, aem.LIME.a(), "lime_stained_hardened_clay");
		this.a(alv.cu, aem.MAGENTA.a(), "magenta_stained_hardened_clay");
		this.a(alv.cu, aem.ORANGE.a(), "orange_stained_hardened_clay");
		this.a(alv.cu, aem.PINK.a(), "pink_stained_hardened_clay");
		this.a(alv.cu, aem.PURPLE.a(), "purple_stained_hardened_clay");
		this.a(alv.cu, aem.RED.a(), "red_stained_hardened_clay");
		this.a(alv.cu, aem.SILVER.a(), "silver_stained_hardened_clay");
		this.a(alv.cu, aem.WHITE.a(), "white_stained_hardened_clay");
		this.a(alv.cu, aem.YELLOW.a(), "yellow_stained_hardened_clay");
		this.a(alv.b, arc.a.ANDESITE.a(), "andesite");
		this.a(alv.b, arc.a.ANDESITE_SMOOTH.a(), "andesite_smooth");
		this.a(alv.b, arc.a.DIORITE.a(), "diorite");
		this.a(alv.b, arc.a.DIORITE_SMOOTH.a(), "diorite_smooth");
		this.a(alv.b, arc.a.GRANITE.a(), "granite");
		this.a(alv.b, arc.a.GRANITE_SMOOTH.a(), "granite_smooth");
		this.a(alv.b, arc.a.STONE.a(), "stone");
		this.a(alv.bf, ard.a.CRACKED.a(), "cracked_stonebrick");
		this.a(alv.bf, ard.a.DEFAULT.a(), "stonebrick");
		this.a(alv.bf, ard.a.CHISELED.a(), "chiseled_stonebrick");
		this.a(alv.bf, ard.a.MOSSY.a(), "mossy_stonebrick");
		this.a(alv.U, arf.a.BRICK.a(), "brick_slab");
		this.a(alv.U, arf.a.COBBLESTONE.a(), "cobblestone_slab");
		this.a(alv.U, arf.a.WOOD.a(), "old_wood_slab");
		this.a(alv.U, arf.a.NETHERBRICK.a(), "nether_brick_slab");
		this.a(alv.U, arf.a.QUARTZ.a(), "quartz_slab");
		this.a(alv.U, arf.a.SAND.a(), "sandstone_slab");
		this.a(alv.U, arf.a.SMOOTHBRICK.a(), "stone_brick_slab");
		this.a(alv.U, arf.a.STONE.a(), "stone_slab");
		this.a(alv.cP, ape.a.RED_SANDSTONE.a(), "red_sandstone_slab");
		this.a(alv.H, ari.a.DEAD_BUSH.a(), "dead_bush");
		this.a(alv.H, ari.a.FERN.a(), "fern");
		this.a(alv.H, ari.a.GRASS.a(), "tall_grass");
		this.a(alv.bM, apn.a.ACACIA.a(), "acacia_slab");
		this.a(alv.bM, apn.a.BIRCH.a(), "birch_slab");
		this.a(alv.bM, apn.a.DARK_OAK.a(), "dark_oak_slab");
		this.a(alv.bM, apn.a.JUNGLE.a(), "jungle_slab");
		this.a(alv.bM, apn.a.OAK.a(), "oak_slab");
		this.a(alv.bM, apn.a.SPRUCE.a(), "spruce_slab");
		this.a(alv.L, aem.BLACK.a(), "black_wool");
		this.a(alv.L, aem.BLUE.a(), "blue_wool");
		this.a(alv.L, aem.BROWN.a(), "brown_wool");
		this.a(alv.L, aem.CYAN.a(), "cyan_wool");
		this.a(alv.L, aem.GRAY.a(), "gray_wool");
		this.a(alv.L, aem.GREEN.a(), "green_wool");
		this.a(alv.L, aem.LIGHT_BLUE.a(), "light_blue_wool");
		this.a(alv.L, aem.LIME.a(), "lime_wool");
		this.a(alv.L, aem.MAGENTA.a(), "magenta_wool");
		this.a(alv.L, aem.ORANGE.a(), "orange_wool");
		this.a(alv.L, aem.PINK.a(), "pink_wool");
		this.a(alv.L, aem.PURPLE.a(), "purple_wool");
		this.a(alv.L, aem.RED.a(), "red_wool");
		this.a(alv.L, aem.SILVER.a(), "silver_wool");
		this.a(alv.L, aem.WHITE.a(), "white_wool");
		this.a(alv.L, aem.YELLOW.a(), "yellow_wool");
		this.a(alv.ak, "farmland");
		this.a(alv.cC, "acacia_stairs");
		this.a(alv.cs, "activator_rail");
		this.a(alv.bY, "beacon");
		this.a(alv.h, "bedrock");
		this.a(alv.bV, "birch_stairs");
		this.a(alv.X, "bookshelf");
		this.a(alv.V, "brick_block");
		this.a(alv.V, "brick_block");
		this.a(alv.bu, "brick_stairs");
		this.a(alv.P, "brown_mushroom");
		this.a(alv.aK, "cactus");
		this.a(alv.aL, "clay");
		this.a(alv.cA, "coal_block");
		this.a(alv.q, "coal_ore");
		this.a(alv.e, "cobblestone");
		this.a(alv.ai, "crafting_table");
		this.a(alv.cD, "dark_oak_stairs");
		this.a(alv.cl, "daylight_detector");
		this.a(alv.I, "dead_bush");
		this.a(alv.E, "detector_rail");
		this.a(alv.ah, "diamond_block");
		this.a(alv.ag, "diamond_ore");
		this.a(alv.z, "dispenser");
		this.a(alv.ct, "dropper");
		this.a(alv.bT, "emerald_block");
		this.a(alv.bP, "emerald_ore");
		this.a(alv.bC, "enchanting_table");
		this.a(alv.bG, "end_portal_frame");
		this.a(alv.bH, "end_stone");
		this.a(alv.aO, "oak_fence");
		this.a(alv.aP, "spruce_fence");
		this.a(alv.aQ, "birch_fence");
		this.a(alv.aR, "jungle_fence");
		this.a(alv.aS, "dark_oak_fence");
		this.a(alv.aT, "acacia_fence");
		this.a(alv.bo, "oak_fence_gate");
		this.a(alv.bp, "spruce_fence_gate");
		this.a(alv.bq, "birch_fence_gate");
		this.a(alv.br, "jungle_fence_gate");
		this.a(alv.bs, "dark_oak_fence_gate");
		this.a(alv.bt, "acacia_fence_gate");
		this.a(alv.al, "furnace");
		this.a(alv.w, "glass");
		this.a(alv.bj, "glass_pane");
		this.a(alv.aX, "glowstone");
		this.a(alv.D, "golden_rail");
		this.a(alv.R, "gold_block");
		this.a(alv.o, "gold_ore");
		this.a(alv.c, "grass");
		this.a(alv.da, "grass_path");
		this.a(alv.n, "gravel");
		this.a(alv.cz, "hardened_clay");
		this.a(alv.cx, "hay_block");
		this.a(alv.ci, "heavy_weighted_pressure_plate");
		this.a(alv.cp, "hopper");
		this.a(alv.aI, "ice");
		this.a(alv.bi, "iron_bars");
		this.a(alv.S, "iron_block");
		this.a(alv.p, "iron_ore");
		this.a(alv.cw, "iron_trapdoor");
		this.a(alv.aN, "jukebox");
		this.a(alv.bW, "jungle_stairs");
		this.a(alv.au, "ladder");
		this.a(alv.y, "lapis_block");
		this.a(alv.x, "lapis_ore");
		this.a(alv.ay, "lever");
		this.a(alv.ch, "light_weighted_pressure_plate");
		this.a(alv.aZ, "lit_pumpkin");
		this.a(alv.bk, "melon_block");
		this.a(alv.Y, "mossy_cobblestone");
		this.a(alv.bw, "mycelium");
		this.a(alv.aV, "netherrack");
		this.a(alv.by, "nether_brick");
		this.a(alv.bz, "nether_brick_fence");
		this.a(alv.bA, "nether_brick_stairs");
		this.a(alv.B, "noteblock");
		this.a(alv.ad, "oak_stairs");
		this.a(alv.Z, "obsidian");
		this.a(alv.cB, "packed_ice");
		this.a(alv.J, "piston");
		this.a(alv.aU, "pumpkin");
		this.a(alv.co, "quartz_ore");
		this.a(alv.cr, "quartz_stairs");
		this.a(alv.av, "rail");
		this.a(alv.cn, "redstone_block");
		this.a(alv.bJ, "redstone_lamp");
		this.a(alv.aC, "redstone_ore");
		this.a(alv.aF, "redstone_torch");
		this.a(alv.Q, "red_mushroom");
		this.a(alv.bO, "sandstone_stairs");
		this.a(alv.cN, "red_sandstone_stairs");
		this.a(alv.cJ, "sea_lantern");
		this.a(alv.cE, "slime");
		this.a(alv.aJ, "snow");
		this.a(alv.aH, "snow_layer");
		this.a(alv.aW, "soul_sand");
		this.a(alv.bU, "spruce_stairs");
		this.a(alv.F, "sticky_piston");
		this.a(alv.bv, "stone_brick_stairs");
		this.a(alv.aG, "stone_button");
		this.a(alv.az, "stone_pressure_plate");
		this.a(alv.aw, "stone_stairs");
		this.a(alv.W, "tnt");
		this.a(alv.aa, "torch");
		this.a(alv.bd, "trapdoor");
		this.a(alv.bR, "tripwire_hook");
		this.a(alv.bn, "vine");
		this.a(alv.bx, "waterlily");
		this.a(alv.G, "web");
		this.a(alv.cd, "wooden_button");
		this.a(alv.aB, "wooden_pressure_plate");
		this.a(alv.N, ano.a.DANDELION.b(), "dandelion");
		this.a(alv.cQ, "end_rod");
		this.a(alv.cR, "chorus_plant");
		this.a(alv.cS, "chorus_flower");
		this.a(alv.cT, "purpur_block");
		this.a(alv.cU, "purpur_pillar");
		this.a(alv.cV, "purpur_stairs");
		this.a(alv.cX, "purpur_slab");
		this.a(alv.cW, "purpur_double_slab");
		this.a(alv.cY, "end_bricks");
		this.a(alv.df, "magma");
		this.a(alv.dg, "nether_wart_block");
		this.a(alv.dh, "red_nether_brick");
		this.a(alv.di, "bone_block");
		this.a(alv.dj, "structure_void");
		this.a(alv.dk, "observer");
		this.a(alv.dl, "white_shulker_box");
		this.a(alv.dm, "orange_shulker_box");
		this.a(alv.dn, "magenta_shulker_box");
		this.a(alv.do, "light_blue_shulker_box");
		this.a(alv.dp, "yellow_shulker_box");
		this.a(alv.dq, "lime_shulker_box");
		this.a(alv.dr, "pink_shulker_box");
		this.a(alv.ds, "gray_shulker_box");
		this.a(alv.dt, "silver_shulker_box");
		this.a(alv.du, "cyan_shulker_box");
		this.a(alv.dv, "purple_shulker_box");
		this.a(alv.dw, "blue_shulker_box");
		this.a(alv.dx, "brown_shulker_box");
		this.a(alv.dy, "green_shulker_box");
		this.a(alv.dz, "red_shulker_box");
		this.a(alv.dA, "black_shulker_box");
		this.a(alv.ae, "chest");
		this.a(alv.cg, "trapped_chest");
		this.a(alv.bQ, "ender_chest");
		this.a(afl.b, "iron_shovel");
		this.a(afl.c, "iron_pickaxe");
		this.a(afl.d, "iron_axe");
		this.a(afl.e, "flint_and_steel");
		this.a(afl.f, "apple");
		this.a(afl.g, "bow");
		this.a(afl.h, "arrow");
		this.a(afl.i, "spectral_arrow");
		this.a(afl.j, "tipped_arrow");
		this.a(afl.k, 0, "coal");
		this.a(afl.k, 1, "charcoal");
		this.a(afl.l, "diamond");
		this.a(afl.m, "iron_ingot");
		this.a(afl.n, "gold_ingot");
		this.a(afl.o, "iron_sword");
		this.a(afl.p, "wooden_sword");
		this.a(afl.q, "wooden_shovel");
		this.a(afl.r, "wooden_pickaxe");
		this.a(afl.s, "wooden_axe");
		this.a(afl.t, "stone_sword");
		this.a(afl.u, "stone_shovel");
		this.a(afl.v, "stone_pickaxe");
		this.a(afl.w, "stone_axe");
		this.a(afl.x, "diamond_sword");
		this.a(afl.y, "diamond_shovel");
		this.a(afl.z, "diamond_pickaxe");
		this.a(afl.A, "diamond_axe");
		this.a(afl.B, "stick");
		this.a(afl.C, "bowl");
		this.a(afl.D, "mushroom_stew");
		this.a(afl.E, "golden_sword");
		this.a(afl.F, "golden_shovel");
		this.a(afl.G, "golden_pickaxe");
		this.a(afl.H, "golden_axe");
		this.a(afl.I, "string");
		this.a(afl.J, "feather");
		this.a(afl.K, "gunpowder");
		this.a(afl.L, "wooden_hoe");
		this.a(afl.M, "stone_hoe");
		this.a(afl.N, "iron_hoe");
		this.a(afl.O, "diamond_hoe");
		this.a(afl.P, "golden_hoe");
		this.a(afl.Q, "wheat_seeds");
		this.a(afl.R, "wheat");
		this.a(afl.S, "bread");
		this.a(afl.T, "leather_helmet");
		this.a(afl.U, "leather_chestplate");
		this.a(afl.V, "leather_leggings");
		this.a(afl.W, "leather_boots");
		this.a(afl.X, "chainmail_helmet");
		this.a(afl.Y, "chainmail_chestplate");
		this.a(afl.Z, "chainmail_leggings");
		this.a(afl.aa, "chainmail_boots");
		this.a(afl.ab, "iron_helmet");
		this.a(afl.ac, "iron_chestplate");
		this.a(afl.ad, "iron_leggings");
		this.a(afl.ae, "iron_boots");
		this.a(afl.af, "diamond_helmet");
		this.a(afl.ag, "diamond_chestplate");
		this.a(afl.ah, "diamond_leggings");
		this.a(afl.ai, "diamond_boots");
		this.a(afl.aj, "golden_helmet");
		this.a(afl.ak, "golden_chestplate");
		this.a(afl.al, "golden_leggings");
		this.a(afl.am, "golden_boots");
		this.a(afl.an, "flint");
		this.a(afl.ao, "porkchop");
		this.a(afl.ap, "cooked_porkchop");
		this.a(afl.aq, "painting");
		this.a(afl.ar, "golden_apple");
		this.a(afl.ar, 1, "golden_apple");
		this.a(afl.as, "sign");
		this.a(afl.at, "oak_door");
		this.a(afl.au, "spruce_door");
		this.a(afl.av, "birch_door");
		this.a(afl.aw, "jungle_door");
		this.a(afl.ax, "acacia_door");
		this.a(afl.ay, "dark_oak_door");
		this.a(afl.az, "bucket");
		this.a(afl.aA, "water_bucket");
		this.a(afl.aB, "lava_bucket");
		this.a(afl.aC, "minecart");
		this.a(afl.aD, "saddle");
		this.a(afl.aE, "iron_door");
		this.a(afl.aF, "redstone");
		this.a(afl.aG, "snowball");
		this.a(afl.aH, "oak_boat");
		this.a(afl.aI, "spruce_boat");
		this.a(afl.aJ, "birch_boat");
		this.a(afl.aK, "jungle_boat");
		this.a(afl.aL, "acacia_boat");
		this.a(afl.aM, "dark_oak_boat");
		this.a(afl.aN, "leather");
		this.a(afl.aO, "milk_bucket");
		this.a(afl.aP, "brick");
		this.a(afl.aQ, "clay_ball");
		this.a(afl.aR, "reeds");
		this.a(afl.aS, "paper");
		this.a(afl.aT, "book");
		this.a(afl.aU, "slime_ball");
		this.a(afl.aV, "chest_minecart");
		this.a(afl.aW, "furnace_minecart");
		this.a(afl.aX, "egg");
		this.a(afl.aY, "compass");
		this.a(afl.aZ, "fishing_rod");
		this.a(afl.ba, "clock");
		this.a(afl.bb, "glowstone_dust");
		this.a(afl.bc, afa.a.COD.a(), "cod");
		this.a(afl.bc, afa.a.SALMON.a(), "salmon");
		this.a(afl.bc, afa.a.CLOWNFISH.a(), "clownfish");
		this.a(afl.bc, afa.a.PUFFERFISH.a(), "pufferfish");
		this.a(afl.bd, afa.a.COD.a(), "cooked_cod");
		this.a(afl.bd, afa.a.SALMON.a(), "cooked_salmon");
		this.a(afl.be, aem.BLACK.b(), "dye_black");
		this.a(afl.be, aem.RED.b(), "dye_red");
		this.a(afl.be, aem.GREEN.b(), "dye_green");
		this.a(afl.be, aem.BROWN.b(), "dye_brown");
		this.a(afl.be, aem.BLUE.b(), "dye_blue");
		this.a(afl.be, aem.PURPLE.b(), "dye_purple");
		this.a(afl.be, aem.CYAN.b(), "dye_cyan");
		this.a(afl.be, aem.SILVER.b(), "dye_silver");
		this.a(afl.be, aem.GRAY.b(), "dye_gray");
		this.a(afl.be, aem.PINK.b(), "dye_pink");
		this.a(afl.be, aem.LIME.b(), "dye_lime");
		this.a(afl.be, aem.YELLOW.b(), "dye_yellow");
		this.a(afl.be, aem.LIGHT_BLUE.b(), "dye_light_blue");
		this.a(afl.be, aem.MAGENTA.b(), "dye_magenta");
		this.a(afl.be, aem.ORANGE.b(), "dye_orange");
		this.a(afl.be, aem.WHITE.b(), "dye_white");
		this.a(afl.bf, "bone");
		this.a(afl.bg, "sugar");
		this.a(afl.bh, "cake");
		this.a(afl.bi, "bed");
		this.a(afl.bj, "repeater");
		this.a(afl.bk, "cookie");
		this.a(afl.bm, "shears");
		this.a(afl.bn, "melon");
		this.a(afl.bo, "pumpkin_seeds");
		this.a(afl.bp, "melon_seeds");
		this.a(afl.bq, "beef");
		this.a(afl.br, "cooked_beef");
		this.a(afl.bs, "chicken");
		this.a(afl.bt, "cooked_chicken");
		this.a(afl.bw, "rabbit");
		this.a(afl.bx, "cooked_rabbit");
		this.a(afl.bu, "mutton");
		this.a(afl.bv, "cooked_mutton");
		this.a(afl.bz, "rabbit_foot");
		this.a(afl.bA, "rabbit_hide");
		this.a(afl.by, "rabbit_stew");
		this.a(afl.bB, "rotten_flesh");
		this.a(afl.bC, "ender_pearl");
		this.a(afl.bD, "blaze_rod");
		this.a(afl.bE, "ghast_tear");
		this.a(afl.bF, "gold_nugget");
		this.a(afl.bG, "nether_wart");
		this.a(afl.cW, "beetroot");
		this.a(afl.cV, "beetroot_seeds");
		this.a(afl.cX, "beetroot_soup");
		this.a(afl.cY, "totem");
		this.a(afl.bH, "bottle_drinkable");
		this.a(afl.bI, "bottle_splash");
		this.a(afl.bJ, "bottle_lingering");
		this.a(afl.bK, "glass_bottle");
		this.a(afl.bL, "dragon_breath");
		this.a(afl.bM, "spider_eye");
		this.a(afl.bN, "fermented_spider_eye");
		this.a(afl.bO, "blaze_powder");
		this.a(afl.bP, "magma_cream");
		this.a(afl.bQ, "brewing_stand");
		this.a(afl.bR, "cauldron");
		this.a(afl.bS, "ender_eye");
		this.a(afl.bT, "speckled_melon");
		this.d.a(afl.bU, new bqk() {
			@Override
			public cbm a(afj afj) {
				return new cbm("spawn_egg", "inventory");
			}
		});
		this.a(afl.bV, "experience_bottle");
		this.a(afl.bW, "fire_charge");
		this.a(afl.bX, "writable_book");
		this.a(afl.bZ, "emerald");
		this.a(afl.ca, "item_frame");
		this.a(afl.cb, "flower_pot");
		this.a(afl.cc, "carrot");
		this.a(afl.cd, "potato");
		this.a(afl.ce, "baked_potato");
		this.a(afl.cf, "poisonous_potato");
		this.a(afl.cg, "map");
		this.a(afl.ch, "golden_carrot");
		this.a(afl.ci, 0, "skull_skeleton");
		this.a(afl.ci, 1, "skull_wither");
		this.a(afl.ci, 2, "skull_zombie");
		this.a(afl.ci, 3, "skull_char");
		this.a(afl.ci, 4, "skull_creeper");
		this.a(afl.ci, 5, "skull_dragon");
		this.a(afl.cj, "carrot_on_a_stick");
		this.a(afl.ck, "nether_star");
		this.a(afl.cQ, "end_crystal");
		this.a(afl.cl, "pumpkin_pie");
		this.a(afl.cn, "firework_charge");
		this.a(afl.cp, "comparator");
		this.a(afl.cq, "netherbrick");
		this.a(afl.cr, "quartz");
		this.a(afl.cs, "tnt_minecart");
		this.a(afl.ct, "hopper_minecart");
		this.a(afl.cu, "armor_stand");
		this.a(afl.cv, "iron_horse_armor");
		this.a(afl.cw, "golden_horse_armor");
		this.a(afl.cx, "diamond_horse_armor");
		this.a(afl.cy, "lead");
		this.a(afl.cz, "name_tag");
		this.d.a(afl.cP, new bqk() {
			@Override
			public cbm a(afj afj) {
				return new cbm("banner", "inventory");
			}
		});
		this.d.a(afl.cR, new bqk() {
			@Override
			public cbm a(afj afj) {
				return new cbm("shield", "inventory");
			}
		});
		this.a(afl.cS, "elytra");
		this.a(afl.cT, "chorus_fruit");
		this.a(afl.cU, "chorus_fruit_popped");
		this.a(afl.cZ, "shulker_shell");
		this.a(afl.da, "iron_nugget");
		this.a(afl.cB, "record_13");
		this.a(afl.cC, "record_cat");
		this.a(afl.cD, "record_blocks");
		this.a(afl.cE, "record_chirp");
		this.a(afl.cF, "record_far");
		this.a(afl.cG, "record_mall");
		this.a(afl.cH, "record_mellohi");
		this.a(afl.cI, "record_stal");
		this.a(afl.cJ, "record_strad");
		this.a(afl.cK, "record_ward");
		this.a(afl.cL, "record_11");
		this.a(afl.cM, "record_wait");
		this.a(afl.cN, "prismarine_shard");
		this.a(afl.cO, "prismarine_crystals");
		this.d.a(afl.co, new bqk() {
			@Override
			public cbm a(afj afj) {
				return new cbm("enchanted_book", "inventory");
			}
		});
		this.d.a(afl.bl, new bqk() {
			@Override
			public cbm a(afj afj) {
				return new cbm("filled_map", "inventory");
			}
		});
		this.a(alv.bX, "command_block");
		this.a(afl.cm, "fireworks");
		this.a(afl.cA, "command_block_minecart");
		this.a(alv.cv, "barrier");
		this.a(alv.ac, "mob_spawner");
		this.a(afl.bY, "written_book");
		this.a(alv.bg, aoj.a.ALL_INSIDE.a(), "brown_mushroom_block");
		this.a(alv.bh, aoj.a.ALL_INSIDE.a(), "red_mushroom_block");
		this.a(alv.bI, "dragon_egg");
		this.a(alv.dc, "repeating_command_block");
		this.a(alv.dd, "chain_command_block");
		this.a(alv.dB, asx.a.SAVE.a(), "structure_block");
		this.a(alv.dB, asx.a.LOAD.a(), "structure_block");
		this.a(alv.dB, asx.a.CORNER.a(), "structure_block");
		this.a(alv.dB, asx.a.DATA.a(), "structure_block");
	}

	@Override
	public void a(bzy bzy) {
		this.d.b();
	}
}
