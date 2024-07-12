public class azt {
	public static final azt[] a = new azt[64];
	public static final azt b = new azt(0, 0);
	public static final azt c = new azt(1, 8368696);
	public static final azt d = new azt(2, 16247203);
	public static final azt e = new azt(3, 13092807);
	public static final azt f = new azt(4, 16711680);
	public static final azt g = new azt(5, 10526975);
	public static final azt h = new azt(6, 10987431);
	public static final azt i = new azt(7, 31744);
	public static final azt j = new azt(8, 16777215);
	public static final azt k = new azt(9, 10791096);
	public static final azt l = new azt(10, 9923917);
	public static final azt m = new azt(11, 7368816);
	public static final azt n = new azt(12, 4210943);
	public static final azt o = new azt(13, 9402184);
	public static final azt p = new azt(14, 16776437);
	public static final azt q = new azt(15, 14188339);
	public static final azt r = new azt(16, 11685080);
	public static final azt s = new azt(17, 6724056);
	public static final azt t = new azt(18, 15066419);
	public static final azt u = new azt(19, 8375321);
	public static final azt v = new azt(20, 15892389);
	public static final azt w = new azt(21, 5000268);
	public static final azt x = new azt(22, 10066329);
	public static final azt y = new azt(23, 5013401);
	public static final azt z = new azt(24, 8339378);
	public static final azt A = new azt(25, 3361970);
	public static final azt B = new azt(26, 6704179);
	public static final azt C = new azt(27, 6717235);
	public static final azt D = new azt(28, 10040115);
	public static final azt E = new azt(29, 1644825);
	public static final azt F = new azt(30, 16445005);
	public static final azt G = new azt(31, 6085589);
	public static final azt H = new azt(32, 4882687);
	public static final azt I = new azt(33, 55610);
	public static final azt J = new azt(34, 8476209);
	public static final azt K = new azt(35, 7340544);
	public final int L;
	public final int M;

	private azt(int integer1, int integer2) {
		if (integer1 >= 0 && integer1 <= 63) {
			this.M = integer1;
			this.L = integer2;
			a[integer1] = this;
		} else {
			throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
		}
	}

	public int a(int integer) {
		int integer3 = 220;
		if (integer == 3) {
			integer3 = 135;
		}

		if (integer == 2) {
			integer3 = 255;
		}

		if (integer == 1) {
			integer3 = 220;
		}

		if (integer == 0) {
			integer3 = 180;
		}

		int integer4 = (this.L >> 16 & 0xFF) * integer3 / 255;
		int integer5 = (this.L >> 8 & 0xFF) * integer3 / 255;
		int integer6 = (this.L & 0xFF) * integer3 / 255;
		return 0xFF000000 | integer4 << 16 | integer5 << 8 | integer6;
	}
}
