import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class bx extends j {
	@Override
	public String c() {
		return "tp";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.tp.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 1) {
			throw new ck("commands.tp.usage");
		} else {
			int integer5 = 0;
			sn sn6;
			if (arr.length != 2 && arr.length != 4 && arr.length != 6) {
				sn6 = a(n);
			} else {
				sn6 = b(minecraftServer, n, arr[0]);
				integer5 = 1;
			}

			if (arr.length == 1 || arr.length == 2) {
				sn sn7 = b(minecraftServer, n, arr[arr.length - 1]);
				if (sn7.l != sn6.l) {
					throw new cd("commands.tp.notSameDimension");
				} else {
					sn6.p();
					if (sn6 instanceof ly) {
						((ly)sn6).a.a(sn7.p, sn7.q, sn7.r, sn7.v, sn7.w);
					} else {
						sn6.b(sn7.p, sn7.q, sn7.r, sn7.v, sn7.w);
					}

					a(n, this, "commands.tp.success", new Object[]{sn6.h_(), sn7.h_()});
				}
			} else if (arr.length < integer5 + 3) {
				throw new ck("commands.tp.usage");
			} else if (sn6.l != null) {
				int integer8 = 4096;
				int integer7 = integer5 + 1;
				j.a a9 = a(sn6.p, arr[integer5], true);
				j.a a10 = a(sn6.q, arr[integer7++], -4096, 4096, false);
				j.a a11 = a(sn6.r, arr[integer7++], true);
				j.a a12 = a((double)sn6.v, arr.length > integer7 ? arr[integer7++] : "~", false);
				j.a a13 = a((double)sn6.w, arr.length > integer7 ? arr[integer7] : "~", false);
				a(sn6, a9, a10, a11, a12, a13);
				a(n, this, "commands.tp.success.coordinates", new Object[]{sn6.h_(), a9.a(), a10.a(), a11.a()});
			}
		}
	}

	private static void a(sn sn, j.a a2, j.a a3, j.a a4, j.a a5, j.a a6) {
		if (sn instanceof ly) {
			Set<hh.a> set7 = EnumSet.noneOf(hh.a.class);
			if (a2.c()) {
				set7.add(hh.a.X);
			}

			if (a3.c()) {
				set7.add(hh.a.Y);
			}

			if (a4.c()) {
				set7.add(hh.a.Z);
			}

			if (a6.c()) {
				set7.add(hh.a.X_ROT);
			}

			if (a5.c()) {
				set7.add(hh.a.Y_ROT);
			}

			float float8 = (float)a5.b();
			if (!a5.c()) {
				float8 = ot.g(float8);
			}

			float float9 = (float)a6.b();
			if (!a6.c()) {
				float9 = ot.g(float9);
			}

			sn.p();
			((ly)sn).a.a(a2.b(), a3.b(), a4.b(), float8, float9, set7);
			sn.h(float8);
		} else {
			float float7 = (float)ot.g(a5.a());
			float float8x = (float)ot.g(a6.a());
			float8x = ot.a(float8x, -90.0F, 90.0F);
			sn.b(a2.a(), a3.a(), a4.a(), float7, float8x);
			sn.h(float7);
		}

		if (!(sn instanceof sw) || !((sw)sn).cH()) {
			sn.t = 0.0;
			sn.z = true;
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length != 1 && arr.length != 2 ? Collections.emptyList() : a(arr, minecraftServer.J());
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 0;
	}
}
