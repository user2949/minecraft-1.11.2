import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class bhg extends bho {
	protected bho a;
	private bhg.a f;
	private final beu g;
	private final caj h;
	private bfz i;
	private bfz r;

	public bhg(bho bho, beu beu, caj caj) {
		this.a = bho;
		this.g = beu;
		this.h = caj;
	}

	@Override
	public void b() {
		this.i = this.b(new bfz(100, this.l / 2 - 155, this.m - 38, beu.a.FORCE_UNICODE_FONT, this.g.c(beu.a.FORCE_UNICODE_FONT)));
		this.r = this.b(new bfz(6, this.l / 2 - 155 + 160, this.m - 38, cah.a("gui.done")));
		this.f = new bhg.a(this.j);
		this.f.d(7, 8);
	}

	@Override
	public void k() {
		super.k();
		this.f.p();
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			switch (bfm.k) {
				case 5:
					break;
				case 6:
					this.j.a(this.a);
					break;
				case 100:
					if (bfm instanceof bfz) {
						this.g.a(((bfz)bfm).c(), 1);
						bfm.j = this.g.c(beu.a.FORCE_UNICODE_FONT);
						bfk bfk3 = new bfk(this.j);
						int integer4 = bfk3.a();
						int integer5 = bfk3.b();
						this.a(this.j, integer4, integer5);
					}
					break;
				default:
					this.f.a(bfm);
			}
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.f.a(integer1, integer2, float3);
		this.a(this.q, cah.a("options.language"), this.l / 2, 16, 16777215);
		this.a(this.q, "(" + cah.a("options.languageWarning") + ")", this.l / 2, this.m - 56, 8421504);
		super.a(integer1, integer2, float3);
	}

	class a extends bgd {
		private final List<String> v = Lists.newArrayList();
		private final Map<String, cai> w = Maps.newHashMap();

		public a(bes bes) {
			super(bes, bhg.this.l, bhg.this.m, 32, bhg.this.m - 65 + 4, 18);

			for (cai cai5 : bhg.this.h.d()) {
				this.w.put(cai5.a(), cai5);
				this.v.add(cai5.a());
			}
		}

		@Override
		protected int b() {
			return this.v.size();
		}

		@Override
		protected void a(int integer1, boolean boolean2, int integer3, int integer4) {
			cai cai6 = (cai)this.w.get(this.v.get(integer1));
			bhg.this.h.a(cai6);
			bhg.this.g.aE = cai6.a();
			this.a.f();
			bhg.this.q.a(bhg.this.h.a() || bhg.this.g.aF);
			bhg.this.q.b(bhg.this.h.b());
			bhg.this.r.j = cah.a("gui.done");
			bhg.this.i.j = bhg.this.g.c(beu.a.FORCE_UNICODE_FONT);
			bhg.this.g.b();
		}

		@Override
		protected boolean a(int integer) {
			return ((String)this.v.get(integer)).equals(bhg.this.h.c().a());
		}

		@Override
		protected int k() {
			return this.b() * 18;
		}

		@Override
		protected void a() {
			bhg.this.c();
		}

		@Override
		protected void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
			bhg.this.q.b(true);
			bhg.this.a(bhg.this.q, ((cai)this.w.get(this.v.get(integer1))).toString(), this.b / 2, integer3 + 1, 16777215);
			bhg.this.q.b(bhg.this.h.c().b());
		}
	}
}
