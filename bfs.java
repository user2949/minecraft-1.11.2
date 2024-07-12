import com.google.common.collect.Lists;
import java.util.List;

public class bfs extends bfi {
	protected int a = 200;
	protected int f = 20;
	public int g;
	public int h;
	private final List<String> k;
	public int i;
	private boolean l;
	public boolean j = true;
	private boolean m;
	private final int n;
	private int o;
	private int p;
	private int q;
	private final bfg r;
	private int s;

	public bfs(bfg bfg, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7) {
		this.r = bfg;
		this.i = integer2;
		this.g = integer3;
		this.h = integer4;
		this.a = integer5;
		this.f = integer6;
		this.k = Lists.newArrayList();
		this.l = false;
		this.m = false;
		this.n = integer7;
		this.o = -1;
		this.p = -1;
		this.q = -1;
		this.s = 0;
	}

	public void a(String string) {
		this.k.add(cah.a(string));
	}

	public bfs a() {
		this.l = true;
		return this;
	}

	public void a(bes bes, int integer2, int integer3) {
		if (this.j) {
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
			this.b(bes, integer2, integer3);
			int integer5 = this.h + this.f / 2 + this.s / 2;
			int integer6 = integer5 - this.k.size() * 10 / 2;

			for (int integer7 = 0; integer7 < this.k.size(); integer7++) {
				if (this.l) {
					this.a(this.r, (String)this.k.get(integer7), this.g + this.a / 2, integer6 + integer7 * 10, this.n);
				} else {
					this.c(this.r, (String)this.k.get(integer7), this.g, integer6 + integer7 * 10, this.n);
				}
			}
		}
	}

	protected void b(bes bes, int integer2, int integer3) {
		if (this.m) {
			int integer5 = this.a + this.s * 2;
			int integer6 = this.f + this.s * 2;
			int integer7 = this.g - this.s;
			int integer8 = this.h - this.s;
			a(integer7, integer8, integer7 + integer5, integer8 + integer6, this.o);
			this.a(integer7, integer7 + integer5, integer8, this.p);
			this.a(integer7, integer7 + integer5, integer8 + integer6, this.q);
			this.b(integer7, integer8, integer8 + integer6, this.p);
			this.b(integer7 + integer5, integer8, integer8 + integer6, this.q);
		}
	}
}
