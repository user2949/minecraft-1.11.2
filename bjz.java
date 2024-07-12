import org.apache.commons.io.FileUtils;
import org.lwjgl.input.Keyboard;

public class bjz extends bho {
	private final bho a;
	private bfq f;
	private final String g;

	public bjz(bho bho, String string) {
		this.a = bho;
		this.g = string;
	}

	@Override
	public void e() {
		this.f.a();
	}

	@Override
	public void b() {
		Keyboard.enableRepeatEvents(true);
		this.n.clear();
		bfm bfm2 = this.b(new bfm(3, this.l / 2 - 100, this.m / 4 + 24 + 12, cah.a("selectWorld.edit.resetIcon")));
		this.n.add(new bfm(4, this.l / 2 - 100, this.m / 4 + 48 + 12, cah.a("selectWorld.edit.openFolder")));
		this.n.add(new bfm(0, this.l / 2 - 100, this.m / 4 + 96 + 12, cah.a("selectWorld.edit.save")));
		this.n.add(new bfm(1, this.l / 2 - 100, this.m / 4 + 120 + 12, cah.a("gui.cancel")));
		bfm2.l = this.j.g().b(this.g, "icon.png").isFile();
		bby bby3 = this.j.g();
		bbv bbv4 = bby3.c(this.g);
		String string5 = bbv4 == null ? "" : bbv4.j();
		this.f = new bfq(2, this.q, this.l / 2 - 100, 60, 200, 20);
		this.f.b(true);
		this.f.a(string5);
	}

	@Override
	public void m() {
		Keyboard.enableRepeatEvents(false);
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			if (bfm.k == 1) {
				this.j.a(this.a);
			} else if (bfm.k == 0) {
				bby bby3 = this.j.g();
				bby3.a(this.g, this.f.b().trim());
				this.j.a(this.a);
			} else if (bfm.k == 3) {
				bby bby3 = this.j.g();
				FileUtils.deleteQuietly(bby3.b(this.g, "icon.png"));
				bfm.l = false;
			} else if (bfm.k == 4) {
				bby bby3 = this.j.g();
				cdb.a(bby3.b(this.g, "icon.png").getParentFile());
			}
		}
	}

	@Override
	protected void a(char character, int integer) {
		this.f.a(character, integer);
		((bfm)this.n.get(2)).l = !this.f.b().trim().isEmpty();
		if (integer == 28 || integer == 156) {
			this.a((bfm)this.n.get(2));
		}
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		super.a(integer1, integer2, integer3);
		this.f.a(integer1, integer2, integer3);
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.a(this.q, cah.a("selectWorld.edit.title"), this.l / 2, 20, 16777215);
		this.c(this.q, cah.a("selectWorld.enterName"), this.l / 2 - 100, 47, 10526880);
		this.f.g();
		super.a(integer1, integer2, float3);
	}
}
