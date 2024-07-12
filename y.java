import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class y extends j {
	private static final Logger a = LogManager.getLogger();
	private long b;
	private int c;

	@Override
	public String c() {
		return "debug";
	}

	@Override
	public int a() {
		return 3;
	}

	@Override
	public String b(n n) {
		return "commands.debug.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 1) {
			throw new ck("commands.debug.usage");
		} else {
			if ("start".equals(arr[0])) {
				if (arr.length != 1) {
					throw new ck("commands.debug.usage");
				}

				a(n, this, "commands.debug.start", new Object[0]);
				minecraftServer.ar();
				this.b = MinecraftServer.aw();
				this.c = minecraftServer.aq();
			} else {
				if (!"stop".equals(arr[0])) {
					throw new ck("commands.debug.usage");
				}

				if (arr.length != 1) {
					throw new ck("commands.debug.usage");
				}

				if (!minecraftServer.c.a) {
					throw new cd("commands.debug.notStarted");
				}

				long long5 = MinecraftServer.aw();
				int integer7 = minecraftServer.aq();
				long long8 = long5 - this.b;
				int integer10 = integer7 - this.c;
				this.a(long8, integer10, minecraftServer);
				minecraftServer.c.a = false;
				a(n, this, "commands.debug.stop", new Object[]{String.format("%.2f", (float)long8 / 1000.0F), integer10});
			}
		}
	}

	private void a(long long1, int integer, MinecraftServer minecraftServer) {
		File file6 = new File(minecraftServer.d("debug"), "profile-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt");
		file6.getParentFile().mkdirs();
		FileWriter fileWriter7 = null;

		try {
			fileWriter7 = new FileWriter(file6);
			fileWriter7.write(this.b(long1, integer, minecraftServer));
		} catch (Throwable var11) {
			a.error("Could not save profiler results to {}", new Object[]{file6, var11});
		} finally {
			IOUtils.closeQuietly(fileWriter7);
		}
	}

	private String b(long long1, int integer, MinecraftServer minecraftServer) {
		StringBuilder stringBuilder6 = new StringBuilder();
		stringBuilder6.append("---- Minecraft Profiler Results ----\n");
		stringBuilder6.append("// ");
		stringBuilder6.append(d());
		stringBuilder6.append("\n\n");
		stringBuilder6.append("Time span: ").append(long1).append(" ms\n");
		stringBuilder6.append("Tick span: ").append(integer).append(" ticks\n");
		stringBuilder6.append("// This is approximately ")
			.append(String.format("%.2f", (float)integer / ((float)long1 / 1000.0F)))
			.append(" ticks per second. It should be ")
			.append(20)
			.append(" ticks per second\n\n");
		stringBuilder6.append("--- BEGIN PROFILE DUMP ---\n\n");
		this.a(0, "root", stringBuilder6, minecraftServer);
		stringBuilder6.append("--- END PROFILE DUMP ---\n\n");
		return stringBuilder6.toString();
	}

	private void a(int integer, String string, StringBuilder stringBuilder, MinecraftServer minecraftServer) {
		List<ou.a> list6 = minecraftServer.c.b(string);
		if (list6 != null && list6.size() >= 3) {
			for (int integer7 = 1; integer7 < list6.size(); integer7++) {
				ou.a a8 = (ou.a)list6.get(integer7);
				stringBuilder.append(String.format("[%02d] ", integer));

				for (int integer9 = 0; integer9 < integer; integer9++) {
					stringBuilder.append("|   ");
				}

				stringBuilder.append(a8.c).append(" - ").append(String.format("%.2f", a8.a)).append("%/").append(String.format("%.2f", a8.b)).append("%\n");
				if (!"unspecified".equals(a8.c)) {
					try {
						this.a(integer + 1, string + "." + a8.c, stringBuilder, minecraftServer);
					} catch (Exception var9) {
						stringBuilder.append("[[ EXCEPTION ").append(var9).append(" ]]");
					}
				}
			}
		}
	}

	private static String d() {
		String[] arr1 = new String[]{
			"Shiny numbers!",
			"Am I not running fast enough? :(",
			"I'm working as hard as I can!",
			"Will I ever be good enough for you? :(",
			"Speedy. Zoooooom!",
			"Hello world",
			"40% better than a crash report.",
			"Now with extra numbers",
			"Now with less numbers",
			"Now with the same numbers",
			"You should add flames to things, it makes them go faster!",
			"Do you feel the need for... optimization?",
			"*cracks redstone whip*",
			"Maybe if you treated it better then it'll have more motivation to work faster! Poor server."
		};

		try {
			return arr1[(int)(System.nanoTime() % (long)arr1.length)];
		} catch (Throwable var2) {
			return "Witty comment unavailable :(";
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length == 1 ? a(arr, new String[]{"start", "stop"}) : Collections.emptyList();
	}
}
