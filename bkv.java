public class bkv extends blv {
	public bni a;
	public bni b;
	public bni c;

	public bkv() {
		this.s = 64;
		this.t = 64;
		this.a = new bni(this, 0, 0);
		this.a.a(-10.0F, 0.0F, -2.0F, 20, 40, 1, 0.0F);
		this.b = new bni(this, 44, 0);
		this.b.a(-1.0F, -30.0F, -1.0F, 2, 42, 2, 0.0F);
		this.c = new bni(this, 0, 42);
		this.c.a(-10.0F, -32.0F, -1.0F, 20, 2, 2, 0.0F);
	}

	public void a() {
		this.a.d = -32.0F;
		this.a.a(0.0625F);
		this.b.a(0.0625F);
		this.c.a(0.0625F);
	}
}
