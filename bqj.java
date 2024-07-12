import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bqj {
	private final Map<Integer, cbm> a = Maps.newHashMap();
	private final Map<Integer, cbh> b = Maps.newHashMap();
	private final Map<afh, bqk> c = Maps.newHashMap();
	private final cbl d;

	public bqj(cbl cbl) {
		this.d = cbl;
	}

	public byz a(afh afh) {
		return this.a(afh, 0);
	}

	public byz a(afh afh, int integer) {
		return this.a(new afj(afh, 1, integer)).d();
	}

	public cbh a(afj afj) {
		afh afh3 = afj.c();
		cbh cbh4 = this.b(afh3, this.b(afj));
		if (cbh4 == null) {
			bqk bqk5 = (bqk)this.c.get(afh3);
			if (bqk5 != null) {
				cbh4 = this.d.a(bqk5.a(afj));
			}
		}

		if (cbh4 == null) {
			cbh4 = this.d.a();
		}

		return cbh4;
	}

	protected int b(afj afj) {
		return afj.k() > 0 ? 0 : afj.j();
	}

	@Nullable
	protected cbh b(afh afh, int integer) {
		return (cbh)this.b.get(this.c(afh, integer));
	}

	private int c(afh afh, int integer) {
		return afh.a(afh) << 16 | integer;
	}

	public void a(afh afh, int integer, cbm cbm) {
		this.a.put(this.c(afh, integer), cbm);
		this.b.put(this.c(afh, integer), this.d.a(cbm));
	}

	public void a(afh afh, bqk bqk) {
		this.c.put(afh, bqk);
	}

	public cbl a() {
		return this.d;
	}

	public void b() {
		this.b.clear();

		for (Entry<Integer, cbm> entry3 : this.a.entrySet()) {
			this.b.put(entry3.getKey(), this.d.a((cbm)entry3.getValue()));
		}
	}
}
