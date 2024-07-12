import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class bsd {
	private final Map<alu, bsg> a = Maps.newIdentityHashMap();
	private final Set<alu> b = Sets.newIdentityHashSet();

	public void a(alu alu, bsg bsg) {
		this.a.put(alu, bsg);
	}

	public void a(alu... arr) {
		Collections.addAll(this.b, arr);
	}

	public Map<atl, cbm> a() {
		Map<atl, cbm> map2 = Maps.newIdentityHashMap();

		for (alu alu4 : alu.h) {
			map2.putAll(this.b(alu4));
		}

		return map2;
	}

	public Set<kq> a(alu alu) {
		if (this.b.contains(alu)) {
			return Collections.emptySet();
		} else {
			bsg bsg3 = (bsg)this.a.get(alu);
			if (bsg3 == null) {
				return Collections.singleton(alu.h.b(alu));
			} else {
				Set<kq> set4 = Sets.newHashSet();

				for (cbm cbm6 : bsg3.a(alu).values()) {
					set4.add(new kq(cbm6.b(), cbm6.a()));
				}

				return set4;
			}
		}
	}

	public Map<atl, cbm> b(alu alu) {
		return this.b.contains(alu) ? Collections.emptyMap() : ((bsg)Objects.firstNonNull(this.a.get(alu), new bse())).a(alu);
	}
}
