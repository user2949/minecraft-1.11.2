public class bms {
	public bdw a;
	public float b;
	public float c;

	public bms(float float1, float float2, float float3, float float4, float float5) {
		this(new bdw((double)float1, (double)float2, (double)float3), float4, float5);
	}

	public bms a(float float1, float float2) {
		return new bms(this, float1, float2);
	}

	public bms(bms bms, float float2, float float3) {
		this.a = bms.a;
		this.b = float2;
		this.c = float3;
	}

	public bms(bdw bdw, float float2, float float3) {
		this.a = bdw;
		this.b = float2;
		this.c = float3;
	}
}
