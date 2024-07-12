public class bve extends bwx {
	private static final kq a = new kq("textures/entity/zombie/husk.png");

	public bve(bur bur) {
		super(bur);
	}

	protected void a(aao aao, float float2) {
		float float4 = 1.0625F;
		bqg.b(1.0625F, 1.0625F, 1.0625F);
		super.a(aao, float2);
	}

	@Override
	protected kq a(aao aao) {
		return a;
	}
}
