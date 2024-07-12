import java.util.List;

public abstract class bjt extends bfy {
	protected final bes u;
	protected final List<bjn> v;

	public bjt(bes bes, int integer2, int integer3, List<bjn> list) {
		super(bes, integer2, integer3, 32, integer3 - 55 + 4, 36);
		this.u = bes;
		this.v = list;
		this.k = false;
		this.a(true, (int)((float)bes.k.a * 1.5F));
	}

	@Override
	protected void a(int integer1, int integer2, bqs bqs) {
		String string5 = a.UNDERLINE + "" + a.BOLD + this.e();
		this.u.k.a(string5, integer1 + this.b / 2 - this.u.k.a(string5) / 2, Math.min(this.d + 3, integer2), 16777215);
	}

	protected abstract String e();

	public List<bjn> f() {
		return this.v;
	}

	@Override
	protected int b() {
		return this.f().size();
	}

	public bjn b(int integer) {
		return (bjn)this.f().get(integer);
	}

	@Override
	public int c() {
		return this.b;
	}

	@Override
	protected int d() {
		return this.f - 6;
	}
}
