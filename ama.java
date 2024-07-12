import java.util.Random;
import javax.annotation.Nullable;

public class ama extends alu {
	protected static final bdt b = new bdt(0.3F, 0.0, 0.3F, 0.7F, 0.6F, 0.7F);

	protected ama() {
		this(azs.k);
	}

	protected ama(azs azs) {
		this(azs, azs.r());
	}

	protected ama(azs azs, azt azt) {
		super(azs, azt);
		this.a(true);
		this.a(aej.c);
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return super.a(ajs, co) && this.i(ajs.o(co.b()));
	}

	protected boolean i(atl atl) {
		return atl.v() == alv.c || atl.v() == alv.d || atl.v() == alv.ak;
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		super.a(atl, ajs, co3, alu, co5);
		this.e(ajs, co3, atl);
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		this.e(ajs, co, atl);
	}

	protected void e(ajs ajs, co co, atl atl) {
		if (!this.f(ajs, co, atl)) {
			this.b(ajs, co, atl, 0);
			ajs.a(co, alv.a.t(), 3);
		}
	}

	public boolean f(ajs ajs, co co, atl atl) {
		return this.i(ajs.o(co.b()));
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return b;
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		return k;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}
}
