import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class tp extends tn {
	private final Set<tk> e = Sets.newHashSet();
	protected final Map<String, tk> d = new om();

	public to a(tj tj) {
		return (to)super.a(tj);
	}

	public to a(String string) {
		tk tk3 = super.a(string);
		if (tk3 == null) {
			tk3 = (tk)this.d.get(string);
		}

		return (to)tk3;
	}

	@Override
	public tk b(tj tj) {
		tk tk3 = super.b(tj);
		if (tj instanceof tq && ((tq)tj).g() != null) {
			this.d.put(((tq)tj).g(), tk3);
		}

		return tk3;
	}

	@Override
	protected tk c(tj tj) {
		return new to(this, tj);
	}

	@Override
	public void a(tk tk) {
		if (tk.a().c()) {
			this.e.add(tk);
		}

		for (tj tj4 : this.c.get(tk.a())) {
			to to5 = this.e(tj4);
			if (to5 != null) {
				to5.f();
			}
		}
	}

	public Set<tk> b() {
		return this.e;
	}

	public Collection<tk> c() {
		Set<tk> set2 = Sets.newHashSet();

		for (tk tk4 : this.a()) {
			if (tk4.a().c()) {
				set2.add(tk4);
			}
		}

		return set2;
	}
}
