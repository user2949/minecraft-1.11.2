import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class agy {
	private static final kq b = new kq("empty");
	public static final ct<kq, agy> a = new ct<>(b);
	private static int c;
	private final String d;
	private final ImmutableList<sh> e;

	@Nullable
	public static agy a(String string) {
		return a.c(new kq(string));
	}

	public agy(sh... arr) {
		this(null, arr);
	}

	public agy(@Nullable String string, sh... arr) {
		this.d = string;
		this.e = ImmutableList.copyOf(arr);
	}

	public String b(String string) {
		return this.d == null ? string + a.b(this).a() : string + this.d;
	}

	public List<sh> a() {
		return this.e;
	}

	public static void b() {
		a("empty", new agy());
		a("water", new agy());
		a("mundane", new agy());
		a("thick", new agy());
		a("awkward", new agy());
		a("night_vision", new agy(new sh(si.p, 3600)));
		a("long_night_vision", new agy("night_vision", new sh(si.p, 9600)));
		a("invisibility", new agy(new sh(si.n, 3600)));
		a("long_invisibility", new agy("invisibility", new sh(si.n, 9600)));
		a("leaping", new agy(new sh(si.h, 3600)));
		a("long_leaping", new agy("leaping", new sh(si.h, 9600)));
		a("strong_leaping", new agy("leaping", new sh(si.h, 1800, 1)));
		a("fire_resistance", new agy(new sh(si.l, 3600)));
		a("long_fire_resistance", new agy("fire_resistance", new sh(si.l, 9600)));
		a("swiftness", new agy(new sh(si.a, 3600)));
		a("long_swiftness", new agy("swiftness", new sh(si.a, 9600)));
		a("strong_swiftness", new agy("swiftness", new sh(si.a, 1800, 1)));
		a("slowness", new agy(new sh(si.b, 1800)));
		a("long_slowness", new agy("slowness", new sh(si.b, 4800)));
		a("water_breathing", new agy(new sh(si.m, 3600)));
		a("long_water_breathing", new agy("water_breathing", new sh(si.m, 9600)));
		a("healing", new agy(new sh(si.f, 1)));
		a("strong_healing", new agy("healing", new sh(si.f, 1, 1)));
		a("harming", new agy(new sh(si.g, 1)));
		a("strong_harming", new agy("harming", new sh(si.g, 1, 1)));
		a("poison", new agy(new sh(si.s, 900)));
		a("long_poison", new agy("poison", new sh(si.s, 1800)));
		a("strong_poison", new agy("poison", new sh(si.s, 432, 1)));
		a("regeneration", new agy(new sh(si.j, 900)));
		a("long_regeneration", new agy("regeneration", new sh(si.j, 1800)));
		a("strong_regeneration", new agy("regeneration", new sh(si.j, 450, 1)));
		a("strength", new agy(new sh(si.e, 3600)));
		a("long_strength", new agy("strength", new sh(si.e, 9600)));
		a("strong_strength", new agy("strength", new sh(si.e, 1800, 1)));
		a("weakness", new agy(new sh(si.r, 1800)));
		a("long_weakness", new agy("weakness", new sh(si.r, 4800)));
		a("luck", new agy("luck", new sh(si.z, 6000)));
		a.a();
	}

	protected static void a(String string, agy agy) {
		a.a(c++, new kq(string), agy);
	}

	public boolean c() {
		if (!this.e.isEmpty()) {
			UnmodifiableIterator var1 = this.e.iterator();

			while (var1.hasNext()) {
				sh sh3 = (sh)var1.next();
				if (sh3.a().b()) {
					return true;
				}
			}
		}

		return false;
	}
}
