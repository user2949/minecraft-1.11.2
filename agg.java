import com.google.common.collect.Sets;
import java.util.Set;

public class agg extends aek {
	private static final Set<alu> e = Sets.newHashSet(new alu[]{alv.aL, alv.d, alv.ak, alv.c, alv.n, alv.bw, alv.m, alv.aJ, alv.aH, alv.aW, alv.da});

	public agg(afh.a a) {
		super(1.5F, -3.0F, a, e);
	}

	@Override
	public boolean a(atl atl) {
		alu alu3 = atl.v();
		return alu3 == alv.aH ? true : alu3 == alv.aJ;
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		afj afj10 = aay.b(ri);
		if (!aay.a(co.a(cv), cv, afj10)) {
			return rk.FAIL;
		} else {
			atl atl11 = ajs.o(co);
			alu alu12 = atl11.v();
			if (cv != cv.DOWN && ajs.o(co.a()).a() == azs.a && alu12 == alv.c) {
				atl atl13 = alv.da.t();
				ajs.a(aay, co, nn.fy, no.BLOCKS, 1.0F, 1.0F);
				if (!ajs.E) {
					ajs.a(co, atl13, 11);
					afj10.a(1, aay);
				}

				return rk.SUCCESS;
			} else {
				return rk.PASS;
			}
		}
	}
}
