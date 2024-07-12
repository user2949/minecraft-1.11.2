import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class v extends j {
	@Override
	public String c() {
		return "clear";
	}

	@Override
	public String b(n n) {
		return "commands.clear.usage";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		ly ly5 = arr.length == 0 ? a(n) : a(minecraftServer, n, arr[0]);
		afh afh6 = arr.length >= 2 ? a(n, arr[1]) : null;
		int integer7 = arr.length >= 3 ? a(arr[2], -1) : -1;
		int integer8 = arr.length >= 4 ? a(arr[3], -1) : -1;
		du du9 = null;
		if (arr.length >= 5) {
			try {
				du9 = ek.a(a(arr, 4));
			} catch (ej var10) {
				throw new cd("commands.clear.tagError", var10.getMessage());
			}
		}

		if (arr.length >= 2 && afh6 == null) {
			throw new cd("commands.clear.failure", ly5.h_());
		} else {
			int integer10 = ly5.bs.a(afh6, integer7, integer8, du9);
			ly5.bt.b();
			if (!ly5.bK.d) {
				ly5.r();
			}

			n.a(o.a.AFFECTED_ITEMS, integer10);
			if (integer10 == 0) {
				throw new cd("commands.clear.failure", ly5.h_());
			} else {
				if (integer8 == 0) {
					n.a(new fi("commands.clear.testing", ly5.h_(), integer10));
				} else {
					a(n, this, "commands.clear.success", new Object[]{ly5.h_(), integer10});
				}
			}
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
