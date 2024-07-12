import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class av extends j {
	@Override
	public String c() {
		return "playsound";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.playsound.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 2) {
			throw new ck(this.b(n));
		} else {
			int integer5 = 0;
			String string6 = arr[integer5++];
			String string7 = arr[integer5++];
			no no8 = no.a(string7);
			if (no8 == null) {
				throw new cd("commands.playsound.unknownSoundSource", string7);
			} else {
				ly ly9 = a(minecraftServer, n, arr[integer5++]);
				bdw bdw10 = n.d();
				double double11 = bdw10.b;
				if (arr.length > integer5) {
					double11 = b(double11, arr[integer5++], true);
				}

				double double13 = bdw10.c;
				if (arr.length > integer5) {
					double13 = b(double13, arr[integer5++], 0, 0, false);
				}

				double double15 = bdw10.d;
				if (arr.length > integer5) {
					double15 = b(double15, arr[integer5++], true);
				}

				double double17 = 1.0;
				if (arr.length > integer5) {
					double17 = a(arr[integer5++], 0.0, Float.MAX_VALUE);
				}

				double double19 = 1.0;
				if (arr.length > integer5) {
					double19 = a(arr[integer5++], 0.0, 2.0);
				}

				double double21 = 0.0;
				if (arr.length > integer5) {
					double21 = a(arr[integer5], 0.0, 1.0);
				}

				double double23 = double17 > 1.0 ? double17 * 16.0 : 16.0;
				double double25 = ly9.e(double11, double13, double15);
				if (double25 > double23) {
					if (double21 <= 0.0) {
						throw new cd("commands.playsound.playerTooFar", ly9.h_());
					}

					double double27 = double11 - ly9.p;
					double double29 = double13 - ly9.q;
					double double31 = double15 - ly9.r;
					double double33 = Math.sqrt(double27 * double27 + double29 * double29 + double31 * double31);
					if (double33 > 0.0) {
						double11 = ly9.p + double27 / double33 * 2.0;
						double13 = ly9.q + double29 / double33 * 2.0;
						double15 = ly9.r + double31 / double33 * 2.0;
					}

					double17 = double21;
				}

				ly9.a.a(new gp(string6, no8, double11, double13, double15, (float)double17, (float)double19));
				a(n, this, "commands.playsound.success", new Object[]{string6, ly9.h_()});
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, nm.a.c());
		} else if (arr.length == 2) {
			return a(arr, no.b());
		} else if (arr.length == 3) {
			return a(arr, minecraftServer.J());
		} else {
			return arr.length > 3 && arr.length <= 6 ? a(arr, 3, co) : Collections.emptyList();
		}
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 2;
	}
}
