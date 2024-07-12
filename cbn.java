import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class cbn implements cbh {
	private final Map<Predicate<atl>, cbh> f;
	protected final boolean a;
	protected final boolean b;
	protected final byz c;
	protected final brq d;
	protected final bro e;

	public cbn(Map<Predicate<atl>, cbh> map) {
		this.f = map;
		cbh cbh3 = (cbh)map.values().iterator().next();
		this.a = cbh3.a();
		this.b = cbh3.b();
		this.c = cbh3.d();
		this.d = cbh3.e();
		this.e = cbh3.f();
	}

	@Override
	public List<brd> a(@Nullable atl atl, @Nullable cv cv, long long3) {
		List<brd> list6 = Lists.newArrayList();
		if (atl != null) {
			for (Entry<Predicate<atl>, cbh> entry8 : this.f.entrySet()) {
				if (((Predicate)entry8.getKey()).apply(atl)) {
					list6.addAll(((cbh)entry8.getValue()).a(atl, cv, long3++));
				}
			}
		}

		return list6;
	}

	@Override
	public boolean a() {
		return this.a;
	}

	@Override
	public boolean b() {
		return this.b;
	}

	@Override
	public boolean c() {
		return false;
	}

	@Override
	public byz d() {
		return this.c;
	}

	@Override
	public brq e() {
		return this.d;
	}

	@Override
	public bro f() {
		return this.e;
	}

	public static class a {
		private final Map<Predicate<atl>, cbh> a = Maps.newLinkedHashMap();

		public void a(Predicate<atl> predicate, cbh cbh) {
			this.a.put(predicate, cbh);
		}

		public cbh a() {
			return new cbn(this.a);
		}
	}
}
