public class bwx extends bvd<aao> {
	private static final kq a = new kq("textures/entity/zombie/zombie.png");

	public bwx(bur bur) {
		super(bur, new bnb(), 0.5F);
		bxk bxk3 = new bxk(this) {
			@Override
			protected void L_() {
				this.c = new bnb(0.5F, true);
				this.d = new bnb(1.0F, true);
			}
		};
		this.a(bxk3);
	}

	protected kq a(aao aao) {
		return a;
	}
}
