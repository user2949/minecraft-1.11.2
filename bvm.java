public class bvm extends bvq<xq> {
	private static final kq[] a = new kq[]{
		new kq("textures/entity/llama/llama_creamy.png"),
		new kq("textures/entity/llama/llama_white.png"),
		new kq("textures/entity/llama/llama_brown.png"),
		new kq("textures/entity/llama/llama_gray.png")
	};

	public bvm(bur bur) {
		super(bur, new bls(0.0F), 0.7F);
		this.a(new bxm(this));
	}

	protected kq a(xq xq) {
		return a[xq.dM()];
	}
}
