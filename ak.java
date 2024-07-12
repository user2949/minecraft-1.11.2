import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ak extends j {
	@Override
	public String c() {
		return "give";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.give.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 2) {
			throw new ck("commands.give.usage");
		} else {
			aay aay5 = a(minecraftServer, n, arr[0]);
			afh afh6 = a(n, arr[1]);
			int integer7 = arr.length >= 3 ? a(arr[2], 1, 64) : 1;
			int integer8 = arr.length >= 4 ? a(arr[3]) : 0;
			afj afj9 = new afj(afh6, integer7, integer8);
			if (arr.length >= 5) {
				String string10 = a(n, arr, 4).c();

				try {
					afj9.b(ek.a(string10));
				} catch (ej var11) {
					throw new cd("commands.give.tagError", var11.getMessage());
				}
			}

			boolean boolean10 = aay5.bs.c(afj9);
			if (boolean10) {
				aay5.l.a(null, aay5.p, aay5.q, aay5.r, nn.dk, no.PLAYERS, 0.2F, ((aay5.bJ().nextFloat() - aay5.bJ().nextFloat()) * 0.7F + 1.0F) * 2.0F);
				aay5.bt.b();
			}

			if (boolean10 && afj9.b()) {
				afj9.e(1);
				n.a(o.a.AFFECTED_ITEMS, integer7);
				zj zj11 = aay5.a(afj9, false);
				if (zj11 != null) {
					zj11.w();
				}
			} else {
				n.a(o.a.AFFECTED_ITEMS, integer7 - afj9.E());
				zj zj11 = aay5.a(afj9, false);
				if (zj11 != null) {
					zj11.r();
					zj11.d(aay5.h_());
				}
			}

			a(n, this, "commands.give.success", new Object[]{afj9.C(), integer7, aay5.h_()});
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, minecraftServer.J());
		} else {
			return arr.length == 2 ? a(arr, afh.g.c()) : Collections.emptyList();
		}
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 0;
	}
}
