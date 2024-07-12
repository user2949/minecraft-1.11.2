public abstract class bsl<T extends asc> {
	protected static final kq[] b = new kq[]{
		new kq("textures/blocks/destroy_stage_0.png"),
		new kq("textures/blocks/destroy_stage_1.png"),
		new kq("textures/blocks/destroy_stage_2.png"),
		new kq("textures/blocks/destroy_stage_3.png"),
		new kq("textures/blocks/destroy_stage_4.png"),
		new kq("textures/blocks/destroy_stage_5.png"),
		new kq("textures/blocks/destroy_stage_6.png"),
		new kq("textures/blocks/destroy_stage_7.png"),
		new kq("textures/blocks/destroy_stage_8.png"),
		new kq("textures/blocks/destroy_stage_9.png")
	};
	protected bsk c;

	public void a(T asc, double double2, double double3, double double4, float float5, int integer) {
		fb fb11 = asc.i_();
		if (fb11 != null && this.c.j != null && asc.w().equals(this.c.j.a())) {
			this.a(true);
			this.a(asc, fb11.d(), double2, double3, double4, 12);
			this.a(false);
		}
	}

	protected void a(boolean boolean1) {
		bqg.g(cdb.r);
		if (boolean1) {
			bqg.z();
		} else {
			bqg.y();
		}

		bqg.g(cdb.q);
	}

	protected void a(kq kq) {
		bza bza3 = this.c.e;
		if (bza3 != null) {
			bza3.a(kq);
		}
	}

	protected ajs a() {
		return this.c.f;
	}

	public void a(bsk bsk) {
		this.c = bsk;
	}

	public bfg b() {
		return this.c.a();
	}

	public boolean a(T asc) {
		return false;
	}

	protected void a(T asc, String string, double double3, double double4, double double5, int integer) {
		sn sn11 = this.c.g;
		double double12 = asc.a(sn11.p, sn11.q, sn11.r);
		if (!(double12 > (double)(integer * integer))) {
			float float14 = this.c.h;
			float float15 = this.c.i;
			boolean boolean16 = false;
			bqe.a(this.b(), string, (float)double3 + 0.5F, (float)double4 + 1.5F, (float)double5 + 0.5F, 0, float14, float15, false, false);
		}
	}
}
