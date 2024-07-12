import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class btv implements btt.a {
	private final bes a;
	private final Map<Long, Map<co, Integer>> b = Maps.newTreeMap(Ordering.natural().reverse());

	btv(bes bes) {
		this.a = bes;
	}

	public void a(long long1, co co) {
		Map<co, Integer> map5 = (Map<co, Integer>)this.b.get(long1);
		if (map5 == null) {
			map5 = Maps.newHashMap();
			this.b.put(long1, map5);
		}

		Integer integer6 = (Integer)map5.get(co);
		if (integer6 == null) {
			integer6 = 0;
		}

		map5.put(co, integer6 + 1);
	}

	@Override
	public void a(float float1, long long2) {
		long long5 = this.a.f.P();
		aay aay7 = this.a.h;
		double double8 = aay7.M + (aay7.p - aay7.M) * (double)float1;
		double double10 = aay7.N + (aay7.q - aay7.N) * (double)float1;
		double double12 = aay7.O + (aay7.r - aay7.O) * (double)float1;
		ajs ajs14 = this.a.h.l;
		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		bqg.d(2.0F);
		bqg.z();
		bqg.a(false);
		int integer15 = 200;
		double double16 = 0.0025;
		Set<co> set18 = Sets.newHashSet();
		Map<co, Integer> map19 = Maps.newHashMap();
		Iterator<Entry<Long, Map<co, Integer>>> iterator20 = this.b.entrySet().iterator();

		while (iterator20.hasNext()) {
			Entry<Long, Map<co, Integer>> entry21 = (Entry<Long, Map<co, Integer>>)iterator20.next();
			Long long22 = (Long)entry21.getKey();
			Map<co, Integer> map23 = (Map<co, Integer>)entry21.getValue();
			long long24 = long5 - long22;
			if (long24 > 200L) {
				iterator20.remove();
			} else {
				for (Entry<co, Integer> entry27 : map23.entrySet()) {
					co co28 = (co)entry27.getKey();
					Integer integer29 = (Integer)entry27.getValue();
					if (set18.add(co28)) {
						bqm.a(
							new bdt(co.a).g(0.002).h(0.0025 * (double)long24).d((double)co28.p(), (double)co28.q(), (double)co28.r()).d(-double8, -double10, -double12),
							1.0F,
							1.0F,
							1.0F,
							1.0F
						);
						map19.put(co28, integer29);
					}
				}
			}
		}

		for (Entry<co, Integer> entry21 : map19.entrySet()) {
			co co22 = (co)entry21.getKey();
			Integer integer23 = (Integer)entry21.getValue();
			btt.a(String.valueOf(integer23), co22.p(), co22.q(), co22.r(), float1, -1);
		}

		bqg.a(true);
		bqg.y();
		bqg.l();
	}
}
