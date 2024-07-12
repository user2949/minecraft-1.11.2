import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ae extends j {
	@Override
	public String c() {
		return "execute";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.execute.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 5) {
			throw new ck("commands.execute.usage");
		} else {
			final sn sn5 = a(minecraftServer, n, arr[0], sn.class);
			final double double6 = b(sn5.p, arr[1], false);
			final double double8 = b(sn5.q, arr[2], false);
			final double double10 = b(sn5.r, arr[3], false);
			final co co12 = new co(double6, double8, double10);
			int integer13 = 4;
			if ("detect".equals(arr[4]) && arr.length > 10) {
				ajs ajs14 = sn5.e();
				double double15 = b(double6, arr[5], false);
				double double17 = b(double8, arr[6], false);
				double double19 = b(double10, arr[7], false);
				alu alu21 = b(n, arr[8]);
				co co22 = new co(double15, double17, double19);
				if (!ajs14.e(co22)) {
					throw new cd("commands.execute.failed", "detect", sn5.h_());
				}

				atl atl23 = ajs14.o(co22);
				if (atl23.v() != alu21) {
					throw new cd("commands.execute.failed", "detect", sn5.h_());
				}

				if (!j.b(alu21, arr[9]).apply(atl23)) {
					throw new cd("commands.execute.failed", "detect", sn5.h_());
				}

				integer13 = 10;
			}

			String string14 = a(arr, integer13);
			n n15 = new n() {
				@Override
				public String h_() {
					return sn5.h_();
				}

				@Override
				public fb i_() {
					return sn5.i_();
				}

				@Override
				public void a(fb fb) {
					n.a(fb);
				}

				@Override
				public boolean a(int integer, String string) {
					return n.a(integer, string);
				}

				@Override
				public co c() {
					return co12;
				}

				@Override
				public bdw d() {
					return new bdw(double6, double8, double10);
				}

				@Override
				public ajs e() {
					return sn5.l;
				}

				@Override
				public sn f() {
					return sn5;
				}

				@Override
				public boolean g() {
					return minecraftServer == null || minecraftServer.d[0].U().b("commandBlockOutput");
				}

				@Override
				public void a(o.a a, int integer) {
					sn5.a(a, integer);
				}

				@Override
				public MinecraftServer B_() {
					return sn5.B_();
				}
			};
			m m16 = minecraftServer.N();

			try {
				int integer17 = m16.a(n15, string14);
				if (integer17 < 1) {
					throw new cd("commands.execute.allInvocationsFailed", string14);
				}
			} catch (Throwable var23) {
				throw new cd("commands.execute.failed", string14, sn5.h_());
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, minecraftServer.J());
		} else if (arr.length > 1 && arr.length <= 4) {
			return a(arr, 1, co);
		} else if (arr.length > 5 && arr.length <= 8 && "detect".equals(arr[4])) {
			return a(arr, 5, co);
		} else {
			return arr.length == 9 && "detect".equals(arr[4]) ? a(arr, alu.h.c()) : Collections.emptyList();
		}
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 0;
	}
}
