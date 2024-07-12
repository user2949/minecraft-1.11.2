import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class abu extends abb {
	private static final kk<Integer> f = kn.a(abu.class, km.b);
	private agy g = ahb.a;
	private final Set<sh> h = Sets.newHashSet();
	private boolean at;

	public abu(ajs ajs) {
		super(ajs);
	}

	public abu(ajs ajs, double double2, double double3, double double4) {
		super(ajs, double2, double3, double4);
	}

	public abu(ajs ajs, sw sw) {
		super(ajs, sw);
	}

	public void a(afj afj) {
		if (afj.c() == afl.j) {
			this.g = aha.d(afj);
			Collection<sh> collection3 = aha.b(afj);
			if (!collection3.isEmpty()) {
				for (sh sh5 : collection3) {
					this.h.add(new sh(sh5));
				}
			}

			int integer4 = b(afj);
			if (integer4 == -1) {
				this.q();
			} else {
				this.d(integer4);
			}
		} else if (afj.c() == afl.h) {
			this.g = ahb.a;
			this.h.clear();
			this.Y.b(f, -1);
		}
	}

	public static int b(afj afj) {
		du du2 = afj.p();
		return du2 != null && du2.b("CustomPotionColor", 99) ? du2.h("CustomPotionColor") : -1;
	}

	private void q() {
		this.at = false;
		this.Y.b(f, aha.a(aha.a(this.g, this.h)));
	}

	public void a(sh sh) {
		this.h.add(sh);
		this.R().b(f, aha.a(aha.a(this.g, this.h)));
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(f, -1);
	}

	@Override
	public void A_() {
		super.A_();
		if (this.l.E) {
			if (this.a) {
				if (this.b % 5 == 0) {
					this.b(1);
				}
			} else {
				this.b(2);
			}
		} else if (this.a && this.b != 0 && !this.h.isEmpty() && this.b >= 600) {
			this.l.a(this, (byte)0);
			this.g = ahb.a;
			this.h.clear();
			this.Y.b(f, -1);
		}
	}

	private void b(int integer) {
		int integer3 = this.o();
		if (integer3 != -1 && integer > 0) {
			double double4 = (double)(integer3 >> 16 & 0xFF) / 255.0;
			double double6 = (double)(integer3 >> 8 & 0xFF) / 255.0;
			double double8 = (double)(integer3 >> 0 & 0xFF) / 255.0;

			for (int integer10 = 0; integer10 < integer; integer10++) {
				this.l
					.a(
						de.SPELL_MOB,
						this.p + (this.S.nextDouble() - 0.5) * (double)this.G,
						this.q + this.S.nextDouble() * (double)this.H,
						this.r + (this.S.nextDouble() - 0.5) * (double)this.G,
						double4,
						double6,
						double8
					);
			}
		}
	}

	public int o() {
		return this.Y.a(f);
	}

	private void d(int integer) {
		this.at = true;
		this.Y.b(f, integer);
	}

	public static void c(ph ph) {
		abb.a(ph, "TippedArrow");
	}

	@Override
	public void b(du du) {
		super.b(du);
		if (this.g != ahb.a && this.g != null) {
			du.a("Potion", agy.a.b(this.g).toString());
		}

		if (this.at) {
			du.a("Color", this.o());
		}

		if (!this.h.isEmpty()) {
			ea ea3 = new ea();

			for (sh sh5 : this.h) {
				ea3.a(sh5.a(new du()));
			}

			du.a("CustomPotionEffects", ea3);
		}
	}

	@Override
	public void a(du du) {
		super.a(du);
		if (du.b("Potion", 8)) {
			this.g = aha.c(du);
		}

		for (sh sh4 : aha.b(du)) {
			this.a(sh4);
		}

		if (du.b("Color", 99)) {
			this.d(du.h("Color"));
		} else {
			this.q();
		}
	}

	@Override
	protected void a(sw sw) {
		super.a(sw);

		for (sh sh4 : this.g.a()) {
			sw.c(new sh(sh4.a(), Math.max(sh4.b() / 8, 1), sh4.c(), sh4.d(), sh4.e()));
		}

		if (!this.h.isEmpty()) {
			for (sh sh4 : this.h) {
				sw.c(sh4);
			}
		}
	}

	@Override
	protected afj j() {
		if (this.h.isEmpty() && this.g == ahb.a) {
			return new afj(afl.h);
		} else {
			afj afj2 = new afj(afl.j);
			aha.a(afj2, this.g);
			aha.a(afj2, this.h);
			if (this.at) {
				du du3 = afj2.p();
				if (du3 == null) {
					du3 = new du();
					afj2.b(du3);
				}

				du3.a("CustomPotionColor", this.o());
			}

			return afj2;
		}
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 0) {
			int integer3 = this.o();
			if (integer3 != -1) {
				double double4 = (double)(integer3 >> 16 & 0xFF) / 255.0;
				double double6 = (double)(integer3 >> 8 & 0xFF) / 255.0;
				double double8 = (double)(integer3 >> 0 & 0xFF) / 255.0;

				for (int integer10 = 0; integer10 < 20; integer10++) {
					this.l
						.a(
							de.SPELL_MOB,
							this.p + (this.S.nextDouble() - 0.5) * (double)this.G,
							this.q + this.S.nextDouble() * (double)this.H,
							this.r + (this.S.nextDouble() - 0.5) * (double)this.G,
							double4,
							double6,
							double8
						);
				}
			}
		} else {
			super.a(byte1);
		}
	}
}
