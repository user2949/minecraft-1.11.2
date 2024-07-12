import java.util.Random;

public class bxh implements bxp<yb> {
	public void a(yb yb, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		if (yb.bG > 0) {
			bqs bqs10 = bqs.a();
			bpy bpy11 = bqs10.c();
			beq.a();
			float float12 = ((float)yb.bG + float4) / 200.0F;
			float float13 = 0.0F;
			if (float12 > 0.8F) {
				float13 = (float12 - 0.8F) / 0.2F;
			}

			Random random14 = new Random(432L);
			bqg.z();
			bqg.j(7425);
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE);
			bqg.d();
			bqg.q();
			bqg.a(false);
			bqg.G();
			bqg.c(0.0F, -1.0F, -2.0F);

			for (int integer15 = 0; (float)integer15 < (float12 + float12 * float12) / 2.0F * 60.0F; integer15++) {
				bqg.b(random14.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
				bqg.b(random14.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
				bqg.b(random14.nextFloat() * 360.0F, 0.0F, 0.0F, 1.0F);
				bqg.b(random14.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
				bqg.b(random14.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
				bqg.b(random14.nextFloat() * 360.0F + float12 * 90.0F, 0.0F, 0.0F, 1.0F);
				float float16 = random14.nextFloat() * 20.0F + 5.0F + float13 * 10.0F;
				float float17 = random14.nextFloat() * 2.0F + 1.0F + float13 * 2.0F;
				bpy11.a(6, bzh.f);
				bpy11.b(0.0, 0.0, 0.0).b(255, 255, 255, (int)(255.0F * (1.0F - float13))).d();
				bpy11.b(-0.866 * (double)float17, (double)float16, (double)(-0.5F * float17)).b(255, 0, 255, 0).d();
				bpy11.b(0.866 * (double)float17, (double)float16, (double)(-0.5F * float17)).b(255, 0, 255, 0).d();
				bpy11.b(0.0, (double)float16, (double)(1.0F * float17)).b(255, 0, 255, 0).d();
				bpy11.b(-0.866 * (double)float17, (double)float16, (double)(-0.5F * float17)).b(255, 0, 255, 0).d();
				bqs10.b();
			}

			bqg.H();
			bqg.a(true);
			bqg.r();
			bqg.l();
			bqg.j(7424);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			bqg.y();
			bqg.e();
			beq.b();
		}
	}

	@Override
	public boolean a() {
		return false;
	}
}
