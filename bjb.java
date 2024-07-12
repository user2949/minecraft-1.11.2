import org.lwjgl.input.Keyboard;

public class bjb extends bho {
	private final asv a;
	private int f;
	private int g;
	private bfm h;

	public bjb(asv asv) {
		this.a = asv;
	}

	@Override
	public void b() {
		this.n.clear();
		Keyboard.enableRepeatEvents(true);
		this.h = this.b(new bfm(0, this.l / 2 - 100, this.m / 4 + 120, cah.a("gui.done")));
		this.a.a(false);
	}

	@Override
	public void m() {
		Keyboard.enableRepeatEvents(false);
		bno bno2 = this.j.v();
		if (bno2 != null) {
			bno2.a(new jj(this.a.w(), this.a.a));
		}

		this.a.a(true);
	}

	@Override
	public void e() {
		this.f++;
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			if (bfm.k == 0) {
				this.a.x_();
				this.j.a(null);
			}
		}
	}

	@Override
	protected void a(char character, int integer) {
		if (integer == 200) {
			this.g = this.g - 1 & 3;
		}

		if (integer == 208 || integer == 28 || integer == 156) {
			this.g = this.g + 1 & 3;
		}

		String string4 = this.a.a[this.g].c();
		if (integer == 14 && !string4.isEmpty()) {
			string4 = string4.substring(0, string4.length() - 1);
		}

		if (g.a(character) && this.q.a(string4 + character) <= 90) {
			string4 = string4 + character;
		}

		this.a.a[this.g] = new fh(string4);
		if (integer == 1) {
			this.a(this.h);
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.a(this.q, cah.a("sign.edit"), this.l / 2, 40, 16777215);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.G();
		bqg.c((float)(this.l / 2), 0.0F, 50.0F);
		float float5 = 93.75F;
		bqg.b(-93.75F, -93.75F, -93.75F);
		bqg.b(180.0F, 0.0F, 1.0F, 0.0F);
		alu alu6 = this.a.x();
		if (alu6 == alv.an) {
			float float7 = (float)(this.a.v() * 360) / 16.0F;
			bqg.b(float7, 0.0F, 1.0F, 0.0F);
			bqg.c(0.0F, -1.0625F, 0.0F);
		} else {
			int integer7 = this.a.v();
			float float8 = 0.0F;
			if (integer7 == 2) {
				float8 = 180.0F;
			}

			if (integer7 == 4) {
				float8 = 90.0F;
			}

			if (integer7 == 5) {
				float8 = -90.0F;
			}

			bqg.b(float8, 0.0F, 1.0F, 0.0F);
			bqg.c(0.0F, -1.0625F, 0.0F);
		}

		if (this.f / 6 % 2 == 0) {
			this.a.f = this.g;
		}

		bsk.a.a(this.a, -0.5, -0.75, -0.5, 0.0F);
		this.a.f = -1;
		bqg.H();
		super.a(integer1, integer2, float3);
	}
}
