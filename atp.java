import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import javax.annotation.Nullable;

public class atp {
	private final Predicate<ato>[][][] a;
	private final int b;
	private final int c;
	private final int d;

	public atp(Predicate<ato>[][][] arr) {
		this.a = arr;
		this.b = arr.length;
		if (this.b > 0) {
			this.c = arr[0].length;
			if (this.c > 0) {
				this.d = arr[0][0].length;
			} else {
				this.d = 0;
			}
		} else {
			this.c = 0;
			this.d = 0;
		}
	}

	public int a() {
		return this.b;
	}

	public int b() {
		return this.c;
	}

	public int c() {
		return this.d;
	}

	@Nullable
	private atp.b a(co co, cv cv2, cv cv3, LoadingCache<co, ato> loadingCache) {
		for (int integer6 = 0; integer6 < this.d; integer6++) {
			for (int integer7 = 0; integer7 < this.c; integer7++) {
				for (int integer8 = 0; integer8 < this.b; integer8++) {
					if (!this.a[integer8][integer7][integer6].apply(loadingCache.getUnchecked(a(co, cv2, cv3, integer6, integer7, integer8)))) {
						return null;
					}
				}
			}
		}

		return new atp.b(co, cv2, cv3, loadingCache, this.d, this.c, this.b);
	}

	@Nullable
	public atp.b a(ajs ajs, co co) {
		LoadingCache<co, ato> loadingCache4 = a(ajs, false);
		int integer5 = Math.max(Math.max(this.d, this.c), this.b);

		for (co co7 : co.a(co, co.a(integer5 - 1, integer5 - 1, integer5 - 1))) {
			for (cv cv11 : cv.values()) {
				for (cv cv15 : cv.values()) {
					if (cv15 != cv11 && cv15 != cv11.d()) {
						atp.b b16 = this.a(co7, cv11, cv15, loadingCache4);
						if (b16 != null) {
							return b16;
						}
					}
				}
			}
		}

		return null;
	}

	public static LoadingCache<co, ato> a(ajs ajs, boolean boolean2) {
		return CacheBuilder.newBuilder().build(new atp.a(ajs, boolean2));
	}

	protected static co a(co co, cv cv2, cv cv3, int integer4, int integer5, int integer6) {
		if (cv2 != cv3 && cv2 != cv3.d()) {
			dl dl7 = new dl(cv2.g(), cv2.h(), cv2.i());
			dl dl8 = new dl(cv3.g(), cv3.h(), cv3.i());
			dl dl9 = dl7.d(dl8);
			return co.a(
				dl8.p() * -integer5 + dl9.p() * integer4 + dl7.p() * integer6,
				dl8.q() * -integer5 + dl9.q() * integer4 + dl7.q() * integer6,
				dl8.r() * -integer5 + dl9.r() * integer4 + dl7.r() * integer6
			);
		} else {
			throw new IllegalArgumentException("Invalid forwards & up combination");
		}
	}

	static class a extends CacheLoader<co, ato> {
		private final ajs a;
		private final boolean b;

		public a(ajs ajs, boolean boolean2) {
			this.a = ajs;
			this.b = boolean2;
		}

		public ato load(co co) throws Exception {
			return new ato(this.a, co, this.b);
		}
	}

	public static class b {
		private final co a;
		private final cv b;
		private final cv c;
		private final LoadingCache<co, ato> d;
		private final int e;
		private final int f;
		private final int g;

		public b(co co, cv cv2, cv cv3, LoadingCache<co, ato> loadingCache, int integer5, int integer6, int integer7) {
			this.a = co;
			this.b = cv2;
			this.c = cv3;
			this.d = loadingCache;
			this.e = integer5;
			this.f = integer6;
			this.g = integer7;
		}

		public co a() {
			return this.a;
		}

		public cv b() {
			return this.b;
		}

		public cv c() {
			return this.c;
		}

		public int d() {
			return this.e;
		}

		public int e() {
			return this.f;
		}

		public ato a(int integer1, int integer2, int integer3) {
			return (ato)this.d.getUnchecked(atp.a(this.a, this.b(), this.c(), integer1, integer2, integer3));
		}

		public String toString() {
			return Objects.toStringHelper(this).add("up", this.c).add("forwards", this.b).add("frontTopLeft", this.a).toString();
		}
	}
}
