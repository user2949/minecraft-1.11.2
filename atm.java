import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public class atm {
	private static final Pattern a = Pattern.compile("^[a-z0-9_]+$");
	private static final Function<aub<?>, String> b = new Function<aub<?>, String>() {
		@Nullable
		public String apply(@Nullable aub<?> aub) {
			return aub == null ? "<NULL>" : aub.a();
		}
	};
	private final alu c;
	private final ImmutableSortedMap<String, aub<?>> d;
	private final ImmutableList<atl> e;

	public atm(alu alu, aub<?>... arr) {
		this.c = alu;
		Map<String, aub<?>> map4 = Maps.newHashMap();

		for (aub<?> aub8 : arr) {
			a(alu, aub8);
			map4.put(aub8.a(), aub8);
		}

		this.d = ImmutableSortedMap.copyOf(map4);
		Map<Map<aub<?>, Comparable<?>>, atm.a> map5 = Maps.newLinkedHashMap();
		List<atm.a> list6 = Lists.newArrayList();

		for (List<Comparable<?>> list9 : cr.a(this.e())) {
			Map<aub<?>, Comparable<?>> map10 = db.b(this.d.values(), list9);
			atm.a a11 = new atm.a(alu, ImmutableMap.copyOf(map10));
			map5.put(map10, a11);
			list6.add(a11);
		}

		for (atm.a a9 : list6) {
			a9.a(map5);
		}

		this.e = ImmutableList.copyOf(list6);
	}

	public static <T extends Comparable<T>> String a(alu alu, aub<T> aub) {
		String string3 = aub.a();
		if (!a.matcher(string3).matches()) {
			throw new IllegalArgumentException("Block: " + alu.getClass() + " has invalidly named property: " + string3);
		} else {
			for (T comparable5 : aub.c()) {
				String string6 = aub.a(comparable5);
				if (!a.matcher(string6).matches()) {
					throw new IllegalArgumentException("Block: " + alu.getClass() + " has property: " + string3 + " with invalidly named value: " + string6);
				}
			}

			return string3;
		}
	}

	public ImmutableList<atl> a() {
		return this.e;
	}

	private List<Iterable<Comparable<?>>> e() {
		List<Iterable<Comparable<?>>> list2 = Lists.newArrayList();
		ImmutableCollection<aub<?>> immutableCollection3 = this.d.values();
		UnmodifiableIterator var3 = immutableCollection3.iterator();

		while (var3.hasNext()) {
			aub<?> aub5 = (aub<?>)var3.next();
			list2.add(aub5.c());
		}

		return list2;
	}

	public atl b() {
		return (atl)this.e.get(0);
	}

	public alu c() {
		return this.c;
	}

	public Collection<aub<?>> d() {
		return this.d.values();
	}

	public String toString() {
		return Objects.toStringHelper(this).add("block", alu.h.b(this.c)).add("properties", Iterables.transform(this.d.values(), b)).toString();
	}

	@Nullable
	public aub<?> a(String string) {
		return (aub<?>)this.d.get(string);
	}

	static class a extends ati {
		private final alu a;
		private final ImmutableMap<aub<?>, Comparable<?>> b;
		private ImmutableTable<aub<?>, Comparable<?>, atl> c;

		private a(alu alu, ImmutableMap<aub<?>, Comparable<?>> immutableMap) {
			this.a = alu;
			this.b = immutableMap;
		}

		@Override
		public Collection<aub<?>> t() {
			return Collections.unmodifiableCollection(this.b.keySet());
		}

		@Override
		public <T extends Comparable<T>> T c(aub<T> aub) {
			Comparable<?> comparable3 = (Comparable<?>)this.b.get(aub);
			if (comparable3 == null) {
				throw new IllegalArgumentException("Cannot get property " + aub + " as it does not exist in " + this.a.s());
			} else {
				return (T)aub.b().cast(comparable3);
			}
		}

		@Override
		public <T extends Comparable<T>, V extends T> atl a(aub<T> aub, V comparable) {
			Comparable<?> comparable4 = (Comparable<?>)this.b.get(aub);
			if (comparable4 == null) {
				throw new IllegalArgumentException("Cannot set property " + aub + " as it does not exist in " + this.a.s());
			} else if (comparable4 == comparable) {
				return this;
			} else {
				atl atl5 = (atl)this.c.get(aub, comparable);
				if (atl5 == null) {
					throw new IllegalArgumentException("Cannot set property " + aub + " to " + comparable + " on block " + alu.h.b(this.a) + ", it is not an allowed value");
				} else {
					return atl5;
				}
			}
		}

		@Override
		public ImmutableMap<aub<?>, Comparable<?>> u() {
			return this.b;
		}

		@Override
		public alu v() {
			return this.a;
		}

		public boolean equals(Object object) {
			return this == object;
		}

		public int hashCode() {
			return this.b.hashCode();
		}

		public void a(Map<Map<aub<?>, Comparable<?>>, atm.a> map) {
			if (this.c != null) {
				throw new IllegalStateException();
			} else {
				Table<aub<?>, Comparable<?>, atl> table3 = HashBasedTable.create();
				UnmodifiableIterator var3 = this.b.entrySet().iterator();

				while (var3.hasNext()) {
					Entry<aub<?>, Comparable<?>> entry5 = (Entry<aub<?>, Comparable<?>>)var3.next();
					aub<?> aub6 = (aub<?>)entry5.getKey();

					for (Comparable<?> comparable8 : aub6.c()) {
						if (comparable8 != entry5.getValue()) {
							table3.put(aub6, comparable8, map.get(this.b(aub6, comparable8)));
						}
					}
				}

				this.c = ImmutableTable.copyOf(table3);
			}
		}

		private Map<aub<?>, Comparable<?>> b(aub<?> aub, Comparable<?> comparable) {
			Map<aub<?>, Comparable<?>> map4 = Maps.newHashMap(this.b);
			map4.put(aub, comparable);
			return map4;
		}

		@Override
		public azs a() {
			return this.a.q(this);
		}

		@Override
		public boolean b() {
			return this.a.l(this);
		}

		@Override
		public boolean a(sn sn) {
			return this.a.a(this, sn);
		}

		@Override
		public int c() {
			return this.a.m(this);
		}

		@Override
		public int d() {
			return this.a.o(this);
		}

		@Override
		public boolean e() {
			return this.a.n(this);
		}

		@Override
		public boolean f() {
			return this.a.p(this);
		}

		@Override
		public azt g() {
			return this.a.r(this);
		}

		@Override
		public atl a(aqi aqi) {
			return this.a.a(this, aqi);
		}

		@Override
		public atl a(aou aou) {
			return this.a.a(this, aou);
		}

		@Override
		public boolean h() {
			return this.a.c(this);
		}

		@Override
		public boolean i() {
			return this.a.v(this);
		}

		@Override
		public aqf j() {
			return this.a.a(this);
		}

		@Override
		public int a(ajw ajw, co co) {
			return this.a.d(this, ajw, co);
		}

		@Override
		public float k() {
			return this.a.f(this);
		}

		@Override
		public boolean l() {
			return this.a.s(this);
		}

		@Override
		public boolean m() {
			return this.a.t(this);
		}

		@Override
		public boolean n() {
			return this.a.g(this);
		}

		@Override
		public int a(ajw ajw, co co, cv cv) {
			return this.a.b(this, ajw, co, cv);
		}

		@Override
		public boolean o() {
			return this.a.x(this);
		}

		@Override
		public int a(ajs ajs, co co) {
			return this.a.c(this, ajs, co);
		}

		@Override
		public float b(ajs ajs, co co) {
			return this.a.a(this, ajs, co);
		}

		@Override
		public float a(aay aay, ajs ajs, co co) {
			return this.a.a(this, aay, ajs, co);
		}

		@Override
		public int b(ajw ajw, co co, cv cv) {
			return this.a.c(this, ajw, co, cv);
		}

		@Override
		public azv p() {
			return this.a.h(this);
		}

		@Override
		public atl b(ajw ajw, co co) {
			return this.a.c(this, ajw, co);
		}

		@Override
		public bdt c(ajs ajs, co co) {
			return this.a.b(this, ajs, co);
		}

		@Override
		public boolean c(ajw ajw, co co, cv cv) {
			return this.a.a(this, ajw, co, cv);
		}

		@Override
		public boolean q() {
			return this.a.b(this);
		}

		@Nullable
		@Override
		public bdt c(ajw ajw, co co) {
			return this.a.a(this, ajw, co);
		}

		@Override
		public void a(ajs ajs, co co, bdt bdt, List<bdt> list, @Nullable sn sn, boolean boolean6) {
			this.a.a(this, ajs, co, bdt, list, sn, boolean6);
		}

		@Override
		public bdt d(ajw ajw, co co) {
			return this.a.b(this, ajw, co);
		}

		@Override
		public bdu a(ajs ajs, co co, bdw bdw3, bdw bdw4) {
			return this.a.a(this, ajs, co, bdw3, bdw4);
		}

		@Override
		public boolean r() {
			return this.a.k(this);
		}

		@Override
		public bdw e(ajw ajw, co co) {
			return this.a.e(this, ajw, co);
		}

		@Override
		public boolean a(ajs ajs, co co, int integer3, int integer4) {
			return this.a.a(this, ajs, co, integer3, integer4);
		}

		@Override
		public void a(ajs ajs, co co2, alu alu, co co4) {
			this.a.a(this, ajs, co2, alu, co4);
		}

		@Override
		public boolean s() {
			return this.a.u(this);
		}
	}
}
