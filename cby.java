public class cby extends cbs {
	public cby(nm nm, no no, float float3, float float4, co co) {
		this(nm, no, float3, float4, (float)co.p() + 0.5F, (float)co.q() + 0.5F, (float)co.r() + 0.5F);
	}

	public static cby a(nm nm, float float2) {
		return new cby(nm, no.MASTER, 0.25F, float2, false, 0, ccc.a.NONE, 0.0F, 0.0F, 0.0F);
	}

	public static cby a(nm nm) {
		return new cby(nm, no.MUSIC, 1.0F, 1.0F, false, 0, ccc.a.NONE, 0.0F, 0.0F, 0.0F);
	}

	public static cby a(nm nm, float float2, float float3, float float4) {
		return new cby(nm, no.RECORDS, 4.0F, 1.0F, false, 0, ccc.a.LINEAR, float2, float3, float4);
	}

	public cby(nm nm, no no, float float3, float float4, float float5, float float6, float float7) {
		this(nm, no, float3, float4, false, 0, ccc.a.LINEAR, float5, float6, float7);
	}

	private cby(nm nm, no no, float float3, float float4, boolean boolean5, int integer, ccc.a a, float float8, float float9, float float10) {
		this(nm.a(), no, float3, float4, boolean5, integer, a, float8, float9, float10);
	}

	public cby(kq kq, no no, float float3, float float4, boolean boolean5, int integer, ccc.a a, float float8, float float9, float float10) {
		super(kq, no);
		this.d = float3;
		this.e = float4;
		this.f = float8;
		this.g = float9;
		this.h = float10;
		this.i = boolean5;
		this.j = integer;
		this.k = a;
	}
}
