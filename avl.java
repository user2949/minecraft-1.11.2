import javax.annotation.Nullable;

public class avl extends avf {
	private avk h;

	@Override
	public void b() {
		this.c = new ako(akk.k);
		du du2 = this.b.T().a(avg.THE_END);
		this.h = this.b instanceof lw ? new avk((lw)this.b, du2.o("DragonFight")) : null;
	}

	@Override
	public aui c() {
		return new avy(this.b, this.b.T().r(), this.b.O(), this.h());
	}

	@Override
	public float a(long long1, float float2) {
		return 0.0F;
	}

	@Nullable
	@Override
	public float[] a(float float1, float float2) {
		return null;
	}

	@Override
	public bdw b(float float1, float float2) {
		int integer4 = 10518688;
		float float5 = ot.b(float1 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
		float5 = ot.a(float5, 0.0F, 1.0F);
		float float6 = 0.627451F;
		float float7 = 0.5019608F;
		float float8 = 0.627451F;
		float6 *= float5 * 0.0F + 0.15F;
		float7 *= float5 * 0.0F + 0.15F;
		float8 *= float5 * 0.0F + 0.15F;
		return new bdw((double)float6, (double)float7, (double)float8);
	}

	@Override
	public boolean g() {
		return false;
	}

	@Override
	public boolean e() {
		return false;
	}

	@Override
	public boolean d() {
		return false;
	}

	@Override
	public float f() {
		return 8.0F;
	}

	@Override
	public boolean a(int integer1, int integer2) {
		return this.b.c(new co(integer1, 0, integer2)).a().c();
	}

	@Override
	public co h() {
		return new co(100, 50, 0);
	}

	@Override
	public int i() {
		return 50;
	}

	@Override
	public boolean b(int integer1, int integer2) {
		return false;
	}

	@Override
	public avg q() {
		return avg.THE_END;
	}

	@Override
	public void r() {
		du du2 = new du();
		if (this.h != null) {
			du2.a("DragonFight", this.h.a());
		}

		this.b.T().a(avg.THE_END, du2);
	}

	@Override
	public void s() {
		if (this.h != null) {
			this.h.b();
		}
	}

	@Nullable
	public avk t() {
		return this.h;
	}
}
