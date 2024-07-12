import java.util.Arrays;

public class brk extends brd {
	private final byz e;

	public brk(brd brd, byz byz) {
		super(Arrays.copyOf(brd.b(), brd.b().length), brd.b, brl.a(brd.b()), brd.a());
		this.e = byz;
		this.f();
	}

	private void f() {
		for (int integer2 = 0; integer2 < 4; integer2++) {
			int integer3 = 7 * integer2;
			this.a[integer3 + 4] = Float.floatToRawIntBits(this.e.a((double)this.d.a(Float.intBitsToFloat(this.a[integer3 + 4]))));
			this.a[integer3 + 4 + 1] = Float.floatToRawIntBits(this.e.b((double)this.d.b(Float.intBitsToFloat(this.a[integer3 + 4 + 1]))));
		}
	}
}
