import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class al extends j {
	private static final String[] a = new String[]{
		"Yolo",
		"/achievement take achievement.understandCommands @p",
		"Ask for help on twitter",
		"/deop @p",
		"Scoreboard deleted, commands blocked",
		"Contact helpdesk for help",
		"/testfornoob @p",
		"/trigger warning",
		"Oh my god, it's full of stats",
		"/kill @p[name=!Searge]",
		"Have you tried turning it off and on again?",
		"Sorry, no help today"
	};
	private final Random b = new Random();

	@Override
	public String c() {
		return "help";
	}

	@Override
	public int a() {
		return 0;
	}

	@Override
	public String b(n n) {
		return "commands.help.usage";
	}

	@Override
	public List<String> b() {
		return Arrays.asList("?");
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (n instanceof ajh) {
			n.a(new fh("Searge says: ").a(a[this.b.nextInt(a.length) % a.length]));
		} else {
			List<l> list5 = this.a(n, minecraftServer);
			int integer6 = 7;
			int integer7 = (list5.size() - 1) / 7;
			int integer8 = 0;

			try {
				integer8 = arr.length == 0 ? 0 : a(arr[0], 1, integer7 + 1) - 1;
			} catch (cg var13) {
				Map<String, l> map10 = this.a(minecraftServer);
				l l11 = (l)map10.get(arr[0]);
				if (l11 != null) {
					throw new ck(l11.b(n));
				}

				if (ot.a(arr[0], -1) == -1 && ot.a(arr[0], -2) == -2) {
					throw new cj();
				}

				throw var13;
			}

			int integer9 = Math.min((integer8 + 1) * 7, list5.size());
			fi fi10 = new fi("commands.help.header", integer8 + 1, integer7 + 1);
			fi10.b().a(a.DARK_GREEN);
			n.a(fi10);

			for (int integer11 = integer8 * 7; integer11 < integer9; integer11++) {
				l l12 = (l)list5.get(integer11);
				fi fi13 = new fi(l12.b(n));
				fi13.b().a(new fa(fa.a.SUGGEST_COMMAND, "/" + l12.c() + " "));
				n.a(fi13);
			}

			if (integer8 == 0) {
				fi fi11 = new fi("commands.help.footer");
				fi11.b().a(a.GREEN);
				n.a(fi11);
			}
		}
	}

	protected List<l> a(n n, MinecraftServer minecraftServer) {
		List<l> list4 = minecraftServer.N().a(n);
		Collections.sort(list4);
		return list4;
	}

	protected Map<String, l> a(MinecraftServer minecraftServer) {
		return minecraftServer.N().b();
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			Set<String> set6 = this.a(minecraftServer).keySet();
			return a(arr, (String[])set6.toArray(new String[set6.size()]));
		} else {
			return Collections.emptyList();
		}
	}
}
