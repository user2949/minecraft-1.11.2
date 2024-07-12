import net.minecraft.realms.RealmsBridge;

public class bhk extends bho {
	private int a;
	private int f;

	@Override
	public void b() {
		this.a = 0;
		this.n.clear();
		int integer2 = -16;
		int integer3 = 98;
		this.n.add(new bfm(1, this.l / 2 - 100, this.m / 4 + 120 + -16, cah.a("menu.returnToMenu")));
		if (!this.j.D()) {
			((bfm)this.n.get(0)).j = cah.a("menu.disconnect");
		}

		this.n.add(new bfm(4, this.l / 2 - 100, this.m / 4 + 24 + -16, cah.a("menu.returnToGame")));
		this.n.add(new bfm(0, this.l / 2 - 100, this.m / 4 + 96 + -16, 98, 20, cah.a("menu.options")));
		bfm bfm4 = this.b(new bfm(7, this.l / 2 + 2, this.m / 4 + 96 + -16, 98, 20, cah.a("menu.shareToLan")));
		bfm4.l = this.j.E() && !this.j.F().a();
		this.n.add(new bfm(5, this.l / 2 - 100, this.m / 4 + 48 + -16, 98, 20, cah.a("gui.achievements")));
		this.n.add(new bfm(6, this.l / 2 + 2, this.m / 4 + 48 + -16, 98, 20, cah.a("gui.stats")));
	}

	@Override
	protected void a(bfm bfm) {
		switch (bfm.k) {
			case 0:
				this.j.a(new bhi(this, this.j.u));
				break;
			case 1:
				boolean boolean3 = this.j.D();
				boolean boolean4 = this.j.ah();
				bfm.l = false;
				this.j.f.M();
				this.j.a(null);
				if (boolean3) {
					this.j.a(new bhv());
				} else if (boolean4) {
					RealmsBridge realmsBridge5 = new RealmsBridge();
					realmsBridge5.switchToRealms(new bhv());
				} else {
					this.j.a(new bjf(new bhv()));
				}
			case 2:
			case 3:
			default:
				break;
			case 4:
				this.j.a(null);
				this.j.o();
				break;
			case 5:
				this.j.a(new bhz(this, this.j.h.E()));
				break;
			case 6:
				this.j.a(new bia(this, this.j.h.E()));
				break;
			case 7:
				this.j.a(new bhp(this));
		}
	}

	@Override
	public void e() {
		super.e();
		this.f++;
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.a(this.q, cah.a("menu.game"), this.l / 2, 40, 16777215);
		super.a(integer1, integer2, float3);
	}
}
