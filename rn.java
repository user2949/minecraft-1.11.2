import javax.annotation.concurrent.Immutable;

@Immutable
public class rn {
	public static final rn a = new rn("");
	private final String b;

	public rn(String string) {
		this.b = string;
	}

	public boolean a() {
		return this.b == null || this.b.isEmpty();
	}

	public String b() {
		return this.b;
	}

	public void a(du du) {
		du.a("Lock", this.b);
	}

	public static rn b(du du) {
		if (du.b("Lock", 8)) {
			String string2 = du.l("Lock");
			return new rn(string2);
		} else {
			return a;
		}
	}
}
