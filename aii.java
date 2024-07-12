import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public abstract class aii {
	public static final dc<kq, aii> b = new dc<>();
	private final ss[] a;
	private final aii.a e;
	public aij c;
	protected String d;

	@Nullable
	public static aii c(int integer) {
		return b.a(integer);
	}

	public static int b(aii aii) {
		return b.a(aii);
	}

	@Nullable
	public static aii b(String string) {
		return b.c(new kq(string));
	}

	protected aii(aii.a a, aij aij, ss[] arr) {
		this.e = a;
		this.c = aij;
		this.a = arr;
	}

	public List<afj> a(sw sw) {
		List<afj> list3 = Lists.newArrayList();

		for (ss ss7 : this.a) {
			afj afj8 = sw.b(ss7);
			if (!afj8.b()) {
				list3.add(afj8);
			}
		}

		return list3;
	}

	public aii.a e() {
		return this.e;
	}

	public int f() {
		return 1;
	}

	public int b() {
		return 1;
	}

	public int a(int integer) {
		return 1 + integer * 10;
	}

	public int b(int integer) {
		return this.a(integer) + 5;
	}

	public int a(int integer, ry ry) {
		return 0;
	}

	public float a(int integer, tb tb) {
		return 0.0F;
	}

	public final boolean c(aii aii) {
		return this.a(aii) && aii.a(this);
	}

	protected boolean a(aii aii) {
		return this != aii;
	}

	public aii c(String string) {
		this.d = string;
		return this;
	}

	public String a() {
		return "enchantment." + this.d;
	}

	public String d(int integer) {
		String string3 = dp.a(this.a());
		if (this.d()) {
			string3 = a.RED + string3;
		}

		return integer == 1 && this.b() == 1 ? string3 : string3 + " " + dp.a("enchantment.level." + integer);
	}

	public boolean a(afj afj) {
		return this.c.a(afj.c());
	}

	public void a(sw sw, sn sn, int integer) {
	}

	public void b(sw sw, sn sn, int integer) {
	}

	public boolean c() {
		return false;
	}

	public boolean d() {
		return false;
	}

	public static void g() {
		ss[] arr1 = new ss[]{ss.HEAD, ss.CHEST, ss.LEGS, ss.FEET};
		b.a(0, new kq("protection"), new aiu(aii.a.COMMON, aiu.a.ALL, arr1));
		b.a(1, new kq("fire_protection"), new aiu(aii.a.UNCOMMON, aiu.a.FIRE, arr1));
		b.a(2, new kq("feather_falling"), new aiu(aii.a.UNCOMMON, aiu.a.FALL, arr1));
		b.a(3, new kq("blast_protection"), new aiu(aii.a.RARE, aiu.a.EXPLOSION, arr1));
		b.a(4, new kq("projectile_protection"), new aiu(aii.a.UNCOMMON, aiu.a.PROJECTILE, arr1));
		b.a(5, new kq("respiration"), new ait(aii.a.RARE, arr1));
		b.a(6, new kq("aqua_affinity"), new aja(aii.a.RARE, arr1));
		b.a(7, new kq("thorns"), new aiw(aii.a.VERY_RARE, arr1));
		b.a(8, new kq("depth_strider"), new aiz(aii.a.RARE, arr1));
		b.a(9, new kq("frost_walker"), new aip(aii.a.RARE, ss.FEET));
		b.a(10, new kq("binding_curse"), new aie(aii.a.VERY_RARE, arr1));
		b.a(16, new kq("sharpness"), new aif(aii.a.COMMON, 0, ss.MAINHAND));
		b.a(17, new kq("smite"), new aif(aii.a.UNCOMMON, 1, ss.MAINHAND));
		b.a(18, new kq("bane_of_arthropods"), new aif(aii.a.UNCOMMON, 2, ss.MAINHAND));
		b.a(19, new kq("knockback"), new aiq(aii.a.UNCOMMON, ss.MAINHAND));
		b.a(20, new kq("fire_aspect"), new ain(aii.a.RARE, ss.MAINHAND));
		b.a(21, new kq("looting"), new air(aii.a.RARE, aij.WEAPON, ss.MAINHAND));
		b.a(22, new kq("sweeping"), new aiv(aii.a.RARE, ss.MAINHAND));
		b.a(32, new kq("efficiency"), new aih(aii.a.COMMON, ss.MAINHAND));
		b.a(33, new kq("silk_touch"), new aix(aii.a.VERY_RARE, ss.MAINHAND));
		b.a(34, new kq("unbreaking"), new aig(aii.a.UNCOMMON, ss.MAINHAND));
		b.a(35, new kq("fortune"), new air(aii.a.RARE, aij.DIGGER, ss.MAINHAND));
		b.a(48, new kq("power"), new aia(aii.a.COMMON, ss.MAINHAND));
		b.a(49, new kq("punch"), new aid(aii.a.RARE, ss.MAINHAND));
		b.a(50, new kq("flame"), new aib(aii.a.RARE, ss.MAINHAND));
		b.a(51, new kq("infinity"), new aic(aii.a.VERY_RARE, ss.MAINHAND));
		b.a(61, new kq("luck_of_the_sea"), new air(aii.a.RARE, aij.FISHING_ROD, ss.MAINHAND));
		b.a(62, new kq("lure"), new aio(aii.a.RARE, aij.FISHING_ROD, ss.MAINHAND));
		b.a(70, new kq("mending"), new ais(aii.a.RARE, ss.values()));
		b.a(71, new kq("vanishing_curse"), new aiy(aii.a.VERY_RARE, ss.values()));
	}

	public static enum a {
		COMMON(10),
		UNCOMMON(5),
		RARE(2),
		VERY_RARE(1);

		private final int e;

		private a(int integer3) {
			this.e = integer3;
		}

		public int a() {
			return this.e;
		}
	}
}
