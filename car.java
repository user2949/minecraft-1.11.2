import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public class car implements can {
	private final List<caq> a;
	private final int b;
	private final int c;
	private final int d;
	private final boolean e;

	public car(List<caq> list, int integer2, int integer3, int integer4, boolean boolean5) {
		this.a = list;
		this.b = integer2;
		this.c = integer3;
		this.d = integer4;
		this.e = boolean5;
	}

	public int a() {
		return this.c;
	}

	public int b() {
		return this.b;
	}

	public int c() {
		return this.a.size();
	}

	public int d() {
		return this.d;
	}

	public boolean e() {
		return this.e;
	}

	private caq d(int integer) {
		return (caq)this.a.get(integer);
	}

	public int a(int integer) {
		caq caq3 = this.d(integer);
		return caq3.a() ? this.d : caq3.b();
	}

	public boolean b(int integer) {
		return !((caq)this.a.get(integer)).a();
	}

	public int c(int integer) {
		return ((caq)this.a.get(integer)).c();
	}

	public Set<Integer> f() {
		Set<Integer> set2 = Sets.newHashSet();

		for (caq caq4 : this.a) {
			set2.add(caq4.c());
		}

		return set2;
	}
}
