import java.util.Iterator;
import java.util.Random;

public class akm extends akf {
	public akm(akf.a a) {
		super(a);
		this.v.clear();
		this.r = alv.m.t();
		this.s = alv.m.t();
		this.t.z = -999;
		this.t.D = 2;
		this.t.F = 50;
		this.t.G = 10;
		this.v.clear();
		this.v.add(new akf.c(xe.class, 4, 2, 3));
		Iterator<akf.c> iterator3 = this.u.iterator();

		while (iterator3.hasNext()) {
			akf.c c4 = (akf.c)iterator3.next();
			if (c4.b == aao.class || c4.b == aap.class) {
				iterator3.remove();
			}
		}

		this.u.add(new akf.c(aao.class, 19, 4, 4));
		this.u.add(new akf.c(aap.class, 1, 1, 1));
		this.u.add(new akf.c(zy.class, 80, 4, 4));
	}

	@Override
	public void a(ajs ajs, Random random, co co) {
		super.a(ajs, random, co);
		if (random.nextInt(1000) == 0) {
			int integer5 = random.nextInt(16) + 8;
			int integer6 = random.nextInt(16) + 8;
			co co7 = ajs.l(co.a(integer5, 0, integer6)).a();
			new awi().b(ajs, random, co7);
		}

		if (random.nextInt(64) == 0) {
			new awp().b(ajs, random, co);
		}
	}
}
