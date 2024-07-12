import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class fx implements fm<fp> {
	private Map<nw, Integer> a;

	public fx() {
	}

	public fx(Map<nw, Integer> map) {
		this.a = map;
	}

	public void a(fp fp) {
		fp.a(this);
	}

	@Override
	public void a(et et) throws IOException {
		int integer3 = et.g();
		this.a = Maps.newHashMap();

		for (int integer4 = 0; integer4 < integer3; integer4++) {
			nw nw5 = oa.a(et.e(32767));
			int integer6 = et.g();
			if (nw5 != null) {
				this.a.put(nw5, integer6);
			}
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a.size());

		for (Entry<nw, Integer> entry4 : this.a.entrySet()) {
			et.a(((nw)entry4.getKey()).e);
			et.d((Integer)entry4.getValue());
		}
	}

	public Map<nw, Integer> a() {
		return this.a;
	}
}
