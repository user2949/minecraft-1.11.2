import com.google.common.collect.Lists;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;

public class bhr extends bho {
	private final bho a;
	private final beu f;
	private final List<String> g = Lists.newArrayList();
	private final List<String> h = Lists.newArrayList();
	private String i;
	private String[] r;
	private bhr.a s;
	private bfm t;

	public bhr(bho bho, beu beu) {
		this.a = bho;
		this.f = beu;
	}

	@Override
	public void b() {
		this.i = cah.a("options.snooper.title");
		String string2 = cah.a("options.snooper.desc");
		List<String> list3 = Lists.newArrayList();

		for (String string5 : this.q.c(string2, this.l - 30)) {
			list3.add(string5);
		}

		this.r = (String[])list3.toArray(new String[list3.size()]);
		this.g.clear();
		this.h.clear();
		this.t = this.b(new bfm(1, this.l / 2 - 152, this.m - 30, 150, 20, this.f.c(beu.a.SNOOPER_ENABLED)));
		this.n.add(new bfm(2, this.l / 2 + 2, this.m - 30, 150, 20, cah.a("gui.done")));
		boolean boolean4 = this.j.F() != null && this.j.F().as() != null;

		for (Entry<String, String> entry6 : new TreeMap(this.j.H().c()).entrySet()) {
			this.g.add((boolean4 ? "C " : "") + (String)entry6.getKey());
			this.h.add(this.q.a((String)entry6.getValue(), this.l - 220));
		}

		if (boolean4) {
			for (Entry<String, String> entry6 : new TreeMap(this.j.F().as().c()).entrySet()) {
				this.g.add("S " + (String)entry6.getKey());
				this.h.add(this.q.a((String)entry6.getValue(), this.l - 220));
			}
		}

		this.s = new bhr.a();
	}

	@Override
	public void k() {
		super.k();
		this.s.p();
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			if (bfm.k == 2) {
				this.f.b();
				this.f.b();
				this.j.a(this.a);
			}

			if (bfm.k == 1) {
				this.f.a(beu.a.SNOOPER_ENABLED, 1);
				this.t.j = this.f.c(beu.a.SNOOPER_ENABLED);
			}
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.s.a(integer1, integer2, float3);
		this.a(this.q, this.i, this.l / 2, 8, 16777215);
		int integer5 = 22;

		for (String string9 : this.r) {
			this.a(this.q, string9, this.l / 2, integer5, 8421504);
			integer5 += this.q.a;
		}

		super.a(integer1, integer2, float3);
	}

	class a extends bgd {
		public a() {
			super(bhr.this.j, bhr.this.l, bhr.this.m, 80, bhr.this.m - 40, bhr.this.q.a + 1);
		}

		@Override
		protected int b() {
			return bhr.this.g.size();
		}

		@Override
		protected void a(int integer1, boolean boolean2, int integer3, int integer4) {
		}

		@Override
		protected boolean a(int integer) {
			return false;
		}

		@Override
		protected void a() {
		}

		@Override
		protected void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
			bhr.this.q.a((String)bhr.this.g.get(integer1), 10, integer3, 16777215);
			bhr.this.q.a((String)bhr.this.h.get(integer1), 230, integer3, 16777215);
		}

		@Override
		protected int d() {
			return this.b - 10;
		}
	}
}
