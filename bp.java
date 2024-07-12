import com.google.gson.JsonParseException;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class bp extends j {
	@Override
	public String c() {
		return "tellraw";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.tellraw.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 2) {
			throw new ck("commands.tellraw.usage");
		} else {
			aay aay5 = a(minecraftServer, n, arr[0]);
			String string6 = a(arr, 1);

			try {
				fb fb7 = fb.a.a(string6);
				aay5.a(fc.a(n, fb7, aay5));
			} catch (JsonParseException var7) {
				throw a(var7);
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length == 1 ? a(arr, minecraftServer.J()) : Collections.emptyList();
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 0;
	}
}
