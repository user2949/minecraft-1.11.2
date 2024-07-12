import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;

public class bdp implements Runnable {
	private static final bdp a = new bdp();
	private final List<bdq> b = Collections.synchronizedList(Lists.newArrayList());
	private volatile long c;
	private volatile long d;
	private volatile boolean e;

	private bdp() {
		Thread thread2 = new Thread(this, "File IO Thread");
		thread2.setPriority(1);
		thread2.start();
	}

	public static bdp a() {
		return a;
	}

	public void run() {
		while (true) {
			this.c();
		}
	}

	private void c() {
		for (int integer2 = 0; integer2 < this.b.size(); integer2++) {
			bdq bdq3 = (bdq)this.b.get(integer2);
			boolean boolean4 = bdq3.c();
			if (!boolean4) {
				this.b.remove(integer2--);
				this.d++;
			}

			try {
				Thread.sleep(this.e ? 0L : 10L);
			} catch (InterruptedException var6) {
				var6.printStackTrace();
			}
		}

		if (this.b.isEmpty()) {
			try {
				Thread.sleep(25L);
			} catch (InterruptedException var5) {
				var5.printStackTrace();
			}
		}
	}

	public void a(bdq bdq) {
		if (!this.b.contains(bdq)) {
			this.c++;
			this.b.add(bdq);
		}
	}

	public void b() throws InterruptedException {
		this.e = true;

		while (this.c != this.d) {
			Thread.sleep(10L);
		}

		this.e = false;
	}
}
