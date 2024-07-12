import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class wr extends bbl {
	private ajs b;
	private final List<co> c = Lists.newArrayList();
	private final List<wo> d = Lists.newArrayList();
	private final List<wp> e = Lists.newArrayList();
	private int f;

	public wr(String string) {
		super(string);
	}

	public wr(ajs ajs) {
		super(a(ajs.s));
		this.b = ajs;
		this.c();
	}

	public void a(ajs ajs) {
		this.b = ajs;

		for (wp wp4 : this.e) {
			wp4.a(ajs);
		}
	}

	public void a(co co) {
		if (this.c.size() <= 64) {
			if (!this.e(co)) {
				this.c.add(co);
			}
		}
	}

	public void a() {
		this.f++;

		for (wp wp3 : this.e) {
			wp3.a(this.f);
		}

		this.e();
		this.f();
		this.g();
		if (this.f % 400 == 0) {
			this.c();
		}
	}

	private void e() {
		Iterator<wp> iterator2 = this.e.iterator();

		while (iterator2.hasNext()) {
			wp wp3 = (wp)iterator2.next();
			if (wp3.g()) {
				iterator2.remove();
				this.c();
			}
		}
	}

	public List<wp> b() {
		return this.e;
	}

	public wp a(co co, int integer) {
		wp wp4 = null;
		double double5 = Float.MAX_VALUE;

		for (wp wp8 : this.e) {
			double double9 = wp8.a().n(co);
			if (!(double9 >= double5)) {
				float float11 = (float)(integer + wp8.b());
				if (!(double9 > (double)(float11 * float11))) {
					wp4 = wp8;
					double5 = double9;
				}
			}
		}

		return wp4;
	}

	private void f() {
		if (!this.c.isEmpty()) {
			this.b((co)this.c.remove(0));
		}
	}

	private void g() {
		for (int integer2 = 0; integer2 < this.d.size(); integer2++) {
			wo wo3 = (wo)this.d.get(integer2);
			wp wp4 = this.a(wo3.d(), 32);
			if (wp4 == null) {
				wp4 = new wp(this.b);
				this.e.add(wp4);
				this.c();
			}

			wp4.a(wo3);
		}

		this.d.clear();
	}

	private void b(co co) {
		int integer3 = 16;
		int integer4 = 4;
		int integer5 = 16;

		for (int integer6 = -16; integer6 < 16; integer6++) {
			for (int integer7 = -4; integer7 < 4; integer7++) {
				for (int integer8 = -16; integer8 < 16; integer8++) {
					co co9 = co.a(integer6, integer7, integer8);
					if (this.f(co9)) {
						wo wo10 = this.c(co9);
						if (wo10 == null) {
							this.d(co9);
						} else {
							wo10.a(this.f);
						}
					}
				}
			}
		}
	}

	@Nullable
	private wo c(co co) {
		for (wo wo4 : this.d) {
			if (wo4.d().p() == co.p() && wo4.d().r() == co.r() && Math.abs(wo4.d().q() - co.q()) <= 1) {
				return wo4;
			}
		}

		for (wp wp4 : this.e) {
			wo wo5 = wp4.e(co);
			if (wo5 != null) {
				return wo5;
			}
		}

		return null;
	}

	private void d(co co) {
		cv cv3 = amx.f(this.b, co);
		cv cv4 = cv3.d();
		int integer5 = this.a(co, cv3, 5);
		int integer6 = this.a(co, cv4, integer5 + 1);
		if (integer5 != integer6) {
			this.d.add(new wo(co, integer5 < integer6 ? cv3 : cv4, this.f));
		}
	}

	private int a(co co, cv cv, int integer) {
		int integer5 = 0;

		for (int integer6 = 1; integer6 <= 5; integer6++) {
			if (this.b.h(co.a(cv, integer6))) {
				if (++integer5 >= integer) {
					return integer5;
				}
			}
		}

		return integer5;
	}

	private boolean e(co co) {
		for (co co4 : this.c) {
			if (co4.equals(co)) {
				return true;
			}
		}

		return false;
	}

	private boolean f(co co) {
		atl atl3 = this.b.o(co);
		alu alu4 = atl3.v();
		return alu4 instanceof amx ? atl3.a() == azs.d : false;
	}

	@Override
	public void a(du du) {
		this.f = du.h("Tick");
		ea ea3 = du.c("Villages", 10);

		for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
			du du5 = ea3.b(integer4);
			wp wp6 = new wp();
			wp6.a(du5);
			this.e.add(wp6);
		}
	}

	@Override
	public du b(du du) {
		du.a("Tick", this.f);
		ea ea3 = new ea();

		for (wp wp5 : this.e) {
			du du6 = new du();
			wp5.b(du6);
			ea3.a(du6);
		}

		du.a("Villages", ea3);
		return du;
	}

	public static String a(avf avf) {
		return "villages" + avf.q().c();
	}
}
