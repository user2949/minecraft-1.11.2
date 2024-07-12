import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class lu extends ra {
	private final Set<ly> h = Sets.newHashSet();
	private final Set<ly> i = Collections.unmodifiableSet(this.h);
	private boolean j = true;

	public lu(fb fb, ra.a a, ra.b b) {
		super(ot.a(), fb, a, b);
	}

	@Override
	public void a(float float1) {
		if (float1 != this.b) {
			super.a(float1);
			this.a(gc.a.UPDATE_PCT);
		}
	}

	@Override
	public void a(ra.a a) {
		if (a != this.c) {
			super.a(a);
			this.a(gc.a.UPDATE_STYLE);
		}
	}

	@Override
	public void a(ra.b b) {
		if (b != this.d) {
			super.a(b);
			this.a(gc.a.UPDATE_STYLE);
		}
	}

	@Override
	public ra a(boolean boolean1) {
		if (boolean1 != this.e) {
			super.a(boolean1);
			this.a(gc.a.UPDATE_PROPERTIES);
		}

		return this;
	}

	@Override
	public ra b(boolean boolean1) {
		if (boolean1 != this.f) {
			super.b(boolean1);
			this.a(gc.a.UPDATE_PROPERTIES);
		}

		return this;
	}

	@Override
	public ra c(boolean boolean1) {
		if (boolean1 != this.g) {
			super.c(boolean1);
			this.a(gc.a.UPDATE_PROPERTIES);
		}

		return this;
	}

	@Override
	public void a(fb fb) {
		if (!Objects.equal(fb, this.a)) {
			super.a(fb);
			this.a(gc.a.UPDATE_NAME);
		}
	}

	private void a(gc.a a) {
		if (this.j) {
			gc gc3 = new gc(a, this);

			for (ly ly5 : this.h) {
				ly5.a.a(gc3);
			}
		}
	}

	public void a(ly ly) {
		if (this.h.add(ly) && this.j) {
			ly.a.a(new gc(gc.a.ADD, this));
		}
	}

	public void b(ly ly) {
		if (this.h.remove(ly) && this.j) {
			ly.a.a(new gc(gc.a.REMOVE, this));
		}
	}

	public void d(boolean boolean1) {
		if (boolean1 != this.j) {
			this.j = boolean1;

			for (ly ly4 : this.h) {
				ly4.a.a(new gc(boolean1 ? gc.a.ADD : gc.a.REMOVE, this));
			}
		}
	}

	public Collection<ly> c() {
		return this.i;
	}
}
