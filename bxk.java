public class bxk extends bwz<bln> {
	public bxk(bvl<?> bvl) {
		super(bvl);
	}

	@Override
	protected void L_() {
		this.c = new bln(0.5F);
		this.d = new bln(1.0F);
	}

	protected void a(bln bln, ss ss) {
		this.a(bln);
		switch (ss) {
			case HEAD:
				bln.e.j = true;
				bln.f.j = true;
				break;
			case CHEST:
				bln.g.j = true;
				bln.h.j = true;
				bln.i.j = true;
				break;
			case LEGS:
				bln.g.j = true;
				bln.j.j = true;
				bln.k.j = true;
				break;
			case FEET:
				bln.j.j = true;
				bln.k.j = true;
		}
	}

	protected void a(bln bln) {
		bln.a(false);
	}
}
