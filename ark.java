public class ark extends alu {
	public static final atx a = atx.a("explode");

	public ark() {
		super(azs.u);
		this.y(this.A.b().a(a, false));
		this.a(aej.d);
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		super.c(ajs, co, atl);
		if (ajs.y(co)) {
			this.d(ajs, co, atl.a(a, true));
			ajs.g(co);
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (ajs.y(co3)) {
			this.d(ajs, co3, atl.a(a, true));
			ajs.g(co3);
		}
	}

	@Override
	public void a(ajs ajs, co co, ajn ajn) {
		if (!ajs.E) {
			zk zk5 = new zk(ajs, (double)((float)co.p() + 0.5F), (double)co.q(), (double)((float)co.r() + 0.5F), ajn.c());
			zk5.a((short)(ajs.r.nextInt(zk5.l() / 4) + zk5.l() / 8));
			ajs.a(zk5);
		}
	}

	@Override
	public void d(ajs ajs, co co, atl atl) {
		this.a(ajs, co, atl, null);
	}

	public void a(ajs ajs, co co, atl atl, sw sw) {
		if (!ajs.E) {
			if ((Boolean)atl.c(a)) {
				zk zk6 = new zk(ajs, (double)((float)co.p() + 0.5F), (double)co.q(), (double)((float)co.r() + 0.5F), sw);
				ajs.a(zk6);
				ajs.a(null, zk6.p, zk6.q, zk6.r, nn.gV, no.BLOCKS, 1.0F, 1.0F);
			}
		}
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		afj afj11 = aay.b(ri);
		if (!afj11.b() && (afj11.c() == afl.e || afj11.c() == afl.bW)) {
			this.a(ajs, co, atl.a(a, true), (sw)aay);
			ajs.a(co, alv.a.t(), 11);
			if (afj11.c() == afl.e) {
				afj11.a(1, aay);
			} else if (!aay.bK.d) {
				afj11.g(1);
			}

			return true;
		} else {
			return super.a(ajs, co, atl, aay, ri, cv, float7, float8, float9);
		}
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sn sn) {
		if (!ajs.E && sn instanceof abb) {
			abb abb6 = (abb)sn;
			if (abb6.aJ()) {
				this.a(ajs, co, ajs.o(co).a(a, true), abb6.e instanceof sw ? (sw)abb6.e : null);
				ajs.g(co);
			}
		}
	}

	@Override
	public boolean a(ajn ajn) {
		return false;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, (integer & 1) > 0);
	}

	@Override
	public int e(atl atl) {
		return atl.c(a) ? 1 : 0;
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}
}
