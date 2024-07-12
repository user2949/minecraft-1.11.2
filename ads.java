import com.google.common.collect.Sets;
import java.util.Set;

public class ads extends aek {
	private static final Set<alu> e = Sets.newHashSet(new alu[]{alv.f, alv.X, alv.r, alv.s, alv.ae, alv.aU, alv.aZ, alv.bk, alv.au, alv.cd, alv.aB});
	private static final float[] f = new float[]{6.0F, 8.0F, 8.0F, 8.0F, 6.0F};
	private static final float[] n = new float[]{-3.2F, -3.2F, -3.1F, -3.0F, -3.0F};

	protected ads(afh.a a) {
		super(a, e);
		this.b = f[a.ordinal()];
		this.c = n[a.ordinal()];
	}

	@Override
	public float a(afj afj, atl atl) {
		azs azs4 = atl.a();
		return azs4 != azs.d && azs4 != azs.k && azs4 != azs.l ? super.a(afj, atl) : this.a;
	}
}
