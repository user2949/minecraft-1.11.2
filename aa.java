import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class aa extends j {
	@Override
	public String c() {
		return "effect";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.effect.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 2) {
			throw new ck("commands.effect.usage");
		} else {
			sw sw5 = a(minecraftServer, n, arr[0], sw.class);
			if ("clear".equals(arr[1])) {
				if (sw5.bS().isEmpty()) {
					throw new cd("commands.effect.failure.notActive.all", sw5.h_());
				} else {
					sw5.bR();
					a(n, this, "commands.effect.success.removed.all", new Object[]{sw5.h_()});
				}
			} else {
				sg sg6;
				try {
					sg6 = sg.a(a(arr[1], 1));
				} catch (cg var11) {
					sg6 = sg.b(arr[1]);
				}

				if (sg6 == null) {
					throw new cg("commands.effect.notFound", arr[1]);
				} else {
					int integer7 = 600;
					int integer8 = 30;
					int integer9 = 0;
					if (arr.length >= 3) {
						integer8 = a(arr[2], 0, 1000000);
						if (sg6.b()) {
							integer7 = integer8;
						} else {
							integer7 = integer8 * 20;
						}
					} else if (sg6.b()) {
						integer7 = 1;
					}

					if (arr.length >= 4) {
						integer9 = a(arr[3], 0, 255);
					}

					boolean boolean10 = true;
					if (arr.length >= 5 && "true".equalsIgnoreCase(arr[4])) {
						boolean10 = false;
					}

					if (integer8 > 0) {
						sh sh11 = new sh(sg6, integer7, integer9, false, boolean10);
						sw5.c(sh11);
						a(n, this, "commands.effect.success", new Object[]{new fi(sh11.f()), sg.a(sg6), integer9, sw5.h_(), integer8});
					} else if (sw5.a(sg6)) {
						sw5.d(sg6);
						a(n, this, "commands.effect.success.removed", new Object[]{new fi(sg6.a()), sw5.h_()});
					} else {
						throw new cd("commands.effect.failure.notActive", new fi(sg6.a()), sw5.h_());
					}
				}
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, minecraftServer.J());
		} else if (arr.length == 2) {
			return a(arr, sg.b.c());
		} else {
			return arr.length == 5 ? a(arr, new String[]{"true", "false"}) : Collections.emptyList();
		}
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 0;
	}
}
