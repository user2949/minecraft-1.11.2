public class ua extends uc {
	private int g;
	private int h = -1;

	public ua(sx sx) {
		super(sx);
	}

	@Override
	public boolean a() {
		if (!super.a()) {
			return false;
		} else {
			return !this.a.l.U().b("mobGriefing") ? false : !amx.d(this.a.l, this.b);
		}
	}

	@Override
	public void c() {
		super.c();
		this.g = 0;
	}

	@Override
	public boolean b() {
		double double2 = this.a.c(this.b);
		return this.g <= 240 && !amx.d(this.a.l, this.b) && double2 < 4.0;
	}

	@Override
	public void d() {
		super.d();
		this.a.l.c(this.a.O(), this.b, -1);
	}

	@Override
	public void e() {
		super.e();
		if (this.a.bJ().nextInt(20) == 0) {
			this.a.l.b(1019, this.b, 0);
		}

		this.g++;
		int integer2 = (int)((float)this.g / 240.0F * 10.0F);
		if (integer2 != this.h) {
			this.a.l.c(this.a.O(), this.b, integer2);
			this.h = integer2;
		}

		if (this.g == 240 && this.a.l.ae() == rg.HARD) {
			this.a.l.g(this.b);
			this.a.l.b(1021, this.b, 0);
			this.a.l.b(2001, this.b, alu.a(this.c));
		}
	}
}
