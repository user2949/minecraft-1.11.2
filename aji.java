import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public abstract class aji {
	private int a = 20;
	private final List<akc> b = Lists.newArrayList();
	private akc c = new akc();
	private double d;
	private double e;
	private int f = 200;
	private int g = 800;
	private int h = 4;
	private sn i;
	private int j = 6;
	private int k = 16;
	private int l = 4;

	@Nullable
	private kq g() {
		String string2 = this.c.b().l("id");
		return oy.b(string2) ? null : new kq(string2);
	}

	public void a(@Nullable kq kq) {
		if (kq != null) {
			this.c.b().a("id", kq.toString());
		}
	}

	private boolean h() {
		co co2 = this.b();
		return this.a().a((double)co2.p() + 0.5, (double)co2.q() + 0.5, (double)co2.r() + 0.5, (double)this.k);
	}

	public void c() {
		if (!this.h()) {
			this.e = this.d;
		} else {
			co co2 = this.b();
			if (this.a().E) {
				double double3 = (double)((float)co2.p() + this.a().r.nextFloat());
				double double5 = (double)((float)co2.q() + this.a().r.nextFloat());
				double double7 = (double)((float)co2.r() + this.a().r.nextFloat());
				this.a().a(de.SMOKE_NORMAL, double3, double5, double7, 0.0, 0.0, 0.0);
				this.a().a(de.FLAME, double3, double5, double7, 0.0, 0.0, 0.0);
				if (this.a > 0) {
					this.a--;
				}

				this.e = this.d;
				this.d = (this.d + (double)(1000.0F / ((float)this.a + 200.0F))) % 360.0;
			} else {
				if (this.a == -1) {
					this.i();
				}

				if (this.a > 0) {
					this.a--;
					return;
				}

				boolean boolean3 = false;

				for (int integer4 = 0; integer4 < this.h; integer4++) {
					du du5 = this.c.b();
					ea ea6 = du5.c("Pos", 6);
					ajs ajs7 = this.a();
					int integer8 = ea6.c();
					double double9 = integer8 >= 1 ? ea6.e(0) : (double)co2.p() + (ajs7.r.nextDouble() - ajs7.r.nextDouble()) * (double)this.l + 0.5;
					double double11 = integer8 >= 2 ? ea6.e(1) : (double)(co2.q() + ajs7.r.nextInt(3) - 1);
					double double13 = integer8 >= 3 ? ea6.e(2) : (double)co2.r() + (ajs7.r.nextDouble() - ajs7.r.nextDouble()) * (double)this.l + 0.5;
					sn sn15 = avd.a(du5, ajs7, double9, double11, double13, false);
					if (sn15 == null) {
						return;
					}

					int integer16 = ajs7.a(
							sn15.getClass(),
							new bdt((double)co2.p(), (double)co2.q(), (double)co2.r(), (double)(co2.p() + 1), (double)(co2.q() + 1), (double)(co2.r() + 1)).g((double)this.l)
						)
						.size();
					if (integer16 >= this.j) {
						this.i();
						return;
					}

					sx sx17 = sn15 instanceof sx ? (sx)sn15 : null;
					sn15.b(sn15.p, sn15.q, sn15.r, ajs7.r.nextFloat() * 360.0F, 0.0F);
					if (sx17 == null || sx17.cM() && sx17.cN()) {
						if (this.c.b().d() == 1 && this.c.b().b("id", 8) && sn15 instanceof sx) {
							((sx)sn15).a(ajs7.D(new co(sn15)), null);
						}

						avd.a(sn15, ajs7);
						ajs7.b(2004, co2, 0);
						if (sx17 != null) {
							sx17.E();
						}

						boolean3 = true;
					}
				}

				if (boolean3) {
					this.i();
				}
			}
		}
	}

	private void i() {
		if (this.g <= this.f) {
			this.a = this.f;
		} else {
			this.a = this.f + this.a().r.nextInt(this.g - this.f);
		}

		if (!this.b.isEmpty()) {
			this.a(pb.a(this.a().r, this.b));
		}

		this.a(1);
	}

	public void a(du du) {
		this.a = du.g("Delay");
		this.b.clear();
		if (du.b("SpawnPotentials", 9)) {
			ea ea3 = du.c("SpawnPotentials", 10);

			for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
				this.b.add(new akc(ea3.b(integer4)));
			}
		}

		if (du.b("SpawnData", 10)) {
			this.a(new akc(1, du.o("SpawnData")));
		} else if (!this.b.isEmpty()) {
			this.a(pb.a(this.a().r, this.b));
		}

		if (du.b("MinSpawnDelay", 99)) {
			this.f = du.g("MinSpawnDelay");
			this.g = du.g("MaxSpawnDelay");
			this.h = du.g("SpawnCount");
		}

		if (du.b("MaxNearbyEntities", 99)) {
			this.j = du.g("MaxNearbyEntities");
			this.k = du.g("RequiredPlayerRange");
		}

		if (du.b("SpawnRange", 99)) {
			this.l = du.g("SpawnRange");
		}

		if (this.a() != null) {
			this.i = null;
		}
	}

	public du b(du du) {
		kq kq3 = this.g();
		if (kq3 == null) {
			return du;
		} else {
			du.a("Delay", (short)this.a);
			du.a("MinSpawnDelay", (short)this.f);
			du.a("MaxSpawnDelay", (short)this.g);
			du.a("SpawnCount", (short)this.h);
			du.a("MaxNearbyEntities", (short)this.j);
			du.a("RequiredPlayerRange", (short)this.k);
			du.a("SpawnRange", (short)this.l);
			du.a("SpawnData", this.c.b().g());
			ea ea4 = new ea();
			if (this.b.isEmpty()) {
				ea4.a(this.c.a());
			} else {
				for (akc akc6 : this.b) {
					ea4.a(akc6.a());
				}
			}

			du.a("SpawnPotentials", ea4);
			return du;
		}
	}

	public sn d() {
		if (this.i == null) {
			this.i = avd.a(this.c.b(), this.a(), false);
			if (this.c.b().d() == 1 && this.c.b().b("id", 8) && this.i instanceof sx) {
				((sx)this.i).a(this.a().D(new co(this.i)), null);
			}
		}

		return this.i;
	}

	public boolean b(int integer) {
		if (integer == 1 && this.a().E) {
			this.a = this.f;
			return true;
		} else {
			return false;
		}
	}

	public void a(akc akc) {
		this.c = akc;
	}

	public abstract void a(int integer);

	public abstract ajs a();

	public abstract co b();

	public double e() {
		return this.d;
	}

	public double f() {
		return this.e;
	}
}
