import java.nio.FloatBuffer;

public class beq {
	private static final FloatBuffer a = ber.h(4);
	private static final bdw b = new bdw(0.2F, 1.0, -0.7F).a();
	private static final bdw c = new bdw(-0.2F, 1.0, 0.7F).a();

	public static void a() {
		bqg.g();
		bqg.b(0);
		bqg.b(1);
		bqg.i();
	}

	public static void b() {
		bqg.f();
		bqg.a(0);
		bqg.a(1);
		bqg.h();
		bqg.a(1032, 5634);
		bqg.a(16384, 4611, a(b.b, b.c, b.d, 0.0));
		float float1 = 0.6F;
		bqg.a(16384, 4609, a(0.6F, 0.6F, 0.6F, 1.0F));
		bqg.a(16384, 4608, a(0.0F, 0.0F, 0.0F, 1.0F));
		bqg.a(16384, 4610, a(0.0F, 0.0F, 0.0F, 1.0F));
		bqg.a(16385, 4611, a(c.b, c.c, c.d, 0.0));
		bqg.a(16385, 4609, a(0.6F, 0.6F, 0.6F, 1.0F));
		bqg.a(16385, 4608, a(0.0F, 0.0F, 0.0F, 1.0F));
		bqg.a(16385, 4610, a(0.0F, 0.0F, 0.0F, 1.0F));
		bqg.j(7424);
		float float2 = 0.4F;
		bqg.a(2899, a(0.4F, 0.4F, 0.4F, 1.0F));
	}

	private static FloatBuffer a(double double1, double double2, double double3, double double4) {
		return a((float)double1, (float)double2, (float)double3, (float)double4);
	}

	public static FloatBuffer a(float float1, float float2, float float3, float float4) {
		a.clear();
		a.put(float1).put(float2).put(float3).put(float4);
		a.flip();
		return a;
	}

	public static void c() {
		bqg.G();
		bqg.b(-30.0F, 0.0F, 1.0F, 0.0F);
		bqg.b(165.0F, 1.0F, 0.0F, 0.0F);
		b();
		bqg.H();
	}
}
