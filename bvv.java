public class bvv extends bvd<aab> {
	private static final kq a = new kq("textures/entity/zombie_pigman.png");

	public bvv(bur bur) {
		super(bur, new bnb(), 0.5F);
		this.a(new bxk(this) {
			@Override
			protected void L_() {
				this.c = new bnb(0.5F, true);
				this.d = new bnb(1.0F, true);
			}
		});
	}

	protected kq a(aab aab) {
		return a;
	}
}
