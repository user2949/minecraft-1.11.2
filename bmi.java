public class bmi extends blv {
	public bni a = new bni(this, 0, 0);
	public bni b;

	public bmi() {
		this.a.a(-12.0F, -14.0F, -1.0F, 24, 12, 2, 0.0F);
		this.b = new bni(this, 0, 14);
		this.b.a(-1.0F, -2.0F, -1.0F, 2, 14, 2, 0.0F);
	}

	public void a() {
		this.a.a(0.0625F);
		this.b.a(0.0625F);
	}
}
