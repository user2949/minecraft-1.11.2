public class akc extends pb.a {
	private final du b;

	public akc() {
		super(1);
		this.b = new du();
		this.b.a("id", "minecraft:pig");
	}

	public akc(du du) {
		this(du.b("Weight", 99) ? du.h("Weight") : 1, du.o("Entity"));
	}

	public akc(int integer, du du) {
		super(integer);
		this.b = du;
	}

	public du a() {
		du du2 = new du();
		if (!this.b.b("id", 8)) {
			this.b.a("id", "minecraft:pig");
		} else if (!this.b.l("id").contains(":")) {
			this.b.a("id", new kq(this.b.l("id")).toString());
		}

		du2.a("Entity", this.b);
		du2.a("Weight", this.a);
		return du2;
	}

	public du b() {
		return this.b;
	}
}
