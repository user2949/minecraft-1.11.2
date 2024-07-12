import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class uj {
	private static final Logger a = LogManager.getLogger();
	private final Set<uj.a> b = Sets.newLinkedHashSet();
	private final Set<uj.a> c = Sets.newLinkedHashSet();
	private final ou d;
	private int e;
	private int f = 3;
	private int g;

	public uj(ou ou) {
		this.d = ou;
	}

	public void a(int integer, ui ui) {
		this.b.add(new uj.a(integer, ui));
	}

	public void a(ui ui) {
		Iterator<uj.a> iterator3 = this.b.iterator();

		while (iterator3.hasNext()) {
			uj.a a4 = (uj.a)iterator3.next();
			ui ui5 = a4.a;
			if (ui5 == ui) {
				if (a4.c) {
					a4.c = false;
					a4.a.d();
					this.c.remove(a4);
				}

				iterator3.remove();
				return;
			}
		}
	}

	public void a() {
		this.d.a("goalSetup");
		if (this.e++ % this.f == 0) {
			for (uj.a a3 : this.b) {
				if (a3.c) {
					if (!this.b(a3) || !this.a(a3)) {
						a3.c = false;
						a3.a.d();
						this.c.remove(a3);
					}
				} else if (this.b(a3) && a3.a.a()) {
					a3.c = true;
					a3.a.c();
					this.c.add(a3);
				}
			}
		} else {
			Iterator<uj.a> iterator2 = this.c.iterator();

			while (iterator2.hasNext()) {
				uj.a a3x = (uj.a)iterator2.next();
				if (!this.a(a3x)) {
					a3x.c = false;
					a3x.a.d();
					iterator2.remove();
				}
			}
		}

		this.d.b();
		if (!this.c.isEmpty()) {
			this.d.a("goalTick");

			for (uj.a a3x : this.c) {
				a3x.a.e();
			}

			this.d.b();
		}
	}

	private boolean a(uj.a a) {
		return a.a.b();
	}

	private boolean b(uj.a a) {
		if (this.c.isEmpty()) {
			return true;
		} else if (this.b(a.a.h())) {
			return false;
		} else {
			for (uj.a a4 : this.c) {
				if (a4 != a) {
					if (a.b >= a4.b) {
						if (!this.a(a, a4)) {
							return false;
						}
					} else if (!a4.a.g()) {
						return false;
					}
				}
			}

			return true;
		}
	}

	private boolean a(uj.a a1, uj.a a2) {
		return (a1.a.h() & a2.a.h()) == 0;
	}

	public boolean b(int integer) {
		return (this.g & integer) > 0;
	}

	public void c(int integer) {
		this.g |= integer;
	}

	public void d(int integer) {
		this.g &= ~integer;
	}

	public void a(int integer, boolean boolean2) {
		if (boolean2) {
			this.d(integer);
		} else {
			this.c(integer);
		}
	}

	class a {
		public final ui a;
		public final int b;
		public boolean c;

		public a(int integer, ui ui) {
			this.b = integer;
			this.a = ui;
		}

		public boolean equals(@Nullable Object object) {
			if (this == object) {
				return true;
			} else {
				return object != null && this.getClass() == object.getClass() ? this.a.equals(((uj.a)object).a) : false;
			}
		}

		public int hashCode() {
			return this.a.hashCode();
		}
	}
}
