import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class ud extends ui {
	private static final Predicate<atl> b = atu.a(alv.H).a(ari.a, Predicates.equalTo(ari.a.GRASS));
	private final sx c;
	private final ajs d;
	int a;

	public ud(sx sx) {
		this.c = sx;
		this.d = sx.l;
		this.a(7);
	}

	@Override
	public boolean a() {
		if (this.c.bJ().nextInt(this.c.l_() ? 50 : 1000) != 0) {
			return false;
		} else {
			co co2 = new co(this.c.p, this.c.q, this.c.r);
			return b.apply(this.d.o(co2)) ? true : this.d.o(co2.b()).v() == alv.c;
		}
	}

	@Override
	public void c() {
		this.a = 40;
		this.d.a(this.c, (byte)10);
		this.c.x().o();
	}

	@Override
	public void d() {
		this.a = 0;
	}

	@Override
	public boolean b() {
		return this.a > 0;
	}

	public int f() {
		return this.a;
	}

	@Override
	public void e() {
		this.a = Math.max(0, this.a - 1);
		if (this.a == 4) {
			co co2 = new co(this.c.p, this.c.q, this.c.r);
			if (b.apply(this.d.o(co2))) {
				if (this.d.U().b("mobGriefing")) {
					this.d.b(co2, false);
				}

				this.c.A();
			} else {
				co co3 = co2.b();
				if (this.d.o(co3).v() == alv.c) {
					if (this.d.U().b("mobGriefing")) {
						this.d.b(2001, co3, alu.a(alv.c));
						this.d.a(co3, alv.d.t(), 2);
					}

					this.c.A();
				}
			}
		}
	}
}
