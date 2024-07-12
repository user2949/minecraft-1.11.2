public class qa implements pd {
	@Override
	public int a() {
		return 701;
	}

	@Override
	public du a(du du) {
		String string3 = du.l("id");
		if ("Skeleton".equals(string3)) {
			int integer4 = du.h("SkeletonType");
			if (integer4 == 1) {
				du.a("id", "WitherSkeleton");
			} else if (integer4 == 2) {
				du.a("id", "Stray");
			}

			du.q("SkeletonType");
		}

		return du;
	}
}
