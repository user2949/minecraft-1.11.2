public class acj {
	private int a = 20;
	private float b;
	private float c;
	private int d;
	private int e = 20;

	public acj() {
		this.b = 5.0F;
	}

	public void a(int integer, float float2) {
		this.a = Math.min(integer + this.a, 20);
		this.b = Math.min(this.b + (float)integer * float2 * 2.0F, (float)this.a);
	}

	public void a(afd afd, afj afj) {
		this.a(afd.h(afj), afd.i(afj));
	}

	public void a(aay aay) {
		rg rg3 = aay.l.ae();
		this.e = this.a;
		if (this.c > 4.0F) {
			this.c -= 4.0F;
			if (this.b > 0.0F) {
				this.b = Math.max(this.b - 1.0F, 0.0F);
			} else if (rg3 != rg.PEACEFUL) {
				this.a = Math.max(this.a - 1, 0);
			}
		}

		boolean boolean4 = aay.l.U().b("naturalRegeneration");
		if (boolean4 && this.b > 0.0F && aay.db() && this.a >= 20) {
			this.d++;
			if (this.d >= 10) {
				float float5 = Math.min(this.b, 6.0F);
				aay.b(float5 / 6.0F);
				this.a(float5);
				this.d = 0;
			}
		} else if (boolean4 && this.a >= 18 && aay.db()) {
			this.d++;
			if (this.d >= 80) {
				aay.b(1.0F);
				this.a(6.0F);
				this.d = 0;
			}
		} else if (this.a <= 0) {
			this.d++;
			if (this.d >= 80) {
				if (aay.bU() > 10.0F || rg3 == rg.HARD || aay.bU() > 1.0F && rg3 == rg.NORMAL) {
					aay.a(ry.i, 1.0F);
				}

				this.d = 0;
			}
		} else {
			this.d = 0;
		}
	}

	public void a(du du) {
		if (du.b("foodLevel", 99)) {
			this.a = du.h("foodLevel");
			this.d = du.h("foodTickTimer");
			this.b = du.j("foodSaturationLevel");
			this.c = du.j("foodExhaustionLevel");
		}
	}

	public void b(du du) {
		du.a("foodLevel", this.a);
		du.a("foodTickTimer", this.d);
		du.a("foodSaturationLevel", this.b);
		du.a("foodExhaustionLevel", this.c);
	}

	public int a() {
		return this.a;
	}

	public boolean c() {
		return this.a < 20;
	}

	public void a(float float1) {
		this.c = Math.min(this.c + float1, 40.0F);
	}

	public float e() {
		return this.b;
	}

	public void a(int integer) {
		this.a = integer;
	}

	public void b(float float1) {
		this.b = float1;
	}
}
