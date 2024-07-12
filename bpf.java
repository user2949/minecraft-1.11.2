public class bpf extends bpn {
	protected bpf(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4);
		this.z = 0.04F;
		this.h();
		if (double6 == 0.0 && (double5 != 0.0 || double7 != 0.0)) {
			this.j = double5;
			this.k = double6 + 0.1;
			this.l = double7;
		}
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bpf(ajs, double3, double4, double5, double6, double7, double8);
		}
	}
}
