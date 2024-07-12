import com.google.common.collect.Sets;
import java.util.Set;

public class afu extends aek {
	private static final Set<alu> e = Sets.newHashSet(
		new alu[]{
			alv.cs,
			alv.q,
			alv.e,
			alv.E,
			alv.ah,
			alv.ag,
			alv.T,
			alv.D,
			alv.R,
			alv.o,
			alv.aI,
			alv.S,
			alv.p,
			alv.y,
			alv.x,
			alv.aD,
			alv.Y,
			alv.aV,
			alv.cB,
			alv.av,
			alv.aC,
			alv.A,
			alv.cM,
			alv.b,
			alv.U,
			alv.aG,
			alv.az
		}
	);

	protected afu(afh.a a) {
		super(1.0F, -2.8F, a, e);
	}

	@Override
	public boolean a(atl atl) {
		alu alu3 = atl.v();
		if (alu3 == alv.Z) {
			return this.d.d() == 3;
		} else if (alu3 == alv.ah || alu3 == alv.ag) {
			return this.d.d() >= 2;
		} else if (alu3 == alv.bP || alu3 == alv.bT) {
			return this.d.d() >= 2;
		} else if (alu3 == alv.R || alu3 == alv.o) {
			return this.d.d() >= 2;
		} else if (alu3 == alv.S || alu3 == alv.p) {
			return this.d.d() >= 1;
		} else if (alu3 == alv.y || alu3 == alv.x) {
			return this.d.d() >= 1;
		} else if (alu3 != alv.aC && alu3 != alv.aD) {
			azs azs4 = atl.a();
			if (azs4 == azs.e) {
				return true;
			} else {
				return azs4 == azs.f ? true : azs4 == azs.g;
			}
		} else {
			return this.d.d() >= 2;
		}
	}

	@Override
	public float a(afj afj, atl atl) {
		azs azs4 = atl.a();
		return azs4 != azs.f && azs4 != azs.g && azs4 != azs.e ? super.a(afj, atl) : this.a;
	}
}
