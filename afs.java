public class afs extends adv {
	protected final alu b;
	protected final afs.a c;

	public afs(alu alu1, alu alu2, afs.a a) {
		super(alu1);
		this.b = alu2;
		this.c = a;
		this.e(0);
		this.a(true);
	}

	public afs(alu alu1, alu alu2, String[] arr) {
		this(alu1, alu2, new afs.a() {
			@Override
			public String a(afj afj) {
				int integer3 = afj.j();
				if (integer3 < 0 || integer3 >= arr.length) {
					integer3 = 0;
				}

				return arr[integer3];
			}
		});
	}

	@Override
	public int a(int integer) {
		return integer;
	}

	@Override
	public String a(afj afj) {
		return super.a() + "." + this.c.a(afj);
	}

	public interface a {
		String a(afj afj);
	}
}
