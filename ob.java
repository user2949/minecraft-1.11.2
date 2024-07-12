import com.google.common.collect.Maps;
import java.util.Map;

public class ob {
	protected final Map<nw, ny> a = Maps.newConcurrentMap();

	public boolean a(nq nq) {
		return this.a((nw)nq) > 0;
	}

	public boolean b(nq nq) {
		return nq.c == null || this.a(nq.c);
	}

	public int c(nq nq) {
		if (this.a(nq)) {
			return 0;
		} else {
			int integer3 = 0;

			for (nq nq4 = nq.c; nq4 != null && !this.a(nq4); integer3++) {
				nq4 = nq4.c;
			}

			return integer3;
		}
	}

	public void b(aay aay, nw nw, int integer) {
		if (!nw.d() || this.b((nq)nw)) {
			this.a(aay, nw, this.a(nw) + integer);
		}
	}

	public void a(aay aay, nw nw, int integer) {
		ny ny5 = (ny)this.a.get(nw);
		if (ny5 == null) {
			ny5 = new ny();
			this.a.put(nw, ny5);
		}

		ny5.a(integer);
	}

	public int a(nw nw) {
		ny ny3 = (ny)this.a.get(nw);
		return ny3 == null ? 0 : ny3.a();
	}

	public <T extends nz> T b(nw nw) {
		ny ny3 = (ny)this.a.get(nw);
		return ny3 != null ? ny3.b() : null;
	}

	public <T extends nz> T a(nw nw, T nz) {
		ny ny4 = (ny)this.a.get(nw);
		if (ny4 == null) {
			ny4 = new ny();
			this.a.put(nw, ny4);
		}

		ny4.a(nz);
		return nz;
	}
}
