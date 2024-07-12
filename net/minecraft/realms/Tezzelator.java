package net.minecraft.realms;

public class Tezzelator {
	public static bqs t = bqs.a();
	public static final Tezzelator instance = new Tezzelator();

	public void end() {
		t.b();
	}

	public Tezzelator vertex(double double1, double double2, double double3) {
		t.c().b(double1, double2, double3);
		return this;
	}

	public void color(float float1, float float2, float float3, float float4) {
		t.c().a(float1, float2, float3, float4);
	}

	public void tex2(short short1, short short2) {
		t.c().a(short1, short2);
	}

	public void normal(float float1, float float2, float float3) {
		t.c().c(float1, float2, float3);
	}

	public void begin(int integer, RealmsVertexFormat realmsVertexFormat) {
		t.c().a(integer, realmsVertexFormat.getVertexFormat());
	}

	public void endVertex() {
		t.c().d();
	}

	public void offset(double double1, double double2, double double3) {
		t.c().c(double1, double2, double3);
	}

	public RealmsBufferBuilder color(int integer1, int integer2, int integer3, int integer4) {
		return new RealmsBufferBuilder(t.c().b(integer1, integer2, integer3, integer4));
	}

	public Tezzelator tex(double double1, double double2) {
		t.c().a(double1, double2);
		return this;
	}
}
