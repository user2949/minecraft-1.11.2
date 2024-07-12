public class bwj<T extends sn> extends bus<T> {
	protected final afh a;
	private final bvh f;

	public bwj(bur bur, afh afh, bvh bvh) {
		super(bur);
		this.a = afh;
		this.f = bvh;
	}

	@Override
	public void a(T sn, double double2, double double3, double double4, float float5, float float6) {
		bqg.G();
		bqg.c((float)double2, (float)double3, (float)double4);
		bqg.D();
		bqg.b(-this.b.e, 0.0F, 1.0F, 0.0F);
		bqg.b((float)(this.b.g.as == 2 ? -1 : 1) * this.b.f, 1.0F, 0.0F, 0.0F);
		bqg.b(180.0F, 0.0F, 1.0F, 0.0F);
		this.a(byy.g);
		if (this.e) {
			bqg.h();
			bqg.e(this.c(sn));
		}

		this.f.a(this.e(sn), brq.b.GROUND);
		if (this.e) {
			bqg.n();
			bqg.i();
		}

		bqg.E();
		bqg.H();
		super.a(sn, double2, double3, double4, float5, float6);
	}

	public afj e(T sn) {
		return new afj(this.a);
	}

	@Override
	protected kq a(sn sn) {
		return byy.g;
	}
}
