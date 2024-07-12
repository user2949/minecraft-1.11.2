import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bzj {
	private static final Logger a = LogManager.getLogger();
	private final List<bzk> b = Lists.newArrayList();
	private final List<Integer> c = Lists.newArrayList();
	private int d;
	private int e = -1;
	private final List<Integer> f = Lists.newArrayList();
	private int g = -1;

	public bzj(bzj bzj) {
		this();

		for (int integer3 = 0; integer3 < bzj.i(); integer3++) {
			this.a(bzj.c(integer3));
		}

		this.d = bzj.g();
	}

	public bzj() {
	}

	public void a() {
		this.b.clear();
		this.c.clear();
		this.e = -1;
		this.f.clear();
		this.g = -1;
		this.d = 0;
	}

	public bzj a(bzk bzk) {
		if (bzk.f() && this.j()) {
			a.warn("VertexFormat error: Trying to add a position VertexFormatElement when one already exists, ignoring.");
			return this;
		} else {
			this.b.add(bzk);
			this.c.add(this.d);
			switch (bzk.b()) {
				case NORMAL:
					this.g = this.d;
					break;
				case COLOR:
					this.e = this.d;
					break;
				case UV:
					this.f.add(bzk.d(), this.d);
			}

			this.d = this.d + bzk.e();
			return this;
		}
	}

	public boolean b() {
		return this.g >= 0;
	}

	public int c() {
		return this.g;
	}

	public boolean d() {
		return this.e >= 0;
	}

	public int e() {
		return this.e;
	}

	public boolean a(int integer) {
		return this.f.size() - 1 >= integer;
	}

	public int b(int integer) {
		return (Integer)this.f.get(integer);
	}

	public String toString() {
		String string2 = "format: " + this.b.size() + " elements: ";

		for (int integer3 = 0; integer3 < this.b.size(); integer3++) {
			string2 = string2 + ((bzk)this.b.get(integer3)).toString();
			if (integer3 != this.b.size() - 1) {
				string2 = string2 + " ";
			}
		}

		return string2;
	}

	private boolean j() {
		int integer2 = 0;

		for (int integer3 = this.b.size(); integer2 < integer3; integer2++) {
			bzk bzk4 = (bzk)this.b.get(integer2);
			if (bzk4.f()) {
				return true;
			}
		}

		return false;
	}

	public int f() {
		return this.g() / 4;
	}

	public int g() {
		return this.d;
	}

	public List<bzk> h() {
		return this.b;
	}

	public int i() {
		return this.b.size();
	}

	public bzk c(int integer) {
		return (bzk)this.b.get(integer);
	}

	public int d(int integer) {
		return (Integer)this.c.get(integer);
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (object != null && this.getClass() == object.getClass()) {
			bzj bzj3 = (bzj)object;
			if (this.d != bzj3.d) {
				return false;
			} else {
				return !this.b.equals(bzj3.b) ? false : this.c.equals(bzj3.c);
			}
		} else {
			return false;
		}
	}

	public int hashCode() {
		int integer2 = this.b.hashCode();
		integer2 = 31 * integer2 + this.c.hashCode();
		return 31 * integer2 + this.d;
	}
}
