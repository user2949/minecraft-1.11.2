public class avh extends avf {
	@Override
	public void b() {
		this.c = new ako(akk.j);
		this.d = true;
		this.e = true;
	}

	@Override
	public bdw b(float float1, float float2) {
		return new bdw(0.2F, 0.03F, 0.03F);
	}

	@Override
	protected void a() {
		float float2 = 0.1F;

		for (int integer3 = 0; integer3 <= 15; integer3++) {
			float float4 = 1.0F - (float)integer3 / 15.0F;
			this.g[integer3] = (1.0F - float4) / (float4 * 3.0F + 1.0F) * 0.9F + 0.1F;
		}
	}

	@Override
	public aui c() {
		return new avw(this.b, this.b.T().r(), this.b.O());
	}

	@Override
	public boolean d() {
		return false;
	}

	@Override
	public boolean a(int integer1, int integer2) {
		return false;
	}

	@Override
	public float a(long long1, float float2) {
		return 0.5F;
	}

	@Override
	public boolean e() {
		return false;
	}

	@Override
	public boolean b(int integer1, int integer2) {
		return true;
	}

	@Override
	public auf p() {
		return new auf() {
			@Override
			public double f() {
				return super.f() / 8.0;
			}

			@Override
			public double g() {
				return super.g() / 8.0;
			}
		};
	}

	@Override
	public avg q() {
		return avg.NETHER;
	}
}
