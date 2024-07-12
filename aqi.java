public enum aqi {
	NONE("rotate_0"),
	CLOCKWISE_90("rotate_90"),
	CLOCKWISE_180("rotate_180"),
	COUNTERCLOCKWISE_90("rotate_270");

	private final String e;
	private static final String[] f = new String[values().length];

	private aqi(String string3) {
		this.e = string3;
	}

	public aqi a(aqi aqi) {
		switch (aqi) {
			case CLOCKWISE_180:
				switch (this) {
					case NONE:
						return CLOCKWISE_180;
					case CLOCKWISE_90:
						return COUNTERCLOCKWISE_90;
					case CLOCKWISE_180:
						return NONE;
					case COUNTERCLOCKWISE_90:
						return CLOCKWISE_90;
				}
			case COUNTERCLOCKWISE_90:
				switch (this) {
					case NONE:
						return COUNTERCLOCKWISE_90;
					case CLOCKWISE_90:
						return NONE;
					case CLOCKWISE_180:
						return CLOCKWISE_90;
					case COUNTERCLOCKWISE_90:
						return CLOCKWISE_180;
				}
			case CLOCKWISE_90:
				switch (this) {
					case NONE:
						return CLOCKWISE_90;
					case CLOCKWISE_90:
						return CLOCKWISE_180;
					case CLOCKWISE_180:
						return COUNTERCLOCKWISE_90;
					case COUNTERCLOCKWISE_90:
						return NONE;
				}
			default:
				return this;
		}
	}

	public cv a(cv cv) {
		if (cv.k() == cv.a.Y) {
			return cv;
		} else {
			switch (this) {
				case CLOCKWISE_90:
					return cv.e();
				case CLOCKWISE_180:
					return cv.d();
				case COUNTERCLOCKWISE_90:
					return cv.f();
				default:
					return cv;
			}
		}
	}

	public int a(int integer1, int integer2) {
		switch (this) {
			case CLOCKWISE_90:
				return (integer1 + integer2 / 4) % integer2;
			case CLOCKWISE_180:
				return (integer1 + integer2 / 2) % integer2;
			case COUNTERCLOCKWISE_90:
				return (integer1 + integer2 * 3 / 4) % integer2;
			default:
				return integer1;
		}
	}

	static {
		int integer1 = 0;

		for (aqi aqi5 : values()) {
			f[integer1++] = aqi5.e;
		}
	}
}
