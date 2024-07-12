import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class bz extends j {
	@Override
	public String c() {
		return "weather";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.weather.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length >= 1 && arr.length <= 2) {
			int integer5 = (300 + new Random().nextInt(600)) * 20;
			if (arr.length >= 2) {
				integer5 = a(arr[1], 1, 1000000) * 20;
			}

			ajs ajs6 = minecraftServer.d[0];
			bbv bbv7 = ajs6.T();
			if ("clear".equalsIgnoreCase(arr[0])) {
				bbv7.i(integer5);
				bbv7.g(0);
				bbv7.f(0);
				bbv7.b(false);
				bbv7.a(false);
				a(n, this, "commands.weather.clear", new Object[0]);
			} else if ("rain".equalsIgnoreCase(arr[0])) {
				bbv7.i(0);
				bbv7.g(integer5);
				bbv7.f(integer5);
				bbv7.b(true);
				bbv7.a(false);
				a(n, this, "commands.weather.rain", new Object[0]);
			} else {
				if (!"thunder".equalsIgnoreCase(arr[0])) {
					throw new ck("commands.weather.usage");
				}

				bbv7.i(0);
				bbv7.g(integer5);
				bbv7.f(integer5);
				bbv7.b(true);
				bbv7.a(true);
				a(n, this, "commands.weather.thunder", new Object[0]);
			}
		} else {
			throw new ck("commands.weather.usage");
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length == 1 ? a(arr, new String[]{"clear", "rain", "thunder"}) : Collections.emptyList();
	}
}
