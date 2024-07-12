import java.util.Random;

public class asi extends ast {
	private static final Random a = new Random();
	private dd<afj> f = dd.a(9, afj.a);

	@Override
	public int v_() {
		return 9;
	}

	@Override
	public boolean w_() {
		for (afj afj3 : this.f) {
			if (!afj3.b()) {
				return false;
			}
		}

		return true;
	}

	public int o() {
		this.d(null);
		int integer2 = -1;
		int integer3 = 1;

		for (int integer4 = 0; integer4 < this.f.size(); integer4++) {
			if (!this.f.get(integer4).b() && a.nextInt(integer3++) == 0) {
				integer2 = integer4;
			}
		}

		return integer2;
	}

	public int a(afj afj) {
		for (int integer3 = 0; integer3 < this.f.size(); integer3++) {
			if (this.f.get(integer3).b()) {
				this.a(integer3, afj);
				return integer3;
			}
		}

		return -1;
	}

	@Override
	public String h_() {
		return this.n_() ? this.o : "container.dispenser";
	}

	public static void a(ph ph) {
		ph.a(pf.BLOCK_ENTITY, new qu(asi.class, "Items"));
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.f = dd.a(this.v_(), afj.a);
		if (!this.c(du)) {
			rd.b(du, this.f);
		}

		if (du.b("CustomName", 8)) {
			this.o = du.l("CustomName");
		}
	}

	@Override
	public du b(du du) {
		super.b(du);
		if (!this.d(du)) {
			rd.a(du, this.f);
		}

		if (this.n_()) {
			du.a("CustomName", this.o);
		}

		return du;
	}

	@Override
	public int y_() {
		return 64;
	}

	@Override
	public String l() {
		return "minecraft:dispenser";
	}

	@Override
	public acl a(aax aax, aay aay) {
		this.d(aay);
		return new acu(aax, this);
	}

	@Override
	protected dd<afj> q() {
		return this.f;
	}
}
