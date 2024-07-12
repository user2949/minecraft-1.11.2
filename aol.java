public class aol extends alo {
	public static final atx a = atx.a("has_record");

	public static void a(ph ph) {
		ph.a(pf.BLOCK_ENTITY, new qr(aol.a.class, "RecordItem"));
	}

	protected aol() {
		super(azs.d, azt.l);
		this.y(this.A.b().a(a, false));
		this.a(aej.c);
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if ((Boolean)atl.c(a)) {
			this.e(ajs, co, atl);
			atl = atl.a(a, false);
			ajs.a(co, atl, 2);
			return true;
		} else {
			return false;
		}
	}

	public void a(ajs ajs, co co, atl atl, afj afj) {
		if (!ajs.E) {
			asc asc6 = ajs.r(co);
			if (asc6 instanceof aol.a) {
				((aol.a)asc6).a(afj.l());
				ajs.a(co, atl.a(a, true), 2);
			}
		}
	}

	private void e(ajs ajs, co co, atl atl) {
		if (!ajs.E) {
			asc asc5 = ajs.r(co);
			if (asc5 instanceof aol.a) {
				aol.a a6 = (aol.a)asc5;
				afj afj7 = a6.a();
				if (!afj7.b()) {
					ajs.b(1010, co, 0);
					ajs.a(co, null);
					a6.a(afj.a);
					float float8 = 0.7F;
					double double9 = (double)(ajs.r.nextFloat() * 0.7F) + 0.15F;
					double double11 = (double)(ajs.r.nextFloat() * 0.7F) + 0.060000002F + 0.6;
					double double13 = (double)(ajs.r.nextFloat() * 0.7F) + 0.15F;
					afj afj15 = afj7.l();
					zj zj16 = new zj(ajs, (double)co.p() + double9, (double)co.q() + double11, (double)co.r() + double13, afj15);
					zj16.q();
					ajs.a(zj16);
				}
			}
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		this.e(ajs, co, atl);
		super.b(ajs, co, atl);
	}

	@Override
	public void a(ajs ajs, co co, atl atl, float float4, int integer) {
		if (!ajs.E) {
			super.a(ajs, co, atl, float4, 0);
		}
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new aol.a();
	}

	@Override
	public boolean x(atl atl) {
		return true;
	}

	@Override
	public int c(atl atl, ajs ajs, co co) {
		asc asc5 = ajs.r(co);
		if (asc5 instanceof aol.a) {
			afj afj6 = ((aol.a)asc5).a();
			if (!afj6.b()) {
				return afh.a(afj6.c()) + 1 - afh.a(afl.cB);
			}
		}

		return 0;
	}

	@Override
	public aqf a(atl atl) {
		return aqf.MODEL;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, integer > 0);
	}

	@Override
	public int e(atl atl) {
		return atl.c(a) ? 1 : 0;
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	public static class a extends asc {
		private afj a;

		public a() {
			this.a = afj.a;
		}

		@Override
		public void a(du du) {
			super.a(du);
			if (du.b("RecordItem", 10)) {
				this.a(new afj(du.o("RecordItem")));
			} else if (du.h("Record") > 0) {
				this.a(new afj(afh.c(du.h("Record"))));
			}
		}

		@Override
		public du b(du du) {
			super.b(du);
			if (!this.a().b()) {
				du.a("RecordItem", this.a().a(new du()));
			}

			return du;
		}

		public afj a() {
			return this.a;
		}

		public void a(afj afj) {
			this.a = afj;
			this.x_();
		}
	}
}
