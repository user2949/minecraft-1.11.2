import com.google.common.collect.Lists;
import java.util.List;

public class bah {
	private static int a = 256;
	private static final List<int[]> b = Lists.newArrayList();
	private static final List<int[]> c = Lists.newArrayList();
	private static final List<int[]> d = Lists.newArrayList();
	private static final List<int[]> e = Lists.newArrayList();

	public static synchronized int[] a(int integer) {
		if (integer <= 256) {
			if (b.isEmpty()) {
				int[] arr2 = new int[256];
				c.add(arr2);
				return arr2;
			} else {
				int[] arr2 = (int[])b.remove(b.size() - 1);
				c.add(arr2);
				return arr2;
			}
		} else if (integer > a) {
			a = integer;
			d.clear();
			e.clear();
			int[] arr2 = new int[a];
			e.add(arr2);
			return arr2;
		} else if (d.isEmpty()) {
			int[] arr2 = new int[a];
			e.add(arr2);
			return arr2;
		} else {
			int[] arr2 = (int[])d.remove(d.size() - 1);
			e.add(arr2);
			return arr2;
		}
	}

	public static synchronized void a() {
		if (!d.isEmpty()) {
			d.remove(d.size() - 1);
		}

		if (!b.isEmpty()) {
			b.remove(b.size() - 1);
		}

		d.addAll(e);
		b.addAll(c);
		e.clear();
		c.clear();
	}

	public static synchronized String b() {
		return "cache: " + d.size() + ", tcache: " + b.size() + ", allocated: " + e.size() + ", tallocated: " + c.size();
	}
}
