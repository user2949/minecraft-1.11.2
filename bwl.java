public class bwl extends buc<abu> {
	public static final kq a = new kq("textures/entity/projectiles/arrow.png");
	public static final kq f = new kq("textures/entity/projectiles/tipped_arrow.png");

	public bwl(bur bur) {
		super(bur);
	}

	protected kq a(abu abu) {
		return abu.o() > 0 ? f : a;
	}
}
