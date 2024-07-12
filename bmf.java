public class bmf extends blv {
	public bni a;
	public bni b;

	public bmf() {
		this.s = 64;
		this.t = 64;
		this.a = new bni(this, 0, 0);
		this.a.a(-6.0F, -11.0F, -2.0F, 12, 22, 1, 0.0F);
		this.b = new bni(this, 26, 0);
		this.b.a(-1.0F, -3.0F, -1.0F, 2, 6, 6, 0.0F);
	}

	public void a() {
		this.a.a(0.0625F);
		this.b.a(0.0625F);
	}
}
