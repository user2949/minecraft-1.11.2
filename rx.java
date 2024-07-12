import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class rx {
	private final List<rv> a = Lists.newArrayList();
	private final sw b;
	private int c;
	private int d;
	private int e;
	private boolean f;
	private boolean g;
	private String h;

	public rx(sw sw) {
		this.b = sw;
	}

	public void a() {
		this.k();
		if (this.b.m_()) {
			alu alu2 = this.b.l.o(new co(this.b.p, this.b.bo().b, this.b.r)).v();
			if (alu2 == alv.au) {
				this.h = "ladder";
			} else if (alu2 == alv.bn) {
				this.h = "vines";
			}
		} else if (this.b.aj()) {
			this.h = "water";
		}
	}

	public void a(ry ry, float float2, float float3) {
		this.g();
		this.a();
		rv rv5 = new rv(ry, this.b.T, float2, float3, this.h, this.b.L);
		this.a.add(rv5);
		this.c = this.b.T;
		this.g = true;
		if (rv5.f() && !this.f && this.b.au()) {
			this.f = true;
			this.d = this.b.T;
			this.e = this.d;
			this.b.j();
		}
	}

	public fb b() {
		if (this.a.isEmpty()) {
			return new fi("death.attack.generic", this.b.i_());
		} else {
			rv rv2 = this.j();
			rv rv3 = (rv)this.a.get(this.a.size() - 1);
			fb fb5 = rv3.h();
			sn sn6 = rv3.a().j();
			fb fb4;
			if (rv2 != null && rv3.a() == ry.k) {
				fb fb7 = rv2.h();
				if (rv2.a() == ry.k || rv2.a() == ry.m) {
					fb4 = new fi("death.fell.accident." + this.a(rv2), this.b.i_());
				} else if (fb7 != null && (fb5 == null || !fb7.equals(fb5))) {
					sn sn8 = rv2.a().j();
					afj afj9 = sn8 instanceof sw ? ((sw)sn8).cg() : afj.a;
					if (!afj9.b() && afj9.t()) {
						fb4 = new fi("death.fell.assist.item", this.b.i_(), fb7, afj9.C());
					} else {
						fb4 = new fi("death.fell.assist", this.b.i_(), fb7);
					}
				} else if (fb5 != null) {
					afj afj8 = sn6 instanceof sw ? ((sw)sn6).cg() : afj.a;
					if (!afj8.b() && afj8.t()) {
						fb4 = new fi("death.fell.finish.item", this.b.i_(), fb5, afj8.C());
					} else {
						fb4 = new fi("death.fell.finish", this.b.i_(), fb5);
					}
				} else {
					fb4 = new fi("death.fell.killer", this.b.i_());
				}
			} else {
				fb4 = rv3.a().c(this.b);
			}

			return fb4;
		}
	}

	@Nullable
	public sw c() {
		sw sw2 = null;
		aay aay3 = null;
		float float4 = 0.0F;
		float float5 = 0.0F;

		for (rv rv7 : this.a) {
			if (rv7.a().j() instanceof aay && (aay3 == null || rv7.c() > float5)) {
				float5 = rv7.c();
				aay3 = (aay)rv7.a().j();
			}

			if (rv7.a().j() instanceof sw && (sw2 == null || rv7.c() > float4)) {
				float4 = rv7.c();
				sw2 = (sw)rv7.a().j();
			}
		}

		return (sw)(aay3 != null && float5 >= float4 / 3.0F ? aay3 : sw2);
	}

	@Nullable
	private rv j() {
		rv rv2 = null;
		rv rv3 = null;
		float float4 = 0.0F;
		float float5 = 0.0F;

		for (int integer6 = 0; integer6 < this.a.size(); integer6++) {
			rv rv7 = (rv)this.a.get(integer6);
			rv rv8 = integer6 > 0 ? (rv)this.a.get(integer6 - 1) : null;
			if ((rv7.a() == ry.k || rv7.a() == ry.m) && rv7.j() > 0.0F && (rv2 == null || rv7.j() > float5)) {
				if (integer6 > 0) {
					rv2 = rv8;
				} else {
					rv2 = rv7;
				}

				float5 = rv7.j();
			}

			if (rv7.g() != null && (rv3 == null || rv7.c() > float4)) {
				rv3 = rv7;
				float4 = rv7.c();
			}
		}

		if (float5 > 5.0F && rv2 != null) {
			return rv2;
		} else {
			return float4 > 5.0F && rv3 != null ? rv3 : null;
		}
	}

	private String a(rv rv) {
		return rv.g() == null ? "generic" : rv.g();
	}

	public int f() {
		return this.f ? this.b.T - this.d : this.e - this.d;
	}

	private void k() {
		this.h = null;
	}

	public void g() {
		int integer2 = this.f ? 300 : 100;
		if (this.g && (!this.b.au() || this.b.T - this.c > integer2)) {
			boolean boolean3 = this.f;
			this.g = false;
			this.f = false;
			this.e = this.b.T;
			if (boolean3) {
				this.b.k();
			}

			this.a.clear();
		}
	}

	public sw h() {
		return this.b;
	}
}
