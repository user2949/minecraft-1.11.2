import com.google.common.collect.Lists;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class cck {
	private static final AtomicInteger a = new AtomicInteger(0);
	private static final Logger b = LogManager.getLogger();

	public static class a extends Thread {
		private final cck.b a;
		private final InetAddress b;
		private final MulticastSocket c;

		public a(cck.b b) throws IOException {
			super("LanServerDetector #" + cck.a.incrementAndGet());
			this.a = b;
			this.setDaemon(true);
			this.c = new MulticastSocket(4445);
			this.b = InetAddress.getByName("224.0.2.60");
			this.c.setSoTimeout(5000);
			this.c.joinGroup(this.b);
		}

		public void run() {
			byte[] arr3 = new byte[1024];

			while (!this.isInterrupted()) {
				DatagramPacket datagramPacket2 = new DatagramPacket(arr3, arr3.length);

				try {
					this.c.receive(datagramPacket2);
				} catch (SocketTimeoutException var5) {
					continue;
				} catch (IOException var6) {
					cck.b.error("Couldn't ping server", var6);
					break;
				}

				String string4 = new String(datagramPacket2.getData(), datagramPacket2.getOffset(), datagramPacket2.getLength());
				cck.b.debug("{}: {}", new Object[]{datagramPacket2.getAddress(), string4});
				this.a.a(string4, datagramPacket2.getAddress());
			}

			try {
				this.c.leaveGroup(this.b);
			} catch (IOException var4) {
			}

			this.c.close();
		}
	}

	public static class b {
		private final List<ccj> b = Lists.newArrayList();
		boolean a;

		public synchronized boolean a() {
			return this.a;
		}

		public synchronized void b() {
			this.a = false;
		}

		public synchronized List<ccj> c() {
			return Collections.unmodifiableList(this.b);
		}

		public synchronized void a(String string, InetAddress inetAddress) {
			String string4 = ccl.a(string);
			String string5 = ccl.b(string);
			if (string5 != null) {
				string5 = inetAddress.getHostAddress() + ":" + string5;
				boolean boolean6 = false;

				for (ccj ccj8 : this.b) {
					if (ccj8.b().equals(string5)) {
						ccj8.c();
						boolean6 = true;
						break;
					}
				}

				if (!boolean6) {
					this.b.add(new ccj(string4, string5));
					this.a = true;
				}
			}
		}
	}
}
