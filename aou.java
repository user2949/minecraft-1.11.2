public enum aou {
	NONE("no_mirror"),
	LEFT_RIGHT("mirror_left_right"),
	FRONT_BACK("mirror_front_back");

	private final String d;
	private static final String[] e = new String[values().length];

	private aou(String string3) {
		this.d = string3;
	}

	public int a(int integer1, int integer2) {
		int integer4 = integer2 / 2;
		int integer5 = integer1 > integer4 ? integer1 - integer2 : integer1;
		switch (this) {
			case FRONT_BACK:
				return (integer2 - integer5) % integer2;
			case LEFT_RIGHT:
				return (integer4 - integer5 + integer2) % integer2;
			default:
				return integer1;
		}
	}

	public aqi a(cv cv) {
		cv.a a3 = cv.k();
		return (this != LEFT_RIGHT || a3 != cv.a.Z) && (this != FRONT_BACK || a3 != cv.a.X) ? aqi.NONE : aqi.CLOCKWISE_180;
	}

	public cv b(cv cv) {
		switch (this) {
			case FRONT_BACK:
				if (cv == cv.WEST) {
					return cv.EAST;
				} else {
					if (cv == cv.EAST) {
						return cv.WEST;
					}

					return cv;
				}
			case LEFT_RIGHT:
				if (cv == cv.NORTH) {
					return cv.SOUTH;
				} else {
					if (cv == cv.SOUTH) {
						return cv.NORTH;
					}

					return cv;
				}
			default:
				return cv;
		}
	}

	static {
		int integer1 = 0;

		for (aou aou5 : values()) {
			e[integer1++] = aou5.d;
		}
	}
}
