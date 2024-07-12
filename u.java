import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class u extends j {
	@Override
	public String c() {
		return "blockdata";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.blockdata.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 4) {
			throw new ck("commands.blockdata.usage");
		} else {
			n.a(o.a.AFFECTED_BLOCKS, 0);
			co co5 = a(n, arr, 0, false);
			ajs ajs6 = n.e();
			if (!ajs6.e(co5)) {
				throw new cd("commands.blockdata.outOfWorld");
			} else {
				atl atl7 = ajs6.o(co5);
				asc asc8 = ajs6.r(co5);
				if (asc8 == null) {
					throw new cd("commands.blockdata.notValid");
				} else {
					du du9 = asc8.b(new du());
					du du10 = du9.g();

					du du11;
					try {
						du11 = ek.a(a(n, arr, 3).c());
					} catch (ej var12) {
						throw new cd("commands.blockdata.tagError", var12.getMessage());
					}

					du9.a(du11);
					du9.a("x", co5.p());
					du9.a("y", co5.q());
					du9.a("z", co5.r());
					if (du9.equals(du10)) {
						throw new cd("commands.blockdata.failed", du9.toString());
					} else {
						asc8.a(du9);
						asc8.x_();
						ajs6.a(co5, atl7, atl7, 3);
						n.a(o.a.AFFECTED_BLOCKS, 1);
						a(n, this, "commands.blockdata.success", new Object[]{du9.toString()});
					}
				}
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length > 0 && arr.length <= 3 ? a(arr, 0, co) : Collections.emptyList();
	}
}
