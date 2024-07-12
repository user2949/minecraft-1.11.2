import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import javax.annotation.Nullable;
import org.apache.logging.log4j.Logger;

public class h {
	public static h.a a() {
		String string1 = System.getProperty("os.name").toLowerCase(Locale.ROOT);
		if (string1.contains("win")) {
			return h.a.WINDOWS;
		} else if (string1.contains("mac")) {
			return h.a.OSX;
		} else if (string1.contains("solaris")) {
			return h.a.SOLARIS;
		} else if (string1.contains("sunos")) {
			return h.a.SOLARIS;
		} else if (string1.contains("linux")) {
			return h.a.LINUX;
		} else {
			return string1.contains("unix") ? h.a.LINUX : h.a.UNKNOWN;
		}
	}

	@Nullable
	public static <V> V a(FutureTask<V> futureTask, Logger logger) {
		try {
			futureTask.run();
			return (V)futureTask.get();
		} catch (ExecutionException var3) {
			logger.fatal("Error executing task", var3);
		} catch (InterruptedException var4) {
			logger.fatal("Error executing task", var4);
		}

		return null;
	}

	public static <T> T a(List<T> list) {
		return (T)list.get(list.size() - 1);
	}

	public static enum a {
		LINUX,
		SOLARIS,
		WINDOWS,
		OSX,
		UNKNOWN;
	}
}
