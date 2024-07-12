public class ve extends ui {
	private final sx a;
	private double b;
	private double c;
	private int d;

	public ve(sx sx) {
		this.a = sx;
		this.a(3);
	}

	@Override
	public boolean a() {
		return this.a.bJ().nextFloat() < 0.02F;
	}

	@Override
	public boolean b() {
		return this.d >= 0;
	}

	@Override
	public void c() {
		double double2 = (Math.PI * 2) * this.a.bJ().nextDouble();
		this.b = Math.cos(double2);
		this.c = Math.sin(double2);
		this.d = 20 + this.a.bJ().nextInt(20);
	}

	@Override
	public void e() {
		this.d--;
		this.a.t().a(this.a.p + this.b, this.a.q + (double)this.a.bq(), this.a.r + this.c, (float)this.a.cL(), (float)this.a.N());
	}
}
