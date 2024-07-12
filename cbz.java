public class cbz implements ccv<cbz> {
	private final kq a;
	private final float b;
	private final float c;
	private final int d;
	private final cbz.a e;
	private final boolean f;

	public cbz(String string, float float2, float float3, int integer, cbz.a a, boolean boolean6) {
		this.a = new kq(string);
		this.b = float2;
		this.c = float3;
		this.d = integer;
		this.e = a;
		this.f = boolean6;
	}

	public kq a() {
		return this.a;
	}

	public kq b() {
		return new kq(this.a.b(), "sounds/" + this.a.a() + ".ogg");
	}

	public float c() {
		return this.b;
	}

	public float d() {
		return this.c;
	}

	@Override
	public int e() {
		return this.d;
	}

	public cbz i() {
		return this;
	}

	public cbz.a g() {
		return this.e;
	}

	public boolean h() {
		return this.f;
	}

	public static enum a {
		FILE("file"),
		SOUND_EVENT("event");

		private final String c;

		private a(String string3) {
			this.c = string3;
		}

		public static cbz.a a(String string) {
			for (cbz.a a5 : values()) {
				if (a5.c.equals(string)) {
					return a5;
				}
			}

			return null;
		}
	}
}
