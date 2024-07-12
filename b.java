import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class b {
	private static final Logger a = LogManager.getLogger();
	private final String b;
	private final Throwable c;
	private final c d = new c(this, "System Details");
	private final List<c> e = Lists.newArrayList();
	private File f;
	private boolean g = true;
	private StackTraceElement[] h = new StackTraceElement[0];

	public b(String string, Throwable throwable) {
		this.b = string;
		this.c = throwable;
		this.h();
	}

	private void h() {
		this.d.a("Minecraft Version", new d<String>() {
			public String call() {
				return "1.11.2";
			}
		});
		this.d.a("Operating System", new d<String>() {
			public String call() {
				return System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
			}
		});
		this.d.a("Java Version", new d<String>() {
			public String call() {
				return System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
			}
		});
		this.d.a("Java VM Version", new d<String>() {
			public String call() {
				return System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
			}
		});
		this.d.a("Memory", new d<String>() {
			public String call() {
				Runtime runtime2 = Runtime.getRuntime();
				long long3 = runtime2.maxMemory();
				long long5 = runtime2.totalMemory();
				long long7 = runtime2.freeMemory();
				long long9 = long3 / 1024L / 1024L;
				long long11 = long5 / 1024L / 1024L;
				long long13 = long7 / 1024L / 1024L;
				return long7 + " bytes (" + long13 + " MB) / " + long5 + " bytes (" + long11 + " MB) up to " + long3 + " bytes (" + long9 + " MB)";
			}
		});
		this.d.a("JVM Flags", new d<String>() {
			public String call() {
				RuntimeMXBean runtimeMXBean2 = ManagementFactory.getRuntimeMXBean();
				List<String> list3 = runtimeMXBean2.getInputArguments();
				int integer4 = 0;
				StringBuilder stringBuilder5 = new StringBuilder();

				for (String string7 : list3) {
					if (string7.startsWith("-X")) {
						if (integer4++ > 0) {
							stringBuilder5.append(" ");
						}

						stringBuilder5.append(string7);
					}
				}

				return String.format("%d total; %s", integer4, stringBuilder5.toString());
			}
		});
		this.d.a("IntCache", new d<String>() {
			public String call() throws Exception {
				return bah.b();
			}
		});
	}

	public String a() {
		return this.b;
	}

	public Throwable b() {
		return this.c;
	}

	public void a(StringBuilder stringBuilder) {
		if ((this.h == null || this.h.length <= 0) && !this.e.isEmpty()) {
			this.h = (StackTraceElement[])ArrayUtils.subarray(((c)this.e.get(0)).a(), 0, 1);
		}

		if (this.h != null && this.h.length > 0) {
			stringBuilder.append("-- Head --\n");
			stringBuilder.append("Thread: ").append(Thread.currentThread().getName()).append("\n");
			stringBuilder.append("Stacktrace:\n");

			for (StackTraceElement stackTraceElement6 : this.h) {
				stringBuilder.append("\t").append("at ").append(stackTraceElement6);
				stringBuilder.append("\n");
			}

			stringBuilder.append("\n");
		}

		for (c c4 : this.e) {
			c4.a(stringBuilder);
			stringBuilder.append("\n\n");
		}

		this.d.a(stringBuilder);
	}

	public String d() {
		StringWriter stringWriter2 = null;
		PrintWriter printWriter3 = null;
		Throwable throwable4 = this.c;
		if (throwable4.getMessage() == null) {
			if (throwable4 instanceof NullPointerException) {
				throwable4 = new NullPointerException(this.b);
			} else if (throwable4 instanceof StackOverflowError) {
				throwable4 = new StackOverflowError(this.b);
			} else if (throwable4 instanceof OutOfMemoryError) {
				throwable4 = new OutOfMemoryError(this.b);
			}

			throwable4.setStackTrace(this.c.getStackTrace());
		}

		String string5 = throwable4.toString();

		try {
			stringWriter2 = new StringWriter();
			printWriter3 = new PrintWriter(stringWriter2);
			throwable4.printStackTrace(printWriter3);
			string5 = stringWriter2.toString();
		} finally {
			IOUtils.closeQuietly(stringWriter2);
			IOUtils.closeQuietly(printWriter3);
		}

		return string5;
	}

	public String e() {
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append("---- Minecraft Crash Report ----\n");
		stringBuilder2.append("// ");
		stringBuilder2.append(i());
		stringBuilder2.append("\n\n");
		stringBuilder2.append("Time: ");
		stringBuilder2.append(new SimpleDateFormat().format(new Date()));
		stringBuilder2.append("\n");
		stringBuilder2.append("Description: ");
		stringBuilder2.append(this.b);
		stringBuilder2.append("\n\n");
		stringBuilder2.append(this.d());
		stringBuilder2.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");

		for (int integer3 = 0; integer3 < 87; integer3++) {
			stringBuilder2.append("-");
		}

		stringBuilder2.append("\n\n");
		this.a(stringBuilder2);
		return stringBuilder2.toString();
	}

	public File f() {
		return this.f;
	}

	public boolean a(File file) {
		if (this.f != null) {
			return false;
		} else {
			if (file.getParentFile() != null) {
				file.getParentFile().mkdirs();
			}

			FileWriter fileWriter3 = null;

			boolean var4;
			try {
				fileWriter3 = new FileWriter(file);
				fileWriter3.write(this.e());
				this.f = file;
				return true;
			} catch (Throwable var8) {
				a.error("Could not save crash report to {}", new Object[]{file, var8});
				var4 = false;
			} finally {
				IOUtils.closeQuietly(fileWriter3);
			}

			return var4;
		}
	}

	public c g() {
		return this.d;
	}

	public c a(String string) {
		return this.a(string, 1);
	}

	public c a(String string, int integer) {
		c c4 = new c(this, string);
		if (this.g) {
			int integer5 = c4.a(integer);
			StackTraceElement[] arr6 = this.c.getStackTrace();
			StackTraceElement stackTraceElement7 = null;
			StackTraceElement stackTraceElement8 = null;
			int integer9 = arr6.length - integer5;
			if (integer9 < 0) {
				System.out.println("Negative index in crash report handler (" + arr6.length + "/" + integer5 + ")");
			}

			if (arr6 != null && 0 <= integer9 && integer9 < arr6.length) {
				stackTraceElement7 = arr6[integer9];
				if (arr6.length + 1 - integer5 < arr6.length) {
					stackTraceElement8 = arr6[arr6.length + 1 - integer5];
				}
			}

			this.g = c4.a(stackTraceElement7, stackTraceElement8);
			if (integer5 > 0 && !this.e.isEmpty()) {
				c c10 = (c)this.e.get(this.e.size() - 1);
				c10.b(integer5);
			} else if (arr6 != null && arr6.length >= integer5 && 0 <= integer9 && integer9 < arr6.length) {
				this.h = new StackTraceElement[integer9];
				System.arraycopy(arr6, 0, this.h, 0, this.h.length);
			} else {
				this.g = false;
			}
		}

		this.e.add(c4);
		return c4;
	}

	private static String i() {
		String[] arr1 = new String[]{
			"Who set us up the TNT?",
			"Everything's going to plan. No, really, that was supposed to happen.",
			"Uh... Did I do that?",
			"Oops.",
			"Why did you do that?",
			"I feel sad now :(",
			"My bad.",
			"I'm sorry, Dave.",
			"I let you down. Sorry :(",
			"On the bright side, I bought you a teddy bear!",
			"Daisy, daisy...",
			"Oh - I know what I did wrong!",
			"Hey, that tickles! Hehehe!",
			"I blame Dinnerbone.",
			"You should try our sister game, Minceraft!",
			"Don't be sad. I'll do better next time, I promise!",
			"Don't be sad, have a hug! <3",
			"I just don't know what went wrong :(",
			"Shall we play a game?",
			"Quite honestly, I wouldn't worry myself about that.",
			"I bet Cylons wouldn't have this problem.",
			"Sorry :(",
			"Surprise! Haha. Well, this is awkward.",
			"Would you like a cupcake?",
			"Hi. I'm Minecraft, and I'm a crashaholic.",
			"Ooh. Shiny.",
			"This doesn't make any sense!",
			"Why is it breaking :(",
			"Don't do that.",
			"Ouch. That hurt :(",
			"You're mean.",
			"This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]",
			"There are four lights!",
			"But it works on my machine."
		};

		try {
			return arr1[(int)(System.nanoTime() % (long)arr1.length)];
		} catch (Throwable var2) {
			return "Witty comment unavailable :(";
		}
	}

	public static b a(Throwable throwable, String string) {
		b b3;
		if (throwable instanceof f) {
			b3 = ((f)throwable).a();
		} else {
			b3 = new b(string, throwable);
		}

		return b3;
	}
}
