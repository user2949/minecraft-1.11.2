public class aif extends aii {
	private static final String[] e = new String[]{"all", "undead", "arthropods"};
	private static final int[] f = new int[]{1, 5, 5};
	private static final int[] g = new int[]{11, 8, 8};
	private static final int[] h = new int[]{20, 20, 20};
	public final int a;

	public aif(aii.a a, int integer, ss... arr) {
		super(a, aij.WEAPON, arr);
		this.a = integer;
	}

	@Override
	public int a(int integer) {
		return f[this.a] + (integer - 1) * g[this.a];
	}

	@Override
	public int b(int integer) {
		return this.a(integer) + h[this.a];
	}

	@Override
	public int b() {
		return 5;
	}

	@Override
	public float a(int integer, tb tb) {
		if (this.a == 0) {
			return 1.0F + (float)Math.max(0, integer - 1) * 0.5F;
		} else if (this.a == 1 && tb == tb.UNDEAD) {
			return (float)integer * 2.5F;
		} else {
			return this.a == 2 && tb == tb.ARTHROPOD ? (float)integer * 2.5F : 0.0F;
		}
	}

	@Override
	public String a() {
		return "enchantment.damage." + e[this.a];
	}

	@Override
	public boolean a(aii aii) {
		return !(aii instanceof aif);
	}

	@Override
	public boolean a(afj afj) {
		return afj.c() instanceof ads ? true : super.a(afj);
	}

	@Override
	public void a(sw sw, sn sn, int integer) {
		if (sn instanceof sw) {
			sw sw5 = (sw)sn;
			if (this.a == 2 && sw5.cf() == tb.ARTHROPOD) {
				int integer6 = 20 + sw.bJ().nextInt(10 * integer);
				sw5.c(new sh(si.b, integer6, 3));
			}
		}
	}
}
