import java.util.List;

public class aes extends afh {
	@Override
	public boolean f_(afj afj) {
		return true;
	}

	@Override
	public boolean g_(afj afj) {
		return false;
	}

	@Override
	public afx g(afj afj) {
		return this.h(afj).b_() ? super.g(afj) : afx.UNCOMMON;
	}

	public ea h(afj afj) {
		du du3 = afj.p();
		return du3 != null && du3.b("StoredEnchantments", 9) ? (ea)du3.c("StoredEnchantments") : new ea();
	}

	@Override
	public void a(afj afj, aay aay, List<String> list, boolean boolean4) {
		super.a(afj, aay, list, boolean4);
		ea ea6 = this.h(afj);
		if (ea6 != null) {
			for (int integer7 = 0; integer7 < ea6.c(); integer7++) {
				int integer8 = ea6.b(integer7).g("id");
				int integer9 = ea6.b(integer7).g("lvl");
				if (aii.c(integer8) != null) {
					list.add(aii.c(integer8).d(integer9));
				}
			}
		}
	}

	public void a(afj afj, ail ail) {
		ea ea4 = this.h(afj);
		boolean boolean5 = true;

		for (int integer6 = 0; integer6 < ea4.c(); integer6++) {
			du du7 = ea4.b(integer6);
			if (aii.c(du7.g("id")) == ail.b) {
				if (du7.g("lvl") < ail.c) {
					du7.a("lvl", (short)ail.c);
				}

				boolean5 = false;
				break;
			}
		}

		if (boolean5) {
			du du6 = new du();
			du6.a("id", (short)aii.b(ail.b));
			du6.a("lvl", (short)ail.c);
			ea4.a(du6);
		}

		if (!afj.o()) {
			afj.b(new du());
		}

		afj.p().a("StoredEnchantments", ea4);
	}

	public afj a(ail ail) {
		afj afj3 = new afj(this);
		this.a(afj3, ail);
		return afj3;
	}

	public void a(aii aii, List<afj> list) {
		for (int integer4 = aii.f(); integer4 <= aii.b(); integer4++) {
			list.add(this.a(new ail(aii, integer4)));
		}
	}
}
