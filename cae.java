import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class cae implements bzw {
	private static final Logger a = LogManager.getLogger();
	private static final Joiner b = Joiner.on(", ");
	private final Map<String, bzr> c = Maps.newHashMap();
	private final List<bzz> d = Lists.newArrayList();
	private final Set<String> e = Sets.newLinkedHashSet();
	private final cap f;

	public cae(cap cap) {
		this.f = cap;
	}

	public void a(caa caa) {
		for (String string4 : caa.c()) {
			this.e.add(string4);
			bzr bzr5 = (bzr)this.c.get(string4);
			if (bzr5 == null) {
				bzr5 = new bzr(this.f);
				this.c.put(string4, bzr5);
			}

			bzr5.a(caa);
		}
	}

	@Override
	public Set<String> a() {
		return this.e;
	}

	@Override
	public bzx a(kq kq) throws IOException {
		bzy bzy3 = (bzy)this.c.get(kq.b());
		if (bzy3 != null) {
			return bzy3.a(kq);
		} else {
			throw new FileNotFoundException(kq.toString());
		}
	}

	@Override
	public List<bzx> b(kq kq) throws IOException {
		bzy bzy3 = (bzy)this.c.get(kq.b());
		if (bzy3 != null) {
			return bzy3.b(kq);
		} else {
			throw new FileNotFoundException(kq.toString());
		}
	}

	private void b() {
		this.c.clear();
		this.e.clear();
	}

	@Override
	public void a(List<caa> list) {
		this.b();
		a.info("Reloading ResourceManager: {}", new Object[]{b.join(Iterables.transform(list, new Function<caa, String>() {
			public String apply(@Nullable caa caa) {
				return caa == null ? "<NULL>" : caa.b();
			}
		}))});

		for (caa caa4 : list) {
			this.a(caa4);
		}

		this.c();
	}

	@Override
	public void a(bzz bzz) {
		this.d.add(bzz);
		bzz.a(this);
	}

	private void c() {
		for (bzz bzz3 : this.d) {
			bzz3.a(this);
		}
	}
}
