import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bzk {
	private static final Logger a = LogManager.getLogger();
	private final bzk.a b;
	private final bzk.b c;
	private final int d;
	private final int e;

	public bzk(int integer1, bzk.a a, bzk.b b, int integer4) {
		if (this.a(integer1, b)) {
			this.c = b;
		} else {
			bzk.a.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
			this.c = bzk.b.UV;
		}

		this.b = a;
		this.d = integer1;
		this.e = integer4;
	}

	private final boolean a(int integer, bzk.b b) {
		return integer == 0 || b == bzk.b.UV;
	}

	public final bzk.a a() {
		return this.b;
	}

	public final bzk.b b() {
		return this.c;
	}

	public final int c() {
		return this.e;
	}

	public final int d() {
		return this.d;
	}

	public String toString() {
		return this.e + "," + this.c.a() + "," + this.b.b();
	}

	public final int e() {
		return this.b.a() * this.e;
	}

	public final boolean f() {
		return this.c == bzk.b.POSITION;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (object != null && this.getClass() == object.getClass()) {
			bzk bzk3 = (bzk)object;
			if (this.e != bzk3.e) {
				return false;
			} else if (this.d != bzk3.d) {
				return false;
			} else {
				return this.b != bzk3.b ? false : this.c == bzk3.c;
			}
		} else {
			return false;
		}
	}

	public int hashCode() {
		int integer2 = this.b.hashCode();
		integer2 = 31 * integer2 + this.c.hashCode();
		integer2 = 31 * integer2 + this.d;
		return 31 * integer2 + this.e;
	}

	public static enum a {
		FLOAT(4, "Float", 5126),
		UBYTE(1, "Unsigned Byte", 5121),
		BYTE(1, "Byte", 5120),
		USHORT(2, "Unsigned Short", 5123),
		SHORT(2, "Short", 5122),
		UINT(4, "Unsigned Int", 5125),
		INT(4, "Int", 5124);

		private final int h;
		private final String i;
		private final int j;

		private a(int integer3, String string4, int integer5) {
			this.h = integer3;
			this.i = string4;
			this.j = integer5;
		}

		public int a() {
			return this.h;
		}

		public String b() {
			return this.i;
		}

		public int c() {
			return this.j;
		}
	}

	public static enum b {
		POSITION("Position"),
		NORMAL("Normal"),
		COLOR("Vertex Color"),
		UV("UV"),
		MATRIX("Bone Matrix"),
		BLEND_WEIGHT("Blend Weight"),
		PADDING("Padding");

		private final String h;

		private b(String string3) {
			this.h = string3;
		}

		public String a() {
			return this.h;
		}
	}
}
