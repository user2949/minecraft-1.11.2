public class ahm extends ahr {
	public ahm() {
		super(
			3,
			3,
			new afj[]{
				new afj(afl.aS),
				new afj(afl.aS),
				new afj(afl.aS),
				new afj(afl.aS),
				new afj(afl.bl, 1, 32767),
				new afj(afl.aS),
				new afj(afl.aS),
				new afj(afl.aS),
				new afj(afl.aS)
			},
			new afj(afl.cg)
		);
	}

	@Override
	public boolean a(acs acs, ajs ajs) {
		if (!super.a(acs, ajs)) {
			return false;
		} else {
			afj afj4 = afj.a;

			for (int integer5 = 0; integer5 < acs.v_() && afj4.b(); integer5++) {
				afj afj6 = acs.a(integer5);
				if (afj6.c() == afl.bl) {
					afj4 = afj6;
				}
			}

			if (afj4.b()) {
				return false;
			} else {
				bbn bbn5 = afl.bl.a(afj4, ajs);
				if (bbn5 == null) {
					return false;
				} else {
					return this.a(bbn5) ? false : bbn5.g < 4;
				}
			}
		}
	}

	private boolean a(bbn bbn) {
		if (bbn.j != null) {
			for (bbm bbm4 : bbn.j.values()) {
				if (bbm4.b() == bbm.a.MANSION || bbm4.b() == bbm.a.MONUMENT) {
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public afj a(acs acs) {
		afj afj3 = afj.a;

		for (int integer4 = 0; integer4 < acs.v_() && afj3.b(); integer4++) {
			afj afj5 = acs.a(integer4);
			if (afj5.c() == afl.bl) {
				afj3 = afj5;
			}
		}

		afj3 = afj3.l();
		afj3.e(1);
		if (afj3.p() == null) {
			afj3.b(new du());
		}

		afj3.p().a("map_scale_direction", 1);
		return afj3;
	}
}
