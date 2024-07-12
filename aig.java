import java.util.Random;

public class aig extends aii {
	protected aig(aii.a a, ss... arr) {
		super(a, aij.BREAKABLE, arr);
		this.c("durability");
	}

	@Override
	public int a(int integer) {
		return 5 + (integer - 1) * 8;
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
		return afj.f() ? true : super.a(afj);
	}

	public static boolean a(afj afj, int integer, Random random) {
		return afj.c() instanceof adp && random.nextFloat() < 0.6F ? false : random.nextInt(integer + 1) > 0;
	}
}
