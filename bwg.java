public class bwg<T extends aai> extends bvq<T> {
	private static final kq a = new kq("textures/entity/spider/spider.png");

	public bwg(bur bur) {
		super(bur, new bmp(), 1.0F);
		this.a(new bxt<>(this));
	}

	protected float b(T aai) {
		return 180.0F;
	}

	protected kq a(T aai) {
		return a;
	}
}
