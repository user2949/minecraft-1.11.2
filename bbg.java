import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class bbg extends bbc {
	private float j;

	@Override
	public void a(ajw ajw, sx sx) {
		super.a(ajw, sx);
		this.j = sx.a(bba.WATER);
	}

	@Override
	public void a() {
		this.b.a(bba.WATER, this.j);
		super.a();
	}

	@Override
	public bbb b() {
		int integer2;
		if (this.e() && this.b.aj()) {
			integer2 = (int)this.b.bo().b;
			co.a a3 = new co.a(ot.c(this.b.p), integer2, ot.c(this.b.r));

			for (alu alu4 = this.a.o(a3).v(); alu4 == alv.i || alu4 == alv.j; alu4 = this.a.o(a3).v()) {
				a3.c(ot.c(this.b.p), ++integer2, ot.c(this.b.r));
			}
		} else if (this.b.z) {
			integer2 = ot.c(this.b.bo().b + 0.5);
		} else {
			co co3 = new co(this.b);

			while ((this.a.o(co3).a() == azs.a || this.a.o(co3).v().b(this.a, co3)) && co3.q() > 0) {
				co3 = co3.b();
			}

			integer2 = co3.a().q();
		}

		co co3 = new co(this.b);
		bba bba4 = this.a(this.b, co3.p(), integer2, co3.r());
		if (this.b.a(bba4) < 0.0F) {
			Set<co> set5 = Sets.newHashSet();
			set5.add(new co(this.b.bo().a, (double)integer2, this.b.bo().c));
			set5.add(new co(this.b.bo().a, (double)integer2, this.b.bo().f));
			set5.add(new co(this.b.bo().d, (double)integer2, this.b.bo().c));
			set5.add(new co(this.b.bo().d, (double)integer2, this.b.bo().f));

			for (co co7 : set5) {
				bba bba8 = this.a(this.b, co7);
				if (this.b.a(bba8) >= 0.0F) {
					return this.a(co7.p(), co7.q(), co7.r());
				}
			}
		}

		return this.a(co3.p(), integer2, co3.r());
	}

	@Override
	public bbb a(double double1, double double2, double double3) {
		return this.a(ot.c(double1), ot.c(double2), ot.c(double3));
	}

	@Override
	public int a(bbb[] arr, bbb bbb2, bbb bbb3, float float4) {
		int integer6 = 0;
		int integer7 = 0;
		bba bba8 = this.a(this.b, bbb2.a, bbb2.b + 1, bbb2.c);
		if (this.b.a(bba8) >= 0.0F) {
			integer7 = ot.d(Math.max(1.0F, this.b.P));
		}

		co co9 = new co(bbb2.a, bbb2.b, bbb2.c).b();
		double double10 = (double)bbb2.b - (1.0 - this.a.o(co9).d(this.a, co9).e);
		bbb bbb12 = this.a(bbb2.a, bbb2.b, bbb2.c + 1, integer7, double10, cv.SOUTH);
		bbb bbb13 = this.a(bbb2.a - 1, bbb2.b, bbb2.c, integer7, double10, cv.WEST);
		bbb bbb14 = this.a(bbb2.a + 1, bbb2.b, bbb2.c, integer7, double10, cv.EAST);
		bbb bbb15 = this.a(bbb2.a, bbb2.b, bbb2.c - 1, integer7, double10, cv.NORTH);
		if (bbb12 != null && !bbb12.i && bbb12.a(bbb3) < float4) {
			arr[integer6++] = bbb12;
		}

		if (bbb13 != null && !bbb13.i && bbb13.a(bbb3) < float4) {
			arr[integer6++] = bbb13;
		}

		if (bbb14 != null && !bbb14.i && bbb14.a(bbb3) < float4) {
			arr[integer6++] = bbb14;
		}

		if (bbb15 != null && !bbb15.i && bbb15.a(bbb3) < float4) {
			arr[integer6++] = bbb15;
		}

		boolean boolean16 = bbb15 == null || bbb15.m == bba.OPEN || bbb15.l != 0.0F;
		boolean boolean17 = bbb12 == null || bbb12.m == bba.OPEN || bbb12.l != 0.0F;
		boolean boolean18 = bbb14 == null || bbb14.m == bba.OPEN || bbb14.l != 0.0F;
		boolean boolean19 = bbb13 == null || bbb13.m == bba.OPEN || bbb13.l != 0.0F;
		if (boolean16 && boolean19) {
			bbb bbb20 = this.a(bbb2.a - 1, bbb2.b, bbb2.c - 1, integer7, double10, cv.NORTH);
			if (bbb20 != null && !bbb20.i && bbb20.a(bbb3) < float4) {
				arr[integer6++] = bbb20;
			}
		}

		if (boolean16 && boolean18) {
			bbb bbb20 = this.a(bbb2.a + 1, bbb2.b, bbb2.c - 1, integer7, double10, cv.NORTH);
			if (bbb20 != null && !bbb20.i && bbb20.a(bbb3) < float4) {
				arr[integer6++] = bbb20;
			}
		}

		if (boolean17 && boolean19) {
			bbb bbb20 = this.a(bbb2.a - 1, bbb2.b, bbb2.c + 1, integer7, double10, cv.SOUTH);
			if (bbb20 != null && !bbb20.i && bbb20.a(bbb3) < float4) {
				arr[integer6++] = bbb20;
			}
		}

		if (boolean17 && boolean18) {
			bbb bbb20 = this.a(bbb2.a + 1, bbb2.b, bbb2.c + 1, integer7, double10, cv.SOUTH);
			if (bbb20 != null && !bbb20.i && bbb20.a(bbb3) < float4) {
				arr[integer6++] = bbb20;
			}
		}

		return integer6;
	}

	@Nullable
	private bbb a(int integer1, int integer2, int integer3, int integer4, double double5, cv cv) {
		bbb bbb9 = null;
		co co10 = new co(integer1, integer2, integer3);
		co co11 = co10.b();
		double double12 = (double)integer2 - (1.0 - this.a.o(co11).d(this.a, co11).e);
		if (double12 - double5 > 1.125) {
			return null;
		} else {
			bba bba14 = this.a(this.b, integer1, integer2, integer3);
			float float15 = this.b.a(bba14);
			double double16 = (double)this.b.G / 2.0;
			if (float15 >= 0.0F) {
				bbb9 = this.a(integer1, integer2, integer3);
				bbb9.m = bba14;
				bbb9.l = Math.max(bbb9.l, float15);
			}

			if (bba14 == bba.WALKABLE) {
				return bbb9;
			} else {
				if (bbb9 == null && integer4 > 0 && bba14 != bba.FENCE && bba14 != bba.TRAPDOOR) {
					bbb9 = this.a(integer1, integer2 + 1, integer3, integer4 - 1, double5, cv);
					if (bbb9 != null && (bbb9.m == bba.OPEN || bbb9.m == bba.WALKABLE) && this.b.G < 1.0F) {
						double double18 = (double)(integer1 - cv.g()) + 0.5;
						double double20 = (double)(integer3 - cv.i()) + 0.5;
						bdt bdt22 = new bdt(
							double18 - double16, (double)integer2 + 0.001, double20 - double16, double18 + double16, (double)((float)integer2 + this.b.H), double20 + double16
						);
						bdt bdt23 = this.a.o(co10).d(this.a, co10);
						bdt bdt24 = bdt22.b(0.0, bdt23.e - 0.002, 0.0);
						if (this.b.l.a(bdt24)) {
							bbb9 = null;
						}
					}
				}

				if (bba14 == bba.OPEN) {
					bdt bdt18 = new bdt(
						(double)integer1 - double16 + 0.5,
						(double)integer2 + 0.001,
						(double)integer3 - double16 + 0.5,
						(double)integer1 + double16 + 0.5,
						(double)((float)integer2 + this.b.H),
						(double)integer3 + double16 + 0.5
					);
					if (this.b.l.a(bdt18)) {
						return null;
					}

					if (this.b.G >= 1.0F) {
						bba bba19 = this.a(this.b, integer1, integer2 - 1, integer3);
						if (bba19 == bba.BLOCKED) {
							bbb9 = this.a(integer1, integer2, integer3);
							bbb9.m = bba.WALKABLE;
							bbb9.l = Math.max(bbb9.l, float15);
							return bbb9;
						}
					}

					int integer19 = 0;

					while (integer2 > 0 && bba14 == bba.OPEN) {
						integer2--;
						if (integer19++ >= this.b.aY()) {
							return null;
						}

						bba14 = this.a(this.b, integer1, integer2, integer3);
						float15 = this.b.a(bba14);
						if (bba14 != bba.OPEN && float15 >= 0.0F) {
							bbb9 = this.a(integer1, integer2, integer3);
							bbb9.m = bba14;
							bbb9.l = Math.max(bbb9.l, float15);
							break;
						}

						if (float15 < 0.0F) {
							return null;
						}
					}
				}

				return bbb9;
			}
		}
	}

	@Override
	public bba a(ajw ajw, int integer2, int integer3, int integer4, sx sx, int integer6, int integer7, int integer8, boolean boolean9, boolean boolean10) {
		EnumSet<bba> enumSet12 = EnumSet.noneOf(bba.class);
		bba bba13 = bba.BLOCKED;
		double double14 = (double)sx.G / 2.0;
		co co16 = new co(sx);

		for (int integer17 = 0; integer17 < integer6; integer17++) {
			for (int integer18 = 0; integer18 < integer7; integer18++) {
				for (int integer19 = 0; integer19 < integer8; integer19++) {
					int integer20 = integer17 + integer2;
					int integer21 = integer18 + integer3;
					int integer22 = integer19 + integer4;
					bba bba23 = this.a(ajw, integer20, integer21, integer22);
					if (bba23 == bba.DOOR_WOOD_CLOSED && boolean9 && boolean10) {
						bba23 = bba.WALKABLE;
					}

					if (bba23 == bba.DOOR_OPEN && !boolean10) {
						bba23 = bba.BLOCKED;
					}

					if (bba23 == bba.RAIL && !(ajw.o(co16).v() instanceof alq) && !(ajw.o(co16.b()).v() instanceof alq)) {
						bba23 = bba.FENCE;
					}

					if (integer17 == 0 && integer18 == 0 && integer19 == 0) {
						bba13 = bba23;
					}

					enumSet12.add(bba23);
				}
			}
		}

		if (enumSet12.contains(bba.FENCE)) {
			return bba.FENCE;
		} else {
			bba bba17 = bba.BLOCKED;

			for (bba bba19 : enumSet12) {
				if (sx.a(bba19) < 0.0F) {
					return bba19;
				}

				if (sx.a(bba19) >= sx.a(bba17)) {
					bba17 = bba19;
				}
			}

			return bba13 == bba.OPEN && sx.a(bba17) == 0.0F ? bba.OPEN : bba17;
		}
	}

	private bba a(sx sx, co co) {
		return this.a(sx, co.p(), co.q(), co.r());
	}

	private bba a(sx sx, int integer2, int integer3, int integer4) {
		return this.a(this.a, integer2, integer3, integer4, sx, this.d, this.e, this.f, this.d(), this.c());
	}

	@Override
	public bba a(ajw ajw, int integer2, int integer3, int integer4) {
		bba bba6 = this.b(ajw, integer2, integer3, integer4);
		if (bba6 == bba.OPEN && integer3 >= 1) {
			alu alu7 = ajw.o(new co(integer2, integer3 - 1, integer4)).v();
			bba bba8 = this.b(ajw, integer2, integer3 - 1, integer4);
			bba6 = bba8 != bba.WALKABLE && bba8 != bba.OPEN && bba8 != bba.WATER && bba8 != bba.LAVA ? bba.WALKABLE : bba.OPEN;
			if (bba8 == bba.DAMAGE_FIRE || alu7 == alv.df) {
				bba6 = bba.DAMAGE_FIRE;
			}

			if (bba8 == bba.DAMAGE_CACTUS) {
				bba6 = bba.DAMAGE_CACTUS;
			}
		}

		co.b b7 = co.b.s();
		if (bba6 == bba.WALKABLE) {
			for (int integer8 = -1; integer8 <= 1; integer8++) {
				for (int integer9 = -1; integer9 <= 1; integer9++) {
					if (integer8 != 0 || integer9 != 0) {
						alu alu10 = ajw.o(b7.f(integer8 + integer2, integer3, integer9 + integer4)).v();
						if (alu10 == alv.aK) {
							bba6 = bba.DANGER_CACTUS;
						} else if (alu10 == alv.ab) {
							bba6 = bba.DANGER_FIRE;
						}
					}
				}
			}
		}

		b7.t();
		return bba6;
	}

	private bba b(ajw ajw, int integer2, int integer3, int integer4) {
		co co6 = new co(integer2, integer3, integer4);
		atl atl7 = ajw.o(co6);
		alu alu8 = atl7.v();
		azs azs9 = atl7.a();
		if (azs9 == azs.a) {
			return bba.OPEN;
		} else if (alu8 == alv.bd || alu8 == alv.cw || alu8 == alv.bx) {
			return bba.TRAPDOOR;
		} else if (alu8 == alv.ab) {
			return bba.DAMAGE_FIRE;
		} else if (alu8 == alv.aK) {
			return bba.DAMAGE_CACTUS;
		} else if (alu8 instanceof amx && azs9 == azs.d && !(Boolean)atl7.c(amx.b)) {
			return bba.DOOR_WOOD_CLOSED;
		} else if (alu8 instanceof amx && azs9 == azs.f && !(Boolean)atl7.c(amx.b)) {
			return bba.DOOR_IRON_CLOSED;
		} else if (alu8 instanceof amx && (Boolean)atl7.c(amx.b)) {
			return bba.DOOR_OPEN;
		} else if (alu8 instanceof alq) {
			return bba.RAIL;
		} else if (!(alu8 instanceof anl) && !(alu8 instanceof arq) && (!(alu8 instanceof anm) || (Boolean)atl7.c(anm.a))) {
			if (azs9 == azs.h) {
				return bba.WATER;
			} else if (azs9 == azs.i) {
				return bba.LAVA;
			} else {
				return alu8.b(ajw, co6) ? bba.OPEN : bba.BLOCKED;
			}
		} else {
			return bba.FENCE;
		}
	}
}
