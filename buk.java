import javax.annotation.Nullable;

public class buk extends bus<sn> {
	public buk(bur bur) {
		super(bur);
	}

	@Override
	public void a(sn sn, double double2, double double3, double double4, float float5, float float6) {
		bqg.G();
		a(sn.bo(), double2 - sn.M, double3 - sn.N, double4 - sn.O);
		bqg.H();
		super.a(sn, double2, double3, double4, float5, float6);
	}

	@Nullable
	@Override
	protected kq a(sn sn) {
		return null;
	}
}
