public class bwq extends bvq<aat> {
	private static final kq a = new kq("textures/entity/villager/villager.png");
	private static final kq j = new kq("textures/entity/villager/farmer.png");
	private static final kq k = new kq("textures/entity/villager/librarian.png");
	private static final kq l = new kq("textures/entity/villager/priest.png");
	private static final kq m = new kq("textures/entity/villager/smith.png");
	private static final kq n = new kq("textures/entity/villager/butcher.png");

	public bwq(bur bur) {
		super(bur, new bmv(0.0F), 0.5F);
		this.a(new bxe(this.h().a));
	}

	public bmv b() {
		return (bmv)super.b();
	}

	protected kq a(aat aat) {
		switch (aat.dh()) {
			case 0:
				return j;
			case 1:
				return k;
			case 2:
				return l;
			case 3:
				return m;
			case 4:
				return n;
			case 5:
			default:
				return a;
		}
	}

	protected void a(aat aat, float float2) {
		float float4 = 0.9375F;
		if (aat.l() < 0) {
			float4 = (float)((double)float4 * 0.5);
			this.c = 0.25F;
		} else {
			this.c = 0.5F;
		}

		bqg.b(float4, float4, float4);
	}
}
