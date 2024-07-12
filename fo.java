public class fo {
	public static <T extends ew> void a(fm<T> fm, T ew, qy qy) throws lb {
		if (!qy.aF()) {
			qy.a(new Runnable() {
				public void run() {
					fm.a(ew);
				}
			});
			throw lb.a;
		}
	}
}
