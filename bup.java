import java.util.Random;

public class bup extends bvq<zr> {
	private static final kq a = new kq("textures/entity/enderman/enderman.png");
	private final Random j = new Random();

	public bup(bur bur) {
		super(bur, new blf(0.0F), 0.5F);
		this.a(new bxj(this));
		this.a(new bxc(this));
	}

	public blf b() {
		return (blf)super.b();
	}

	public void a(zr zr, double double2, double double3, double double4, float float5, float float6) {
		atl atl11 = zr.dj();
		blf blf12 = this.c();
		blf12.a = atl11 != null;
		blf12.b = zr.dk();
		if (zr.dk()) {
			double double13 = 0.02;
			double2 += this.j.nextGaussian() * 0.02;
			double4 += this.j.nextGaussian() * 0.02;
		}

		super.a(zr, double2, double3, double4, float5, float6);
	}

	protected kq a(zr zr) {
		return a;
	}
}
