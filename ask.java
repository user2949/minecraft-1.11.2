import java.util.Random;

public class ask extends asc implements lf, rj {
	public int a;
	public float f;
	public float g;
	public float h;
	public float i;
	public float j;
	public float k;
	public float l;
	public float m;
	public float n;
	private static final Random o = new Random();
	private String p;

	@Override
	public du b(du du) {
		super.b(du);
		if (this.n_()) {
			du.a("CustomName", this.p);
		}

		return du;
	}

	@Override
	public void a(du du) {
		super.a(du);
		if (du.b("CustomName", 8)) {
			this.p = du.l("CustomName");
		}
	}

	@Override
	public void F_() {
		this.k = this.j;
		this.m = this.l;
		aay aay2 = this.b.a((double)((float)this.c.p() + 0.5F), (double)((float)this.c.q() + 0.5F), (double)((float)this.c.r() + 0.5F), 3.0, false);
		if (aay2 != null) {
			double double3 = aay2.p - (double)((float)this.c.p() + 0.5F);
			double double5 = aay2.r - (double)((float)this.c.r() + 0.5F);
			this.n = (float)ot.c(double5, double3);
			this.j += 0.1F;
			if (this.j < 0.5F || o.nextInt(40) == 0) {
				float float7 = this.h;

				do {
					this.h = this.h + (float)(o.nextInt(4) - o.nextInt(4));
				} while (float7 == this.h);
			}
		} else {
			this.n += 0.02F;
			this.j -= 0.1F;
		}

		while (this.l >= (float) Math.PI) {
			this.l -= (float) (Math.PI * 2);
		}

		while (this.l < (float) -Math.PI) {
			this.l += (float) (Math.PI * 2);
		}

		while (this.n >= (float) Math.PI) {
			this.n -= (float) (Math.PI * 2);
		}

		while (this.n < (float) -Math.PI) {
			this.n += (float) (Math.PI * 2);
		}

		float float3 = this.n - this.l;

		while (float3 >= (float) Math.PI) {
			float3 -= (float) (Math.PI * 2);
		}

		while (float3 < (float) -Math.PI) {
			float3 += (float) (Math.PI * 2);
		}

		this.l += float3 * 0.4F;
		this.j = ot.a(this.j, 0.0F, 1.0F);
		this.a++;
		this.g = this.f;
		float float4 = (this.h - this.f) * 0.4F;
		float float5 = 0.2F;
		float4 = ot.a(float4, -0.2F, 0.2F);
		this.i = this.i + (float4 - this.i) * 0.9F;
		this.f = this.f + this.i;
	}

	@Override
	public String h_() {
		return this.n_() ? this.p : "container.enchant";
	}

	@Override
	public boolean n_() {
		return this.p != null && !this.p.isEmpty();
	}

	public void a(String string) {
		this.p = string;
	}

	@Override
	public fb i_() {
		return (fb)(this.n_() ? new fh(this.h_()) : new fi(this.h_()));
	}

	@Override
	public acl a(aax aax, aay aay) {
		return new acv(aax, this.b, this.c);
	}

	@Override
	public String l() {
		return "minecraft:enchanting_table";
	}
}
