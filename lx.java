import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class lx implements aju {
	private final MinecraftServer a;
	private final lw b;

	public lx(MinecraftServer minecraftServer, lw lw) {
		this.a = minecraftServer;
		this.b = lw;
	}

	@Override
	public void a(int integer, boolean boolean2, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
	}

	@Override
	public void a(
		int integer, boolean boolean2, boolean boolean3, double double4, double double5, double double6, double double7, double double8, double double9, int... arr
	) {
	}

	@Override
	public void a(sn sn) {
		this.b.v().a(sn);
		if (sn instanceof ly) {
			this.b.s.a((ly)sn);
		}
	}

	@Override
	public void b(sn sn) {
		this.b.v().b(sn);
		this.b.ad().a(sn);
		if (sn instanceof ly) {
			this.b.s.b((ly)sn);
		}
	}

	@Override
	public void a(@Nullable aay aay, nm nm, no no, double double4, double double5, double double6, float float7, float float8) {
		this.a
			.am()
			.a(
				aay,
				double4,
				double5,
				double6,
				float7 > 1.0F ? (double)(16.0F * float7) : 16.0,
				this.b.s.q().a(),
				new ig(nm, no, double4, double5, double6, float7, float8)
			);
	}

	@Override
	public void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
	}

	@Override
	public void a(ajs ajs, co co, atl atl3, atl atl4, int integer) {
		this.b.w().a(co);
	}

	@Override
	public void a(co co) {
	}

	@Override
	public void a(nm nm, co co) {
	}

	@Override
	public void a(aay aay, int integer2, co co, int integer4) {
		this.a.am().a(aay, (double)co.p(), (double)co.q(), (double)co.r(), 64.0, this.b.s.q().a(), new gx(integer2, co, integer4, false));
	}

	@Override
	public void a(int integer1, co co, int integer3) {
		this.a.am().a(new gx(integer1, co, integer3, true));
	}

	@Override
	public void b(int integer1, co co, int integer3) {
		for (ly ly6 : this.a.am().v()) {
			if (ly6 != null && ly6.l == this.b && ly6.O() != integer1) {
				double double7 = (double)co.p() - ly6.p;
				double double9 = (double)co.q() - ly6.q;
				double double11 = (double)co.r() - ly6.r;
				if (double7 * double7 + double9 * double9 + double11 * double11 < 1024.0) {
					ly6.a.a(new fy(integer1, co, integer3));
				}
			}
		}
	}
}
