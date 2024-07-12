import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class bo extends j {
	@Override
	public String c() {
		return "teleport";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.teleport.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 4) {
			throw new ck("commands.teleport.usage");
		} else {
			sn sn5 = b(minecraftServer, n, arr[0]);
			if (sn5.l != null) {
				int integer6 = 4096;
				bdw bdw7 = n.d();
				int integer8 = 1;
				j.a a9 = a(bdw7.b, arr[integer8++], true);
				j.a a10 = a(bdw7.c, arr[integer8++], -4096, 4096, false);
				j.a a11 = a(bdw7.d, arr[integer8++], true);
				sn sn12 = n.f() == null ? sn5 : n.f();
				j.a a13 = a(arr.length > integer8 ? (double)sn12.v : (double)sn5.v, arr.length > integer8 ? arr[integer8] : "~", false);
				integer8++;
				j.a a14 = a(arr.length > integer8 ? (double)sn12.w : (double)sn5.w, arr.length > integer8 ? arr[integer8] : "~", false);
				a(sn5, a9, a10, a11, a13, a14);
				a(n, this, "commands.teleport.success.coordinates", new Object[]{sn5.h_(), a9.a(), a10.a(), a11.a()});
			}
		}
	}

	private static void a(sn sn, j.a a2, j.a a3, j.a a4, j.a a5, j.a a6) {
		if (sn instanceof ly) {
			Set<hh.a> set7 = EnumSet.noneOf(hh.a.class);
			float float8 = (float)a5.b();
			if (a5.c()) {
				set7.add(hh.a.Y_ROT);
			} else {
				float8 = ot.g(float8);
			}

			float float9 = (float)a6.b();
			if (a6.c()) {
				set7.add(hh.a.X_ROT);
			} else {
				float9 = ot.g(float9);
			}

			sn.p();
			((ly)sn).a.a(a2.a(), a3.a(), a4.a(), float8, float9, set7);
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
		if (arr.length == 1) {
			return a(arr, minecraftServer.J());
		} else {
			return arr.length > 1 && arr.length <= 4 ? a(arr, 1, co) : Collections.emptyList();
		}
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 0;
	}
}
