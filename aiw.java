import java.util.Random;

public class aiw extends aii {
	public aiw(aii.a a, ss... arr) {
		super(a, aij.ARMOR_CHEST, arr);
		this.c("thorns");
	}

	@Override
	public int a(int integer) {
		return 10 + 20 * (integer - 1);
	}

	@Override
	public int b(int integer) {
		return super.a(integer) + 50;
	}

	@Override
	public int b() {
		return 3;
	}

	@Override
	public boolean a(afj afj) {
		return afj.c() instanceof adp ? true : super.a(afj);
	}

	@Override
	public void b(sw sw, sn sn, int integer) {
		Random random5 = sw.bJ();
		afj afj6 = aik.b(aim.h, sw);
		if (a(integer, random5)) {
			if (sn != null) {
				sn.a(ry.a((sn)sw), (float)b(integer, random5));
			}

			if (!afj6.b()) {
				afj6.a(3, sw);
			}
		} else if (!afj6.b()) {
			afj6.a(1, sw);
		}
	}

	public static boolean a(int integer, Random random) {
		return integer <= 0 ? false : random.nextFloat() < 0.15F * (float)integer;
	}

	public static int b(int integer, Random random) {
		return integer > 10 ? integer - 10 : 1 + random.nextInt(4);
	}
}
