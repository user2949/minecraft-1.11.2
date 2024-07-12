import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bka extends bho {
	private static final Logger g = LogManager.getLogger();
	protected bho a;
	protected String f = "Select world";
	private String h;
	private bfm i;
	private bfm r;
	private bfm s;
	private bfm t;
	private bkc u;

	public bka(bho bho) {
		this.a = bho;
	}

	@Override
	public void b() {
		this.f = cah.a("selectWorld.title");
		this.u = new bkc(this, this.j, this.l, this.m, 32, this.m - 64, 36);
		this.a();
	}

	@Override
	public void k() {
		super.k();
		this.u.p();
	}

	public void a() {
		this.r = this.b(new bfm(1, this.l / 2 - 154, this.m - 52, 150, 20, cah.a("selectWorld.select")));
		this.b(new bfm(3, this.l / 2 + 4, this.m - 52, 150, 20, cah.a("selectWorld.create")));
		this.s = this.b(new bfm(4, this.l / 2 - 154, this.m - 28, 72, 20, cah.a("selectWorld.edit")));
		this.i = this.b(new bfm(2, this.l / 2 - 76, this.m - 28, 72, 20, cah.a("selectWorld.delete")));
		this.t = this.b(new bfm(5, this.l / 2 + 4, this.m - 28, 72, 20, cah.a("selectWorld.recreate")));
		this.b(new bfm(0, this.l / 2 + 82, this.m - 28, 72, 20, cah.a("gui.cancel")));
		this.r.l = false;
		this.i.l = false;
		this.s.l = false;
		this.t.l = false;
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			bkb bkb3 = this.u.f();
			if (bfm.k == 2) {
				if (bkb3 != null) {
					bkb3.b();
				}
			} else if (bfm.k == 1) {
				if (bkb3 != null) {
					bkb3.a();
				}
			} else if (bfm.k == 3) {
				this.j.a(new bjy(this));
			} else if (bfm.k == 4) {
				if (bkb3 != null) {
					bkb3.c();
				}
			} else if (bfm.k == 0) {
				this.j.a(this.a);
			} else if (bfm.k == 5 && bkb3 != null) {
				bkb3.d();
			}
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.h = null;
		this.u.a(integer1, integer2, float3);
		this.a(this.q, this.f, this.l / 2, 20, 16777215);
		super.a(integer1, integer2, float3);
		if (this.h != null) {
			this.a(Lists.newArrayList(Splitter.on("\n").split(this.h)), integer1, integer2);
		}
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		super.a(integer1, integer2, integer3);
		this.u.b(integer1, integer2, integer3);
	}

	@Override
	protected void b(int integer1, int integer2, int integer3) {
		super.b(integer1, integer2, integer3);
		this.u.c(integer1, integer2, integer3);
	}

	public void a(String string) {
		this.h = string;
	}

	public void a(@Nullable bkb bkb) {
		boolean boolean3 = bkb != null;
		this.r.l = boolean3;
		this.i.l = boolean3;
		this.s.l = boolean3;
		this.t.l = boolean3;
	}
}
