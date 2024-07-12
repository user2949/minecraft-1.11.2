import java.io.IOException;

public class ib implements fm<fp> {
	private String a = "";
	private String b = "";
	private int c;
	private ib.a d;

	public ib() {
	}

	public ib(bea bea) {
		this.a = bea.e();
		this.b = bea.d().b();
		this.c = bea.c();
		this.d = ib.a.CHANGE;
	}

	public ib(String string) {
		this.a = string;
		this.b = "";
		this.c = 0;
		this.d = ib.a.REMOVE;
	}

	public ib(String string, bdy bdy) {
		this.a = string;
		this.b = bdy.b();
		this.c = 0;
		this.d = ib.a.REMOVE;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e(40);
		this.d = et.a(ib.a.class);
		this.b = et.e(16);
		if (this.d != ib.a.REMOVE) {
			this.c = et.g();
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.a(this.d);
		et.a(this.b);
		if (this.d != ib.a.REMOVE) {
			et.d(this.c);
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

	public int c() {
		return this.c;
	}

	public ib.a d() {
		return this.d;
	}

	public static enum a {
		CHANGE,
		REMOVE;
	}
}
