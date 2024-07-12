import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class yf extends yd {
	private static final Logger b = LogManager.getLogger();
	private bdw c;
	private int d;

	public yf(yb yb) {
		super(yb);
	}

	@Override
	public void c() {
		if (this.c == null) {
			b.warn("Aborting charge player as no target was set.");
			this.a.da().a(yr.a);
		} else if (this.d > 0 && this.d++ >= 10) {
			this.a.da().a(yr.a);
		} else {
			double double2 = this.c.c(this.a.p, this.a.q, this.a.r);
			if (double2 < 100.0 || double2 > 22500.0 || this.a.A || this.a.B) {
				this.d++;
			}
		}
	}

	@Override
	public void d() {
		this.c = null;
		this.d = 0;
	}

	public void a(bdw bdw) {
		this.c = bdw;
	}

	@Override
	public float f() {
		return 3.0F;
	}

	@Nullable
	@Override
	public bdw g() {
		return this.c;
	}

	@Override
	public yr<yf> i() {
		return yr.i;
	}
}
