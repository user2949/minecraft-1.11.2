import java.io.IOException;
import java.util.Locale;
import javax.annotation.Nullable;

public class ie implements fm<fp> {
	private ie.a a;
	private fb b;
	private int c;
	private int d;
	private int e;

	public ie() {
	}

	public ie(ie.a a, fb fb) {
		this(a, fb, -1, -1, -1);
	}

	public ie(int integer1, int integer2, int integer3) {
		this(ie.a.TIMES, null, integer1, integer2, integer3);
	}

	public ie(ie.a a, @Nullable fb fb, int integer3, int integer4, int integer5) {
		this.a = a;
		this.b = fb;
		this.c = integer3;
		this.d = integer4;
		this.e = integer5;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.a(ie.a.class);
		if (this.a == ie.a.TITLE || this.a == ie.a.SUBTITLE || this.a == ie.a.ACTIONBAR) {
			this.b = et.f();
		}

		if (this.a == ie.a.TIMES) {
			this.c = et.readInt();
			this.d = et.readInt();
			this.e = et.readInt();
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		if (this.a == ie.a.TITLE || this.a == ie.a.SUBTITLE || this.a == ie.a.ACTIONBAR) {
			et.a(this.b);
		}

		if (this.a == ie.a.TIMES) {
			et.writeInt(this.c);
			et.writeInt(this.d);
			et.writeInt(this.e);
		}
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public ie.a a() {
		return this.a;
	}

	public fb b() {
		return this.b;
	}

	public int c() {
		return this.c;
	}

	public int d() {
		return this.d;
	}

	public int e() {
		return this.e;
	}

	public static enum a {
		TITLE,
		SUBTITLE,
		ACTIONBAR,
		TIMES,
		CLEAR,
		RESET;

		public static ie.a a(String string) {
			for (ie.a a5 : values()) {
				if (a5.name().equalsIgnoreCase(string)) {
					return a5;
				}
			}

			return TITLE;
		}

		public static String[] a() {
			String[] arr1 = new String[values().length];
			int integer2 = 0;

			for (ie.a a6 : values()) {
				arr1[integer2++] = a6.name().toLowerCase(Locale.ROOT);
			}

			return arr1;
		}
	}
}
