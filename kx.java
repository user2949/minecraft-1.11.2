import java.io.OutputStream;

public class kx extends kz {
	public kx(String string, OutputStream outputStream) {
		super(string, outputStream);
	}

	@Override
	protected void a(String string) {
		StackTraceElement[] arr3 = Thread.currentThread().getStackTrace();
		StackTraceElement stackTraceElement4 = arr3[Math.min(3, arr3.length)];
		a.info("[{}]@.({}:{}): {}", new Object[]{this.b, stackTraceElement4.getFileName(), stackTraceElement4.getLineNumber(), string});
	}
}
