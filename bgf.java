import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public class bgf extends bfi implements ccr {
	private final bes a;
	private final List<bgf.a> f = Lists.newArrayList();
	private boolean g;

	public bgf(bes bes) {
		this.a = bes;
	}

	public void a(bfk bfk) {
		if (!this.g && this.a.u.P) {
			this.a.U().a(this);
			this.g = true;
		} else if (this.g && !this.a.u.P) {
			this.a.U().b(this);
			this.g = false;
		}

		if (this.g && !this.f.isEmpty()) {
			bqg.G();
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
			bdw bdw3 = new bdw(this.a.h.p, this.a.h.q + (double)this.a.h.bq(), this.a.h.r);
			bdw bdw4 = new bdw(0.0, 0.0, -1.0).a(-this.a.h.w * (float) (Math.PI / 180.0)).b(-this.a.h.v * (float) (Math.PI / 180.0));
			bdw bdw5 = new bdw(0.0, 1.0, 0.0).a(-this.a.h.w * (float) (Math.PI / 180.0)).b(-this.a.h.v * (float) (Math.PI / 180.0));
			bdw bdw6 = bdw4.c(bdw5);
			int integer7 = 0;
			int integer8 = 0;
			Iterator<bgf.a> iterator9 = this.f.iterator();

			while (iterator9.hasNext()) {
				bgf.a a10 = (bgf.a)iterator9.next();
				if (a10.b() + 3000L <= bes.I()) {
					iterator9.remove();
				} else {
					integer8 = Math.max(integer8, this.a.k.a(a10.a()));
				}
			}

			integer8 += this.a.k.a("<") + this.a.k.a(" ") + this.a.k.a(">") + this.a.k.a(" ");

			for (bgf.a a10 : this.f) {
				int integer11 = 255;
				String string12 = a10.a();
				bdw bdw13 = a10.c().d(bdw3).a();
				double double14 = -bdw6.b(bdw13);
				double double16 = -bdw4.b(bdw13);
				boolean boolean18 = double16 > 0.5;
				int integer19 = integer8 / 2;
				int integer20 = this.a.k.a;
				int integer21 = integer20 / 2;
				float float22 = 1.0F;
				int integer23 = this.a.k.a(string12);
				int integer24 = ot.c(ot.b(255.0, 75.0, (double)((float)(bes.I() - a10.b()) / 3000.0F)));
				int integer25 = integer24 << 16 | integer24 << 8 | integer24;
				bqg.G();
				bqg.c((float)bfk.a() - (float)integer19 * 1.0F - 2.0F, (float)(bfk.b() - 30) - (float)(integer7 * (integer20 + 1)) * 1.0F, 0.0F);
				bqg.b(1.0F, 1.0F, 1.0F);
				a(-integer19 - 1, -integer21 - 1, integer19 + 1, integer21 + 1, -872415232);
				bqg.m();
				if (!boolean18) {
					if (double14 > 0.0) {
						this.a.k.a(">", integer19 - this.a.k.a(">"), -integer21, integer25 + -16777216);
					} else if (double14 < 0.0) {
						this.a.k.a("<", -integer19, -integer21, integer25 + -16777216);
					}
				}

				this.a.k.a(string12, -integer23 / 2, -integer21, integer25 + -16777216);
				bqg.H();
				integer7++;
			}

			bqg.l();
			bqg.H();
		}
	}

	@Override
	public void a(ccc ccc, ccu ccu) {
		if (ccu.c() != null) {
			String string4 = ccu.c().d();
			if (!this.f.isEmpty()) {
				for (bgf.a a6 : this.f) {
					if (a6.a().equals(string4)) {
						a6.a(new bdw((double)ccc.h(), (double)ccc.i(), (double)ccc.j()));
						return;
					}
				}
			}

			this.f.add(new bgf.a(string4, new bdw((double)ccc.h(), (double)ccc.i(), (double)ccc.j())));
		}
	}

	public class a {
		private final String b;
		private long c;
		private bdw d;

		public a(String string, bdw bdw) {
			this.b = string;
			this.d = bdw;
			this.c = bes.I();
		}

		public String a() {
			return this.b;
		}

		public long b() {
			return this.c;
		}

		public bdw c() {
			return this.d;
		}

		public void a(bdw bdw) {
			this.d = bdw;
			this.c = bes.I();
		}
	}
}
