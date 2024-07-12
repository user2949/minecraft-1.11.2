public class bwc extends bvd<zm> {
	private static final kq a = new kq("textures/entity/skeleton/skeleton.png");

	public bwc(bur bur) {
		super(bur, new bml(), 0.5F);
		this.a(new bxl(this));
		this.a(new bxk(this) {
			@Override
			protected void L_() {
				this.c = new bml(0.5F, true);
				this.d = new bml(1.0F, true);
			}
		});
	}

	@Override
	public void M_() {
		bqg.c(0.09375F, 0.1875F, 0.0F);
	}

	protected kq a(zm zm) {
		return a;
	}
}
