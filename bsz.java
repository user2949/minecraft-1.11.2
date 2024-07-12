import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.primitives.Doubles;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bsz {
	private static final Logger a = LogManager.getLogger();
	private static final ThreadFactory b = new ThreadFactoryBuilder().setNameFormat("Chunk Batcher %d").setDaemon(true).build();
	private final int c;
	private final List<Thread> d = Lists.newArrayList();
	private final List<bta> e = Lists.newArrayList();
	private final PriorityBlockingQueue<bsy> f = Queues.newPriorityBlockingQueue();
	private final BlockingQueue<bqa> g;
	private final bpz h = new bpz();
	private final bqu i = new bqu();
	private final Queue<bsz.a> j = Queues.newPriorityQueue();
	private final bta k;

	public bsz() {
		int integer2 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / 10485760);
		int integer3 = Math.max(1, ot.a(Runtime.getRuntime().availableProcessors(), 1, integer2 / 5));
		this.c = ot.a(integer3 * 10, 1, integer2);
		if (integer3 > 1) {
			for (int integer4 = 0; integer4 < integer3; integer4++) {
				bta bta5 = new bta(this);
				Thread thread6 = b.newThread(bta5);
				thread6.start();
				this.e.add(bta5);
				this.d.add(thread6);
			}
		}

		this.g = Queues.newArrayBlockingQueue(this.c);

		for (int integer4 = 0; integer4 < this.c; integer4++) {
			this.g.add(new bqa());
		}

		this.k = new bta(this, new bqa());
	}

	public String a() {
		return this.d.isEmpty()
			? String.format("pC: %03d, single-threaded", this.f.size())
			: String.format("pC: %03d, pU: %1d, aB: %1d", this.f.size(), this.j.size(), this.g.size());
	}

	public boolean a(long long1) {
		boolean boolean4 = false;

		boolean boolean5;
		do {
			boolean5 = false;
			if (this.d.isEmpty()) {
				bsy bsy6 = (bsy)this.f.poll();
				if (bsy6 != null) {
					try {
						this.k.a(bsy6);
						boolean5 = true;
					} catch (InterruptedException var8) {
						a.warn("Skipped task due to interrupt");
					}
				}
			}

			synchronized (this.j) {
				if (!this.j.isEmpty()) {
					((bsz.a)this.j.poll()).b.run();
					boolean5 = true;
					boolean4 = true;
				}
			}
		} while (long1 != 0L && boolean5 && long1 >= System.nanoTime());

		return boolean4;
	}

	public boolean a(bte bte) {
		bte.c().lock();

		boolean var4;
		try {
			final bsy bsy3 = bte.d();
			bsy3.a(new Runnable() {
				public void run() {
					bsz.this.f.remove(bsy3);
				}
			});
			boolean boolean4 = this.f.offer(bsy3);
			if (!boolean4) {
				bsy3.e();
			}

			var4 = boolean4;
		} finally {
			bte.c().unlock();
		}

		return var4;
	}

	public boolean b(bte bte) {
		bte.c().lock();

		boolean var3;
		try {
			bsy bsy3 = bte.d();

			try {
				this.k.a(bsy3);
			} catch (InterruptedException var7) {
			}

			var3 = true;
		} finally {
			bte.c().unlock();
		}

		return var3;
	}

	public void b() {
		this.e();
		List<bqa> list2 = Lists.newArrayList();

		while (list2.size() != this.c) {
			this.a(Long.MAX_VALUE);

			try {
				list2.add(this.c());
			} catch (InterruptedException var3) {
			}
		}

		this.g.addAll(list2);
	}

	public void a(bqa bqa) {
		this.g.add(bqa);
	}

	public bqa c() throws InterruptedException {
		return (bqa)this.g.take();
	}

	public bsy d() throws InterruptedException {
		return (bsy)this.f.take();
	}

	public boolean c(bte bte) {
		bte.c().lock();

		boolean var3;
		try {
			final bsy bsy3 = bte.e();
			if (bsy3 == null) {
				return true;
			}

			bsy3.a(new Runnable() {
				public void run() {
					bsz.this.f.remove(bsy3);
				}
			});
			var3 = this.f.offer(bsy3);
		} finally {
			bte.c().unlock();
		}

		return var3;
	}

	public ListenableFuture<Object> a(ajk ajk, bpy bpy, bte bte, btb btb, double double5) {
		if (bes.z().aF()) {
			if (cdb.f()) {
				this.a(bpy, bte.b(ajk.ordinal()));
			} else {
				this.a(bpy, ((btd)bte).a(ajk, btb), bte);
			}

			bpy.c(0.0, 0.0, 0.0);
			return Futures.immediateFuture(null);
		} else {
			ListenableFutureTask<Object> listenableFutureTask8 = ListenableFutureTask.create(new Runnable() {
				public void run() {
					bsz.this.a(ajk, bpy, bte, btb, double5);
				}
			}, null);
			synchronized (this.j) {
				this.j.add(new bsz.a(listenableFutureTask8, double5));
				return listenableFutureTask8;
			}
		}
	}

	private void a(bpy bpy, int integer, bte bte) {
		bqg.f(integer, 4864);
		bqg.G();
		bte.g();
		this.h.a(bpy);
		bqg.H();
		bqg.K();
	}

	private void a(bpy bpy, bzi bzi) {
		this.i.a(bzi);
		this.i.a(bpy);
	}

	public void e() {
		while (!this.f.isEmpty()) {
			bsy bsy2 = (bsy)this.f.poll();
			if (bsy2 != null) {
				bsy2.e();
			}
		}
	}

	public boolean f() {
		return this.f.isEmpty() && this.j.isEmpty();
	}

	public void g() {
		this.e();

		for (bta bta3 : this.e) {
			bta3.a();
		}

		for (Thread thread3 : this.d) {
			try {
				thread3.interrupt();
				thread3.join();
			} catch (InterruptedException var4) {
				a.warn("Interrupted whilst waiting for worker to die", var4);
			}
		}

		this.g.clear();
	}

	public boolean h() {
		return this.g.size() == 0;
	}

	class a implements Comparable<bsz.a> {
		private final ListenableFutureTask<Object> b;
		private final double c;

		public a(ListenableFutureTask<Object> listenableFutureTask, double double3) {
			this.b = listenableFutureTask;
			this.c = double3;
		}

		public int compareTo(bsz.a a) {
			return Doubles.compare(this.c, a.c);
		}
	}
}
