import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;

public enum cv implements ox {
	DOWN(0, 1, -1, "down", cv.b.NEGATIVE, cv.a.Y, new dl(0, -1, 0)),
	UP(1, 0, -1, "up", cv.b.POSITIVE, cv.a.Y, new dl(0, 1, 0)),
	NORTH(2, 3, 2, "north", cv.b.NEGATIVE, cv.a.Z, new dl(0, 0, -1)),
	SOUTH(3, 2, 0, "south", cv.b.POSITIVE, cv.a.Z, new dl(0, 0, 1)),
	WEST(4, 5, 1, "west", cv.b.NEGATIVE, cv.a.X, new dl(-1, 0, 0)),
	EAST(5, 4, 3, "east", cv.b.POSITIVE, cv.a.X, new dl(1, 0, 0));

	private final int g;
	private final int h;
	private final int i;
	private final String j;
	private final cv.a k;
	private final cv.b l;
	private final dl m;
	private static final cv[] n = new cv[6];
	private static final cv[] o = new cv[4];
	private static final Map<String, cv> p = Maps.newHashMap();

	private cv(int integer3, int integer4, int integer5, String string6, cv.b b, cv.a a, dl dl) {
		this.g = integer3;
		this.i = integer5;
		this.h = integer4;
		this.j = string6;
		this.k = a;
		this.l = b;
		this.m = dl;
	}

	public int a() {
		return this.g;
	}

	public int b() {
		return this.i;
	}

	public cv.b c() {
		return this.l;
	}

	public cv d() {
		return a(this.h);
	}

	public cv a(cv.a a) {
		switch (a) {
			case X:
				if (this != WEST && this != EAST) {
					return this.o();
				}

				return this;
			case Y:
				if (this != UP && this != DOWN) {
					return this.e();
				}

				return this;
			case Z:
				if (this != NORTH && this != SOUTH) {
					return this.q();
				}

				return this;
			default:
				throw new IllegalStateException("Unable to get CW facing for axis " + a);
		}
	}

	public cv e() {
		switch (this) {
			case NORTH:
				return EAST;
			case EAST:
				return SOUTH;
			case SOUTH:
				return WEST;
			case WEST:
				return NORTH;
			default:
				throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
		}
	}

	private cv o() {
		switch (this) {
			case NORTH:
				return DOWN;
			case EAST:
			case WEST:
			default:
				throw new IllegalStateException("Unable to get X-rotated facing of " + this);
			case SOUTH:
				return UP;
			case UP:
				return NORTH;
			case DOWN:
				return SOUTH;
		}
	}

	private cv q() {
		switch (this) {
			case EAST:
				return DOWN;
			case SOUTH:
			default:
				throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
			case WEST:
				return UP;
			case UP:
				return EAST;
			case DOWN:
				return WEST;
		}
	}

	public cv f() {
		switch (this) {
			case NORTH:
				return WEST;
			case EAST:
				return NORTH;
			case SOUTH:
				return EAST;
			case WEST:
				return SOUTH;
			default:
				throw new IllegalStateException("Unable to get CCW facing of " + this);
		}
	}

	public int g() {
		return this.k == cv.a.X ? this.l.a() : 0;
	}

	public int h() {
		return this.k == cv.a.Y ? this.l.a() : 0;
	}

	public int i() {
		return this.k == cv.a.Z ? this.l.a() : 0;
	}

	public String j() {
		return this.j;
	}

	public cv.a k() {
		return this.k;
	}

	@Nullable
	public static cv a(String string) {
		return string == null ? null : (cv)p.get(string.toLowerCase(Locale.ROOT));
	}

	public static cv a(int integer) {
		return n[ot.a(integer % n.length)];
	}

	public static cv b(int integer) {
		return o[ot.a(integer % o.length)];
	}

	public static cv a(double double1) {
		return b(ot.c(double1 / 90.0 + 0.5) & 3);
	}

	public float l() {
		return (float)((this.i & 3) * 90);
	}

	public static cv a(Random random) {
		return values()[random.nextInt(values().length)];
	}

	public static cv a(float float1, float float2, float float3) {
		cv cv4 = NORTH;
		float float5 = Float.MIN_VALUE;

		for (cv cv9 : values()) {
			float float10 = float1 * (float)cv9.m.p() + float2 * (float)cv9.m.q() + float3 * (float)cv9.m.r();
			if (float10 > float5) {
				float5 = float10;
				cv4 = cv9;
			}
		}

		return cv4;
	}

	public String toString() {
		return this.j;
	}

	@Override
	public String m() {
		return this.j;
	}

	public static cv a(cv.b b, cv.a a) {
		for (cv cv6 : values()) {
			if (cv6.c() == b && cv6.k() == a) {
				return cv6;
			}
		}

		throw new IllegalArgumentException("No such direction: " + b + " " + a);
	}

	public static cv a(co co, sw sw) {
		if (Math.abs(sw.p - (double)((float)co.p() + 0.5F)) < 2.0 && Math.abs(sw.r - (double)((float)co.r() + 0.5F)) < 2.0) {
			double double3 = sw.q + (double)sw.bq();
			if (double3 - (double)co.q() > 2.0) {
				return UP;
			}

			if ((double)co.q() - double3 > 0.0) {
				return DOWN;
			}
		}

		return sw.bl().d();
	}

	public dl n() {
		return this.m;
	}

	static {
		for (cv cv4 : values()) {
			n[cv4.g] = cv4;
			if (cv4.k().c()) {
				o[cv4.i] = cv4;
			}

			p.put(cv4.j().toLowerCase(Locale.ROOT), cv4);
		}
	}

	public static enum a implements Predicate<cv>, ox {
		X("x", cv.c.HORIZONTAL),
		Y("y", cv.c.VERTICAL),
		Z("z", cv.c.HORIZONTAL);

		private static final Map<String, cv.a> d = Maps.newHashMap();
		private final String e;
		private final cv.c f;

		private a(String string3, cv.c c) {
			this.e = string3;
			this.f = c;
		}

		@Nullable
		public static cv.a a(String string) {
			return string == null ? null : (cv.a)d.get(string.toLowerCase(Locale.ROOT));
		}

		public String a() {
			return this.e;
		}

		public boolean b() {
			return this.f == cv.c.VERTICAL;
		}

		public boolean c() {
			return this.f == cv.c.HORIZONTAL;
		}

		public String toString() {
			return this.e;
		}

		public boolean apply(@Nullable cv cv) {
			return cv != null && cv.k() == this;
		}

		public cv.c d() {
			return this.f;
		}

		@Override
		public String m() {
			return this.e;
		}

		static {
			for (cv.a a4 : values()) {
				d.put(a4.a().toLowerCase(Locale.ROOT), a4);
			}
		}
	}

	public static enum b {
		POSITIVE(1, "Towards positive"),
		NEGATIVE(-1, "Towards negative");

		private final int c;
		private final String d;

		private b(int integer3, String string4) {
			this.c = integer3;
			this.d = string4;
		}

		public int a() {
			return this.c;
		}

		public String toString() {
			return this.d;
		}
	}

	public static enum c implements Predicate<cv>, Iterable<cv> {
		HORIZONTAL,
		VERTICAL;

		public cv[] a() {
			switch (this) {
				case HORIZONTAL:
					return new cv[]{cv.NORTH, cv.EAST, cv.SOUTH, cv.WEST};
				case VERTICAL:
					return new cv[]{cv.UP, cv.DOWN};
				default:
					throw new Error("Someone's been tampering with the universe!");
			}
		}

		public cv a(Random random) {
			cv[] arr3 = this.a();
			return arr3[random.nextInt(arr3.length)];
		}

		public boolean apply(@Nullable cv cv) {
			return cv != null && cv.k().d() == this;
		}

		public Iterator<cv> iterator() {
			return Iterators.forArray(this.a());
		}
	}
}
