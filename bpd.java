import java.util.Random;

public class bpd extends bou {
	private static final Random a = new Random();
	private int b = 128;

	protected bpd(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4, 0.5 - a.nextDouble(), double6, 0.5 - a.nextDouble());
		this.k *= 0.2F;
		if (double5 == 0.0 && double7 == 0.0) {
			this.j *= 0.1F;
			this.l *= 0.1F;
		}

		this.y *= 0.75F;
		this.x = (int)(8.0 / (Math.random() * 0.8 + 0.2));
	}

	@Override
	public boolean c() {
		return true;
	}

	@Override
	public void a() {
		this.d = this.g;
		this.e = this.h;
		this.f = this.i;
		if (this.w++ >= this.x) {
			this.i();
		}

		this.b(this.b + (7 - this.w * 8 / this.x));
		this.k += 0.004;
		this.a(this.j, this.k, this.l);
		if (this.h == this.e) {
			this.j *= 1.1;
			this.l *= 1.1;
		}

		this.j *= 0.96F;
		this.k *= 0.96F;
		this.l *= 0.96F;
		if (this.m) {
			this.j *= 0.7F;
			this.l *= 0.7F;
		}
	}

	public void c(int integer) {
		this.b = integer;
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			bou bou17 = new bpd(ajs, double3, double4, double5, double6, double7, double8);
			bou17.e(0.15F);
			bou17.a((float)double6, (float)double7, (float)double8);
			return bou17;
		}
	}

	public static class b implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			bou bou17 = new bpd(ajs, double3, double4, double5, double6, double7, double8);
			((bpd)bou17).c(144);
			return bou17;
		}
	}

	public static class c implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			bou bou17 = new bpd(ajs, double3, double4, double5, double6, double7, double8);
			bou17.a((float)double6, (float)double7, (float)double8);
			return bou17;
		}
	}

	public static class d implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bpd(ajs, double3, double4, double5, double6, double7, double8);
		}
	}

	public static class e implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			bou bou17 = new bpd(ajs, double3, double4, double5, double6, double7, double8);
			((bpd)bou17).c(144);
			float float18 = ajs.r.nextFloat() * 0.5F + 0.35F;
			bou17.a(1.0F * float18, 0.0F * float18, 1.0F * float18);
			return bou17;
		}
	}
}
