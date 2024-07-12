public class po implements pd {
	@Override
	public int a() {
		return 147;
	}

	@Override
	public du a(du du) {
		if ("ArmorStand".equals(du.l("id")) && du.p("Silent") && !du.p("Marker")) {
			du.q("Silent");
		}

		return du;
	}
}
