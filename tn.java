import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public abstract class tn {
	protected final Map<tj, tk> a = Maps.newHashMap();
	protected final Map<String, tk> b = new om();
	protected final Multimap<tj, tj> c = HashMultimap.create();

	public tk a(tj tj) {
		return (tk)this.a.get(tj);
	}

	@Nullable
	public tk a(String string) {
		return (tk)this.b.get(string);
	}

	public tk b(tj tj) {
		if (this.b.containsKey(tj.a())) {
			throw new IllegalArgumentException("Attribute is already registered!");
		} else {
			tk tk3 = this.c(tj);
			this.b.put(tj.a(), tk3);
			this.a.put(tj, tk3);

			for (tj tj4 = tj.d(); tj4 != null; tj4 = tj4.d()) {
				this.c.put(tj4, tj);
			}

			return tk3;
		}
	}

	protected abstract tk c(tj tj);

	public Collection<tk> a() {
		return this.b.values();
	}

	public void a(tk tk) {
	}

	public void a(Multimap<String, tl> multimap) {
		for (Entry<String, tl> entry4 : multimap.entries()) {
			tk tk5 = this.a((String)entry4.getKey());
			if (tk5 != null) {
				tk5.c((tl)entry4.getValue());
			}
		}
	}

	public void b(Multimap<String, tl> multimap) {
		for (Entry<String, tl> entry4 : multimap.entries()) {
			tk tk5 = this.a((String)entry4.getKey());
			if (tk5 != null) {
				tk5.c((tl)entry4.getValue());
				tk5.b((tl)entry4.getValue());
			}
		}
	}
}
