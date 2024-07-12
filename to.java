import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class to implements tk {
	private final tn a;
	private final tj b;
	private final Map<Integer, Set<tl>> c = Maps.newHashMap();
	private final Map<String, Set<tl>> d = Maps.newHashMap();
	private final Map<UUID, tl> e = Maps.newHashMap();
	private double f;
	private boolean g = true;
	private double h;

	public to(tn tn, tj tj) {
		this.a = tn;
		this.b = tj;
		this.f = tj.b();

		for (int integer4 = 0; integer4 < 3; integer4++) {
			this.c.put(integer4, Sets.newHashSet());
		}
	}

	@Override
	public tj a() {
		return this.b;
	}

	@Override
	public double b() {
		return this.f;
	}

	@Override
	public void a(double double1) {
		if (double1 != this.b()) {
			this.f = double1;
			this.f();
		}
	}

	@Override
	public Collection<tl> a(int integer) {
		return (Collection<tl>)this.c.get(integer);
	}

	@Override
	public Collection<tl> c() {
		Set<tl> set2 = Sets.newHashSet();

		for (int integer3 = 0; integer3 < 3; integer3++) {
			set2.addAll(this.a(integer3));
		}

		return set2;
	}

	@Nullable
	@Override
	public tl a(UUID uUID) {
		return (tl)this.e.get(uUID);
	}

	@Override
	public boolean a(tl tl) {
		return this.e.get(tl.a()) != null;
	}

	@Override
	public void b(tl tl) {
		if (this.a(tl.a()) != null) {
			throw new IllegalArgumentException("Modifier is already applied on this attribute!");
		} else {
			Set<tl> set3 = (Set<tl>)this.d.get(tl.b());
			if (set3 == null) {
				set3 = Sets.newHashSet();
				this.d.put(tl.b(), set3);
			}

			((Set)this.c.get(tl.c())).add(tl);
			set3.add(tl);
			this.e.put(tl.a(), tl);
			this.f();
		}
	}

	protected void f() {
		this.g = true;
		this.a.a(this);
	}

	@Override
	public void c(tl tl) {
		for (int integer3 = 0; integer3 < 3; integer3++) {
			Set<tl> set4 = (Set<tl>)this.c.get(integer3);
			set4.remove(tl);
		}

		Set<tl> set3 = (Set<tl>)this.d.get(tl.b());
		if (set3 != null) {
			set3.remove(tl);
			if (set3.isEmpty()) {
				this.d.remove(tl.b());
			}
		}

		this.e.remove(tl.a());
		this.f();
	}

	@Override
	public void b(UUID uUID) {
		tl tl3 = this.a(uUID);
		if (tl3 != null) {
			this.c(tl3);
		}
	}

	@Override
	public void d() {
		Collection<tl> collection2 = this.c();
		if (collection2 != null) {
			for (tl tl4 : Lists.newArrayList(collection2)) {
				this.c(tl4);
			}
		}
	}

	@Override
	public double e() {
		if (this.g) {
			this.h = this.g();
			this.g = false;
		}

		return this.h;
	}

	private double g() {
		double double2 = this.b();

		for (tl tl5 : this.b(0)) {
			double2 += tl5.d();
		}

		double double4 = double2;

		for (tl tl7 : this.b(1)) {
			double4 += double2 * tl7.d();
		}

		for (tl tl7 : this.b(2)) {
			double4 *= 1.0 + tl7.d();
		}

		return this.b.a(double4);
	}

	private Collection<tl> b(int integer) {
		Set<tl> set3 = Sets.newHashSet(this.a(integer));

		for (tj tj4 = this.b.d(); tj4 != null; tj4 = tj4.d()) {
			tk tk5 = this.a.a(tj4);
			if (tk5 != null) {
				set3.addAll(tk5.a(integer));
			}
		}

		return set3;
	}
}
