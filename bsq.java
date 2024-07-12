public class bsq extends bsl<atf> {
	private final bra a = bes.z().ab();

	public void a(atf atf, double double2, double double3, double double4, float float5, int integer) {
		co co11 = atf.w();
		atl atl12 = atf.a();
		alu alu13 = atl12.v();
		if (atl12.a() != azs.a && !(atf.a(float5) >= 1.0F)) {
			bqs bqs14 = bqs.a();
			bpy bpy15 = bqs14.c();
			this.a(byy.g);
			beq.a();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA);
			bqg.m();
			bqg.r();
			if (bes.y()) {
				bqg.j(7425);
			} else {
				bqg.j(7424);
			}

			bpy15.a(7, bzh.a);
			bpy15.c(
				double2 - (double)co11.p() + (double)atf.b(float5), double3 - (double)co11.q() + (double)atf.c(float5), double4 - (double)co11.r() + (double)atf.d(float5)
			);
			ajs ajs16 = this.a();
			if (alu13 == alv.K && atf.a(float5) <= 0.25F) {
				atl12 = atl12.a(atd.b, true);
				this.a(co11, atl12, bpy15, ajs16, true);
			} else if (atf.h() && !atf.e()) {
				atd.a a17 = alu13 == alv.F ? atd.a.STICKY : atd.a.DEFAULT;
				atl atl18 = alv.K.t().a(atd.a, a17).a(atd.H, atl12.c(atc.H));
				atl18 = atl18.a(atd.b, atf.a(float5) >= 0.5F);
				this.a(co11, atl18, bpy15, ajs16, true);
				bpy15.c(double2 - (double)co11.p(), double3 - (double)co11.q(), double4 - (double)co11.r());
				atl12 = atl12.a(atc.a, true);
				this.a(co11, atl12, bpy15, ajs16, true);
			} else {
				this.a(co11, atl12, bpy15, ajs16, false);
			}

			bpy15.c(0.0, 0.0, 0.0);
			bqs14.b();
			beq.b();
		}
	}

	private boolean a(co co, atl atl, bpy bpy, ajs ajs, boolean boolean5) {
		return this.a.b().a(ajs, this.a.a(atl), atl, co, bpy, boolean5);
	}
}
