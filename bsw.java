import java.nio.FloatBuffer;
import java.util.Random;

public class bsw extends bsl<asz> {
	private static final kq a = new kq("textures/environment/end_sky.png");
	private static final kq d = new kq("textures/entity/end_portal.png");
	private static final Random e = new Random(31100L);
	private static final FloatBuffer f = ber.h(16);
	private static final FloatBuffer g = ber.h(16);
	private FloatBuffer h = ber.h(16);

	public void a(asz asz, double double2, double double3, double double4, float float5, int integer) {
		bqg.g();
		e.setSeed(31100L);
		bqg.c(2982, f);
		bqg.c(2983, g);
		double double11 = double2 * double2 + double3 * double3 + double4 * double4;
		int integer13 = this.a(double11);
		float float14 = this.c();
		boolean boolean15 = false;

		for (int integer16 = 0; integer16 < integer13; integer16++) {
			bqg.G();
			float float17 = 2.0F / (float)(18 - integer16);
			if (integer16 == 0) {
				this.a(a);
				float17 = 0.15F;
				bqg.m();
				bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA);
			}

			if (integer16 >= 1) {
				this.a(d);
				boolean15 = true;
				bes.z().o.d(true);
			}

			if (integer16 == 1) {
				bqg.m();
				bqg.a(bqg.r.ONE, bqg.l.ONE);
			}

			bqg.a(bqg.u.S, 9216);
			bqg.a(bqg.u.T, 9216);
			bqg.a(bqg.u.R, 9216);
			bqg.a(bqg.u.S, 9474, this.a(1.0F, 0.0F, 0.0F, 0.0F));
			bqg.a(bqg.u.T, 9474, this.a(0.0F, 1.0F, 0.0F, 0.0F));
			bqg.a(bqg.u.R, 9474, this.a(0.0F, 0.0F, 1.0F, 0.0F));
			bqg.a(bqg.u.S);
			bqg.a(bqg.u.T);
			bqg.a(bqg.u.R);
			bqg.H();
			bqg.n(5890);
			bqg.G();
			bqg.F();
			bqg.c(0.5F, 0.5F, 0.0F);
			bqg.b(0.5F, 0.5F, 1.0F);
			float float18 = (float)(integer16 + 1);
			bqg.c(17.0F / float18, (2.0F + float18 / 1.5F) * ((float)bes.I() % 800000.0F / 800000.0F), 0.0F);
			bqg.b((float18 * float18 * 4321.0F + float18 * 9.0F) * 2.0F, 0.0F, 0.0F, 1.0F);
			bqg.b(4.5F - float18 / 4.0F, 4.5F - float18 / 4.0F, 1.0F);
			bqg.a(g);
			bqg.a(f);
			bqs bqs19 = bqs.a();
			bpy bpy20 = bqs19.c();
			bpy20.a(7, bzh.f);
			float float21 = (e.nextFloat() * 0.5F + 0.1F) * float17;
			float float22 = (e.nextFloat() * 0.5F + 0.4F) * float17;
			float float23 = (e.nextFloat() * 0.5F + 0.5F) * float17;
			if (asz.a(cv.SOUTH)) {
				bpy20.b(double2, double3, double4 + 1.0).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2 + 1.0, double3, double4 + 1.0).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2 + 1.0, double3 + 1.0, double4 + 1.0).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2, double3 + 1.0, double4 + 1.0).a(float21, float22, float23, 1.0F).d();
			}

			if (asz.a(cv.NORTH)) {
				bpy20.b(double2, double3 + 1.0, double4).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2 + 1.0, double3 + 1.0, double4).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2 + 1.0, double3, double4).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2, double3, double4).a(float21, float22, float23, 1.0F).d();
			}

			if (asz.a(cv.EAST)) {
				bpy20.b(double2 + 1.0, double3 + 1.0, double4).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2 + 1.0, double3 + 1.0, double4 + 1.0).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2 + 1.0, double3, double4 + 1.0).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2 + 1.0, double3, double4).a(float21, float22, float23, 1.0F).d();
			}

			if (asz.a(cv.WEST)) {
				bpy20.b(double2, double3, double4).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2, double3, double4 + 1.0).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2, double3 + 1.0, double4 + 1.0).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2, double3 + 1.0, double4).a(float21, float22, float23, 1.0F).d();
			}

			if (asz.a(cv.DOWN)) {
				bpy20.b(double2, double3, double4).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2 + 1.0, double3, double4).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2 + 1.0, double3, double4 + 1.0).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2, double3, double4 + 1.0).a(float21, float22, float23, 1.0F).d();
			}

			if (asz.a(cv.UP)) {
				bpy20.b(double2, double3 + (double)float14, double4 + 1.0).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2 + 1.0, double3 + (double)float14, double4 + 1.0).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2 + 1.0, double3 + (double)float14, double4).a(float21, float22, float23, 1.0F).d();
				bpy20.b(double2, double3 + (double)float14, double4).a(float21, float22, float23, 1.0F).d();
			}

			bqs19.b();
			bqg.H();
			bqg.n(5888);
			this.a(a);
		}

		bqg.l();
		bqg.b(bqg.u.S);
		bqg.b(bqg.u.T);
		bqg.b(bqg.u.R);
		bqg.f();
		if (boolean15) {
			bes.z().o.d(false);
		}
	}

	protected int a(double double1) {
		int integer4;
		if (double1 > 36864.0) {
			integer4 = 1;
		} else if (double1 > 25600.0) {
			integer4 = 3;
		} else if (double1 > 16384.0) {
			integer4 = 5;
		} else if (double1 > 9216.0) {
			integer4 = 7;
		} else if (double1 > 4096.0) {
			integer4 = 9;
		} else if (double1 > 1024.0) {
			integer4 = 11;
		} else if (double1 > 576.0) {
			integer4 = 13;
		} else if (double1 > 256.0) {
			integer4 = 14;
		} else {
			integer4 = 15;
		}

		return integer4;
	}

	protected float c() {
		return 0.75F;
	}

	private FloatBuffer a(float float1, float float2, float float3, float float4) {
		this.h.clear();
		this.h.put(float1).put(float2).put(float3).put(float4);
		this.h.flip();
		return this.h;
	}
}
