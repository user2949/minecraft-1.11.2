import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class au extends j {
	@Override
	public String c() {
		return "particle";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.particle.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 8) {
			throw new ck("commands.particle.usage");
		} else {
			boolean boolean5 = false;
			de de6 = de.a(arr[0]);
			if (de6 == null) {
				throw new cd("commands.particle.notFound", arr[0]);
			} else {
				String string7 = arr[0];
				bdw bdw8 = n.d();
				double double9 = (double)((float)b(bdw8.b, arr[1], true));
				double double11 = (double)((float)b(bdw8.c, arr[2], true));
				double double13 = (double)((float)b(bdw8.d, arr[3], true));
				double double15 = (double)((float)c(arr[4]));
				double double17 = (double)((float)c(arr[5]));
				double double19 = (double)((float)c(arr[6]));
				double double21 = (double)((float)c(arr[7]));
				int integer23 = 0;
				if (arr.length > 8) {
					integer23 = a(arr[8], 0);
				}

				boolean boolean24 = false;
				if (arr.length > 9 && "force".equals(arr[9])) {
					boolean24 = true;
				}

				ly ly25;
				if (arr.length > 10) {
					ly25 = a(minecraftServer, n, arr[10]);
				} else {
					ly25 = null;
				}

				int[] arr26 = new int[de6.d()];

				for (int integer27 = 0; integer27 < arr26.length; integer27++) {
					if (arr.length > 11 + integer27) {
						try {
							arr26[integer27] = Integer.parseInt(arr[11 + integer27]);
						} catch (NumberFormatException var28) {
							throw new cd("commands.particle.invalidParam", arr[11 + integer27]);
						}
					}
				}

				ajs ajs27 = n.e();
				if (ajs27 instanceof lw) {
					lw lw28 = (lw)ajs27;
					if (ly25 == null) {
						lw28.a(de6, boolean24, double9, double11, double13, integer23, double15, double17, double19, double21, arr26);
					} else {
						lw28.a(ly25, de6, boolean24, double9, double11, double13, integer23, double15, double17, double19, double21, arr26);
					}

					a(n, this, "commands.particle.success", new Object[]{string7, Math.max(integer23, 1)});
				}
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, de.a());
		} else if (arr.length > 1 && arr.length <= 4) {
			return a(arr, 1, co);
		} else if (arr.length == 10) {
			return a(arr, new String[]{"normal", "force"});
		} else {
			return arr.length == 11 ? a(arr, minecraftServer.J()) : Collections.emptyList();
		}
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 10;
	}
}
