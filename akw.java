import java.util.Random;

public class akw extends akp {
	public akw(akf.a a) {
		super(akp.a.BIRCH, a);
	}

	@Override
	public avz a(Random random) {
		return random.nextBoolean() ? akp.y : akp.z;
	}
}
