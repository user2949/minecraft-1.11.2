import javax.annotation.Nullable;

public class si {
	public static final sg a;
	public static final sg b;
	public static final sg c;
	public static final sg d;
	public static final sg e;
	public static final sg f;
	public static final sg g;
	public static final sg h;
	public static final sg i;
	public static final sg j;
	public static final sg k;
	public static final sg l;
	public static final sg m;
	public static final sg n;
	public static final sg o;
	public static final sg p;
	public static final sg q;
	public static final sg r;
	public static final sg s;
	public static final sg t;
	public static final sg u;
	public static final sg v;
	public static final sg w;
	public static final sg x;
	public static final sg y;
	public static final sg z;
	public static final sg A;

	@Nullable
	private static sg a(String string) {
		sg sg2 = sg.b.c(new kq(string));
		if (sg2 == null) {
			throw new IllegalStateException("Invalid MobEffect requested: " + string);
		} else {
			return sg2;
		}
	}

	static {
		if (!kt.a()) {
			throw new RuntimeException("Accessed MobEffects before Bootstrap!");
		} else {
			a = a("speed");
			b = a("slowness");
			c = a("haste");
			d = a("mining_fatigue");
			e = a("strength");
			f = a("instant_health");
			g = a("instant_damage");
			h = a("jump_boost");
			i = a("nausea");
			j = a("regeneration");
			k = a("resistance");
			l = a("fire_resistance");
			m = a("water_breathing");
			n = a("invisibility");
			o = a("blindness");
			p = a("night_vision");
			q = a("hunger");
			r = a("weakness");
			s = a("poison");
			t = a("wither");
			u = a("health_boost");
			v = a("absorption");
			w = a("saturation");
			x = a("glowing");
			y = a("levitation");
			z = a("luck");
			A = a("unluck");
		}
	}
}
