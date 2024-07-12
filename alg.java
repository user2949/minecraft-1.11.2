import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class alg extends aki {
	private static final LoadingCache<Long, axl.a[]> M = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build(new alg.a());
	private final axl N = new axl();

	@Override
	protected void a(akf akf, ajs ajs, Random random) {
		this.a(ajs, random);
		axl.a[] arr5 = a(ajs);

		for (axl.a a9 : arr5) {
			if (a9.a(this.b)) {
				this.N.a(a9);
				this.N.b(ajs, random, new co(a9.a(), 45, a9.b()));
			}
		}
	}

	public static axl.a[] a(ajs ajs) {
		Random random2 = new Random(ajs.O());
		long long3 = random2.nextLong() & 65535L;
		return (axl.a[])M.getUnchecked(long3);
	}

	static class a extends CacheLoader<Long, axl.a[]> {
		private a() {
		}

		public axl.a[] a(Long long1) throws Exception {
			List<Integer> list3 = Lists.newArrayList(ContiguousSet.create(Range.closedOpen(0, 10), DiscreteDomain.integers()));
			Collections.shuffle(list3, new Random(long1));
			axl.a[] arr4 = new axl.a[10];

			for (int integer5 = 0; integer5 < 10; integer5++) {
				int integer6 = (int)(42.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 10) * (double)integer5)));
				int integer7 = (int)(42.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 10) * (double)integer5)));
				int integer8 = (Integer)list3.get(integer5);
				int integer9 = 2 + integer8 / 3;
				int integer10 = 76 + integer8 * 3;
				boolean boolean11 = integer8 == 1 || integer8 == 2;
				arr4[integer5] = new axl.a(integer6, integer7, integer9, integer10, boolean11);
			}

			return arr4;
		}
	}
}
