public class bnt {
	public String a;
	public String b;
	public String c;
	public String d;
	public long e;
	public int f = 316;
	public String g = "1.11.2";
	public boolean h;
	public String i;
	private bnt.a j = bnt.a.PROMPT;
	private String k;
	private boolean l;

	public bnt(String string1, String string2, boolean boolean3) {
		this.a = string1;
		this.b = string2;
		this.l = boolean3;
	}

	public du a() {
		du du2 = new du();
		du2.a("name", this.a);
		du2.a("ip", this.b);
		if (this.k != null) {
			du2.a("icon", this.k);
		}

		if (this.j == bnt.a.ENABLED) {
			du2.a("acceptTextures", true);
		} else if (this.j == bnt.a.DISABLED) {
			du2.a("acceptTextures", false);
		}

		return du2;
	}

	public bnt.a b() {
		return this.j;
	}

	public void a(bnt.a a) {
		this.j = a;
	}

	public static bnt a(du du) {
		bnt bnt2 = new bnt(du.l("name"), du.l("ip"), false);
		if (du.b("icon", 8)) {
			bnt2.a(du.l("icon"));
		}

		if (du.b("acceptTextures", 1)) {
			if (du.p("acceptTextures")) {
				bnt2.a(bnt.a.ENABLED);
			} else {
				bnt2.a(bnt.a.DISABLED);
			}
		} else {
			bnt2.a(bnt.a.PROMPT);
		}

		return bnt2;
	}

	public String c() {
		return this.k;
	}

	public void a(String string) {
		this.k = string;
	}

	public boolean d() {
		return this.l;
	}

	public void a(bnt bnt) {
		this.b = bnt.b;
		this.a = bnt.a;
		this.a(bnt.b());
		this.k = bnt.k;
		this.l = bnt.l;
	}

	public static enum a {
		ENABLED("enabled"),
		DISABLED("disabled"),
		PROMPT("prompt");

		private final fb d;

		private a(String string3) {
			this.d = new fi("addServer.resourcePack." + string3);
		}

		public fb a() {
			return this.d;
		}
	}
}
