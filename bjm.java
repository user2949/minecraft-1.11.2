import com.google.common.collect.Lists;
import java.io.File;
import java.util.Collections;
import java.util.List;

public class bjm extends bho {
	private final bho a;
	private List<bjn> f;
	private List<bjn> g;
	private bjs h;
	private bju i;
	private boolean r;

	public bjm(bho bho) {
		this.a = bho;
	}

	@Override
	public void b() {
		this.n.add(new bfz(2, this.l / 2 - 154, this.m - 48, cah.a("resourcePack.openFolder")));
		this.n.add(new bfz(1, this.l / 2 + 4, this.m - 48, cah.a("gui.done")));
		if (!this.r) {
			this.f = Lists.newArrayList();
			this.g = Lists.newArrayList();
			cad cad2 = this.j.P();
			cad2.b();
			List<cad.a> list3 = Lists.newArrayList(cad2.d());
			list3.removeAll(cad2.e());

			for (cad.a a5 : list3) {
				this.f.add(new bjp(this, a5));
			}

			cad.a a4 = cad2.c();
			if (a4 != null) {
				this.g.add(new bjq(this, cad2.g()));
			}

			for (cad.a a6 : Lists.reverse(cad2.e())) {
				this.g.add(new bjp(this, a6));
			}

			this.g.add(new bjo(this));
		}

		this.h = new bjs(this.j, 200, this.m, this.f);
		this.h.i(this.l / 2 - 4 - 200);
		this.h.d(7, 8);
		this.i = new bju(this.j, 200, this.m, this.g);
		this.i.i(this.l / 2 + 4);
		this.i.d(7, 8);
	}

	@Override
	public void k() {
		super.k();
		this.i.p();
		this.h.p();
	}

	public boolean a(bjn bjn) {
		return this.g.contains(bjn);
	}

	public List<bjn> b(bjn bjn) {
		return this.a(bjn) ? this.g : this.f;
	}

	public List<bjn> a() {
		return this.f;
	}

	public List<bjn> f() {
		return this.g;
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			if (bfm.k == 2) {
				File file3 = this.j.P().f();
				cdb.a(file3);
			} else if (bfm.k == 1) {
				if (this.r) {
					List<cad.a> list3 = Lists.newArrayList();

					for (bjn bjn5 : this.g) {
						if (bjn5 instanceof bjp) {
							list3.add(((bjp)bjn5).k());
						}
					}

					Collections.reverse(list3);
					this.j.P().a(list3);
					this.j.u.l.clear();
					this.j.u.m.clear();

					for (cad.a a5 : list3) {
						this.j.u.l.add(a5.d());
						if (a5.f() != 3) {
							this.j.u.m.add(a5.d());
						}
					}

					this.j.u.b();
					this.j.f();
				}

				this.j.a(this.a);
			}
		}
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		super.a(integer1, integer2, integer3);
		this.h.b(integer1, integer2, integer3);
		this.i.b(integer1, integer2, integer3);
	}

	@Override
	protected void b(int integer1, int integer2, int integer3) {
		super.b(integer1, integer2, integer3);
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c(0);
		this.h.a(integer1, integer2, float3);
		this.i.a(integer1, integer2, float3);
		this.a(this.q, cah.a("resourcePack.title"), this.l / 2, 16, 16777215);
		this.a(this.q, cah.a("resourcePack.folderInfo"), this.l / 2 - 77, this.m - 26, 8421504);
		super.a(integer1, integer2, float3);
	}

	public void g() {
		this.r = true;
	}
}
