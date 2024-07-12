public class bhm extends bho implements ov {
	private String a = "";
	private String f = "";
	private int g;
	private boolean h;

	@Override
	public void a(String string) {
		this.b(string);
	}

	@Override
	public void b(String string) {
		this.a = string;
		this.c("Working...");
	}

	@Override
	public void c(String string) {
		this.f = string;
		this.a(0);
	}

	@Override
	public void a(int integer) {
		this.g = integer;
	}

	@Override
	public void a() {
		this.h = true;
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		if (this.h) {
			if (!this.j.ah()) {
				this.j.a(null);
			}
		} else {
			this.c();
			this.a(this.q, this.a, this.l / 2, 70, 16777215);
			this.a(this.q, this.f + " " + this.g + "%", this.l / 2, 90, 16777215);
			super.a(integer1, integer2, float3);
		}
	}
}
