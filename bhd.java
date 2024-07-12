import com.google.common.base.Predicate;
import java.net.IDN;
import javax.annotation.Nullable;
import org.lwjgl.input.Keyboard;

public class bhd extends bho {
	private final bho a;
	private final bnt f;
	private bfq g;
	private bfq h;
	private bfm i;
	private final Predicate<String> r = new Predicate<String>() {
		public boolean apply(@Nullable String string) {
			if (oy.b(string)) {
				return true;
			} else {
				String[] arr3 = string.split(":");
				if (arr3.length == 0) {
					return true;
				} else {
					try {
						String string4 = IDN.toASCII(arr3[0]);
						return true;
					} catch (IllegalArgumentException var4) {
						return false;
					}
				}
			}
		}
	};

	public bhd(bho bho, bnt bnt) {
		this.a = bho;
		this.f = bnt;
	}

	@Override
	public void e() {
		this.h.a();
		this.g.a();
	}

	@Override
	public void b() {
		Keyboard.enableRepeatEvents(true);
		this.n.clear();
		this.n.add(new bfm(0, this.l / 2 - 100, this.m / 4 + 96 + 18, cah.a("addServer.add")));
		this.n.add(new bfm(1, this.l / 2 - 100, this.m / 4 + 120 + 18, cah.a("gui.cancel")));
		this.i = this.b(new bfm(2, this.l / 2 - 100, this.m / 4 + 72, cah.a("addServer.resourcePack") + ": " + this.f.b().a().d()));
		this.h = new bfq(0, this.q, this.l / 2 - 100, 66, 200, 20);
		this.h.b(true);
		this.h.a(this.f.a);
		this.g = new bfq(1, this.q, this.l / 2 - 100, 106, 200, 20);
		this.g.f(128);
		this.g.a(this.f.b);
		this.g.a(this.r);
		((bfm)this.n.get(0)).l = !this.g.b().isEmpty() && this.g.b().split(":").length > 0 && !this.h.b().isEmpty();
	}

	@Override
	public void m() {
		Keyboard.enableRepeatEvents(false);
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			if (bfm.k == 2) {
				this.f.a(bnt.a.values()[(this.f.b().ordinal() + 1) % bnt.a.values().length]);
				this.i.j = cah.a("addServer.resourcePack") + ": " + this.f.b().a().d();
			} else if (bfm.k == 1) {
				this.a.a(false, 0);
			} else if (bfm.k == 0) {
				this.f.a = this.h.b();
				this.f.b = this.g.b();
				this.a.a(true, 0);
			}
		}
	}

	@Override
	protected void a(char character, int integer) {
		this.h.a(character, integer);
		this.g.a(character, integer);
		if (integer == 15) {
			this.h.b(!this.h.m());
			this.g.b(!this.g.m());
		}

		if (integer == 28 || integer == 156) {
			this.a((bfm)this.n.get(0));
		}

		((bfm)this.n.get(0)).l = !this.g.b().isEmpty() && this.g.b().split(":").length > 0 && !this.h.b().isEmpty();
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		super.a(integer1, integer2, integer3);
		this.g.a(integer1, integer2, integer3);
		this.h.a(integer1, integer2, integer3);
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.a(this.q, cah.a("addServer.title"), this.l / 2, 17, 16777215);
		this.c(this.q, cah.a("addServer.enterName"), this.l / 2 - 100, 53, 10526880);
		this.c(this.q, cah.a("addServer.enterIp"), this.l / 2 - 100, 94, 10526880);
		this.h.g();
		this.g.g();
		super.a(integer1, integer2, float3);
	}
}
