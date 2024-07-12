import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class zb extends yy {
	public zb.a c;

	public zb(ajs ajs) {
		super(ajs);
	}

	public zb(ajs ajs, co co, cv cv) {
		super(ajs, co);
		List<zb.a> list5 = Lists.newArrayList();

		for (zb.a a9 : zb.a.values()) {
			this.c = a9;
			this.a(cv);
			if (this.k()) {
				list5.add(a9);
			}
		}

		if (!list5.isEmpty()) {
			this.c = (zb.a)list5.get(this.S.nextInt(list5.size()));
		}

		this.a(cv);
	}

	public zb(ajs ajs, co co, cv cv, String string) {
		this(ajs, co, cv);

		for (zb.a a9 : zb.a.values()) {
			if (a9.B.equals(string)) {
				this.c = a9;
				break;
			}
		}

		this.a(cv);
	}

	@Override
	public void b(du du) {
		du.a("Motive", this.c.B);
		super.b(du);
	}

	@Override
	public void a(du du) {
		String string3 = du.l("Motive");

		for (zb.a a7 : zb.a.values()) {
			if (a7.B.equals(string3)) {
				this.c = a7;
			}
		}

		if (this.c == null) {
			this.c = zb.a.KEBAB;
		}

		super.a(du);
	}

	@Override
	public int l() {
		return this.c.C;
	}

	@Override
	public int n() {
		return this.c.D;
	}

	@Override
	public void a(@Nullable sn sn) {
		if (this.l.U().b("doEntityDrops")) {
			this.a(nn.en, 1.0F, 1.0F);
			if (sn instanceof aay) {
				aay aay3 = (aay)sn;
				if (aay3.bK.d) {
					return;
				}
			}

			this.a(new afj(afl.aq), 0.0F);
		}
	}

	@Override
	public void o() {
		this.a(nn.eo, 1.0F, 1.0F);
	}

	@Override
	public void b(double double1, double double2, double double3, float float4, float float5) {
		this.b(double1, double2, double3);
	}

	@Override
	public void a(double double1, double double2, double double3, float float4, float float5, int integer, boolean boolean7) {
		co co12 = this.a.a(double1 - this.p, double2 - this.q, double3 - this.r);
		this.b((double)co12.p(), (double)co12.q(), (double)co12.r());
	}

	public static enum a {
		KEBAB("Kebab", 16, 16, 0, 0),
		AZTEC("Aztec", 16, 16, 16, 0),
		ALBAN("Alban", 16, 16, 32, 0),
		AZTEC_2("Aztec2", 16, 16, 48, 0),
		BOMB("Bomb", 16, 16, 64, 0),
		PLANT("Plant", 16, 16, 80, 0),
		WASTELAND("Wasteland", 16, 16, 96, 0),
		POOL("Pool", 32, 16, 0, 32),
		COURBET("Courbet", 32, 16, 32, 32),
		SEA("Sea", 32, 16, 64, 32),
		SUNSET("Sunset", 32, 16, 96, 32),
		CREEBET("Creebet", 32, 16, 128, 32),
		WANDERER("Wanderer", 16, 32, 0, 64),
		GRAHAM("Graham", 16, 32, 16, 64),
		MATCH("Match", 32, 32, 0, 128),
		BUST("Bust", 32, 32, 32, 128),
		STAGE("Stage", 32, 32, 64, 128),
		VOID("Void", 32, 32, 96, 128),
		SKULL_AND_ROSES("SkullAndRoses", 32, 32, 128, 128),
		WITHER("Wither", 32, 32, 160, 128),
		FIGHTERS("Fighters", 64, 32, 0, 96),
		POINTER("Pointer", 64, 64, 0, 192),
		PIGSCENE("Pigscene", 64, 64, 64, 192),
		BURNING_SKULL("BurningSkull", 64, 64, 128, 192),
		SKELETON("Skeleton", 64, 48, 192, 64),
		DONKEY_KONG("DonkeyKong", 64, 48, 192, 112);

		public static final int A = "SkullAndRoses".length();
		public final String B;
		public final int C;
		public final int D;
		public final int E;
		public final int F;

		private a(String string3, int integer4, int integer5, int integer6, int integer7) {
			this.B = string3;
			this.C = integer4;
			this.D = integer5;
			this.E = integer6;
			this.F = integer7;
		}
	}
}
