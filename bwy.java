public class bwy extends bvd<aap> {
	private static final kq a = new kq("textures/entity/zombie_villager/zombie_villager.png");
	private static final kq j = new kq("textures/entity/zombie_villager/zombie_farmer.png");
	private static final kq k = new kq("textures/entity/zombie_villager/zombie_librarian.png");
	private static final kq l = new kq("textures/entity/zombie_villager/zombie_priest.png");
	private static final kq m = new kq("textures/entity/zombie_villager/zombie_smith.png");
	private static final kq n = new kq("textures/entity/zombie_villager/zombie_butcher.png");

	public bwy(bur bur) {
		super(bur, new bmw(), 0.5F);
		this.a(new bxv(this));
	}

	protected kq a(aap aap) {
		switch (aap.dl()) {
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

	protected void a(aap aap, float float2, float float3, float float4) {
		if (aap.do()) {
			float3 += (float)(Math.cos((double)aap.T * 3.25) * Math.PI * 0.25);
		}

		super.a(aap, float2, float3, float4);
	}
}
