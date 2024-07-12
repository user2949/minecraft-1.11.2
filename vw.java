import com.google.common.base.Predicate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vw extends ui {
	private static final Logger a = LogManager.getLogger();
	private final sx b;
	private final Predicate<sw> c;
	private final vy.a d;
	private sw e;
	private final Class<? extends sw> f;

	public vw(sx sx, Class<? extends sw> class2) {
		this.b = sx;
		this.f = class2;
		if (sx instanceof te) {
			a.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
		}

		this.c = new Predicate<sw>() {
			public boolean apply(@Nullable sw sw) {
				double double3 = vw.this.f();
				if (sw.aM()) {
					double3 *= 0.8F;
				}

				if (sw.aP()) {
					return false;
				} else {
					return (double)sw.g(vw.this.b) > double3 ? false : wc.a(vw.this.b, sw, false, true);
				}
			}
		};
		this.d = new vy.a(sx);
	}

	@Override
	public boolean a() {
		double double2 = this.f();
		List<sw> list4 = this.b.l.a(this.f, this.b.bo().c(double2, 4.0, double2), this.c);
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
		} else {
			double double3 = this.f();
			return this.b.h(sw2) > double3 * double3 ? false : !(sw2 instanceof ly) || !((ly)sw2).c.d();
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
