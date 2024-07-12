public class ps implements pd {
	@Override
	public int a() {
		return 110;
	}

	@Override
	public du a(du du) {
		if ("EntityHorse".equals(du.l("id")) && !du.b("SaddleItem", 10) && du.p("Saddle")) {
			du du3 = new du();
			du3.a("id", "minecraft:saddle");
			du3.a("Count", (byte)1);
			du3.a("Damage", (short)0);
			du.a("SaddleItem", du3);
			du.q("Saddle");
		}

		return du;
	}
}
