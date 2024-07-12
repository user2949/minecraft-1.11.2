import io.netty.buffer.Unpooled;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class bm extends j {
	@Override
	public String c() {
		return "stopsound";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.stopsound.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length >= 1 && arr.length <= 3) {
			int integer5 = 0;
			ly ly6 = a(minecraftServer, n, arr[integer5++]);
			String string7 = "";
			String string8 = "";
			if (arr.length >= 2) {
				String string9 = arr[integer5++];
				no no10 = no.a(string9);
				if (no10 == null) {
					throw new cd("commands.stopsound.unknownSoundSource", string9);
				}

				string7 = no10.a();
			}

			if (arr.length == 3) {
				string8 = arr[integer5++];
			}

			et et9 = new et(Unpooled.buffer());
			et9.a(string7);
			et9.a(string8);
			ly6.a.a(new go("MC|StopSound", et9));
			if (string7.isEmpty() && string8.isEmpty()) {
				a(n, this, "commands.stopsound.success.all", new Object[]{ly6.h_()});
			} else if (string8.isEmpty()) {
				a(n, this, "commands.stopsound.success.soundSource", new Object[]{string7, ly6.h_()});
			} else {
				a(n, this, "commands.stopsound.success.individualSound", new Object[]{string8, string7, ly6.h_()});
			}
		} else {
			throw new ck(this.b(n));
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, minecraftServer.J());
		} else if (arr.length == 2) {
			return a(arr, no.b());
		} else {
			return arr.length == 3 ? a(arr, nm.a.c()) : Collections.emptyList();
		}
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 0;
	}
}
