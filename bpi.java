import javax.annotation.Nullable;

public class bpi extends bpj {
	protected bpi(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7, atl atl) {
		super(ajs, double2, double3, double4, double5, double6, double7, atl);
		this.j = double5;
		this.k = double6;
		this.l = double7;
	}

	public static class a implements bow {
		@Nullable
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			atl atl17 = alu.c(arr[0]);
			return atl17.j() == aqf.INVISIBLE ? null : new bpi(ajs, double3, double4, double5, double6, double7, double8, atl17).m();
		}
	}
}
