import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;

public class zq extends zx {
	public zq(ajs ajs) {
		super(ajs);
		this.a(this.G * 2.35F, this.H * 2.35F);
		this.cS();
		if (this.by != null) {
			this.by.b(400);
		}
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.d).a(0.3F);
		this.a(aad.e).a(8.0);
		this.a(aad.a).a(80.0);
	}

	public static void a(ph ph) {
		sx.a(ph, zq.class);
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.y;
	}

	@Override
	public int o() {
		return 60;
	}

	public void di() {
		this.bw = 1.0F;
		this.bx = this.bw;
	}

	@Override
	protected nm G() {
		return this.aj() ? nn.aF : nn.aG;
	}

	@Override
	protected nm bW() {
		return this.aj() ? nn.aL : nn.aM;
	}

	@Override
	protected nm bX() {
		return this.aj() ? nn.aI : nn.aJ;
	}

	@Override
	protected nm dj() {
		return nn.aK;
	}

	@Override
	protected void M() {
		super.M();
		int integer2 = 1200;
		if ((this.T + this.O()) % 1200 == 0) {
			sg sg3 = si.d;
			List<ly> list4 = this.l.b(ly.class, new Predicate<ly>() {
				public boolean apply(@Nullable ly ly) {
					return zq.this.h(ly) < 2500.0 && ly.c.c();
				}
			});
			int integer5 = 2;
			int integer6 = 6000;
			int integer7 = 1200;

			for (ly ly9 : list4) {
				if (!ly9.a(sg3) || ly9.b(sg3).c() < 2 || ly9.b(sg3).b() < 1200) {
					ly9.a.a(new gu(10, 0.0F));
					ly9.c(new sh(sg3, 6000, 2));
				}
			}
		}

		if (!this.df()) {
			this.a(new co(this), 16);
		}
	}
}
