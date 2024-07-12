import javax.annotation.Nullable;

public class yg extends yd {
	private bdw b;
	private int c;

	public yg(yb yb) {
		super(yb);
	}

	@Override
	public void b() {
		if (this.c++ % 10 == 0) {
			float float2 = (this.a.bJ().nextFloat() - 0.5F) * 8.0F;
			float float3 = (this.a.bJ().nextFloat() - 0.5F) * 4.0F;
			float float4 = (this.a.bJ().nextFloat() - 0.5F) * 8.0F;
			this.a.l.a(de.EXPLOSION_HUGE, this.a.p + (double)float2, this.a.q + 2.0 + (double)float3, this.a.r + (double)float4, 0.0, 0.0, 0.0);
		}
	}

	@Override
	public void c() {
		this.c++;
		if (this.b == null) {
			co co2 = this.a.l.l(awm.a);
			this.b = new bdw((double)co2.p(), (double)co2.q(), (double)co2.r());
		}

		double double2 = this.b.c(this.a.p, this.a.q, this.a.r);
		if (!(double2 < 100.0) && !(double2 > 22500.0) && !this.a.A && !this.a.B) {
			this.a.c(1.0F);
		} else {
			this.a.c(0.0F);
		}
	}

	@Override
	public void d() {
		this.b = null;
		this.c = 0;
	}

	@Override
	public float f() {
		return 3.0F;
	}

	@Nullable
	@Override
	public bdw g() {
		return this.b;
	}

	@Override
	public yr<yg> i() {
		return yr.j;
	}
}
