import java.util.List;
import java.util.Random;

public class pb {
	public static int a(List<? extends pb.a> list) {
		int integer2 = 0;
		int integer3 = 0;

		for (int integer4 = list.size(); integer3 < integer4; integer3++) {
			pb.a a5 = (pb.a)list.get(integer3);
			integer2 += a5.a;
		}

		return integer2;
	}

	public static <T extends pb.a> T a(Random random, List<T> list, int integer) {
		if (integer <= 0) {
			throw new IllegalArgumentException();
		} else {
			int integer4 = random.nextInt(integer);
			return a(list, integer4);
		}
	}

	public static <T extends pb.a> T a(List<T> list, int integer) {
		int integer3 = 0;

		for (int integer4 = list.size(); integer3 < integer4; integer3++) {
			T a5 = (T)list.get(integer3);
			integer -= a5.a;
			if (integer < 0) {
				return a5;
			}
		}

		return null;
	}

	public static <T extends pb.a> T a(Random random, List<T> list) {
		return a(random, list, a(list));
	}

	public static class a {
		protected int a;

		public a(int integer) {
			this.a = integer;
		}
	}
}
