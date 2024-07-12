import javax.annotation.Nullable;

public class aun implements aus {
	private final oh<atl> a;
	private final aut b;
	private final int c;

	public aun(int integer, aut aut) {
		this.c = integer;
		this.b = aut;
		this.a = new oh<>(1 << integer);
	}

	@Override
	public int a(atl atl) {
		int integer3 = this.a.a(atl);
		if (integer3 == -1) {
			integer3 = this.a.c(atl);
			if (integer3 >= 1 << this.c) {
				integer3 = this.b.a(this.c + 1, atl);
			}
		}

		return integer3;
	}

	@Nullable
	@Override
	public atl a(int integer) {
		return this.a.a(integer);
	}

	@Override
	public void a(et et) {
		this.a.a();
		int integer3 = et.g();

		for (int integer4 = 0; integer4 < integer3; integer4++) {
			this.a.c(alu.i.a(et.g()));
		}
	}

	@Override
	public void b(et et) {
		int integer3 = this.a.b();
		et.d(integer3);

		for (int integer4 = 0; integer4 < integer3; integer4++) {
			et.d(alu.i.a(this.a.a(integer4)));
		}
	}

	@Override
	public int a() {
		int integer2 = et.a(this.a.b());

		for (int integer3 = 0; integer3 < this.a.b(); integer3++) {
			integer2 += et.a(alu.i.a(this.a.a(integer3)));
		}

		return integer2;
	}
}
