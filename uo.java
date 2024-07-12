import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class uo extends ui {
	protected sx a;
	protected sn b;
	protected float c;
	private int e;
	private final float f;
	protected Class<? extends sn> d;

	public uo(sx sx, Class<? extends sn> class2, float float3) {
		this.a = sx;
		this.d = class2;
		this.c = float3;
		this.f = 0.02F;
		this.a(2);
	}

	public uo(sx sx, Class<? extends sn> class2, float float3, float float4) {
		this.a = sx;
		this.d = class2;
		this.c = float3;
		this.f = float4;
		this.a(2);
	}

	@Override
	public boolean a() {
		if (this.a.bJ().nextFloat() >= this.f) {
			return false;
		} else {
			if (this.a.z() != null) {
				this.b = this.a.z();
			}

			if (this.d == aay.class) {
				Predicate<sn> predicate2 = Predicates.and(sr.e, sr.b(this.a));
				this.b = this.a.l.a(this.a.p, this.a.q, this.a.r, (double)this.c, predicate2);
			} else {
				this.b = this.a.l.a(this.d, this.a.bo().c((double)this.c, 3.0, (double)this.c), this.a);
			}

			return this.b != null;
		}
	}

	@Override
	public boolean b() {
		if (!this.b.au()) {
			return false;
		} else {
			return this.a.h(this.b) > (double)(this.c * this.c) ? false : this.e > 0;
		}
	}

	@Override
	public void c() {
		this.e = 40 + this.a.bJ().nextInt(40);
	}

	@Override
	public void d() {
		this.b = null;
	}

	@Override
	public void e() {
		this.a.t().a(this.b.p, this.b.q + (double)this.b.bq(), this.b.r, (float)this.a.cL(), (float)this.a.N());
		this.e--;
	}
}
