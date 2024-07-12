import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;

public class ia implements fm<fp> {
	private String a = "";
	private String b = "";
	private String c = "";
	private String d = "";
	private String e;
	private String f;
	private int g;
	private final Collection<String> h;
	private int i;
	private int j;

	public ia() {
		this.e = bee.b.ALWAYS.e;
		this.f = bee.a.ALWAYS.e;
		this.g = -1;
		this.h = Lists.newArrayList();
	}

	public ia(bdz bdz, int integer) {
		this.e = bee.b.ALWAYS.e;
		this.f = bee.a.ALWAYS.e;
		this.g = -1;
		this.h = Lists.newArrayList();
		this.a = bdz.b();
		this.i = integer;
		if (integer == 0 || integer == 2) {
			this.b = bdz.c();
			this.c = bdz.e();
			this.d = bdz.f();
			this.j = bdz.l();
			this.e = bdz.i().e;
			this.f = bdz.k().e;
			this.g = bdz.m().b();
		}

		if (integer == 0) {
			this.h.addAll(bdz.d());
		}
	}

	public ia(bdz bdz, Collection<String> collection, int integer) {
		this.e = bee.b.ALWAYS.e;
		this.f = bee.a.ALWAYS.e;
		this.g = -1;
		this.h = Lists.newArrayList();
		if (integer != 3 && integer != 4) {
			throw new IllegalArgumentException("Method must be join or leave for player constructor");
		} else if (collection != null && !collection.isEmpty()) {
			this.i = integer;
			this.a = bdz.b();
			this.h.addAll(collection);
		} else {
			throw new IllegalArgumentException("Players cannot be null/empty");
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e(16);
		this.i = et.readByte();
		if (this.i == 0 || this.i == 2) {
			this.b = et.e(32);
			this.c = et.e(16);
			this.d = et.e(16);
			this.j = et.readByte();
			this.e = et.e(32);
			this.f = et.e(32);
			this.g = et.readByte();
		}

		if (this.i == 0 || this.i == 3 || this.i == 4) {
			int integer3 = et.g();

			for (int integer4 = 0; integer4 < integer3; integer4++) {
				this.h.add(et.e(40));
			}
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.writeByte(this.i);
		if (this.i == 0 || this.i == 2) {
			et.a(this.b);
			et.a(this.c);
			et.a(this.d);
			et.writeByte(this.j);
			et.a(this.e);
			et.a(this.f);
			et.writeByte(this.g);
		}

		if (this.i == 0 || this.i == 3 || this.i == 4) {
			et.d(this.h.size());

			for (String string4 : this.h) {
				et.a(string4);
			}
		}
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public String a() {
		return this.a;
	}

	public String b() {
		return this.b;
	}

	public String c() {
		return this.c;
	}

	public String d() {
		return this.d;
	}

	public Collection<String> e() {
		return this.h;
	}

	public int f() {
		return this.i;
	}

	public int g() {
		return this.j;
	}

	public int h() {
		return this.g;
	}

	public String i() {
		return this.e;
	}

	public String j() {
		return this.f;
	}
}
