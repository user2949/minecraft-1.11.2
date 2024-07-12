import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class wg implements aju {
	private final List<wf> a = Lists.newArrayList();

	@Override
	public void a(ajs ajs, co co, atl atl3, atl atl4, int integer) {
		if (this.a(ajs, co, atl3, atl4)) {
			int integer7 = 0;

			for (int integer8 = this.a.size(); integer7 < integer8; integer7++) {
				wf wf9 = (wf)this.a.get(integer7);
				if (wf9 != null && !wf9.i()) {
					bbd bbd10 = wf9.k();
					if (bbd10 != null && !bbd10.b() && bbd10.d() != 0) {
						bbb bbb11 = wf9.c.c();
						double double12 = co.f(((double)bbb11.a + wf9.a.p) / 2.0, ((double)bbb11.b + wf9.a.q) / 2.0, ((double)bbb11.c + wf9.a.r) / 2.0);
						int integer14 = (bbd10.d() - bbd10.e()) * (bbd10.d() - bbd10.e());
						if (double12 < (double)integer14) {
							wf9.j();
						}
					}
				}
			}
		}
	}

	protected boolean a(ajs ajs, co co, atl atl3, atl atl4) {
		bdt bdt6 = atl3.c((ajw)ajs, co);
		bdt bdt7 = atl4.c((ajw)ajs, co);
		return bdt6 != bdt7 && (bdt6 == null || !bdt6.equals(bdt7));
	}

	@Override
	public void a(co co) {
	}

	@Override
	public void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
	}

	@Override
	public void a(@Nullable aay aay, nm nm, no no, double double4, double double5, double double6, float float7, float float8) {
	}

	@Override
	public void a(int integer, boolean boolean2, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
	}

	@Override
	public void a(
		int integer, boolean boolean2, boolean boolean3, double double4, double double5, double double6, double double7, double double8, double double9, int... arr
	) {
	}

	@Override
	public void a(sn sn) {
		if (sn instanceof sx) {
			this.a.add(((sx)sn).x());
		}
	}

	@Override
	public void b(sn sn) {
		if (sn instanceof sx) {
			this.a.remove(((sx)sn).x());
		}
	}

	@Override
	public void a(nm nm, co co) {
	}

	@Override
	public void a(int integer1, co co, int integer3) {
	}

	@Override
	public void a(aay aay, int integer2, co co, int integer4) {
	}

	@Override
	public void b(int integer1, co co, int integer3) {
	}
}
