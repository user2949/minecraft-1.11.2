import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class bsy implements Comparable<bsy> {
	private final bte a;
	private final ReentrantLock b = new ReentrantLock();
	private final List<Runnable> c = Lists.newArrayList();
	private final bsy.b d;
	private final double e;
	private bqa f;
	private btb g;
	private bsy.a h = bsy.a.PENDING;
	private boolean i;

	public bsy(bte bte, bsy.b b, double double3) {
		this.a = bte;
		this.d = b;
		this.e = double3;
	}

	public bsy.a a() {
		return this.h;
	}

	public bte b() {
		return this.a;
	}

	public btb c() {
		return this.g;
	}

	public void a(btb btb) {
		this.g = btb;
	}

	public bqa d() {
		return this.f;
	}

	public void a(bqa bqa) {
		this.f = bqa;
	}

	public void a(bsy.a a) {
		this.b.lock();

		try {
			this.h = a;
		} finally {
			this.b.unlock();
		}
	}

	public void e() {
		this.b.lock();

		try {
			if (this.d == bsy.b.REBUILD_CHUNK && this.h != bsy.a.DONE) {
				this.a.a(false);
			}

			this.i = true;
			this.h = bsy.a.DONE;

			for (Runnable runnable3 : this.c) {
				runnable3.run();
			}
		} finally {
			this.b.unlock();
		}
	}

	public void a(Runnable runnable) {
		this.b.lock();

		try {
			this.c.add(runnable);
			if (this.i) {
				runnable.run();
			}
		} finally {
			this.b.unlock();
		}
	}

	public ReentrantLock f() {
		return this.b;
	}

	public bsy.b g() {
		return this.d;
	}

	public boolean h() {
		return this.i;
	}

	public int compareTo(bsy bsy) {
		return Doubles.compare(this.e, bsy.e);
	}

	public double i() {
		return this.e;
	}

	public static enum a {
		PENDING,
		COMPILING,
		UPLOADING,
		DONE;
	}

	public static enum b {
		REBUILD_CHUNK,
		RESORT_TRANSPARENCY;
	}
}
