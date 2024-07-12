import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ys {
	private static final Logger a = LogManager.getLogger();
	private final yb b;
	private final yl[] c = new yl[yr.c()];
	private yl d;

	public ys(yb yb) {
		this.b = yb;
		this.a(yr.k);
	}

	public void a(yr<?> yr) {
		if (this.d == null || yr != this.d.i()) {
			if (this.d != null) {
				this.d.e();
			}

			this.d = this.b((yr<yl>)yr);
			if (!this.b.l.E) {
				this.b.R().b(yb.a, yr.b());
			}

			a.debug("Dragon is now in phase {} on the {}", new Object[]{yr, this.b.l.E ? "client" : "server"});
			this.d.d();
		}
	}

	public yl a() {
		return this.d;
	}

	public <T extends yl> T b(yr<T> yr) {
		int integer3 = yr.b();
		if (this.c[integer3] == null) {
			this.c[integer3] = yr.a(this.b);
		}

		return (T)this.c[integer3];
	}
}
