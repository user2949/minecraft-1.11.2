import java.util.Random;
import javax.annotation.Nullable;

public class anp extends alo {
	public static final aua a = aua.a("legacy_data", 0, 15);
	public static final atz<anp.a> b = atz.a("contents", anp.a.class);
	protected static final bdt c = new bdt(0.3125, 0.0, 0.3125, 0.6875, 0.375, 0.6875);

	public anp() {
		super(azs.q);
		this.y(this.A.b().a(b, anp.a.EMPTY).a(a, 0));
	}

	@Override
	public String c() {
		return dp.a("item.flowerPot.name");
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return c;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public aqf a(atl atl) {
		return aqf.MODEL;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		afj afj11 = aay.b(ri);
		asm asm12 = this.c(ajs, co);
		if (asm12 == null) {
			return false;
		} else {
			afj afj13 = asm12.a();
			if (afj13.b()) {
				if (!this.a(afj11)) {
					return false;
				}

				asm12.a(afj11);
				aay.b(oa.T);
				if (!aay.bK.d) {
					afj11.g(1);
				}
			} else {
				if (afj11.b()) {
					aay.a(ri, afj13);
				} else if (!aay.c(afj13)) {
					aay.a(afj13, false);
				}

				asm12.a(afj.a);
			}

			asm12.x_();
			ajs.a(co, atl, atl, 3);
			return true;
		}
	}

	private boolean a(afj afj) {
		alu alu3 = alu.a(afj.c());
		if (alu3 != alv.N && alu3 != alv.O && alu3 != alv.aK && alu3 != alv.P && alu3 != alv.Q && alu3 != alv.g && alu3 != alv.I) {
			int integer4 = afj.j();
			return alu3 == alv.H && integer4 == ari.a.FERN.a();
		} else {
			return true;
		}
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		asm asm5 = this.c(ajs, co);
		if (asm5 != null) {
			afj afj6 = asm5.a();
			if (!afj6.b()) {
				return afj6;
			}
		}

		return new afj(afl.cb);
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return super.a(ajs, co) && ajs.o(co.b()).r();
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!ajs.o(co3.b()).r()) {
			this.b(ajs, co3, atl, 0);
			ajs.g(co3);
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		asm asm5 = this.c(ajs, co);
		if (asm5 != null && asm5.e() != null) {
			a(ajs, co, new afj(asm5.e(), 1, asm5.f()));
		}

		super.b(ajs, co, atl);
	}

	@Override
	public void a(ajs ajs, co co, atl atl, aay aay) {
		super.a(ajs, co, atl, aay);
		if (aay.bK.d) {
			asm asm6 = this.c(ajs, co);
			if (asm6 != null) {
				asm6.a(afj.a);
			}
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.cb;
	}

	@Nullable
	private asm c(ajs ajs, co co) {
		asc asc4 = ajs.r(co);
		return asc4 instanceof asm ? (asm)asc4 : null;
	}

	@Override
	public asc a(ajs ajs, int integer) {
		alu alu4 = null;
		int integer5 = 0;
		switch (integer) {
			case 1:
				alu4 = alv.O;
				integer5 = ano.a.POPPY.b();
				break;
			case 2:
				alu4 = alv.N;
				break;
			case 3:
				alu4 = alv.g;
				integer5 = apn.a.OAK.a();
				break;
			case 4:
				alu4 = alv.g;
				integer5 = apn.a.SPRUCE.a();
				break;
			case 5:
				alu4 = alv.g;
				integer5 = apn.a.BIRCH.a();
				break;
			case 6:
				alu4 = alv.g;
				integer5 = apn.a.JUNGLE.a();
				break;
			case 7:
				alu4 = alv.Q;
				break;
			case 8:
				alu4 = alv.P;
				break;
			case 9:
				alu4 = alv.aK;
				break;
			case 10:
				alu4 = alv.I;
				break;
			case 11:
				alu4 = alv.H;
				integer5 = ari.a.FERN.a();
				break;
			case 12:
				alu4 = alv.g;
				integer5 = apn.a.ACACIA.a();
				break;
			case 13:
				alu4 = alv.g;
				integer5 = apn.a.DARK_OAK.a();
		}

		return new asm(afh.a(alu4), integer5);
	}

	@Override
	protected atm b() {
		return new atm(this, b, a);
	}

	@Override
	public int e(atl atl) {
		return (Integer)atl.c(a);
	}

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		anp.a a5 = anp.a.EMPTY;
		asc asc6 = ajw instanceof akb ? ((akb)ajw).a(co, auo.a.CHECK) : ajw.r(co);
		if (asc6 instanceof asm) {
			asm asm7 = (asm)asc6;
			afh afh8 = asm7.e();
			if (afh8 instanceof adv) {
				int integer9 = asm7.f();
				alu alu10 = alu.a(afh8);
				if (alu10 == alv.g) {
					switch (apn.a.a(integer9)) {
						case OAK:
							a5 = anp.a.OAK_SAPLING;
							break;
						case SPRUCE:
							a5 = anp.a.SPRUCE_SAPLING;
							break;
						case BIRCH:
							a5 = anp.a.BIRCH_SAPLING;
							break;
						case JUNGLE:
							a5 = anp.a.JUNGLE_SAPLING;
							break;
						case ACACIA:
							a5 = anp.a.ACACIA_SAPLING;
							break;
						case DARK_OAK:
							a5 = anp.a.DARK_OAK_SAPLING;
							break;
						default:
							a5 = anp.a.EMPTY;
					}
				} else if (alu10 == alv.H) {
					switch (integer9) {
						case 0:
							a5 = anp.a.DEAD_BUSH;
							break;
						case 2:
							a5 = anp.a.FERN;
							break;
						default:
							a5 = anp.a.EMPTY;
					}
				} else if (alu10 == alv.N) {
					a5 = anp.a.DANDELION;
				} else if (alu10 == alv.O) {
					switch (ano.a.a(ano.b.RED, integer9)) {
						case POPPY:
							a5 = anp.a.POPPY;
							break;
						case BLUE_ORCHID:
							a5 = anp.a.BLUE_ORCHID;
							break;
						case ALLIUM:
							a5 = anp.a.ALLIUM;
							break;
						case HOUSTONIA:
							a5 = anp.a.HOUSTONIA;
							break;
						case RED_TULIP:
							a5 = anp.a.RED_TULIP;
							break;
						case ORANGE_TULIP:
							a5 = anp.a.ORANGE_TULIP;
							break;
						case WHITE_TULIP:
							a5 = anp.a.WHITE_TULIP;
							break;
						case PINK_TULIP:
							a5 = anp.a.PINK_TULIP;
							break;
						case OXEYE_DAISY:
							a5 = anp.a.OXEYE_DAISY;
							break;
						default:
							a5 = anp.a.EMPTY;
					}
				} else if (alu10 == alv.Q) {
					a5 = anp.a.MUSHROOM_RED;
				} else if (alu10 == alv.P) {
					a5 = anp.a.MUSHROOM_BROWN;
				} else if (alu10 == alv.I) {
					a5 = anp.a.DEAD_BUSH;
				} else if (alu10 == alv.aK) {
					a5 = anp.a.CACTUS;
				}
			}
		}

		return atl.a(b, a5);
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	public static enum a implements ox {
		EMPTY("empty"),
		POPPY("rose"),
		BLUE_ORCHID("blue_orchid"),
		ALLIUM("allium"),
		HOUSTONIA("houstonia"),
		RED_TULIP("red_tulip"),
		ORANGE_TULIP("orange_tulip"),
		WHITE_TULIP("white_tulip"),
		PINK_TULIP("pink_tulip"),
		OXEYE_DAISY("oxeye_daisy"),
		DANDELION("dandelion"),
		OAK_SAPLING("oak_sapling"),
		SPRUCE_SAPLING("spruce_sapling"),
		BIRCH_SAPLING("birch_sapling"),
		JUNGLE_SAPLING("jungle_sapling"),
		ACACIA_SAPLING("acacia_sapling"),
		DARK_OAK_SAPLING("dark_oak_sapling"),
		MUSHROOM_RED("mushroom_red"),
		MUSHROOM_BROWN("mushroom_brown"),
		DEAD_BUSH("dead_bush"),
		FERN("fern"),
		CACTUS("cactus");

		private final String w;

		private a(String string3) {
			this.w = string3;
		}

		public String toString() {
			return this.w;
		}

		@Override
		public String m() {
			return this.w;
		}
	}
}
