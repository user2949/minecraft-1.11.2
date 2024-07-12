import javax.annotation.Nullable;

public class adc extends acl {
	private static final ss[] h = new ss[]{ss.HEAD, ss.CHEST, ss.LEGS, ss.FEET};
	public acs a = new acs(this, 2, 2);
	public rc f = new adh();
	public boolean g;
	private final aay i;

	public adc(aax aax, boolean boolean2, aay aay) {
		this.g = boolean2;
		this.i = aay;
		this.a(new adi(aax.e, this.a, this.f, 0, 154, 28));

		for (int integer5 = 0; integer5 < 2; integer5++) {
			for (int integer6 = 0; integer6 < 2; integer6++) {
				this.a(new adl(this.a, integer6 + integer5 * 2, 98 + integer6 * 18, 18 + integer5 * 18));
			}
		}

		for (int integer5 = 0; integer5 < 4; integer5++) {
			final ss ss6 = h[integer5];
			this.a(new adl(aax, 36 + (3 - integer5), 8, 8 + integer5 * 18) {
				@Override
				public int a() {
					return 1;
				}

				@Override
				public boolean a(afj afj) {
					return ss6 == sx.d(afj);
				}

				@Override
				public boolean a(aay aay) {
					afj afj3 = this.d();
					return !afj3.b() && !aay.z() && aik.d(afj3) ? false : super.a(aay);
				}

				@Nullable
				@Override
				public String c() {
					return adp.a[ss6.b()];
				}
			});
		}

		for (int integer5 = 0; integer5 < 3; integer5++) {
			for (int integer6 = 0; integer6 < 9; integer6++) {
				this.a(new adl(aax, integer6 + (integer5 + 1) * 9, 8 + integer6 * 18, 84 + integer5 * 18));
			}
		}

		for (int integer5 = 0; integer5 < 9; integer5++) {
			this.a(new adl(aax, integer5, 8 + integer5 * 18, 142));
		}

		this.a(new adl(aax, 40, 77, 62) {
			@Nullable
			@Override
			public String c() {
				return "minecraft:items/empty_armor_slot_shield";
			}
		});
		this.a(this.a);
	}

	@Override
	public void a(rc rc) {
		this.f.a(0, ahp.a().a(this.a, this.i.l));
	}

	@Override
	public void b(aay aay) {
		super.b(aay);

		for (int integer3 = 0; integer3 < 4; integer3++) {
			afj afj4 = this.a.b(integer3);
			if (!afj4.b()) {
				aay.a(afj4, false);
			}
		}

		this.f.a(0, afj.a);
	}

	@Override
	public boolean a(aay aay) {
		return true;
	}

	@Override
	public afj b(aay aay, int integer) {
		afj afj4 = afj.a;
		adl adl5 = (adl)this.c.get(integer);
		if (adl5 != null && adl5.e()) {
			afj afj6 = adl5.d();
			afj4 = afj6.l();
			ss ss7 = sx.d(afj4);
			if (integer == 0) {
				if (!this.a(afj6, 9, 45, true)) {
					return afj.a;
				}

				adl5.a(afj6, afj4);
			} else if (integer >= 1 && integer < 5) {
				if (!this.a(afj6, 9, 45, false)) {
					return afj.a;
				}
			} else if (integer >= 5 && integer < 9) {
				if (!this.a(afj6, 9, 45, false)) {
					return afj.a;
				}
			} else if (ss7.a() == ss.a.ARMOR && !((adl)this.c.get(8 - ss7.b())).e()) {
				int integer8 = 8 - ss7.b();
				if (!this.a(afj6, integer8, integer8 + 1, false)) {
					return afj.a;
				}
			} else if (ss7 == ss.OFFHAND && !((adl)this.c.get(45)).e()) {
				if (!this.a(afj6, 45, 46, false)) {
					return afj.a;
				}
			} else if (integer >= 9 && integer < 36) {
				if (!this.a(afj6, 36, 45, false)) {
					return afj.a;
				}
			} else if (integer >= 36 && integer < 45) {
				if (!this.a(afj6, 9, 36, false)) {
					return afj.a;
				}
			} else if (!this.a(afj6, 9, 45, false)) {
				return afj.a;
			}

			if (afj6.b()) {
				adl5.d(afj.a);
			} else {
				adl5.f();
			}

			if (afj6.E() == afj4.E()) {
				return afj.a;
			}

			afj afj8 = adl5.a(aay, afj6);
			if (integer == 0) {
				aay.a(afj8, false);
			}
		}

		return afj4;
	}

	@Override
	public boolean a(afj afj, adl adl) {
		return adl.d != this.f && super.a(afj, adl);
	}
}
