import java.util.List;

public class aps extends alp {
	public static final atx d = atx.a("powered");
	private final aps.a e;

	protected aps(azs azs, aps.a a) {
		super(azs);
		this.y(this.A.b().a(d, false));
		this.e = a;
	}

	@Override
	protected int i(atl atl) {
		return atl.c(d) ? 15 : 0;
	}

	@Override
	protected atl a(atl atl, int integer) {
		return atl.a(d, integer > 0);
	}

	@Override
	protected void b(ajs ajs, co co) {
		if (this.x == azs.d) {
			ajs.a(null, co, nn.ic, no.BLOCKS, 0.3F, 0.8F);
		} else {
			ajs.a(null, co, nn.gO, no.BLOCKS, 0.3F, 0.6F);
		}
	}

	@Override
	protected void c(ajs ajs, co co) {
		if (this.x == azs.d) {
			ajs.a(null, co, nn.ib, no.BLOCKS, 0.3F, 0.7F);
		} else {
			ajs.a(null, co, nn.gN, no.BLOCKS, 0.3F, 0.5F);
		}
	}

	@Override
	protected int e(ajs ajs, co co) {
		bdt bdt4 = c.a(co);
		List<? extends sn> list5;
		switch (this.e) {
			case EVERYTHING:
				list5 = ajs.b(null, bdt4);
				break;
			case MOBS:
				list5 = ajs.a(sw.class, bdt4);
				break;
			default:
				return 0;
		}

		if (!list5.isEmpty()) {
			for (sn sn7 : list5) {
				if (!sn7.bc()) {
					return 15;
				}
			}
		}

		return 0;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(d, integer == 1);
	}

	@Override
	public int e(atl atl) {
		return atl.c(d) ? 1 : 0;
	}

	@Override
	protected atm b() {
		return new atm(this, d);
	}

	public static enum a {
		EVERYTHING,
		MOBS;
	}
}
