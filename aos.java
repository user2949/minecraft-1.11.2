import java.util.Random;

public class aos extends alu {
	public aos() {
		super(azs.e);
		this.a(aej.b);
		this.a(0.2F);
		this.a(true);
	}

	@Override
	public azt r(atl atl) {
		return azt.K;
	}

	@Override
	public void a(ajs ajs, co co, sn sn) {
		if (!sn.ah() && sn instanceof sw && !aik.i((sw)sn)) {
			sn.a(ry.e, 1.0F);
		}

		super.a(ajs, co, sn);
	}

	@Override
	public int d(atl atl, ajw ajw, co co) {
		return 15728880;
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		co co6 = co.a();
		atl atl7 = ajs.o(co6);
		if (atl7.v() == alv.j || atl7.v() == alv.i) {
			ajs.g(co6);
			ajs.a(null, co, nn.bH, no.BLOCKS, 0.5F, 2.6F + (ajs.r.nextFloat() - ajs.r.nextFloat()) * 0.8F);
			if (ajs instanceof lw) {
				((lw)ajs).a(de.SMOKE_LARGE, (double)co6.p() + 0.5, (double)co6.q() + 0.25, (double)co6.r() + 0.5, 8, 0.5, 0.25, 0.5, 0.0);
			}
		}
	}

	@Override
	public boolean a(atl atl, sn sn) {
		return sn.ah();
	}
}
