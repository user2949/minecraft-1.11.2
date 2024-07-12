import java.util.Iterator;
import java.util.Random;

public class aks extends akf {
	private final boolean y;
	private final aww z = new aww();
	private final awv A = new awv(4);

	public aks(boolean boolean1, akf.a a) {
		super(a);
		this.y = boolean1;
		if (boolean1) {
			this.r = alv.aJ.t();
		}

		this.v.clear();
		this.v.add(new akf.c(xe.class, 10, 2, 3));
		this.v.add(new akf.c(xd.class, 1, 1, 2));
		Iterator<akf.c> iterator4 = this.u.iterator();

		while (iterator4.hasNext()) {
			akf.c c5 = (akf.c)iterator4.next();
			if (c5.b == aag.class) {
				iterator4.remove();
			}
		}

		this.u.add(new akf.c(aag.class, 20, 4, 4));
		this.u.add(new akf.c(aaj.class, 80, 4, 4));
	}

	@Override
	public float f() {
		return 0.07F;
	}

	@Override
	public void a(ajs ajs, Random random, co co) {
		if (this.y) {
			for (int integer5 = 0; integer5 < 3; integer5++) {
				int integer6 = random.nextInt(16) + 8;
				int integer7 = random.nextInt(16) + 8;
				this.z.b(ajs, random, ajs.l(co.a(integer6, 0, integer7)));
			}

			for (int integer5 = 0; integer5 < 2; integer5++) {
				int integer6 = random.nextInt(16) + 8;
				int integer7 = random.nextInt(16) + 8;
				this.A.b(ajs, random, ajs.l(co.a(integer6, 0, integer7)));
			}
		}

		super.a(ajs, random, co);
	}

	@Override
	public avz a(Random random) {
		return new axn(false);
	}
}
