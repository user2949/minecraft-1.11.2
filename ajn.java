import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;

public class ajn {
	private final boolean a;
	private final boolean b;
	private final Random c = new Random();
	private final ajs d;
	private final double e;
	private final double f;
	private final double g;
	private final sn h;
	private final float i;
	private final List<co> j = Lists.newArrayList();
	private final Map<aay, bdw> k = Maps.newHashMap();

	public ajn(ajs ajs, sn sn, double double3, double double4, double double5, float float6, List<co> list) {
		this(ajs, sn, double3, double4, double5, float6, false, true, list);
	}

	public ajn(ajs ajs, sn sn, double double3, double double4, double double5, float float6, boolean boolean7, boolean boolean8, List<co> list) {
		this(ajs, sn, double3, double4, double5, float6, boolean7, boolean8);
		this.j.addAll(list);
	}

	public ajn(ajs ajs, sn sn, double double3, double double4, double double5, float float6, boolean boolean7, boolean boolean8) {
		this.d = ajs;
		this.h = sn;
		this.i = float6;
		this.e = double3;
		this.f = double4;
		this.g = double5;
		this.a = boolean7;
		this.b = boolean8;
	}

	public void a() {
		Set<co> set2 = Sets.newHashSet();
		int integer3 = 16;

		for (int integer4 = 0; integer4 < 16; integer4++) {
			for (int integer5 = 0; integer5 < 16; integer5++) {
				for (int integer6 = 0; integer6 < 16; integer6++) {
					if (integer4 == 0 || integer4 == 15 || integer5 == 0 || integer5 == 15 || integer6 == 0 || integer6 == 15) {
						double double7 = (double)((float)integer4 / 15.0F * 2.0F - 1.0F);
						double double9 = (double)((float)integer5 / 15.0F * 2.0F - 1.0F);
						double double11 = (double)((float)integer6 / 15.0F * 2.0F - 1.0F);
						double double13 = Math.sqrt(double7 * double7 + double9 * double9 + double11 * double11);
						double7 /= double13;
						double9 /= double13;
						double11 /= double13;
						float float15 = this.i * (0.7F + this.d.r.nextFloat() * 0.6F);
						double double16 = this.e;
						double double18 = this.f;
						double double20 = this.g;

						for (float float22 = 0.3F; float15 > 0.0F; float15 -= 0.22500001F) {
							co co23 = new co(double16, double18, double20);
							atl atl24 = this.d.o(co23);
							if (atl24.a() != azs.a) {
								float float25 = this.h != null ? this.h.a(this, this.d, co23, atl24) : atl24.v().a(null);
								float15 -= (float25 + 0.3F) * 0.3F;
							}

							if (float15 > 0.0F && (this.h == null || this.h.a(this, this.d, co23, atl24, float15))) {
								set2.add(co23);
							}

							double16 += double7 * 0.3F;
							double18 += double9 * 0.3F;
							double20 += double11 * 0.3F;
						}
					}
				}
			}
		}

		this.j.addAll(set2);
		float float4 = this.i * 2.0F;
		int integer5 = ot.c(this.e - (double)float4 - 1.0);
		int integer6x = ot.c(this.e + (double)float4 + 1.0);
		int integer7 = ot.c(this.f - (double)float4 - 1.0);
		int integer8 = ot.c(this.f + (double)float4 + 1.0);
		int integer9 = ot.c(this.g - (double)float4 - 1.0);
		int integer10 = ot.c(this.g + (double)float4 + 1.0);
		List<sn> list11 = this.d.b(this.h, new bdt((double)integer5, (double)integer7, (double)integer9, (double)integer6x, (double)integer8, (double)integer10));
		bdw bdw12 = new bdw(this.e, this.f, this.g);

		for (int integer13 = 0; integer13 < list11.size(); integer13++) {
			sn sn14 = (sn)list11.get(integer13);
			if (!sn14.bt()) {
				double double15 = sn14.e(this.e, this.f, this.g) / (double)float4;
				if (double15 <= 1.0) {
					double double17 = sn14.p - this.e;
					double double19 = sn14.q + (double)sn14.bq() - this.f;
					double double21 = sn14.r - this.g;
					double double23 = (double)ot.a(double17 * double17 + double19 * double19 + double21 * double21);
					if (double23 != 0.0) {
						double17 /= double23;
						double19 /= double23;
						double21 /= double23;
						double double25 = (double)this.d.a(bdw12, sn14.bo());
						double double27 = (1.0 - double15) * double25;
						sn14.a(ry.a(this), (float)((int)((double27 * double27 + double27) / 2.0 * 7.0 * (double)float4 + 1.0)));
						double double29 = double27;
						if (sn14 instanceof sw) {
							double29 = aiu.a((sw)sn14, double27);
						}

						sn14.s += double17 * double29;
						sn14.t += double19 * double29;
						sn14.u += double21 * double29;
						if (sn14 instanceof aay) {
							aay aay31 = (aay)sn14;
							if (!aay31.y() && (!aay31.z() || !aay31.bK.b)) {
								this.k.put(aay31, new bdw(double17 * double27, double19 * double27, double21 * double27));
							}
						}
					}
				}
			}
		}
	}

	public void a(boolean boolean1) {
		this.d.a(null, this.e, this.f, this.g, nn.bP, no.BLOCKS, 4.0F, (1.0F + (this.d.r.nextFloat() - this.d.r.nextFloat()) * 0.2F) * 0.7F);
		if (!(this.i < 2.0F) && this.b) {
			this.d.a(de.EXPLOSION_HUGE, this.e, this.f, this.g, 1.0, 0.0, 0.0);
		} else {
			this.d.a(de.EXPLOSION_LARGE, this.e, this.f, this.g, 1.0, 0.0, 0.0);
		}

		if (this.b) {
			for (co co4 : this.j) {
				atl atl5 = this.d.o(co4);
				alu alu6 = atl5.v();
				if (boolean1) {
					double double7 = (double)((float)co4.p() + this.d.r.nextFloat());
					double double9 = (double)((float)co4.q() + this.d.r.nextFloat());
					double double11 = (double)((float)co4.r() + this.d.r.nextFloat());
					double double13 = double7 - this.e;
					double double15 = double9 - this.f;
					double double17 = double11 - this.g;
					double double19 = (double)ot.a(double13 * double13 + double15 * double15 + double17 * double17);
					double13 /= double19;
					double15 /= double19;
					double17 /= double19;
					double double21 = 0.5 / (double19 / (double)this.i + 0.1);
					double21 *= (double)(this.d.r.nextFloat() * this.d.r.nextFloat() + 0.3F);
					double13 *= double21;
					double15 *= double21;
					double17 *= double21;
					this.d.a(de.EXPLOSION_NORMAL, (double7 + this.e) / 2.0, (double9 + this.f) / 2.0, (double11 + this.g) / 2.0, double13, double15, double17);
					this.d.a(de.SMOKE_NORMAL, double7, double9, double11, double13, double15, double17);
				}

				if (atl5.a() != azs.a) {
					if (alu6.a(this)) {
						alu6.a(this.d, co4, this.d.o(co4), 1.0F / this.i, 0);
					}

					this.d.a(co4, alv.a.t(), 3);
					alu6.a(this.d, co4, this);
				}
			}
		}

		if (this.a) {
			for (co co4 : this.j) {
				if (this.d.o(co4).a() == azs.a && this.d.o(co4.b()).b() && this.c.nextInt(3) == 0) {
					this.d.a(co4, alv.ab.t());
				}
			}
		}
	}

	public Map<aay, bdw> b() {
		return this.k;
	}

	@Nullable
	public sw c() {
		if (this.h == null) {
			return null;
		} else if (this.h instanceof zk) {
			return ((zk)this.h).j();
		} else {
			return this.h instanceof sw ? (sw)this.h : null;
		}
	}

	public void d() {
		this.j.clear();
	}

	public List<co> e() {
		return this.j;
	}
}
