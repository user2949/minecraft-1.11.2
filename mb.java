import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mb {
	private static final Logger a = LogManager.getLogger();
	private final mc b;
	private final List<ly> c = Lists.newArrayList();
	private final ajl d;
	private final short[] e = new short[64];
	@Nullable
	private auo f;
	private int g;
	private int h;
	private long i;
	private boolean j;

	public mb(mc mc, int integer2, int integer3) {
		this.b = mc;
		this.d = new ajl(integer2, integer3);
		this.f = mc.a().r().b(integer2, integer3);
	}

	public ajl a() {
		return this.d;
	}

	public void a(ly ly) {
		if (this.c.contains(ly)) {
			a.debug("Failed to add player. {} already is in chunk {}, {}", new Object[]{ly, this.d.a, this.d.b});
		} else {
			if (this.c.isEmpty()) {
				this.i = this.b.a().P();
			}

			this.c.add(ly);
			if (this.j) {
				this.c(ly);
			}
		}
	}

	public void b(ly ly) {
		if (this.c.contains(ly)) {
			if (this.j) {
				ly.a.a(new gt(this.d.a, this.d.b));
			}

			this.c.remove(ly);
			if (this.c.isEmpty()) {
				this.b.b(this);
			}
		}
	}

	public boolean a(boolean boolean1) {
		if (this.f != null) {
			return true;
		} else {
			if (boolean1) {
				this.f = this.b.a().r().c(this.d.a, this.d.b);
			} else {
				this.f = this.b.a().r().b(this.d.a, this.d.b);
			}

			return this.f != null;
		}
	}

	public boolean b() {
		if (this.j) {
			return true;
		} else if (this.f == null) {
			return false;
		} else if (!this.f.i()) {
			return false;
		} else {
			this.g = 0;
			this.h = 0;
			this.j = true;
			fm<?> fm2 = new gw(this.f, 65535);

			for (ly ly4 : this.c) {
				ly4.a.a(fm2);
				this.b.a().v().a(ly4, this.f);
			}

			return true;
		}
	}

	public void c(ly ly) {
		if (this.j) {
			ly.a.a(new gw(this.f, 65535));
			this.b.a().v().a(ly, this.f);
		}
	}

	public void c() {
		long long2 = this.b.a().P();
		if (this.f != null) {
			this.f.c(this.f.x() + long2 - this.i);
		}

		this.i = long2;
	}

	public void a(int integer1, int integer2, int integer3) {
		if (this.j) {
			if (this.g == 0) {
				this.b.a(this);
			}

			this.h |= 1 << (integer2 >> 4);
			if (this.g < 64) {
				short short5 = (short)(integer1 << 12 | integer3 << 8 | integer2);

				for (int integer6 = 0; integer6 < this.g; integer6++) {
					if (this.e[integer6] == short5) {
						return;
					}
				}

				this.e[this.g++] = short5;
			}
		}
	}

	public void a(fm<?> fm) {
		if (this.j) {
			for (int integer3 = 0; integer3 < this.c.size(); integer3++) {
				((ly)this.c.get(integer3)).a.a(fm);
			}
		}
	}

	public void d() {
		if (this.j && this.f != null) {
			if (this.g != 0) {
				if (this.g == 1) {
					int integer2 = (this.e[0] >> 12 & 15) + this.d.a * 16;
					int integer3 = this.e[0] & 255;
					int integer4 = (this.e[0] >> 8 & 15) + this.d.b * 16;
					co co5 = new co(integer2, integer3, integer4);
					this.a(new gb(this.b.a(), co5));
					if (this.b.a().o(co5).v().l()) {
						this.a(this.b.a().r(co5));
					}
				} else if (this.g == 64) {
					this.a(new gw(this.f, this.h));
				} else {
					this.a(new gg(this.g, this.e, this.f));

					for (int integer2 = 0; integer2 < this.g; integer2++) {
						int integer3 = (this.e[integer2] >> 12 & 15) + this.d.a * 16;
						int integer4 = this.e[integer2] & 255;
						int integer5 = (this.e[integer2] >> 8 & 15) + this.d.b * 16;
						co co6 = new co(integer3, integer4, integer5);
						if (this.b.a().o(co6).v().l()) {
							this.a(this.b.a().r(co6));
						}
					}
				}

				this.g = 0;
				this.h = 0;
			}
		}
	}

	private void a(@Nullable asc asc) {
		if (asc != null) {
			fz fz3 = asc.c();
			if (fz3 != null) {
				this.a(fz3);
			}
		}
	}

	public boolean d(ly ly) {
		return this.c.contains(ly);
	}

	public boolean a(Predicate<ly> predicate) {
		return Iterables.tryFind(this.c, predicate).isPresent();
	}

	public boolean a(double double1, Predicate<ly> predicate) {
		int integer5 = 0;

		for (int integer6 = this.c.size(); integer5 < integer6; integer5++) {
			ly ly7 = (ly)this.c.get(integer5);
			if (predicate.apply(ly7) && this.d.a(ly7) < double1 * double1) {
				return true;
			}
		}

		return false;
	}

	public boolean e() {
		return this.j;
	}

	@Nullable
	public auo f() {
		return this.f;
	}

	public double g() {
		double double2 = Double.MAX_VALUE;

		for (ly ly5 : this.c) {
			double double6 = this.d.a(ly5);
			if (double6 < double2) {
				double2 = double6;
			}
		}

		return double2;
	}
}
