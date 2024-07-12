import java.util.Random;

public class apl extends alu {
	public apl() {
		this(azs.e.r());
	}

	public apl(azt azt) {
		super(azs.e, azt);
		this.a(aej.b);
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		if (this == alv.q) {
			return afl.k;
		} else if (this == alv.ag) {
			return afl.l;
		} else if (this == alv.x) {
			return afl.be;
		} else if (this == alv.bP) {
			return afl.bZ;
		} else {
			return this == alv.co ? afl.cr : afh.a(this);
		}
	}

	@Override
	public int a(Random random) {
		return this == alv.x ? 4 + random.nextInt(5) : 1;
	}

	@Override
	public int a(int integer, Random random) {
		if (integer > 0 && afh.a(this) != this.a((atl)this.s().a().iterator().next(), random, integer)) {
			int integer4 = random.nextInt(integer + 2) - 1;
			if (integer4 < 0) {
				integer4 = 0;
			}

			return this.a(random) * (integer4 + 1);
		} else {
			return this.a(random);
		}
	}

	@Override
	public void a(ajs ajs, co co, atl atl, float float4, int integer) {
		super.a(ajs, co, atl, float4, integer);
		if (this.a(atl, ajs.r, integer) != afh.a(this)) {
			int integer7 = 0;
			if (this == alv.q) {
				integer7 = ot.a(ajs.r, 0, 2);
			} else if (this == alv.ag) {
				integer7 = ot.a(ajs.r, 3, 7);
			} else if (this == alv.bP) {
				integer7 = ot.a(ajs.r, 3, 7);
			} else if (this == alv.x) {
				integer7 = ot.a(ajs.r, 2, 5);
			} else if (this == alv.co) {
				integer7 = ot.a(ajs.r, 2, 5);
			}

			this.b(ajs, co, integer7);
		}
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(this);
	}

	@Override
	public int d(atl atl) {
		return this == alv.x ? aem.BLUE.b() : 0;
	}
}
