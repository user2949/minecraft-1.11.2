import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class ik implements fm<fp> {
	private int a;
	private final List<ik.a> b = Lists.newArrayList();

	public ik() {
	}

	public ik(int integer, Collection<tk> collection) {
		this.a = integer;

		for (tk tk5 : collection) {
			this.b.add(new ik.a(tk5.a().a(), tk5.b(), tk5.c()));
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		int integer3 = et.readInt();

		for (int integer4 = 0; integer4 < integer3; integer4++) {
			String string5 = et.e(64);
			double double6 = et.readDouble();
			List<tl> list8 = Lists.newArrayList();
			int integer9 = et.g();

			for (int integer10 = 0; integer10 < integer9; integer10++) {
				UUID uUID11 = et.i();
				list8.add(new tl(uUID11, "Unknown synced attribute modifier", et.readDouble(), et.readByte()));
			}

			this.b.add(new ik.a(string5, double6, list8));
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.writeInt(this.b.size());

		for (ik.a a4 : this.b) {
			et.a(a4.a());
			et.writeDouble(a4.b());
			et.d(a4.c().size());

			for (tl tl6 : a4.c()) {
				et.a(tl6.a());
				et.writeDouble(tl6.d());
				et.writeByte(tl6.c());
			}
		}
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public int a() {
		return this.a;
	}

	public List<ik.a> b() {
		return this.b;
	}

	public class a {
		private final String b;
		private final double c;
		private final Collection<tl> d;

		public a(String string, double double3, Collection<tl> collection) {
			this.b = string;
			this.c = double3;
			this.d = collection;
		}

		public String a() {
			return this.b;
		}

		public double b() {
			return this.c;
		}

		public Collection<tl> c() {
			return this.d;
		}
	}
}
