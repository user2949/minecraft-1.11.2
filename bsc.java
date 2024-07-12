import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import java.util.Map.Entry;

public abstract class bsc implements bsg {
	protected Map<atl, cbm> b = Maps.newLinkedHashMap();

	public String a(Map<aub<?>, Comparable<?>> map) {
		StringBuilder stringBuilder3 = new StringBuilder();

		for (Entry<aub<?>, Comparable<?>> entry5 : map.entrySet()) {
			if (stringBuilder3.length() != 0) {
				stringBuilder3.append(",");
			}

			aub<?> aub6 = (aub<?>)entry5.getKey();
			stringBuilder3.append(aub6.a());
			stringBuilder3.append("=");
			stringBuilder3.append(this.a(aub6, (Comparable<?>)entry5.getValue()));
		}

		if (stringBuilder3.length() == 0) {
			stringBuilder3.append("normal");
		}

		return stringBuilder3.toString();
	}

	private <T extends Comparable<T>> String a(aub<T> aub, Comparable<?> comparable) {
		return aub.a((T)comparable);
	}

	@Override
	public Map<atl, cbm> a(alu alu) {
		UnmodifiableIterator var2 = alu.s().a().iterator();

		while (var2.hasNext()) {
			atl atl4 = (atl)var2.next();
			this.b.put(atl4, this.a(atl4));
		}

		return this.b;
	}

	protected abstract cbm a(atl atl);
}
