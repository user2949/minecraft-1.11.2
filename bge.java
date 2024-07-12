public class bge extends bfm {
	private float p = 1.0F;
	public boolean o;
	private final beu.a q;
	private final float r;
	private final float s;

	public bge(int integer1, int integer2, int integer3, beu.a a) {
		this(integer1, integer2, integer3, a, 0.0F, 1.0F);
	}

	public bge(int integer1, int integer2, int integer3, beu.a a, float float5, float float6) {
		super(integer1, integer2, integer3, 150, 20, "");
		this.q = a;
		this.r = float5;
		this.s = float6;
		bes bes8 = bes.z();
		this.p = a.c(bes8.u.a(a));
		this.j = bes8.u.c(a);
	}

	@Override
	protected int a(boolean boolean1) {
		return 0;
	}

	@Override
	protected void b(bes bes, int integer2, int integer3) {
		if (this.m) {
			if (this.o) {
				this.p = (float)(integer2 - (this.h + 4)) / (float)(this.f - 8);
				this.p = ot.a(this.p, 0.0F, 1.0F);
				float float5 = this.q.d(this.p);
				bes.u.a(this.q, float5);
				this.p = this.q.c(float5);
				this.j = bes.u.c(this.q);
			}

			bes.N().a(a);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			this.b(this.h + (int)(this.p * (float)(this.f - 8)), this.i, 0, 66, 4, 20);
			this.b(this.h + (int)(this.p * (float)(this.f - 8)) + 4, this.i, 196, 66, 4, 20);
		}
	}

	@Override
	public boolean c(bes bes, int integer2, int integer3) {
		if (super.c(bes, integer2, integer3)) {
			this.p = (float)(integer2 - (this.h + 4)) / (float)(this.f - 8);
			this.p = ot.a(this.p, 0.0F, 1.0F);
			bes.u.a(this.q, this.q.d(this.p));
			this.j = bes.u.c(this.q);
			this.o = true;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void a(int integer1, int integer2) {
		this.o = false;
	}
}
