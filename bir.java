import com.google.common.collect.Ordering;
import java.util.Collection;

public abstract class bir extends big {
	private boolean u;

	public bir(acl acl) {
		super(acl);
	}

	@Override
	public void b() {
		super.b();
		this.a();
	}

	@Override
	protected void a() {
		if (this.j.h.bS().isEmpty()) {
			this.i = (this.l - this.f) / 2;
			this.u = false;
		} else {
			this.i = 160 + (this.l - this.f - 200) / 2;
			this.u = true;
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		super.a(integer1, integer2, float3);
		if (this.u) {
			this.f();
		}
	}

	private void f() {
		int integer2 = this.i - 124;
		int integer3 = this.r;
		int integer4 = 166;
		Collection<sh> collection5 = this.j.h.bS();
		if (!collection5.isEmpty()) {
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			bqg.g();
			int integer6 = 33;
			if (collection5.size() > 5) {
				integer6 = 132 / (collection5.size() - 1);
			}

			for (sh sh8 : Ordering.natural().sortedCopy(collection5)) {
				sg sg9 = sh8.a();
				bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
				this.j.N().a(a);
				this.b(integer2, integer3, 0, 166, 140, 32);
				if (sg9.c()) {
					int integer10 = sg9.d();
					this.b(integer2 + 6, integer3 + 7, 0 + integer10 % 8 * 18, 198 + integer10 / 8 * 18, 18, 18);
				}

				String string10 = cah.a(sg9.a());
				if (sh8.c() == 1) {
					string10 = string10 + " " + cah.a("enchantment.level.2");
				} else if (sh8.c() == 2) {
					string10 = string10 + " " + cah.a("enchantment.level.3");
				} else if (sh8.c() == 3) {
					string10 = string10 + " " + cah.a("enchantment.level.4");
				}

				this.q.a(string10, (float)(integer2 + 10 + 18), (float)(integer3 + 6), 16777215);
				String string11 = sg.a(sh8, 1.0F);
				this.q.a(string11, (float)(integer2 + 10 + 18), (float)(integer3 + 6 + 10), 8355711);
				integer3 += integer6;
			}
		}
	}
}
