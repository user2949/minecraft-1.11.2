public class bfi {
	public static final kq b = new kq("textures/gui/options_background.png");
	public static final kq c = new kq("textures/gui/container/stats_icons.png");
	public static final kq d = new kq("textures/gui/icons.png");
	protected float e;

	protected void a(int integer1, int integer2, int integer3, int integer4) {
		if (integer2 < integer1) {
			int integer6 = integer1;
			integer1 = integer2;
			integer2 = integer6;
		}

		a(integer1, integer3, integer2 + 1, integer3 + 1, integer4);
	}

	protected void b(int integer1, int integer2, int integer3, int integer4) {
		if (integer3 < integer2) {
			int integer6 = integer2;
			integer2 = integer3;
			integer3 = integer6;
		}

		a(integer1, integer2 + 1, integer1 + 1, integer3, integer4);
	}

	public static void a(int integer1, int integer2, int integer3, int integer4, int integer5) {
		if (integer1 < integer3) {
			int integer6 = integer1;
			integer1 = integer3;
			integer3 = integer6;
		}

		if (integer2 < integer4) {
			int integer6 = integer2;
			integer2 = integer4;
			integer4 = integer6;
		}

		float float6 = (float)(integer5 >> 24 & 0xFF) / 255.0F;
		float float7 = (float)(integer5 >> 16 & 0xFF) / 255.0F;
		float float8 = (float)(integer5 >> 8 & 0xFF) / 255.0F;
		float float9 = (float)(integer5 & 0xFF) / 255.0F;
		bqs bqs10 = bqs.a();
		bpy bpy11 = bqs10.c();
		bqg.m();
		bqg.z();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		bqg.c(float7, float8, float9, float6);
		bpy11.a(7, bzh.e);
		bpy11.b((double)integer1, (double)integer4, 0.0).d();
		bpy11.b((double)integer3, (double)integer4, 0.0).d();
		bpy11.b((double)integer3, (double)integer2, 0.0).d();
		bpy11.b((double)integer1, (double)integer2, 0.0).d();
		bqs10.b();
		bqg.y();
		bqg.l();
	}

	protected void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		float float8 = (float)(integer5 >> 24 & 0xFF) / 255.0F;
		float float9 = (float)(integer5 >> 16 & 0xFF) / 255.0F;
		float float10 = (float)(integer5 >> 8 & 0xFF) / 255.0F;
		float float11 = (float)(integer5 & 0xFF) / 255.0F;
		float float12 = (float)(integer6 >> 24 & 0xFF) / 255.0F;
		float float13 = (float)(integer6 >> 16 & 0xFF) / 255.0F;
		float float14 = (float)(integer6 >> 8 & 0xFF) / 255.0F;
		float float15 = (float)(integer6 & 0xFF) / 255.0F;
		bqg.z();
		bqg.m();
		bqg.d();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		bqg.j(7425);
		bqs bqs16 = bqs.a();
		bpy bpy17 = bqs16.c();
		bpy17.a(7, bzh.f);
		bpy17.b((double)integer3, (double)integer2, (double)this.e).a(float9, float10, float11, float8).d();
		bpy17.b((double)integer1, (double)integer2, (double)this.e).a(float9, float10, float11, float8).d();
		bpy17.b((double)integer1, (double)integer4, (double)this.e).a(float13, float14, float15, float12).d();
		bpy17.b((double)integer3, (double)integer4, (double)this.e).a(float13, float14, float15, float12).d();
		bqs16.b();
		bqg.j(7424);
		bqg.l();
		bqg.e();
		bqg.y();
	}

	public void a(bfg bfg, String string, int integer3, int integer4, int integer5) {
		bfg.a(string, (float)(integer3 - bfg.a(string) / 2), (float)integer4, integer5);
	}

	public void c(bfg bfg, String string, int integer3, int integer4, int integer5) {
		bfg.a(string, (float)integer3, (float)integer4, integer5);
	}

	public void b(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		float float8 = 0.00390625F;
		float float9 = 0.00390625F;
		bqs bqs10 = bqs.a();
		bpy bpy11 = bqs10.c();
		bpy11.a(7, bzh.g);
		bpy11.b((double)(integer1 + 0), (double)(integer2 + integer6), (double)this.e)
			.a((double)((float)(integer3 + 0) * 0.00390625F), (double)((float)(integer4 + integer6) * 0.00390625F))
			.d();
		bpy11.b((double)(integer1 + integer5), (double)(integer2 + integer6), (double)this.e)
			.a((double)((float)(integer3 + integer5) * 0.00390625F), (double)((float)(integer4 + integer6) * 0.00390625F))
			.d();
		bpy11.b((double)(integer1 + integer5), (double)(integer2 + 0), (double)this.e)
			.a((double)((float)(integer3 + integer5) * 0.00390625F), (double)((float)(integer4 + 0) * 0.00390625F))
			.d();
		bpy11.b((double)(integer1 + 0), (double)(integer2 + 0), (double)this.e)
			.a((double)((float)(integer3 + 0) * 0.00390625F), (double)((float)(integer4 + 0) * 0.00390625F))
			.d();
		bqs10.b();
	}

	public void a(float float1, float float2, int integer3, int integer4, int integer5, int integer6) {
		float float8 = 0.00390625F;
		float float9 = 0.00390625F;
		bqs bqs10 = bqs.a();
		bpy bpy11 = bqs10.c();
		bpy11.a(7, bzh.g);
		bpy11.b((double)(float1 + 0.0F), (double)(float2 + (float)integer6), (double)this.e)
			.a((double)((float)(integer3 + 0) * 0.00390625F), (double)((float)(integer4 + integer6) * 0.00390625F))
			.d();
		bpy11.b((double)(float1 + (float)integer5), (double)(float2 + (float)integer6), (double)this.e)
			.a((double)((float)(integer3 + integer5) * 0.00390625F), (double)((float)(integer4 + integer6) * 0.00390625F))
			.d();
		bpy11.b((double)(float1 + (float)integer5), (double)(float2 + 0.0F), (double)this.e)
			.a((double)((float)(integer3 + integer5) * 0.00390625F), (double)((float)(integer4 + 0) * 0.00390625F))
			.d();
		bpy11.b((double)(float1 + 0.0F), (double)(float2 + 0.0F), (double)this.e)
			.a((double)((float)(integer3 + 0) * 0.00390625F), (double)((float)(integer4 + 0) * 0.00390625F))
			.d();
		bqs10.b();
	}

	public void a(int integer1, int integer2, byz byz, int integer4, int integer5) {
		bqs bqs7 = bqs.a();
		bpy bpy8 = bqs7.c();
		bpy8.a(7, bzh.g);
		bpy8.b((double)(integer1 + 0), (double)(integer2 + integer5), (double)this.e).a((double)byz.e(), (double)byz.h()).d();
		bpy8.b((double)(integer1 + integer4), (double)(integer2 + integer5), (double)this.e).a((double)byz.f(), (double)byz.h()).d();
		bpy8.b((double)(integer1 + integer4), (double)(integer2 + 0), (double)this.e).a((double)byz.f(), (double)byz.g()).d();
		bpy8.b((double)(integer1 + 0), (double)(integer2 + 0), (double)this.e).a((double)byz.e(), (double)byz.g()).d();
		bqs7.b();
	}

	public static void a(int integer1, int integer2, float float3, float float4, int integer5, int integer6, float float7, float float8) {
		float float9 = 1.0F / float7;
		float float10 = 1.0F / float8;
		bqs bqs11 = bqs.a();
		bpy bpy12 = bqs11.c();
		bpy12.a(7, bzh.g);
		bpy12.b((double)integer1, (double)(integer2 + integer6), 0.0).a((double)(float3 * float9), (double)((float4 + (float)integer6) * float10)).d();
		bpy12.b((double)(integer1 + integer5), (double)(integer2 + integer6), 0.0)
			.a((double)((float3 + (float)integer5) * float9), (double)((float4 + (float)integer6) * float10))
			.d();
		bpy12.b((double)(integer1 + integer5), (double)integer2, 0.0).a((double)((float3 + (float)integer5) * float9), (double)(float4 * float10)).d();
		bpy12.b((double)integer1, (double)integer2, 0.0).a((double)(float3 * float9), (double)(float4 * float10)).d();
		bqs11.b();
	}

	public static void a(
		int integer1, int integer2, float float3, float float4, int integer5, int integer6, int integer7, int integer8, float float9, float float10
	) {
		float float11 = 1.0F / float9;
		float float12 = 1.0F / float10;
		bqs bqs13 = bqs.a();
		bpy bpy14 = bqs13.c();
		bpy14.a(7, bzh.g);
		bpy14.b((double)integer1, (double)(integer2 + integer8), 0.0).a((double)(float3 * float11), (double)((float4 + (float)integer6) * float12)).d();
		bpy14.b((double)(integer1 + integer7), (double)(integer2 + integer8), 0.0)
			.a((double)((float3 + (float)integer5) * float11), (double)((float4 + (float)integer6) * float12))
			.d();
		bpy14.b((double)(integer1 + integer7), (double)integer2, 0.0).a((double)((float3 + (float)integer5) * float11), (double)(float4 * float12)).d();
		bpy14.b((double)integer1, (double)integer2, 0.0).a((double)(float3 * float11), (double)(float4 * float12)).d();
		bqs13.b();
	}
}
