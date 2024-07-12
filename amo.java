public class amo extends alu {
	protected amo() {
		super(azs.d);
		this.a(aej.c);
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (ajs.E) {
			return true;
		} else {
			aay.a(new amo.a(ajs, co));
			aay.b(oa.Z);
			return true;
		}
	}

	public static class a implements rj {
		private final ajs a;
		private final co b;

		public a(ajs ajs, co co) {
			this.a = ajs;
			this.b = co;
		}

		@Override
		public String h_() {
			return "crafting_table";
		}

		@Override
		public boolean n_() {
			return false;
		}

		@Override
		public fb i_() {
			return new fi(alv.ai.a() + ".name");
		}

		@Override
		public acl a(aax aax, aay aay) {
			return new act(aax, this.a, this.b);
		}

		@Override
		public String l() {
			return "minecraft:crafting_table";
		}
	}
}
