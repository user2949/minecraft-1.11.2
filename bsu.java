public class bsu extends bsl<asx> {
	public void a(asx asx, double double2, double double3, double double4, float float5, int integer) {
		if (bes.z().h.dk() || bes.z().h.y()) {
			super.a(asx, double2, double3, double4, float5, integer);
			co co11 = asx.e();
			co co12 = asx.f();
			if (co12.p() >= 1 && co12.q() >= 1 && co12.r() >= 1) {
				if (asx.k() == asx.a.SAVE || asx.k() == asx.a.LOAD) {
					double double13 = 0.01;
					double double15 = (double)co11.p();
					double double17 = (double)co11.r();
					double double25 = double3 + (double)co11.q() - 0.01;
					double double31 = double25 + (double)co12.q() + 0.02;
					double double19;
					double double21;
					switch (asx.h()) {
						case LEFT_RIGHT:
							double19 = (double)co12.p() + 0.02;
							double21 = -((double)co12.r() + 0.02);
							break;
						case FRONT_BACK:
							double19 = -((double)co12.p() + 0.02);
							double21 = (double)co12.r() + 0.02;
							break;
						default:
							double19 = (double)co12.p() + 0.02;
							double21 = (double)co12.r() + 0.02;
					}

					double double23;
					double double27;
					double double29;
					double double33;
					switch (asx.i()) {
						case CLOCKWISE_90:
							double23 = double2 + (double21 < 0.0 ? double15 - 0.01 : double15 + 1.0 + 0.01);
							double27 = double4 + (double19 < 0.0 ? double17 + 1.0 + 0.01 : double17 - 0.01);
							double29 = double23 - double21;
							double33 = double27 + double19;
							break;
						case CLOCKWISE_180:
							double23 = double2 + (double19 < 0.0 ? double15 - 0.01 : double15 + 1.0 + 0.01);
							double27 = double4 + (double21 < 0.0 ? double17 - 0.01 : double17 + 1.0 + 0.01);
							double29 = double23 - double19;
							double33 = double27 - double21;
							break;
						case COUNTERCLOCKWISE_90:
							double23 = double2 + (double21 < 0.0 ? double15 + 1.0 + 0.01 : double15 - 0.01);
							double27 = double4 + (double19 < 0.0 ? double17 - 0.01 : double17 + 1.0 + 0.01);
							double29 = double23 + double21;
							double33 = double27 - double19;
							break;
						default:
							double23 = double2 + (double19 < 0.0 ? double15 + 1.0 + 0.01 : double15 - 0.01);
							double27 = double4 + (double21 < 0.0 ? double17 + 1.0 + 0.01 : double17 - 0.01);
							double29 = double23 + double19;
							double33 = double27 + double21;
					}

					int integer35 = 255;
					int integer36 = 223;
					int integer37 = 127;
					bqs bqs38 = bqs.a();
					bpy bpy39 = bqs38.c();
					bqg.p();
					bqg.g();
					bqg.z();
					bqg.m();
					bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
					this.a(true);
					if (asx.k() == asx.a.SAVE || asx.I()) {
						this.a(bqs38, bpy39, double23, double25, double27, double29, double31, double33, 255, 223, 127);
					}

					if (asx.k() == asx.a.SAVE && asx.G()) {
						this.a(asx, double2, double3, double4, co11, bqs38, bpy39, true);
						this.a(asx, double2, double3, double4, co11, bqs38, bpy39, false);
					}

					this.a(false);
					bqg.d(1.0F);
					bqg.f();
					bqg.y();
					bqg.k();
					bqg.a(true);
					bqg.o();
				}
			}
		}
	}

	private void a(asx asx, double double2, double double3, double double4, co co, bqs bqs, bpy bpy, boolean boolean8) {
		bqg.d(boolean8 ? 3.0F : 1.0F);
		bpy.a(3, bzh.f);
		ajs ajs13 = asx.D();
		co co14 = asx.w();
		co co15 = co14.a(co);

		for (co co17 : co.a(co15, co15.a(asx.f()).a(-1, -1, -1))) {
			atl atl18 = ajs13.o(co17);
			boolean boolean19 = atl18 == alv.a.t();
			boolean boolean20 = atl18 == alv.dj.t();
			if (boolean19 || boolean20) {
				float float21 = boolean19 ? 0.05F : 0.0F;
				double double22 = (double)((float)(co17.p() - co14.p()) + 0.45F) + double2 - (double)float21;
				double double24 = (double)((float)(co17.q() - co14.q()) + 0.45F) + double3 - (double)float21;
				double double26 = (double)((float)(co17.r() - co14.r()) + 0.45F) + double4 - (double)float21;
				double double28 = (double)((float)(co17.p() - co14.p()) + 0.55F) + double2 + (double)float21;
				double double30 = (double)((float)(co17.q() - co14.q()) + 0.55F) + double3 + (double)float21;
				double double32 = (double)((float)(co17.r() - co14.r()) + 0.55F) + double4 + (double)float21;
				if (boolean8) {
					bqm.a(bpy, double22, double24, double26, double28, double30, double32, 0.0F, 0.0F, 0.0F, 1.0F);
				} else if (boolean19) {
					bqm.a(bpy, double22, double24, double26, double28, double30, double32, 0.5F, 0.5F, 1.0F, 1.0F);
				} else {
					bqm.a(bpy, double22, double24, double26, double28, double30, double32, 1.0F, 0.25F, 0.25F, 1.0F);
				}
			}
		}

		bqs.b();
	}

	private void a(
		bqs bqs, bpy bpy, double double3, double double4, double double5, double double6, double double7, double double8, int integer9, int integer10, int integer11
	) {
		bqg.d(2.0F);
		bpy.a(3, bzh.f);
		bpy.b(double3, double4, double5).a((float)integer10, (float)integer10, (float)integer10, 0.0F).d();
		bpy.b(double3, double4, double5).b(integer10, integer10, integer10, integer9).d();
		bpy.b(double6, double4, double5).b(integer10, integer11, integer11, integer9).d();
		bpy.b(double6, double4, double8).b(integer10, integer10, integer10, integer9).d();
		bpy.b(double3, double4, double8).b(integer10, integer10, integer10, integer9).d();
		bpy.b(double3, double4, double5).b(integer11, integer11, integer10, integer9).d();
		bpy.b(double3, double7, double5).b(integer11, integer10, integer11, integer9).d();
		bpy.b(double6, double7, double5).b(integer10, integer10, integer10, integer9).d();
		bpy.b(double6, double7, double8).b(integer10, integer10, integer10, integer9).d();
		bpy.b(double3, double7, double8).b(integer10, integer10, integer10, integer9).d();
		bpy.b(double3, double7, double5).b(integer10, integer10, integer10, integer9).d();
		bpy.b(double3, double7, double8).b(integer10, integer10, integer10, integer9).d();
		bpy.b(double3, double4, double8).b(integer10, integer10, integer10, integer9).d();
		bpy.b(double6, double4, double8).b(integer10, integer10, integer10, integer9).d();
		bpy.b(double6, double7, double8).b(integer10, integer10, integer10, integer9).d();
		bpy.b(double6, double7, double5).b(integer10, integer10, integer10, integer9).d();
		bpy.b(double6, double4, double5).b(integer10, integer10, integer10, integer9).d();
		bpy.b(double6, double4, double5).a((float)integer10, (float)integer10, (float)integer10, 0.0F).d();
		bqs.b();
		bqg.d(1.0F);
	}

	public boolean a(asx asx) {
		return true;
	}
}
