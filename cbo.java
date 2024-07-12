import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cbo implements cbh {
	protected final List<brd> a;
	protected final Map<cv, List<brd>> b;
	protected final boolean c;
	protected final boolean d;
	protected final byz e;
	protected final brq f;
	protected final bro g;

	public cbo(List<brd> list, Map<cv, List<brd>> map, boolean boolean3, boolean boolean4, byz byz, brq brq, bro bro) {
		this.a = list;
		this.b = map;
		this.c = boolean3;
		this.d = boolean4;
		this.e = byz;
		this.f = brq;
		this.g = bro;
	}

	@Override
	public List<brd> a(@Nullable atl atl, @Nullable cv cv, long long3) {
		return cv == null ? this.a : (List)this.b.get(cv);
	}

	@Override
	public boolean a() {
		return this.c;
	}

	@Override
	public boolean b() {
		return this.d;
	}

	@Override
	public boolean c() {
		return false;
	}

	@Override
	public byz d() {
		return this.e;
	}

	@Override
	public brq e() {
		return this.f;
	}

	@Override
	public bro f() {
		return this.g;
	}

	public static class a {
		private final List<brd> a = Lists.newArrayList();
		private final Map<cv, List<brd>> b = Maps.newEnumMap(cv.class);
		private final bro c;
		private final boolean d;
		private byz e;
		private final boolean f;
		private final brq g;

		public a(bri bri, bro bro) {
			this(bri.b(), bri.c(), bri.j(), bro);
		}

		public a(atl atl, cbh cbh, byz byz, co co) {
			this(cbh.a(), cbh.b(), cbh.e(), cbh.f());
			this.e = cbh.d();
			long long6 = ot.a(co);

			for (cv cv11 : cv.values()) {
				this.a(atl, cbh, byz, cv11, long6);
			}

			this.a(atl, cbh, byz, long6);
		}

		private a(boolean boolean1, boolean boolean2, brq brq, bro bro) {
			for (cv cv9 : cv.values()) {
				this.b.put(cv9, Lists.newArrayList());
			}

			this.c = bro;
			this.d = boolean1;
			this.f = boolean2;
			this.g = brq;
		}

		private void a(atl atl, cbh cbh, byz byz, cv cv, long long5) {
			for (brd brd9 : cbh.a(atl, cv, long5)) {
				this.a(cv, new brk(brd9, byz));
			}
		}

		private void a(atl atl, cbh cbh, byz byz, long long4) {
			for (brd brd8 : cbh.a(atl, null, long4)) {
				this.a(new brk(brd8, byz));
			}
		}

		public cbo.a a(cv cv, brd brd) {
			((List)this.b.get(cv)).add(brd);
			return this;
		}

		public cbo.a a(brd brd) {
			this.a.add(brd);
			return this;
		}

		public cbo.a a(byz byz) {
			this.e = byz;
			return this;
		}

		public cbh b() {
			if (this.e == null) {
				throw new RuntimeException("Missing particle!");
			} else {
				return new cbo(this.a, this.b, this.d, this.f, this.e, this.g, this.c);
			}
		}
	}
}
