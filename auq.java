import javax.annotation.Nullable;

public class auq implements aus {
	private final atl[] a;
	private final aut b;
	private final int c;
	private int d;

	public auq(int integer, aut aut) {
		this.a = new atl[1 << integer];
		this.c = integer;
		this.b = aut;
	}

	@Override
	public int a(atl atl) {
		for (int integer3 = 0; integer3 < this.d; integer3++) {
			if (this.a[integer3] == atl) {
				return integer3;
			}
		}

		int integer3x = this.d;
		if (integer3x < this.a.length) {
			this.a[integer3x] = atl;
			this.d++;
			return integer3x;
		} else {
			return this.b.a(this.c + 1, atl);
		}
	}

	@Nullable
	@Override
	public atl a(int integer) {
		return integer >= 0 && integer < this.d ? this.a[integer] : null;
	}

	@Override
	public void a(et et) {
		this.d = et.g();

		for (int integer3 = 0; integer3 < this.d; integer3++) {
			this.a[integer3] = alu.i.a(et.g());
		}
	}

	@Override
	public void b(et et) {
		et.d(this.d);

		for (int integer3 = 0; integer3 < this.d; integer3++) {
			et.d(alu.i.a(this.a[integer3]));
		}
	}

	@Override
	public int a() {
		int integer2 = et.a(this.d);

		for (int integer3 = 0; integer3 < this.d; integer3++) {
			integer2 += et.a(alu.i.a(this.a[integer3]));
		}

		return integer2;
	}
}
