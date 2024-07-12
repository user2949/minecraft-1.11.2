import javax.annotation.Nullable;

public class aim {
	public static final aii a = a("protection");
	public static final aii b = a("fire_protection");
	public static final aii c = a("feather_falling");
	public static final aii d = a("blast_protection");
	public static final aii e = a("projectile_protection");
	public static final aii f = a("respiration");
	public static final aii g = a("aqua_affinity");
	public static final aii h = a("thorns");
	public static final aii i = a("depth_strider");
	public static final aii j = a("frost_walker");
	public static final aii k = a("binding_curse");
	public static final aii l = a("sharpness");
	public static final aii m = a("smite");
	public static final aii n = a("bane_of_arthropods");
	public static final aii o = a("knockback");
	public static final aii p = a("fire_aspect");
	public static final aii q = a("looting");
	public static final aii r = a("sweeping");
	public static final aii s = a("efficiency");
	public static final aii t = a("silk_touch");
	public static final aii u = a("unbreaking");
	public static final aii v = a("fortune");
	public static final aii w = a("power");
	public static final aii x = a("punch");
	public static final aii y = a("flame");
	public static final aii z = a("infinity");
	public static final aii A = a("luck_of_the_sea");
	public static final aii B = a("lure");
	public static final aii C = a("mending");
	public static final aii D = a("vanishing_curse");

	@Nullable
	private static aii a(String string) {
		aii aii2 = aii.b.c(new kq(string));
		if (aii2 == null) {
			throw new IllegalStateException("Invalid Enchantment requested: " + string);
		} else {
			return aii2;
		}
	}

	static {
		if (!kt.a()) {
			throw new RuntimeException("Accessed Enchantments before Bootstrap!");
		}
	}
}
