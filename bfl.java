import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class bfl extends bfi {
	private static final kq a = new kq("textures/gui/bars.png");
	private final bes f;
	private final Map<UUID, bfu> g = Maps.newLinkedHashMap();

	public bfl(bes bes) {
		this.f = bes;
	}

	public void a() {
		if (!this.g.isEmpty()) {
			bfk bfk2 = new bfk(this.f);
			int integer3 = bfk2.a();
			int integer4 = 12;

			for (bfu bfu6 : this.g.values()) {
				int integer7 = integer3 / 2 - 91;
				bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
				this.f.N().a(a);
				this.a(integer7, integer4, bfu6);
				String string9 = bfu6.e().d();
				this.f.k.a(string9, (float)(integer3 / 2 - this.f.k.a(string9) / 2), (float)(integer4 - 9), 16777215);
				integer4 += 10 + this.f.k.a;
				if (integer4 >= bfk2.b() / 3) {
					break;
				}
			}
		}
	}

	private void a(int integer1, int integer2, ra ra) {
		this.b(integer1, integer2, 0, ra.g().ordinal() * 5 * 2, 182, 5);
		if (ra.h() != ra.b.PROGRESS) {
			this.b(integer1, integer2, 0, 80 + (ra.h().ordinal() - 1) * 5 * 2, 182, 5);
		}

		int integer5 = (int)(ra.f() * 183.0F);
		if (integer5 > 0) {
			this.b(integer1, integer2, 0, ra.g().ordinal() * 5 * 2 + 5, integer5, 5);
			if (ra.h() != ra.b.PROGRESS) {
				this.b(integer1, integer2, 0, 80 + (ra.h().ordinal() - 1) * 5 * 2 + 5, integer5, 5);
			}
		}
	}

	public void a(gc gc) {
		if (gc.b() == gc.a.ADD) {
			this.g.put(gc.a(), new bfu(gc));
		} else if (gc.b() == gc.a.REMOVE) {
			this.g.remove(gc.a());
		} else {
			((bfu)this.g.get(gc.a())).a(gc);
		}
	}

	public void b() {
		this.g.clear();
	}

	public boolean d() {
		if (!this.g.isEmpty()) {
			for (ra ra3 : this.g.values()) {
				if (ra3.j()) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean e() {
		if (!this.g.isEmpty()) {
			for (ra ra3 : this.g.values()) {
				if (ra3.i()) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean f() {
		if (!this.g.isEmpty()) {
			for (ra ra3 : this.g.values()) {
				if (ra3.k()) {
					return true;
				}
			}
		}

		return false;
	}
}
