public class bvn extends bus<abi> {
	private static final kq a = new kq("textures/entity/llama/spit.png");
	private final blt f = new blt();

	public bvn(bur bur) {
		super(bur);
	}

	public void a(abi abi, double double2, double double3, double double4, float float5, float float6) {
		bqg.G();
		bqg.c((float)double2, (float)double3 + 0.15F, (float)double4);
		bqg.b(abi.x + (abi.v - abi.x) * float6 - 90.0F, 0.0F, 1.0F, 0.0F);
		bqg.b(abi.y + (abi.w - abi.y) * float6, 0.0F, 0.0F, 1.0F);
		this.d(abi);
		if (this.e) {
			bqg.h();
			bqg.e(this.c(abi));
		}

		this.f.a(abi, float6, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		if (this.e) {
			bqg.n();
			bqg.i();
		}

		bqg.H();
		super.a(abi, double2, double3, double4, float5, float6);
	}

	protected kq a(abi abi) {
		return a;
	}
}
