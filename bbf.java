import javax.annotation.Nullable;

public class bbf extends bbc {
	@Override
	public bbb b() {
		return this.a(ot.c(this.b.bo().a), ot.c(this.b.bo().b + 0.5), ot.c(this.b.bo().c));
	}

	@Override
	public bbb a(double double1, double double2, double double3) {
		return this.a(ot.c(double1 - (double)(this.b.G / 2.0F)), ot.c(double2 + 0.5), ot.c(double3 - (double)(this.b.G / 2.0F)));
	}

	@Override
	public int a(bbb[] arr, bbb bbb2, bbb bbb3, float float4) {
		int integer6 = 0;

		for (cv cv10 : cv.values()) {
			bbb bbb11 = this.b(bbb2.a + cv10.g(), bbb2.b + cv10.h(), bbb2.c + cv10.i());
			if (bbb11 != null && !bbb11.i && bbb11.a(bbb3) < float4) {
				arr[integer6++] = bbb11;
			}
		}

		return integer6;
	}

	@Override
	public bba a(ajw ajw, int integer2, int integer3, int integer4, sx sx, int integer6, int integer7, int integer8, boolean boolean9, boolean boolean10) {
		return bba.WATER;
	}

	@Override
	public bba a(ajw ajw, int integer2, int integer3, int integer4) {
		return bba.WATER;
	}

	@Nullable
	private bbb b(int integer1, int integer2, int integer3) {
		bba bba5 = this.c(integer1, integer2, integer3);
		return bba5 == bba.WATER ? this.a(integer1, integer2, integer3) : null;
	}

	private bba c(int integer1, int integer2, int integer3) {
		co.a a5 = new co.a();

		for (int integer6 = integer1; integer6 < integer1 + this.d; integer6++) {
			for (int integer7 = integer2; integer7 < integer2 + this.e; integer7++) {
				for (int integer8 = integer3; integer8 < integer3 + this.f; integer8++) {
					atl atl9 = this.a.o(a5.c(integer6, integer7, integer8));
					if (atl9.a() != azs.h) {
						return bba.BLOCKED;
					}
				}
			}
		}

		return bba.WATER;
	}
}
