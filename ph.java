import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ph implements pg {
	private static final Logger a = LogManager.getLogger();
	private final Map<pe, List<pj>> b = Maps.newHashMap();
	private final Map<pe, List<pd>> c = Maps.newHashMap();
	private final int d;

	public ph(int integer) {
		this.d = integer;
	}

	public du a(pe pe, du du) {
		int integer4 = du.b("DataVersion", 99) ? du.h("DataVersion") : -1;
		return integer4 >= 922 ? du : this.a(pe, du, integer4);
	}

	@Override
	public du a(pe pe, du du, int integer) {
		if (integer < this.d) {
			du = this.b(pe, du, integer);
			du = this.c(pe, du, integer);
		}

		return du;
	}

	private du b(pe pe, du du, int integer) {
		List<pd> list5 = (List<pd>)this.c.get(pe);
		if (list5 != null) {
			for (int integer6 = 0; integer6 < list5.size(); integer6++) {
				pd pd7 = (pd)list5.get(integer6);
				if (pd7.a() > integer) {
					du = pd7.a(du);
				}
			}
		}

		return du;
	}

	private du c(pe pe, du du, int integer) {
		List<pj> list5 = (List<pj>)this.b.get(pe);
		if (list5 != null) {
			for (int integer6 = 0; integer6 < list5.size(); integer6++) {
				du = ((pj)list5.get(integer6)).a(this, du, integer);
			}
		}

		return du;
	}

	public void a(pf pf, pj pj) {
		this.a((pe)pf, pj);
	}

	public void a(pe pe, pj pj) {
		this.a(this.b, pe).add(pj);
	}

	public void a(pe pe, pd pd) {
		List<pd> list4 = this.a(this.c, pe);
		int integer5 = pd.a();
		if (integer5 > this.d) {
			a.warn("Ignored fix registered for version: {} as the DataVersion of the game is: {}", new Object[]{integer5, this.d});
		} else {
			if (!list4.isEmpty() && h.<pd>a(list4).a() > integer5) {
				for (int integer6 = 0; integer6 < list4.size(); integer6++) {
					if (((pd)list4.get(integer6)).a() > integer5) {
						list4.add(integer6, pd);
						break;
					}
				}
			} else {
				list4.add(pd);
			}
		}
	}

	private <V> List<V> a(Map<pe, List<V>> map, pe pe) {
		List<V> list4 = (List<V>)map.get(pe);
		if (list4 == null) {
			list4 = Lists.newArrayList();
			map.put(pe, list4);
		}

		return list4;
	}
}
