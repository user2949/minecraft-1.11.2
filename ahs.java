import com.google.common.collect.Lists;
import java.util.List;

public class ahs implements aho {
	private final afj a;
	private final List<afj> b;

	public ahs(afj afj, List<afj> list) {
		this.a = afj;
		this.b = list;
	}

	@Override
	public afj b() {
		return this.a;
	}

	@Override
	public dd<afj> b(acs acs) {
		dd<afj> dd3 = dd.a(acs.v_(), afj.a);

		for (int integer4 = 0; integer4 < dd3.size(); integer4++) {
			afj afj5 = acs.a(integer4);
			if (afj5.c().s()) {
				dd3.set(integer4, new afj(afj5.c().r()));
			}
		}

		return dd3;
	}

	@Override
	public boolean a(acs acs, ajs ajs) {
		List<afj> list4 = Lists.newArrayList(this.b);

		for (int integer5 = 0; integer5 < acs.i(); integer5++) {
			for (int integer6 = 0; integer6 < acs.j(); integer6++) {
				afj afj7 = acs.c(integer6, integer5);
				if (!afj7.b()) {
					boolean boolean8 = false;

					for (afj afj10 : list4) {
						if (afj7.c() == afj10.c() && (afj10.j() == 32767 || afj7.j() == afj10.j())) {
							boolean8 = true;
							list4.remove(afj10);
							break;
						}
					}

					if (!boolean8) {
						return false;
					}
				}
			}
		}

		return list4.isEmpty();
	}

	@Override
	public afj a(acs acs) {
		return this.a.l();
	}

	@Override
	public int a() {
		return this.b.size();
	}
}
