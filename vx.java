import com.google.common.base.Predicate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vx extends ui {
	private static final Logger a = LogManager.getLogger();
	private final sx b;
	private final Predicate<sn> c;
	private final vy.a d;
	private sw e;

	public vx(sx sx) {
		this.b = sx;
		if (sx instanceof te) {
			a.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
		}

		this.c = new Predicate<sn>() {
			public boolean apply(@Nullable sn sn) {
				if (!(sn instanceof aay)) {
					return false;
				} else if (((aay)sn).bK.a) {
					return false;
				} else {
					double double3 = vx.this.f();
					if (sn.aM()) {
						double3 *= 0.8F;
					}

					if (sn.aP()) {
						float float5 = ((aay)sn).cO();
						if (float5 < 0.1F) {
							float5 = 0.1F;
						}

						double3 *= (double)(0.7F * float5);
					}

					return (double)sn.g(vx.this.b) > double3 ? false : wc.a(vx.this.b, (sw)sn, false, true);
				}
			}
		};
		this.d = new vy.a(sx);
	}

	@Override
	public boolean a() {
		double double2 = this.f();
		List<aay> list4 = this.b.l.a(aay.class, this.b.bo().c(double2, 4.0, double2), this.c);
		Collections.sort(list4, this.d);
		if (list4.isEmpty()) {
			return false;
		} else {
			this.e = (sw)list4.get(0);
			return true;
		}
	}

	@Override
	public boolean b() {
		sw sw2 = this.b.z();
		if (sw2 == null) {
			return false;
		} else if (!sw2.au()) {
			return false;
		} else if (sw2 instanceof aay && ((aay)sw2).bK.a) {
			return false;
		} else {
			bee bee3 = this.b.aQ();
			bee bee4 = sw2.aQ();
			if (bee3 != null && bee4 == bee3) {
				return false;
			} else {
				double double5 = this.f();
				return this.b.h(sw2) > double5 * double5 ? false : !(sw2 instanceof ly) || !((ly)sw2).c.d();
			}
		}
	}

	@Override
	public void c() {
		this.b.d(this.e);
		super.c();
	}

	@Override
	public void d() {
		this.b.d(null);
		super.c();
	}

	protected double f() {
		tk tk2 = this.b.a(aad.b);
		return tk2 == null ? 16.0 : tk2.e();
	}
}
