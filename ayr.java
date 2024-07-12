import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class ayr {
	protected List<ayq> a = Lists.newLinkedList();
	protected axz b;
	private int c;
	private int d;

	public ayr() {
	}

	public ayr(int integer1, int integer2) {
		this.c = integer1;
		this.d = integer2;
	}

	public axz b() {
		return this.b;
	}

	public List<ayq> c() {
		return this.a;
	}

	public void a(ajs ajs, Random random, axz axz) {
		Iterator<ayq> iterator5 = this.a.iterator();

		while (iterator5.hasNext()) {
			ayq ayq6 = (ayq)iterator5.next();
			if (ayq6.d().a(axz) && !ayq6.a(ajs, random, axz)) {
				iterator5.remove();
			}
		}
	}

	protected void d() {
		this.b = axz.a();

		for (ayq ayq3 : this.a) {
			this.b.b(ayq3.d());
		}
	}

	public du a(int integer1, int integer2) {
		du du4 = new du();
		du4.a("id", ayo.a(this));
		du4.a("ChunkX", integer1);
		du4.a("ChunkZ", integer2);
		du4.a("BB", this.b.g());
		ea ea5 = new ea();

		for (ayq ayq7 : this.a) {
			ea5.a(ayq7.c());
		}

		du4.a("Children", ea5);
		this.a(du4);
		return du4;
	}

	public void a(du du) {
	}

	public void a(ajs ajs, du du) {
		this.c = du.h("ChunkX");
		this.d = du.h("ChunkZ");
		if (du.e("BB")) {
			this.b = new axz(du.n("BB"));
		}

		ea ea4 = du.c("Children", 10);

		for (int integer5 = 0; integer5 < ea4.c(); integer5++) {
			this.a.add(ayo.b(ea4.b(integer5), ajs));
		}

		this.b(du);
	}

	public void b(du du) {
	}

	protected void a(ajs ajs, Random random, int integer) {
		int integer5 = ajs.K() - integer;
		int integer6 = this.b.d() + 1;
		if (integer6 < integer5) {
			integer6 += random.nextInt(integer5 - integer6);
		}

		int integer7 = integer6 - this.b.e;
		this.b.a(0, integer7, 0);

		for (ayq ayq9 : this.a) {
			ayq9.a(0, integer7, 0);
		}
	}

	protected void a(ajs ajs, Random random, int integer3, int integer4) {
		int integer6 = integer4 - integer3 + 1 - this.b.d();
		int integer7;
		if (integer6 > 1) {
			integer7 = integer3 + random.nextInt(integer6);
		} else {
			integer7 = integer3;
		}

		int integer8 = integer7 - this.b.b;
		this.b.a(0, integer8, 0);

		for (ayq ayq10 : this.a) {
			ayq10.a(0, integer8, 0);
		}
	}

	public boolean a() {
		return true;
	}

	public boolean a(ajl ajl) {
		return true;
	}

	public void b(ajl ajl) {
	}

	public int e() {
		return this.c;
	}

	public int f() {
		return this.d;
	}
}
