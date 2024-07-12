import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class afy extends afh {
	private static final Map<nm, afy> a = Maps.newHashMap();
	private final nm b;
	private final String c;

	protected afy(String string, nm nm) {
		this.c = "item.record." + string + ".desc";
		this.b = nm;
		this.k = 1;
		this.a(aej.f);
		a.put(this.b, this);
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		atl atl10 = ajs.o(co);
		if (atl10.v() == alv.aN && !(Boolean)atl10.c(aol.a)) {
			if (!ajs.E) {
				afj afj11 = aay.b(ri);
				((aol)alv.aN).a(ajs, co, atl10, afj11);
				ajs.a(null, 1010, co, afh.a(this));
				afj11.g(1);
				aay.b(oa.X);
			}

			return rk.SUCCESS;
		} else {
			return rk.PASS;
		}
	}

	@Override
	public void a(afj afj, aay aay, List<String> list, boolean boolean4) {
		list.add(this.g());
	}

	public String g() {
		return dp.a(this.c);
	}

	@Override
	public afx g(afj afj) {
		return afx.RARE;
	}

	@Nullable
	public static afy a(nm nm) {
		return (afy)a.get(nm);
	}

	public nm h() {
		return this.b;
	}
}
