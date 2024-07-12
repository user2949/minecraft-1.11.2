public class aiu extends aii {
	public final aiu.a a;

	public aiu(aii.a a, aiu.a a, ss... arr) {
		super(a, aij.ARMOR, arr);
		this.a = a;
		if (a == aiu.a.FALL) {
			this.c = aij.ARMOR_FEET;
		}
	}

	@Override
	public int a(int integer) {
		return this.a.b() + (integer - 1) * this.a.c();
	}

	@Override
	public int b(int integer) {
		return this.a(integer) + this.a.c();
	}

	@Override
	public int b() {
		return 4;
	}

	@Override
	public int a(int integer, ry ry) {
		if (ry.g()) {
			return 0;
		} else if (this.a == aiu.a.ALL) {
			return integer;
		} else if (this.a == aiu.a.FIRE && ry.o()) {
			return integer * 2;
		} else if (this.a == aiu.a.FALL && ry == ry.k) {
			return integer * 3;
		} else if (this.a == aiu.a.EXPLOSION && ry.c()) {
			return integer * 2;
		} else {
			return this.a == aiu.a.PROJECTILE && ry.a() ? integer * 2 : 0;
		}
	}

	@Override
	public String a() {
		return "enchantment.protect." + this.a.a();
	}

	@Override
	public boolean a(aii aii) {
		if (aii instanceof aiu) {
			aiu aiu3 = (aiu)aii;
			return this.a == aiu3.a ? false : this.a == aiu.a.FALL || aiu3.a == aiu.a.FALL;
		} else {
			return super.a(aii);
		}
	}

	public static int a(sw sw, int integer) {
		int integer3 = aik.a(aim.b, sw);
		if (integer3 > 0) {
			integer -= ot.d((float)integer * (float)integer3 * 0.15F);
		}

		return integer;
	}

	public static double a(sw sw, double double2) {
		int integer4 = aik.a(aim.d, sw);
		if (integer4 > 0) {
			double2 -= (double)ot.c(double2 * (double)((float)integer4 * 0.15F));
		}

		return double2;
	}

	public static enum a {
		ALL("all", 1, 11, 20),
		FIRE("fire", 10, 8, 12),
		FALL("fall", 5, 6, 10),
		EXPLOSION("explosion", 5, 8, 12),
		PROJECTILE("projectile", 3, 6, 15);

		private final String f;
		private final int g;
		private final int h;
		private final int i;

		private a(String string3, int integer4, int integer5, int integer6) {
			this.f = string3;
			this.g = integer4;
			this.h = integer5;
			this.i = integer6;
		}

		public String a() {
			return this.f;
		}

		public int b() {
			return this.g;
		}

		public int c() {
			return this.h;
		}
	}
}
