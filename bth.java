import com.google.common.collect.Queues;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;

public class bth {
	private static final int a = (int)Math.pow(16.0, 0.0);
	private static final int b = (int)Math.pow(16.0, 1.0);
	private static final int c = (int)Math.pow(16.0, 2.0);
	private final BitSet d = new BitSet(4096);
	private static final int[] e = new int[1352];
	private int f = 4096;

	public void a(co co) {
		this.d.set(c(co), true);
		this.f--;
	}

	private static int c(co co) {
		return a(co.p() & 15, co.q() & 15, co.r() & 15);
	}

	private static int a(int integer1, int integer2, int integer3) {
		return integer1 << 0 | integer2 << 8 | integer3 << 4;
	}

	public bti a() {
		bti bti2 = new bti();
		if (4096 - this.f < 256) {
			bti2.a(true);
		} else if (this.f == 0) {
			bti2.a(false);
		} else {
			for (int integer6 : e) {
				if (!this.d.get(integer6)) {
					bti2.a(this.a(integer6));
				}
			}
		}

		return bti2;
	}

	public Set<cv> b(co co) {
		return this.a(c(co));
	}

	private Set<cv> a(int integer) {
		Set<cv> set3 = EnumSet.noneOf(cv.class);
		Queue<Integer> queue4 = Queues.newArrayDeque();
		queue4.add(on.a(integer));
		this.d.set(integer, true);

		while (!queue4.isEmpty()) {
			int integer5 = (Integer)queue4.poll();
			this.a(integer5, set3);

			for (cv cv9 : cv.values()) {
				int integer10 = this.a(integer5, cv9);
				if (integer10 >= 0 && !this.d.get(integer10)) {
					this.d.set(integer10, true);
					queue4.add(on.a(integer10));
				}
			}
		}

		return set3;
	}

	private void a(int integer, Set<cv> set) {
		int integer4 = integer >> 0 & 15;
		if (integer4 == 0) {
			set.add(cv.WEST);
		} else if (integer4 == 15) {
			set.add(cv.EAST);
		}

		int integer5 = integer >> 8 & 15;
		if (integer5 == 0) {
			set.add(cv.DOWN);
		} else if (integer5 == 15) {
			set.add(cv.UP);
		}

		int integer6 = integer >> 4 & 15;
		if (integer6 == 0) {
			set.add(cv.NORTH);
		} else if (integer6 == 15) {
			set.add(cv.SOUTH);
		}
	}

	private int a(int integer, cv cv) {
		switch (cv) {
			case DOWN:
				if ((integer >> 8 & 15) == 0) {
					return -1;
				}

				return integer - c;
			case UP:
				if ((integer >> 8 & 15) == 15) {
					return -1;
				}

				return integer + c;
			case NORTH:
				if ((integer >> 4 & 15) == 0) {
					return -1;
				}

				return integer - b;
			case SOUTH:
				if ((integer >> 4 & 15) == 15) {
					return -1;
				}

				return integer + b;
			case WEST:
				if ((integer >> 0 & 15) == 0) {
					return -1;
				}

				return integer - a;
			case EAST:
				if ((integer >> 0 & 15) == 15) {
					return -1;
				}

				return integer + a;
			default:
				return -1;
		}
	}

	static {
		int integer1 = 0;
		int integer2 = 15;
		int integer3 = 0;

		for (int integer4 = 0; integer4 < 16; integer4++) {
			for (int integer5 = 0; integer5 < 16; integer5++) {
				for (int integer6 = 0; integer6 < 16; integer6++) {
					if (integer4 == 0 || integer4 == 15 || integer5 == 0 || integer5 == 15 || integer6 == 0 || integer6 == 15) {
						e[integer3++] = a(integer4, integer5, integer6);
					}
				}
			}
		}
	}
}
