import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bsf extends bsc {
	private final aub<?> a;
	private final String c;
	private final List<aub<?>> d;

	private bsf(@Nullable aub<?> aub, @Nullable String string, List<aub<?>> list) {
		this.a = aub;
		this.c = string;
		this.d = list;
	}

	@Override
	protected cbm a(atl atl) {
		Map<aub<?>, Comparable<?>> map3 = Maps.newLinkedHashMap(atl.u());
		String string4;
		if (this.a == null) {
			string4 = alu.h.b(atl.v()).toString();
		} else {
			string4 = this.a(this.a, map3);
		}

		if (this.c != null) {
			string4 = string4 + this.c;
		}

		for (aub<?> aub6 : this.d) {
			map3.remove(aub6);
		}

		return new cbm(string4, this.a(map3));
	}

	private <T extends Comparable<T>> String a(aub<T> aub, Map<aub<?>, Comparable<?>> map) {
		return aub.a((T)map.remove(this.a));
	}

	public static class a {
		private aub<?> a;
		private String b;
		private final List<aub<?>> c = Lists.newArrayList();

		public bsf.a a(aub<?> aub) {
			this.a = aub;
			return this;
		}

		public bsf.a a(String string) {
			this.b = string;
			return this;
		}

		public bsf.a a(aub<?>... arr) {
			Collections.addAll(this.c, arr);
			return this;
		}

		public bsf a() {
			return new bsf(this.a, this.b, this.c);
		}
	}
}
