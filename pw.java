public class pw implements pd {
	@Override
	public int a() {
		return 111;
	}

	@Override
	public du a(du du) {
		String string3 = du.l("id");
		boolean boolean4 = "Painting".equals(string3);
		boolean boolean5 = "ItemFrame".equals(string3);
		if ((boolean4 || boolean5) && !du.b("Facing", 99)) {
			cv cv6;
			if (du.b("Direction", 99)) {
				cv6 = cv.b(du.f("Direction"));
				du.a("TileX", du.h("TileX") + cv6.g());
				du.a("TileY", du.h("TileY") + cv6.h());
				du.a("TileZ", du.h("TileZ") + cv6.i());
				du.q("Direction");
				if (boolean5 && du.b("ItemRotation", 99)) {
					du.a("ItemRotation", (byte)(du.f("ItemRotation") * 2));
				}
			} else {
				cv6 = cv.b(du.f("Dir"));
				du.q("Dir");
			}

			du.a("Facing", (byte)cv6.b());
		}

		return du;
	}
}
