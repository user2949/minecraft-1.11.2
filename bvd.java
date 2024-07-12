public class bvd<T extends sx> extends bvq<T> {
	private static final kq a = new kq("textures/entity/steve.png");

	public bvd(bur bur, bln bln, float float3) {
		super(bur, bln, float3);
		this.a(new bxe(bln.e));
		this.a(new bxg(this));
		this.a(new bxl(this));
	}

	protected kq a(T sx) {
		return a;
	}

	@Override
	public void M_() {
		bqg.c(0.0F, 0.1875F, 0.0F);
	}
}
