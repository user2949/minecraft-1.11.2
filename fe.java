import net.minecraft.server.MinecraftServer;

public class fe extends ez {
	private final String b;
	private final String c;
	private String d = "";

	public fe(String string1, String string2) {
		this.b = string1;
		this.c = string2;
	}

	public String g() {
		return this.b;
	}

	public String h() {
		return this.c;
	}

	public void b(String string) {
		this.d = string;
	}

	@Override
	public String e() {
		return this.d;
	}

	public void a(n n) {
		MinecraftServer minecraftServer3 = n.B_();
		if (minecraftServer3 != null && minecraftServer3.M() && oy.b(this.d)) {
			bec bec4 = minecraftServer3.a(0).ad();
			bdy bdy5 = bec4.b(this.c);
			if (bec4.b(this.b, bdy5)) {
				bea bea6 = bec4.c(this.b, bdy5);
				this.b(String.format("%d", bea6.c()));
			} else {
				this.d = "";
			}
		}
	}

	public fe f() {
		fe fe2 = new fe(this.b, this.c);
		fe2.b(this.d);
		fe2.a(this.b().m());

		for (fb fb4 : this.a()) {
			fe2.a(fb4.f());
		}

		return fe2;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (!(object instanceof fe)) {
			return false;
		} else {
			fe fe3 = (fe)object;
			return this.b.equals(fe3.b) && this.c.equals(fe3.c) && super.equals(object);
		}
	}

	@Override
	public String toString() {
		return "ScoreComponent{name='" + this.b + '\'' + "objective='" + this.c + '\'' + ", siblings=" + this.a + ", style=" + this.b() + '}';
	}
}
