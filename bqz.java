import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;

public class bqz {
	private final Map<atl, cbh> a = Maps.newIdentityHashMap();
	private final bsd b = new bsd();
	private final cbl c;

	public bqz(cbl cbl) {
		this.c = cbl;
		this.d();
	}

	public bsd a() {
		return this.b;
	}

	public byz a(atl atl) {
		alu alu3 = atl.v();
		cbh cbh4 = this.b(atl);
		if (cbh4 == null || cbh4 == this.c.a()) {
			if (alu3 == alv.ax || alu3 == alv.an || alu3 == alv.ae || alu3 == alv.cg || alu3 == alv.cK || alu3 == alv.cL) {
				return this.c.b().a("minecraft:blocks/planks_oak");
			}

			if (alu3 == alv.bQ) {
				return this.c.b().a("minecraft:blocks/obsidian");
			}

			if (alu3 == alv.k || alu3 == alv.l) {
				return this.c.b().a("minecraft:blocks/lava_still");
			}

			if (alu3 == alv.i || alu3 == alv.j) {
				return this.c.b().a("minecraft:blocks/water_still");
			}

			if (alu3 == alv.ce) {
				return this.c.b().a("minecraft:blocks/soul_sand");
			}

			if (alu3 == alv.cv) {
				return this.c.b().a("minecraft:items/barrier");
			}

			if (alu3 == alv.dj) {
				return this.c.b().a("minecraft:items/structure_void");
			}

			if (alu3 == alv.dl) {
				return this.c.b().a("minecraft:blocks/shulker_top_white");
			}

			if (alu3 == alv.dm) {
				return this.c.b().a("minecraft:blocks/shulker_top_orange");
			}

			if (alu3 == alv.dn) {
				return this.c.b().a("minecraft:blocks/shulker_top_magenta");
			}

			if (alu3 == alv.do) {
				return this.c.b().a("minecraft:blocks/shulker_top_light_blue");
			}

			if (alu3 == alv.dp) {
				return this.c.b().a("minecraft:blocks/shulker_top_yellow");
			}

			if (alu3 == alv.dq) {
				return this.c.b().a("minecraft:blocks/shulker_top_lime");
			}

			if (alu3 == alv.dr) {
				return this.c.b().a("minecraft:blocks/shulker_top_pink");
			}

			if (alu3 == alv.ds) {
				return this.c.b().a("minecraft:blocks/shulker_top_gray");
			}

			if (alu3 == alv.dt) {
				return this.c.b().a("minecraft:blocks/shulker_top_silver");
			}

			if (alu3 == alv.du) {
				return this.c.b().a("minecraft:blocks/shulker_top_cyan");
			}

			if (alu3 == alv.dv) {
				return this.c.b().a("minecraft:blocks/shulker_top_purple");
			}

			if (alu3 == alv.dw) {
				return this.c.b().a("minecraft:blocks/shulker_top_blue");
			}

			if (alu3 == alv.dx) {
				return this.c.b().a("minecraft:blocks/shulker_top_brown");
			}

			if (alu3 == alv.dy) {
				return this.c.b().a("minecraft:blocks/shulker_top_green");
			}

			if (alu3 == alv.dz) {
				return this.c.b().a("minecraft:blocks/shulker_top_red");
			}

			if (alu3 == alv.dA) {
				return this.c.b().a("minecraft:blocks/shulker_top_black");
			}
		}

		if (cbh4 == null) {
			cbh4 = this.c.a();
		}

		return cbh4.d();
	}

	public cbh b(atl atl) {
		cbh cbh3 = (cbh)this.a.get(atl);
		if (cbh3 == null) {
			cbh3 = this.c.a();
		}

		return cbh3;
	}

	public cbl b() {
		return this.c;
	}

	public void c() {
		this.a.clear();

		for (Entry<atl, cbm> entry3 : this.b.a().entrySet()) {
			this.a.put(entry3.getKey(), this.c.a((cbm)entry3.getValue()));
		}
	}

	public void a(alu alu, bsg bsg) {
		this.b.a(alu, bsg);
	}

	public void a(alu... arr) {
		this.b.a(arr);
	}

	private void d() {
		this.a(
			alv.a,
			alv.i,
			alv.j,
			alv.k,
			alv.l,
			alv.M,
			alv.ae,
			alv.bQ,
			alv.cg,
			alv.an,
			alv.ce,
			alv.bF,
			alv.cv,
			alv.ax,
			alv.cL,
			alv.cK,
			alv.db,
			alv.dj,
			alv.dl,
			alv.dm,
			alv.dn,
			alv.do,
			alv.dp,
			alv.dq,
			alv.dr,
			alv.ds,
			alv.dt,
			alv.du,
			alv.dv,
			alv.dw,
			alv.dx,
			alv.dy,
			alv.dz,
			alv.dA
		);
		this.a(alv.b, new bsf.a().a(arc.a).a());
		this.a(alv.cI, new bsf.a().a(apt.a).a());
		this.a(alv.t, new bsf.a().a(apj.e).a("_leaves").a(aon.b, aon.a).a());
		this.a(alv.u, new bsf.a().a(apc.e).a("_leaves").a(aon.b, aon.a).a());
		this.a(alv.aK, new bsf.a().a(amc.a).a());
		this.a(alv.aM, new bsf.a().a(aqe.a).a());
		this.a(alv.aN, new bsf.a().a(aol.a).a());
		this.a(alv.bZ, new bsf.a().a(arq.f).a("_wall").a());
		this.a(alv.cF, new bsf.a().a(amy.a).a(amy.d).a());
		this.a(alv.bo, new bsf.a().a(anm.b).a());
		this.a(alv.bp, new bsf.a().a(anm.b).a());
		this.a(alv.bq, new bsf.a().a(anm.b).a());
		this.a(alv.br, new bsf.a().a(anm.b).a());
		this.a(alv.bs, new bsf.a().a(anm.b).a());
		this.a(alv.bt, new bsf.a().a(anm.b).a());
		this.a(alv.bS, new bsf.a().a(arn.c, arn.a).a());
		this.a(alv.bL, new bsf.a().a(apn.a).a("_double_slab").a());
		this.a(alv.bM, new bsf.a().a(apn.a).a("_slab").a());
		this.a(alv.W, new bsf.a().a(ark.a).a());
		this.a(alv.ab, new bsf.a().a(ann.a).a());
		this.a(alv.af, new bsf.a().a(aqb.e).a());
		this.a(alv.ao, new bsf.a().a(amx.d).a());
		this.a(alv.ap, new bsf.a().a(amx.d).a());
		this.a(alv.aq, new bsf.a().a(amx.d).a());
		this.a(alv.ar, new bsf.a().a(amx.d).a());
		this.a(alv.as, new bsf.a().a(amx.d).a());
		this.a(alv.at, new bsf.a().a(amx.d).a());
		this.a(alv.aA, new bsf.a().a(amx.d).a());
		this.a(alv.L, new bsf.a().a(aml.a).a("_wool").a());
		this.a(alv.cy, new bsf.a().a(aml.a).a("_carpet").a());
		this.a(alv.cu, new bsf.a().a(aml.a).a("_stained_hardened_clay").a());
		this.a(alv.cH, new bsf.a().a(aml.a).a("_stained_glass_pane").a());
		this.a(alv.cG, new bsf.a().a(aml.a).a("_stained_glass").a());
		this.a(alv.A, new bsf.a().a(aqk.a).a());
		this.a(alv.cM, new bsf.a().a(apz.a).a());
		this.a(alv.H, new bsf.a().a(ari.a).a());
		this.a(alv.C, new bsf.a().a(als.b).a());
		this.a(alv.N, new bsf.a().a(alv.N.g()).a());
		this.a(alv.O, new bsf.a().a(alv.O.g()).a());
		this.a(alv.U, new bsf.a().a(arf.e).a("_slab").a());
		this.a(alv.cP, new bsf.a().a(ape.e).a("_slab").a());
		this.a(alv.be, new bsf.a().a(aow.a).a("_monster_egg").a());
		this.a(alv.bf, new bsf.a().a(ard.a).a());
		this.a(alv.z, new bsf.a().a(amw.b).a());
		this.a(alv.ct, new bsf.a().a(ana.b).a());
		this.a(alv.r, new bsf.a().a(apk.b).a("_log").a());
		this.a(alv.s, new bsf.a().a(apd.b).a("_log").a());
		this.a(alv.f, new bsf.a().a(apn.a).a("_planks").a());
		this.a(alv.g, new bsf.a().a(aql.a).a("_sapling").a());
		this.a(alv.m, new bsf.a().a(aqj.a).a());
		this.a(alv.cp, new bsf.a().a(aoh.b).a());
		this.a(alv.ca, new bsf.a().a(anp.a).a());
		this.a(alv.cq, new bsc() {
			@Override
			protected cbm a(atl atl) {
				apw.a a3 = atl.c(apw.a);
				switch (a3) {
					case DEFAULT:
					default:
						return new cbm("quartz_block", "normal");
					case CHISELED:
						return new cbm("chiseled_quartz_block", "normal");
					case LINES_Y:
						return new cbm("quartz_column", "axis=y");
					case LINES_X:
						return new cbm("quartz_column", "axis=x");
					case LINES_Z:
						return new cbm("quartz_column", "axis=z");
				}
			}
		});
		this.a(alv.I, new bsc() {
			@Override
			protected cbm a(atl atl) {
				return new cbm("dead_bush", "normal");
			}
		});
		this.a(alv.bl, new bsc() {
			@Override
			protected cbm a(atl atl) {
				Map<aub<?>, Comparable<?>> map3 = Maps.newLinkedHashMap(atl.u());
				if (atl.c(arb.c) != cv.UP) {
					map3.remove(arb.a);
				}

				return new cbm(alu.h.b(atl.v()), this.a(map3));
			}
		});
		this.a(alv.bm, new bsc() {
			@Override
			protected cbm a(atl atl) {
				Map<aub<?>, Comparable<?>> map3 = Maps.newLinkedHashMap(atl.u());
				if (atl.c(arb.c) != cv.UP) {
					map3.remove(arb.a);
				}

				return new cbm(alu.h.b(atl.v()), this.a(map3));
			}
		});
		this.a(alv.d, new bsc() {
			@Override
			protected cbm a(atl atl) {
				Map<aub<?>, Comparable<?>> map3 = Maps.newLinkedHashMap(atl.u());
				String string4 = amv.a.a((amv.a)map3.remove(amv.a));
				if (amv.a.PODZOL != atl.c(amv.a)) {
					map3.remove(amv.b);
				}

				return new cbm(string4, this.a(map3));
			}
		});
		this.a(alv.T, new bsc() {
			@Override
			protected cbm a(atl atl) {
				Map<aub<?>, Comparable<?>> map3 = Maps.newLinkedHashMap(atl.u());
				String string4 = arf.e.a((arf.a)map3.remove(arf.e));
				map3.remove(arf.d);
				String string5 = atl.c(arf.d) ? "all" : "normal";
				return new cbm(string4 + "_double_slab", string5);
			}
		});
		this.a(alv.cO, new bsc() {
			@Override
			protected cbm a(atl atl) {
				Map<aub<?>, Comparable<?>> map3 = Maps.newLinkedHashMap(atl.u());
				String string4 = ape.e.a((ape.a)map3.remove(ape.e));
				map3.remove(arf.d);
				String string5 = atl.c(ape.d) ? "all" : "normal";
				return new cbm(string4 + "_double_slab", string5);
			}
		});
	}
}
