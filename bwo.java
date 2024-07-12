public class bwo extends bvd<aak> {
	private static final kq a = new kq("textures/entity/illager/vex.png");
	private static final kq j = new kq("textures/entity/illager/vex_charging.png");
	private int k = ((bmt)this.f).a();

	public bwo(bur bur) {
		super(bur, new bmt(), 0.3F);
	}

	protected kq a(aak aak) {
		return aak.dj() ? j : a;
	}

	public void a(aak aak, double double2, double double3, double double4, float float5, float float6) {
		int integer11 = ((bmt)this.f).a();
		if (integer11 != this.k) {
			this.f = new bmt();
			this.k = integer11;
		}

		super.a(aak, double2, double3, double4, float5, float6);
	}

	protected void a(aak aak, float float2) {
		bqg.b(0.4F, 0.4F, 0.4F);
	}
}
