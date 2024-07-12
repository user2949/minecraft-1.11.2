import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class avk {
	private static final Logger a = LogManager.getLogger();
	private static final Predicate<ly> b = Predicates.and(sr.a, sr.a(0.0, 128.0, 0.0, 192.0));
	private final lu c = (lu)new lu(new fi("entity.EnderDragon.name"), ra.a.PINK, ra.b.PROGRESS).b(true).c(true);
	private final lw d;
	private final List<Integer> e = Lists.newArrayList();
	private final atp f;
	private int g;
	private int h;
	private int i;
	private int j;
	private boolean k;
	private boolean l;
	private UUID m;
	private boolean n = true;
	private co o;
	private avj p;
	private int q;
	private List<ya> r;

	public avk(lw lw, du du) {
		this.d = lw;
		if (du.b("DragonKilled", 99)) {
			if (du.b("DragonUUID")) {
				this.m = du.a("DragonUUID");
			}

			this.k = du.p("DragonKilled");
			this.l = du.p("PreviouslyKilled");
			if (du.p("IsRespawning")) {
				this.p = avj.START;
			}

			if (du.b("ExitPortalLocation", 10)) {
				this.o = ee.c(du.o("ExitPortalLocation"));
			}
		} else {
			this.k = true;
			this.l = true;
		}

		if (du.b("Gateways", 9)) {
			ea ea4 = du.c("Gateways", 3);

			for (int integer5 = 0; integer5 < ea4.c(); integer5++) {
				this.e.add(ea4.c(integer5));
			}
		} else {
			this.e.addAll(ContiguousSet.create(Range.closedOpen(0, 20), DiscreteDomain.integers()));
			Collections.shuffle(this.e, new Random(lw.O()));
		}

		this.f = atq.a()
			.a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
			.a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
			.a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
			.a("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ")
			.a("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ")
			.a('#', ato.a(att.a(alv.h)))
			.b();
	}

	public du a() {
		du du2 = new du();
		if (this.m != null) {
			du2.a("DragonUUID", this.m);
		}

		du2.a("DragonKilled", this.k);
		du2.a("PreviouslyKilled", this.l);
		if (this.o != null) {
			du2.a("ExitPortalLocation", ee.a(this.o));
		}

		ea ea3 = new ea();

		for (int integer5 : this.e) {
			ea3.a(new dz(integer5));
		}

		du2.a("Gateways", ea3);
		return du2;
	}

	public void b() {
		this.c.d(!this.k);
		if (++this.j >= 20) {
			this.j();
			this.j = 0;
		}

		if (!this.c.c().isEmpty()) {
			if (this.n) {
				a.info("Scanning for legacy world dragon fight...");
				this.i();
				this.n = false;
				boolean boolean2 = this.g();
				if (boolean2) {
					a.info("Found that the dragon has been killed in this world already.");
					this.l = true;
				} else {
					a.info("Found that the dragon has not yet been killed in this world.");
					this.l = false;
					this.a(false);
				}

				List<yb> list3 = this.d.a(yb.class, sr.a);
				if (list3.isEmpty()) {
					this.k = true;
				} else {
					yb yb4 = (yb)list3.get(0);
					this.m = yb4.be();
					a.info("Found that there's a dragon still alive ({})", new Object[]{yb4});
					this.k = false;
					if (!boolean2) {
						a.info("But we didn't have a portal, let's remove it.");
						yb4.T();
						this.m = null;
					}
				}

				if (!this.l && this.k) {
					this.k = false;
				}
			}

			if (this.p != null) {
				if (this.r == null) {
					this.p = null;
					this.e();
				}

				this.p.a(this.d, this, this.r, this.q++, this.o);
			}

			if (!this.k) {
				if (this.m == null || ++this.g >= 1200) {
					this.i();
					List<yb> list2 = this.d.a(yb.class, sr.a);
					if (list2.isEmpty()) {
						a.debug("Haven't seen the dragon, respawning it");
						this.m();
					} else {
						a.debug("Haven't seen our dragon, but found another one to use.");
						this.m = ((yb)list2.get(0)).be();
					}

					this.g = 0;
				}

				if (++this.i >= 100) {
					this.k();
					this.i = 0;
				}
			}
		}
	}

	protected void a(avj avj) {
		if (this.p == null) {
			throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
		} else {
			this.q = 0;
			if (avj == avj.END) {
				this.p = null;
				this.k = false;
				this.m();
			} else {
				this.p = avj;
			}
		}
	}

	private boolean g() {
		for (int integer2 = -8; integer2 <= 8; integer2++) {
			for (int integer3 = -8; integer3 <= 8; integer3++) {
				auo auo4 = this.d.a(integer2, integer3);

				for (asc asc6 : auo4.s().values()) {
					if (asc6 instanceof asz) {
						return true;
					}
				}
			}
		}

		return false;
	}

	@Nullable
	private atp.b h() {
		for (int integer2 = -8; integer2 <= 8; integer2++) {
			for (int integer3 = -8; integer3 <= 8; integer3++) {
				auo auo4 = this.d.a(integer2, integer3);

				for (asc asc6 : auo4.s().values()) {
					if (asc6 instanceof asz) {
						atp.b b7 = this.f.a(this.d, asc6.w());
						if (b7 != null) {
							co co8 = b7.a(3, 3, 3).d();
							if (this.o == null && co8.p() == 0 && co8.r() == 0) {
								this.o = co8;
							}

							return b7;
						}
					}
				}
			}
		}

		int integer2 = this.d.l(awm.a).q();

		for (int integer3 = integer2; integer3 >= 0; integer3--) {
			atp.b b4 = this.f.a(this.d, new co(awm.a.p(), integer3, awm.a.r()));
			if (b4 != null) {
				if (this.o == null) {
					this.o = b4.a(3, 3, 3).d();
				}

				return b4;
			}
		}

		return null;
	}

	private void i() {
		for (int integer2 = -8; integer2 <= 8; integer2++) {
			for (int integer3 = -8; integer3 <= 8; integer3++) {
				this.d.a(integer2, integer3);
			}
		}
	}

	private void j() {
		Set<ly> set2 = Sets.newHashSet();

		for (ly ly4 : this.d.b(ly.class, b)) {
			this.c.a(ly4);
			set2.add(ly4);
		}

		Set<ly> set3 = Sets.newHashSet(this.c.c());
		set3.removeAll(set2);

		for (ly ly5 : set3) {
			this.c.b(ly5);
		}
	}

	private void k() {
		this.i = 0;
		this.h = 0;

		for (axl.a a5 : alg.a(this.d)) {
			this.h = this.h + this.d.a(ya.class, a5.f()).size();
		}

		a.debug("Found {} end crystals still alive", new Object[]{this.h});
	}

	public void a(yb yb) {
		if (yb.be().equals(this.m)) {
			this.c.a(0.0F);
			this.c.d(false);
			this.a(true);
			this.l();
			if (!this.l) {
				this.d.a(this.d.l(awm.a), alv.bI.t());
			}

			this.l = true;
			this.k = true;
		}
	}

	private void l() {
		if (!this.e.isEmpty()) {
			int integer2 = (Integer)this.e.remove(this.e.size() - 1);
			int integer3 = (int)(96.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 20) * (double)integer2)));
			int integer4 = (int)(96.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 20) * (double)integer2)));
			this.a(new co(integer3, 75, integer4));
		}
	}

	private void a(co co) {
		this.d.b(3000, co, 0);
		new awk().b(this.d, new Random(), co);
	}

	private void a(boolean boolean1) {
		awm awm3 = new awm(boolean1);
		if (this.o == null) {
			this.o = this.d.q(awm.a).b();

			while (this.d.o(this.o).v() == alv.h && this.o.q() > this.d.K()) {
				this.o = this.o.b();
			}
		}

		awm3.b(this.d, new Random(), this.o);
	}

	private void m() {
		this.d.f(new co(0, 128, 0));
		yb yb2 = new yb(this.d);
		yb2.da().a(yr.a);
		yb2.b(0.0, 128.0, 0.0, this.d.r.nextFloat() * 360.0F, 0.0F);
		this.d.a(yb2);
		this.m = yb2.be();
	}

	public void b(yb yb) {
		if (yb.be().equals(this.m)) {
			this.c.a(yb.bU() / yb.cb());
			this.g = 0;
			if (yb.n_()) {
				this.c.a(yb.i_());
			}
		}
	}

	public int c() {
		return this.h;
	}

	public void a(ya ya, ry ry) {
		if (this.p != null && this.r.contains(ya)) {
			a.debug("Aborting respawn sequence");
			this.p = null;
			this.q = 0;
			this.f();
			this.a(true);
		} else {
			this.k();
			sn sn4 = this.d.a(this.m);
			if (sn4 instanceof yb) {
				((yb)sn4).a(ya, new co(ya), ry);
			}
		}
	}

	public boolean d() {
		return this.l;
	}

	public void e() {
		if (this.k && this.p == null) {
			co co2 = this.o;
			if (co2 == null) {
				a.debug("Tried to respawn, but need to find the portal first.");
				atp.b b3 = this.h();
				if (b3 == null) {
					a.debug("Couldn't find a portal, so we made one.");
					this.a(true);
				} else {
					a.debug("Found the exit portal & temporarily using it.");
				}

				co2 = this.o;
			}

			List<ya> list3 = Lists.newArrayList();
			co co4 = co2.b(1);

			for (cv cv6 : cv.c.HORIZONTAL) {
				List<ya> list7 = this.d.a(ya.class, new bdt(co4.a(cv6, 2)));
				if (list7.isEmpty()) {
					return;
				}

				list3.addAll(list7);
			}

			a.debug("Found all crystals, respawning dragon.");
			this.a(list3);
		}
	}

	private void a(List<ya> list) {
		if (this.k && this.p == null) {
			for (atp.b b3 = this.h(); b3 != null; b3 = this.h()) {
				for (int integer4 = 0; integer4 < this.f.c(); integer4++) {
					for (int integer5 = 0; integer5 < this.f.b(); integer5++) {
						for (int integer6 = 0; integer6 < this.f.a(); integer6++) {
							ato ato7 = b3.a(integer4, integer5, integer6);
							if (ato7.a().v() == alv.h || ato7.a().v() == alv.bF) {
								this.d.a(ato7.d(), alv.bH.t());
							}
						}
					}
				}
			}

			this.p = avj.START;
			this.q = 0;
			this.a(false);
			this.r = list;
		}
	}

	public void f() {
		for (axl.a a5 : alg.a(this.d)) {
			for (ya ya8 : this.d.a(ya.class, a5.f())) {
				ya8.i(false);
				ya8.a(null);
			}
		}
	}
}
