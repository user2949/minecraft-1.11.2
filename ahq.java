import com.google.common.collect.Lists;
import java.util.List;

public class ahq implements aho {
	@Override
	public boolean a(acs acs, ajs ajs) {
		List<afj> list4 = Lists.newArrayList();

		for (int integer5 = 0; integer5 < acs.v_(); integer5++) {
			afj afj6 = acs.a(integer5);
			if (!afj6.b()) {
				list4.add(afj6);
				if (list4.size() > 1) {
					afj afj7 = (afj)list4.get(0);
					if (afj6.c() != afj7.c() || afj7.E() != 1 || afj6.E() != 1 || !afj7.c().n()) {
						return false;
					}
				}
			}
		}

		return list4.size() == 2;
	}

	@Override
	public afj a(acs acs) {
		List<afj> list3 = Lists.newArrayList();

		for (int integer4 = 0; integer4 < acs.v_(); integer4++) {
			afj afj5 = acs.a(integer4);
			if (!afj5.b()) {
				list3.add(afj5);
				if (list3.size() > 1) {
					afj afj6 = (afj)list3.get(0);
					if (afj5.c() != afj6.c() || afj6.E() != 1 || afj5.E() != 1 || !afj6.c().n()) {
						return afj.a;
					}
				}
			}
		}

		if (list3.size() == 2) {
			afj afj4 = (afj)list3.get(0);
			afj afj5 = (afj)list3.get(1);
			if (afj4.c() == afj5.c() && afj4.E() == 1 && afj5.E() == 1 && afj4.c().n()) {
				afh afh6 = afj4.c();
				int integer7 = afh6.m() - afj4.i();
				int integer8 = afh6.m() - afj5.i();
				int integer9 = integer7 + integer8 + afh6.m() * 5 / 100;
				int integer10 = afh6.m() - integer9;
				if (integer10 < 0) {
					integer10 = 0;
				}

				return new afj(afj4.c(), 1, integer10);
			}
		}

		return afj.a;
	}

	@Override
	public int a() {
		return 4;
	}

	@Override
	public afj b() {
		return afj.a;
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
}
