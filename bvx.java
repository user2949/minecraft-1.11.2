public class bvx extends bvq<xe> {
	private static final kq a = new kq("textures/entity/rabbit/brown.png");
	private static final kq j = new kq("textures/entity/rabbit/white.png");
	private static final kq k = new kq("textures/entity/rabbit/black.png");
	private static final kq l = new kq("textures/entity/rabbit/gold.png");
	private static final kq m = new kq("textures/entity/rabbit/salt.png");
	private static final kq n = new kq("textures/entity/rabbit/white_splotched.png");
	private static final kq o = new kq("textures/entity/rabbit/toast.png");
	private static final kq p = new kq("textures/entity/rabbit/caerbannog.png");

	public bvx(bur bur) {
		super(bur, new bmc(), 0.3F);
	}

	protected kq a(xe xe) {
		String string3 = a.a(xe.h_());
		if (string3 != null && "Toast".equals(string3)) {
			return o;
		} else {
			switch (xe.dj()) {
				case 0:
				default:
					return a;
				case 1:
					return j;
				case 2:
					return k;
				case 3:
					return n;
				case 4:
					return l;
				case 5:
					return m;
				case 99:
					return p;
			}
		}
	}
}
