public class aaw {
	public boolean a;
	public boolean b;
	public boolean c;
	public boolean d;
	public boolean e = true;
	private float f = 0.05F;
	private float g = 0.1F;

	public void a(du du) {
		du du3 = new du();
		du3.a("invulnerable", this.a);
		du3.a("flying", this.b);
		du3.a("mayfly", this.c);
		du3.a("instabuild", this.d);
		du3.a("mayBuild", this.e);
		du3.a("flySpeed", this.f);
		du3.a("walkSpeed", this.g);
		du.a("abilities", du3);
	}

	public void b(du du) {
		if (du.b("abilities", 10)) {
			du du3 = du.o("abilities");
			this.a = du3.p("invulnerable");
			this.b = du3.p("flying");
			this.c = du3.p("mayfly");
			this.d = du3.p("instabuild");
			if (du3.b("flySpeed", 99)) {
				this.f = du3.j("flySpeed");
				this.g = du3.j("walkSpeed");
			}

			if (du3.b("mayBuild", 1)) {
				this.e = du3.p("mayBuild");
			}
		}
	}

	public float a() {
		return this.f;
	}

	public void a(float float1) {
		this.f = float1;
	}

	public float b() {
		return this.g;
	}

	public void b(float float1) {
		this.g = float1;
	}
}
