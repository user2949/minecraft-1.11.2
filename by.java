import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class by extends j {
	@Override
	public String c() {
		return "trigger";
	}

	@Override
	public int a() {
		return 0;
	}

	@Override
	public String b(n n) {
		return "commands.trigger.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 3) {
			throw new ck("commands.trigger.usage");
		} else {
			ly ly5;
			if (n instanceof ly) {
				ly5 = (ly)n;
			} else {
				sn sn6 = n.f();
				if (!(sn6 instanceof ly)) {
					throw new cd("commands.trigger.invalidPlayer");
				}

				ly5 = (ly)sn6;
			}

			bec bec6 = minecraftServer.a(0).ad();
			bdy bdy7 = bec6.b(arr[0]);
			if (bdy7 != null && bdy7.c() == bei.c) {
				int integer8 = a(arr[2]);
				if (!bec6.b(ly5.h_(), bdy7)) {
					throw new cd("commands.trigger.invalidObjective", arr[0]);
				} else {
					bea bea9 = bec6.c(ly5.h_(), bdy7);
					if (bea9.g()) {
						throw new cd("commands.trigger.disabled", arr[0]);
					} else {
						if ("set".equals(arr[1])) {
							bea9.c(integer8);
						} else {
							if (!"add".equals(arr[1])) {
								throw new cd("commands.trigger.invalidMode", arr[1]);
							}

							bea9.a(integer8);
						}

						bea9.a(true);
						if (ly5.c.d()) {
							a(n, this, "commands.trigger.success", new Object[]{arr[0], arr[1], arr[2]});
						}
					}
				}
			} else {
				throw new cd("commands.trigger.invalidObjective", arr[0]);
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			bec bec6 = minecraftServer.a(0).ad();
			List<String> list7 = Lists.newArrayList();

			for (bdy bdy9 : bec6.c()) {
				if (bdy9.c() == bei.c) {
					list7.add(bdy9.b());
				}
			}

			return a(arr, (String[])list7.toArray(new String[list7.size()]));
		} else {
			return arr.length == 2 ? a(arr, new String[]{"add", "set"}) : Collections.emptyList();
		}
	}
}
