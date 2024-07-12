import com.google.common.collect.Lists;
import java.util.List;

public class wk {
	sx a;
	List<sn> b = Lists.newArrayList();
	List<sn> c = Lists.newArrayList();

	public wk(sx sx) {
		this.a = sx;
	}

	public void a() {
		this.b.clear();
		this.c.clear();
	}

	public boolean a(sn sn) {
		if (this.b.contains(sn)) {
			return true;
		} else if (this.c.contains(sn)) {
			return false;
		} else {
			this.a.l.C.a("canSee");
			boolean boolean3 = this.a.D(sn);
			this.a.l.C.b();
			if (boolean3) {
				this.b.add(sn);
			} else {
				this.c.add(sn);
			}

			return boolean3;
		}
	}
}
