import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class arz extends asc implements rp {
	private String a;
	private aem f = aem.BLACK;
	private ea g;
	private boolean h;
	private List<asa> i;
	private List<aem> j;
	private String k;

	public void a(afj afj, boolean boolean2) {
		this.g = null;
		du du4 = afj.d("BlockEntityTag");
		if (du4 != null && du4.b("Patterns", 9)) {
			this.g = du4.c("Patterns", 10).d();
		}

		this.f = boolean2 ? d(afj) : adt.c(afj);
		this.i = null;
		this.j = null;
		this.k = "";
		this.h = true;
		this.a = afj.t() ? afj.r() : null;
	}

	@Override
	public String h_() {
		return this.n_() ? this.a : "banner";
	}

	@Override
	public boolean n_() {
		return this.a != null && !this.a.isEmpty();
	}

	@Override
	public fb i_() {
		return (fb)(this.n_() ? new fh(this.h_()) : new fi(this.h_()));
	}

	@Override
	public du b(du du) {
		super.b(du);
		du.a("Base", this.f.b());
		if (this.g != null) {
			du.a("Patterns", this.g);
		}

		if (this.n_()) {
			du.a("CustomName", this.a);
		}

		return du;
	}

	@Override
	public void a(du du) {
		super.a(du);
		if (du.b("CustomName", 8)) {
			this.a = du.l("CustomName");
		}

		this.f = aem.a(du.h("Base"));
		this.g = du.c("Patterns", 10);
		this.i = null;
		this.j = null;
		this.k = null;
		this.h = true;
	}

	@Nullable
	@Override
	public fz c() {
		return new fz(this.c, 6, this.d());
	}

	@Override
	public du d() {
		return this.b(new du());
	}

	public static int b(afj afj) {
		du du2 = afj.d("BlockEntityTag");
		return du2 != null && du2.e("Patterns") ? du2.c("Patterns", 10).c() : 0;
	}

	public List<asa> h() {
		this.m();
		return this.i;
	}

	public List<aem> j() {
		this.m();
		return this.j;
	}

	public String k() {
		this.m();
		return this.k;
	}

	private void m() {
		if (this.i == null || this.j == null || this.k == null) {
			if (!this.h) {
				this.k = "";
			} else {
				this.i = Lists.newArrayList();
				this.j = Lists.newArrayList();
				this.i.add(asa.BASE);
				this.j.add(this.f);
				this.k = "b" + this.f.b();
				if (this.g != null) {
					for (int integer2 = 0; integer2 < this.g.c(); integer2++) {
						du du3 = this.g.b(integer2);
						asa asa4 = asa.a(du3.l("Pattern"));
						if (asa4 != null) {
							this.i.add(asa4);
							int integer5 = du3.h("Color");
							this.j.add(aem.a(integer5));
							this.k = this.k + asa4.b() + integer5;
						}
					}
				}
			}
		}
	}

	public static void c(afj afj) {
		du du2 = afj.d("BlockEntityTag");
		if (du2 != null && du2.b("Patterns", 9)) {
			ea ea3 = du2.c("Patterns", 10);
			if (!ea3.b_()) {
				ea3.a(ea3.c() - 1);
				if (ea3.b_()) {
					afj.p().q("BlockEntityTag");
					if (afj.p().b_()) {
						afj.b(null);
					}
				}
			}
		}
	}

	public afj l() {
		afj afj2 = adt.a(this.f, this.g);
		if (this.n_()) {
			afj2.g(this.h_());
		}

		return afj2;
	}

	public static aem d(afj afj) {
		du du2 = afj.d("BlockEntityTag");
		return du2 != null && du2.e("Base") ? aem.a(du2.h("Base")) : aem.BLACK;
	}
}
