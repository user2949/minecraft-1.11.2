import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public abstract class ays extends ayq {
	private static final aza d = new aza();
	protected azc a;
	protected aza b = d.a(true).a(alv.a);
	protected co c;

	public ays() {
	}

	public ays(int integer) {
		super(integer);
	}

	protected void a(azc azc, co co, aza aza) {
		this.a = azc;
		this.a(cv.NORTH);
		this.c = co;
		this.b = aza;
		this.b();
	}

	@Override
	protected void a(du du) {
		du.a("TPX", this.c.p());
		du.a("TPY", this.c.q());
		du.a("TPZ", this.c.r());
	}

	@Override
	protected void a(du du, ayz ayz) {
		this.c = new co(du.h("TPX"), du.h("TPY"), du.h("TPZ"));
	}

	@Override
	public boolean a(ajs ajs, Random random, axz axz) {
		this.b.a(axz);
		this.a.a(ajs, this.c, this.b, 18);
		Map<co, String> map5 = this.a.a(this.c, this.b);

		for (Entry<co, String> entry7 : map5.entrySet()) {
			String string8 = (String)entry7.getValue();
			this.a(string8, (co)entry7.getKey(), ajs, random, axz);
		}

		return true;
	}

	protected abstract void a(String string, co co, ajs ajs, Random random, axz axz);

	private void b() {
		aqi aqi2 = this.b.c();
		co co3 = this.a.a(aqi2);
		aou aou4 = this.b.b();
		this.l = new axz(0, 0, 0, co3.p(), co3.q() - 1, co3.r());
		switch (aqi2) {
			case NONE:
			default:
				break;
			case CLOCKWISE_90:
				this.l.a(-co3.p(), 0, 0);
				break;
			case COUNTERCLOCKWISE_90:
				this.l.a(0, 0, -co3.r());
				break;
			case CLOCKWISE_180:
				this.l.a(-co3.p(), 0, -co3.r());
		}

		switch (aou4) {
			case NONE:
			default:
				break;
			case FRONT_BACK:
				co co5 = co.a;
				if (aqi2 == aqi.CLOCKWISE_90 || aqi2 == aqi.COUNTERCLOCKWISE_90) {
					co5 = co5.a(aqi2.a(cv.WEST), co3.r());
				} else if (aqi2 == aqi.CLOCKWISE_180) {
					co5 = co5.a(cv.EAST, co3.p());
				} else {
					co5 = co5.a(cv.WEST, co3.p());
				}

				this.l.a(co5.p(), 0, co5.r());
				break;
			case LEFT_RIGHT:
				co co5 = co.a;
				if (aqi2 == aqi.CLOCKWISE_90 || aqi2 == aqi.COUNTERCLOCKWISE_90) {
					co5 = co5.a(aqi2.a(cv.NORTH), co3.p());
				} else if (aqi2 == aqi.CLOCKWISE_180) {
					co5 = co5.a(cv.SOUTH, co3.r());
				} else {
					co5 = co5.a(cv.NORTH, co3.r());
				}

				this.l.a(co5.p(), 0, co5.r());
		}

		this.l.a(this.c.p(), this.c.q(), this.c.r());
	}

	@Override
	public void a(int integer1, int integer2, int integer3) {
		super.a(integer1, integer2, integer3);
		this.c = this.c.a(integer1, integer2, integer3);
	}
}
