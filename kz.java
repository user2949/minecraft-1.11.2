import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class kz extends PrintStream {
	protected static final Logger a = LogManager.getLogger();
	protected final String b;

	public kz(String string, OutputStream outputStream) {
		super(outputStream);
		this.b = string;
	}

	public void println(String string) {
		this.a(string);
	}

	public void println(Object object) {
		this.a(String.valueOf(object));
	}

	protected void a(String string) {
		a.info("[{}]: {}", new Object[]{this.b, string});
	}
}
