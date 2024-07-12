import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class sg {
	public static final dc<kq, sg> b = new dc<>();
	private final Map<tj, tl> a = Maps.newHashMap();
	private final boolean c;
	private final int d;
	private String e = "";
	private int f = -1;
	private double g;
	private boolean h;

	@Nullable
	public static sg a(int integer) {
		return b.a(integer);
	}

	public static int a(sg sg) {
		return b.a(sg);
	}

	@Nullable
	public static sg b(String string) {
		return b.c(new kq(string));
	}

	protected sg(boolean boolean1, int integer) {
		this.c = boolean1;
		if (boolean1) {
			this.g = 0.5;
		} else {
			this.g = 1.0;
		}

		this.d = integer;
	}

	protected sg b(int integer1, int integer2) {
		this.f = integer1 + integer2 * 8;
		return this;
	}

	public void a(sw sw, int integer) {
		if (this == si.j) {
			if (sw.bU() < sw.cb()) {
				sw.b(1.0F);
			}
		} else if (this == si.s) {
			if (sw.bU() > 1.0F) {
				sw.a(ry.o, 1.0F);
			}
		} else if (this == si.t) {
			sw.a(ry.p, 1.0F);
		} else if (this == si.q && sw instanceof aay) {
			((aay)sw).a(0.005F * (float)(integer + 1));
		} else if (this == si.w && sw instanceof aay) {
			if (!sw.l.E) {
				((aay)sw).da().a(integer + 1, 1.0F);
			}
		} else if ((this != si.f || sw.bT()) && (this != si.g || !sw.bT())) {
			if (this == si.g && !sw.bT() || this == si.f && sw.bT()) {
				sw.a(ry.o, (float)(6 << integer));
			}
		} else {
			sw.b((float)Math.max(4 << integer, 0));
		}
	}

	public void a(@Nullable sn sn1, @Nullable sn sn2, sw sw, int integer, double double5) {
		if ((this != si.f || sw.bT()) && (this != si.g || !sw.bT())) {
			if (this == si.g && !sw.bT() || this == si.f && sw.bT()) {
				int integer8 = (int)(double5 * (double)(6 << integer) + 0.5);
				if (sn1 == null) {
					sw.a(ry.o, (float)integer8);
				} else {
					sw.a(ry.b(sn1, sn2), (float)integer8);
				}
			}
		} else {
			int integer8 = (int)(double5 * (double)(4 << integer) + 0.5);
			sw.b((float)integer8);
		}
	}

	public boolean a(int integer1, int integer2) {
		if (this == si.j) {
			int integer4 = 50 >> integer2;
			return integer4 > 0 ? integer1 % integer4 == 0 : true;
		} else if (this == si.s) {
			int integer4 = 25 >> integer2;
			return integer4 > 0 ? integer1 % integer4 == 0 : true;
		} else if (this == si.t) {
			int integer4 = 40 >> integer2;
			return integer4 > 0 ? integer1 % integer4 == 0 : true;
		} else {
			return this == si.q;
		}
	}

	public boolean b() {
		return false;
	}

	public sg c(String string) {
		this.e = string;
		return this;
	}

	public String a() {
		return this.e;
	}

	public boolean c() {
		return this.f >= 0;
	}

	public int d() {
		return this.f;
	}

	public boolean e() {
		return this.c;
	}

	public static String a(sh sh, float float2) {
		if (sh.g()) {
			return "**:**";
		} else {
			int integer3 = ot.d((float)sh.b() * float2);
			return oy.a(integer3);
		}
	}

	protected sg a(double double1) {
		this.g = double1;
		return this;
	}

	public int g() {
		return this.d;
	}

	public sg a(tj tj, String string, double double3, int integer) {
		tl tl7 = new tl(UUID.fromString(string), this.a(), double3, integer);
		this.a.put(tj, tl7);
		return this;
	}

	public Map<tj, tl> h() {
		return this.a;
	}

	public void a(sw sw, tn tn, int integer) {
		for (Entry<tj, tl> entry6 : this.a.entrySet()) {
			tk tk7 = tn.a((tj)entry6.getKey());
			if (tk7 != null) {
				tk7.c((tl)entry6.getValue());
			}
		}
	}

	public void b(sw sw, tn tn, int integer) {
		for (Entry<tj, tl> entry6 : this.a.entrySet()) {
			tk tk7 = tn.a((tj)entry6.getKey());
			if (tk7 != null) {
				tl tl8 = (tl)entry6.getValue();
				tk7.c(tl8);
				tk7.b(new tl(tl8.a(), this.a() + " " + integer, this.a(integer, tl8), tl8.c()));
			}
		}
	}

	public double a(int integer, tl tl) {
		return tl.d() * (double)(integer + 1);
	}

	public boolean i() {
		return this.h;
	}

	public sg j() {
		this.h = true;
		return this;
	}

	public static void k() {
		b.a(1, new kq("speed"), new sg(false, 8171462).c("effect.moveSpeed").b(0, 0).a(aad.d, "91AEAA56-376B-4498-935B-2F7F68070635", 0.2F, 2).j());
		b.a(2, new kq("slowness"), new sg(true, 5926017).c("effect.moveSlowdown").b(1, 0).a(aad.d, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15F, 2));
		b.a(3, new kq("haste"), new sg(false, 14270531).c("effect.digSpeed").b(2, 0).a(1.5).j().a(aad.f, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", 0.1F, 2));
		b.a(4, new kq("mining_fatigue"), new sg(true, 4866583).c("effect.digSlowDown").b(3, 0).a(aad.f, "55FCED67-E92A-486E-9800-B47F202C4386", -0.1F, 2));
		b.a(5, new kq("strength"), new sd(false, 9643043, 3.0).c("effect.damageBoost").b(4, 0).a(aad.e, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 0.0, 0).j());
		b.a(6, new kq("instant_health"), new sf(false, 16262179).c("effect.heal").j());
		b.a(7, new kq("instant_damage"), new sf(true, 4393481).c("effect.harm").j());
		b.a(8, new kq("jump_boost"), new sg(false, 2293580).c("effect.jump").b(2, 1).j());
		b.a(9, new kq("nausea"), new sg(true, 5578058).c("effect.confusion").b(3, 1).a(0.25));
		b.a(10, new kq("regeneration"), new sg(false, 13458603).c("effect.regeneration").b(7, 0).a(0.25).j());
		b.a(11, new kq("resistance"), new sg(false, 10044730).c("effect.resistance").b(6, 1).j());
		b.a(12, new kq("fire_resistance"), new sg(false, 14981690).c("effect.fireResistance").b(7, 1).j());
		b.a(13, new kq("water_breathing"), new sg(false, 3035801).c("effect.waterBreathing").b(0, 2).j());
		b.a(14, new kq("invisibility"), new sg(false, 8356754).c("effect.invisibility").b(0, 1).j());
		b.a(15, new kq("blindness"), new sg(true, 2039587).c("effect.blindness").b(5, 1).a(0.25));
		b.a(16, new kq("night_vision"), new sg(false, 2039713).c("effect.nightVision").b(4, 1).j());
		b.a(17, new kq("hunger"), new sg(true, 5797459).c("effect.hunger").b(1, 1));
		b.a(18, new kq("weakness"), new sd(true, 4738376, -4.0).c("effect.weakness").b(5, 0).a(aad.e, "22653B89-116E-49DC-9B6B-9971489B5BE5", 0.0, 0));
		b.a(19, new kq("poison"), new sg(true, 5149489).c("effect.poison").b(6, 0).a(0.25));
		b.a(20, new kq("wither"), new sg(true, 3484199).c("effect.wither").b(1, 2).a(0.25));
		b.a(21, new kq("health_boost"), new se(false, 16284963).c("effect.healthBoost").b(7, 2).a(aad.a, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 4.0, 0).j());
		b.a(22, new kq("absorption"), new sc(false, 2445989).c("effect.absorption").b(2, 2).j());
		b.a(23, new kq("saturation"), new sf(false, 16262179).c("effect.saturation").j());
		b.a(24, new kq("glowing"), new sg(false, 9740385).c("effect.glowing").b(4, 2));
		b.a(25, new kq("levitation"), new sg(true, 13565951).c("effect.levitation").b(3, 2));
		b.a(26, new kq("luck"), new sg(false, 3381504).c("effect.luck").b(5, 2).j().a(aad.i, "03C3C89D-7037-4B42-869F-B146BCB64D2E", 1.0, 0));
		b.a(27, new kq("unluck"), new sg(true, 12624973).c("effect.unluck").b(6, 2).a(aad.i, "CC5AF142-2BD2-4215-B636-2605AED11727", -1.0, 0));
	}
}
