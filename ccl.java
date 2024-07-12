import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ccl extends Thread {
	private static final AtomicInteger a = new AtomicInteger(0);
	private static final Logger b = LogManager.getLogger();
	private final String c;
	private final DatagramSocket d;
	private boolean e = true;
	private final String f;

	public ccl(String string1, String string2) throws IOException {
		super("LanServerPinger #" + a.incrementAndGet());
		this.c = string1;
		this.f = string2;
		this.setDaemon(true);
		this.d = new DatagramSocket();
	}

	public void run() {
		String string2 = a(this.c, this.f);
		byte[] arr3 = string2.getBytes();

		while (!this.isInterrupted() && this.e) {
			try {
				InetAddress inetAddress4 = InetAddress.getByName("224.0.2.60");
				DatagramPacket datagramPacket5 = new DatagramPacket(arr3, arr3.length, inetAddress4, 4445);
				this.d.send(datagramPacket5);
			} catch (IOException var6) {
				b.warn("LanServerPinger: {}", new Object[]{var6.getMessage()});
				break;
			}

			try {
				sleep(1500L);
			} catch (InterruptedException var5) {
			}
		}
	}

	public void interrupt() {
		super.interrupt();
		this.e = false;
	}

	public static String a(String string1, String string2) {
		return "[MOTD]" + string1 + "[/MOTD][AD]" + string2 + "[/AD]";
	}

	public static String a(String string) {
		int integer2 = string.indexOf("[MOTD]");
		if (integer2 < 0) {
			return "missing no";
		} else {
			int integer3 = string.indexOf("[/MOTD]", integer2 + "[MOTD]".length());
			return integer3 < integer2 ? "missing no" : string.substring(integer2 + "[MOTD]".length(), integer3);
		}
	}

	public static String b(String string) {
		int integer2 = string.indexOf("[/MOTD]");
		if (integer2 < 0) {
			return null;
		} else {
			int integer3 = string.indexOf("[/MOTD]", integer2 + "[/MOTD]".length());
			if (integer3 >= 0) {
				return null;
			} else {
				int integer4 = string.indexOf("[AD]", integer2 + "[/MOTD]".length());
				if (integer4 < 0) {
					return null;
				} else {
					int integer5 = string.indexOf("[/AD]", integer4 + "[AD]".length());
					return integer5 < integer4 ? null : string.substring(integer4 + "[AD]".length(), integer5);
				}
			}
		}
	}
}
