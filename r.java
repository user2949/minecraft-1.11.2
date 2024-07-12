import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class r extends j {
	public static final Pattern a = Pattern.compile(
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"
	);

	@Override
	public String c() {
		return "ban-ip";
	}

	@Override
	public int a() {
		return 3;
	}

	@Override
	public boolean a(MinecraftServer minecraftServer, n n) {
		return minecraftServer.am().i().b() && super.a(minecraftServer, n);
	}

	@Override
	public String b(n n) {
		return "commands.banip.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length >= 1 && arr[0].length() > 1) {
			fb fb5 = arr.length >= 2 ? a(n, arr, 1) : null;
			Matcher matcher6 = a.matcher(arr[0]);
			if (matcher6.matches()) {
				this.a(minecraftServer, n, arr[0], fb5 == null ? null : fb5.c());
			} else {
				ly ly7 = minecraftServer.am().a(arr[0]);
				if (ly7 == null) {
					throw new ci("commands.banip.invalid");
				}

				this.a(minecraftServer, n, ly7.A(), fb5 == null ? null : fb5.c());
			}
		} else {
			throw new ck("commands.banip.usage");
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length == 1 ? a(arr, minecraftServer.J()) : Collections.emptyList();
	}

	protected void a(MinecraftServer minecraftServer, n n, String string3, @Nullable String string4) {
		mr mr6 = new mr(string3, null, n.h_(), null, string4);
		minecraftServer.am().i().a(mr6);
		List<ly> list7 = minecraftServer.am().b(string3);
		String[] arr8 = new String[list7.size()];
		int integer9 = 0;

		for (ly ly11 : list7) {
			ly11.a.c("You have been IP banned.");
			arr8[integer9++] = ly11.h_();
		}

		if (list7.isEmpty()) {
			a(n, this, "commands.banip.success", new Object[]{string3});
		} else {
			a(n, this, "commands.banip.success.players", new Object[]{string3, a(arr8)});
		}
	}
}
