public class ow {
	private float a;
	private float b;
	private float c;

	public float a(float float1, float float2) {
		this.a += float1;
		float1 = (this.a - this.b) * float2;
		this.c = this.c + (float1 - this.c) * 0.5F;
		if (float1 > 0.0F && float1 > this.c || float1 < 0.0F && float1 < this.c) {
			float1 = this.c;
		}

		this.b += float1;
		return float1;
	}

	public void a() {
		this.a = 0.0F;
		this.b = 0.0F;
		this.c = 0.0F;
	}
}
