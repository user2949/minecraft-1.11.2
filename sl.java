import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class sl extends sn {
	private static final kk<Float> a = kn.a(sl.class, km.c);
	private static final kk<Integer> b = kn.a(sl.class, km.b);
	private static final kk<Boolean> c = kn.a(sl.class, km.h);
	private static final kk<Integer> d = kn.a(sl.class, km.b);
	private static final kk<Integer> e = kn.a(sl.class, km.b);
	private static final kk<Integer> f = kn.a(sl.class, km.b);
	private agy g = ahb.a;
	private final List<sh> h = Lists.newArrayList();
	private final Map<sn, Integer> at = Maps.newHashMap();
	private int au = 600;
	private int av = 20;
	private int aw = 20;
	private boolean ax;
	private int ay;
	private float az;
	private float aA;
	private sw aB;
	private UUID aC;

	public sl(ajs ajs) {
		super(ajs);
		this.Q = true;
		this.X = true;
		this.a(3.0F);
	}

	public sl(ajs ajs, double double2, double double3, double double4) {
		this(ajs);
		this.b(double2, double3, double4);
	}

	@Override
	protected void i() {
		this.R().a(b, 0);
		this.R().a(a, 0.5F);
		this.R().a(c, false);
		this.R().a(d, de.SPELL_MOB.c());
		this.R().a(e, 0);
		this.R().a(f, 0);
	}

	public void a(float float1) {
		double double3 = this.p;
		double double5 = this.q;
		double double7 = this.r;
		this.a(float1 * 2.0F, 0.5F);
		this.b(double3, double5, double7);
		if (!this.l.E) {
			this.R().b(a, float1);
		}
	}

	public float j() {
		return this.R().a(a);
	}

	public void a(agy agy) {
		this.g = agy;
		if (!this.ax) {
			this.C();
		}
	}

	private void C() {
		if (this.g == ahb.a && this.h.isEmpty()) {
			this.R().b(b, 0);
		} else {
			this.R().b(b, aha.a(aha.a(this.g, this.h)));
		}
	}

	public void a(sh sh) {
		this.h.add(sh);
		if (!this.ax) {
			this.C();
		}
	}

	public int k() {
		return this.R().a(b);
	}

	public void a(int integer) {
		this.ax = true;
		this.R().b(b, integer);
	}

	public de l() {
		return de.a(this.R().a(d));
	}

	public void a(de de) {
		this.R().b(d, de.c());
	}

	public int n() {
		return this.R().a(e);
	}

	public void b(int integer) {
		this.R().b(e, integer);
	}

	public int o() {
		return this.R().a(f);
	}

	public void d(int integer) {
		this.R().b(f, integer);
	}

	protected void a(boolean boolean1) {
		this.R().b(c, boolean1);
	}

	public boolean q() {
		return this.R().a(c);
	}

	public int r() {
		return this.au;
	}

	public void e(int integer) {
		this.au = integer;
	}

	@Override
	public void A_() {
		super.A_();
		boolean boolean2 = this.q();
		float float3 = this.j();
		if (this.l.E) {
			de de4 = this.l();
			int[] arr5 = new int[de4.d()];
			if (arr5.length > 0) {
				arr5[0] = this.n();
			}

			if (arr5.length > 1) {
				arr5[1] = this.o();
			}

			if (boolean2) {
				if (this.S.nextBoolean()) {
					for (int integer6 = 0; integer6 < 2; integer6++) {
						float float7 = this.S.nextFloat() * (float) (Math.PI * 2);
						float float8 = ot.c(this.S.nextFloat()) * 0.2F;
						float float9 = ot.b(float7) * float8;
						float float10 = ot.a(float7) * float8;
						if (de4 == de.SPELL_MOB) {
							int integer11 = this.S.nextBoolean() ? 16777215 : this.k();
							int integer12 = integer11 >> 16 & 0xFF;
							int integer13 = integer11 >> 8 & 0xFF;
							int integer14 = integer11 & 0xFF;
							this.l
								.a(
									de.SPELL_MOB.c(),
									this.p + (double)float9,
									this.q,
									this.r + (double)float10,
									(double)((float)integer12 / 255.0F),
									(double)((float)integer13 / 255.0F),
									(double)((float)integer14 / 255.0F)
								);
						} else {
							this.l.a(de4.c(), this.p + (double)float9, this.q, this.r + (double)float10, 0.0, 0.0, 0.0, arr5);
						}
					}
				}
			} else {
				float float6 = (float) Math.PI * float3 * float3;

				for (int integer7 = 0; (float)integer7 < float6; integer7++) {
					float float8 = this.S.nextFloat() * (float) (Math.PI * 2);
					float float9 = ot.c(this.S.nextFloat()) * float3;
					float float10 = ot.b(float8) * float9;
					float float11 = ot.a(float8) * float9;
					if (de4 == de.SPELL_MOB) {
						int integer12 = this.k();
						int integer13 = integer12 >> 16 & 0xFF;
						int integer14 = integer12 >> 8 & 0xFF;
						int integer15 = integer12 & 0xFF;
						this.l
							.a(
								de.SPELL_MOB.c(),
								this.p + (double)float10,
								this.q,
								this.r + (double)float11,
								(double)((float)integer13 / 255.0F),
								(double)((float)integer14 / 255.0F),
								(double)((float)integer15 / 255.0F)
							);
					} else {
						this.l
							.a(
								de4.c(),
								this.p + (double)float10,
								this.q,
								this.r + (double)float11,
								(0.5 - this.S.nextDouble()) * 0.15,
								0.01F,
								(0.5 - this.S.nextDouble()) * 0.15,
								arr5
							);
					}
				}
			}
		} else {
			if (this.T >= this.av + this.au) {
				this.T();
				return;
			}

			boolean boolean4 = this.T < this.av;
			if (boolean2 != boolean4) {
				this.a(boolean4);
			}

			if (boolean4) {
				return;
			}

			if (this.aA != 0.0F) {
				float3 += this.aA;
				if (float3 < 0.5F) {
					this.T();
					return;
				}

				this.a(float3);
			}

			if (this.T % 5 == 0) {
				Iterator<Entry<sn, Integer>> iterator5 = this.at.entrySet().iterator();

				while (iterator5.hasNext()) {
					Entry<sn, Integer> entry6 = (Entry<sn, Integer>)iterator5.next();
					if (this.T >= (Integer)entry6.getValue()) {
						iterator5.remove();
					}
				}

				List<sh> list5 = Lists.newArrayList();

				for (sh sh7 : this.g.a()) {
					list5.add(new sh(sh7.a(), sh7.b() / 4, sh7.c(), sh7.d(), sh7.e()));
				}

				list5.addAll(this.h);
				if (list5.isEmpty()) {
					this.at.clear();
				} else {
					List<sw> list6 = this.l.a(sw.class, this.bo());
					if (!list6.isEmpty()) {
						for (sw sw8 : list6) {
							if (!this.at.containsKey(sw8) && sw8.cJ()) {
								double double9 = sw8.p - this.p;
								double double11 = sw8.r - this.r;
								double double13 = double9 * double9 + double11 * double11;
								if (double13 <= (double)(float3 * float3)) {
									this.at.put(sw8, this.T + this.aw);

									for (sh sh16 : list5) {
										if (sh16.a().b()) {
											sh16.a().a(this, this.y(), sw8, sh16.c(), 0.5);
										} else {
											sw8.c(new sh(sh16));
										}
									}

									if (this.az != 0.0F) {
										float3 += this.az;
										if (float3 < 0.5F) {
											this.T();
											return;
										}

										this.a(float3);
									}

									if (this.ay != 0) {
										this.au = this.au + this.ay;
										if (this.au <= 0) {
											this.T();
											return;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void b(float float1) {
		this.az = float1;
	}

	public void c(float float1) {
		this.aA = float1;
	}

	public void g(int integer) {
		this.av = integer;
	}

	public void a(@Nullable sw sw) {
		this.aB = sw;
		this.aC = sw == null ? null : sw.be();
	}

	@Nullable
	public sw y() {
		if (this.aB == null && this.aC != null && this.l instanceof lw) {
			sn sn2 = ((lw)this.l).a(this.aC);
			if (sn2 instanceof sw) {
				this.aB = (sw)sn2;
			}
		}

		return this.aB;
	}

	@Override
	protected void a(du du) {
		this.T = du.h("Age");
		this.au = du.h("Duration");
		this.av = du.h("WaitTime");
		this.aw = du.h("ReapplicationDelay");
		this.ay = du.h("DurationOnUse");
		this.az = du.j("RadiusOnUse");
		this.aA = du.j("RadiusPerTick");
		this.a(du.j("Radius"));
		this.aC = du.a("OwnerUUID");
		if (du.b("Particle", 8)) {
			de de3 = de.a(du.l("Particle"));
			if (de3 != null) {
				this.a(de3);
				this.b(du.h("ParticleParam1"));
				this.d(du.h("ParticleParam2"));
			}
		}

		if (du.b("Color", 99)) {
			this.a(du.h("Color"));
		}

		if (du.b("Potion", 8)) {
			this.a(aha.c(du));
		}

		if (du.b("Effects", 9)) {
			ea ea3 = du.c("Effects", 10);
			this.h.clear();

			for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
				sh sh5 = sh.b(ea3.b(integer4));
				if (sh5 != null) {
					this.a(sh5);
				}
			}
		}
	}

	@Override
	protected void b(du du) {
		du.a("Age", this.T);
		du.a("Duration", this.au);
		du.a("WaitTime", this.av);
		du.a("ReapplicationDelay", this.aw);
		du.a("DurationOnUse", this.ay);
		du.a("RadiusOnUse", this.az);
		du.a("RadiusPerTick", this.aA);
		du.a("Radius", this.j());
		du.a("Particle", this.l().b());
		du.a("ParticleParam1", this.n());
		du.a("ParticleParam2", this.o());
		if (this.aC != null) {
			du.a("OwnerUUID", this.aC);
		}

		if (this.ax) {
			du.a("Color", this.k());
		}

		if (this.g != ahb.a && this.g != null) {
			du.a("Potion", agy.a.b(this.g).toString());
		}

		if (!this.h.isEmpty()) {
			ea ea3 = new ea();

			for (sh sh5 : this.h) {
				ea3.a(sh5.a(new du()));
			}

			du.a("Effects", ea3);
		}
	}

	@Override
	public void a(kk<?> kk) {
		if (a.equals(kk)) {
			this.a(this.j());
		}

		super.a(kk);
	}

	@Override
	public azv o_() {
		return azv.IGNORE;
	}
}
