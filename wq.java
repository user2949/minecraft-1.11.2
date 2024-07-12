import javax.annotation.Nullable;

public class wq {
	private final ajs a;
	private boolean b;
	private int c = -1;
	private int d;
	private int e;
	private wp f;
	private int g;
	private int h;
	private int i;

	public wq(ajs ajs) {
		this.a = ajs;
	}

	public void a() {
		if (this.a.B()) {
			this.c = 0;
		} else if (this.c != 2) {
			if (this.c == 0) {
				float float2 = this.a.c(0.0F);
				if ((double)float2 < 0.5 || (double)float2 > 0.501) {
					return;
				}

				this.c = this.a.r.nextInt(10) == 0 ? 1 : 2;
				this.b = false;
				if (this.c == 2) {
					return;
				}
			}

			if (this.c != -1) {
				if (!this.b) {
					if (!this.b()) {
						return;
					}

					this.b = true;
				}

				if (this.e > 0) {
					this.e--;
				} else {
					this.e = 2;
					if (this.d > 0) {
						this.c();
						this.d--;
					} else {
						this.c = 2;
					}
				}
			}
		}
	}

	private boolean b() {
		for (aay aay4 : this.a.i) {
			if (!aay4.y()) {
				this.f = this.a.ai().a(new co(aay4), 1);
				if (this.f != null && this.f.c() >= 10 && this.f.d() >= 20 && this.f.e() >= 20) {
					co co5 = this.f.a();
					float float6 = (float)this.f.b();
					boolean boolean7 = false;

					for (int integer8 = 0; integer8 < 10; integer8++) {
						float float9 = this.a.r.nextFloat() * (float) (Math.PI * 2);
						this.g = co5.p() + (int)((double)(ot.b(float9) * float6) * 0.9);
						this.h = co5.q();
						this.i = co5.r() + (int)((double)(ot.a(float9) * float6) * 0.9);
						boolean7 = false;

						for (wp wp11 : this.a.ai().b()) {
							if (wp11 != this.f && wp11.a(new co(this.g, this.h, this.i))) {
								boolean7 = true;
								break;
							}
						}

						if (!boolean7) {
							break;
						}
					}

					if (boolean7) {
						return false;
					}

					bdw bdw8 = this.a(new co(this.g, this.h, this.i));
					if (bdw8 != null) {
						this.e = 0;
						this.d = 20;
						return true;
					}
				}
			}
		}

		return false;
	}

	private boolean c() {
		bdw bdw2 = this.a(new co(this.g, this.h, this.i));
		if (bdw2 == null) {
			return false;
		} else {
			aao aao3;
			try {
				aao3 = new aao(this.a);
				aao3.a(this.a.D(new co(aao3)), null);
			} catch (Exception var4) {
				var4.printStackTrace();
				return false;
			}

			aao3.b(bdw2.b, bdw2.c, bdw2.d, this.a.r.nextFloat() * 360.0F, 0.0F);
			this.a.a(aao3);
			co co4 = this.f.a();
			aao3.a(co4, this.f.b());
			return true;
		}
	}

	@Nullable
	private bdw a(co co) {
		for (int integer3 = 0; integer3 < 10; integer3++) {
			co co4 = co.a(this.a.r.nextInt(16) - 8, this.a.r.nextInt(6) - 3, this.a.r.nextInt(16) - 8);
			if (this.f.a(co4) && ajz.a(sx.a.ON_GROUND, this.a, co4)) {
				return new bdw((double)co4.p(), (double)co4.q(), (double)co4.r());
			}
		}

		return null;
	}
}
