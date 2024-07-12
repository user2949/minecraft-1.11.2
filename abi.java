import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class abi extends sn implements abj {
	public xq a;
	private du b;

	public abi(ajs ajs) {
		super(ajs);
	}

	public abi(ajs ajs, xq xq) {
		super(ajs);
		this.a = xq;
		this.b(
			xq.p - (double)(xq.G + 1.0F) * 0.5 * (double)ot.a(xq.aN * (float) (Math.PI / 180.0)),
			xq.q + (double)xq.bq() - 0.1F,
			xq.r + (double)(xq.G + 1.0F) * 0.5 * (double)ot.b(xq.aN * (float) (Math.PI / 180.0))
		);
		this.a(0.25F, 0.25F);
	}

	public abi(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs);
		this.b(double2, double3, double4);

		for (int integer15 = 0; integer15 < 7; integer15++) {
			double double16 = 0.4 + 0.1 * (double)integer15;
			ajs.a(de.SPIT, double2, double3, double4, double5 * double16, double6, double7 * double16);
		}

		this.s = double5;
		this.t = double6;
		this.u = double7;
	}

	@Override
	public void A_() {
		super.A_();
		if (this.b != null) {
			this.j();
		}

		bdw bdw2 = new bdw(this.p, this.q, this.r);
		bdw bdw3 = new bdw(this.p + this.s, this.q + this.t, this.r + this.u);
		bdu bdu4 = this.l.a(bdw2, bdw3);
		bdw2 = new bdw(this.p, this.q, this.r);
		bdw3 = new bdw(this.p + this.s, this.q + this.t, this.r + this.u);
		if (bdu4 != null) {
			bdw3 = new bdw(bdu4.c.b, bdu4.c.c, bdu4.c.d);
		}

		sn sn5 = this.a(bdw2, bdw3);
		if (sn5 != null) {
			bdu4 = new bdu(sn5);
		}

		if (bdu4 != null) {
			this.a(bdu4);
		}

		this.p = this.p + this.s;
		this.q = this.q + this.t;
		this.r = this.r + this.u;
		float float6 = ot.a(this.s * this.s + this.u * this.u);
		this.v = (float)(ot.c(this.s, this.u) * 180.0F / (float)Math.PI);
		this.w = (float)(ot.c(this.t, (double)float6) * 180.0F / (float)Math.PI);

		while (this.w - this.y < -180.0F) {
			this.y -= 360.0F;
		}

		while (this.w - this.y >= 180.0F) {
			this.y += 360.0F;
		}

		while (this.v - this.x < -180.0F) {
			this.x -= 360.0F;
		}

		while (this.v - this.x >= 180.0F) {
			this.x += 360.0F;
		}

		this.w = this.y + (this.w - this.y) * 0.2F;
		this.v = this.x + (this.v - this.x) * 0.2F;
		float float7 = 0.99F;
		float float8 = 0.06F;
		if (!this.l.a(this.bo(), azs.a)) {
			this.T();
		} else if (this.aj()) {
			this.T();
		} else {
			this.s *= 0.99F;
			this.t *= 0.99F;
			this.u *= 0.99F;
			if (!this.ae()) {
				this.t -= 0.06F;
			}

			this.b(this.p, this.q, this.r);
		}
	}

	@Override
	public void h(double double1, double double2, double double3) {
		this.s = double1;
		this.t = double2;
		this.u = double3;
		if (this.y == 0.0F && this.x == 0.0F) {
			float float8 = ot.a(double1 * double1 + double3 * double3);
			this.w = (float)(ot.c(double2, (double)float8) * 180.0F / (float)Math.PI);
			this.v = (float)(ot.c(double1, double3) * 180.0F / (float)Math.PI);
			this.y = this.w;
			this.x = this.v;
			this.b(this.p, this.q, this.r, this.v, this.w);
		}
	}

	@Nullable
	private sn a(bdw bdw1, bdw bdw2) {
		sn sn4 = null;
		List<sn> list5 = this.l.b(this, this.bo().b(this.s, this.t, this.u).g(1.0));
		double double6 = 0.0;

		for (sn sn9 : list5) {
			if (sn9 != this.a) {
				bdt bdt10 = sn9.bo().g(0.3F);
				bdu bdu11 = bdt10.b(bdw1, bdw2);
				if (bdu11 != null) {
					double double12 = bdw1.g(bdu11.c);
					if (double12 < double6 || double6 == 0.0) {
						sn4 = sn9;
						double6 = double12;
					}
				}
			}
		}

		return sn4;
	}

	@Override
	public void c(double double1, double double2, double double3, float float4, float float5) {
		float float10 = ot.a(double1 * double1 + double2 * double2 + double3 * double3);
		double1 /= (double)float10;
		double2 /= (double)float10;
		double3 /= (double)float10;
		double1 += this.S.nextGaussian() * 0.0075F * (double)float5;
		double2 += this.S.nextGaussian() * 0.0075F * (double)float5;
		double3 += this.S.nextGaussian() * 0.0075F * (double)float5;
		double1 *= (double)float4;
		double2 *= (double)float4;
		double3 *= (double)float4;
		this.s = double1;
		this.t = double2;
		this.u = double3;
		float float11 = ot.a(double1 * double1 + double3 * double3);
		this.v = (float)(ot.c(double1, double3) * 180.0F / (float)Math.PI);
		this.w = (float)(ot.c(double2, (double)float11) * 180.0F / (float)Math.PI);
		this.x = this.v;
		this.y = this.w;
	}

	public void a(bdu bdu) {
		if (bdu.d != null && this.a != null) {
			bdu.d.a(ry.a(this, (sw)this.a).b(), 1.0F);
		}

		if (!this.l.E) {
			this.T();
		}
	}

	@Override
	protected void i() {
	}

	@Override
	protected void a(du du) {
		if (du.b("Owner", 10)) {
			this.b = du.o("Owner");
		}
	}

	@Override
	protected void b(du du) {
		if (this.a != null) {
			du du3 = new du();
			UUID uUID4 = this.a.be();
			du3.a("OwnerUUID", uUID4);
			du.a("Owner", du3);
		}
	}

	private void j() {
		if (this.b != null && this.b.b("OwnerUUID")) {
			UUID uUID2 = this.b.a("OwnerUUID");

			for (xq xq5 : this.l.a(xq.class, this.bo().g(15.0))) {
				if (xq5.be().equals(uUID2)) {
					this.a = xq5;
					break;
				}
			}
		}

		this.b = null;
	}
}
