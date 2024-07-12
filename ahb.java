import com.google.common.collect.Sets;
import java.util.Set;

public class ahb {
	private static final Set<agy> K;
	public static final agy a;
	public static final agy b;
	public static final agy c;
	public static final agy d;
	public static final agy e;
	public static final agy f;
	public static final agy g;
	public static final agy h;
	public static final agy i;
	public static final agy j;
	public static final agy k;
	public static final agy l;
	public static final agy m;
	public static final agy n;
	public static final agy o;
	public static final agy p;
	public static final agy q;
	public static final agy r;
	public static final agy s;
	public static final agy t;
	public static final agy u;
	public static final agy v;
	public static final agy w;
	public static final agy x;
	public static final agy y;
	public static final agy z;
	public static final agy A;
	public static final agy B;
	public static final agy C;
	public static final agy D;
	public static final agy E;
	public static final agy F;
	public static final agy G;
	public static final agy H;
	public static final agy I;
	public static final agy J;

	private static agy a(String string) {
		agy agy2 = agy.a.c(new kq(string));
		if (!K.add(agy2)) {
			throw new IllegalStateException("Invalid Potion requested: " + string);
		} else {
			return agy2;
		}
	}

	static {
		if (!kt.a()) {
			throw new RuntimeException("Accessed Potions before Bootstrap!");
		} else {
			K = Sets.newHashSet();
			a = a("empty");
			b = a("water");
			c = a("mundane");
			d = a("thick");
			e = a("awkward");
			f = a("night_vision");
			g = a("long_night_vision");
			h = a("invisibility");
			i = a("long_invisibility");
			j = a("leaping");
			k = a("long_leaping");
			l = a("strong_leaping");
			m = a("fire_resistance");
			n = a("long_fire_resistance");
			o = a("swiftness");
			p = a("long_swiftness");
			q = a("strong_swiftness");
			r = a("slowness");
			s = a("long_slowness");
			t = a("water_breathing");
			u = a("long_water_breathing");
			v = a("healing");
			w = a("strong_healing");
			x = a("harming");
			y = a("strong_harming");
			z = a("poison");
			A = a("long_poison");
			B = a("strong_poison");
			C = a("regeneration");
			D = a("long_regeneration");
			E = a("strong_regeneration");
			F = a("strength");
			G = a("long_strength");
			H = a("strong_strength");
			I = a("weakness");
			J = a("long_weakness");
			K.clear();
		}
	}
}
