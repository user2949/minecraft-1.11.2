public class bvs extends bvq<xb> {
	private static final kq a = new kq("textures/entity/cat/black.png");
	private static final kq j = new kq("textures/entity/cat/ocelot.png");
	private static final kq k = new kq("textures/entity/cat/red.png");
	private static final kq l = new kq("textures/entity/cat/siamese.png");

	public bvs(bur bur) {
		super(bur, new blw(), 0.4F);
	}

	protected kq a(xb xb) {
		switch (xb.dp()) {
			case 0:
			default:
				return j;
			case 1:
				return a;
			case 2:
				return k;
			case 3:
				return l;
		}
	}

	protected void a(xb xb, float float2) {
		super.a(xb, float2);
		if (xb.dh()) {
			bqg.b(0.8F, 0.8F, 0.8F);
		}
	}
}
