import java.util.Random;
import javax.annotation.Nullable;

public class ue extends ui {
	private final te a;
	private double b;
	private double c;
	private double d;
	private final double e;
	private final ajs f;

	public ue(te te, double double2) {
		this.a = te;
		this.e = double2;
		this.f = te.l;
		this.a(1);
	}

	@Override
	public boolean a() {
		if (!this.f.B()) {
			return false;
		} else if (!this.a.aJ()) {
			return false;
		} else if (!this.f.h(new co(this.a.p, this.a.bo().b, this.a.r))) {
			return false;
		} else if (!this.a.b(ss.HEAD).b()) {
			return false;
		} else {
			bdw bdw2 = this.f();
			if (bdw2 == null) {
				return false;
			} else {
				this.b = bdw2.b;
				this.c = bdw2.c;
				this.d = bdw2.d;
				return true;
			}
		}
	}

	@Override
	public boolean b() {
		return !this.a.x().n();
	}

	@Override
	public void c() {
		this.a.x().a(this.b, this.c, this.d, this.e);
	}

	@Nullable
	private bdw f() {
		Random random2 = this.a.bJ();
		co co3 = new co(this.a.p, this.a.bo().b, this.a.r);

		for (int integer4 = 0; integer4 < 10; integer4++) {
			co co5 = co3.a(random2.nextInt(20) - 10, random2.nextInt(6) - 3, random2.nextInt(20) - 10);
			if (!this.f.h(co5) && this.a.a(co5) < 0.0F) {
				return new bdw((double)co5.p(), (double)co5.q(), (double)co5.r());
			}
		}

		return null;
	}
}
