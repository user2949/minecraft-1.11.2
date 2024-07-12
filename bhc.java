import java.util.List;

public class bhc extends bho {
	private final String a;
	private final fb f;
	private List<String> g;
	private final bho h;
	private int i;

	public bhc(bho bho, String string, fb fb) {
		this.h = bho;
		this.a = cah.a(string);
		this.f = fb;
	}

	@Override
	protected void a(char character, int integer) {
	}

	@Override
	public void b() {
		this.n.clear();
		this.g = this.q.c(this.f.d(), this.l - 50);
		this.i = this.g.size() * this.q.a;
		this.n.add(new bfm(0, this.l / 2 - 100, Math.min(this.m / 2 + this.i / 2 + this.q.a, this.m - 30), cah.a("gui.toMenu")));
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.k == 0) {
			this.j.a(this.h);
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.a(this.q, this.a, this.l / 2, this.m / 2 - this.i / 2 - this.q.a * 2, 11184810);
		int integer5 = this.m / 2 - this.i / 2;
		if (this.g != null) {
			for (String string7 : this.g) {
				this.a(this.q, string7, this.l / 2, integer5, 16777215);
				integer5 += this.q.a;
			}
		}

		super.a(integer1, integer2, float3);
	}
}
