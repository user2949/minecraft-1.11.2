import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class cbp implements cbh {
	private final int a;
	private final List<cbp.b> b;
	private final cbh c;

	public cbp(List<cbp.b> list) {
		this.b = list;
		this.a = pb.a(list);
		this.c = ((cbp.b)list.get(0)).b;
	}

	private cbh a(long long1) {
		return pb.a(this.b, Math.abs((int)long1 >> 16) % this.a).b;
	}

	@Override
	public List<brd> a(@Nullable atl atl, @Nullable cv cv, long long3) {
		return this.a(long3).a(atl, cv, long3);
	}

	@Override
	public boolean a() {
		return this.c.a();
	}

	@Override
	public boolean b() {
		return this.c.b();
	}

	@Override
	public boolean c() {
		return this.c.c();
	}

	@Override
	public byz d() {
		return this.c.d();
	}

	@Override
	public brq e() {
		return this.c.e();
	}

	@Override
	public bro f() {
		return this.c.f();
	}

	public static class a {
		private final List<cbp.b> a = Lists.newArrayList();

		public cbp.a a(cbh cbh, int integer) {
			this.a.add(new cbp.b(cbh, integer));
			return this;
		}

		public cbp a() {
			Collections.sort(this.a);
			return new cbp(this.a);
		}

		public cbh b() {
			return ((cbp.b)this.a.get(0)).b;
		}
	}

	static class b extends pb.a implements Comparable<cbp.b> {
		protected final cbh b;

		public b(cbh cbh, int integer) {
			super(integer);
			this.b = cbh;
		}

		public int compareTo(cbp.b b) {
			return ComparisonChain.start().compare(b.a, this.a).result();
		}

		public String toString() {
			return "MyWeighedRandomItem{weight=" + this.a + ", model=" + this.b + '}';
		}
	}
}
