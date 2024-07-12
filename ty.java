import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.List;
import javax.annotation.Nullable;

public class ty<T extends sn> extends ui {
	private final Predicate<sn> c = new Predicate<sn>() {
		public boolean apply(@Nullable sn sn) {
			return sn.au() && ty.this.a.y().a(sn) && !ty.this.a.r(sn);
		}
	};
	protected te a;
	private final double d;
	private final double e;
	protected T b;
	private final float f;
	private bbd g;
	private final wf h;
	private final Class<T> i;
	private final Predicate<? super T> j;

	public ty(te te, Class<T> class2, float float3, double double4, double double5) {
		this(te, class2, Predicates.alwaysTrue(), float3, double4, double5);
	}

	public ty(te te, Class<T> class2, Predicate<? super T> predicate, float float4, double double5, double double6) {
		this.a = te;
		this.i = class2;
		this.j = predicate;
		this.f = float4;
		this.d = double5;
		this.e = double6;
		this.h = te.x();
		this.a(1);
	}

	@Override
	public boolean a() {
		List<T> list2 = this.a.l.a(this.i, this.a.bo().c((double)this.f, 3.0, (double)this.f), Predicates.and(new Predicate[]{sr.d, this.c, this.j}));
		if (list2.isEmpty()) {
			return false;
		} else {
			this.b = (T)list2.get(0);
			bdw bdw3 = wm.b(this.a, 16, 7, new bdw(this.b.p, this.b.q, this.b.r));
			if (bdw3 == null) {
				return false;
			} else if (this.b.d(bdw3.b, bdw3.c, bdw3.d) < this.b.h(this.a)) {
				return false;
			} else {
				this.g = this.h.a(bdw3.b, bdw3.c, bdw3.d);
				return this.g != null;
			}
		}
	}

	@Override
	public boolean b() {
		return !this.h.n();
	}

	@Override
	public void c() {
		this.h.a(this.g, this.d);
	}

	@Override
	public void d() {
		this.b = null;
	}

	@Override
	public void e() {
		if (this.a.h(this.b) < 49.0) {
			this.a.x().a(this.e);
		} else {
			this.a.x().a(this.d);
		}
	}
}
