import com.google.common.collect.Lists;
import java.util.List;

public class pv implements pd {
	private static final List<String> a = Lists.newArrayList(
		new String[]{"MinecartRideable", "MinecartChest", "MinecartFurnace", "MinecartTNT", "MinecartSpawner", "MinecartHopper", "MinecartCommandBlock"}
	);

	@Override
	public int a() {
		return 106;
	}

	@Override
	public du a(du du) {
		if ("Minecart".equals(du.l("id"))) {
			String string3 = "MinecartRideable";
			int integer4 = du.h("Type");
			if (integer4 > 0 && integer4 < a.size()) {
				string3 = (String)a.get(integer4);
			}

			du.a("id", string3);
			du.q("Type");
		}

		return du;
	}
}
