import com.google.gson.JsonParseException;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bv extends j {
	private static final Logger a = LogManager.getLogger();

	@Override
	public String c() {
		return "title";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.title.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 2) {
			throw new ck("commands.title.usage");
		} else {
			if (arr.length < 3) {
				if ("title".equals(arr[1]) || "subtitle".equals(arr[1]) || "actionbar".equals(arr[1])) {
					throw new ck("commands.title.usage.title");
				}

				if ("times".equals(arr[1])) {
					throw new ck("commands.title.usage.times");
				}
			}

			ly ly5 = a(minecraftServer, n, arr[0]);
			ie.a a6 = ie.a.a(arr[1]);
			if (a6 != ie.a.CLEAR && a6 != ie.a.RESET) {
				if (a6 == ie.a.TIMES) {
					if (arr.length != 5) {
						throw new ck("commands.title.usage");
					} else {
						int integer7 = a(arr[2]);
						int integer8 = a(arr[3]);
						int integer9 = a(arr[4]);
						ie ie10 = new ie(integer7, integer8, integer9);
						ly5.a.a(ie10);
						a(n, this, "commands.title.success", new Object[0]);
					}
				} else if (arr.length < 3) {
					throw new ck("commands.title.usage");
				} else {
					String string7 = a(arr, 2);

					fb fb8;
					try {
						fb8 = fb.a.a(string7);
					} catch (JsonParseException var10) {
						throw a(var10);
					}

					ie ie9 = new ie(a6, fc.a(n, fb8, ly5));
					ly5.a.a(ie9);
					a(n, this, "commands.title.success", new Object[0]);
				}
			} else if (arr.length != 2) {
				throw new ck("commands.title.usage");
			} else {
				ie ie7 = new ie(a6, null);
				ly5.a.a(ie7);
				a(n, this, "commands.title.success", new Object[0]);
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, minecraftServer.J());
		} else {
			return arr.length == 2 ? a(arr, ie.a.a()) : Collections.emptyList();
		}
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 0;
	}
}
