public abstract class akk {
	public static final akf a;
	public static final akf b;
	public static final akf c;
	public static final akf d;
	public static final akf e;
	public static final akf f;
	public static final akf g;
	public static final akf h;
	public static final akf i;
	public static final akf j;
	public static final akf k;
	public static final akf l;
	public static final akf m;
	public static final akf n;
	public static final akf o;
	public static final akf p;
	public static final akf q;
	public static final akf r;
	public static final akf s;
	public static final akf t;
	public static final akf u;
	public static final akf v;
	public static final akf w;
	public static final akf x;
	public static final akf y;
	public static final akf z;
	public static final akf A;
	public static final akf B;
	public static final akf C;
	public static final akf D;
	public static final akf E;
	public static final akf F;
	public static final akf G;
	public static final akf H;
	public static final akf I;
	public static final akf J;
	public static final akf K;
	public static final akf L;
	public static final akf M;
	public static final akf N;
	public static final akf O;
	public static final akf P;
	public static final akf Q;
	public static final akf R;
	public static final akf S;
	public static final akf T;
	public static final akf U;
	public static final akf V;
	public static final akf W;
	public static final akf X;
	public static final akf Y;
	public static final akf Z;
	public static final akf aa;
	public static final akf ab;
	public static final akf ac;
	public static final akf ad;
	public static final akf ae;
	public static final akf af;
	public static final akf ag;
	public static final akf ah;
	public static final akf ai;
	public static final akf aj;
	public static final akf ak;

	private static akf a(String string) {
		akf akf2 = akf.q.c(new kq(string));
		if (akf2 == null) {
			throw new IllegalStateException("Invalid Biome requested: " + string);
		} else {
			return akf2;
		}
	}

	static {
		if (!kt.a()) {
			throw new RuntimeException("Accessed Biomes before Bootstrap!");
		} else {
			a = a("ocean");
			b = a;
			c = a("plains");
			d = a("desert");
			e = a("extreme_hills");
			f = a("forest");
			g = a("taiga");
			h = a("swampland");
			i = a("river");
			j = a("hell");
			k = a("sky");
			l = a("frozen_ocean");
			m = a("frozen_river");
			n = a("ice_flats");
			o = a("ice_mountains");
			p = a("mushroom_island");
			q = a("mushroom_island_shore");
			r = a("beaches");
			s = a("desert_hills");
			t = a("forest_hills");
			u = a("taiga_hills");
			v = a("smaller_extreme_hills");
			w = a("jungle");
			x = a("jungle_hills");
			y = a("jungle_edge");
			z = a("deep_ocean");
			A = a("stone_beach");
			B = a("cold_beach");
			C = a("birch_forest");
			D = a("birch_forest_hills");
			E = a("roofed_forest");
			F = a("taiga_cold");
			G = a("taiga_cold_hills");
			H = a("redwood_taiga");
			I = a("redwood_taiga_hills");
			J = a("extreme_hills_with_trees");
			K = a("savanna");
			L = a("savanna_rock");
			M = a("mesa");
			N = a("mesa_rock");
			O = a("mesa_clear_rock");
			P = a("void");
			Q = a("mutated_plains");
			R = a("mutated_desert");
			S = a("mutated_extreme_hills");
			T = a("mutated_forest");
			U = a("mutated_taiga");
			V = a("mutated_swampland");
			W = a("mutated_ice_flats");
			X = a("mutated_jungle");
			Y = a("mutated_jungle_edge");
			Z = a("mutated_birch_forest");
			aa = a("mutated_birch_forest_hills");
			ab = a("mutated_roofed_forest");
			ac = a("mutated_taiga_cold");
			ad = a("mutated_redwood_taiga");
			ae = a("mutated_redwood_taiga_hills");
			af = a("mutated_extreme_hills_with_trees");
			ag = a("mutated_savanna");
			ah = a("mutated_savanna_rock");
			ai = a("mutated_mesa");
			aj = a("mutated_mesa_rock");
			ak = a("mutated_mesa_clear_rock");
		}
	}
}
