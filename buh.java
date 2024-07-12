public class buh extends bvq<wx> {
	private static final kq a = new kq("textures/entity/chicken.png");

	public buh(bur bur) {
		super(bur, new blb(), 0.3F);
	}

	protected kq a(wx wx) {
		return a;
	}

	protected float b(wx wx, float float2) {
		float float4 = wx.bA + (wx.bw - wx.bA) * float2;
		float float5 = wx.by + (wx.bx - wx.by) * float2;
		return (ot.a(float4) + 1.0F) * float5;
	}
}
