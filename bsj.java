import java.util.List;

public class bsj extends bsl<asb> {
	public static final kq a = new kq("textures/entity/beacon_beam.png");

	public void a(asb asb, double double2, double double3, double double4, float float5, int integer) {
		this.a(double2, double3, double4, (double)float5, (double)asb.p(), asb.o(), (double)asb.D().P());
	}

	public void a(double double1, double double2, double double3, double double4, double double5, List<asb.a> list, double double7) {
		bqg.a(516, 0.1F);
		this.a(a);
		if (double5 > 0.0) {
			bqg.p();
			int integer15 = 0;

			for (int integer16 = 0; integer16 < list.size(); integer16++) {
				asb.a a17 = (asb.a)list.get(integer16);
				a(double1, double2, double3, double4, double5, double7, integer15, a17.c(), a17.b());
				integer15 += a17.c();
			}

			bqg.o();
		}
	}

	public static void a(double double1, double double2, double double3, double double4, double double5, double double6, int integer7, int integer8, float[] arr) {
		a(double1, double2, double3, double4, double5, double6, integer7, integer8, arr, 0.2, 0.25);
	}

	public static void a(
		double double1,
		double double2,
		double double3,
		double double4,
		double double5,
		double double6,
		int integer7,
		int integer8,
		float[] arr,
		double double10,
		double double11
	) {
		int integer20 = integer7 + integer8;
		bqg.b(3553, 10242, 10497);
		bqg.b(3553, 10243, 10497);
		bqg.g();
		bqg.r();
		bqg.l();
		bqg.a(true);
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE, bqg.r.ONE, bqg.l.ZERO);
		bqs bqs21 = bqs.a();
		bpy bpy22 = bqs21.c();
		double double23 = double6 + double4;
		double double25 = integer8 < 0 ? double23 : -double23;
		double double27 = ot.h(double25 * 0.2 - (double)ot.c(double25 * 0.1));
		float float29 = arr[0];
		float float30 = arr[1];
		float float31 = arr[2];
		double double32 = double23 * 0.025 * -1.5;
		double double34 = 0.5 + Math.cos(double32 + (Math.PI * 3.0 / 4.0)) * double10;
		double double36 = 0.5 + Math.sin(double32 + (Math.PI * 3.0 / 4.0)) * double10;
		double double38 = 0.5 + Math.cos(double32 + (Math.PI / 4)) * double10;
		double double40 = 0.5 + Math.sin(double32 + (Math.PI / 4)) * double10;
		double double42 = 0.5 + Math.cos(double32 + (Math.PI * 5.0 / 4.0)) * double10;
		double double44 = 0.5 + Math.sin(double32 + (Math.PI * 5.0 / 4.0)) * double10;
		double double46 = 0.5 + Math.cos(double32 + (Math.PI * 7.0 / 4.0)) * double10;
		double double48 = 0.5 + Math.sin(double32 + (Math.PI * 7.0 / 4.0)) * double10;
		double double50 = 0.0;
		double double52 = 1.0;
		double double54 = -1.0 + double27;
		double double56 = (double)integer8 * double5 * (0.5 / double10) + double54;
		bpy22.a(7, bzh.i);
		bpy22.b(double1 + double34, double2 + (double)integer20, double3 + double36).a(1.0, double56).a(float29, float30, float31, 1.0F).d();
		bpy22.b(double1 + double34, double2 + (double)integer7, double3 + double36).a(1.0, double54).a(float29, float30, float31, 1.0F).d();
		bpy22.b(double1 + double38, double2 + (double)integer7, double3 + double40).a(0.0, double54).a(float29, float30, float31, 1.0F).d();
		bpy22.b(double1 + double38, double2 + (double)integer20, double3 + double40).a(0.0, double56).a(float29, float30, float31, 1.0F).d();
		bpy22.b(double1 + double46, double2 + (double)integer20, double3 + double48).a(1.0, double56).a(float29, float30, float31, 1.0F).d();
		bpy22.b(double1 + double46, double2 + (double)integer7, double3 + double48).a(1.0, double54).a(float29, float30, float31, 1.0F).d();
		bpy22.b(double1 + double42, double2 + (double)integer7, double3 + double44).a(0.0, double54).a(float29, float30, float31, 1.0F).d();
		bpy22.b(double1 + double42, double2 + (double)integer20, double3 + double44).a(0.0, double56).a(float29, float30, float31, 1.0F).d();
		bpy22.b(double1 + double38, double2 + (double)integer20, double3 + double40).a(1.0, double56).a(float29, float30, float31, 1.0F).d();
		bpy22.b(double1 + double38, double2 + (double)integer7, double3 + double40).a(1.0, double54).a(float29, float30, float31, 1.0F).d();
		bpy22.b(double1 + double46, double2 + (double)integer7, double3 + double48).a(0.0, double54).a(float29, float30, float31, 1.0F).d();
		bpy22.b(double1 + double46, double2 + (double)integer20, double3 + double48).a(0.0, double56).a(float29, float30, float31, 1.0F).d();
		bpy22.b(double1 + double42, double2 + (double)integer20, double3 + double44).a(1.0, double56).a(float29, float30, float31, 1.0F).d();
		bpy22.b(double1 + double42, double2 + (double)integer7, double3 + double44).a(1.0, double54).a(float29, float30, float31, 1.0F).d();
		bpy22.b(double1 + double34, double2 + (double)integer7, double3 + double36).a(0.0, double54).a(float29, float30, float31, 1.0F).d();
		bpy22.b(double1 + double34, double2 + (double)integer20, double3 + double36).a(0.0, double56).a(float29, float30, float31, 1.0F).d();
		bqs21.b();
		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		bqg.a(false);
		double32 = 0.5 - double11;
		double34 = 0.5 - double11;
		double36 = 0.5 + double11;
		double38 = 0.5 - double11;
		double40 = 0.5 - double11;
		double42 = 0.5 + double11;
		double44 = 0.5 + double11;
		double46 = 0.5 + double11;
		double48 = 0.0;
		double50 = 1.0;
		double52 = -1.0 + double27;
		double54 = (double)integer8 * double5 + double52;
		bpy22.a(7, bzh.i);
		bpy22.b(double1 + double32, double2 + (double)integer20, double3 + double34).a(1.0, double54).a(float29, float30, float31, 0.125F).d();
		bpy22.b(double1 + double32, double2 + (double)integer7, double3 + double34).a(1.0, double52).a(float29, float30, float31, 0.125F).d();
		bpy22.b(double1 + double36, double2 + (double)integer7, double3 + double38).a(0.0, double52).a(float29, float30, float31, 0.125F).d();
		bpy22.b(double1 + double36, double2 + (double)integer20, double3 + double38).a(0.0, double54).a(float29, float30, float31, 0.125F).d();
		bpy22.b(double1 + double44, double2 + (double)integer20, double3 + double46).a(1.0, double54).a(float29, float30, float31, 0.125F).d();
		bpy22.b(double1 + double44, double2 + (double)integer7, double3 + double46).a(1.0, double52).a(float29, float30, float31, 0.125F).d();
		bpy22.b(double1 + double40, double2 + (double)integer7, double3 + double42).a(0.0, double52).a(float29, float30, float31, 0.125F).d();
		bpy22.b(double1 + double40, double2 + (double)integer20, double3 + double42).a(0.0, double54).a(float29, float30, float31, 0.125F).d();
		bpy22.b(double1 + double36, double2 + (double)integer20, double3 + double38).a(1.0, double54).a(float29, float30, float31, 0.125F).d();
		bpy22.b(double1 + double36, double2 + (double)integer7, double3 + double38).a(1.0, double52).a(float29, float30, float31, 0.125F).d();
		bpy22.b(double1 + double44, double2 + (double)integer7, double3 + double46).a(0.0, double52).a(float29, float30, float31, 0.125F).d();
		bpy22.b(double1 + double44, double2 + (double)integer20, double3 + double46).a(0.0, double54).a(float29, float30, float31, 0.125F).d();
		bpy22.b(double1 + double40, double2 + (double)integer20, double3 + double42).a(1.0, double54).a(float29, float30, float31, 0.125F).d();
		bpy22.b(double1 + double40, double2 + (double)integer7, double3 + double42).a(1.0, double52).a(float29, float30, float31, 0.125F).d();
		bpy22.b(double1 + double32, double2 + (double)integer7, double3 + double34).a(0.0, double52).a(float29, float30, float31, 0.125F).d();
		bpy22.b(double1 + double32, double2 + (double)integer20, double3 + double34).a(0.0, double54).a(float29, float30, float31, 0.125F).d();
		bqs21.b();
		bqg.f();
		bqg.y();
		bqg.a(true);
	}

	public boolean a(asb asb) {
		return true;
	}
}
