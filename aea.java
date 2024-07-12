import javax.annotation.Nullable;

public class aea extends afh {
	public aea() {
		this.k = 1;
		this.e(384);
		this.a(aej.j);
		this.a(new kq("pull"), new afk() {
			@Override
			public float a(afj afj, @Nullable ajs ajs, @Nullable sw sw) {
				if (sw == null) {
					return 0.0F;
				} else {
					return sw.cB().c() != afl.g ? 0.0F : (float)(afj.m() - sw.cC()) / 20.0F;
				}
			}
		});
		this.a(new kq("pulling"), new afk() {
			@Override
			public float a(afj afj, @Nullable ajs ajs, @Nullable sw sw) {
				return sw != null && sw.cy() && sw.cB() == afj ? 1.0F : 0.0F;
			}
		});
	}

	private afj a(aay aay) {
		if (this.d(aay.b(ri.OFF_HAND))) {
			return aay.b(ri.OFF_HAND);
		} else if (this.d(aay.b(ri.MAIN_HAND))) {
			return aay.b(ri.MAIN_HAND);
		} else {
			for (int integer3 = 0; integer3 < aay.bs.v_(); integer3++) {
				afj afj4 = aay.bs.a(integer3);
				if (this.d(afj4)) {
					return afj4;
				}
			}

			return afj.a;
		}
	}

	protected boolean d(afj afj) {
		return afj.c() instanceof adr;
	}

	@Override
	public void a(afj afj, ajs ajs, sw sw, int integer) {
		if (sw instanceof aay) {
			aay aay6 = (aay)sw;
			boolean boolean7 = aay6.bK.d || aik.a(aim.z, afj) > 0;
			afj afj8 = this.a(aay6);
			if (!afj8.b() || boolean7) {
				if (afj8.b()) {
					afj8 = new afj(afl.h);
				}

				int integer9 = this.e(afj) - integer;
				float float10 = b(integer9);
				if (!((double)float10 < 0.1)) {
					boolean boolean11 = boolean7 && afj8.c() == afl.h;
					if (!ajs.E) {
						adr adr12 = (adr)(afj8.c() instanceof adr ? afj8.c() : afl.h);
						abb abb13 = adr12.a(ajs, afj8, aay6);
						abb13.a(aay6, aay6.w, aay6.v, 0.0F, float10 * 3.0F, 1.0F);
						if (float10 == 1.0F) {
							abb13.a(true);
						}

						int integer14 = aik.a(aim.w, afj);
						if (integer14 > 0) {
							abb13.c(abb13.k() + (double)integer14 * 0.5 + 0.5);
						}

						int integer15 = aik.a(aim.x, afj);
						if (integer15 > 0) {
							abb13.a(integer15);
						}

						if (aik.a(aim.y, afj) > 0) {
							abb13.i(100);
						}

						afj.a(1, aay6);
						if (boolean11 || aay6.bK.d && (afj8.c() == afl.i || afj8.c() == afl.j)) {
							abb13.c = abb.a.CREATIVE_ONLY;
						}

						ajs.a(abb13);
					}

					ajs.a(null, aay6.p, aay6.q, aay6.r, nn.w, no.PLAYERS, 1.0F, 1.0F / (j.nextFloat() * 0.4F + 1.2F) + float10 * 0.5F);
					if (!boolean11 && !aay6.bK.d) {
						afj8.g(1);
						if (afj8.b()) {
							aay6.bs.d(afj8);
						}
					}

					aay6.b(oa.b(this));
				}
			}
		}
	}

	public static float b(int integer) {
		float float2 = (float)integer / 20.0F;
		float2 = (float2 * float2 + float2 * 2.0F) / 3.0F;
		if (float2 > 1.0F) {
			float2 = 1.0F;
		}

		return float2;
	}

	@Override
	public int e(afj afj) {
		return 72000;
	}

	@Override
	public agu f(afj afj) {
		return agu.BOW;
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = aay.b(ri);
		boolean boolean6 = !this.a(aay).b();
		if (aay.bK.d || boolean6) {
			aay.c(ri);
			return new rl<>(rk.SUCCESS, afj5);
		} else {
			return boolean6 ? new rl<>(rk.PASS, afj5) : new rl<>(rk.FAIL, afj5);
		}
	}

	@Override
	public int c() {
		return 1;
	}
}
