import java.io.IOException;
import java.util.EnumSet;
import java.util.Set;

public class hh implements fm<fp> {
	private double a;
	private double b;
	private double c;
	private float d;
	private float e;
	private Set<hh.a> f;
	private int g;

	public hh() {
	}

	public hh(double double1, double double2, double double3, float float4, float float5, Set<hh.a> set, int integer) {
		this.a = double1;
		this.b = double2;
		this.c = double3;
		this.d = float4;
		this.e = float5;
		this.f = set;
		this.g = integer;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readDouble();
		this.b = et.readDouble();
		this.c = et.readDouble();
		this.d = et.readFloat();
		this.e = et.readFloat();
		this.f = hh.a.a(et.readUnsignedByte());
		this.g = et.g();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeDouble(this.a);
		et.writeDouble(this.b);
		et.writeDouble(this.c);
		et.writeFloat(this.d);
		et.writeFloat(this.e);
		et.writeByte(hh.a.a(this.f));
		et.d(this.g);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public double a() {
		return this.a;
	}

	public double b() {
		return this.b;
	}

	public double c() {
		return this.c;
	}

	public float d() {
		return this.d;
	}

	public float e() {
		return this.e;
	}

	public int f() {
		return this.g;
	}

	public Set<hh.a> g() {
		return this.f;
	}

	public static enum a {
		X(0),
		Y(1),
		Z(2),
		Y_ROT(3),
		X_ROT(4);

		private final int f;

		private a(int integer3) {
			this.f = integer3;
		}

		private int a() {
			return 1 << this.f;
		}

		private boolean b(int integer) {
			return (integer & this.a()) == this.a();
		}

		public static Set<hh.a> a(int integer) {
			Set<hh.a> set2 = EnumSet.noneOf(hh.a.class);

			for (hh.a a6 : values()) {
				if (a6.b(integer)) {
					set2.add(a6);
				}
			}

			return set2;
		}

		public static int a(Set<hh.a> set) {
			int integer2 = 0;

			for (hh.a a4 : set) {
				integer2 |= a4.a();
			}

			return integer2;
		}
	}
}
