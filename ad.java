import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class ad extends j {
	@Override
	public String c() {
		return "entitydata";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.entitydata.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 2) {
			throw new ck("commands.entitydata.usage");
		} else {
			sn sn5 = b(minecraftServer, n, arr[0]);
			if (sn5 instanceof aay) {
				throw new cd("commands.entitydata.noPlayers", sn5.i_());
			} else {
				du du6 = a(sn5);
				du du7 = du6.g();

				du du8;
				try {
					du8 = ek.a(a(n, arr, 1).c());
				} catch (ej var9) {
					throw new cd("commands.entitydata.tagError", var9.getMessage());
				}

				UUID uUID9 = sn5.be();
				du6.a(du8);
				sn5.a(uUID9);
				if (du6.equals(du7)) {
					throw new cd("commands.entitydata.failed", du6.toString());
				} else {
					sn5.f(du6);
					a(n, this, "commands.entitydata.success", new Object[]{du6.toString()});
				}
			}
		}
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 0;
	}
}
