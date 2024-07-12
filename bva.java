public class bva extends bvq<zw> {
	private static final kq a = new kq("textures/entity/zombie/zombie.png");
	private final float j;

	public bva(bur bur, float float2) {
		super(bur, new bnb(), 0.5F * float2);
		this.j = float2;
		this.a(new bxl(this));
		this.a(new bxk(this) {
			@Override
			protected void L_() {
				this.c = new bnb(0.5F, true);
				this.d = new bnb(1.0F, true);
			}
		});
	}

	@Override
	public void M_() {
		bqg.c(0.0F, 0.1875F, 0.0F);
	}

	protected void a(zw zw, float float2) {
		bqg.b(this.j, this.j, this.j);
	}

	protected kq a(zw zw) {
		return a;
	}
}
